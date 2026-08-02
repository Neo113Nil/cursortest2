package androidx.camera.video;

import android.content.Context;
import android.util.Pair;
import android.util.Size;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.ChainingListenableFuture;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.AutoValue_FallbackStrategy_RuleStrategy;
import androidx.camera.video.AutoValue_Quality_ConstantQuality;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.QualitySelector;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.impl.VideoCaptureConfig;
import androidx.camera.view.PreviewView;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.moneybot.genie.SwitchViewKt;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.ContextUtilsKt;
import io.noties.markwon.MarkwonConfiguration;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function1;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes3.dex */
public final /* synthetic */ class VideoCapture$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ boolean f$5;

    public /* synthetic */ VideoCapture$$ExternalSyntheticLambda2(PreviewView previewView, ImageAnalysis.Analyzer analyzer, boolean z, CameraSelector cameraSelector, CameraPreview cameraPreview, Function1 function1) {
        this.$r8$classId = 2;
        this.f$0 = previewView;
        this.f$1 = analyzer;
        this.f$5 = z;
        this.f$2 = cameraSelector;
        this.f$3 = cameraPreview;
        this.f$4 = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$4;
        Object obj2 = this.f$3;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                VideoCapture videoCapture = (VideoCapture) obj5;
                SurfaceEdge surfaceEdge = (SurfaceEdge) obj4;
                CameraInternal cameraInternal = (CameraInternal) obj3;
                VideoCaptureConfig videoCaptureConfig = (VideoCaptureConfig) obj2;
                Timebase timebase = (Timebase) obj;
                if (cameraInternal == videoCapture.getCamera()) {
                    videoCapture.mSurfaceRequest = surfaceEdge.createSurfaceRequest(cameraInternal, true);
                    VideoOutput videoOutput = (VideoOutput) videoCaptureConfig.retrieveOption(VideoCaptureConfig.OPTION_VIDEO_OUTPUT);
                    Objects.requireNonNull(videoOutput);
                    videoOutput.onSurfaceRequested(videoCapture.mSurfaceRequest, timebase, this.f$5);
                    videoCapture.sendTransformationInfoIfReady$1();
                    break;
                }
                break;
            case 1:
                Pair pair = (Pair) obj4;
                ((DefaultAnalyticsCollector) MediaSourceList.this.eventListener).onLoadError(((Integer) pair.first).intValue(), (MediaSource$MediaPeriodId) pair.second, (LoadEventInfo) obj3, (MediaLoadData) obj2, (IOException) obj, this.f$5);
                break;
            default:
                final PreviewView previewView = (PreviewView) obj5;
                final ImageAnalysis.Analyzer analyzer = (ImageAnalysis.Analyzer) obj4;
                final CameraSelector cameraSelector = (CameraSelector) obj3;
                final CameraPreview cameraPreview = (CameraPreview) obj2;
                final Function1 function1 = (Function1) obj;
                if (previewView.isAttachedToWindow()) {
                    Context context = previewView.getContext();
                    context.getClass();
                    AppCompatActivity activity = ContextUtilsKt.getActivity(context);
                    if (activity == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        break;
                    } else {
                        ActionBar supportActionBar = activity.getSupportActionBar();
                        if (supportActionBar != null) {
                            supportActionBar.hide();
                        }
                        final int rotation = previewView.getDisplay().getRotation();
                        final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                        ProcessCameraProvider processCameraProvider = ProcessCameraProvider.sAppInstance;
                        Context context2 = previewView.getContext();
                        context2.getClass();
                        final ChainingListenableFuture switchViewKt = SwitchViewKt.getInstance(context2);
                        final boolean z = this.f$5;
                        switchViewKt.addListener(new Runnable() { // from class: com.withpersona.sdk2.camera.CameraPreview$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                Throwable th;
                                Recorder recorder;
                                PreviewView previewView2 = previewView;
                                CameraSelector cameraSelector2 = cameraSelector;
                                CameraPreview cameraPreview2 = cameraPreview;
                                ProcessCameraProvider processCameraProvider2 = (ProcessCameraProvider) ChainingListenableFuture.this.get();
                                Preview.Builder builder = new Preview.Builder(0);
                                int i2 = rotation;
                                builder.setTargetRotation$2(i2);
                                Preview m102build = builder.m102build();
                                UseCaseGroup.Builder builder2 = new UseCaseGroup.Builder();
                                ArrayList arrayList = builder2.mUseCases;
                                arrayList.add(m102build);
                                Preview.Builder builder3 = new Preview.Builder(2);
                                AutoValue_Config_Option autoValue_Config_Option = ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE;
                                MutableOptionsBundle mutableOptionsBundle = builder3.mMutableConfig;
                                mutableOptionsBundle.insertOption(autoValue_Config_Option, 1);
                                AutoValue_Config_Option autoValue_Config_Option2 = ImageOutputConfig.OPTION_TARGET_ROTATION;
                                mutableOptionsBundle.insertOption(autoValue_Config_Option2, Integer.valueOf(i2));
                                ImageCapture m101build = builder3.m101build();
                                arrayList.add(m101build);
                                ImageAnalysis.Analyzer analyzer2 = analyzer;
                                ExecutorService executorService = newSingleThreadExecutor;
                                if (analyzer2 != null) {
                                    Preview.Builder builder4 = new Preview.Builder(1);
                                    builder4.setBackpressureStrategy();
                                    Size size = new Size(2000, 2000);
                                    AutoValue_Config_Option autoValue_Config_Option3 = ImageOutputConfig.OPTION_TARGET_RESOLUTION;
                                    MutableOptionsBundle mutableOptionsBundle2 = builder4.mMutableConfig;
                                    mutableOptionsBundle2.insertOption(autoValue_Config_Option3, size);
                                    mutableOptionsBundle2.insertOption(autoValue_Config_Option2, Integer.valueOf(i2));
                                    ImageAnalysis build = builder4.build();
                                    build.setAnalyzer(executorService, analyzer2);
                                    arrayList.add(build);
                                }
                                if (z) {
                                    ZslControlImpl$$ExternalSyntheticLambda1 zslControlImpl$$ExternalSyntheticLambda1 = Recorder.DEFAULT_ENCODER_FACTORY;
                                    ZslControlImpl$$ExternalSyntheticLambda1 zslControlImpl$$ExternalSyntheticLambda12 = Recorder.DEFAULT_MUXER_FACTORY;
                                    ZslControlImpl$$ExternalSyntheticLambda1 zslControlImpl$$ExternalSyntheticLambda13 = Recorder.OUTPUT_STORAGE_FACTORY_DEFAULT;
                                    HuffmanTreeGroup builder5 = Recorder.MEDIA_SPEC_DEFAULT.toBuilder();
                                    TransactorKt.checkNotNull(executorService, "The specified executor can't be null.");
                                    AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality = AutoValue_Quality_ConstantQuality.FHD;
                                    AutoValue_FallbackStrategy_RuleStrategy autoValue_FallbackStrategy_RuleStrategy = new AutoValue_FallbackStrategy_RuleStrategy(autoValue_Quality_ConstantQuality, 3);
                                    th = null;
                                    TransactorKt.checkArgument("Invalid quality: " + autoValue_Quality_ConstantQuality, AutoValue_Quality_ConstantQuality.QUALITIES.contains(autoValue_Quality_ConstantQuality));
                                    QualitySelector qualitySelector = new QualitySelector(Collections.singletonList(autoValue_Quality_ConstantQuality), autoValue_FallbackStrategy_RuleStrategy);
                                    VideoSpec videoSpec = (VideoSpec) builder5.trees;
                                    videoSpec.getClass();
                                    VideoSpec videoSpec2 = VideoSpec.DEFAULT;
                                    videoSpec.qualitySelector.getClass();
                                    int i3 = videoSpec.bitrate;
                                    int i4 = videoSpec.aspectRatio;
                                    String str = videoSpec.mimeType;
                                    str.getClass();
                                    builder5.trees = new VideoSpec(qualitySelector, i3, i4, str);
                                    recorder = new Recorder(executorService, new MediaSpec((VideoSpec) builder5.trees, (AudioSpec) builder5.codes, builder5.alphabetSize), zslControlImpl$$ExternalSyntheticLambda1, zslControlImpl$$ExternalSyntheticLambda1, zslControlImpl$$ExternalSyntheticLambda12, zslControlImpl$$ExternalSyntheticLambda13);
                                    VideoCapture.Defaults defaults = VideoCapture.DEFAULT_CONFIG;
                                    arrayList.add(new VideoCapture(new VideoCaptureConfig(OptionsBundle.from(new Preview.Builder(recorder).mMutableConfig))));
                                } else {
                                    th = null;
                                    recorder = null;
                                }
                                processCameraProvider2.unbindAll();
                                try {
                                    Context context3 = previewView2.getContext();
                                    context3.getClass();
                                    AppCompatActivity activity2 = ContextUtilsKt.getActivity(context3);
                                    if (activity2 == null) {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    TransactorKt.checkArgument("UseCase must not be empty.", !arrayList.isEmpty());
                                    ArrayList arrayList2 = builder2.mEffects;
                                    Iterator it = arrayList2.iterator();
                                    if (it.hasNext()) {
                                        if (it.next() != null) {
                                            throw new ClassCastException();
                                        }
                                        throw th;
                                    }
                                    LifecycleCamera bindToLifecycle = processCameraProvider2.bindToLifecycle(activity2, cameraSelector2, new UseCaseGroup(0, arrayList, arrayList2));
                                    CameraProperties retrieveCameraProperties = CameraPreview.retrieveCameraProperties(bindToLifecycle);
                                    MarkwonConfiguration markwonConfiguration = new MarkwonConfiguration();
                                    markwonConfiguration.theme = bindToLifecycle;
                                    markwonConfiguration.syntaxHighlight = m101build;
                                    markwonConfiguration.linkResolver = recorder;
                                    markwonConfiguration.imageDestinationProcessor = retrieveCameraProperties;
                                    cameraPreview2.currentCameraSession = markwonConfiguration;
                                    Context context4 = previewView2.getContext();
                                    context4.getClass();
                                    com.withpersona.sdk2.inquiry.shared.ContextUtilsKt.requireLifecycleOwner(context4).getLifecycle().addObserver(new CameraPreview$rebind$1$1$1(executorService, 0));
                                    Threads.checkMainThread();
                                    m102build.setSurfaceProvider(previewView2.mSurfaceProvider);
                                } catch (IllegalArgumentException unused) {
                                    function1.invoke(new NoSuitableCameraError());
                                }
                            }
                        }, previewView.getContext().getMainExecutor());
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ VideoCapture$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = serializable;
        this.f$5 = z;
    }
}
