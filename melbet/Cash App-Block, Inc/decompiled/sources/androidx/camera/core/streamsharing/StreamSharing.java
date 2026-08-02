package androidx.camera.core.streamsharing;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.core.processing.AutoValue_SurfaceProcessorNode_In;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.core.processing.concurrent.AutoValue_DualOutConfig;
import androidx.camera.core.processing.concurrent.AutoValue_DualSurfaceProcessorNode_In;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.core.processing.util.AutoValue_OutConfig;
import androidx.emoji2.text.MetadataRepo;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.TraceParser;
import com.knotapi.knot.webview.WebViewManager$$ExternalSyntheticLambda0;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.workflow1.internal.SubtreeManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import net.oneformapp.helper.CalendarConverter;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class StreamSharing extends UseCase {
    public SurfaceEdge mCameraEdge;
    public SessionConfig.CloseableErrorListener mCloseableErrorListener;
    public final UseCaseGroup mCompositionSettings;
    public final StreamSharingConfig mDefaultConfig;
    public JWECryptoParts mDualSharingNode;
    public SurfaceEdge mSecondaryCameraEdge;
    public final UseCaseGroup mSecondaryCompositionSettings;
    public SessionConfig.Builder mSecondarySessionConfigBuilder;
    public SurfaceEdge mSecondarySharingInputEdge;
    public SessionConfig.Builder mSessionConfigBuilder;
    public SurfaceEdge mSharingInputEdge;
    public MetadataRepo mSharingNode;
    public final VirtualCameraAdapter mVirtualCameraAdapter;

    public StreamSharing(CameraInternal cameraInternal, CameraInternal cameraInternal2, UseCaseGroup useCaseGroup, UseCaseGroup useCaseGroup2, HashSet hashSet, UseCaseConfigFactory useCaseConfigFactory) {
        super(getDefaultConfig(hashSet));
        this.mDefaultConfig = getDefaultConfig(hashSet);
        this.mCompositionSettings = useCaseGroup;
        this.mSecondaryCompositionSettings = useCaseGroup2;
        this.mVirtualCameraAdapter = new VirtualCameraAdapter(cameraInternal, cameraInternal2, hashSet, useCaseConfigFactory, new StreamSharing$$ExternalSyntheticLambda1(this, 0));
        HashSet hashSet2 = ((UseCase) hashSet.iterator().next()).mFeatureGroup;
        this.mFeatureGroup = hashSet2 != null ? new HashSet(hashSet2) : null;
    }

    public static StreamSharingConfig getDefaultConfig(HashSet hashSet) {
        MutableOptionsBundle create = MutableOptionsBundle.create();
        new StreamSharingBuilder(create);
        create.insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            if (useCase.mCurrentConfig.containsOption(UseCaseConfig.OPTION_CAPTURE_TYPE)) {
                arrayList.add(useCase.mCurrentConfig.getCaptureType());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        create.insertOption(StreamSharingConfig.OPTION_CAPTURE_TYPES, arrayList);
        create.insertOption(ImageOutputConfig.OPTION_MIRROR_MODE, 2);
        create.insertOption(UseCaseConfig.OPTION_STREAM_USE_CASE, StreamUseCase.PREVIEW_VIDEO_STILL);
        return new StreamSharingConfig(OptionsBundle.from(create));
    }

    public final void clearPipeline$3() {
        SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.mCloseableErrorListener = null;
        }
        SurfaceEdge surfaceEdge = this.mCameraEdge;
        if (surfaceEdge != null) {
            surfaceEdge.close();
            this.mCameraEdge = null;
        }
        SurfaceEdge surfaceEdge2 = this.mSecondaryCameraEdge;
        if (surfaceEdge2 != null) {
            surfaceEdge2.close();
            this.mSecondaryCameraEdge = null;
        }
        SurfaceEdge surfaceEdge3 = this.mSharingInputEdge;
        if (surfaceEdge3 != null) {
            surfaceEdge3.close();
            this.mSharingInputEdge = null;
        }
        SurfaceEdge surfaceEdge4 = this.mSecondarySharingInputEdge;
        if (surfaceEdge4 != null) {
            surfaceEdge4.close();
            this.mSecondarySharingInputEdge = null;
        }
        MetadataRepo metadataRepo = this.mSharingNode;
        if (metadataRepo != null) {
            metadataRepo.release();
            this.mSharingNode = null;
        }
        JWECryptoParts jWECryptoParts = this.mDualSharingNode;
        if (jWECryptoParts != null) {
            ((SurfaceProcessorInternal) jWECryptoParts.header).release();
            Threads.runOnMain(new Preview$$ExternalSyntheticLambda0(jWECryptoParts, 17));
            this.mDualSharingNode = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List createPipelineAndUpdateChildrenSpecs(String str, String str2, UseCaseConfig useCaseConfig, AutoValue_StreamSpec autoValue_StreamSpec, AutoValue_StreamSpec autoValue_StreamSpec2) {
        DynamicRange dynamicRange = autoValue_StreamSpec.dynamicRange;
        Threads.checkMainThread();
        VirtualCameraAdapter virtualCameraAdapter = this.mVirtualCameraAdapter;
        if (autoValue_StreamSpec2 == null) {
            SurfaceEdge createPrimaryCameraInputSurface = createPrimaryCameraInputSurface(str, str2, useCaseConfig, autoValue_StreamSpec, null);
            CameraInternal camera = getCamera();
            Objects.requireNonNull(camera);
            MetadataRepo metadataRepo = new MetadataRepo(camera, new DefaultSurfaceProcessor(dynamicRange), "StreamSharing");
            this.mSharingNode = metadataRepo;
            boolean z = this.mViewPortCropRect != null;
            int targetRotation = ((ImageOutputConfig) this.mCurrentConfig).getTargetRotation(0);
            virtualCameraAdapter.getClass();
            HashMap hashMap = new HashMap();
            Iterator it = virtualCameraAdapter.mChildren.iterator();
            while (it.hasNext()) {
                UseCase useCase = (UseCase) it.next();
                ResolutionsMerger resolutionsMerger = virtualCameraAdapter.mResolutionsMerger;
                CameraInternal cameraInternal = virtualCameraAdapter.mParentCamera;
                VirtualCameraAdapter virtualCameraAdapter2 = virtualCameraAdapter;
                boolean z2 = z;
                AutoValue_OutConfig calculateOutConfig = virtualCameraAdapter2.calculateOutConfig(useCase, resolutionsMerger, cameraInternal, createPrimaryCameraInputSurface, targetRotation, z2);
                int sensorRotationDegrees = virtualCameraAdapter2.mParentCamera.getCameraInfo().getSensorRotationDegrees(((ImageOutputConfig) useCase.mCurrentConfig).getTargetRotation(0));
                VirtualCamera virtualCamera = (VirtualCamera) virtualCameraAdapter2.mChildrenVirtualCameras.get(useCase);
                Objects.requireNonNull(virtualCamera);
                virtualCamera.mVirtualCameraInfo.mVirtualCameraRotationDegrees = sensorRotationDegrees;
                hashMap.put(useCase, calculateOutConfig);
                z = z2;
                virtualCameraAdapter = virtualCameraAdapter2;
            }
            VirtualCameraAdapter virtualCameraAdapter3 = virtualCameraAdapter;
            boolean z3 = z;
            CalendarConverter.AnonymousClass1 transform = metadataRepo.transform(new AutoValue_SurfaceProcessorNode_In(createPrimaryCameraInputSurface, new ArrayList(hashMap.values())));
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                hashMap2.put((UseCase) entry.getKey(), (SurfaceEdge) transform.get(entry.getValue()));
            }
            virtualCameraAdapter3.setChildrenEdges(hashMap2, virtualCameraAdapter3.getSelectedChildSizes(createPrimaryCameraInputSurface, z3));
            Object[] objArr = {this.mSessionConfigBuilder.build()};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return Collections.unmodifiableList(arrayList);
        }
        VirtualCameraAdapter virtualCameraAdapter4 = virtualCameraAdapter;
        SurfaceEdge createPrimaryCameraInputSurface2 = createPrimaryCameraInputSurface(str, str2, useCaseConfig, autoValue_StreamSpec, autoValue_StreamSpec2);
        Matrix matrix = this.mSensorToBufferTransformMatrix;
        CameraInternal secondaryCamera = getSecondaryCamera();
        Objects.requireNonNull(secondaryCamera);
        boolean hasTransform = secondaryCamera.getHasTransform();
        Size size = autoValue_StreamSpec2.resolution;
        Rect rect = this.mViewPortCropRect;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        Rect rect2 = rect;
        CameraInternal secondaryCamera2 = getSecondaryCamera();
        Objects.requireNonNull(secondaryCamera2);
        int relativeRotation = getRelativeRotation(secondaryCamera2, false);
        CameraInternal secondaryCamera3 = getSecondaryCamera();
        Objects.requireNonNull(secondaryCamera3);
        SurfaceEdge surfaceEdge = new SurfaceEdge(3, 34, autoValue_StreamSpec2, matrix, hasTransform, rect2, relativeRotation, -1, isMirroringRequired(secondaryCamera3));
        this.mSecondaryCameraEdge = surfaceEdge;
        Objects.requireNonNull(getSecondaryCamera());
        this.mSecondarySharingInputEdge = surfaceEdge;
        SessionConfig.Builder createSessionConfigBuilder = createSessionConfigBuilder(this.mSecondaryCameraEdge, useCaseConfig, autoValue_StreamSpec2);
        this.mSecondarySessionConfigBuilder = createSessionConfigBuilder;
        SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new StreamSharing$$ExternalSyntheticLambda0(this, str, str2, useCaseConfig, autoValue_StreamSpec, autoValue_StreamSpec2));
        this.mCloseableErrorListener = closeableErrorListener2;
        createSessionConfigBuilder.mErrorListener = closeableErrorListener2;
        SurfaceEdge surfaceEdge2 = this.mSecondarySharingInputEdge;
        CameraInternal camera2 = getCamera();
        CameraInternal secondaryCamera4 = getSecondaryCamera();
        DualSurfaceProcessor dualSurfaceProcessor = new DualSurfaceProcessor(dynamicRange, this.mCompositionSettings, this.mSecondaryCompositionSettings);
        JWECryptoParts jWECryptoParts = new JWECryptoParts();
        jWECryptoParts.encryptedKey = camera2;
        jWECryptoParts.iv = secondaryCamera4;
        jWECryptoParts.header = dualSurfaceProcessor;
        this.mDualSharingNode = jWECryptoParts;
        boolean z4 = this.mViewPortCropRect != null;
        int targetRotation2 = ((ImageOutputConfig) this.mCurrentConfig).getTargetRotation(0);
        virtualCameraAdapter4.getClass();
        HashMap hashMap3 = new HashMap();
        Iterator it2 = virtualCameraAdapter4.mChildren.iterator();
        while (it2.hasNext()) {
            UseCase useCase2 = (UseCase) it2.next();
            VirtualCameraAdapter virtualCameraAdapter5 = virtualCameraAdapter4;
            SurfaceEdge surfaceEdge3 = createPrimaryCameraInputSurface2;
            AutoValue_OutConfig calculateOutConfig2 = virtualCameraAdapter5.calculateOutConfig(useCase2, virtualCameraAdapter4.mResolutionsMerger, virtualCameraAdapter4.mParentCamera, surfaceEdge3, targetRotation2, z4);
            ResolutionsMerger resolutionsMerger2 = virtualCameraAdapter5.mSecondaryResolutionsMerger;
            Objects.requireNonNull(resolutionsMerger2);
            CameraInternal cameraInternal2 = virtualCameraAdapter5.mSecondaryParentCamera;
            Objects.requireNonNull(cameraInternal2);
            SurfaceEdge surfaceEdge4 = surfaceEdge2;
            AutoValue_OutConfig calculateOutConfig3 = virtualCameraAdapter5.calculateOutConfig(useCase2, resolutionsMerger2, cameraInternal2, surfaceEdge4, targetRotation2, z4);
            int sensorRotationDegrees2 = virtualCameraAdapter5.mParentCamera.getCameraInfo().getSensorRotationDegrees(((ImageOutputConfig) useCase2.mCurrentConfig).getTargetRotation(0));
            VirtualCamera virtualCamera2 = (VirtualCamera) virtualCameraAdapter5.mChildrenVirtualCameras.get(useCase2);
            Objects.requireNonNull(virtualCamera2);
            virtualCamera2.mVirtualCameraInfo.mVirtualCameraRotationDegrees = sensorRotationDegrees2;
            hashMap3.put(useCase2, new AutoValue_DualOutConfig(calculateOutConfig2, calculateOutConfig3));
            surfaceEdge2 = surfaceEdge4;
            createPrimaryCameraInputSurface2 = surfaceEdge3;
            virtualCameraAdapter4 = virtualCameraAdapter5;
        }
        SurfaceEdge surfaceEdge5 = surfaceEdge2;
        VirtualCameraAdapter virtualCameraAdapter6 = virtualCameraAdapter4;
        SurfaceEdge surfaceEdge6 = createPrimaryCameraInputSurface2;
        JWECryptoParts jWECryptoParts2 = this.mDualSharingNode;
        ArrayList arrayList2 = new ArrayList(hashMap3.values());
        AutoValue_DualSurfaceProcessorNode_In autoValue_DualSurfaceProcessorNode_In = new AutoValue_DualSurfaceProcessorNode_In(surfaceEdge6, surfaceEdge5, arrayList2);
        jWECryptoParts2.getClass();
        Threads.checkMainThread();
        StringBuilder sb = new StringBuilder("[StreamSharing] DualSurfaceProcessorNode Transform Processor = ");
        SurfaceProcessorInternal surfaceProcessorInternal = (SurfaceProcessorInternal) jWECryptoParts2.header;
        sb.append(surfaceProcessorInternal);
        sb.append("\n   primary input = ");
        sb.append(surfaceEdge6);
        sb.append("\n   secondary input = ");
        sb.append(surfaceEdge5);
        StringUtilsKt.d("DualSurfaceProcessorNode", sb.toString());
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            StringUtilsKt.d("SurfaceProcessorNode", "   outputConfig = " + ((AutoValue_DualOutConfig) it3.next()));
        }
        jWECryptoParts2.authenticationTag = autoValue_DualSurfaceProcessorNode_In;
        jWECryptoParts2.cipherText = new CalendarConverter.AnonymousClass1();
        AutoValue_DualSurfaceProcessorNode_In autoValue_DualSurfaceProcessorNode_In2 = (AutoValue_DualSurfaceProcessorNode_In) jWECryptoParts2.authenticationTag;
        SurfaceEdge surfaceEdge7 = autoValue_DualSurfaceProcessorNode_In2.primarySurfaceEdge;
        SurfaceEdge surfaceEdge8 = autoValue_DualSurfaceProcessorNode_In2.secondarySurfaceEdge;
        Iterator it4 = autoValue_DualSurfaceProcessorNode_In2.outConfigs.iterator();
        while (it4.hasNext()) {
            AutoValue_DualOutConfig autoValue_DualOutConfig = (AutoValue_DualOutConfig) it4.next();
            CalendarConverter.AnonymousClass1 anonymousClass1 = (CalendarConverter.AnonymousClass1) jWECryptoParts2.cipherText;
            AutoValue_OutConfig autoValue_OutConfig = autoValue_DualOutConfig.primaryOutConfig;
            Rect rect3 = autoValue_OutConfig.getCropRect;
            Iterator it5 = it4;
            int i = autoValue_OutConfig.getRotationDegrees;
            HashMap hashMap4 = hashMap3;
            boolean z5 = autoValue_OutConfig.isMirroring;
            VirtualCameraAdapter virtualCameraAdapter7 = virtualCameraAdapter6;
            Matrix matrix2 = new Matrix(surfaceEdge7.mSensorToBufferTransform);
            RectF rectF = new RectF(rect3);
            Size size2 = autoValue_OutConfig.getSize;
            boolean z6 = z4;
            matrix2.postConcat(TransformUtils.getRectToRect(rectF, TransformUtils.sizeToRectF(size2), i, z5));
            TransactorKt.checkArgument(TransformUtils.isAspectRatioMatchingWithRoundingError(TransformUtils.rotateSize(i, TransformUtils.rectToSize(rect3)), false, size2));
            Rect rect4 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
            SubtreeManager builder = surfaceEdge7.mStreamSpec.toBuilder();
            builder.snapshotCache = size2;
            anonymousClass1.put(autoValue_DualOutConfig, new SurfaceEdge(autoValue_OutConfig.getTargets, autoValue_OutConfig.getFormat, builder.build(), matrix2, false, rect4, surfaceEdge7.mRotationDegrees - i, -1, surfaceEdge7.mMirroring != z5));
            it4 = it5;
            hashMap3 = hashMap4;
            virtualCameraAdapter6 = virtualCameraAdapter7;
            z4 = z6;
        }
        VirtualCameraAdapter virtualCameraAdapter8 = virtualCameraAdapter6;
        boolean z7 = z4;
        HashMap hashMap5 = hashMap3;
        try {
            surfaceProcessorInternal.onInputSurface(surfaceEdge7.createSurfaceRequest((CameraInternal) jWECryptoParts2.encryptedKey, true));
        } catch (ProcessingException e) {
            StringUtilsKt.e("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
        }
        try {
            surfaceProcessorInternal.onInputSurface(surfaceEdge8.createSurfaceRequest((CameraInternal) jWECryptoParts2.iv, false));
        } catch (ProcessingException e2) {
            StringUtilsKt.e("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e2);
        }
        CameraInternal cameraInternal3 = (CameraInternal) jWECryptoParts2.encryptedKey;
        CameraInternal cameraInternal4 = (CameraInternal) jWECryptoParts2.iv;
        for (Map.Entry entry2 : ((CalendarConverter.AnonymousClass1) jWECryptoParts2.cipherText).entrySet()) {
            SurfaceEdge surfaceEdge9 = surfaceEdge7;
            SurfaceEdge surfaceEdge10 = surfaceEdge8;
            jWECryptoParts2.createAndSendSurfaceOutput(cameraInternal3, cameraInternal4, surfaceEdge9, surfaceEdge10, entry2);
            SurfaceEdge surfaceEdge11 = (SurfaceEdge) entry2.getValue();
            CameraInternal cameraInternal5 = cameraInternal4;
            CameraInternal cameraInternal6 = cameraInternal3;
            JWECryptoParts jWECryptoParts3 = jWECryptoParts2;
            WebViewManager$$ExternalSyntheticLambda0 webViewManager$$ExternalSyntheticLambda0 = new WebViewManager$$ExternalSyntheticLambda0(jWECryptoParts3, cameraInternal6, cameraInternal5, surfaceEdge9, surfaceEdge10, entry2, 1);
            jWECryptoParts2 = jWECryptoParts3;
            cameraInternal3 = cameraInternal6;
            cameraInternal4 = cameraInternal5;
            surfaceEdge11.addOnInvalidatedListener(webViewManager$$ExternalSyntheticLambda0);
            surfaceEdge7 = surfaceEdge9;
            surfaceEdge8 = surfaceEdge10;
        }
        CalendarConverter.AnonymousClass1 anonymousClass12 = (CalendarConverter.AnonymousClass1) jWECryptoParts2.cipherText;
        HashMap hashMap6 = new HashMap();
        for (Map.Entry entry3 : hashMap5.entrySet()) {
            hashMap6.put((UseCase) entry3.getKey(), (SurfaceEdge) anonymousClass12.get(entry3.getValue()));
        }
        virtualCameraAdapter8.setChildrenEdges(hashMap6, virtualCameraAdapter8.getSelectedChildSizes(surfaceEdge6, z7));
        Object[] objArr2 = {this.mSessionConfigBuilder.build(), this.mSecondarySessionConfigBuilder.build()};
        ArrayList arrayList3 = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            Object obj2 = objArr2[i2];
            Objects.requireNonNull(obj2);
            arrayList3.add(obj2);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final SurfaceEdge createPrimaryCameraInputSurface(String str, String str2, UseCaseConfig useCaseConfig, AutoValue_StreamSpec autoValue_StreamSpec, AutoValue_StreamSpec autoValue_StreamSpec2) {
        Matrix matrix = this.mSensorToBufferTransformMatrix;
        CameraInternal camera = getCamera();
        Objects.requireNonNull(camera);
        boolean hasTransform = camera.getHasTransform();
        Size size = autoValue_StreamSpec.resolution;
        Rect rect = this.mViewPortCropRect;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        CameraInternal camera2 = getCamera();
        Objects.requireNonNull(camera2);
        int relativeRotation = getRelativeRotation(camera2, false);
        CameraInternal camera3 = getCamera();
        Objects.requireNonNull(camera3);
        SurfaceEdge surfaceEdge = new SurfaceEdge(3, 34, autoValue_StreamSpec, matrix, hasTransform, rect, relativeRotation, -1, isMirroringRequired(camera3));
        this.mCameraEdge = surfaceEdge;
        Objects.requireNonNull(getCamera());
        this.mSharingInputEdge = surfaceEdge;
        SessionConfig.Builder createSessionConfigBuilder = createSessionConfigBuilder(this.mCameraEdge, useCaseConfig, autoValue_StreamSpec);
        this.mSessionConfigBuilder = createSessionConfigBuilder;
        SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new StreamSharing$$ExternalSyntheticLambda0(this, str, str2, useCaseConfig, autoValue_StreamSpec, autoValue_StreamSpec2));
        this.mCloseableErrorListener = closeableErrorListener2;
        createSessionConfigBuilder.mErrorListener = closeableErrorListener2;
        return this.mSharingInputEdge;
    }

    public final SessionConfig.Builder createSessionConfigBuilder(SurfaceEdge surfaceEdge, UseCaseConfig useCaseConfig, AutoValue_StreamSpec autoValue_StreamSpec) {
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(useCaseConfig, autoValue_StreamSpec.resolution);
        TraceParser traceParser = createFrom.mCaptureConfigBuilder;
        VirtualCameraAdapter virtualCameraAdapter = this.mVirtualCameraAdapter;
        Iterator it = virtualCameraAdapter.mChildren.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((SessionConfig) ((UseCase) it.next()).mCurrentConfig.retrieveOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG)).mRepeatingCaptureConfig.mTemplateType;
            List list = SessionConfig.SUPPORTED_TEMPLATE_PRIORITY;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        if (i != -1) {
            traceParser.state = i;
        }
        Size size = autoValue_StreamSpec.resolution;
        Iterator it2 = virtualCameraAdapter.mChildren.iterator();
        while (it2.hasNext()) {
            SessionConfig build = SessionConfig.Builder.createFrom(((UseCase) it2.next()).mCurrentConfig, size).build();
            CaptureConfig captureConfig = build.mRepeatingCaptureConfig;
            traceParser.addAllCameraCaptureCallbacks(captureConfig.mCameraCaptureCallbacks);
            List<CameraCaptureCallback> list2 = build.mSingleCameraCaptureCallbacks;
            ArrayList arrayList = createFrom.mSingleCameraCaptureCallbacks;
            for (CameraCaptureCallback cameraCaptureCallback : list2) {
                traceParser.addCameraCaptureCallback(cameraCaptureCallback);
                if (!arrayList.contains(cameraCaptureCallback)) {
                    arrayList.add(cameraCaptureCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : build.mSessionStateCallbacks) {
                ArrayList arrayList2 = createFrom.mSessionStateCallbacks;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : build.mDeviceStateCallbacks) {
                ArrayList arrayList3 = createFrom.mDeviceStateCallbacks;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            traceParser.addImplementationOptions(captureConfig.mImplementationOptions);
        }
        surfaceEdge.getClass();
        Threads.checkMainThread();
        surfaceEdge.checkNotClosed();
        TransactorKt.checkState("Consumer can only be linked once.", !surfaceEdge.mHasConsumer);
        surfaceEdge.mHasConsumer = true;
        createFrom.addSurface(surfaceEdge.mSettableSurface, autoValue_StreamSpec.dynamicRange, -1);
        traceParser.addCameraCaptureCallback(virtualCameraAdapter.mParentMetadataCallback);
        Config config = autoValue_StreamSpec.implementationOptions;
        if (config != null) {
            traceParser.addImplementationOptions(config);
        }
        createFrom.mSessionType = autoValue_StreamSpec.sessionType;
        applyExpectedFrameRateRange(createFrom, autoValue_StreamSpec);
        return createFrom;
    }

    @Override // androidx.camera.core.UseCase
    public final Set getSupportedDynamicRanges(CameraInfoInternal cameraInfoInternal) {
        HashSet hashSet = this.mVirtualCameraAdapter.mChildren;
        HashSet hashSet2 = null;
        if (hashSet.isEmpty()) {
            return null;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Set supportedDynamicRanges = ((UseCase) it.next()).getSupportedDynamicRanges(cameraInfoInternal);
            if (supportedDynamicRanges != null) {
                if (hashSet2 == null) {
                    hashSet2 = new HashSet(supportedDynamicRanges);
                } else {
                    hashSet2.retainAll(supportedDynamicRanges);
                }
            }
        }
        return hashSet2;
    }

    @Override // androidx.camera.core.UseCase
    public final Set getSupportedEffectTargets() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig.Builder getUseCaseConfigBuilder(Config config) {
        return new StreamSharingBuilder(MutableOptionsBundle.from(config));
    }

    @Override // androidx.camera.core.UseCase
    public final void onBind() {
        VirtualCameraAdapter virtualCameraAdapter = this.mVirtualCameraAdapter;
        Iterator it = virtualCameraAdapter.mChildren.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            VirtualCamera virtualCamera = (VirtualCamera) virtualCameraAdapter.mChildrenVirtualCameras.get(useCase);
            Objects.requireNonNull(virtualCamera);
            useCase.bindToCamera(virtualCamera, null, null, useCase.getDefaultConfig(true, virtualCameraAdapter.mUseCaseConfigFactory));
        }
    }

    @Override // androidx.camera.core.UseCase
    public final void onCameraControlReady() {
        Iterator it = this.mVirtualCameraAdapter.mChildren.iterator();
        while (it.hasNext()) {
            ((UseCase) it.next()).onCameraControlReady();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0116, code lost:
    
        r17 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0118, code lost:
    
        if (r14 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0200, code lost:
    
        if (r11 == false) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0244  */
    @Override // androidx.camera.core.UseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final UseCaseConfig onMergeConfig(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        UseCaseConfig useCaseConfig;
        UseCaseConfig useCaseConfig2;
        Object obj;
        UseCaseConfig useCaseConfig3;
        UseCaseConfig useCaseConfig4;
        MutableOptionsBundle mutableConfig = builder.getMutableConfig();
        VirtualCameraAdapter virtualCameraAdapter = this.mVirtualCameraAdapter;
        HashSet hashSet = virtualCameraAdapter.mChildrenConfigs;
        ResolutionsMerger resolutionsMerger = virtualCameraAdapter.mResolutionsMerger;
        List supportedResolutions = resolutionsMerger.mCameraInfo.getSupportedResolutions(34);
        HashSet hashSet2 = resolutionsMerger.mChildrenConfigs;
        Iterator it = hashSet2.iterator();
        while (true) {
            useCaseConfig = null;
            if (!it.hasNext()) {
                break;
            }
            UseCaseConfig useCaseConfig5 = (UseCaseConfig) it.next();
            if (!((Boolean) useCaseConfig5.retrieveOption(UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED, Boolean.FALSE)).booleanValue() && (useCaseConfig5 instanceof ImageOutputConfig)) {
            }
        }
        List list = (List) mutableConfig.retrieveOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, null);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    supportedResolutions = new ArrayList();
                    break;
                }
                Pair pair = (Pair) it2.next();
                if (((Integer) pair.first).equals(34)) {
                    supportedResolutions = Arrays.asList((Size[]) pair.second);
                    break;
                }
            }
        }
        Rational rational = resolutionsMerger.mFallbackAspectRatio;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet3 = new HashSet();
        Iterator it3 = hashSet2.iterator();
        while (it3.hasNext()) {
            hashSet3.addAll(resolutionsMerger.getSortedChildSizes((UseCaseConfig) it3.next()));
        }
        Iterator it4 = hashSet3.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Size size = (Size) it4.next();
            Rational rational2 = AspectRatioUtil.ASPECT_RATIO_4_3;
            if (!AspectRatioUtil.hasMatchingAspectRatio(size, rational, SizeUtil.RESOLUTION_VGA)) {
                arrayList.addAll(resolutionsMerger.selectParentResolutionsByAspectRatio(resolutionsMerger.mSensorAspectRatio, supportedResolutions, false));
                break;
            }
        }
        int size2 = arrayList.size();
        if (hashSet2.isEmpty()) {
            useCaseConfig2 = null;
        } else {
            Iterator it5 = hashSet2.iterator();
            loop9: while (true) {
                if (!it5.hasNext()) {
                    useCaseConfig2 = useCaseConfig;
                    size2 = 0;
                    break;
                }
                Iterator it6 = resolutionsMerger.getSortedChildSizes((UseCaseConfig) it5.next()).iterator();
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    useCaseConfig2 = useCaseConfig;
                    Size size3 = (Size) it6.next();
                    Rational rational3 = AspectRatioUtil.ASPECT_RATIO_4_3;
                    boolean hasMatchingAspectRatio = AspectRatioUtil.hasMatchingAspectRatio(size3, rational, SizeUtil.RESOLUTION_VGA);
                    if (hasMatchingAspectRatio) {
                        z = true;
                    }
                    if (z2 && hasMatchingAspectRatio) {
                        break loop9;
                    }
                    if (!hasMatchingAspectRatio) {
                        z2 = true;
                    }
                    useCaseConfig = useCaseConfig2;
                }
                useCaseConfig = useCaseConfig2;
            }
        }
        arrayList.addAll(size2, resolutionsMerger.selectParentResolutionsByAspectRatio(rational, supportedResolutions, false));
        arrayList.addAll(resolutionsMerger.selectOtherAspectRatioParentResolutionsWithFovPriority(supportedResolutions, false));
        if (arrayList.isEmpty()) {
            StringUtilsKt.w("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(resolutionsMerger.selectOtherAspectRatioParentResolutionsWithFovPriority(supportedResolutions, true));
        }
        StringUtilsKt.d("ResolutionsMerger", "Parent resolutions: " + arrayList);
        mutableConfig.insertOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, arrayList);
        AutoValue_Config_Option autoValue_Config_Option = UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY;
        Iterator it7 = hashSet.iterator();
        int i = 0;
        while (it7.hasNext()) {
            i = Math.max(i, ((Integer) ((UseCaseConfig) it7.next()).retrieveOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, 0)).intValue());
        }
        mutableConfig.insertOption(autoValue_Config_Option, Integer.valueOf(i));
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = hashSet.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((UseCaseConfig) it8.next()).getDynamicRange());
        }
        if (!arrayList2.isEmpty()) {
            DynamicRange dynamicRange = (DynamicRange) arrayList2.get(0);
            Integer valueOf = Integer.valueOf(dynamicRange.mEncoding);
            int i2 = 1;
            Integer num = Integer.valueOf(dynamicRange.mBitDepth);
            while (i2 < arrayList2.size()) {
                DynamicRange dynamicRange2 = (DynamicRange) arrayList2.get(i2);
                Integer valueOf2 = Integer.valueOf(dynamicRange2.mEncoding);
                if (!valueOf.equals(0)) {
                    useCaseConfig3 = valueOf;
                    if (!valueOf2.equals(0)) {
                        if (!valueOf.equals(2) || valueOf2.equals(1)) {
                            if (valueOf2.equals(2)) {
                                boolean equals = valueOf.equals(1);
                                useCaseConfig3 = valueOf;
                            }
                            boolean equals2 = valueOf.equals(valueOf2);
                            useCaseConfig3 = valueOf;
                            if (!equals2) {
                                useCaseConfig3 = useCaseConfig2;
                            }
                        }
                    }
                    Integer valueOf3 = Integer.valueOf(dynamicRange2.mBitDepth);
                    if (num.equals(0)) {
                        useCaseConfig4 = num;
                        if (!valueOf3.equals(0)) {
                            boolean equals3 = num.equals(valueOf3);
                            useCaseConfig4 = num;
                            if (!equals3) {
                                useCaseConfig4 = useCaseConfig2;
                            }
                        }
                    } else {
                        useCaseConfig4 = valueOf3;
                    }
                    if (useCaseConfig3 != null && useCaseConfig4 != null) {
                        i2++;
                        num = useCaseConfig4;
                        valueOf = useCaseConfig3;
                    }
                }
                useCaseConfig3 = valueOf2;
                Integer valueOf32 = Integer.valueOf(dynamicRange2.mBitDepth);
                if (num.equals(0)) {
                }
                if (useCaseConfig3 != null) {
                    i2++;
                    num = useCaseConfig4;
                    valueOf = useCaseConfig3;
                }
            }
            obj = new DynamicRange(valueOf.intValue(), num.intValue());
            if (obj != null) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
                return useCaseConfig2;
            }
            mutableConfig.insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, obj);
            AutoValue_Config_Option autoValue_Config_Option2 = UseCaseConfig.OPTION_TARGET_FRAME_RATE;
            Range range = AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            Iterator it9 = hashSet.iterator();
            while (it9.hasNext()) {
                Range range2 = (Range) ((UseCaseConfig) it9.next()).retrieveOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE, range);
                Objects.requireNonNull(range2);
                if (AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED.equals(range)) {
                    range = range2;
                } else {
                    try {
                        range = range.intersect(range2);
                    } catch (IllegalArgumentException unused) {
                        StringUtilsKt.d("VirtualCameraAdapter", "No intersected frame rate can be found from the target frame rate settings of the UseCases! Resolved: " + range + " <<>> " + range2);
                        range = range.extend(range2);
                    }
                }
            }
            mutableConfig.insertOption(autoValue_Config_Option2, range);
            Iterator it10 = virtualCameraAdapter.mChildren.iterator();
            while (it10.hasNext()) {
                UseCaseConfig useCaseConfig6 = (UseCaseConfig) virtualCameraAdapter.mChildrenConfigsMap.get((UseCase) it10.next());
                Objects.requireNonNull(useCaseConfig6);
                if (useCaseConfig6.getVideoStabilizationMode() != 0) {
                    mutableConfig.insertOption(UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, Integer.valueOf(useCaseConfig6.getVideoStabilizationMode()));
                }
                if (useCaseConfig6.getPreviewStabilizationMode() != 0) {
                    mutableConfig.insertOption(UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, Integer.valueOf(useCaseConfig6.getPreviewStabilizationMode()));
                }
            }
            return builder.getUseCaseConfig();
        }
        obj = useCaseConfig2;
        if (obj != null) {
        }
    }

    @Override // androidx.camera.core.UseCase
    public final void onSessionStart() {
        this.mInSession = true;
        Iterator it = this.mVirtualCameraAdapter.mChildren.iterator();
        while (it.hasNext()) {
            ((UseCase) it.next()).onSessionStart();
        }
    }

    @Override // androidx.camera.core.UseCase
    public final void onSessionStop() {
        this.mInSession = false;
        Iterator it = this.mVirtualCameraAdapter.mChildren.iterator();
        while (it.hasNext()) {
            ((UseCase) it.next()).onSessionStop();
        }
    }

    @Override // androidx.camera.core.UseCase
    public final AutoValue_StreamSpec onSuggestedStreamSpecImplementationOptionsUpdated(Config config) {
        this.mSessionConfigBuilder.addImplementationOptions(config);
        Object[] objArr = {this.mSessionConfigBuilder.build()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        updateSessionConfig(Collections.unmodifiableList(arrayList));
        SubtreeManager builder = this.mAttachedStreamSpec.toBuilder();
        builder.idCounter = config;
        return builder.build();
    }

    @Override // androidx.camera.core.UseCase
    public final AutoValue_StreamSpec onSuggestedStreamSpecUpdated(AutoValue_StreamSpec autoValue_StreamSpec, AutoValue_StreamSpec autoValue_StreamSpec2) {
        StringUtilsKt.d("StreamSharing", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + autoValue_StreamSpec + ", secondaryStreamSpec " + autoValue_StreamSpec2);
        updateSessionConfig(createPipelineAndUpdateChildrenSpecs(getCameraId(), getSecondaryCamera() == null ? null : getSecondaryCamera().getCameraInfoInternal().getCameraId(), this.mCurrentConfig, autoValue_StreamSpec, autoValue_StreamSpec2));
        this.mState = 1;
        notifyState();
        return autoValue_StreamSpec;
    }

    @Override // androidx.camera.core.UseCase
    public final void onUnbind() {
        clearPipeline$3();
        VirtualCameraAdapter virtualCameraAdapter = this.mVirtualCameraAdapter;
        Iterator it = virtualCameraAdapter.mChildren.iterator();
        while (it.hasNext()) {
            UseCase useCase = (UseCase) it.next();
            VirtualCamera virtualCamera = (VirtualCamera) virtualCameraAdapter.mChildrenVirtualCameras.get(useCase);
            Objects.requireNonNull(virtualCamera);
            useCase.unbindFromCamera(virtualCamera);
        }
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig getDefaultConfig(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        StreamSharingConfig streamSharingConfig = this.mDefaultConfig;
        Config config = useCaseConfigFactory.getConfig(streamSharingConfig.getCaptureType(), 1);
        if (z) {
            config = Config.mergeConfigs(config, streamSharingConfig.mConfig);
        }
        if (config == null) {
            return null;
        }
        return ((StreamSharingBuilder) getUseCaseConfigBuilder(config)).getUseCaseConfig();
    }
}
