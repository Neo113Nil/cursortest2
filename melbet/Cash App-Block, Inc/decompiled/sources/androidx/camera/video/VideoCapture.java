package androidx.camera.video;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.camera2.compat.DynamicRangeProfilesCompat$DynamicRangeProfilesCompatImpl;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.core.AndroidImageProxy;
import androidx.camera.core.AutoValue_SurfaceRequest_TransformationInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.Preview$$ExternalSyntheticLambda2;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.impl.AutoValue_AttachedSurfaceInfo;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_VideoProfileProxy;
import androidx.camera.core.impl.AutoValue_SessionConfig_OutputConfig;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.core.processing.AutoValue_SurfaceProcessorNode_In;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceEdge$$ExternalSyntheticLambda3;
import androidx.camera.core.processing.util.AutoValue_OutConfig;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.impl.VideoCaptureConfig;
import androidx.camera.video.internal.AutoValue_VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import androidx.camera.video.internal.config.VideoConfigUtil;
import androidx.camera.video.internal.encoder.SwappedVideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl$$ExternalSyntheticLambda0;
import androidx.camera.video.internal.utils.DynamicRangeUtil;
import androidx.camera.view.PreviewView;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion;
import androidx.compose.foundation.text.selection.SelectionAdjustment$Companion$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.ButtonKt$Button$2;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.window.Api33Impl;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.credentials.CredentialProviderFactory;
import androidx.emoji2.text.MetadataRepo;
import androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda0;
import androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer;
import androidx.media3.exoplayer.mediacodec.LoudnessCodecController;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import androidx.work.impl.constraints.IndividualNetworkCallback;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.ViewTargetDisposable;
import com.android.volley.Response;
import com.braze.Braze$Companion$$ExternalSyntheticLambda21;
import com.bugsnag.android.TraceParser;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RegistryFactory;
import com.bumptech.glide.manager.SingletonConnectivityReceiver$2;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.GlideSuppliers$GlideSupplier;
import com.fillr.e0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.android.gms.internal.mlkit_genai_prompt.zzfq;
import com.google.android.gms.internal.mlkit_genai_prompt.zzhz;
import com.google.android.gms.internal.mlkit_genai_prompt.zzil;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda10;
import com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda12;
import com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda21;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.shaded.gson.internal.GsonTypes;
import com.nimbusds.jose.shaded.gson.internal.LinkedTreeMap;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper;
import com.nimbusds.jose.shaded.gson.reflect.TypeToken;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextInputGroupView;
import com.squareup.cash.moneybot.theme.MoneybotTheme;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.CashInsets;
import com.squareup.cash.ui.InsetsCollector;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.CameraXBinder;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;
import operations.ComparingOperation;
import org.intellij.markdown.ast.ASTUtilKt;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class VideoCapture extends UseCase {
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    public SurfaceEdge mCameraEdge;
    public SessionConfig.CloseableErrorListener mCloseableErrorListener;
    public Rect mCropRect;
    public DeferrableSurface mDeferrableSurface;
    public boolean mHasCompensatingTransformation;
    public MetadataRepo mNode;
    public int mRotationDegrees;
    public SessionConfig.Builder mSessionConfigBuilder;
    public int mSourceState;
    public SourceStreamRequirementObserver mSourceStreamRequirementObserver;
    public AutoValue_StreamInfo mStreamInfo;
    public final Recorder.AnonymousClass7 mStreamInfoObserver;
    public SurfaceRequest mSurfaceRequest;
    public CallbackToFutureAdapter$SafeFuture mSurfaceUpdateFuture;

    public final class Defaults {
        public static final VideoCaptureConfig DEFAULT_CONFIG;
        public static final Range DEFAULT_FPS_RANGE;
        public static final Range DEFAULT_HIGH_SPEED_FPS_RANGE;

        static {
            StreamUseCase streamUseCase = StreamUseCase.VIDEO_RECORD;
            VideoCapture$Defaults$$ExternalSyntheticLambda0 videoCapture$Defaults$$ExternalSyntheticLambda0 = new VideoCapture$Defaults$$ExternalSyntheticLambda0();
            DEFAULT_FPS_RANGE = new Range(30, 30);
            DEFAULT_HIGH_SPEED_FPS_RANGE = new Range(120, 120);
            Preview.Builder builder = new Preview.Builder(videoCapture$Defaults$$ExternalSyntheticLambda0);
            AutoValue_Config_Option autoValue_Config_Option = UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY;
            MutableOptionsBundle mutableOptionsBundle = builder.mMutableConfig;
            mutableOptionsBundle.insertOption(autoValue_Config_Option, 5);
            mutableOptionsBundle.insertOption(UseCaseConfig.OPTION_STREAM_USE_CASE, streamUseCase);
            mutableOptionsBundle.insertOption(VideoCaptureConfig.OPTION_VIDEO_ENCODER_INFO_FINDER, VideoEncoderInfoImpl.FINDER);
            mutableOptionsBundle.insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, DynamicRange.SDR);
            DEFAULT_CONFIG = new VideoCaptureConfig(OptionsBundle.from(mutableOptionsBundle));
        }
    }

    public final class SourceStreamRequirementObserver implements Observable.Observer {
        public CameraControlInternal mCameraControl;
        public boolean mIsSourceStreamRequired;

        public final void close() {
            TransactorKt.checkState("SourceStreamRequirementObserver can be closed from main thread only", Threads.isMainThread());
            StringUtilsKt.d("VideoCapture", "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.mIsSourceStreamRequired);
            CameraControlInternal cameraControlInternal = this.mCameraControl;
            if (cameraControlInternal == null) {
                StringUtilsKt.d("VideoCapture", "SourceStreamRequirementObserver#close: Already closed!");
                return;
            }
            if (this.mIsSourceStreamRequired) {
                this.mIsSourceStreamRequired = false;
                if (cameraControlInternal != null) {
                    cameraControlInternal.decrementVideoUsage();
                } else {
                    StringUtilsKt.d("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
                }
            }
            this.mCameraControl = null;
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public final void onError(Throwable th) {
            StringUtilsKt.w("VideoCapture", "SourceStreamRequirementObserver#onError", th);
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public final void onNewData(Object obj) {
            TransactorKt.checkState("SourceStreamRequirementObserver can be updated from main thread only", Threads.isMainThread());
            boolean equals = Boolean.TRUE.equals((Boolean) obj);
            if (this.mIsSourceStreamRequired == equals) {
                return;
            }
            this.mIsSourceStreamRequired = equals;
            CameraControlInternal cameraControlInternal = this.mCameraControl;
            if (cameraControlInternal == null) {
                StringUtilsKt.d("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
            } else if (equals) {
                cameraControlInternal.incrementVideoUsage();
            } else {
                cameraControlInternal.decrementVideoUsage();
            }
        }
    }

    public VideoCapture(VideoCaptureConfig videoCaptureConfig) {
        super(videoCaptureConfig);
        this.mStreamInfo = AutoValue_StreamInfo.STREAM_INFO_ANY_INACTIVE;
        this.mSessionConfigBuilder = new SessionConfig.Builder();
        this.mSurfaceUpdateFuture = null;
        this.mSourceState = 3;
        this.mHasCompensatingTransformation = false;
        this.mStreamInfoObserver = new Recorder.AnonymousClass7(this, 3);
    }

    public static void addBySupportedSize(HashSet hashSet, int i, int i2, Size size, VideoEncoderInfo videoEncoderInfo) {
        if (i > size.getWidth() || i2 > size.getHeight()) {
            return;
        }
        try {
            hashSet.add(new Size(i, ((Integer) videoEncoderInfo.getSupportedHeightsFor(i).clamp(Integer.valueOf(i2))).intValue()));
        } catch (IllegalArgumentException e) {
            StringUtilsKt.w("VideoCapture", "No supportedHeights for width: " + i, e);
        }
        try {
            hashSet.add(new Size(((Integer) videoEncoderInfo.getSupportedWidthsFor(i2).clamp(Integer.valueOf(i))).intValue(), i2));
        } catch (IllegalArgumentException e2) {
            StringUtilsKt.w("VideoCapture", "No supportedWidths for height: " + i2, e2);
        }
    }

    public static int align(boolean z, int i, int i2, Range range) {
        int i3 = i % i2;
        if (i3 != 0) {
            i = z ? i - i3 : i + (i2 - i3);
        }
        return ((Integer) range.clamp(Integer.valueOf(i))).intValue();
    }

    public static VideoEncoderInfo resolveVideoEncoderInfo(DynamicRange dynamicRange, MediaSpec mediaSpec, AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy) {
        VideoEncoderInfo find = VideoEncoderInfoImpl$$ExternalSyntheticLambda0.find(VideoConfigUtil.resolveVideoMimeInfo(dynamicRange, mediaSpec, autoValue_VideoValidatedEncoderProfilesProxy).mimeType);
        if (find != null) {
            return MoneybotTheme.from(find, autoValue_VideoValidatedEncoderProfilesProxy != null ? autoValue_VideoValidatedEncoderProfilesProxy.defaultVideoProfile.getResolution() : null);
        }
        StringUtilsKt.w("VideoCapture", "Can't find videoEncoderInfo");
        return null;
    }

    public final void applyStreamInfoAndStreamSpecToSessionConfigBuilder(SessionConfig.Builder builder, AutoValue_StreamInfo autoValue_StreamInfo, AutoValue_StreamSpec autoValue_StreamSpec) {
        DeferrableSurface deferrableSurface;
        boolean z = autoValue_StreamInfo.id == -1;
        boolean z2 = autoValue_StreamInfo.streamState == 1;
        if (z && z2) {
            a$$ExternalSyntheticBUOutline0.m$1("Unexpected stream state, stream is error but active");
            return;
        }
        builder.mOutputConfigs.clear();
        ((HashSet) builder.mCaptureConfigBuilder.logger).clear();
        DynamicRange dynamicRange = autoValue_StreamSpec.dynamicRange;
        if (!z && (deferrableSurface = this.mDeferrableSurface) != null) {
            if (z2) {
                builder.addSurface(deferrableSurface, dynamicRange, -1);
            } else {
                JWECryptoParts builder2 = AutoValue_SessionConfig_OutputConfig.builder(deferrableSurface);
                if (dynamicRange == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("Null dynamicRange");
                    return;
                } else {
                    builder2.authenticationTag = dynamicRange;
                    builder.mOutputConfigs.add(builder2.build());
                }
            }
        }
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = this.mSurfaceUpdateFuture;
        if (callbackToFutureAdapter$SafeFuture != null && callbackToFutureAdapter$SafeFuture.cancel(false)) {
            StringUtilsKt.d("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        CallbackToFutureAdapter$SafeFuture future = DBUtil.getFuture(new StreamSharing$$ExternalSyntheticLambda1(this, builder));
        this.mSurfaceUpdateFuture = future;
        Futures.addCallback(future, new AnonymousClass3(this, future, z2), zzabp.mainThreadExecutor());
    }

    public final void clearPipeline$4() {
        Threads.checkMainThread();
        SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
            this.mCloseableErrorListener = null;
        }
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
            this.mDeferrableSurface = null;
        }
        MetadataRepo metadataRepo = this.mNode;
        if (metadataRepo != null) {
            metadataRepo.release();
            this.mNode = null;
        }
        SurfaceEdge surfaceEdge = this.mCameraEdge;
        if (surfaceEdge != null) {
            surfaceEdge.close();
            this.mCameraEdge = null;
        }
        this.mCropRect = null;
        this.mSurfaceRequest = null;
        this.mStreamInfo = AutoValue_StreamInfo.STREAM_INFO_ANY_INACTIVE;
        this.mRotationDegrees = 0;
        this.mHasCompensatingTransformation = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SessionConfig.Builder createPipeline(VideoCaptureConfig videoCaptureConfig, AutoValue_StreamSpec autoValue_StreamSpec) {
        Object obj;
        CameraInternal cameraInternal;
        int i;
        DynamicRange dynamicRange;
        Rect rect;
        VideoEncoderInfo videoEncoderInfo;
        Size size;
        CameraInternal cameraInternal2;
        MetadataRepo metadataRepo;
        VideoCaptureConfig videoCaptureConfig2;
        Set set;
        VideoCapture videoCapture = this;
        Threads.checkMainThread();
        CameraInternal camera = videoCapture.getCamera();
        camera.getClass();
        Size size2 = autoValue_StreamSpec.resolution;
        Preview$$ExternalSyntheticLambda0 preview$$ExternalSyntheticLambda0 = new Preview$$ExternalSyntheticLambda0(videoCapture, 20);
        Range range = autoValue_StreamSpec.expectedFrameRateRange;
        if (Objects.equals(range, AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            range = autoValue_StreamSpec.sessionType == 1 ? Defaults.DEFAULT_HIGH_SPEED_FPS_RANGE : Defaults.DEFAULT_FPS_RANGE;
        }
        Range range2 = range;
        ListenableFuture fetchData = videoCapture.getOutput().getMediaSpec().fetchData();
        if (fetchData.isDone()) {
            try {
                obj = fetchData.get();
            } catch (InterruptedException | ExecutionException e) {
                OptionalProvider$$ExternalSyntheticLambda0.m(e);
                return null;
            }
        } else {
            obj = null;
        }
        MediaSpec mediaSpec = (MediaSpec) obj;
        Objects.requireNonNull(mediaSpec);
        int i2 = autoValue_StreamSpec.sessionType;
        EncoderProfilesResolver encoderProfilesResolver = videoCapture.getOutput().getEncoderProfilesResolver(i2, camera.getCameraInfo());
        DynamicRange dynamicRange2 = autoValue_StreamSpec.dynamicRange;
        encoderProfilesResolver.getClass();
        size2.getClass();
        dynamicRange2.getClass();
        CapabilitiesByQuality capabilities = encoderProfilesResolver.getCapabilities(dynamicRange2);
        AutoValue_VideoValidatedEncoderProfilesProxy findNearestHigherSupportedEncoderProfilesFor = capabilities != null ? capabilities.findNearestHigherSupportedEncoderProfilesFor(size2) : null;
        Objects.requireNonNull((VideoEncoderInfoImpl$$ExternalSyntheticLambda0) videoCaptureConfig.retrieveOption(VideoCaptureConfig.OPTION_VIDEO_ENCODER_INFO_FINDER));
        VideoEncoderInfo resolveVideoEncoderInfo = resolveVideoEncoderInfo(dynamicRange2, mediaSpec, findNearestHigherSupportedEncoderProfilesFor);
        videoCapture.mRotationDegrees = videoCapture.getCompensatedRotation(camera);
        Rect rect2 = videoCapture.mViewPortCropRect;
        if (rect2 == null) {
            rect2 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
        }
        if (resolveVideoEncoderInfo == null || resolveVideoEncoderInfo.isSizeSupportedAllowSwapping(rect2.width(), rect2.height())) {
            cameraInternal = camera;
            i = i2;
            dynamicRange = dynamicRange2;
        } else {
            cameraInternal = camera;
            StringUtilsKt.d("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", TransformUtils.rectToString(rect2), Integer.valueOf(resolveVideoEncoderInfo.getWidthAlignment()), Integer.valueOf(resolveVideoEncoderInfo.getHeightAlignment()), resolveVideoEncoderInfo.getSupportedWidths(), resolveVideoEncoderInfo.getSupportedHeights()));
            VideoEncoderInfo swappedVideoEncoderInfo = (!(resolveVideoEncoderInfo.getSupportedWidths().contains((Range) Integer.valueOf(rect2.width())) && resolveVideoEncoderInfo.getSupportedHeights().contains((Range) Integer.valueOf(rect2.height()))) && resolveVideoEncoderInfo.canSwapWidthHeight() && resolveVideoEncoderInfo.getSupportedHeights().contains((Range) Integer.valueOf(rect2.width())) && resolveVideoEncoderInfo.getSupportedWidths().contains((Range) Integer.valueOf(rect2.height()))) ? new SwappedVideoEncoderInfo(resolveVideoEncoderInfo) : resolveVideoEncoderInfo;
            int widthAlignment = swappedVideoEncoderInfo.getWidthAlignment();
            int heightAlignment = swappedVideoEncoderInfo.getHeightAlignment();
            Range supportedWidths = swappedVideoEncoderInfo.getSupportedWidths();
            Range supportedHeights = swappedVideoEncoderInfo.getSupportedHeights();
            i = i2;
            int align = align(true, rect2.width(), widthAlignment, supportedWidths);
            dynamicRange = dynamicRange2;
            int align2 = align(false, rect2.width(), widthAlignment, supportedWidths);
            int align3 = align(true, rect2.height(), heightAlignment, supportedHeights);
            int align4 = align(false, rect2.height(), heightAlignment, supportedHeights);
            HashSet hashSet = new HashSet();
            addBySupportedSize(hashSet, align, align3, size2, swappedVideoEncoderInfo);
            addBySupportedSize(hashSet, align, align4, size2, swappedVideoEncoderInfo);
            addBySupportedSize(hashSet, align2, align3, size2, swappedVideoEncoderInfo);
            addBySupportedSize(hashSet, align2, align4, size2, swappedVideoEncoderInfo);
            if (hashSet.isEmpty()) {
                StringUtilsKt.w("VideoCapture", "Can't find valid cropped size");
            } else {
                ArrayList arrayList = new ArrayList(hashSet);
                StringUtilsKt.d("VideoCapture", "candidatesList = " + arrayList);
                Collections.sort(arrayList, new VideoCapture$$ExternalSyntheticLambda6(rect2, 0));
                StringUtilsKt.d("VideoCapture", "sorted candidatesList = " + arrayList);
                Size size3 = (Size) arrayList.get(0);
                int width = size3.getWidth();
                int height = size3.getHeight();
                if (width == rect2.width() && height == rect2.height()) {
                    StringUtilsKt.d("VideoCapture", "No need to adjust cropRect because crop size is valid.");
                } else {
                    TransactorKt.checkState(null, width % 2 == 0 && height % 2 == 0 && width <= size2.getWidth() && height <= size2.getHeight());
                    Rect rect3 = new Rect(rect2);
                    if (width != rect2.width()) {
                        int max = Math.max(0, rect2.centerX() - (width / 2));
                        rect3.left = max;
                        int i3 = max + width;
                        rect3.right = i3;
                        if (i3 > size2.getWidth()) {
                            int width2 = size2.getWidth();
                            rect3.right = width2;
                            rect3.left = width2 - width;
                        }
                    }
                    if (height != rect2.height()) {
                        int max2 = Math.max(0, rect2.centerY() - (height / 2));
                        rect3.top = max2;
                        int i4 = max2 + height;
                        rect3.bottom = i4;
                        if (i4 > size2.getHeight()) {
                            int height2 = size2.getHeight();
                            rect3.bottom = height2;
                            rect3.top = height2 - height;
                        }
                    }
                    StringUtilsKt.d("VideoCapture", "Adjust cropRect from " + TransformUtils.rectToString(rect2) + " to " + TransformUtils.rectToString(rect3));
                    rect2 = rect3;
                }
            }
        }
        int i5 = videoCapture.mRotationDegrees;
        AutoValue_SurfaceRequest_TransformationInfo autoValue_SurfaceRequest_TransformationInfo = videoCapture.mStreamInfo.inProgressTransformationInfo;
        if (autoValue_SurfaceRequest_TransformationInfo != null) {
            autoValue_SurfaceRequest_TransformationInfo.getClass();
            Size rotateSize = TransformUtils.rotateSize(i5, TransformUtils.rectToSize(autoValue_SurfaceRequest_TransformationInfo.getCropRect));
            rect = new Rect(0, 0, rotateSize.getWidth(), rotateSize.getHeight());
        } else {
            rect = rect2;
        }
        videoCapture.mCropRect = rect;
        if (videoCapture.mStreamInfo.inProgressTransformationInfo == null || rect.equals(rect2)) {
            videoEncoderInfo = resolveVideoEncoderInfo;
            size = size2;
        } else {
            float height3 = rect.height() / rect2.height();
            videoEncoderInfo = resolveVideoEncoderInfo;
            size = new Size((int) Math.ceil(size2.getWidth() * height3), (int) Math.ceil(size2.getHeight() * height3));
        }
        if (videoCapture.mStreamInfo.inProgressTransformationInfo != null) {
            videoCapture.mHasCompensatingTransformation = true;
        }
        Rect rect4 = videoCapture.mCropRect;
        int i6 = videoCapture.mRotationDegrees;
        CameraInternal cameraInternal3 = cameraInternal;
        int i7 = i;
        DynamicRange dynamicRange3 = dynamicRange;
        boolean isCreateNodeNeeded = videoCapture.isCreateNodeNeeded(cameraInternal3, videoCaptureConfig, i7, rect4, size2, dynamicRange3);
        if (((SizeCannotEncodeVideoQuirk) DeviceQuirks.sQuirks.get(SizeCannotEncodeVideoQuirk.class)) != null) {
            if (!isCreateNodeNeeded) {
                i6 = 0;
            }
            Size rotateSize2 = TransformUtils.rotateSize(i6, TransformUtils.rectToSize(rect4));
            if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) {
                cameraInternal2 = cameraInternal3;
                set = new HashSet(Collections.singletonList(new Size(720, 1280)));
            } else {
                cameraInternal2 = cameraInternal3;
                set = Collections.EMPTY_SET;
            }
            if (set.contains(rotateSize2)) {
                int heightAlignment2 = videoEncoderInfo != null ? videoEncoderInfo.getHeightAlignment() / 2 : 8;
                Rect rect5 = new Rect(rect4);
                if (rect4.width() == rotateSize2.getHeight()) {
                    rect5.left += heightAlignment2;
                    rect5.right -= heightAlignment2;
                } else {
                    rect5.top += heightAlignment2;
                    rect5.bottom -= heightAlignment2;
                }
                rect4 = rect5;
            }
        } else {
            cameraInternal2 = cameraInternal3;
        }
        videoCapture.mCropRect = rect4;
        CameraInternal cameraInternal4 = cameraInternal2;
        if (videoCapture.isCreateNodeNeeded(cameraInternal4, videoCaptureConfig, i7, rect4, size2, dynamicRange3)) {
            StringUtilsKt.d("VideoCapture", "Surface processing is enabled.");
            CameraInternal camera2 = videoCapture.getCamera();
            Objects.requireNonNull(camera2);
            metadataRepo = new MetadataRepo(camera2, new DefaultSurfaceProcessor(dynamicRange3), "VideoCapture");
        } else {
            metadataRepo = null;
        }
        videoCapture.mNode = metadataRepo;
        boolean z = (cameraInternal4.getHasTransform() && videoCapture.mNode == null) ? false : true;
        Timebase timebase = (videoCapture.mNode == null && cameraInternal4.getHasTransform()) ? Timebase.UPTIME : cameraInternal4.getCameraInfoInternal().getTimebase();
        StringUtilsKt.d("VideoCapture", "camera timebase = " + cameraInternal4.getCameraInfoInternal().getTimebase() + ", processing timebase = " + timebase);
        SubtreeManager builder = autoValue_StreamSpec.toBuilder();
        builder.snapshotCache = size;
        if (range2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null expectedFrameRateRange");
            return null;
        }
        builder.interceptor = range2;
        AutoValue_StreamSpec build = builder.build();
        TransactorKt.checkState(null, videoCapture.mCameraEdge == null);
        SurfaceEdge surfaceEdge = new SurfaceEdge(2, 34, build, videoCapture.mSensorToBufferTransformMatrix, cameraInternal4.getHasTransform(), videoCapture.mCropRect, videoCapture.mRotationDegrees, videoCapture.getAppTargetRotation(), cameraInternal4.getHasTransform() && videoCapture.isMirroringRequired(cameraInternal4));
        videoCapture.mCameraEdge = surfaceEdge;
        surfaceEdge.addOnInvalidatedListener(preview$$ExternalSyntheticLambda0);
        MetadataRepo metadataRepo2 = videoCapture.mNode;
        SurfaceEdge surfaceEdge2 = videoCapture.mCameraEdge;
        if (metadataRepo2 != null) {
            int i8 = surfaceEdge2.mTargets;
            int i9 = surfaceEdge2.mFormat;
            Rect rect6 = surfaceEdge2.mCropRect;
            AutoValue_OutConfig autoValue_OutConfig = new AutoValue_OutConfig(UUID.randomUUID(), i8, i9, rect6, TransformUtils.rotateSize(surfaceEdge2.mRotationDegrees, TransformUtils.rectToSize(rect6)), surfaceEdge2.mRotationDegrees, surfaceEdge2.mMirroring);
            SurfaceEdge surfaceEdge3 = (SurfaceEdge) videoCapture.mNode.transform(new AutoValue_SurfaceProcessorNode_In(videoCapture.mCameraEdge, Collections.singletonList(autoValue_OutConfig))).get(autoValue_OutConfig);
            Objects.requireNonNull(surfaceEdge3);
            VideoCapture$$ExternalSyntheticLambda2 videoCapture$$ExternalSyntheticLambda2 = new VideoCapture$$ExternalSyntheticLambda2(this, surfaceEdge3, cameraInternal4, videoCaptureConfig, timebase, z, 0);
            videoCapture = this;
            videoCaptureConfig2 = videoCaptureConfig;
            surfaceEdge3.addOnInvalidatedListener(videoCapture$$ExternalSyntheticLambda2);
            videoCapture.mSurfaceRequest = surfaceEdge3.createSurfaceRequest(cameraInternal4, true);
            SurfaceEdge surfaceEdge4 = videoCapture.mCameraEdge;
            surfaceEdge4.getClass();
            Threads.checkMainThread();
            surfaceEdge4.checkNotClosed();
            TransactorKt.checkState("Consumer can only be linked once.", !surfaceEdge4.mHasConsumer);
            surfaceEdge4.mHasConsumer = true;
            SurfaceEdge.SettableSurface settableSurface = surfaceEdge4.mSettableSurface;
            videoCapture.mDeferrableSurface = settableSurface;
            Futures.nonCancellationPropagating(settableSurface.mTerminationFuture).addListener(new Recorder$$ExternalSyntheticLambda15(8, videoCapture, settableSurface), zzabp.mainThreadExecutor());
        } else {
            videoCaptureConfig2 = videoCaptureConfig;
            SurfaceRequest createSurfaceRequest = surfaceEdge2.createSurfaceRequest(cameraInternal4, true);
            videoCapture.mSurfaceRequest = createSurfaceRequest;
            videoCapture.mDeferrableSurface = createSurfaceRequest.mInternalDeferrableSurface;
        }
        VideoOutput videoOutput = (VideoOutput) videoCaptureConfig2.retrieveOption(VideoCaptureConfig.OPTION_VIDEO_OUTPUT);
        Objects.requireNonNull(videoOutput);
        videoOutput.onSurfaceRequested(videoCapture.mSurfaceRequest, timebase, z);
        videoCapture.sendTransformationInfoIfReady$1();
        videoCapture.mDeferrableSurface.mContainerClass = MediaCodec.class;
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(videoCaptureConfig2, autoValue_StreamSpec.resolution);
        createFrom.mSessionType = i7;
        videoCapture.applyExpectedFrameRateRange(createFrom, autoValue_StreamSpec);
        int videoStabilizationMode = videoCaptureConfig2.getVideoStabilizationMode();
        if (videoStabilizationMode != 0) {
            TraceParser traceParser = createFrom.mCaptureConfigBuilder;
            traceParser.getClass();
            if (videoStabilizationMode != 0) {
                ((MutableOptionsBundle) traceParser.projectPackages).insertOption(UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, Integer.valueOf(videoStabilizationMode));
            }
        }
        SessionConfig.CloseableErrorListener closeableErrorListener = videoCapture.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new Preview$$ExternalSyntheticLambda2(videoCapture, 3));
        videoCapture.mCloseableErrorListener = closeableErrorListener2;
        createFrom.mErrorListener = closeableErrorListener2;
        Config config = autoValue_StreamSpec.implementationOptions;
        if (config != null) {
            createFrom.mCaptureConfigBuilder.addImplementationOptions(config);
        }
        return createFrom;
    }

    public final int getCompensatedRotation(CameraInternal cameraInternal) {
        boolean isMirroringRequired = isMirroringRequired(cameraInternal);
        int relativeRotation = getRelativeRotation(cameraInternal, isMirroringRequired);
        AutoValue_SurfaceRequest_TransformationInfo autoValue_SurfaceRequest_TransformationInfo = this.mStreamInfo.inProgressTransformationInfo;
        if (autoValue_SurfaceRequest_TransformationInfo == null) {
            return relativeRotation;
        }
        Objects.requireNonNull(autoValue_SurfaceRequest_TransformationInfo);
        int i = autoValue_SurfaceRequest_TransformationInfo.getRotationDegrees;
        if (isMirroringRequired != autoValue_SurfaceRequest_TransformationInfo.isMirroring) {
            i = -i;
        }
        return TransformUtils.within360(relativeRotation - i);
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig getDefaultConfig(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        DEFAULT_CONFIG.getClass();
        VideoCaptureConfig videoCaptureConfig = Defaults.DEFAULT_CONFIG;
        Config config = useCaseConfigFactory.getConfig(videoCaptureConfig.getCaptureType(), 1);
        if (z) {
            config = Config.mergeConfigs(config, videoCaptureConfig);
        }
        if (config == null) {
            return null;
        }
        return new VideoCaptureConfig(OptionsBundle.from(((Preview.Builder) getUseCaseConfigBuilder(config)).mMutableConfig));
    }

    public final QualitySelector getFeatureGroupQualitySelector() {
        HashSet<GroupableFeature> hashSet = this.mFeatureGroup;
        if (hashSet == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (GroupableFeature groupableFeature : hashSet) {
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        QualitySelector qualitySelector = QualitySelector.NONE;
        return QualitySelector.fromOrderedList(arrayList, AutoValue_FallbackStrategy_RuleStrategy.NONE);
    }

    public final VideoOutput getOutput() {
        VideoOutput videoOutput = (VideoOutput) ((VideoCaptureConfig) this.mCurrentConfig).retrieveOption(VideoCaptureConfig.OPTION_VIDEO_OUTPUT);
        Objects.requireNonNull(videoOutput);
        return videoOutput;
    }

    @Override // androidx.camera.core.UseCase
    public final Set getSupportedDynamicRanges(CameraInfoInternal cameraInfoInternal) {
        return getOutput().getMediaCapabilities(0, cameraInfoInternal).getSupportedDynamicRanges();
    }

    @Override // androidx.camera.core.UseCase
    public final Set getSupportedEffectTargets() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig.Builder getUseCaseConfigBuilder(Config config) {
        return new Preview.Builder(MutableOptionsBundle.from(config), 3);
    }

    @Override // androidx.camera.core.UseCase
    public final boolean isAutoRotationSupported() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r5 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r5.booleanValue() != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isCreateNodeNeeded(CameraInternal cameraInternal, VideoCaptureConfig videoCaptureConfig, int i, Rect rect, Size size, DynamicRange dynamicRange) {
        if (i == 1) {
            return false;
        }
        if (cameraInternal.getHasTransform()) {
            Boolean bool = (Boolean) videoCaptureConfig.retrieveOption(VideoCaptureConfig.OPTION_FORCE_ENABLE_SURFACE_PROCESSING, Boolean.FALSE);
            Objects.requireNonNull(bool);
        }
        if (!cameraInternal.getHasTransform() || (!SurfaceProcessingQuirk.workaroundBySurfaceProcessing(DeviceQuirks.sQuirks) && !SurfaceProcessingQuirk.workaroundBySurfaceProcessing(cameraInternal.getCameraInfoInternal().getCameraQuirks()))) {
            HdrRepeatingRequestFailureQuirk hdrRepeatingRequestFailureQuirk = (HdrRepeatingRequestFailureQuirk) DeviceQuirks.sQuirks.get(HdrRepeatingRequestFailureQuirk.class);
            if (cameraInternal.getHasTransform() && hdrRepeatingRequestFailureQuirk != null) {
                boolean z = dynamicRange != DynamicRange.SDR;
                if ("samsung".equalsIgnoreCase(Build.BRAND)) {
                    if ("pa3q".equalsIgnoreCase(Build.DEVICE)) {
                    }
                }
            }
            if (size.getWidth() == rect.width() && size.getHeight() == rect.height()) {
                return (cameraInternal.getHasTransform() && isMirroringRequired(cameraInternal)) || this.mStreamInfo.inProgressTransformationInfo != null;
            }
        }
        return true;
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig onMergeConfig(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        Object obj;
        MediaSpec mediaSpec;
        EncoderProfilesResolver encoderProfilesResolver;
        Range range;
        int i;
        ArrayList<AutoValue_Quality_ConstantQuality> arrayList;
        MediaSpec mediaSpec2;
        List supportedResolutions;
        LinkedHashMap linkedHashMap;
        MediaSpec mediaSpec3;
        VideoEncoderInfo videoEncoderInfo;
        Map.Entry entry;
        Iterator it;
        ListenableFuture fetchData = getOutput().getMediaSpec().fetchData();
        if (fetchData.isDone()) {
            try {
                obj = fetchData.get();
            } catch (InterruptedException | ExecutionException e) {
                OptionalProvider$$ExternalSyntheticLambda0.m(e);
                return null;
            }
        } else {
            obj = null;
        }
        MediaSpec mediaSpec4 = (MediaSpec) obj;
        if (mediaSpec4 == null) {
            a$$ExternalSyntheticBUOutline0.m$3("MediaSpec can't be null");
            return null;
        }
        VideoSpec videoSpec = mediaSpec4.videoSpec;
        QualitySelector featureGroupQualitySelector = getFeatureGroupQualitySelector();
        if (featureGroupQualitySelector == null) {
            featureGroupQualitySelector = videoSpec.qualitySelector;
        }
        VideoCaptureConfig videoCaptureConfig = (VideoCaptureConfig) builder.getUseCaseConfig();
        if (videoCaptureConfig.containsOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS)) {
            TransactorKt.checkArgument("Custom ordered resolutions and QualitySelector can't both be set", getOutput().isQualitySelectorDefault());
            TransactorKt.checkArgument("Can't set both custom ordered resolutions and QualitySelector  through a groupable feature (e.g. GroupableFeatures.UHD_RECORDING)", getFeatureGroupQualitySelector() == null);
        } else {
            DynamicRange dynamicRange = videoCaptureConfig.getDynamicRange();
            int intValue = ((Integer) videoCaptureConfig.retrieveOption(UseCaseConfig.OPTION_SESSION_TYPE, 0)).intValue();
            Range range2 = (Range) videoCaptureConfig.retrieveOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE, AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
            Objects.requireNonNull(range2);
            VideoCapabilities mediaCapabilities = getOutput().getMediaCapabilities(intValue, cameraInfoInternal);
            EncoderProfilesResolver encoderProfilesResolver2 = getOutput().getEncoderProfilesResolver(intValue, cameraInfoInternal);
            StringUtilsKt.d("VideoCapture", "Update custom order resolutions: requestedDynamicRange = " + dynamicRange + ", sessionType = " + intValue + ", targetFrameRate = " + range2);
            List supportedQualities = mediaCapabilities.getSupportedQualities(dynamicRange);
            StringBuilder sb = new StringBuilder("supportedQualities = ");
            sb.append(supportedQualities);
            StringUtilsKt.d("VideoCapture", sb.toString());
            if (supportedQualities.isEmpty() && intValue == 1) {
                a$$ExternalSyntheticBUOutline0.m$3("No supported quality on the device for high-speed capture.");
                return null;
            }
            if (supportedQualities.isEmpty()) {
                StringUtilsKt.w("VideoCapture", "Can't find any supported quality on the device.");
            } else {
                featureGroupQualitySelector.getClass();
                if (supportedQualities.isEmpty()) {
                    StringUtilsKt.w("QualitySelector", "No supported quality on the device.");
                    arrayList = new ArrayList();
                    mediaSpec = mediaSpec4;
                    i = intValue;
                    range = range2;
                    encoderProfilesResolver = encoderProfilesResolver2;
                } else {
                    StringUtilsKt.d("QualitySelector", "supportedQualities = " + supportedQualities);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = featureGroupQualitySelector.mPreferredQualityList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality = (AutoValue_Quality_ConstantQuality) it2.next();
                        Iterator it3 = it2;
                        if (autoValue_Quality_ConstantQuality == AutoValue_Quality_ConstantQuality.HIGHEST) {
                            linkedHashSet.addAll(supportedQualities);
                            break;
                        }
                        if (autoValue_Quality_ConstantQuality == AutoValue_Quality_ConstantQuality.LOWEST) {
                            ArrayList arrayList2 = new ArrayList(supportedQualities);
                            Collections.reverse(arrayList2);
                            linkedHashSet.addAll(arrayList2);
                            break;
                        }
                        if (supportedQualities.contains(autoValue_Quality_ConstantQuality)) {
                            linkedHashSet.add(autoValue_Quality_ConstantQuality);
                            mediaSpec2 = mediaSpec4;
                        } else {
                            mediaSpec2 = mediaSpec4;
                            StringUtilsKt.w("QualitySelector", "quality is not supported and will be ignored: " + autoValue_Quality_ConstantQuality);
                        }
                        it2 = it3;
                        mediaSpec4 = mediaSpec2;
                    }
                    mediaSpec = mediaSpec4;
                    AutoValue_FallbackStrategy_RuleStrategy autoValue_FallbackStrategy_RuleStrategy = featureGroupQualitySelector.mFallbackStrategy;
                    if (!supportedQualities.isEmpty() && !linkedHashSet.containsAll(supportedQualities)) {
                        StringUtilsKt.d("QualitySelector", "Select quality by fallbackStrategy = " + autoValue_FallbackStrategy_RuleStrategy);
                        if (autoValue_FallbackStrategy_RuleStrategy != AutoValue_FallbackStrategy_RuleStrategy.NONE) {
                            TransactorKt.checkState("Currently only support type RuleStrategy", autoValue_FallbackStrategy_RuleStrategy instanceof AutoValue_FallbackStrategy_RuleStrategy);
                            ArrayList arrayList3 = new ArrayList(AutoValue_Quality_ConstantQuality.QUALITIES_ORDER_BY_SIZE);
                            AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality2 = autoValue_FallbackStrategy_RuleStrategy.fallbackQuality;
                            encoderProfilesResolver = encoderProfilesResolver2;
                            if (autoValue_Quality_ConstantQuality2 == AutoValue_Quality_ConstantQuality.HIGHEST) {
                                autoValue_Quality_ConstantQuality2 = (AutoValue_Quality_ConstantQuality) arrayList3.get(0);
                            } else if (autoValue_Quality_ConstantQuality2 == AutoValue_Quality_ConstantQuality.LOWEST) {
                                autoValue_Quality_ConstantQuality2 = (AutoValue_Quality_ConstantQuality) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, arrayList3);
                            }
                            int indexOf = arrayList3.indexOf(autoValue_Quality_ConstantQuality2);
                            TransactorKt.checkState(null, indexOf != -1);
                            ArrayList arrayList4 = new ArrayList();
                            int i2 = indexOf - 1;
                            while (i2 >= 0) {
                                int i3 = i2;
                                AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality3 = (AutoValue_Quality_ConstantQuality) arrayList3.get(i2);
                                if (supportedQualities.contains(autoValue_Quality_ConstantQuality3)) {
                                    arrayList4.add(autoValue_Quality_ConstantQuality3);
                                }
                                i2 = i3 - 1;
                            }
                            ArrayList arrayList5 = new ArrayList();
                            range = range2;
                            i = intValue;
                            for (int i4 = indexOf + 1; i4 < arrayList3.size(); i4++) {
                                AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality4 = (AutoValue_Quality_ConstantQuality) arrayList3.get(i4);
                                if (supportedQualities.contains(autoValue_Quality_ConstantQuality4)) {
                                    arrayList5.add(autoValue_Quality_ConstantQuality4);
                                }
                            }
                            StringUtilsKt.d("QualitySelector", "sizeSortedQualities = " + arrayList3 + ", fallback quality = " + autoValue_Quality_ConstantQuality2 + ", largerQualities = " + arrayList4 + ", smallerQualities = " + arrayList5);
                            int i5 = autoValue_FallbackStrategy_RuleStrategy.fallbackRule;
                            if (i5 != 0) {
                                if (i5 == 1) {
                                    linkedHashSet.addAll(arrayList4);
                                    linkedHashSet.addAll(arrayList5);
                                } else if (i5 == 2) {
                                    linkedHashSet.addAll(arrayList4);
                                } else {
                                    if (i5 != 3) {
                                        ZslControlImpl$$ExternalSyntheticLambda1.m(autoValue_FallbackStrategy_RuleStrategy, "Unhandled fallback strategy: ");
                                        return null;
                                    }
                                    linkedHashSet.addAll(arrayList5);
                                    linkedHashSet.addAll(arrayList4);
                                }
                            }
                            arrayList = new ArrayList(linkedHashSet);
                        }
                    }
                    i = intValue;
                    range = range2;
                    encoderProfilesResolver = encoderProfilesResolver2;
                    arrayList = new ArrayList(linkedHashSet);
                }
                StringUtilsKt.d("VideoCapture", "Found selectedQualities " + arrayList + " by " + featureGroupQualitySelector);
                if (arrayList.isEmpty()) {
                    a$$ExternalSyntheticBUOutline0.m$3("Unable to find selected quality");
                    return null;
                }
                Objects.requireNonNull((VideoEncoderInfoImpl$$ExternalSyntheticLambda0) videoCaptureConfig.retrieveOption(VideoCaptureConfig.OPTION_VIDEO_ENCODER_INFO_FINDER));
                int i6 = videoSpec.aspectRatio;
                HashMap hashMap = new HashMap();
                for (AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality5 : mediaCapabilities.getSupportedQualities(dynamicRange)) {
                    Size resolution = mediaCapabilities.getResolution(autoValue_Quality_ConstantQuality5, dynamicRange);
                    Objects.requireNonNull(resolution);
                    hashMap.put(autoValue_Quality_ConstantQuality5, resolution);
                }
                int i7 = i;
                if (i7 == 1) {
                    Range range3 = range;
                    supportedResolutions = AutoValue_StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED.equals(range3) ? cameraInfoInternal.getSupportedHighSpeedResolutions() : cameraInfoInternal.getSupportedHighSpeedResolutionsFor(range3);
                } else {
                    supportedResolutions = cameraInfoInternal.getSupportedResolutions(this.mCurrentConfig.getInputFormat());
                }
                QualityRatioToResolutionsTable qualityRatioToResolutionsTable = new QualityRatioToResolutionsTable(supportedResolutions, hashMap);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality6 : arrayList) {
                    List list = (List) qualityRatioToResolutionsTable.mTable.get(new AutoValue_QualityRatioToResolutionsTable_QualityRatio(autoValue_Quality_ConstantQuality6, i6));
                    linkedHashMap2.put(autoValue_Quality_ConstantQuality6, list != null ? new ArrayList(list) : new ArrayList(0));
                }
                if (linkedHashMap2.isEmpty()) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    linkedHashMap = new LinkedHashMap();
                    Iterator it4 = linkedHashMap2.entrySet().iterator();
                    while (it4.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it4.next();
                        ArrayList arrayList6 = new ArrayList((Collection) entry2.getValue());
                        Iterator it5 = arrayList6.iterator();
                        while (it5.hasNext()) {
                            Size size = (Size) it5.next();
                            if (!hashMap.containsValue(size)) {
                                encoderProfilesResolver.getClass();
                                size.getClass();
                                EncoderProfilesResolver encoderProfilesResolver3 = encoderProfilesResolver;
                                CapabilitiesByQuality capabilities = encoderProfilesResolver3.getCapabilities(dynamicRange);
                                AutoValue_VideoValidatedEncoderProfilesProxy findNearestHigherSupportedEncoderProfilesFor = capabilities != null ? capabilities.findNearestHigherSupportedEncoderProfilesFor(size) : null;
                                if (findNearestHigherSupportedEncoderProfilesFor == null) {
                                    encoderProfilesResolver = encoderProfilesResolver3;
                                } else {
                                    if (dynamicRange.isFullySpecified()) {
                                        mediaSpec3 = mediaSpec;
                                        videoEncoderInfo = resolveVideoEncoderInfo(dynamicRange, mediaSpec3, findNearestHigherSupportedEncoderProfilesFor);
                                    } else {
                                        mediaSpec3 = mediaSpec;
                                        int i8 = Integer.MIN_VALUE;
                                        VideoEncoderInfo videoEncoderInfo2 = null;
                                        for (AutoValue_EncoderProfilesProxy_VideoProfileProxy autoValue_EncoderProfilesProxy_VideoProfileProxy : findNearestHigherSupportedEncoderProfilesFor.videoProfiles) {
                                            HashMap hashMap2 = hashMap;
                                            Iterator it6 = it4;
                                            if (DynamicRangeUtil.isHdrSettingsMatched(autoValue_EncoderProfilesProxy_VideoProfileProxy, dynamicRange)) {
                                                entry = entry2;
                                                int i9 = autoValue_EncoderProfilesProxy_VideoProfileProxy.hdrFormat;
                                                HashMap hashMap3 = DynamicRangeUtil.VP_TO_DR_FORMAT_MAP;
                                                it = it5;
                                                TransactorKt.checkArgument(hashMap3.containsKey(Integer.valueOf(i9)));
                                                Integer num = (Integer) hashMap3.get(Integer.valueOf(i9));
                                                Objects.requireNonNull(num);
                                                int intValue2 = num.intValue();
                                                int i10 = autoValue_EncoderProfilesProxy_VideoProfileProxy.bitDepth;
                                                HashMap hashMap4 = DynamicRangeUtil.VP_TO_DR_BIT_DEPTH;
                                                TransactorKt.checkArgument(hashMap4.containsKey(Integer.valueOf(i10)));
                                                Integer num2 = (Integer) hashMap4.get(Integer.valueOf(i10));
                                                Objects.requireNonNull(num2);
                                                VideoEncoderInfo resolveVideoEncoderInfo = resolveVideoEncoderInfo(new DynamicRange(intValue2, num2.intValue()), mediaSpec3, findNearestHigherSupportedEncoderProfilesFor);
                                                if (resolveVideoEncoderInfo != null) {
                                                    int intValue3 = ((Integer) resolveVideoEncoderInfo.getSupportedWidths().getUpper()).intValue();
                                                    int intValue4 = ((Integer) resolveVideoEncoderInfo.getSupportedHeights().getUpper()).intValue();
                                                    Size size2 = SizeUtil.RESOLUTION_ZERO;
                                                    int i11 = intValue3 * intValue4;
                                                    if (i11 > i8) {
                                                        videoEncoderInfo2 = resolveVideoEncoderInfo;
                                                        i8 = i11;
                                                    }
                                                }
                                            } else {
                                                entry = entry2;
                                                it = it5;
                                            }
                                            it4 = it6;
                                            entry2 = entry;
                                            hashMap = hashMap2;
                                            it5 = it;
                                        }
                                        videoEncoderInfo = videoEncoderInfo2;
                                    }
                                    HashMap hashMap5 = hashMap;
                                    Iterator it7 = it4;
                                    Map.Entry entry3 = entry2;
                                    Iterator it8 = it5;
                                    if (videoEncoderInfo != null && !videoEncoderInfo.isSizeSupportedAllowSwapping(size.getWidth(), size.getHeight())) {
                                        it8.remove();
                                    }
                                    it4 = it7;
                                    entry2 = entry3;
                                    encoderProfilesResolver = encoderProfilesResolver3;
                                    hashMap = hashMap5;
                                    it5 = it8;
                                    mediaSpec = mediaSpec3;
                                }
                            }
                        }
                        HashMap hashMap6 = hashMap;
                        Iterator it9 = it4;
                        Map.Entry entry4 = entry2;
                        EncoderProfilesResolver encoderProfilesResolver4 = encoderProfilesResolver;
                        MediaSpec mediaSpec5 = mediaSpec;
                        if (!arrayList6.isEmpty()) {
                            linkedHashMap.put((AutoValue_Quality_ConstantQuality) entry4.getKey(), arrayList6);
                        }
                        it4 = it9;
                        encoderProfilesResolver = encoderProfilesResolver4;
                        mediaSpec = mediaSpec5;
                        hashMap = hashMap6;
                    }
                }
                EncoderProfilesResolver encoderProfilesResolver5 = encoderProfilesResolver;
                if (i7 == 1) {
                    MutableOptionsBundle mutableConfig = builder.getMutableConfig();
                    AutoValue_Config_Option autoValue_Config_Option = UseCaseConfig.OPTION_RESOLUTION_TO_MAX_FRAME_RATES;
                    HashMap hashMap7 = new HashMap();
                    for (Map.Entry entry5 : linkedHashMap.entrySet()) {
                        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality7 = (AutoValue_Quality_ConstantQuality) entry5.getKey();
                        encoderProfilesResolver5.getClass();
                        autoValue_Quality_ConstantQuality7.getClass();
                        CapabilitiesByQuality capabilities2 = encoderProfilesResolver5.getCapabilities(dynamicRange);
                        AutoValue_VideoValidatedEncoderProfilesProxy profiles = capabilities2 != null ? capabilities2.getProfiles(autoValue_Quality_ConstantQuality7) : null;
                        Objects.requireNonNull(profiles);
                        int i12 = profiles.defaultVideoProfile.frameRate;
                        Iterator it10 = ((List) entry5.getValue()).iterator();
                        while (it10.hasNext()) {
                            hashMap7.put((Size) it10.next(), Integer.valueOf(i12));
                        }
                    }
                    mutableConfig.insertOption(autoValue_Config_Option, hashMap7);
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it11 = linkedHashMap.values().iterator();
                while (it11.hasNext()) {
                    arrayList7.addAll((List) it11.next());
                }
                StringUtilsKt.d("VideoCapture", "Set custom ordered resolutions = " + arrayList7);
                builder.getMutableConfig().insertOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, arrayList7);
            }
        }
        return builder.getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    public final void onSessionStart() {
        this.mInSession = true;
        StringUtilsKt.d("VideoCapture", "VideoCapture#onStateAttached: cameraID = " + getCameraId());
        AutoValue_StreamSpec autoValue_StreamSpec = this.mAttachedStreamSpec;
        if (autoValue_StreamSpec == null || this.mSurfaceRequest != null) {
            return;
        }
        Observable streamInfo = getOutput().getStreamInfo();
        Object obj = AutoValue_StreamInfo.STREAM_INFO_ANY_INACTIVE;
        ListenableFuture fetchData = streamInfo.fetchData();
        if (fetchData.isDone()) {
            try {
                obj = fetchData.get();
            } catch (InterruptedException | ExecutionException e) {
                OptionalProvider$$ExternalSyntheticLambda0.m(e);
                return;
            }
        }
        this.mStreamInfo = (AutoValue_StreamInfo) obj;
        SessionConfig.Builder createPipeline = createPipeline((VideoCaptureConfig) this.mCurrentConfig, autoValue_StreamSpec);
        this.mSessionConfigBuilder = createPipeline;
        applyStreamInfoAndStreamSpecToSessionConfigBuilder(createPipeline, this.mStreamInfo, autoValue_StreamSpec);
        Object[] objArr = {this.mSessionConfigBuilder.build()};
        ArrayList arrayList = new ArrayList(1);
        Object obj2 = objArr[0];
        Objects.requireNonNull(obj2);
        arrayList.add(obj2);
        updateSessionConfig(Collections.unmodifiableList(arrayList));
        this.mState = 1;
        notifyState();
        getOutput().getStreamInfo().addObserver(zzabp.mainThreadExecutor(), this.mStreamInfoObserver);
        SourceStreamRequirementObserver sourceStreamRequirementObserver = this.mSourceStreamRequirementObserver;
        if (sourceStreamRequirementObserver != null) {
            sourceStreamRequirementObserver.close();
        }
        CameraControlInternal cameraControl$1 = getCameraControl$1();
        SourceStreamRequirementObserver sourceStreamRequirementObserver2 = new SourceStreamRequirementObserver();
        sourceStreamRequirementObserver2.mIsSourceStreamRequired = false;
        sourceStreamRequirementObserver2.mCameraControl = cameraControl$1;
        this.mSourceStreamRequirementObserver = sourceStreamRequirementObserver2;
        getOutput().isSourceStreamRequired().addObserver(zzabp.mainThreadExecutor(), this.mSourceStreamRequirementObserver);
        if (2 != this.mSourceState) {
            this.mSourceState = 2;
            getOutput().onSourceStateChanged(2);
        }
    }

    @Override // androidx.camera.core.UseCase
    public final void onSessionStop() {
        StringUtilsKt.d("VideoCapture", "VideoCapture#onStateDetached");
        TransactorKt.checkState("VideoCapture can only be detached on the main thread.", Threads.isMainThread());
        if (this.mSourceStreamRequirementObserver != null) {
            getOutput().isSourceStreamRequired().removeObserver(this.mSourceStreamRequirementObserver);
            this.mSourceStreamRequirementObserver.close();
            this.mSourceStreamRequirementObserver = null;
        }
        if (3 != this.mSourceState) {
            this.mSourceState = 3;
            getOutput().onSourceStateChanged(3);
        }
        getOutput().getStreamInfo().removeObserver(this.mStreamInfoObserver);
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = this.mSurfaceUpdateFuture;
        if (callbackToFutureAdapter$SafeFuture != null && callbackToFutureAdapter$SafeFuture.cancel(false)) {
            StringUtilsKt.d("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        clearPipeline$4();
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
        AutoValue_StreamSpec autoValue_StreamSpec = this.mAttachedStreamSpec;
        Objects.requireNonNull(autoValue_StreamSpec);
        SubtreeManager builder = autoValue_StreamSpec.toBuilder();
        builder.idCounter = config;
        return builder.build();
    }

    @Override // androidx.camera.core.UseCase
    public final AutoValue_StreamSpec onSuggestedStreamSpecUpdated(AutoValue_StreamSpec autoValue_StreamSpec, AutoValue_StreamSpec autoValue_StreamSpec2) {
        Size size = autoValue_StreamSpec.resolution;
        StringUtilsKt.d("VideoCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + autoValue_StreamSpec + ", secondaryStreamSpec " + autoValue_StreamSpec2);
        List list = (List) ((VideoCaptureConfig) this.mCurrentConfig).retrieveOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, null);
        ArrayList arrayList = list != null ? new ArrayList(list) : null;
        if (arrayList != null && !arrayList.contains(size)) {
            StringUtilsKt.w("VideoCapture", "suggested resolution " + size + " is not in custom ordered resolutions " + arrayList);
        }
        return autoValue_StreamSpec;
    }

    public final void resetPipeline() {
        if (getCamera() == null) {
            return;
        }
        clearPipeline$4();
        VideoCaptureConfig videoCaptureConfig = (VideoCaptureConfig) this.mCurrentConfig;
        AutoValue_StreamSpec autoValue_StreamSpec = this.mAttachedStreamSpec;
        autoValue_StreamSpec.getClass();
        SessionConfig.Builder createPipeline = createPipeline(videoCaptureConfig, autoValue_StreamSpec);
        this.mSessionConfigBuilder = createPipeline;
        applyStreamInfoAndStreamSpecToSessionConfigBuilder(createPipeline, this.mStreamInfo, this.mAttachedStreamSpec);
        Object[] objArr = {this.mSessionConfigBuilder.build()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        updateSessionConfig(Collections.unmodifiableList(arrayList));
        notifyReset();
    }

    public final void sendTransformationInfoIfReady$1() {
        CameraInternal camera = getCamera();
        SurfaceEdge surfaceEdge = this.mCameraEdge;
        if (camera == null || surfaceEdge == null) {
            return;
        }
        int compensatedRotation = getCompensatedRotation(camera);
        this.mRotationDegrees = compensatedRotation;
        Threads.runOnMain(new SurfaceEdge$$ExternalSyntheticLambda3(surfaceEdge, compensatedRotation, getAppTargetRotation()));
    }

    @Override // androidx.camera.core.UseCase
    public final void setViewPortCropRect(Rect rect) {
        this.mViewPortCropRect = rect;
        sendTransformationInfoIfReady$1();
    }

    public final String toString() {
        return "VideoCapture:".concat(getName());
    }

    /* renamed from: androidx.camera.video.VideoCapture$3, reason: invalid class name */
    public final class AnonymousClass3 implements ImageReaderProxy, FutureCallback, MouseSelectionObserver, MediaCodecAdapter.Factory, GlideSuppliers$GlideSupplier, InsetsCollector.InsetsDispatcher, CameraXBinder, KotlinTypeChecker.TypeConstructorEquality {
        public static volatile AnonymousClass3 instance;
        public final /* synthetic */ int $r8$classId;
        public final Object this$0;
        public boolean val$isStreamActive;
        public Object val$surfaceUpdateFuture;

        public AnonymousClass3(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 8:
                    this.val$surfaceUpdateFuture = new Object();
                    this.this$0 = new ArrayList();
                    break;
                default:
                    this.val$surfaceUpdateFuture = Collections.newSetFromMap(new WeakHashMap());
                    this.this$0 = new HashSet();
                    break;
            }
        }

        public static boolean canResolveDynamicRange(DynamicRange dynamicRange, DynamicRange dynamicRange2) {
            int i;
            boolean isFullySpecified = dynamicRange2.isFullySpecified();
            int i2 = dynamicRange2.mEncoding;
            if (isFullySpecified) {
                int i3 = dynamicRange.mEncoding;
                return !(i3 == 2 && i2 == 1) && (i3 == 2 || i3 == 0 || i3 == i2) && ((i = dynamicRange.mBitDepth) == 0 || i == dynamicRange2.mBitDepth);
            }
            Handlers$$ExternalSyntheticBUOutline0.m("Fully specified range ", dynamicRange2, " not actually fully specified.");
            return false;
        }

        public static boolean canResolveWithinConstraints(DynamicRange dynamicRange, DynamicRange dynamicRange2, LinkedHashSet linkedHashSet) {
            if (linkedHashSet.contains(dynamicRange2)) {
                return canResolveDynamicRange(dynamicRange, dynamicRange2);
            }
            if (!StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                return false;
            }
            Log.d("CXCP", "DynamicRangeResolver: Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + dynamicRange + "\nCandidate dynamic range:\n  " + dynamicRange2);
            return false;
        }

        public static String checkInstantiable(Class cls) {
            int modifiers = cls.getModifiers();
            if (Modifier.isInterface(modifiers)) {
                return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
            }
            if (!Modifier.isAbstract(modifiers)) {
                return null;
            }
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
        }

        public static DynamicRange findSupportedHdrMatch(DynamicRange dynamicRange, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
            if (dynamicRange.mEncoding != 1) {
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    DynamicRange dynamicRange2 = (DynamicRange) it.next();
                    int i = dynamicRange2.mEncoding;
                    if (!dynamicRange2.isFullySpecified()) {
                        a$$ExternalSyntheticBUOutline0.m$1("Fully specified DynamicRange must have fully defined encoding.");
                        break;
                    }
                    if (i != 1 && canResolveWithinConstraints(dynamicRange, dynamicRange2, linkedHashSet2)) {
                        return dynamicRange2;
                    }
                }
            }
            return null;
        }

        public static void updateConstraints(LinkedHashSet linkedHashSet, DynamicRange dynamicRange, Recorder.AnonymousClass6 anonymousClass6) {
            TransactorKt.checkState("Cannot update already-empty constraints.", !linkedHashSet.isEmpty());
            anonymousClass6.getClass();
            dynamicRange.getClass();
            Set dynamicRangeCaptureRequestConstraints = ((DynamicRangeProfilesCompat$DynamicRangeProfilesCompatImpl) anonymousClass6.this$0).getDynamicRangeCaptureRequestConstraints(dynamicRange);
            Set set = dynamicRangeCaptureRequestConstraints;
            if (set.isEmpty()) {
                return;
            }
            Set set2 = CollectionsKt.toSet(linkedHashSet);
            linkedHashSet.retainAll(set);
            if (linkedHashSet.isEmpty()) {
                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  ", dynamicRange, "\nConstraints:\n  ", dynamicRangeCaptureRequestConstraints, "\nExisting constraints:\n  ", set2);
            }
        }

        public static void zzc(AnonymousClass3 anonymousClass3, zzfq zzfqVar) {
            synchronized (anonymousClass3.val$surfaceUpdateFuture) {
                try {
                    if (!((ArrayList) anonymousClass3.this$0).remove(zzfqVar) && !anonymousClass3.val$isStreamActive) {
                        throw new zzhz();
                    }
                } finally {
                }
            }
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy
        public ImageProxy acquireLatestImage() {
            Image image;
            synchronized (this.this$0) {
                try {
                    image = ((ImageReader) this.val$surfaceUpdateFuture).acquireLatestImage();
                } catch (RuntimeException e) {
                    if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                        throw e;
                    }
                    image = null;
                }
                if (image == null) {
                    return null;
                }
                return new AndroidImageProxy(image);
            }
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy
        public ImageProxy acquireNextImage() {
            Image image;
            synchronized (this.this$0) {
                try {
                    image = ((ImageReader) this.val$surfaceUpdateFuture).acquireNextImage();
                } catch (RuntimeException e) {
                    if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                        throw e;
                    }
                    image = null;
                }
                if (image == null) {
                    return null;
                }
                return new AndroidImageProxy(image);
            }
        }

        @Override // com.withpersona.sdk2.camera.CameraXBinder
        public void bind() {
            CameraPreview.CameraDirection cameraDirection;
            CameraScreenRunner cameraScreenRunner = (CameraScreenRunner) this.val$surfaceUpdateFuture;
            CameraPreview cameraPreview = cameraScreenRunner.cameraPreview;
            PreviewView previewView = cameraScreenRunner.viewController.binding.previewviewSelfieCamera;
            SelfieWorkflow.Screen.CameraScreen cameraScreen = (SelfieWorkflow.Screen.CameraScreen) this.this$0;
            int ordinal = cameraScreen.facingMode.ordinal();
            if (ordinal == 0) {
                cameraDirection = CameraPreview.CameraDirection.FRONT;
            } else if (ordinal == 1) {
                cameraDirection = CameraPreview.CameraDirection.BACK;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                cameraDirection = CameraPreview.CameraDirection.EXTERNAL;
            }
            cameraPreview.rebind(previewView, cameraDirection, cameraScreenRunner.selfieDirectionFeed, this.val$isStreamActive, new ForwardingFileSystem$$ExternalSyntheticLambda0(cameraScreen, 5));
        }

        public boolean clearAndRemove(Request request) {
            boolean z = true;
            if (request == null) {
                return true;
            }
            boolean remove = ((Set) this.val$surfaceUpdateFuture).remove(request);
            if (!((HashSet) this.this$0).remove(request) && !remove) {
                z = false;
            }
            if (z) {
                request.clear();
            }
            return z;
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy
        public void clearOnImageAvailableListener() {
            synchronized (this.this$0) {
                this.val$isStreamActive = true;
                ((ImageReader) this.val$surfaceUpdateFuture).setOnImageAvailableListener(null, null);
            }
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy
        public void close() {
            synchronized (this.this$0) {
                ((ImageReader) this.val$surfaceUpdateFuture).close();
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
        public AsynchronousMediaCodecAdapter createAdapter(e0 e0Var) {
            MediaCodec mediaCodec;
            MediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer;
            int i;
            AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter;
            String str = ((MediaCodecInfo) e0Var.a).name;
            AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter2 = null;
            try {
                Trace.beginSection("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    if (!this.val$isStreamActive || Build.VERSION.SDK_INT < 36) {
                        asynchronousMediaCodecBufferEnqueuer = new AsynchronousMediaCodecBufferEnqueuer(mediaCodec, (HandlerThread) ((AsynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda0) this.this$0).get());
                        i = 0;
                    } else {
                        asynchronousMediaCodecBufferEnqueuer = new Toolbar.AnonymousClass1(mediaCodec);
                        i = 4;
                    }
                    asynchronousMediaCodecAdapter = new AsynchronousMediaCodecAdapter(mediaCodec, (HandlerThread) ((AsynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda0) this.val$surfaceUpdateFuture).get(), asynchronousMediaCodecBufferEnqueuer, (LoudnessCodecController) e0Var.h);
                } catch (Exception e) {
                    e = e;
                }
                try {
                    Trace.endSection();
                    Surface surface = (Surface) e0Var.i;
                    if (surface == null && ((MediaCodecInfo) e0Var.a).detachedSurfaceSupported && Build.VERSION.SDK_INT >= 35) {
                        i |= 8;
                    }
                    AsynchronousMediaCodecAdapter.access$100(asynchronousMediaCodecAdapter, (MediaFormat) e0Var.b, surface, (MediaCrypto) e0Var.f, i);
                    return asynchronousMediaCodecAdapter;
                } catch (Exception e2) {
                    e = e2;
                    asynchronousMediaCodecAdapter2 = asynchronousMediaCodecAdapter;
                    if (asynchronousMediaCodecAdapter2 != null) {
                        asynchronousMediaCodecAdapter2.release();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e3) {
                e = e3;
                mediaCodec = null;
            }
        }

        @Override // com.squareup.cash.ui.InsetsCollector.InsetsDispatcher
        public void dispatch(WindowInsetsCompat windowInsetsCompat, CashInsets cashInsets) {
            View view = (View) this.val$surfaceUpdateFuture;
            Function1 function1 = (Function1) this.this$0;
            windowInsetsCompat.getClass();
            cashInsets.getClass();
            Insets insets = windowInsetsCompat.mImpl.getInsets(this.val$isStreamActive ? 527 : 519);
            insets.getClass();
            int i = cashInsets.get(CashInsets.Type.InlineBottomNavigation).bottom;
            int i2 = cashInsets.get(CashInsets.Type.FloatingBottomNavigation).bottom;
            if (function1 == null) {
                view.setPadding(insets.left, insets.top, insets.right, Math.max(insets.bottom, Math.max(i, i2)));
                return;
            }
            int i3 = insets.left;
            int i4 = insets.bottom;
            view.setPadding(i3, insets.top, insets.right, Math.max(i4, i));
            function1.invoke(Integer.valueOf(i2 == 0 ? 0 : i2 - i4));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
        public boolean equals(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
            boolean z = this.val$isStreamActive;
            CallableDescriptor callableDescriptor = (CallableDescriptor) this.val$surfaceUpdateFuture;
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) this.this$0;
            typeConstructor.getClass();
            typeConstructor2.getClass();
            if (typeConstructor.equals(typeConstructor2)) {
                return true;
            }
            ClassifierDescriptor mo4153getDeclarationDescriptor = typeConstructor.mo4153getDeclarationDescriptor();
            ClassifierDescriptor mo4153getDeclarationDescriptor2 = typeConstructor2.mo4153getDeclarationDescriptor();
            if ((mo4153getDeclarationDescriptor instanceof TypeParameterDescriptor) && (mo4153getDeclarationDescriptor2 instanceof TypeParameterDescriptor)) {
                return DescriptorEquivalenceForOverrides.INSTANCE.areTypeParametersEquivalent((TypeParameterDescriptor) mo4153getDeclarationDescriptor, (TypeParameterDescriptor) mo4153getDeclarationDescriptor2, z, new ButtonKt$Button$2.AnonymousClass1(18, callableDescriptor, callableDescriptor2));
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:58:0x00ff, code lost:
        
            if (com.nimbusds.jose.shaded.gson.internal.GsonTypes.getRawType(r0[0]) != java.lang.String.class) goto L56;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x008a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ObjectConstructor get(TypeToken typeToken, boolean z) {
            String str;
            ObjectConstructor braze$Companion$$ExternalSyntheticLambda21;
            Type type2 = typeToken.f1030type;
            Class cls = typeToken.rawType;
            HashMap hashMap = (HashMap) this.val$surfaceUpdateFuture;
            ObjectConstructor objectConstructor = null;
            if (hashMap.get(type2) != null) {
                a$$ExternalSyntheticBUOutline0.m$1();
                return null;
            }
            if (hashMap.get(cls) != null) {
                a$$ExternalSyntheticBUOutline0.m$1();
                return null;
            }
            int i = 3;
            int i2 = 2;
            ConstructorConstructor$$ExternalSyntheticLambda12 constructorConstructor$$ExternalSyntheticLambda12 = EnumSet.class.isAssignableFrom(cls) ? new ConstructorConstructor$$ExternalSyntheticLambda12(i2, type2) : cls == EnumMap.class ? new ConstructorConstructor$$ExternalSyntheticLambda12(i, type2) : null;
            if (constructorConstructor$$ExternalSyntheticLambda12 != null) {
                return constructorConstructor$$ExternalSyntheticLambda12;
            }
            GsonTypes.getFilterResult((ArrayList) this.this$0);
            int i3 = 1;
            if (!Modifier.isAbstract(cls.getModifiers())) {
                try {
                    Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                    ComparingOperation.DefaultImpls defaultImpls = ReflectionHelper.RECORD_HELPER;
                    try {
                        declaredConstructor.setAccessible(true);
                        str = null;
                    } catch (Exception e) {
                        str = "Failed making constructor '" + ReflectionHelper.constructorToString(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + ReflectionHelper.getInaccessibleTroubleshootingSuffix(e);
                    }
                    braze$Companion$$ExternalSyntheticLambda21 = str != null ? new Braze$Companion$$ExternalSyntheticLambda21(str, 11) : new ConstructorConstructor$$ExternalSyntheticLambda21(declaredConstructor, i3);
                } catch (NoSuchMethodException unused) {
                }
                if (braze$Companion$$ExternalSyntheticLambda21 == null) {
                    return braze$Companion$$ExternalSyntheticLambda21;
                }
                if (Collection.class.isAssignableFrom(cls)) {
                    if (cls.isAssignableFrom(ArrayList.class)) {
                        objectConstructor = new JWK$$ExternalSyntheticBUOutline0(24);
                    } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
                        objectConstructor = new JWK$$ExternalSyntheticBUOutline0(25);
                    } else if (cls.isAssignableFrom(TreeSet.class)) {
                        objectConstructor = new JWK$$ExternalSyntheticBUOutline0(26);
                    } else if (cls.isAssignableFrom(ArrayDeque.class)) {
                        objectConstructor = new JWK$$ExternalSyntheticBUOutline0(27);
                    }
                } else if (Map.class.isAssignableFrom(cls)) {
                    if (cls.isAssignableFrom(LinkedTreeMap.class)) {
                        if (type2 instanceof ParameterizedType) {
                            Type[] actualTypeArguments = ((ParameterizedType) type2).getActualTypeArguments();
                            if (actualTypeArguments.length != 0) {
                            }
                        }
                        objectConstructor = new JWK$$ExternalSyntheticBUOutline0(28);
                    }
                    if (cls.isAssignableFrom(LinkedHashMap.class)) {
                        objectConstructor = new JWK$$ExternalSyntheticBUOutline0(29);
                    } else if (cls.isAssignableFrom(TreeMap.class)) {
                        objectConstructor = new WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0(i3);
                    } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
                        objectConstructor = new WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0(i2);
                    } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
                        objectConstructor = new WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0(i);
                    }
                }
                if (objectConstructor != null) {
                    return objectConstructor;
                }
                String checkInstantiable = checkInstantiable(cls);
                if (checkInstantiable != null) {
                    return new Braze$Companion$$ExternalSyntheticLambda21(checkInstantiable, 12);
                }
                if (!z) {
                    return new Braze$Companion$$ExternalSyntheticLambda21(Boxes$$ExternalSyntheticOutline1.m(cls, "Unable to create instance of ", "; Register an InstanceCreator or a TypeAdapter for this type."), 13);
                }
                if (this.val$isStreamActive) {
                    return new ConstructorConstructor$$ExternalSyntheticLambda10(cls, i3);
                }
                String m = Boxes$$ExternalSyntheticOutline1.m(cls, "Unable to create instance of ", "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
                if (cls.getDeclaredConstructors().length == 0) {
                    m = m.concat(" Or adjust your R8 configuration to keep the no-args constructor of the class.");
                }
                return new Braze$Companion$$ExternalSyntheticLambda21(m, 10);
            }
            braze$Companion$$ExternalSyntheticLambda21 = null;
            if (braze$Companion$$ExternalSyntheticLambda21 == null) {
            }
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy
        public int getHeight() {
            int height;
            synchronized (this.this$0) {
                height = ((ImageReader) this.val$surfaceUpdateFuture).getHeight();
            }
            return height;
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy
        public int getImageFormat() {
            int imageFormat;
            synchronized (this.this$0) {
                imageFormat = ((ImageReader) this.val$surfaceUpdateFuture).getImageFormat();
            }
            return imageFormat;
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy
        public int getMaxImages() {
            int maxImages;
            synchronized (this.this$0) {
                maxImages = ((ImageReader) this.val$surfaceUpdateFuture).getMaxImages();
            }
            return maxImages;
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy
        public Surface getSurface() {
            Surface surface;
            synchronized (this.this$0) {
                surface = ((ImageReader) this.val$surfaceUpdateFuture).getSurface();
            }
            return surface;
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy
        public int getWidth() {
            int width;
            synchronized (this.this$0) {
                width = ((ImageReader) this.val$surfaceUpdateFuture).getWidth();
            }
            return width;
        }

        public void maybeRegisterReceiver() {
            if (this.val$isStreamActive || ((HashSet) this.this$0).isEmpty()) {
                return;
            }
            Response response = (Response) this.val$surfaceUpdateFuture;
            ViewTargetDisposable viewTargetDisposable = (ViewTargetDisposable) response.cacheEntry;
            boolean z = false;
            response.intermediate = ((ConnectivityManager) viewTargetDisposable.get()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) viewTargetDisposable.get()).registerDefaultNetworkCallback((IndividualNetworkCallback) response.error);
                z = true;
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
            }
            this.val$isStreamActive = z;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onDrag-3MmeM6k, reason: not valid java name */
        public boolean mo119onDrag3MmeM6k(long j, SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0) {
            LegacyTextFieldState legacyTextFieldState;
            TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) this.this$0;
            if (!textFieldSelectionManager.getEnabled() || textFieldSelectionManager.getValue$foundation().annotatedString.text.length() == 0 || (legacyTextFieldState = textFieldSelectionManager.state) == null || legacyTextFieldState.getLayoutResult() == null) {
                return false;
            }
            updateMouseSelection(textFieldSelectionManager.getValue$foundation(), j, false, selectionAdjustment$Companion$$ExternalSyntheticLambda0);
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public void onDragDone() {
            if (this.val$isStreamActive) {
                TextFieldSelectionManager.m453access$maybeSuggestSelectionOEnZFl4((TextFieldSelectionManager) this.this$0, (TextRange) this.val$surfaceUpdateFuture);
            }
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onExtend-k-4lQ0M, reason: not valid java name */
        public boolean mo120onExtendk4lQ0M(long j) {
            TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) this.this$0;
            LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.state;
            if (legacyTextFieldState == null || legacyTextFieldState.getLayoutResult() == null || !textFieldSelectionManager.getEnabled()) {
                return false;
            }
            textFieldSelectionManager.previousRawDragOffset = -1;
            FocusRequester focusRequester = textFieldSelectionManager.focusRequester;
            if (focusRequester != null) {
                FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
            }
            updateMouseSelection(textFieldSelectionManager.getValue$foundation(), j, false, SelectionAdjustment$Companion.None);
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onExtendDrag-k-4lQ0M, reason: not valid java name */
        public boolean mo121onExtendDragk4lQ0M(long j) {
            LegacyTextFieldState legacyTextFieldState;
            TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) this.this$0;
            if (!textFieldSelectionManager.getEnabled() || textFieldSelectionManager.getValue$foundation().annotatedString.text.length() == 0 || (legacyTextFieldState = textFieldSelectionManager.state) == null || legacyTextFieldState.getLayoutResult() == null) {
                return false;
            }
            updateMouseSelection(textFieldSelectionManager.getValue$foundation(), j, false, SelectionAdjustment$Companion.None);
            return true;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th) {
            if (th instanceof CancellationException) {
                return;
            }
            StringUtilsKt.e("VideoCapture", "Surface update completed with unexpected exception", th);
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onStart-9KIMszo, reason: not valid java name */
        public boolean mo122onStart9KIMszo(long j, SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0, int i) {
            LegacyTextFieldState legacyTextFieldState;
            TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) this.this$0;
            if (!textFieldSelectionManager.getEnabled() || textFieldSelectionManager.getValue$foundation().annotatedString.text.length() == 0 || (legacyTextFieldState = textFieldSelectionManager.state) == null || legacyTextFieldState.getLayoutResult() == null) {
                return false;
            }
            FocusRequester focusRequester = textFieldSelectionManager.focusRequester;
            if (focusRequester != null) {
                FocusRequester.m605requestFocus3ESFkO8$default(focusRequester);
            }
            textFieldSelectionManager.dragBeginPosition = j;
            textFieldSelectionManager.previousRawDragOffset = -1;
            textFieldSelectionManager.enterSelectionMode$foundation(true);
            long updateMouseSelection = updateMouseSelection(textFieldSelectionManager.getValue$foundation(), textFieldSelectionManager.dragBeginPosition, true, selectionAdjustment$Companion$$ExternalSyntheticLambda0);
            if (i >= 2) {
                this.val$isStreamActive = true;
                this.val$surfaceUpdateFuture = new TextRange(updateMouseSelection);
            }
            return true;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onSuccess(Object obj) {
            int i;
            CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = (CallbackToFutureAdapter$SafeFuture) this.val$surfaceUpdateFuture;
            VideoCapture videoCapture = (VideoCapture) this.this$0;
            if (callbackToFutureAdapter$SafeFuture != videoCapture.mSurfaceUpdateFuture || (i = videoCapture.mSourceState) == 3) {
                return;
            }
            int i2 = this.val$isStreamActive ? 1 : 2;
            if (i2 != i) {
                videoCapture.mSourceState = i2;
                videoCapture.getOutput().onSourceStateChanged(i2);
            }
        }

        public LinkedHashMap resolveAndValidateDynamicRanges(ArrayList arrayList, List list, List list2) {
            LinkedHashMap linkedHashMap;
            DynamicRange dynamicRange;
            Iterator it;
            Set set;
            LinkedHashSet linkedHashSet;
            DynamicRange dynamicRange2;
            Recorder.AnonymousClass6 anonymousClass6 = (Recorder.AnonymousClass6) this.this$0;
            list.getClass();
            list2.getClass();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                DynamicRange dynamicRange3 = ((AutoValue_AttachedSurfaceInfo) it2.next()).dynamicRange;
                dynamicRange3.getClass();
                linkedHashSet2.add(dynamicRange3);
            }
            Set supportedDynamicRanges = ((DynamicRangeProfilesCompat$DynamicRangeProfilesCompatImpl) anonymousClass6.this$0).getSupportedDynamicRanges();
            LinkedHashSet mutableSet = CollectionsKt.toMutableSet(supportedDynamicRanges);
            Iterator it3 = linkedHashSet2.iterator();
            while (it3.hasNext()) {
                updateConstraints(mutableSet, (DynamicRange) it3.next(), anonymousClass6);
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                UseCaseConfig useCaseConfig = (UseCaseConfig) list.get(((Number) it4.next()).intValue());
                DynamicRange dynamicRange4 = useCaseConfig.getDynamicRange();
                if (dynamicRange4.equals(DynamicRange.UNSPECIFIED)) {
                    arrayList4.add(useCaseConfig);
                } else {
                    int i = dynamicRange4.mEncoding;
                    int i2 = dynamicRange4.mBitDepth;
                    if (i == 2 || ((i != 0 && i2 == 0) || (i == 0 && i2 != 0))) {
                        arrayList3.add(useCaseConfig);
                    } else {
                        arrayList2.add(useCaseConfig);
                    }
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            arrayList5.addAll(arrayList3);
            arrayList5.addAll(arrayList4);
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                UseCaseConfig useCaseConfig2 = (UseCaseConfig) it5.next();
                DynamicRange dynamicRange5 = useCaseConfig2.getDynamicRange();
                String str = (String) useCaseConfig2.retrieveOption(TargetConfig.OPTION_TARGET_NAME);
                str.getClass();
                if (dynamicRange5.isFullySpecified()) {
                    linkedHashSet = linkedHashSet2;
                    it = it5;
                    if (mutableSet.contains(dynamicRange5)) {
                        dynamicRange = dynamicRange5;
                        set = supportedDynamicRanges;
                        linkedHashMap = null;
                    } else {
                        set = supportedDynamicRanges;
                        linkedHashMap = null;
                        dynamicRange = null;
                    }
                } else {
                    int i3 = dynamicRange5.mEncoding;
                    int i4 = dynamicRange5.mBitDepth;
                    linkedHashMap = null;
                    dynamicRange = DynamicRange.SDR;
                    if (i3 == 1 && i4 == 0) {
                        if (!mutableSet.contains(dynamicRange)) {
                            dynamicRange = null;
                        }
                        linkedHashSet = linkedHashSet2;
                        it = it5;
                        set = supportedDynamicRanges;
                    } else {
                        DynamicRange findSupportedHdrMatch = findSupportedHdrMatch(dynamicRange5, linkedHashSet2, mutableSet);
                        it = it5;
                        set = supportedDynamicRanges;
                        linkedHashSet = linkedHashSet2;
                        if (findSupportedHdrMatch == null) {
                            findSupportedHdrMatch = findSupportedHdrMatch(dynamicRange5, linkedHashSet3, mutableSet);
                            if (findSupportedHdrMatch == null) {
                                if (!canResolveWithinConstraints(dynamicRange5, dynamicRange, mutableSet)) {
                                    if (i3 == 2 && (i4 == 10 || i4 == 0)) {
                                        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            dynamicRange2 = Api33Impl.getRecommended10BitDynamicRange((CameraMetadata) this.val$surfaceUpdateFuture);
                                            if (dynamicRange2 != null) {
                                                linkedHashSet4.add(dynamicRange2);
                                            }
                                        } else {
                                            dynamicRange2 = null;
                                        }
                                        linkedHashSet4.add(DynamicRange.HLG_10_BIT);
                                        DynamicRange findSupportedHdrMatch2 = findSupportedHdrMatch(dynamicRange5, linkedHashSet4, mutableSet);
                                        if (findSupportedHdrMatch2 != null) {
                                            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                                StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("DynamicRangeResolver: Resolved dynamic range for use case ", str, "from ");
                                                m3m.append(findSupportedHdrMatch2.equals(dynamicRange2) ? "recommended" : "required");
                                                m3m.append(" 10-bit supported dynamic range.\n");
                                                m3m.append(dynamicRange5);
                                                m3m.append("\n->\n");
                                                m3m.append(findSupportedHdrMatch2);
                                                Log.d("CXCP", m3m.toString());
                                            }
                                            dynamicRange = findSupportedHdrMatch2;
                                        }
                                    }
                                    Iterator it6 = mutableSet.iterator();
                                    while (true) {
                                        if (!it6.hasNext()) {
                                            dynamicRange = null;
                                            break;
                                        }
                                        DynamicRange dynamicRange6 = (DynamicRange) it6.next();
                                        if (!dynamicRange6.isFullySpecified()) {
                                            a$$ExternalSyntheticBUOutline0.m$1("Candidate dynamic range must be fully specified.");
                                            return null;
                                        }
                                        if (!dynamicRange6.equals(dynamicRange) && canResolveDynamicRange(dynamicRange5, dynamicRange6)) {
                                            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                                Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str + " from validated dynamic range constraints or supported HDR dynamic ranges.\n" + dynamicRange5 + "\n->\n" + dynamicRange6);
                                            }
                                            dynamicRange = dynamicRange6;
                                        }
                                    }
                                } else if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                    Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str + " to no compatible HDR dynamic ranges.\n" + dynamicRange5 + "\n->\n" + dynamicRange);
                                }
                            } else if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str + " from concurrently bound use case.\n" + dynamicRange5 + "\n->\n" + findSupportedHdrMatch);
                            }
                        } else if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str + " from existing attached surface.\n" + dynamicRange5 + "\n->\n" + findSupportedHdrMatch);
                        }
                        dynamicRange = findSupportedHdrMatch;
                    }
                }
                if (dynamicRange == null) {
                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  ", (String) useCaseConfig2.retrieveOption(TargetConfig.OPTION_TARGET_NAME), "\nRequested dynamic range:\n  ", dynamicRange5, "\nSupported dynamic ranges:\n  ", set, "\nConstrained set of concurrent dynamic ranges:\n  ", mutableSet);
                    return linkedHashMap;
                }
                updateConstraints(mutableSet, dynamicRange, anonymousClass6);
                linkedHashMap2.put(useCaseConfig2, dynamicRange);
                linkedHashSet2 = linkedHashSet;
                if (!linkedHashSet2.contains(dynamicRange)) {
                    linkedHashSet3.add(dynamicRange);
                }
                it5 = it;
                supportedDynamicRanges = set;
            }
            return linkedHashMap2;
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy
        public void setOnImageAvailableListener(final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, final Executor executor) {
            Handler handler;
            synchronized (this.this$0) {
                this.val$isStreamActive = false;
                ImageReader.OnImageAvailableListener onImageAvailableListener2 = new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.AndroidImageReaderProxy$$ExternalSyntheticLambda0
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(ImageReader imageReader) {
                        VideoCapture.AnonymousClass3 anonymousClass3 = VideoCapture.AnonymousClass3.this;
                        Executor executor2 = executor;
                        ImageReaderProxy.OnImageAvailableListener onImageAvailableListener3 = onImageAvailableListener;
                        synchronized (anonymousClass3.this$0) {
                            try {
                                if (!anonymousClass3.val$isStreamActive) {
                                    executor2.execute(new CameraX$$ExternalSyntheticLambda2(7, anonymousClass3, onImageAvailableListener3));
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                };
                ImageReader imageReader = (ImageReader) this.val$surfaceUpdateFuture;
                if (ASTUtilKt.sHandler != null) {
                    handler = ASTUtilKt.sHandler;
                } else {
                    synchronized (ASTUtilKt.class) {
                        try {
                            if (ASTUtilKt.sHandler == null) {
                                ASTUtilKt.sHandler = Handler.createAsync(Looper.getMainLooper());
                            }
                        } finally {
                        }
                    }
                    handler = ASTUtilKt.sHandler;
                }
                imageReader.setOnImageAvailableListener(onImageAvailableListener2, handler);
            }
        }

        public String toString() {
            switch (this.$r8$classId) {
                case 7:
                    StringBuilder sb = new StringBuilder();
                    sb.append(super.toString());
                    sb.append("{numRequests=");
                    sb.append(((Set) this.val$surfaceUpdateFuture).size());
                    sb.append(", isPaused=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.val$isStreamActive, "}");
                case 8:
                default:
                    return super.toString();
                case 9:
                    return ((HashMap) this.val$surfaceUpdateFuture).toString();
            }
        }

        public long updateMouseSelection(TextFieldValue textFieldValue, long j, boolean z, SelectionAdjustment$Companion$$ExternalSyntheticLambda0 selectionAdjustment$Companion$$ExternalSyntheticLambda0) {
            TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) this.this$0;
            long m454access$updateSelectionjSglsI8 = TextFieldSelectionManager.m454access$updateSelectionjSglsI8(textFieldSelectionManager, textFieldValue, j, z, false, selectionAdjustment$Companion$$ExternalSyntheticLambda0, false, null);
            if (!TextRange.m985equalsimpl((TextRange) this.val$surfaceUpdateFuture, m454access$updateSelectionjSglsI8)) {
                this.val$isStreamActive = false;
            }
            textFieldSelectionManager.setHandleState(TextRange.m987getCollapsedimpl(m454access$updateSelectionjSglsI8) ? HandleState.Cursor : HandleState.Selection);
            return m454access$updateSelectionjSglsI8;
        }

        public void zzd() {
            zzil zzj;
            synchronized (this.val$surfaceUpdateFuture) {
                this.val$isStreamActive = true;
                ArrayList arrayList = (ArrayList) this.this$0;
                zzj = zzil.zzj(arrayList);
                arrayList.clear();
            }
            int size = zzj.size();
            for (int i = 0; i < size; i++) {
                ((Runnable) zzj.get(i)).run();
            }
        }

        public AnonymousClass3(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z) {
            this.$r8$classId = 14;
            this.val$isStreamActive = z;
            this.val$surfaceUpdateFuture = callableDescriptor;
            this.this$0 = callableDescriptor2;
        }

        public /* synthetic */ AnonymousClass3(Object obj, boolean z, Object obj2, int i) {
            this.$r8$classId = i;
            this.val$surfaceUpdateFuture = obj;
            this.val$isStreamActive = z;
            this.this$0 = obj2;
        }

        public AnonymousClass3(CameraMetadata cameraMetadata) {
            this.$r8$classId = 2;
            cameraMetadata.getClass();
            this.val$surfaceUpdateFuture = cameraMetadata;
            CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
            key.getClass();
            int[] iArr = (int[]) ((Camera2CameraMetadata) cameraMetadata).get(key);
            this.val$isStreamActive = iArr != null ? ArraysKt___ArraysKt.contains(iArr, 18) : false;
            this.this$0 = Api33Impl.fromCameraMetaData(cameraMetadata);
        }

        public AnonymousClass3(ImageReader imageReader) {
            this.$r8$classId = 3;
            this.this$0 = new Object();
            this.val$isStreamActive = true;
            this.val$surfaceUpdateFuture = imageReader;
        }

        public AnonymousClass3(Context context) {
            this.$r8$classId = 1;
            this.this$0 = new HashSet();
            this.val$surfaceUpdateFuture = new Response(new ViewTargetDisposable(new CredentialProviderFactory(context, 4, false)), new SingletonConnectivityReceiver$2(this));
        }

        public AnonymousClass3(AsynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda0 asynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda0, AsynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda0 asynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda02) {
            this.$r8$classId = 5;
            this.val$surfaceUpdateFuture = asynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda0;
            this.this$0 = asynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda02;
            this.val$isStreamActive = true;
        }

        public AnonymousClass3(View view, boolean z, AlertBannerKt$$ExternalSyntheticLambda3 alertBannerKt$$ExternalSyntheticLambda3) {
            this.$r8$classId = 11;
            view.getClass();
            this.val$surfaceUpdateFuture = view;
            this.val$isStreamActive = z;
            this.this$0 = alertBannerKt$$ExternalSyntheticLambda3;
        }

        public AnonymousClass3(Glide glide, ArrayList arrayList, AppGlideModule appGlideModule) {
            this.$r8$classId = 6;
            this.val$surfaceUpdateFuture = glide;
            this.this$0 = arrayList;
        }

        public AnonymousClass3(TextFieldSelectionManager textFieldSelectionManager) {
            this.$r8$classId = 4;
            this.this$0 = textFieldSelectionManager;
            this.val$isStreamActive = true;
        }

        public AnonymousClass3(ArcadeFormTextInputGroupView.InputFieldModel inputFieldModel) {
            this.$r8$classId = 10;
            Integer num = inputFieldModel.minCharacterCount;
            Integer num2 = inputFieldModel.maxCharacterCount;
            boolean z = inputFieldModel.isRequired;
            this.val$surfaceUpdateFuture = num;
            this.this$0 = num2;
            this.val$isStreamActive = z;
        }

        public AnonymousClass3(CameraScreenRunner cameraScreenRunner, SelfieWorkflow.Screen.CameraScreen cameraScreen, boolean z) {
            this.$r8$classId = 13;
            this.val$surfaceUpdateFuture = cameraScreenRunner;
            this.this$0 = cameraScreen;
            this.val$isStreamActive = z;
        }

        public AnonymousClass3(VideoCapture videoCapture, CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture, boolean z) {
            this.$r8$classId = 0;
            this.this$0 = videoCapture;
            this.val$surfaceUpdateFuture = callbackToFutureAdapter$SafeFuture;
            this.val$isStreamActive = z;
        }

        @Override // com.bumptech.glide.util.GlideSuppliers$GlideSupplier
        public Object get() {
            if (!this.val$isStreamActive) {
                Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel("Glide registry"));
                this.val$isStreamActive = true;
                try {
                    return RegistryFactory.createAndInitRegistry((Glide) this.val$surfaceUpdateFuture, (ArrayList) this.this$0);
                } finally {
                    this.val$isStreamActive = false;
                    Trace.endSection();
                }
            }
            a$$ExternalSyntheticBUOutline0.m$1("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            return null;
        }

        public static AnonymousClass3 get(Context context) {
            if (instance == null) {
                synchronized (AnonymousClass3.class) {
                    try {
                        if (instance == null) {
                            instance = new AnonymousClass3(context.getApplicationContext());
                        }
                    } finally {
                    }
                }
            }
            return instance;
        }
    }
}
