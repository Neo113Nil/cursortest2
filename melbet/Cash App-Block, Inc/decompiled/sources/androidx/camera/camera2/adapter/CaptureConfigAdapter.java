package androidx.camera.camera2.adapter;

import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.config.UseCaseGraphContext;
import androidx.camera.camera2.impl.CameraCallbackMap;
import androidx.camera.camera2.impl.CameraPipeCameraProperties;
import androidx.camera.camera2.impl.TagsKt;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.InputRequest;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.compat.AndroidFrameInfo;
import androidx.camera.camera2.pipe.media.AndroidImage;
import androidx.camera.core.ImageInfo;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Reflection;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import squareup.cash.overdraft.OverdraftStatus;

/* loaded from: classes3.dex */
public final class CaptureConfigAdapter {
    public final boolean isLegacyDevice;
    public final TemplateParamsOverride templateParamsOverride;
    public final UseCaseThreads threads;
    public final UseCaseGraphContext useCaseGraphContext;
    public final ZslControl zslControl;

    public CaptureConfigAdapter(CameraPipeCameraProperties cameraPipeCameraProperties, UseCaseGraphContext useCaseGraphContext, ZslControl zslControl, UseCaseThreads useCaseThreads, TemplateParamsOverride templateParamsOverride) {
        cameraPipeCameraProperties.getClass();
        useCaseGraphContext.getClass();
        zslControl.getClass();
        useCaseThreads.getClass();
        this.useCaseGraphContext = useCaseGraphContext;
        this.zslControl = zslControl;
        this.threads = useCaseThreads;
        this.templateParamsOverride = templateParamsOverride;
        CameraMetadata.Companion companion = CameraMetadata.Companion;
        CameraMetadata cameraMetadata = cameraPipeCameraProperties.metadata;
        companion.getClass();
        this.isLegacyDevice = CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0181  */
    /* JADX WARN: Type inference failed for: r14v8, types: [androidx.camera.camera2.adapter.CaptureConfigAdapter$buildImageClosingRequestListener$1] */
    /* renamed from: mapToRequest-nAberiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Request m15mapToRequestnAberiA(CaptureConfig captureConfig, int i, Config config, List list) {
        InputRequest inputRequest;
        ImageProxy dequeueImageFromBuffer;
        InputRequest inputRequest2;
        captureConfig.getClass();
        int i2 = captureConfig.mTemplateType;
        config.getClass();
        list.getClass();
        List unmodifiableList = Collections.unmodifiableList(captureConfig.mSurfaces);
        unmodifiableList.getClass();
        InputRequest inputRequest3 = null;
        if (unmodifiableList.isEmpty()) {
            Handlers$$ExternalSyntheticBUOutline0.m(captureConfig, "Attempted to issue a capture without surfaces using ");
            return null;
        }
        List<DeferrableSurface> list2 = unmodifiableList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (DeferrableSurface deferrableSurface : list2) {
            Object obj = ((Map) this.useCaseGraphContext.surfaceToStreamMap$delegate.getValue()).get(deferrableSurface);
            if (obj == null) {
                Handlers$$ExternalSyntheticBUOutline0.m(deferrableSurface, "Attempted to issue a capture with an unrecognized surface: ");
                return null;
            }
            arrayList.add(new StreamId(((StreamId) obj).value));
        }
        CameraCallbackMap cameraCallbackMap = new CameraCallbackMap();
        List<CameraCaptureCallback> list3 = captureConfig.mCameraCaptureCallbacks;
        list3.getClass();
        for (CameraCaptureCallback cameraCaptureCallback : list3) {
            cameraCaptureCallback.getClass();
            cameraCallbackMap.addCaptureCallback(cameraCaptureCallback, this.threads.sequentialExecutor);
        }
        OptionsBundle optionsBundle = captureConfig.mImplementationOptions;
        TreeMap treeMap = optionsBundle.mOptions;
        Toolbar.AnonymousClass1 anonymousClass1 = new Toolbar.AnonymousClass1(5);
        MutableOptionsBundle mutableOptionsBundle = (MutableOptionsBundle) anonymousClass1.this$0;
        anonymousClass1.insertAllOptions(config);
        anonymousClass1.insertAllOptions(optionsBundle);
        AutoValue_Config_Option autoValue_Config_Option = CaptureConfig.OPTION_ROTATION;
        if (treeMap.containsKey(autoValue_Config_Option)) {
            CaptureRequest.Key key = CaptureRequest.JPEG_ORIENTATION;
            key.getClass();
            Object retrieveOption = optionsBundle.retrieveOption(autoValue_Config_Option);
            retrieveOption.getClass();
            mutableOptionsBundle.insertOption(OverdraftStatus.State_.createCaptureRequestOption(key), retrieveOption);
        }
        AutoValue_Config_Option autoValue_Config_Option2 = CaptureConfig.OPTION_JPEG_QUALITY;
        if (treeMap.containsKey(autoValue_Config_Option2)) {
            CaptureRequest.Key key2 = CaptureRequest.JPEG_QUALITY;
            key2.getClass();
            Object retrieveOption2 = optionsBundle.retrieveOption(autoValue_Config_Option2);
            retrieveOption2.getClass();
            mutableOptionsBundle.insertOption(OverdraftStatus.State_.createCaptureRequestOption(key2), Byte.valueOf((byte) ((Number) retrieveOption2).intValue()));
        }
        if (i2 == 5) {
            ZslControl zslControl = this.zslControl;
            if (!zslControl.isZslDisabledByUserCaseConfig() && !zslControl.isZslDisabledByFlashMode() && (dequeueImageFromBuffer = zslControl.dequeueImageFromBuffer()) != null) {
                ImageInfo imageInfo = dequeueImageFromBuffer.getImageInfo();
                CameraCaptureResult cameraCaptureResult = imageInfo instanceof CameraCaptureResultImageInfo ? ((CameraCaptureResultImageInfo) imageInfo).mCameraCaptureResult : null;
                if (cameraCaptureResult == null) {
                    inputRequest2 = null;
                } else {
                    if (!(cameraCaptureResult instanceof CaptureResultAdapter)) {
                        Handlers$$ExternalSyntheticBUOutline0.m(cameraCaptureResult.getClass(), "Unexpected capture result type: ");
                        return null;
                    }
                    Image image = dequeueImageFromBuffer.getImage();
                    if (image == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                        return null;
                    }
                    AndroidImage androidImage = new AndroidImage(image);
                    Object unwrapAs = ((CaptureResultAdapter) cameraCaptureResult).unwrapAs(Reflection.factory.getOrCreateKotlinClass(FrameInfo.class));
                    if (unwrapAs == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                        return null;
                    }
                    inputRequest3 = new InputRequest(androidImage, (FrameInfo) unwrapAs);
                    final AtomicReference atomicReference = new AtomicReference(dequeueImageFromBuffer);
                    inputRequest2 = new Request.Listener() { // from class: androidx.camera.camera2.adapter.CaptureConfigAdapter$buildImageClosingRequestListener$1
                        @Override // androidx.camera.camera2.pipe.Request.Listener
                        public final void onAborted(Request request) {
                            request.getClass();
                            ImageProxy imageProxy = (ImageProxy) atomicReference.getAndSet(null);
                            if (imageProxy != null) {
                                imageProxy.close();
                            }
                        }

                        @Override // androidx.camera.camera2.pipe.Request.Listener
                        /* renamed from: onComplete-CcXjc1I, reason: not valid java name */
                        public final void mo16onCompleteCcXjc1I(RequestMetadata requestMetadata, long j, AndroidFrameInfo androidFrameInfo) {
                            ImageProxy imageProxy = (ImageProxy) atomicReference.getAndSet(null);
                            if (imageProxy != null) {
                                imageProxy.close();
                            }
                        }

                        @Override // androidx.camera.camera2.pipe.Request.Listener
                        /* renamed from: onFailed-CcXjc1I, reason: not valid java name */
                        public final void mo17onFailedCcXjc1I(RequestMetadata requestMetadata, long j, RequestFailure requestFailure) {
                            ImageProxy imageProxy = (ImageProxy) atomicReference.getAndSet(null);
                            if (imageProxy != null) {
                                imageProxy.close();
                            }
                        }

                        @Override // androidx.camera.camera2.pipe.Request.Listener
                        /* renamed from: onTotalCaptureResult-CcXjc1I, reason: not valid java name */
                        public final void mo18onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j, AndroidFrameInfo androidFrameInfo) {
                            ImageProxy imageProxy = (ImageProxy) atomicReference.getAndSet(null);
                            if (imageProxy != null) {
                                imageProxy.close();
                            }
                        }
                    };
                }
                inputRequest = inputRequest3;
                inputRequest3 = inputRequest2;
                if (inputRequest == null) {
                    int i3 = (i != 3 || this.isLegacyDevice) ? (i2 == -1 || i2 == 5) ? 2 : -1 : 4;
                    if (i3 != -1) {
                        i2 = i3;
                    }
                }
                LinkedHashMap plus = MapsKt__MapsKt.plus(this.templateParamsOverride.mo25getOverrideParamsxlOpshk(new RequestTemplate(i2)), OverdraftStatus.State_.toParameters(anonymousClass1.build()));
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                createListBuilder.add(cameraCallbackMap);
                if (inputRequest3 != null) {
                    createListBuilder.add(inputRequest3);
                }
                createListBuilder.addAll(list);
                return new Request(arrayList, plus, MapsKt__MapsJVMKt.mapOf(new Pair(TagsKt.CAMERAX_TAG_BUNDLE, captureConfig.mTagBundle)), CollectionsKt__CollectionsJVMKt.build(createListBuilder), new RequestTemplate(i2), inputRequest);
            }
        }
        inputRequest = null;
        if (inputRequest == null) {
        }
        LinkedHashMap plus2 = MapsKt__MapsKt.plus(this.templateParamsOverride.mo25getOverrideParamsxlOpshk(new RequestTemplate(i2)), OverdraftStatus.State_.toParameters(anonymousClass1.build()));
        ListBuilder createListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
        createListBuilder2.add(cameraCallbackMap);
        if (inputRequest3 != null) {
        }
        createListBuilder2.addAll(list);
        return new Request(arrayList, plus2, MapsKt__MapsJVMKt.mapOf(new Pair(TagsKt.CAMERAX_TAG_BUNDLE, captureConfig.mTagBundle)), CollectionsKt__CollectionsJVMKt.build(createListBuilder2), new RequestTemplate(i2), inputRequest);
    }
}
