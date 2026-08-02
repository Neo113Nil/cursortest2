package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.adapter.CameraUseCaseAdapter;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.featuregroup.impl.feature.ImageFormatFeature;
import androidx.camera.core.imagecapture.AutoValue_CaptureNode_In;
import androidx.camera.core.imagecapture.AutoValue_ProcessingNode_In;
import androidx.camera.core.imagecapture.AutoValue_TakePictureRequest;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.imagecapture.TakePictureManagerImpl;
import androidx.camera.core.impl.AdapterCameraInfo;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.AutoValue_SessionConfig_OutputConfig;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureCallbacks;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.internal.IoConfig;
import androidx.camera.core.internal.ScreenFlashWrapper;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import androidx.camera.core.processing.Edge;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.video.Recorder;
import androidx.core.util.Consumer;
import androidx.media3.extractor.text.CueEncoder;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.CoroutinesRoom;
import androidx.room.TransactorKt;
import androidx.transition.Transition;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.toolbox.HurlStack;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import com.bugsnag.android.TraceParser;
import com.bumptech.glide.GlideBuilder$1;
import com.fillr.e0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.api.ContextKt;
import com.squareup.workflow1.internal.SubtreeManager;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.coroutines.SafeContinuation;
import net.oneformapp.ProfileStore_;
import okhttp3.FormBody;
import utils.AnyUtilsKt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class ImageCapture extends UseCase {
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    public final int mCaptureMode;
    public SessionConfig.CloseableErrorListener mCloseableErrorListener;
    public Rational mCropAspectRatio;
    public final int mFlashMode;
    public final int mFlashType;
    public final Recorder.AnonymousClass6 mImageCaptureControl;
    public JWECryptoParts mImagePipeline;
    public final AtomicReference mLockedFlashMode;
    public final ScreenFlashWrapper mScreenFlashWrapper;
    public SessionConfig.Builder mSessionConfigBuilder;
    public TakePictureManagerImpl mTakePictureManager;

    public final class Defaults {
        public static final ImageCaptureConfig DEFAULT_CONFIG;

        static {
            StreamUseCase streamUseCase = StreamUseCase.STILL_CAPTURE;
            ResolutionSelector resolutionSelector = new ResolutionSelector(AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY, ResolutionStrategy.HIGHEST_AVAILABLE_STRATEGY);
            Preview.Builder builder = new Preview.Builder(2);
            AutoValue_Config_Option autoValue_Config_Option = UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY;
            MutableOptionsBundle mutableOptionsBundle = builder.mMutableConfig;
            mutableOptionsBundle.insertOption(autoValue_Config_Option, 4);
            mutableOptionsBundle.insertOption(UseCaseConfig.OPTION_STREAM_USE_CASE, streamUseCase);
            mutableOptionsBundle.insertOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, 0);
            mutableOptionsBundle.insertOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector);
            mutableOptionsBundle.insertOption(ImageCaptureConfig.OPTION_OUTPUT_FORMAT, 0);
            mutableOptionsBundle.insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, DynamicRange.SDR);
            DEFAULT_CONFIG = new ImageCaptureConfig(OptionsBundle.from(mutableOptionsBundle));
        }
    }

    public interface ScreenFlash {
        void apply(long j, StreamSharing$$ExternalSyntheticLambda1 streamSharing$$ExternalSyntheticLambda1);

        void clear();
    }

    public ImageCapture(ImageCaptureConfig imageCaptureConfig) {
        super(imageCaptureConfig);
        this.mLockedFlashMode = new AtomicReference(null);
        this.mFlashMode = -1;
        this.mCropAspectRatio = null;
        this.mImageCaptureControl = new Recorder.AnonymousClass6(this, 10);
        ImageCaptureConfig imageCaptureConfig2 = (ImageCaptureConfig) this.mCurrentConfig;
        AutoValue_Config_Option autoValue_Config_Option = ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE;
        if (imageCaptureConfig2.containsOption(autoValue_Config_Option)) {
            this.mCaptureMode = ((Integer) imageCaptureConfig2.retrieveOption(autoValue_Config_Option)).intValue();
        } else {
            this.mCaptureMode = 1;
        }
        this.mFlashType = ((Integer) imageCaptureConfig2.retrieveOption(ImageCaptureConfig.OPTION_FLASH_TYPE, 0)).intValue();
        this.mScreenFlashWrapper = new ScreenFlashWrapper((ScreenFlash) imageCaptureConfig2.retrieveOption(ImageCaptureConfig.OPTION_SCREEN_FLASH, null));
    }

    public static boolean isImageFormatSupported(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    public final void clearPipeline(boolean z) {
        TakePictureManagerImpl takePictureManagerImpl;
        Log.d("ImageCapture", "clearPipeline");
        Threads.checkMainThread();
        SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.mCloseableErrorListener = null;
        }
        JWECryptoParts jWECryptoParts = this.mImagePipeline;
        if (jWECryptoParts != null) {
            jWECryptoParts.close();
            this.mImagePipeline = null;
        }
        if (!z && (takePictureManagerImpl = this.mTakePictureManager) != null) {
            takePictureManagerImpl.abortRequests();
            this.mTakePictureManager = null;
        }
        getCameraControl$1().clearZslConfig();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x019e  */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v31, types: [androidx.camera.core.impl.CameraCaptureCallback] */
    /* JADX WARN: Type inference failed for: r2v37, types: [androidx.camera.core.impl.CameraCaptureCallback] */
    /* JADX WARN: Type inference failed for: r5v11, types: [androidx.camera.core.MetadataImageReader] */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.camera.core.MetadataImageReader] */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SessionConfig.Builder createPipeline(String str, ImageCaptureConfig imageCaptureConfig, AutoValue_StreamSpec autoValue_StreamSpec) {
        int i;
        HashSet hashSet;
        int i2;
        int i3;
        int i4;
        Object cameraCharacteristics;
        CameraCharacteristics cameraCharacteristics2;
        CameraUseCaseAdapter.DefaultCaptureOptionsUnpacker defaultCaptureOptionsUnpacker;
        int i5;
        MetadataImageReader metadataImageReader;
        Consumer consumer;
        MetadataImageReader.AnonymousClass1 anonymousClass1;
        CameraCaptureCallback cameraCaptureCallback;
        Recorder.AnonymousClass1 anonymousClass12;
        SurfaceRequest.AnonymousClass2 anonymousClass2;
        CameraCaptureCallback cameraCaptureCallback2;
        Recorder.AnonymousClass1 anonymousClass13;
        Threads.checkMainThread();
        Log.d("ImageCapture", "createPipeline(cameraId: " + str + ", streamSpec: " + autoValue_StreamSpec + ")");
        Size size = autoValue_StreamSpec.resolution;
        CameraInternal camera = getCamera();
        Objects.requireNonNull(camera);
        boolean hasTransform = camera.getHasTransform();
        boolean z = hasTransform ^ true;
        if (this.mImagePipeline != null) {
            TransactorKt.checkState(null, z);
            this.mImagePipeline.close();
        }
        CameraInfo cameraInfo = getCamera().getCameraInfo();
        int i6 = 4101;
        if (cameraInfo instanceof AdapterCameraInfo) {
            i = 0;
            Config config = ((UseCaseConfigFactory) ((AdapterCameraInfo) cameraInfo).mCameraConfig.retrieveOption(CameraConfig.OPTION_USECASE_CONFIG_FACTORY, UseCaseConfigFactory.EMPTY_INSTANCE)).getConfig(UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE, 1);
            if (config != null) {
                AutoValue_Config_Option autoValue_Config_Option = ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS;
                OptionsBundle optionsBundle = (OptionsBundle) config;
                if (optionsBundle.mOptions.containsKey(autoValue_Config_Option)) {
                    hashSet = new HashSet();
                    hashSet.add(0);
                    Iterator it = ((List) optionsBundle.retrieveOption(autoValue_Config_Option)).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((Integer) ((Pair) it.next()).first).intValue() == 4101) {
                            hashSet.add(1);
                            break;
                        }
                    }
                    if (hashSet == null) {
                        i2 = 2;
                    } else {
                        hashSet = new HashSet();
                        hashSet.add(0);
                        if (cameraInfo != null) {
                            i2 = 2;
                            i3 = ((CameraInfoInternal) cameraInfo).getSupportedOutputFormats().contains(4101);
                        } else {
                            i2 = 2;
                            i3 = i;
                        }
                        if (i3 != 0) {
                            hashSet.add(1);
                        }
                        if (cameraInfo != null) {
                            CameraInfoInternal cameraInfoInternal = (CameraInfoInternal) cameraInfo;
                            if (cameraInfoInternal.getAvailableCapabilities().contains(3)) {
                                i4 = cameraInfoInternal.getSupportedOutputFormats().contains(32);
                                if (i4 != 0) {
                                    hashSet.add(Integer.valueOf(i2));
                                    hashSet.add(3);
                                }
                            }
                        }
                        i4 = i;
                        if (i4 != 0) {
                        }
                    }
                    UseCaseConfig useCaseConfig = this.mCurrentConfig;
                    AutoValue_Config_Option autoValue_Config_Option2 = ImageCaptureConfig.OPTION_OUTPUT_FORMAT;
                    Integer num = (Integer) useCaseConfig.retrieveOption(autoValue_Config_Option2, 0);
                    num.getClass();
                    boolean contains = hashSet.contains(num);
                    StringBuilder sb = new StringBuilder("The specified output format (");
                    Integer num2 = (Integer) this.mCurrentConfig.retrieveOption(autoValue_Config_Option2, 0);
                    num2.getClass();
                    sb.append(num2.intValue());
                    sb.append(") is not supported by current configuration. Supported output formats: ");
                    sb.append(hashSet);
                    TransactorKt.checkArgument(sb.toString(), contains);
                    if (((Boolean) this.mCurrentConfig.retrieveOption(ImageCaptureConfig.OPTION_POSTVIEW_ENABLED, Boolean.FALSE)).booleanValue()) {
                        imageCaptureConfig.getInputFormat();
                        getCamera().getExtendedConfig().getSessionProcessor();
                    }
                    if (getCamera() != null) {
                        try {
                            cameraCharacteristics = getCamera().getCameraInfoInternal().getCameraCharacteristics();
                        } catch (Exception e) {
                            Log.e("ImageCapture", "getCameraCharacteristics failed", e);
                        }
                        if (cameraCharacteristics instanceof CameraCharacteristics) {
                            cameraCharacteristics2 = (CameraCharacteristics) cameraCharacteristics;
                            JWECryptoParts jWECryptoParts = new JWECryptoParts();
                            Threads.checkMainThread();
                            jWECryptoParts.header = imageCaptureConfig;
                            defaultCaptureOptionsUnpacker = (CameraUseCaseAdapter.DefaultCaptureOptionsUnpacker) imageCaptureConfig.retrieveOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, null);
                            if (defaultCaptureOptionsUnpacker == null) {
                                a$$ExternalSyntheticBUOutline0.m$2((String) imageCaptureConfig.retrieveOption(TargetConfig.OPTION_TARGET_NAME, imageCaptureConfig.toString()), "Implementation is missing option unpacker for ");
                                throw null;
                            }
                            TraceParser traceParser = new TraceParser();
                            defaultCaptureOptionsUnpacker.unpack(imageCaptureConfig, traceParser);
                            jWECryptoParts.encryptedKey = traceParser.build();
                            final e0 e0Var = new e0(5);
                            e0Var.a = null;
                            e0Var.h = null;
                            jWECryptoParts.iv = e0Var;
                            Executor executor = (Executor) imageCaptureConfig.retrieveOption(IoConfig.OPTION_IO_EXECUTOR, zzabp.ioExecutor());
                            Objects.requireNonNull(executor);
                            final ProcessingNode processingNode = new ProcessingNode(executor, cameraCharacteristics2);
                            jWECryptoParts.cipherText = processingNode;
                            ArrayList arrayList = new ArrayList();
                            if (((Integer) imageCaptureConfig.retrieveOption(ImageInputConfig.OPTION_SECONDARY_INPUT_FORMAT, Integer.valueOf(i))).intValue() != 0) {
                                arrayList.add(32);
                                arrayList.add(256);
                            } else {
                                Integer num3 = (Integer) imageCaptureConfig.retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
                                if (num3 != null) {
                                    i6 = num3.intValue();
                                } else {
                                    Integer num4 = (Integer) imageCaptureConfig.retrieveOption(ImageInputConfig.OPTION_INPUT_FORMAT, null);
                                    if (num4 == null || num4.intValue() != 4101) {
                                        i6 = (num4 == null || num4.intValue() != 32) ? 256 : 32;
                                    }
                                }
                                arrayList.add(Integer.valueOf(i6));
                            }
                            int inputFormat = imageCaptureConfig.getInputFormat();
                            if (imageCaptureConfig.retrieveOption(ImageCaptureConfig.OPTION_IMAGE_READER_PROXY_PROVIDER, null) != null) {
                                a$$ExternalSyntheticBUOutline0.m$1();
                                throw null;
                            }
                            Edge edge = new Edge();
                            Edge edge2 = new Edge();
                            AutoValue_CaptureNode_In autoValue_CaptureNode_In = new AutoValue_CaptureNode_In(size, inputFormat, arrayList, z, edge, edge2);
                            jWECryptoParts.authenticationTag = autoValue_CaptureNode_In;
                            TransactorKt.checkState("CaptureNode does not support recreation yet.", (((AutoValue_CaptureNode_In) e0Var.f) == null && ((ProfileStore_) e0Var.b) == null) ? 1 : i);
                            e0Var.f = autoValue_CaptureNode_In;
                            MetadataImageReader.AnonymousClass1 anonymousClass14 = new MetadataImageReader.AnonymousClass1(e0Var, 1);
                            int i7 = arrayList.size() > 1 ? 1 : i;
                            if (hasTransform) {
                                if (i7 != 0) {
                                    i5 = i7;
                                    ?? metadataImageReader2 = new MetadataImageReader(size.getWidth(), size.getHeight(), 256, 4);
                                    MetadataImageReader.AnonymousClass1 anonymousClass15 = metadataImageReader2.mCameraCaptureCallback;
                                    CameraCaptureCallback[] cameraCaptureCallbackArr = new CameraCaptureCallback[2];
                                    cameraCaptureCallbackArr[i] = anonymousClass14;
                                    cameraCaptureCallbackArr[1] = anonymousClass15;
                                    ?? createComboCallback = CameraCaptureCallbacks.createComboCallback(cameraCaptureCallbackArr);
                                    metadataImageReader = new MetadataImageReader(size.getWidth(), size.getHeight(), 32, 4);
                                    MetadataImageReader.AnonymousClass1 anonymousClass16 = metadataImageReader.mCameraCaptureCallback;
                                    CameraCaptureCallback[] cameraCaptureCallbackArr2 = new CameraCaptureCallback[2];
                                    cameraCaptureCallbackArr2[i] = anonymousClass14;
                                    cameraCaptureCallbackArr2[1] = anonymousClass16;
                                    cameraCaptureCallback2 = CameraCaptureCallbacks.createComboCallback(cameraCaptureCallbackArr2);
                                    anonymousClass1 = createComboCallback;
                                    anonymousClass13 = metadataImageReader2;
                                } else {
                                    i5 = i7;
                                    ?? metadataImageReader3 = new MetadataImageReader(size.getWidth(), size.getHeight(), inputFormat, 4);
                                    MetadataImageReader.AnonymousClass1 anonymousClass17 = metadataImageReader3.mCameraCaptureCallback;
                                    CameraCaptureCallback[] cameraCaptureCallbackArr3 = new CameraCaptureCallback[2];
                                    cameraCaptureCallbackArr3[i] = anonymousClass14;
                                    cameraCaptureCallbackArr3[1] = anonymousClass17;
                                    ?? createComboCallback2 = CameraCaptureCallbacks.createComboCallback(cameraCaptureCallbackArr3);
                                    metadataImageReader = null;
                                    anonymousClass1 = createComboCallback2;
                                    cameraCaptureCallback2 = null;
                                    anonymousClass13 = metadataImageReader3;
                                }
                                CameraCaptureCallback cameraCaptureCallback3 = cameraCaptureCallback2;
                                final int i8 = i;
                                consumer = new Consumer() { // from class: androidx.camera.core.imagecapture.CaptureNode$$ExternalSyntheticLambda0
                                    @Override // androidx.core.util.Consumer
                                    public final void accept(Object obj) {
                                        int i9 = i8;
                                        e0 e0Var2 = e0Var;
                                        switch (i9) {
                                            case 0:
                                                e0Var2.onRequestAvailable((ProcessingRequest) obj);
                                                break;
                                            case 1:
                                                ProcessingRequest processingRequest = (ProcessingRequest) obj;
                                                e0Var2.onRequestAvailable(processingRequest);
                                                Recorder.AnonymousClass1 anonymousClass18 = (Recorder.AnonymousClass1) e0Var2.h;
                                                TransactorKt.checkState("Pending request should be null", ((ProcessingRequest) anonymousClass18.this$0) == null);
                                                anonymousClass18.this$0 = processingRequest;
                                                break;
                                            default:
                                                e0Var2.sendCaptureError((AutoValue_TakePictureManager_CaptureError) obj);
                                                break;
                                        }
                                    }
                                };
                                cameraCaptureCallback = cameraCaptureCallback3;
                                anonymousClass12 = anonymousClass13;
                            } else {
                                i5 = i7;
                                Recorder.AnonymousClass1 anonymousClass18 = new Recorder.AnonymousClass1((Object) AnyUtilsKt.createIsolatedReader(size.getWidth(), size.getHeight(), inputFormat, 4), (boolean) i, 8);
                                e0Var.h = anonymousClass18;
                                final int i9 = 1;
                                Consumer consumer2 = new Consumer() { // from class: androidx.camera.core.imagecapture.CaptureNode$$ExternalSyntheticLambda0
                                    @Override // androidx.core.util.Consumer
                                    public final void accept(Object obj) {
                                        int i92 = i9;
                                        e0 e0Var2 = e0Var;
                                        switch (i92) {
                                            case 0:
                                                e0Var2.onRequestAvailable((ProcessingRequest) obj);
                                                break;
                                            case 1:
                                                ProcessingRequest processingRequest = (ProcessingRequest) obj;
                                                e0Var2.onRequestAvailable(processingRequest);
                                                Recorder.AnonymousClass1 anonymousClass182 = (Recorder.AnonymousClass1) e0Var2.h;
                                                TransactorKt.checkState("Pending request should be null", ((ProcessingRequest) anonymousClass182.this$0) == null);
                                                anonymousClass182.this$0 = processingRequest;
                                                break;
                                            default:
                                                e0Var2.sendCaptureError((AutoValue_TakePictureManager_CaptureError) obj);
                                                break;
                                        }
                                    }
                                };
                                metadataImageReader = null;
                                consumer = consumer2;
                                anonymousClass1 = anonymousClass14;
                                cameraCaptureCallback = null;
                                anonymousClass12 = anonymousClass18;
                            }
                            autoValue_CaptureNode_In.mCameraCaptureCallback = anonymousClass1;
                            if (i5 != 0 && cameraCaptureCallback != null) {
                                autoValue_CaptureNode_In.mSecondaryCameraCaptureCallback = cameraCaptureCallback;
                            }
                            Surface surface = anonymousClass12.getSurface();
                            Objects.requireNonNull(surface);
                            TransactorKt.checkState("The surface is already set.", autoValue_CaptureNode_In.mSurface == null);
                            autoValue_CaptureNode_In.mSurface = new SurfaceRequest.AnonymousClass2(surface, size, inputFormat);
                            e0Var.b = new ProfileStore_(anonymousClass12);
                            anonymousClass12.setOnImageAvailableListener(new StreamSharing$$ExternalSyntheticLambda1(e0Var, 8), zzabp.mainThreadExecutor());
                            if (i5 != 0 && metadataImageReader != null) {
                                Surface surface2 = metadataImageReader.getSurface();
                                TransactorKt.checkState("The secondary surface is already set.", autoValue_CaptureNode_In.mSecondarySurface == null);
                                autoValue_CaptureNode_In.mSecondarySurface = new SurfaceRequest.AnonymousClass2(surface2, size, inputFormat);
                                e0Var.c = new ProfileStore_(metadataImageReader);
                                metadataImageReader.setOnImageAvailableListener(new StreamSharing$$ExternalSyntheticLambda1(e0Var, 8), zzabp.mainThreadExecutor());
                            }
                            edge.mListener = consumer;
                            final int i10 = 2;
                            edge2.mListener = new Consumer() { // from class: androidx.camera.core.imagecapture.CaptureNode$$ExternalSyntheticLambda0
                                @Override // androidx.core.util.Consumer
                                public final void accept(Object obj) {
                                    int i92 = i10;
                                    e0 e0Var2 = e0Var;
                                    switch (i92) {
                                        case 0:
                                            e0Var2.onRequestAvailable((ProcessingRequest) obj);
                                            break;
                                        case 1:
                                            ProcessingRequest processingRequest = (ProcessingRequest) obj;
                                            e0Var2.onRequestAvailable(processingRequest);
                                            Recorder.AnonymousClass1 anonymousClass182 = (Recorder.AnonymousClass1) e0Var2.h;
                                            TransactorKt.checkState("Pending request should be null", ((ProcessingRequest) anonymousClass182.this$0) == null);
                                            anonymousClass182.this$0 = processingRequest;
                                            break;
                                        default:
                                            e0Var2.sendCaptureError((AutoValue_TakePictureManager_CaptureError) obj);
                                            break;
                                    }
                                }
                            };
                            Edge edge3 = new Edge();
                            Edge edge4 = new Edge();
                            AutoValue_ProcessingNode_In autoValue_ProcessingNode_In = new AutoValue_ProcessingNode_In(edge3, edge4, inputFormat, arrayList);
                            e0Var.i = autoValue_ProcessingNode_In;
                            processingNode.mInputEdge = autoValue_ProcessingNode_In;
                            final int i11 = 0;
                            edge3.mListener = new Consumer() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda0
                                @Override // androidx.core.util.Consumer
                                public final void accept(Object obj) {
                                    int i12 = i11;
                                    ProcessingNode processingNode2 = processingNode;
                                    AutoValue_ProcessingNode_InputPacket autoValue_ProcessingNode_InputPacket = (AutoValue_ProcessingNode_InputPacket) obj;
                                    switch (i12) {
                                        case 0:
                                            if (!autoValue_ProcessingNode_InputPacket.processingRequest.mCallback.mIsAborted) {
                                                processingNode2.mBlockingExecutor.execute(new ProcessingNode$$ExternalSyntheticLambda2(processingNode2, autoValue_ProcessingNode_InputPacket, 1));
                                                break;
                                            } else {
                                                autoValue_ProcessingNode_InputPacket.imageProxy.close();
                                                break;
                                            }
                                        default:
                                            if (!autoValue_ProcessingNode_InputPacket.processingRequest.mCallback.mIsAborted) {
                                                processingNode2.mBlockingExecutor.execute(new ProcessingNode$$ExternalSyntheticLambda2(processingNode2, autoValue_ProcessingNode_InputPacket, 0));
                                                break;
                                            } else {
                                                StringUtilsKt.w("ProcessingNode", "The postview image is closed due to request aborted");
                                                autoValue_ProcessingNode_InputPacket.imageProxy.close();
                                                break;
                                            }
                                    }
                                }
                            };
                            final int i12 = 1;
                            edge4.mListener = new Consumer() { // from class: androidx.camera.core.imagecapture.ProcessingNode$$ExternalSyntheticLambda0
                                @Override // androidx.core.util.Consumer
                                public final void accept(Object obj) {
                                    int i122 = i12;
                                    ProcessingNode processingNode2 = processingNode;
                                    AutoValue_ProcessingNode_InputPacket autoValue_ProcessingNode_InputPacket = (AutoValue_ProcessingNode_InputPacket) obj;
                                    switch (i122) {
                                        case 0:
                                            if (!autoValue_ProcessingNode_InputPacket.processingRequest.mCallback.mIsAborted) {
                                                processingNode2.mBlockingExecutor.execute(new ProcessingNode$$ExternalSyntheticLambda2(processingNode2, autoValue_ProcessingNode_InputPacket, 1));
                                                break;
                                            } else {
                                                autoValue_ProcessingNode_InputPacket.imageProxy.close();
                                                break;
                                            }
                                        default:
                                            if (!autoValue_ProcessingNode_InputPacket.processingRequest.mCallback.mIsAborted) {
                                                processingNode2.mBlockingExecutor.execute(new ProcessingNode$$ExternalSyntheticLambda2(processingNode2, autoValue_ProcessingNode_InputPacket, 0));
                                                break;
                                            } else {
                                                StringUtilsKt.w("ProcessingNode", "The postview image is closed due to request aborted");
                                                autoValue_ProcessingNode_InputPacket.imageProxy.close();
                                                break;
                                            }
                                    }
                                }
                            };
                            int i13 = 5;
                            processingNode.mInput2Packet = new CoroutinesRoom.Companion(i13);
                            processingNode.mImage2JpegBytes = new Recorder.AnonymousClass6(processingNode.mQuirks);
                            processingNode.mJpegBytes2CroppedBitmap = new HurlStack(i13);
                            int i14 = 4;
                            processingNode.mBitmap2JpegBytes = new CueEncoder(i14);
                            processingNode.mJpegBytes2Disk = new GlideBuilder$1();
                            processingNode.mJpegImage2Result = new CueEncoder(i13);
                            processingNode.mImage2Bitmap = new CoroutinesRoom.Companion(i14);
                            if (inputFormat == 35 || processingNode.mHasIncorrectJpegMetadataQuirk) {
                                processingNode.mJpegBytes2Image = new Transition.AnonymousClass1();
                            }
                            this.mImagePipeline = jWECryptoParts;
                            if (this.mTakePictureManager == null) {
                                Objects.requireNonNull((UseCaseConfig.AnonymousClass1) this.mCurrentConfig.retrieveOption(UseCaseConfig.OPTION_TAKE_PICTURE_MANAGER_PROVIDER, new UseCaseConfig.AnonymousClass1()));
                                this.mTakePictureManager = new TakePictureManagerImpl(this.mImageCaptureControl);
                            }
                            TakePictureManagerImpl takePictureManagerImpl = this.mTakePictureManager;
                            JWECryptoParts jWECryptoParts2 = this.mImagePipeline;
                            takePictureManagerImpl.getClass();
                            Threads.checkMainThread();
                            takePictureManagerImpl.mImagePipeline = jWECryptoParts2;
                            jWECryptoParts2.getClass();
                            Threads.checkMainThread();
                            e0 e0Var2 = (e0) jWECryptoParts2.iv;
                            e0Var2.getClass();
                            Threads.checkMainThread();
                            TransactorKt.checkState("The ImageReader is not initialized.", ((ProfileStore_) e0Var2.b) != null);
                            ProfileStore_ profileStore_ = (ProfileStore_) e0Var2.b;
                            synchronized (profileStore_.passcode) {
                                profileStore_.schema = takePictureManagerImpl;
                            }
                            JWECryptoParts jWECryptoParts3 = this.mImagePipeline;
                            SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom((ImageCaptureConfig) jWECryptoParts3.header, autoValue_StreamSpec.resolution);
                            AutoValue_CaptureNode_In autoValue_CaptureNode_In2 = (AutoValue_CaptureNode_In) jWECryptoParts3.authenticationTag;
                            SurfaceRequest.AnonymousClass2 anonymousClass22 = autoValue_CaptureNode_In2.mSurface;
                            Objects.requireNonNull(anonymousClass22);
                            DynamicRange dynamicRange = DynamicRange.SDR;
                            JWECryptoParts builder = AutoValue_SessionConfig_OutputConfig.builder(anonymousClass22);
                            builder.authenticationTag = dynamicRange;
                            createFrom.mOutputConfigs.add(builder.build());
                            if (autoValue_CaptureNode_In2.outputFormats.size() > 1 && (anonymousClass2 = autoValue_CaptureNode_In2.mSecondarySurface) != null) {
                                JWECryptoParts builder2 = AutoValue_SessionConfig_OutputConfig.builder(anonymousClass2);
                                builder2.authenticationTag = dynamicRange;
                                createFrom.mOutputConfigs.add(builder2.build());
                            }
                            SurfaceRequest.AnonymousClass2 anonymousClass23 = autoValue_CaptureNode_In2.mPostviewSurface;
                            if (anonymousClass23 != null) {
                                createFrom.mPostviewOutputConfig = AutoValue_SessionConfig_OutputConfig.builder(anonymousClass23).build();
                            }
                            createFrom.mSessionType = autoValue_StreamSpec.sessionType;
                            if (this.mCaptureMode == 2 && !autoValue_StreamSpec.zslDisabled) {
                                getCameraControl$1().addZslConfig(createFrom);
                            }
                            Config config2 = autoValue_StreamSpec.implementationOptions;
                            if (config2 != null) {
                                createFrom.mCaptureConfigBuilder.addImplementationOptions(config2);
                            }
                            SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
                            if (closeableErrorListener != null) {
                                closeableErrorListener.close();
                            }
                            SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new Preview$$ExternalSyntheticLambda2(this, 1));
                            this.mCloseableErrorListener = closeableErrorListener2;
                            createFrom.mErrorListener = closeableErrorListener2;
                            return createFrom;
                        }
                    }
                    cameraCharacteristics2 = null;
                    JWECryptoParts jWECryptoParts4 = new JWECryptoParts();
                    Threads.checkMainThread();
                    jWECryptoParts4.header = imageCaptureConfig;
                    defaultCaptureOptionsUnpacker = (CameraUseCaseAdapter.DefaultCaptureOptionsUnpacker) imageCaptureConfig.retrieveOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, null);
                    if (defaultCaptureOptionsUnpacker == null) {
                    }
                }
            }
        } else {
            i = 0;
        }
        hashSet = null;
        if (hashSet == null) {
        }
        UseCaseConfig useCaseConfig2 = this.mCurrentConfig;
        AutoValue_Config_Option autoValue_Config_Option22 = ImageCaptureConfig.OPTION_OUTPUT_FORMAT;
        Integer num5 = (Integer) useCaseConfig2.retrieveOption(autoValue_Config_Option22, 0);
        num5.getClass();
        boolean contains2 = hashSet.contains(num5);
        StringBuilder sb2 = new StringBuilder("The specified output format (");
        Integer num22 = (Integer) this.mCurrentConfig.retrieveOption(autoValue_Config_Option22, 0);
        num22.getClass();
        sb2.append(num22.intValue());
        sb2.append(") is not supported by current configuration. Supported output formats: ");
        sb2.append(hashSet);
        TransactorKt.checkArgument(sb2.toString(), contains2);
        if (((Boolean) this.mCurrentConfig.retrieveOption(ImageCaptureConfig.OPTION_POSTVIEW_ENABLED, Boolean.FALSE)).booleanValue()) {
        }
        if (getCamera() != null) {
        }
        cameraCharacteristics2 = null;
        JWECryptoParts jWECryptoParts42 = new JWECryptoParts();
        Threads.checkMainThread();
        jWECryptoParts42.header = imageCaptureConfig;
        defaultCaptureOptionsUnpacker = (CameraUseCaseAdapter.DefaultCaptureOptionsUnpacker) imageCaptureConfig.retrieveOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, null);
        if (defaultCaptureOptionsUnpacker == null) {
        }
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig getDefaultConfig(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        DEFAULT_CONFIG.getClass();
        ImageCaptureConfig imageCaptureConfig = Defaults.DEFAULT_CONFIG;
        Config config = useCaseConfigFactory.getConfig(imageCaptureConfig.getCaptureType(), this.mCaptureMode);
        if (z) {
            config = Config.mergeConfigs(config, imageCaptureConfig);
        }
        if (config == null) {
            return null;
        }
        return new ImageCaptureConfig(OptionsBundle.from(((Preview.Builder) getUseCaseConfigBuilder(config)).mMutableConfig));
    }

    public final int getFlashMode() {
        int i;
        synchronized (this.mLockedFlashMode) {
            i = this.mFlashMode;
            if (i == -1) {
                i = ((Integer) ((ImageCaptureConfig) this.mCurrentConfig).retrieveOption(ImageCaptureConfig.OPTION_FLASH_MODE, 2)).intValue();
            }
        }
        return i;
    }

    @Override // androidx.camera.core.UseCase
    public final Set getSupportedEffectTargets() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig.Builder getUseCaseConfigBuilder(Config config) {
        return new Preview.Builder(MutableOptionsBundle.from(config), 2);
    }

    @Override // androidx.camera.core.UseCase
    public final boolean isAutoRotationSupported() {
        return true;
    }

    @Override // androidx.camera.core.UseCase
    public final void onBind() {
        TransactorKt.checkNotNull(getCamera(), "Attached camera cannot be null");
        if (getFlashMode() == 3) {
            CameraInternal camera = getCamera();
            if ((camera != null ? camera.getCameraInfo().getLensFacing() : -1) == 0) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    @Override // androidx.camera.core.UseCase
    public final void onCameraControlReady() {
        StringUtilsKt.d("ImageCapture", "onCameraControlReady");
        trySetFlashModeToCameraControl();
        getCameraControl$1().setScreenFlash(this.mScreenFlashWrapper);
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig onMergeConfig(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        HashSet<GroupableFeature> hashSet = this.mFeatureGroup;
        boolean z = false;
        if (hashSet != null) {
            int i = 0;
            for (GroupableFeature groupableFeature : hashSet) {
                if (groupableFeature instanceof ImageFormatFeature) {
                    i = ((ImageFormatFeature) groupableFeature).imageCaptureOutputFormat;
                }
            }
            builder.getMutableConfig().insertOption(ImageCaptureConfig.OPTION_OUTPUT_FORMAT, Integer.valueOf(i));
        }
        if (cameraInfoInternal.getCameraQuirks().contains(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            MutableOptionsBundle mutableConfig = builder.getMutableConfig();
            AutoValue_Config_Option autoValue_Config_Option = ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(mutableConfig.retrieveOption(autoValue_Config_Option, bool2))) {
                StringUtilsKt.w("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                StringUtilsKt.i("ImageCapture", "Requesting software JPEG due to device quirk.");
                builder.getMutableConfig().insertOption(autoValue_Config_Option, bool2);
            }
        }
        MutableOptionsBundle mutableConfig2 = builder.getMutableConfig();
        Boolean bool3 = Boolean.TRUE;
        AutoValue_Config_Option autoValue_Config_Option2 = ImageCaptureConfig.OPTION_USE_SOFTWARE_JPEG_ENCODER;
        Boolean bool4 = Boolean.FALSE;
        if (bool3.equals(mutableConfig2.retrieveOption(autoValue_Config_Option2, bool4))) {
            if (getCamera() != null) {
                getCamera().getExtendedConfig().getSessionProcessor();
            }
            Integer num = (Integer) mutableConfig2.retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
            if (num == null || num.intValue() == 256) {
                z = true;
            } else {
                StringUtilsKt.w("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z) {
                StringUtilsKt.w("ImageCapture", "Unable to support software JPEG. Disabling.");
                mutableConfig2.insertOption(autoValue_Config_Option2, bool4);
            }
        }
        Integer num2 = (Integer) builder.getMutableConfig().retrieveOption(ImageCaptureConfig.OPTION_BUFFER_FORMAT, null);
        if (num2 != null) {
            if (getCamera() != null) {
                getCamera().getExtendedConfig().getSessionProcessor();
            }
            builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, Integer.valueOf(z ? 35 : num2.intValue()));
        } else {
            MutableOptionsBundle mutableConfig3 = builder.getMutableConfig();
            AutoValue_Config_Option autoValue_Config_Option3 = ImageCaptureConfig.OPTION_OUTPUT_FORMAT;
            if (Objects.equals(mutableConfig3.retrieveOption(autoValue_Config_Option3, null), 2)) {
                builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 32);
            } else if (Objects.equals(builder.getMutableConfig().retrieveOption(autoValue_Config_Option3, null), 3)) {
                builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 32);
                builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_SECONDARY_INPUT_FORMAT, 256);
            } else if (Objects.equals(builder.getMutableConfig().retrieveOption(autoValue_Config_Option3, null), 1)) {
                builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 4101);
                builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, DynamicRange.UNSPECIFIED);
            } else if (z) {
                builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 35);
            } else {
                List list = (List) builder.getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, null);
                if (list == null) {
                    builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 256);
                } else if (isImageFormatSupported(256, list)) {
                    builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 256);
                } else if (isImageFormatSupported(35, list)) {
                    builder.getMutableConfig().insertOption(ImageInputConfig.OPTION_INPUT_FORMAT, 35);
                }
            }
        }
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public final void onSessionStop() {
        ScreenFlashWrapper screenFlashWrapper = this.mScreenFlashWrapper;
        screenFlashWrapper.completePendingScreenFlashListener();
        screenFlashWrapper.completePendingScreenFlashClear();
        TakePictureManagerImpl takePictureManagerImpl = this.mTakePictureManager;
        if (takePictureManagerImpl != null) {
            takePictureManagerImpl.abortRequests();
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
        StringUtilsKt.d("ImageCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + autoValue_StreamSpec + ", secondaryStreamSpec " + autoValue_StreamSpec2);
        SessionConfig.Builder createPipeline = createPipeline(getCameraId(), (ImageCaptureConfig) this.mCurrentConfig, autoValue_StreamSpec);
        this.mSessionConfigBuilder = createPipeline;
        Object[] objArr = {createPipeline.build()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        updateSessionConfig(Collections.unmodifiableList(arrayList));
        this.mState = 1;
        notifyState();
        return autoValue_StreamSpec;
    }

    @Override // androidx.camera.core.UseCase
    public final void onUnbind() {
        ScreenFlashWrapper screenFlashWrapper = this.mScreenFlashWrapper;
        screenFlashWrapper.completePendingScreenFlashListener();
        screenFlashWrapper.completePendingScreenFlashClear();
        TakePictureManagerImpl takePictureManagerImpl = this.mTakePictureManager;
        if (takePictureManagerImpl != null) {
            takePictureManagerImpl.abortRequests();
        }
        clearPipeline(false);
        getCameraControl$1().setScreenFlash(null);
    }

    public final void takePicture(Executor executor, ContextKt contextKt) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            zzabp.mainThreadExecutor().execute(new AFd1wSDK$$ExternalSyntheticLambda2(3, this, executor, contextKt));
        } else {
            takePictureInternal(executor, contextKt, null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void takePictureInternal(Executor executor, ContextKt contextKt, FormBody.Builder builder, UseCaseGroup useCaseGroup) {
        Rect rect;
        int round;
        int i;
        int i2;
        int i3;
        ImageCaptureConfig imageCaptureConfig;
        AutoValue_Config_Option autoValue_Config_Option;
        int i4;
        Threads.checkMainThread();
        if (getFlashMode() == 3 && this.mScreenFlashWrapper.screenFlash == null) {
            a$$ExternalSyntheticBUOutline0.m$3("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
            return;
        }
        Log.d("ImageCapture", "takePictureInternal");
        CameraInternal camera = getCamera();
        Rect rect2 = null;
        if (camera == null || !this.mInSession) {
            ImageCaptureException imageCaptureException = new ImageCaptureException(4, "Not bound to a valid Camera [" + this + "]", null);
            if (contextKt != null) {
                contextKt.onError(imageCaptureException);
                return;
            } else {
                if (builder == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Must have either in-memory or on-disk callback.");
                    return;
                }
                SafeContinuation safeContinuation = (SafeContinuation) builder.names;
                Result.Companion companion = Result.Companion;
                safeContinuation.resumeWith(new Result(new Result.Failure(imageCaptureException)));
                return;
            }
        }
        boolean z = ((Integer) this.mCurrentConfig.retrieveOption(ImageInputConfig.OPTION_SECONDARY_INPUT_FORMAT, 0)).intValue() != 0;
        if (z && builder != null) {
            a$$ExternalSyntheticBUOutline0.m$3("Simultaneous capture RAW and JPEG needs two output file options");
            return;
        }
        TakePictureManagerImpl takePictureManagerImpl = this.mTakePictureManager;
        Objects.requireNonNull(takePictureManagerImpl);
        Rect rect3 = this.mViewPortCropRect;
        Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        Objects.requireNonNull(attachedSurfaceResolution);
        if (rect3 == null) {
            Rational rational = this.mCropAspectRatio;
            if (rational != null && rational.floatValue() > RecyclerView.DECELERATION_RATE && !rational.isNaN()) {
                CameraInternal camera2 = getCamera();
                Objects.requireNonNull(camera2);
                int relativeRotation = getRelativeRotation(camera2, false);
                Rational rational2 = new Rational(this.mCropAspectRatio.getDenominator(), this.mCropAspectRatio.getNumerator());
                if (!TransformUtils.is90or270(relativeRotation)) {
                    rational2 = this.mCropAspectRatio;
                }
                if (rational2 == null || rational2.floatValue() <= RecyclerView.DECELERATION_RATE || rational2.isNaN()) {
                    StringUtilsKt.w("ImageUtil", "Invalid view ratio.");
                } else {
                    int width = attachedSurfaceResolution.getWidth();
                    int height = attachedSurfaceResolution.getHeight();
                    float f = width;
                    float f2 = height;
                    float f3 = f / f2;
                    int numerator = rational2.getNumerator();
                    int denominator = rational2.getDenominator();
                    if (rational2.floatValue() > f3) {
                        int round2 = Math.round((f / numerator) * denominator);
                        i3 = (height - round2) / 2;
                        i2 = round2;
                        round = width;
                        i = 0;
                    } else {
                        round = Math.round((f2 / denominator) * numerator);
                        i = (width - round) / 2;
                        i2 = height;
                        i3 = 0;
                    }
                    rect2 = new Rect(i, i3, round + i, i2 + i3);
                }
                Objects.requireNonNull(rect2);
                rect = rect2;
                Matrix matrix = this.mSensorToBufferTransformMatrix;
                int relativeRotation2 = getRelativeRotation(camera, false);
                imageCaptureConfig = (ImageCaptureConfig) this.mCurrentConfig;
                autoValue_Config_Option = ImageCaptureConfig.OPTION_JPEG_COMPRESSION_QUALITY;
                if (imageCaptureConfig.containsOption(autoValue_Config_Option)) {
                    int i5 = this.mCaptureMode;
                    if (i5 == 0) {
                        i4 = 100;
                    } else {
                        if (i5 != 1 && i5 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i5, "CaptureMode ", " is invalid"));
                            return;
                        }
                        i4 = 95;
                    }
                } else {
                    i4 = ((Integer) imageCaptureConfig.retrieveOption(autoValue_Config_Option)).intValue();
                }
                int i6 = i4;
                List unmodifiableList = Collections.unmodifiableList(this.mSessionConfigBuilder.mSingleCameraCaptureCallbacks);
                TransactorKt.checkArgument("onDiskCallback and outputFileOptions should be both null or both non-null.", (builder != null) != (useCaseGroup != null));
                TransactorKt.checkArgument("One and only one on-disk or in-memory callback should be present.", (builder != null) ^ (contextKt == null));
                AutoValue_TakePictureRequest autoValue_TakePictureRequest = new AutoValue_TakePictureRequest(executor, contextKt, builder, useCaseGroup, rect, matrix, relativeRotation2, i6, this.mCaptureMode, z, unmodifiableList);
                if (z) {
                    Boolean bool = Boolean.FALSE;
                    HashMap hashMap = autoValue_TakePictureRequest.mFormatCaptureStatus;
                    hashMap.put(32, bool);
                    hashMap.put(256, bool);
                }
                Threads.checkMainThread();
                takePictureManagerImpl.mNewRequests.offer(autoValue_TakePictureRequest);
                takePictureManagerImpl.issueNextRequest();
            }
            rect3 = new Rect(0, 0, attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
        }
        rect = rect3;
        Matrix matrix2 = this.mSensorToBufferTransformMatrix;
        int relativeRotation22 = getRelativeRotation(camera, false);
        imageCaptureConfig = (ImageCaptureConfig) this.mCurrentConfig;
        autoValue_Config_Option = ImageCaptureConfig.OPTION_JPEG_COMPRESSION_QUALITY;
        if (imageCaptureConfig.containsOption(autoValue_Config_Option)) {
        }
        int i62 = i4;
        List unmodifiableList2 = Collections.unmodifiableList(this.mSessionConfigBuilder.mSingleCameraCaptureCallbacks);
        TransactorKt.checkArgument("onDiskCallback and outputFileOptions should be both null or both non-null.", (builder != null) != (useCaseGroup != null));
        TransactorKt.checkArgument("One and only one on-disk or in-memory callback should be present.", (builder != null) ^ (contextKt == null));
        AutoValue_TakePictureRequest autoValue_TakePictureRequest2 = new AutoValue_TakePictureRequest(executor, contextKt, builder, useCaseGroup, rect, matrix2, relativeRotation22, i62, this.mCaptureMode, z, unmodifiableList2);
        if (z) {
        }
        Threads.checkMainThread();
        takePictureManagerImpl.mNewRequests.offer(autoValue_TakePictureRequest2);
        takePictureManagerImpl.issueNextRequest();
    }

    public final String toString() {
        return "ImageCapture:".concat(getName());
    }

    public final void trySetFlashModeToCameraControl() {
        synchronized (this.mLockedFlashMode) {
            try {
                if (this.mLockedFlashMode.get() != null) {
                    return;
                }
                getCameraControl$1().setFlashMode(getFlashMode());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
