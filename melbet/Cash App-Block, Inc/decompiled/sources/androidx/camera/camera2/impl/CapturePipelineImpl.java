package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import androidx.camera.camera2.adapter.CaptureConfigAdapter;
import androidx.camera.camera2.compat.workaround.UseTorchAsFlash;
import androidx.camera.camera2.config.UseCaseGraphContext;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.camera2.pipe.compat.AndroidFrameInfo;
import androidx.camera.camera2.pipe.compat.AndroidFrameMetadata;
import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.camera.camera2.pipe.graph.CameraGraphSessionImpl;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.TagBundle;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda5;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.paging.FlowExtKt$simpleScan$1;
import androidx.room.RoomDatabase$performClear$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$1$1;
import com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;
import okhttp3.Cache;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class CapturePipelineImpl implements CapturePipeline {
    public final CaptureConfigAdapter configAdapter;
    public final CapturePipelineImpl$emptyRequestMetadata$1 emptyRequestMetadata;
    public final FlashControl flashControl;
    public AndroidFrameMetadata frameMetadata;
    public final Lazy hasFlashUnit$delegate;
    public final ComboRequestListener requestListener;
    public int template;
    public final UseCaseThreads threads;
    public final TorchControl torchControl;
    public final Lazy useCaseCameraState$delegate;
    public final Provider useCaseCameraStateProvider;
    public final UseCaseGraphContext useCaseGraphContext;
    public final UseTorchAsFlash useTorchAsFlash;
    public final VideoUsageControl videoUsageControl;

    public final class MainCaptureParams {
        public final List configs;
        public final int requestTemplate;
        public final Config sessionConfigOptions;

        public MainCaptureParams(List list, int i, Config config) {
            list.getClass();
            config.getClass();
            this.configs = list;
            this.requestTemplate = i;
            this.sessionConfigOptions = config;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MainCaptureParams)) {
                return false;
            }
            MainCaptureParams mainCaptureParams = (MainCaptureParams) obj;
            return Intrinsics.areEqual(this.configs, mainCaptureParams.configs) && this.requestTemplate == mainCaptureParams.requestTemplate && Intrinsics.areEqual(this.sessionConfigOptions, mainCaptureParams.sessionConfigOptions);
        }

        public final int hashCode() {
            return this.sessionConfigOptions.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.requestTemplate, this.configs.hashCode() * 31, 31);
        }

        public final String toString() {
            return "MainCaptureParams(configs=" + this.configs + ", requestTemplate=" + ((Object) RequestTemplate.m54toStringimpl(this.requestTemplate)) + ", sessionConfigOptions=" + this.sessionConfigOptions + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PipelineTask {
        public static final /* synthetic */ PipelineTask[] $VALUES;
        public static final PipelineTask MAIN_CAPTURE;
        public static final PipelineTask POST_CAPTURE;
        public static final PipelineTask PRE_CAPTURE;

        static {
            PipelineTask pipelineTask = new PipelineTask("PRE_CAPTURE", 0);
            PRE_CAPTURE = pipelineTask;
            PipelineTask pipelineTask2 = new PipelineTask("MAIN_CAPTURE", 1);
            MAIN_CAPTURE = pipelineTask2;
            PipelineTask pipelineTask3 = new PipelineTask("POST_CAPTURE", 2);
            POST_CAPTURE = pipelineTask3;
            $VALUES = new PipelineTask[]{pipelineTask, pipelineTask2, pipelineTask3};
        }

        public static PipelineTask valueOf(String str) {
            return (PipelineTask) Enum.valueOf(PipelineTask.class, str);
        }

        public static PipelineTask[] values() {
            return (PipelineTask[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.camera.camera2.impl.CapturePipelineImpl$emptyRequestMetadata$1] */
    public CapturePipelineImpl(CaptureConfigAdapter captureConfigAdapter, FlashControl flashControl, TorchControl torchControl, VideoUsageControl videoUsageControl, UseCaseThreads useCaseThreads, ComboRequestListener comboRequestListener, UseTorchAsFlash useTorchAsFlash, CameraPipeCameraProperties cameraPipeCameraProperties, Provider provider, UseCaseGraphContext useCaseGraphContext) {
        captureConfigAdapter.getClass();
        flashControl.getClass();
        torchControl.getClass();
        videoUsageControl.getClass();
        useCaseThreads.getClass();
        comboRequestListener.getClass();
        cameraPipeCameraProperties.getClass();
        provider.getClass();
        useCaseGraphContext.getClass();
        this.configAdapter = captureConfigAdapter;
        this.flashControl = flashControl;
        this.torchControl = torchControl;
        this.videoUsageControl = videoUsageControl;
        this.threads = useCaseThreads;
        this.requestListener = comboRequestListener;
        this.useTorchAsFlash = useTorchAsFlash;
        this.useCaseCameraStateProvider = provider;
        this.useCaseGraphContext = useCaseGraphContext;
        this.hasFlashUnit$delegate = LazyKt.lazy(new CapturePipelineImpl$$ExternalSyntheticLambda1(cameraPipeCameraProperties, 0));
        this.useCaseCameraState$delegate = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(this, 8));
        this.template = 1;
        this.emptyRequestMetadata = new RequestMetadata() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$emptyRequestMetadata$1
            public final Request request;
            public final EmptyMap streams;

            {
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                this.streams = emptyMap;
                this.request = new Request(EmptyList.INSTANCE, (LinkedHashMap) null, (LinkedHashMap) null, (ArrayList) null, (RequestTemplate) null, 62);
            }

            @Override // androidx.camera.camera2.pipe.Metadata
            public final Object get(Metadata.Key key) {
                key.getClass();
                return null;
            }

            @Override // androidx.camera.camera2.pipe.Metadata
            public final Object getOrDefault(Metadata.Key key, TagBundle tagBundle) {
                key.getClass();
                return tagBundle;
            }

            @Override // androidx.camera.camera2.pipe.RequestMetadata
            public final boolean getRepeating() {
                return true;
            }

            @Override // androidx.camera.camera2.pipe.RequestMetadata
            public final Request getRequest() {
                return this.request;
            }

            @Override // androidx.camera.camera2.pipe.RequestMetadata
            /* renamed from: getRequestNumber-my6kx4g, reason: not valid java name */
            public final long mo32getRequestNumbermy6kx4g() {
                return 0L;
            }

            @Override // androidx.camera.camera2.pipe.RequestMetadata
            public final Map getStreams() {
                return this.streams;
            }

            @Override // androidx.camera.camera2.pipe.UnsafeWrapper
            public final Object unwrapAs(KClass kClass) {
                kClass.getClass();
                return null;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.AutoCloseable, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$lockAf(CapturePipelineImpl capturePipelineImpl, long j, boolean z, ContinuationImpl continuationImpl) {
        CapturePipelineImpl$lockAf$1 capturePipelineImpl$lockAf$1;
        int i;
        long j2;
        boolean z2;
        AutoCloseable autoCloseable;
        AutoCloseable autoCloseable2;
        CoroutineSingletons coroutineSingletons;
        ?? r2;
        Object m84lock3AtS25XM$default;
        CapturePipelineImpl$lockAf$1 capturePipelineImpl$lockAf$12;
        AutoCloseable autoCloseable3;
        Throwable th;
        try {
            if (continuationImpl instanceof CapturePipelineImpl$lockAf$1) {
                capturePipelineImpl$lockAf$1 = (CapturePipelineImpl$lockAf$1) continuationImpl;
                int i2 = capturePipelineImpl$lockAf$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    capturePipelineImpl$lockAf$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = capturePipelineImpl$lockAf$1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = capturePipelineImpl$lockAf$1.label;
                    int i3 = 2;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        CameraGraphImpl graph = capturePipelineImpl.useCaseGraphContext.getGraph();
                        j2 = j;
                        capturePipelineImpl$lockAf$1.J$0 = j2;
                        z2 = z;
                        capturePipelineImpl$lockAf$1.Z$0 = z2;
                        capturePipelineImpl$lockAf$1.label = 1;
                        obj = graph.acquireSession(capturePipelineImpl$lockAf$1);
                        if (obj == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    SafeTrace.throwOnFailure(obj);
                                    return obj;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            autoCloseable2 = capturePipelineImpl$lockAf$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                coroutineSingletons = coroutineSingletons2;
                                autoCloseable3 = autoCloseable2;
                                capturePipelineImpl$lockAf$12 = capturePipelineImpl$lockAf$1;
                                r2 = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    Cache.Companion.closeFinally(autoCloseable2, th);
                                    throw th3;
                                }
                            }
                            try {
                                Deferred deferred = (Deferred) obj;
                                Cache.Companion.closeFinally(autoCloseable3, r2);
                                capturePipelineImpl$lockAf$12.L$0 = r2;
                                capturePipelineImpl$lockAf$12.label = 3;
                                Object await = deferred.await(capturePipelineImpl$lockAf$12);
                                return await != coroutineSingletons ? coroutineSingletons : await;
                            } catch (Throwable th4) {
                                th = th4;
                                autoCloseable2 = autoCloseable3;
                                throw th;
                            }
                        }
                        z2 = capturePipelineImpl$lockAf$1.Z$0;
                        j2 = capturePipelineImpl$lockAf$1.J$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    long j3 = j2;
                    autoCloseable = (AutoCloseable) obj;
                    Lock3ABehavior lock3ABehavior = new Lock3ABehavior(2);
                    SliderKt$$ExternalSyntheticLambda5 sliderKt$$ExternalSyntheticLambda5 = new SliderKt$$ExternalSyntheticLambda5(capturePipelineImpl, z2, i3);
                    capturePipelineImpl$lockAf$1.L$0 = autoCloseable;
                    capturePipelineImpl$lockAf$1.label = 2;
                    coroutineSingletons = coroutineSingletons2;
                    CapturePipelineImpl$lockAf$1 capturePipelineImpl$lockAf$13 = capturePipelineImpl$lockAf$1;
                    r2 = 0;
                    m84lock3AtS25XM$default = CameraGraphSessionImpl.m84lock3AtS25XM$default((CameraGraphSessionImpl) autoCloseable, null, null, null, null, lock3ABehavior, null, null, sliderKt$$ExternalSyntheticLambda5, j3, 1000000000L, capturePipelineImpl$lockAf$13, 6719);
                    capturePipelineImpl$lockAf$12 = capturePipelineImpl$lockAf$13;
                    if (m84lock3AtS25XM$default != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    autoCloseable3 = autoCloseable;
                    obj = m84lock3AtS25XM$default;
                    Deferred deferred2 = (Deferred) obj;
                    Cache.Companion.closeFinally(autoCloseable3, r2);
                    capturePipelineImpl$lockAf$12.L$0 = r2;
                    capturePipelineImpl$lockAf$12.label = 3;
                    Object await2 = deferred2.await(capturePipelineImpl$lockAf$12);
                    if (await2 != coroutineSingletons) {
                    }
                }
            }
            Lock3ABehavior lock3ABehavior2 = new Lock3ABehavior(2);
            SliderKt$$ExternalSyntheticLambda5 sliderKt$$ExternalSyntheticLambda52 = new SliderKt$$ExternalSyntheticLambda5(capturePipelineImpl, z2, i3);
            capturePipelineImpl$lockAf$1.L$0 = autoCloseable;
            capturePipelineImpl$lockAf$1.label = 2;
            coroutineSingletons = coroutineSingletons2;
            CapturePipelineImpl$lockAf$1 capturePipelineImpl$lockAf$132 = capturePipelineImpl$lockAf$1;
            r2 = 0;
            m84lock3AtS25XM$default = CameraGraphSessionImpl.m84lock3AtS25XM$default((CameraGraphSessionImpl) autoCloseable, null, null, null, null, lock3ABehavior2, null, null, sliderKt$$ExternalSyntheticLambda52, j3, 1000000000L, capturePipelineImpl$lockAf$132, 6719);
            capturePipelineImpl$lockAf$12 = capturePipelineImpl$lockAf$132;
            if (m84lock3AtS25XM$default != coroutineSingletons) {
            }
        } catch (Throwable th5) {
            th = th5;
            autoCloseable2 = autoCloseable;
            th = th;
            throw th;
        }
        capturePipelineImpl$lockAf$1 = new CapturePipelineImpl$lockAf$1(capturePipelineImpl, continuationImpl);
        Object obj2 = capturePipelineImpl$lockAf$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = capturePipelineImpl$lockAf$1.label;
        int i32 = 2;
        if (i != 0) {
        }
        long j32 = j2;
        autoCloseable = (AutoCloseable) obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.camera.camera2.impl.CapturePipelineImpl] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$unlockAf(CapturePipelineImpl capturePipelineImpl, long j, ContinuationImpl continuationImpl) {
        CapturePipelineImpl$unlockAf$1 capturePipelineImpl$unlockAf$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        try {
            if (continuationImpl instanceof CapturePipelineImpl$unlockAf$1) {
                capturePipelineImpl$unlockAf$1 = (CapturePipelineImpl$unlockAf$1) continuationImpl;
                int i2 = capturePipelineImpl$unlockAf$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    capturePipelineImpl$unlockAf$1.label = i2 - PKIFailureInfo.systemUnavail;
                    obj = capturePipelineImpl$unlockAf$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = capturePipelineImpl$unlockAf$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        CameraGraphImpl graph = capturePipelineImpl.useCaseGraphContext.getGraph();
                        capturePipelineImpl$unlockAf$1.J$0 = j;
                        capturePipelineImpl$unlockAf$1.label = 1;
                        obj = graph.acquireSession(capturePipelineImpl$unlockAf$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    SafeTrace.throwOnFailure(obj);
                                    return obj;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            AutoCloseable autoCloseable = capturePipelineImpl$unlockAf$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            capturePipelineImpl = autoCloseable;
                            Deferred deferred = (Deferred) obj;
                            Cache.Companion.closeFinally(capturePipelineImpl, null);
                            capturePipelineImpl$unlockAf$1.L$0 = null;
                            capturePipelineImpl$unlockAf$1.label = 3;
                            Object await = deferred.await(capturePipelineImpl$unlockAf$1);
                            return await == coroutineSingletons ? coroutineSingletons : await;
                        }
                        j = capturePipelineImpl$unlockAf$1.J$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    AutoCloseable autoCloseable2 = (AutoCloseable) obj;
                    capturePipelineImpl$unlockAf$1.L$0 = autoCloseable2;
                    capturePipelineImpl$unlockAf$1.label = 2;
                    obj = CameraGraphSessionImpl.unlock3A$default((CameraGraphSessionImpl) autoCloseable2, j, 29);
                    capturePipelineImpl = autoCloseable2;
                    if (obj == coroutineSingletons) {
                    }
                    Deferred deferred2 = (Deferred) obj;
                    Cache.Companion.closeFinally(capturePipelineImpl, null);
                    capturePipelineImpl$unlockAf$1.L$0 = null;
                    capturePipelineImpl$unlockAf$1.label = 3;
                    Object await2 = deferred2.await(capturePipelineImpl$unlockAf$1);
                    if (await2 == coroutineSingletons) {
                    }
                }
            }
            if (i != 0) {
            }
            AutoCloseable autoCloseable22 = (AutoCloseable) obj;
            capturePipelineImpl$unlockAf$1.L$0 = autoCloseable22;
            capturePipelineImpl$unlockAf$1.label = 2;
            obj = CameraGraphSessionImpl.unlock3A$default((CameraGraphSessionImpl) autoCloseable22, j, 29);
            capturePipelineImpl = autoCloseable22;
            if (obj == coroutineSingletons) {
            }
            Deferred deferred22 = (Deferred) obj;
            Cache.Companion.closeFinally(capturePipelineImpl, null);
            capturePipelineImpl$unlockAf$1.L$0 = null;
            capturePipelineImpl$unlockAf$1.label = 3;
            Object await22 = deferred22.await(capturePipelineImpl$unlockAf$1);
            if (await22 == coroutineSingletons) {
            }
        } finally {
        }
        capturePipelineImpl$unlockAf$1 = new CapturePipelineImpl$unlockAf$1(capturePipelineImpl, continuationImpl);
        obj = capturePipelineImpl$unlockAf$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = capturePipelineImpl$unlockAf$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x013e A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:13:0x003e, B:14:0x0138, B:16:0x013e), top: B:12:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9 A[Catch: all -> 0x00ef, TryCatch #3 {all -> 0x00ef, blocks: (B:63:0x00e0, B:65:0x00e9, B:70:0x00fe), top: B:62:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object aePreCaptureApplyCapture(MainCaptureParams mainCaptureParams, long j, int i, List list, ContinuationImpl continuationImpl) {
        CapturePipelineImpl$aePreCaptureApplyCapture$1 capturePipelineImpl$aePreCaptureApplyCapture$1;
        CoroutineSingletons coroutineSingletons;
        int i2;
        MainCaptureParams mainCaptureParams2;
        int i3;
        CapturePipelineImpl capturePipelineImpl;
        MainCaptureParams mainCaptureParams3;
        long j2;
        int i4;
        CapturePipelineImpl capturePipelineImpl2;
        AutoCloseable autoCloseable;
        Throwable th;
        AutoCloseable autoCloseable2;
        CompletableDeferredImpl lock3AForCapture$default;
        AutoCloseable autoCloseable3;
        MainCaptureParams mainCaptureParams4;
        List list2;
        int i5;
        CapturePipelineImpl capturePipelineImpl3;
        List list3;
        ?? r2;
        List listOf;
        List list4 = list;
        try {
            if (continuationImpl instanceof CapturePipelineImpl$aePreCaptureApplyCapture$1) {
                capturePipelineImpl$aePreCaptureApplyCapture$1 = (CapturePipelineImpl$aePreCaptureApplyCapture$1) continuationImpl;
                int i6 = capturePipelineImpl$aePreCaptureApplyCapture$1.label;
                if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                    capturePipelineImpl$aePreCaptureApplyCapture$1.label = i6 - PKIFailureInfo.systemUnavail;
                    Object obj = capturePipelineImpl$aePreCaptureApplyCapture$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = capturePipelineImpl$aePreCaptureApplyCapture$1.label;
                    int i7 = 3;
                    if (i2 != 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture");
                        }
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: tasks = " + list4);
                        }
                        if (!list4.contains(PipelineTask.PRE_CAPTURE)) {
                            mainCaptureParams2 = mainCaptureParams;
                            i3 = i;
                            capturePipelineImpl = this;
                            if (list4.contains(PipelineTask.MAIN_CAPTURE)) {
                            }
                            if (list4.contains(PipelineTask.POST_CAPTURE)) {
                            }
                            return listOf;
                        }
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting PRE_CAPTURE");
                        }
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Acquiring session for locking 3A");
                        }
                        CameraGraphImpl graph = this.useCaseGraphContext.getGraph();
                        capturePipelineImpl$aePreCaptureApplyCapture$1.L$0 = this;
                        capturePipelineImpl$aePreCaptureApplyCapture$1.L$1 = list4;
                        mainCaptureParams3 = mainCaptureParams;
                        capturePipelineImpl$aePreCaptureApplyCapture$1.L$2 = mainCaptureParams3;
                        j2 = j;
                        capturePipelineImpl$aePreCaptureApplyCapture$1.J$0 = j2;
                        i4 = i;
                        capturePipelineImpl$aePreCaptureApplyCapture$1.I$0 = i4;
                        capturePipelineImpl$aePreCaptureApplyCapture$1.label = 1;
                        obj = graph.acquireSession(capturePipelineImpl$aePreCaptureApplyCapture$1);
                        if (obj != coroutineSingletons) {
                            capturePipelineImpl2 = this;
                        }
                        return coroutineSingletons;
                    }
                    if (i2 != 1) {
                        if (i2 == 2) {
                            i5 = capturePipelineImpl$aePreCaptureApplyCapture$1.I$0;
                            autoCloseable3 = capturePipelineImpl$aePreCaptureApplyCapture$1.L$3;
                            mainCaptureParams4 = capturePipelineImpl$aePreCaptureApplyCapture$1.L$2;
                            list2 = capturePipelineImpl$aePreCaptureApplyCapture$1.L$1;
                            capturePipelineImpl3 = capturePipelineImpl$aePreCaptureApplyCapture$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                capturePipelineImpl$aePreCaptureApplyCapture$1.L$0 = capturePipelineImpl3;
                                capturePipelineImpl$aePreCaptureApplyCapture$1.L$1 = list2;
                                capturePipelineImpl$aePreCaptureApplyCapture$1.L$2 = mainCaptureParams4;
                                capturePipelineImpl$aePreCaptureApplyCapture$1.L$3 = autoCloseable3;
                                capturePipelineImpl$aePreCaptureApplyCapture$1.I$0 = i5;
                                i7 = 3;
                                capturePipelineImpl$aePreCaptureApplyCapture$1.label = 3;
                                if (((Deferred) obj).join(capturePipelineImpl$aePreCaptureApplyCapture$1) != coroutineSingletons) {
                                    autoCloseable2 = autoCloseable3;
                                    mainCaptureParams2 = mainCaptureParams4;
                                    list3 = list2;
                                    capturePipelineImpl = capturePipelineImpl3;
                                    if (StringUtilsKt.isLogLevelEnabled(i7, "CXCP")) {
                                    }
                                    Cache.Companion.closeFinally(autoCloseable2, null);
                                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                    }
                                    i3 = i5;
                                    list4 = list3;
                                    if (list4.contains(PipelineTask.MAIN_CAPTURE)) {
                                    }
                                    if (list4.contains(PipelineTask.POST_CAPTURE)) {
                                    }
                                    return listOf;
                                }
                                return coroutineSingletons;
                            } catch (Throwable th2) {
                                th = th2;
                                autoCloseable2 = autoCloseable3;
                                throw th;
                            }
                        }
                        if (i2 != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i5 = capturePipelineImpl$aePreCaptureApplyCapture$1.I$0;
                        autoCloseable2 = capturePipelineImpl$aePreCaptureApplyCapture$1.L$3;
                        mainCaptureParams2 = capturePipelineImpl$aePreCaptureApplyCapture$1.L$2;
                        list3 = capturePipelineImpl$aePreCaptureApplyCapture$1.L$1;
                        capturePipelineImpl = capturePipelineImpl$aePreCaptureApplyCapture$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            if (StringUtilsKt.isLogLevelEnabled(i7, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Locking 3A for capture done");
                            }
                            Cache.Companion.closeFinally(autoCloseable2, null);
                            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                            }
                            i3 = i5;
                            list4 = list3;
                            if (list4.contains(PipelineTask.MAIN_CAPTURE)) {
                                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                                }
                                if (mainCaptureParams2 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                                    return null;
                                }
                                ArrayList submitRequestInternal = capturePipelineImpl.submitRequestInternal(mainCaptureParams2);
                                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                                }
                                listOf = submitRequestInternal;
                                r2 = 0;
                            } else {
                                r2 = 0;
                                listOf = CollectionsKt__CollectionsJVMKt.listOf(JobKt.CompletableDeferred(null));
                            }
                            if (list4.contains(PipelineTask.POST_CAPTURE)) {
                                JobKt.launch$default(capturePipelineImpl.threads.sequentialScope, r2, r2, new GovernmentIdFeed$analyze$5(listOf, (Continuation) r2, this, i3), 3);
                            }
                            return listOf;
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                Cache.Companion.closeFinally(autoCloseable2, th);
                                throw th4;
                            }
                        }
                    }
                    int i8 = capturePipelineImpl$aePreCaptureApplyCapture$1.I$0;
                    j2 = capturePipelineImpl$aePreCaptureApplyCapture$1.J$0;
                    mainCaptureParams3 = capturePipelineImpl$aePreCaptureApplyCapture$1.L$2;
                    List list5 = capturePipelineImpl$aePreCaptureApplyCapture$1.L$1;
                    capturePipelineImpl2 = capturePipelineImpl$aePreCaptureApplyCapture$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    i4 = i8;
                    list4 = list5;
                    autoCloseable = (AutoCloseable) obj;
                    CameraGraphSessionImpl cameraGraphSessionImpl = (CameraGraphSessionImpl) autoCloseable;
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#aePreCaptureApplyCapture: Locking 3A for capture");
                    }
                    boolean z = i4 != 0;
                    boolean z2 = i4 != 0;
                    capturePipelineImpl$aePreCaptureApplyCapture$1.L$0 = capturePipelineImpl2;
                    capturePipelineImpl$aePreCaptureApplyCapture$1.L$1 = list4;
                    capturePipelineImpl$aePreCaptureApplyCapture$1.L$2 = mainCaptureParams3;
                    capturePipelineImpl$aePreCaptureApplyCapture$1.L$3 = autoCloseable;
                    capturePipelineImpl$aePreCaptureApplyCapture$1.I$0 = i4;
                    capturePipelineImpl$aePreCaptureApplyCapture$1.label = 2;
                    lock3AForCapture$default = CameraGraphSessionImpl.lock3AForCapture$default(cameraGraphSessionImpl, z, z2, j2);
                    if (lock3AForCapture$default != coroutineSingletons) {
                        MainCaptureParams mainCaptureParams5 = mainCaptureParams3;
                        autoCloseable3 = autoCloseable;
                        obj = lock3AForCapture$default;
                        mainCaptureParams4 = mainCaptureParams5;
                        list2 = list4;
                        i5 = i4;
                        capturePipelineImpl3 = capturePipelineImpl2;
                        capturePipelineImpl$aePreCaptureApplyCapture$1.L$0 = capturePipelineImpl3;
                        capturePipelineImpl$aePreCaptureApplyCapture$1.L$1 = list2;
                        capturePipelineImpl$aePreCaptureApplyCapture$1.L$2 = mainCaptureParams4;
                        capturePipelineImpl$aePreCaptureApplyCapture$1.L$3 = autoCloseable3;
                        capturePipelineImpl$aePreCaptureApplyCapture$1.I$0 = i5;
                        i7 = 3;
                        capturePipelineImpl$aePreCaptureApplyCapture$1.label = 3;
                        if (((Deferred) obj).join(capturePipelineImpl$aePreCaptureApplyCapture$1) != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            CameraGraphSessionImpl cameraGraphSessionImpl2 = (CameraGraphSessionImpl) autoCloseable;
            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            }
            if (i4 != 0) {
            }
            if (i4 != 0) {
            }
            capturePipelineImpl$aePreCaptureApplyCapture$1.L$0 = capturePipelineImpl2;
            capturePipelineImpl$aePreCaptureApplyCapture$1.L$1 = list4;
            capturePipelineImpl$aePreCaptureApplyCapture$1.L$2 = mainCaptureParams3;
            capturePipelineImpl$aePreCaptureApplyCapture$1.L$3 = autoCloseable;
            capturePipelineImpl$aePreCaptureApplyCapture$1.I$0 = i4;
            capturePipelineImpl$aePreCaptureApplyCapture$1.label = 2;
            lock3AForCapture$default = CameraGraphSessionImpl.lock3AForCapture$default(cameraGraphSessionImpl2, z, z2, j2);
            if (lock3AForCapture$default != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th5) {
            th = th5;
            autoCloseable2 = autoCloseable;
            throw th;
        }
        capturePipelineImpl$aePreCaptureApplyCapture$1 = new CapturePipelineImpl$aePreCaptureApplyCapture$1(this, continuationImpl);
        Object obj2 = capturePipelineImpl$aePreCaptureApplyCapture$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = capturePipelineImpl$aePreCaptureApplyCapture$1.label;
        int i72 = 3;
        if (i2 != 0) {
        }
        autoCloseable = (AutoCloseable) obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0070, code lost:
    
        if (r13 == r0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object defaultCapture(MainCaptureParams mainCaptureParams, int i, int i2, List list, ContinuationImpl continuationImpl) {
        CapturePipelineImpl$defaultCapture$1 capturePipelineImpl$defaultCapture$1;
        CapturePipelineImpl$defaultCapture$1 capturePipelineImpl$defaultCapture$12;
        Object obj;
        int i3;
        MainCaptureParams mainCaptureParams2;
        int i4;
        boolean booleanValue;
        long j;
        Object aePreCaptureApplyCapture;
        if (continuationImpl instanceof CapturePipelineImpl$defaultCapture$1) {
            capturePipelineImpl$defaultCapture$1 = (CapturePipelineImpl$defaultCapture$1) continuationImpl;
            int i5 = capturePipelineImpl$defaultCapture$1.label;
            if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                capturePipelineImpl$defaultCapture$1.label = i5 - PKIFailureInfo.systemUnavail;
                capturePipelineImpl$defaultCapture$12 = capturePipelineImpl$defaultCapture$1;
                Object obj2 = capturePipelineImpl$defaultCapture$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = capturePipelineImpl$defaultCapture$12.label;
                if (i3 != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    if (((Boolean) this.hasFlashUnit$delegate.getValue()).booleanValue()) {
                        capturePipelineImpl$defaultCapture$12.L$0 = mainCaptureParams;
                        capturePipelineImpl$defaultCapture$12.L$1 = list;
                        capturePipelineImpl$defaultCapture$12.I$0 = i;
                        capturePipelineImpl$defaultCapture$12.label = 1;
                        obj2 = isPhysicalFlashRequired(i2, capturePipelineImpl$defaultCapture$12);
                    } else {
                        capturePipelineImpl$defaultCapture$12.label = 4;
                        Object defaultNoFlashCapture = defaultNoFlashCapture(mainCaptureParams, i, list, capturePipelineImpl$defaultCapture$12);
                        if (defaultNoFlashCapture != obj) {
                            return defaultNoFlashCapture;
                        }
                    }
                    return obj;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        SafeTrace.throwOnFailure(obj2);
                        return obj2;
                    }
                    if (i3 == 3) {
                        SafeTrace.throwOnFailure(obj2);
                        return obj2;
                    }
                    if (i3 == 4) {
                        SafeTrace.throwOnFailure(obj2);
                        return obj2;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = capturePipelineImpl$defaultCapture$12.I$0;
                list = capturePipelineImpl$defaultCapture$12.L$1;
                mainCaptureParams = capturePipelineImpl$defaultCapture$12.L$0;
                SafeTrace.throwOnFailure(obj2);
                mainCaptureParams2 = mainCaptureParams;
                i4 = i;
                booleanValue = ((Boolean) obj2).booleanValue();
                j = !booleanValue ? 5000000000L : 1000000000L;
                if (!booleanValue || i4 == 0) {
                    capturePipelineImpl$defaultCapture$12.L$0 = null;
                    capturePipelineImpl$defaultCapture$12.L$1 = null;
                    capturePipelineImpl$defaultCapture$12.label = 2;
                    aePreCaptureApplyCapture = aePreCaptureApplyCapture(mainCaptureParams2, j, i4, list, capturePipelineImpl$defaultCapture$12);
                    if (aePreCaptureApplyCapture != obj) {
                        return aePreCaptureApplyCapture;
                    }
                } else {
                    capturePipelineImpl$defaultCapture$12.L$0 = null;
                    capturePipelineImpl$defaultCapture$12.L$1 = null;
                    capturePipelineImpl$defaultCapture$12.label = 3;
                    Object defaultNoFlashCapture2 = defaultNoFlashCapture(mainCaptureParams2, i4, list, capturePipelineImpl$defaultCapture$12);
                    if (defaultNoFlashCapture2 != obj) {
                        return defaultNoFlashCapture2;
                    }
                }
                return obj;
            }
        }
        capturePipelineImpl$defaultCapture$1 = new CapturePipelineImpl$defaultCapture$1(this, continuationImpl);
        capturePipelineImpl$defaultCapture$12 = capturePipelineImpl$defaultCapture$1;
        Object obj22 = capturePipelineImpl$defaultCapture$12.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = capturePipelineImpl$defaultCapture$12.label;
        if (i3 != 0) {
        }
        mainCaptureParams2 = mainCaptureParams;
        i4 = i;
        booleanValue = ((Boolean) obj22).booleanValue();
        if (!booleanValue) {
        }
        if (booleanValue) {
        }
        capturePipelineImpl$defaultCapture$12.L$0 = null;
        capturePipelineImpl$defaultCapture$12.L$1 = null;
        capturePipelineImpl$defaultCapture$12.label = 2;
        aePreCaptureApplyCapture = aePreCaptureApplyCapture(mainCaptureParams2, j, i4, list, capturePipelineImpl$defaultCapture$12);
        if (aePreCaptureApplyCapture != obj) {
            return obj;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object defaultNoFlashCapture(MainCaptureParams mainCaptureParams, int i, List list, ContinuationImpl continuationImpl) {
        CapturePipelineImpl$defaultNoFlashCapture$1 capturePipelineImpl$defaultNoFlashCapture$1;
        int i2;
        int i3;
        CapturePipelineImpl capturePipelineImpl;
        MainCaptureParams mainCaptureParams2;
        Object listOf;
        List list2 = list;
        if (continuationImpl instanceof CapturePipelineImpl$defaultNoFlashCapture$1) {
            capturePipelineImpl$defaultNoFlashCapture$1 = (CapturePipelineImpl$defaultNoFlashCapture$1) continuationImpl;
            int i4 = capturePipelineImpl$defaultNoFlashCapture$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                capturePipelineImpl$defaultNoFlashCapture$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = capturePipelineImpl$defaultNoFlashCapture$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = capturePipelineImpl$defaultNoFlashCapture$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#defaultNoFlashCapture");
                    }
                    i3 = i == 0 ? 1 : 0;
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: tasks = " + list2);
                    }
                    if (list2.contains(PipelineTask.PRE_CAPTURE)) {
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting PRE_CAPTURE");
                        }
                        if (i3 == 0) {
                            capturePipelineImpl = this;
                            mainCaptureParams2 = mainCaptureParams;
                            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                            }
                            Continuation continuation = null;
                            if (list2.contains(PipelineTask.MAIN_CAPTURE)) {
                                listOf = CollectionsKt__CollectionsJVMKt.listOf(JobKt.CompletableDeferred(null));
                            } else {
                                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                                }
                                if (mainCaptureParams2 == null) {
                                    a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                                    return null;
                                }
                                listOf = capturePipelineImpl.submitRequestInternal(mainCaptureParams2);
                                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                                }
                            }
                            if (list2.contains(PipelineTask.POST_CAPTURE)) {
                                return listOf;
                            }
                            ContextScope contextScope = capturePipelineImpl.threads.sequentialScope;
                            boolean z = i3 != 0;
                            Object obj2 = listOf;
                            JobKt.launch$default(contextScope, null, null, new RoomDatabase$performClear$1(obj2, continuation, z, this, 1), 3);
                            return obj2;
                        }
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#defaultNoFlashCapture: Locking 3A");
                        }
                        capturePipelineImpl$defaultNoFlashCapture$1.L$0 = this;
                        capturePipelineImpl$defaultNoFlashCapture$1.L$1 = list2;
                        capturePipelineImpl$defaultNoFlashCapture$1.L$2 = mainCaptureParams;
                        capturePipelineImpl$defaultNoFlashCapture$1.I$0 = i3;
                        capturePipelineImpl$defaultNoFlashCapture$1.label = 1;
                        if (access$lockAf(this, 1000000000L, false, capturePipelineImpl$defaultNoFlashCapture$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        capturePipelineImpl = this;
                        mainCaptureParams2 = mainCaptureParams;
                    } else {
                        capturePipelineImpl = this;
                        mainCaptureParams2 = mainCaptureParams;
                        Continuation continuation2 = null;
                        if (list2.contains(PipelineTask.MAIN_CAPTURE)) {
                        }
                        if (list2.contains(PipelineTask.POST_CAPTURE)) {
                        }
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = capturePipelineImpl$defaultNoFlashCapture$1.I$0;
                    mainCaptureParams2 = capturePipelineImpl$defaultNoFlashCapture$1.L$2;
                    List list3 = capturePipelineImpl$defaultNoFlashCapture$1.L$1;
                    capturePipelineImpl = capturePipelineImpl$defaultNoFlashCapture$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    i3 = i5;
                    list2 = list3;
                }
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#defaultNoFlashCapture: Locking 3A done");
                }
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                }
                Continuation continuation22 = null;
                if (list2.contains(PipelineTask.MAIN_CAPTURE)) {
                }
                if (list2.contains(PipelineTask.POST_CAPTURE)) {
                }
            }
        }
        capturePipelineImpl$defaultNoFlashCapture$1 = new CapturePipelineImpl$defaultNoFlashCapture$1(this, continuationImpl);
        Object obj3 = capturePipelineImpl$defaultNoFlashCapture$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = capturePipelineImpl$defaultNoFlashCapture$1.label;
        if (i2 != 0) {
        }
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
        }
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
        }
        Continuation continuation222 = null;
        if (list2.contains(PipelineTask.MAIN_CAPTURE)) {
        }
        if (list2.contains(PipelineTask.POST_CAPTURE)) {
        }
    }

    @Override // androidx.camera.camera2.impl.CapturePipeline
    public final CapturePipelineImpl$getCameraCapturePipeline$2 getCameraCapturePipeline(int i, int i2) {
        return new CapturePipelineImpl$getCameraCapturePipeline$2(this, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getFrameMetadata(ContinuationImpl continuationImpl) {
        CapturePipelineImpl$getFrameMetadata$1 capturePipelineImpl$getFrameMetadata$1;
        int i;
        CapturePipelineImpl capturePipelineImpl;
        if (continuationImpl instanceof CapturePipelineImpl$getFrameMetadata$1) {
            capturePipelineImpl$getFrameMetadata$1 = (CapturePipelineImpl$getFrameMetadata$1) continuationImpl;
            int i2 = capturePipelineImpl$getFrameMetadata$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                capturePipelineImpl$getFrameMetadata$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = capturePipelineImpl$getFrameMetadata$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = capturePipelineImpl$getFrameMetadata$1.label;
                int i3 = 3;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (this.frameMetadata == null) {
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "getFrameMetadata: waiting for result");
                        }
                        capturePipelineImpl$getFrameMetadata$1.L$0 = this;
                        capturePipelineImpl$getFrameMetadata$1.label = 1;
                        obj = waitForResult(1000000000L, new BorderKt$$ExternalSyntheticLambda1(i3), capturePipelineImpl$getFrameMetadata$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        capturePipelineImpl = this;
                    }
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "getFrameMetadata: frameMetadata = " + this.frameMetadata);
                    }
                    return this.frameMetadata;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                capturePipelineImpl = capturePipelineImpl$getFrameMetadata$1.L$0;
                SafeTrace.throwOnFailure(obj);
                FrameInfo frameInfo = (FrameInfo) obj;
                capturePipelineImpl.frameMetadata = frameInfo != null ? frameInfo.getMetadata() : null;
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                }
                return this.frameMetadata;
            }
        }
        capturePipelineImpl$getFrameMetadata$1 = new CapturePipelineImpl$getFrameMetadata$1(this, continuationImpl);
        Object obj2 = capturePipelineImpl$getFrameMetadata$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = capturePipelineImpl$getFrameMetadata$1.label;
        int i32 = 3;
        if (i != 0) {
        }
        FrameInfo frameInfo2 = (FrameInfo) obj2;
        capturePipelineImpl.frameMetadata = frameInfo2 != null ? frameInfo2.getMetadata() : null;
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
        }
        return this.frameMetadata;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c6, code lost:
    
        if (r15 == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeCaptureTasks(List list, int i, int i2, int i3, MainCaptureParams mainCaptureParams, ContinuationImpl continuationImpl) {
        CapturePipelineImpl$invokeCaptureTasks$1 capturePipelineImpl$invokeCaptureTasks$1;
        Object obj;
        int i4;
        Object obj2;
        if (continuationImpl instanceof CapturePipelineImpl$invokeCaptureTasks$1) {
            capturePipelineImpl$invokeCaptureTasks$1 = (CapturePipelineImpl$invokeCaptureTasks$1) continuationImpl;
            int i5 = capturePipelineImpl$invokeCaptureTasks$1.label;
            if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                capturePipelineImpl$invokeCaptureTasks$1.label = i5 - PKIFailureInfo.systemUnavail;
                obj = capturePipelineImpl$invokeCaptureTasks$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = capturePipelineImpl$invokeCaptureTasks$1.label;
                int i6 = 1;
                Continuation continuation = null;
                if (i4 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#invokeCaptureTasks: tasks = " + list + ", captureMode = " + i + ", flashMode = " + i2 + ", flashType = " + i3);
                    }
                    this.frameMetadata = null;
                    if (list.contains(PipelineTask.MAIN_CAPTURE) && mainCaptureParams == null) {
                        a$$ExternalSyntheticBUOutline0.m$1("Must not be null for PipelineType.MAIN_CAPTURE");
                        return null;
                    }
                    if (i2 == 3) {
                        capturePipelineImpl$invokeCaptureTasks$1.label = 1;
                        Object screenFlashCapture = screenFlashCapture(mainCaptureParams, i, list, capturePipelineImpl$invokeCaptureTasks$1);
                        if (screenFlashCapture != obj3) {
                            return screenFlashCapture;
                        }
                    } else {
                        capturePipelineImpl$invokeCaptureTasks$1.L$0 = list;
                        capturePipelineImpl$invokeCaptureTasks$1.L$1 = mainCaptureParams;
                        capturePipelineImpl$invokeCaptureTasks$1.I$0 = i;
                        capturePipelineImpl$invokeCaptureTasks$1.I$1 = i2;
                        capturePipelineImpl$invokeCaptureTasks$1.label = 2;
                        if (this.template == 3 || i3 == 1) {
                            obj2 = Boolean.TRUE;
                        } else {
                            obj2 = this.useTorchAsFlash.shouldUseTorchAsFlash(new Scene.AnonymousClass1(this, continuation, i6), capturePipelineImpl$invokeCaptureTasks$1);
                        }
                        obj = obj2;
                    }
                    return obj3;
                }
                if (i4 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                if (i4 != 2) {
                    if (i4 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    if (i4 == 4) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = capturePipelineImpl$invokeCaptureTasks$1.I$1;
                i = capturePipelineImpl$invokeCaptureTasks$1.I$0;
                mainCaptureParams = capturePipelineImpl$invokeCaptureTasks$1.L$1;
                list = capturePipelineImpl$invokeCaptureTasks$1.L$0;
                SafeTrace.throwOnFailure(obj);
                List list2 = list;
                MainCaptureParams mainCaptureParams2 = mainCaptureParams;
                if (((Boolean) obj).booleanValue()) {
                    CapturePipelineImpl$invokeCaptureTasks$1 capturePipelineImpl$invokeCaptureTasks$12 = capturePipelineImpl$invokeCaptureTasks$1;
                    capturePipelineImpl$invokeCaptureTasks$12.L$0 = null;
                    capturePipelineImpl$invokeCaptureTasks$12.L$1 = null;
                    capturePipelineImpl$invokeCaptureTasks$12.label = 4;
                    Object defaultCapture = defaultCapture(mainCaptureParams2, i, i2, list2, capturePipelineImpl$invokeCaptureTasks$12);
                    if (defaultCapture != obj3) {
                        return defaultCapture;
                    }
                } else {
                    capturePipelineImpl$invokeCaptureTasks$1.L$0 = null;
                    capturePipelineImpl$invokeCaptureTasks$1.L$1 = null;
                    capturePipelineImpl$invokeCaptureTasks$1.label = 3;
                    Object obj4 = torchAsFlashCapture(mainCaptureParams2, i, i2, list2, capturePipelineImpl$invokeCaptureTasks$1);
                    if (obj4 != obj3) {
                        return obj4;
                    }
                }
                return obj3;
            }
        }
        capturePipelineImpl$invokeCaptureTasks$1 = new CapturePipelineImpl$invokeCaptureTasks$1(this, continuationImpl);
        obj = capturePipelineImpl$invokeCaptureTasks$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = capturePipelineImpl$invokeCaptureTasks$1.label;
        int i62 = 1;
        Continuation continuation2 = null;
        if (i4 != 0) {
        }
        List list22 = list;
        MainCaptureParams mainCaptureParams22 = mainCaptureParams;
        if (((Boolean) obj).booleanValue()) {
        }
        return obj32;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0055, code lost:
    
        if (r9.flashControl.stopScreenFlashCaptureTasks(r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:13:0x002e, B:14:0x009e, B:16:0x00a4), top: B:12:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[Catch: all -> 0x0089, TryCatch #2 {all -> 0x0089, blocks: (B:33:0x0079, B:35:0x0082, B:38:0x0092), top: B:32:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeScreenFlashPostCaptureTasks(int i, ContinuationImpl continuationImpl) {
        CapturePipelineImpl$invokeScreenFlashPostCaptureTasks$1 capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i2;
        int i3;
        AutoCloseable autoCloseable;
        Throwable th;
        AutoCloseable autoCloseable2;
        CameraGraphSessionImpl cameraGraphSessionImpl;
        if (continuationImpl instanceof CapturePipelineImpl$invokeScreenFlashPostCaptureTasks$1) {
            capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1 = (CapturePipelineImpl$invokeScreenFlashPostCaptureTasks$1) continuationImpl;
            int i4 = capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.label = i4 - PKIFailureInfo.systemUnavail;
                obj = capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.label;
                boolean z = true;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.I$0 = i;
                    capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.label = 1;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            autoCloseable2 = capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                    Log.d("CXCP", "screenFlashPostCapture: Unlocking 3A done");
                                }
                                Cache.Companion.closeFinally(autoCloseable2, null);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    Cache.Companion.closeFinally(autoCloseable2, th);
                                    throw th3;
                                }
                            }
                        }
                        i3 = capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.I$0;
                        SafeTrace.throwOnFailure(obj);
                        autoCloseable = (AutoCloseable) obj;
                        try {
                            cameraGraphSessionImpl = (CameraGraphSessionImpl) autoCloseable;
                            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                Log.d("CXCP", "screenFlashPostCapture: Unlocking 3A");
                            }
                            if (i3 == 0) {
                                z = false;
                            }
                            capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.L$0 = autoCloseable;
                            capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.label = 3;
                            if (cameraGraphSessionImpl.unlock3APostCapture(z) != coroutineSingletons) {
                                autoCloseable2 = autoCloseable;
                                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                }
                                Cache.Companion.closeFinally(autoCloseable2, null);
                                return Unit.INSTANCE;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th4) {
                            th = th4;
                            autoCloseable2 = autoCloseable;
                            throw th;
                        }
                    }
                    i = capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.I$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "screenFlashPostCapture: Acquiring session for unlocking 3A");
                }
                CameraGraphImpl graph = this.useCaseGraphContext.getGraph();
                capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.I$0 = i;
                capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.label = 2;
                obj = graph.acquireSession(capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1);
                if (obj != coroutineSingletons) {
                    i3 = i;
                    autoCloseable = (AutoCloseable) obj;
                    cameraGraphSessionImpl = (CameraGraphSessionImpl) autoCloseable;
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    }
                    if (i3 == 0) {
                    }
                    capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.L$0 = autoCloseable;
                    capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.label = 3;
                    if (cameraGraphSessionImpl.unlock3APostCapture(z) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1 = new CapturePipelineImpl$invokeScreenFlashPostCaptureTasks$1(this, continuationImpl);
        obj = capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.label;
        boolean z2 = true;
        if (i2 != 0) {
        }
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
        }
        CameraGraphImpl graph2 = this.useCaseGraphContext.getGraph();
        capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.I$0 = i;
        capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.label = 2;
        obj = graph2.acquireSession(capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ac, code lost:
    
        if (r15 != r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0061, code lost:
    
        if (r13.flashControl.startScreenFlashCaptureTasks(r1) == r2) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[Catch: all -> 0x0089, TryCatch #0 {all -> 0x0089, blocks: (B:32:0x0079, B:34:0x0082, B:37:0x0093), top: B:31:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r13v0, types: [androidx.camera.camera2.impl.CapturePipelineImpl] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeScreenFlashPreCaptureTasks(int i, ContinuationImpl continuationImpl) {
        CapturePipelineImpl$invokeScreenFlashPreCaptureTasks$1 capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i2;
        int i3;
        AutoCloseable autoCloseable;
        AutoCloseable autoCloseable2;
        try {
            if (continuationImpl instanceof CapturePipelineImpl$invokeScreenFlashPreCaptureTasks$1) {
                capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1 = (CapturePipelineImpl$invokeScreenFlashPreCaptureTasks$1) continuationImpl;
                int i4 = capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.label;
                if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                    capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.label = i4 - PKIFailureInfo.systemUnavail;
                    obj = capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.label;
                    if (i2 != 0) {
                        SafeTrace.throwOnFailure(obj);
                        capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.I$0 = i;
                        capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.label = 1;
                    } else if (i2 == 1) {
                        i = capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.I$0;
                        SafeTrace.throwOnFailure(obj);
                    } else {
                        if (i2 == 2) {
                            i3 = capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.I$0;
                            SafeTrace.throwOnFailure(obj);
                            autoCloseable = (AutoCloseable) obj;
                            try {
                                CameraGraphSessionImpl cameraGraphSessionImpl = (CameraGraphSessionImpl) autoCloseable;
                                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                    Log.d("CXCP", "screenFlashPreCapture: Locking 3A for capture");
                                }
                                boolean z = i3 != 0;
                                capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.L$0 = autoCloseable;
                                capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.label = 3;
                                obj = CameraGraphSessionImpl.lock3AForCapture$default(cameraGraphSessionImpl, z, true, 2000000000L);
                                if (obj != coroutineSingletons) {
                                    autoCloseable2 = autoCloseable;
                                    capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.L$0 = autoCloseable2;
                                    capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.label = 4;
                                    obj = ((Deferred) obj).await(capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1);
                                    this = autoCloseable2;
                                }
                                return coroutineSingletons;
                            } catch (Throwable th) {
                                th = th;
                                this = autoCloseable;
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    Cache.Companion.closeFinally(this, th);
                                    throw th2;
                                }
                            }
                        }
                        if (i2 != 3) {
                            if (i2 != 4) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            AutoCloseable autoCloseable3 = capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            this = autoCloseable3;
                            Result3A result3A = (Result3A) obj;
                            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                Log.d("CXCP", "screenFlashPreCapture: Locking 3A for capture done, result3A = " + result3A);
                            }
                            Cache.Companion.closeFinally(this, null);
                            return Unit.INSTANCE;
                        }
                        AutoCloseable autoCloseable4 = capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        autoCloseable2 = autoCloseable4;
                        capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.L$0 = autoCloseable2;
                        capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.label = 4;
                        obj = ((Deferred) obj).await(capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1);
                        this = autoCloseable2;
                    }
                    CameraGraphImpl graph = this.useCaseGraphContext.getGraph();
                    capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.I$0 = i;
                    capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.label = 2;
                    obj = graph.acquireSession(capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1);
                    if (obj != coroutineSingletons) {
                        i3 = i;
                        autoCloseable = (AutoCloseable) obj;
                        CameraGraphSessionImpl cameraGraphSessionImpl2 = (CameraGraphSessionImpl) autoCloseable;
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        }
                        if (i3 != 0) {
                        }
                        capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.L$0 = autoCloseable;
                        capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.label = 3;
                        obj = CameraGraphSessionImpl.lock3AForCapture$default(cameraGraphSessionImpl2, z, true, 2000000000L);
                        if (obj != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            if (i2 != 0) {
            }
            CameraGraphImpl graph2 = this.useCaseGraphContext.getGraph();
            capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.I$0 = i;
            capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.label = 2;
            obj = graph2.acquireSession(capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            th = th3;
        }
        capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1 = new CapturePipelineImpl$invokeScreenFlashPreCaptureTasks$1(this, continuationImpl);
        obj = capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        if (r5.intValue() != 4) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isPhysicalFlashRequired(int i, ContinuationImpl continuationImpl) {
        CapturePipelineImpl$isPhysicalFlashRequired$1 capturePipelineImpl$isPhysicalFlashRequired$1;
        int i2;
        AndroidFrameMetadata androidFrameMetadata;
        if (continuationImpl instanceof CapturePipelineImpl$isPhysicalFlashRequired$1) {
            capturePipelineImpl$isPhysicalFlashRequired$1 = (CapturePipelineImpl$isPhysicalFlashRequired$1) continuationImpl;
            int i3 = capturePipelineImpl$isPhysicalFlashRequired$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                capturePipelineImpl$isPhysicalFlashRequired$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = capturePipelineImpl$isPhysicalFlashRequired$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = capturePipelineImpl$isPhysicalFlashRequired$1.label;
                boolean z = false;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2 && i != 3) {
                                throw new AssertionError(i);
                            }
                            return Boolean.valueOf(z);
                        }
                        z = true;
                        return Boolean.valueOf(z);
                    }
                    capturePipelineImpl$isPhysicalFlashRequired$1.label = 1;
                    obj = getFrameMetadata(capturePipelineImpl$isPhysicalFlashRequired$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                androidFrameMetadata = (AndroidFrameMetadata) obj;
                if (androidFrameMetadata != null) {
                    CaptureResult.Key key = CaptureResult.CONTROL_AE_STATE;
                    key.getClass();
                    Integer num = (Integer) androidFrameMetadata.get(key);
                    if (num != null) {
                    }
                }
                return Boolean.valueOf(z);
            }
        }
        capturePipelineImpl$isPhysicalFlashRequired$1 = new CapturePipelineImpl$isPhysicalFlashRequired$1(this, continuationImpl);
        Object obj3 = capturePipelineImpl$isPhysicalFlashRequired$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = capturePipelineImpl$isPhysicalFlashRequired$1.label;
        boolean z2 = false;
        if (i2 != 0) {
        }
        androidFrameMetadata = (AndroidFrameMetadata) obj3;
        if (androidFrameMetadata != null) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object screenFlashCapture(MainCaptureParams mainCaptureParams, int i, List list, ContinuationImpl continuationImpl) {
        CapturePipelineImpl$screenFlashCapture$1 capturePipelineImpl$screenFlashCapture$1;
        int i2;
        CapturePipelineImpl capturePipelineImpl;
        List listOf;
        if (continuationImpl instanceof CapturePipelineImpl$screenFlashCapture$1) {
            capturePipelineImpl$screenFlashCapture$1 = (CapturePipelineImpl$screenFlashCapture$1) continuationImpl;
            int i3 = capturePipelineImpl$screenFlashCapture$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                capturePipelineImpl$screenFlashCapture$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = capturePipelineImpl$screenFlashCapture$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = capturePipelineImpl$screenFlashCapture$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#screenFlashCapture");
                    }
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: tasks = " + list);
                    }
                    if (!list.contains(PipelineTask.PRE_CAPTURE)) {
                        capturePipelineImpl = this;
                        if (list.contains(PipelineTask.MAIN_CAPTURE)) {
                            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                            }
                            if (mainCaptureParams == null) {
                                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                                return null;
                            }
                            listOf = capturePipelineImpl.submitRequestInternal(mainCaptureParams);
                            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                            }
                        } else {
                            listOf = CollectionsKt__CollectionsJVMKt.listOf(JobKt.CompletableDeferred(null));
                        }
                        if (list.contains(PipelineTask.POST_CAPTURE)) {
                            JobKt.launch$default(capturePipelineImpl.threads.sequentialScope, null, null, new MoneyTabUIKt$MoneyTabLoaded$1$1(listOf, (Continuation) null, this, i), 3);
                        }
                        return listOf;
                    }
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting PRE_CAPTURE");
                    }
                    capturePipelineImpl$screenFlashCapture$1.L$0 = this;
                    capturePipelineImpl$screenFlashCapture$1.L$1 = list;
                    capturePipelineImpl$screenFlashCapture$1.L$2 = mainCaptureParams;
                    capturePipelineImpl$screenFlashCapture$1.I$0 = i;
                    capturePipelineImpl$screenFlashCapture$1.label = 1;
                    if (invokeScreenFlashPreCaptureTasks(i, capturePipelineImpl$screenFlashCapture$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    capturePipelineImpl = this;
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = capturePipelineImpl$screenFlashCapture$1.I$0;
                    mainCaptureParams = capturePipelineImpl$screenFlashCapture$1.L$2;
                    list = capturePipelineImpl$screenFlashCapture$1.L$1;
                    capturePipelineImpl = capturePipelineImpl$screenFlashCapture$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                }
                if (list.contains(PipelineTask.MAIN_CAPTURE)) {
                }
                if (list.contains(PipelineTask.POST_CAPTURE)) {
                }
                return listOf;
            }
        }
        capturePipelineImpl$screenFlashCapture$1 = new CapturePipelineImpl$screenFlashCapture$1(this, continuationImpl);
        Object obj2 = capturePipelineImpl$screenFlashCapture$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = capturePipelineImpl$screenFlashCapture$1.label;
        if (i2 != 0) {
        }
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
        }
        if (list.contains(PipelineTask.MAIN_CAPTURE)) {
        }
        if (list.contains(PipelineTask.POST_CAPTURE)) {
        }
        return listOf;
    }

    @Override // androidx.camera.camera2.impl.CapturePipeline
    public final void setTemplate(int i) {
        this.template = i;
    }

    public final ArrayList submitRequestInternal(MainCaptureParams mainCaptureParams) {
        List list = mainCaptureParams.configs;
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "CapturePipeline#submitRequestInternal; Submitting " + list + " with CameraPipe");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            Request request = null;
            if (!it.hasNext()) {
                break;
            }
            CaptureConfig captureConfig = (CaptureConfig) it.next();
            final CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
            arrayList.add(completableDeferredImpl);
            try {
                request = this.configAdapter.m15mapToRequestnAberiA(captureConfig, mainCaptureParams.requestTemplate, mainCaptureParams.sessionConfigOptions, CollectionsKt__CollectionsJVMKt.listOf(new Request.Listener() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$submitRequestInternal$requests$1$1
                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    public final void onAborted(Request request2) {
                        request2.getClass();
                        CompletableDeferredImpl.this.completeExceptionally(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    /* renamed from: onFailed-CcXjc1I */
                    public final void mo17onFailedCcXjc1I(RequestMetadata requestMetadata, long j, RequestFailure requestFailure) {
                        CompletableDeferredImpl.this.completeExceptionally(new ImageCaptureException(2, "Capture request failed with reason " + requestFailure.getReason(), null));
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    /* renamed from: onTotalCaptureResult-CcXjc1I */
                    public final void mo18onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j, AndroidFrameInfo androidFrameInfo) {
                        CompletableDeferredImpl.this.makeCompleting$kotlinx_coroutines_core(null);
                    }
                }));
            } catch (IllegalStateException e) {
                if (StringUtilsKt.isLogLevelEnabled(4, "CXCP")) {
                    Log.i("CXCP", "CapturePipeline#submitRequestInternal: configAdapter.mapToRequest failed!", e);
                }
                completableDeferredImpl.completeExceptionally(new ImageCaptureException(2, "Capture request failed with reason " + e.getMessage(), e));
            }
            if (request != null) {
                arrayList2.add(request);
            }
        }
        if (arrayList2.isEmpty()) {
            return arrayList;
        }
        JobKt.launch$default(this.threads.sequentialScope, null, null, new FlowExtKt$simpleScan$1((Continuation) null, this, arrayList, arrayList2), 3);
        return arrayList;
    }

    @Override // androidx.camera.camera2.impl.CapturePipeline
    /* renamed from: submitStillCaptures-BvXKQx0 */
    public final Object mo23submitStillCapturesBvXKQx0(List list, int i, Config config, int i2, int i3, int i4, ContinuationImpl continuationImpl) {
        return invokeCaptureTasks(CollectionsKt__CollectionsKt.listOf((Object[]) new PipelineTask[]{PipelineTask.PRE_CAPTURE, PipelineTask.MAIN_CAPTURE, PipelineTask.POST_CAPTURE}), i2, i4, i3, new MainCaptureParams(list, i, config), continuationImpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object torchApplyCapture(MainCaptureParams mainCaptureParams, int i, long j, List list, boolean z, ContinuationImpl continuationImpl) {
        CapturePipelineImpl$torchApplyCapture$1 capturePipelineImpl$torchApplyCapture$1;
        int i2;
        int i3;
        MainCaptureParams mainCaptureParams2;
        int i4;
        int i5;
        int i6;
        int i7;
        List list2;
        CapturePipelineImpl capturePipelineImpl;
        boolean z2;
        MainCaptureParams mainCaptureParams3;
        long j2;
        List list3;
        int i8;
        boolean z3;
        CompletableDeferredImpl m36setTorchAsyncOup_wC0$camera_camera2;
        int i9;
        MainCaptureParams mainCaptureParams4;
        CapturePipelineImpl capturePipelineImpl2;
        CapturePipelineImpl capturePipelineImpl3;
        List list4;
        int i10;
        CapturePipelineImpl capturePipelineImpl4;
        MainCaptureParams mainCaptureParams5;
        long j3;
        AutoCloseable autoCloseable;
        Throwable th;
        AutoCloseable autoCloseable2;
        CompletableDeferredImpl lock3AForCapture$default;
        List list5;
        AutoCloseable autoCloseable3;
        int i11;
        CapturePipelineImpl capturePipelineImpl5;
        CapturePipelineImpl capturePipelineImpl6;
        MainCaptureParams mainCaptureParams6;
        List list6;
        List listOf;
        int i12 = i;
        if (continuationImpl instanceof CapturePipelineImpl$torchApplyCapture$1) {
            capturePipelineImpl$torchApplyCapture$1 = (CapturePipelineImpl$torchApplyCapture$1) continuationImpl;
            int i13 = capturePipelineImpl$torchApplyCapture$1.label;
            if ((i13 & PKIFailureInfo.systemUnavail) != 0) {
                capturePipelineImpl$torchApplyCapture$1.label = i13 - PKIFailureInfo.systemUnavail;
                Object obj = capturePipelineImpl$torchApplyCapture$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = 3;
                switch (capturePipelineImpl$torchApplyCapture$1.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#torchApplyCapture");
                        }
                        TorchControl torchControl = this.torchControl;
                        Integer num = (Integer) torchControl._torchState.getValue();
                        i2 = (num != null && num.intValue() == 0) ? 1 : 0;
                        i3 = (i2 != 0 || i12 == 0) ? 1 : 0;
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: tasks = " + list);
                        }
                        if (!list.contains(PipelineTask.PRE_CAPTURE)) {
                            mainCaptureParams2 = mainCaptureParams;
                            i4 = 3;
                            i5 = 1;
                            int i15 = i3;
                            i6 = i12;
                            i7 = i15;
                            list2 = list;
                            capturePipelineImpl = this;
                            z2 = z;
                            if (list2.contains(PipelineTask.MAIN_CAPTURE)) {
                            }
                            if (list2.contains(PipelineTask.POST_CAPTURE)) {
                            }
                            return listOf;
                        }
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting PRE_CAPTURE");
                        }
                        if (i2 == 0) {
                            mainCaptureParams3 = mainCaptureParams;
                            j2 = j;
                            list3 = list;
                            i8 = i2;
                            z3 = z;
                            capturePipelineImpl = this;
                            if (z3) {
                            }
                            return coroutineSingletons;
                        }
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            Log.d("CXCP", "CapturePipeline#torchApplyCapture: Setting torch");
                        }
                        m36setTorchAsyncOup_wC0$camera_camera2 = torchControl.m36setTorchAsyncOup_wC0$camera_camera2(2, true, (r3 & 4) == 0);
                        capturePipelineImpl$torchApplyCapture$1.L$0 = this;
                        capturePipelineImpl$torchApplyCapture$1.L$1 = list;
                        mainCaptureParams3 = mainCaptureParams;
                        capturePipelineImpl$torchApplyCapture$1.L$2 = mainCaptureParams3;
                        capturePipelineImpl$torchApplyCapture$1.I$0 = i12;
                        j2 = j;
                        capturePipelineImpl$torchApplyCapture$1.J$0 = j2;
                        capturePipelineImpl$torchApplyCapture$1.Z$0 = z;
                        capturePipelineImpl$torchApplyCapture$1.I$1 = i2;
                        capturePipelineImpl$torchApplyCapture$1.I$2 = i3;
                        capturePipelineImpl$torchApplyCapture$1.label = 1;
                        if (m36setTorchAsyncOup_wC0$camera_camera2.join(capturePipelineImpl$torchApplyCapture$1) != coroutineSingletons) {
                            list3 = list;
                            i8 = i2;
                            z3 = z;
                            capturePipelineImpl = this;
                            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                Log.d("CXCP", "CapturePipeline#torchApplyCapture: Setting torch done");
                            }
                            if (z3) {
                                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                    Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture");
                                }
                                CameraGraphImpl graph = this.useCaseGraphContext.getGraph();
                                capturePipelineImpl$torchApplyCapture$1.L$0 = capturePipelineImpl;
                                capturePipelineImpl$torchApplyCapture$1.L$1 = list3;
                                capturePipelineImpl$torchApplyCapture$1.L$2 = mainCaptureParams3;
                                capturePipelineImpl$torchApplyCapture$1.I$0 = i12;
                                capturePipelineImpl$torchApplyCapture$1.J$0 = j2;
                                capturePipelineImpl$torchApplyCapture$1.Z$0 = z3;
                                capturePipelineImpl$torchApplyCapture$1.I$1 = i8;
                                capturePipelineImpl$torchApplyCapture$1.I$2 = i3;
                                capturePipelineImpl$torchApplyCapture$1.label = 2;
                                Object acquireSession = graph.acquireSession(capturePipelineImpl$torchApplyCapture$1);
                                if (acquireSession != coroutineSingletons) {
                                    list4 = list3;
                                    MainCaptureParams mainCaptureParams7 = mainCaptureParams3;
                                    i10 = i12;
                                    i7 = i3;
                                    long j4 = j2;
                                    capturePipelineImpl4 = capturePipelineImpl;
                                    obj = acquireSession;
                                    mainCaptureParams5 = mainCaptureParams7;
                                    j3 = j4;
                                    autoCloseable = (AutoCloseable) obj;
                                    try {
                                        CameraGraphSessionImpl cameraGraphSessionImpl = (CameraGraphSessionImpl) autoCloseable;
                                        boolean z4 = i10 != 0;
                                        List list7 = list4;
                                        boolean z5 = i10 != 0;
                                        capturePipelineImpl$torchApplyCapture$1.L$0 = capturePipelineImpl4;
                                        CapturePipelineImpl capturePipelineImpl7 = capturePipelineImpl4;
                                        capturePipelineImpl$torchApplyCapture$1.L$1 = list7;
                                        capturePipelineImpl$torchApplyCapture$1.L$2 = mainCaptureParams5;
                                        capturePipelineImpl$torchApplyCapture$1.L$3 = autoCloseable;
                                        capturePipelineImpl$torchApplyCapture$1.I$0 = i10;
                                        capturePipelineImpl$torchApplyCapture$1.Z$0 = z3;
                                        capturePipelineImpl$torchApplyCapture$1.I$1 = i8;
                                        capturePipelineImpl$torchApplyCapture$1.I$2 = i7;
                                        capturePipelineImpl$torchApplyCapture$1.label = 3;
                                        lock3AForCapture$default = CameraGraphSessionImpl.lock3AForCapture$default(cameraGraphSessionImpl, z4, z5, j3);
                                        if (lock3AForCapture$default != coroutineSingletons) {
                                            list5 = list7;
                                            autoCloseable3 = autoCloseable;
                                            obj = lock3AForCapture$default;
                                            i11 = i10;
                                            capturePipelineImpl5 = capturePipelineImpl7;
                                            capturePipelineImpl$torchApplyCapture$1.L$0 = capturePipelineImpl5;
                                            capturePipelineImpl$torchApplyCapture$1.L$1 = list5;
                                            capturePipelineImpl$torchApplyCapture$1.L$2 = mainCaptureParams5;
                                            capturePipelineImpl$torchApplyCapture$1.L$3 = autoCloseable3;
                                            capturePipelineImpl$torchApplyCapture$1.I$0 = i11;
                                            capturePipelineImpl$torchApplyCapture$1.Z$0 = z3;
                                            capturePipelineImpl$torchApplyCapture$1.I$1 = i8;
                                            capturePipelineImpl$torchApplyCapture$1.I$2 = i7;
                                            capturePipelineImpl$torchApplyCapture$1.label = 4;
                                            obj = ((Deferred) obj).await(capturePipelineImpl$torchApplyCapture$1);
                                            if (obj != coroutineSingletons) {
                                                z2 = z3;
                                                i9 = i11;
                                                autoCloseable2 = autoCloseable3;
                                                capturePipelineImpl6 = capturePipelineImpl5;
                                                mainCaptureParams6 = mainCaptureParams5;
                                                list6 = list5;
                                                Result3A result3A = (Result3A) obj;
                                                Cache.Companion.closeFinally(autoCloseable2, null);
                                                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                                    Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A for capture done, result3A = " + result3A);
                                                }
                                                capturePipelineImpl = capturePipelineImpl6;
                                                mainCaptureParams4 = mainCaptureParams6;
                                                list2 = list6;
                                                i4 = 3;
                                                i5 = 1;
                                                if (StringUtilsKt.isLogLevelEnabled(i4, "CXCP")) {
                                                    Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: PRE_CAPTURE completed");
                                                }
                                                mainCaptureParams2 = mainCaptureParams4;
                                                i6 = i9;
                                                i2 = i8;
                                                if (list2.contains(PipelineTask.MAIN_CAPTURE)) {
                                                    listOf = CollectionsKt__CollectionsJVMKt.listOf(JobKt.CompletableDeferred(null));
                                                } else {
                                                    if (StringUtilsKt.isLogLevelEnabled(i4, "CXCP")) {
                                                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: starting MAIN_CAPTURE");
                                                    }
                                                    if (mainCaptureParams2 == null) {
                                                        a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                                                        return null;
                                                    }
                                                    listOf = capturePipelineImpl.submitRequestInternal(mainCaptureParams2);
                                                    if (StringUtilsKt.isLogLevelEnabled(i4, "CXCP")) {
                                                        Log.d("CXCP", "CapturePipeline#List<PipelineTask>.invoke: MAIN_CAPTURE completed");
                                                    }
                                                }
                                                if (list2.contains(PipelineTask.POST_CAPTURE)) {
                                                    JobKt.launch$default(capturePipelineImpl.threads.sequentialScope, null, null, new CapturePipelineImpl$torchApplyCapture$$inlined$invoke$1(listOf, null, i2 != 0 ? i5 : 0, this, z2, i7 != 0 ? i5 : 0, i6), 3);
                                                }
                                                return listOf;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        autoCloseable2 = autoCloseable;
                                        try {
                                            throw th;
                                        } catch (Throwable th3) {
                                            Cache.Companion.closeFinally(autoCloseable2, th);
                                            throw th3;
                                        }
                                    }
                                }
                            } else {
                                if (i3 == 0) {
                                    i4 = 3;
                                    i5 = 1;
                                    z2 = z3;
                                    list2 = list3;
                                    i9 = i12;
                                    i7 = i3;
                                    mainCaptureParams4 = mainCaptureParams3;
                                    if (StringUtilsKt.isLogLevelEnabled(i4, "CXCP")) {
                                    }
                                    mainCaptureParams2 = mainCaptureParams4;
                                    i6 = i9;
                                    i2 = i8;
                                    if (list2.contains(PipelineTask.MAIN_CAPTURE)) {
                                    }
                                    if (list2.contains(PipelineTask.POST_CAPTURE)) {
                                    }
                                    return listOf;
                                }
                                if (i12 == 0) {
                                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A");
                                    }
                                    capturePipelineImpl$torchApplyCapture$1.L$0 = capturePipelineImpl;
                                    capturePipelineImpl$torchApplyCapture$1.L$1 = list3;
                                    capturePipelineImpl$torchApplyCapture$1.L$2 = mainCaptureParams3;
                                    capturePipelineImpl$torchApplyCapture$1.I$0 = i12;
                                    capturePipelineImpl$torchApplyCapture$1.Z$0 = z3;
                                    capturePipelineImpl$torchApplyCapture$1.I$1 = i8;
                                    capturePipelineImpl$torchApplyCapture$1.I$2 = i3;
                                    capturePipelineImpl$torchApplyCapture$1.label = 5;
                                    if (access$lockAf(this, j2, true, capturePipelineImpl$torchApplyCapture$1) != coroutineSingletons) {
                                        capturePipelineImpl3 = capturePipelineImpl;
                                        z2 = z3;
                                        list2 = list3;
                                        i14 = 3;
                                        i9 = i12;
                                        i7 = i3;
                                        mainCaptureParams4 = mainCaptureParams3;
                                        if (StringUtilsKt.isLogLevelEnabled(i14, "CXCP")) {
                                            Log.d("CXCP", "CapturePipeline#torchApplyCapture: Locking 3A done");
                                        }
                                        capturePipelineImpl = capturePipelineImpl3;
                                        i4 = i14;
                                        i5 = 1;
                                        if (StringUtilsKt.isLogLevelEnabled(i4, "CXCP")) {
                                        }
                                        mainCaptureParams2 = mainCaptureParams4;
                                        i6 = i9;
                                        i2 = i8;
                                        if (list2.contains(PipelineTask.MAIN_CAPTURE)) {
                                        }
                                        if (list2.contains(PipelineTask.POST_CAPTURE)) {
                                        }
                                        return listOf;
                                    }
                                } else {
                                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                                        Log.d("CXCP", "CapturePipeline#torchApplyCapture: Awaiting 3A convergence");
                                    }
                                    i5 = 1;
                                    KClasses$$Lambda$2 kClasses$$Lambda$2 = new KClasses$$Lambda$2(this, i5);
                                    capturePipelineImpl$torchApplyCapture$1.L$0 = capturePipelineImpl;
                                    capturePipelineImpl$torchApplyCapture$1.L$1 = list3;
                                    capturePipelineImpl$torchApplyCapture$1.L$2 = mainCaptureParams3;
                                    capturePipelineImpl$torchApplyCapture$1.I$0 = i12;
                                    capturePipelineImpl$torchApplyCapture$1.Z$0 = z3;
                                    capturePipelineImpl$torchApplyCapture$1.I$1 = i8;
                                    capturePipelineImpl$torchApplyCapture$1.I$2 = i3;
                                    capturePipelineImpl$torchApplyCapture$1.label = 6;
                                    if (waitForResult(j2, kClasses$$Lambda$2, capturePipelineImpl$torchApplyCapture$1) != coroutineSingletons) {
                                        capturePipelineImpl2 = capturePipelineImpl;
                                        z2 = z3;
                                        list2 = list3;
                                        i4 = 3;
                                        i9 = i12;
                                        i7 = i3;
                                        mainCaptureParams4 = mainCaptureParams3;
                                        if (StringUtilsKt.isLogLevelEnabled(i4, "CXCP")) {
                                            Log.d("CXCP", "CapturePipeline#torchApplyCapture: 3A convergence waiting done");
                                        }
                                        capturePipelineImpl = capturePipelineImpl2;
                                        if (StringUtilsKt.isLogLevelEnabled(i4, "CXCP")) {
                                        }
                                        mainCaptureParams2 = mainCaptureParams4;
                                        i6 = i9;
                                        i2 = i8;
                                        if (list2.contains(PipelineTask.MAIN_CAPTURE)) {
                                        }
                                        if (list2.contains(PipelineTask.POST_CAPTURE)) {
                                        }
                                        return listOf;
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        int i16 = capturePipelineImpl$torchApplyCapture$1.I$2;
                        i8 = capturePipelineImpl$torchApplyCapture$1.I$1;
                        z3 = capturePipelineImpl$torchApplyCapture$1.Z$0;
                        j2 = capturePipelineImpl$torchApplyCapture$1.J$0;
                        int i17 = capturePipelineImpl$torchApplyCapture$1.I$0;
                        MainCaptureParams mainCaptureParams8 = capturePipelineImpl$torchApplyCapture$1.L$2;
                        list3 = capturePipelineImpl$torchApplyCapture$1.L$1;
                        CapturePipelineImpl capturePipelineImpl8 = capturePipelineImpl$torchApplyCapture$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        capturePipelineImpl = capturePipelineImpl8;
                        i3 = i16;
                        i12 = i17;
                        mainCaptureParams3 = mainCaptureParams8;
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        }
                        if (z3) {
                        }
                        return coroutineSingletons;
                    case 2:
                        i7 = capturePipelineImpl$torchApplyCapture$1.I$2;
                        i8 = capturePipelineImpl$torchApplyCapture$1.I$1;
                        z3 = capturePipelineImpl$torchApplyCapture$1.Z$0;
                        j3 = capturePipelineImpl$torchApplyCapture$1.J$0;
                        i10 = capturePipelineImpl$torchApplyCapture$1.I$0;
                        mainCaptureParams5 = capturePipelineImpl$torchApplyCapture$1.L$2;
                        list4 = capturePipelineImpl$torchApplyCapture$1.L$1;
                        capturePipelineImpl4 = capturePipelineImpl$torchApplyCapture$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        autoCloseable = (AutoCloseable) obj;
                        CameraGraphSessionImpl cameraGraphSessionImpl2 = (CameraGraphSessionImpl) autoCloseable;
                        if (i10 != 0) {
                        }
                        List list72 = list4;
                        if (i10 != 0) {
                        }
                        capturePipelineImpl$torchApplyCapture$1.L$0 = capturePipelineImpl4;
                        CapturePipelineImpl capturePipelineImpl72 = capturePipelineImpl4;
                        capturePipelineImpl$torchApplyCapture$1.L$1 = list72;
                        capturePipelineImpl$torchApplyCapture$1.L$2 = mainCaptureParams5;
                        capturePipelineImpl$torchApplyCapture$1.L$3 = autoCloseable;
                        capturePipelineImpl$torchApplyCapture$1.I$0 = i10;
                        capturePipelineImpl$torchApplyCapture$1.Z$0 = z3;
                        capturePipelineImpl$torchApplyCapture$1.I$1 = i8;
                        capturePipelineImpl$torchApplyCapture$1.I$2 = i7;
                        capturePipelineImpl$torchApplyCapture$1.label = 3;
                        lock3AForCapture$default = CameraGraphSessionImpl.lock3AForCapture$default(cameraGraphSessionImpl2, z4, z5, j3);
                        if (lock3AForCapture$default != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 3:
                        i7 = capturePipelineImpl$torchApplyCapture$1.I$2;
                        i8 = capturePipelineImpl$torchApplyCapture$1.I$1;
                        z3 = capturePipelineImpl$torchApplyCapture$1.Z$0;
                        i11 = capturePipelineImpl$torchApplyCapture$1.I$0;
                        autoCloseable3 = capturePipelineImpl$torchApplyCapture$1.L$3;
                        mainCaptureParams5 = capturePipelineImpl$torchApplyCapture$1.L$2;
                        list5 = capturePipelineImpl$torchApplyCapture$1.L$1;
                        capturePipelineImpl5 = capturePipelineImpl$torchApplyCapture$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            capturePipelineImpl$torchApplyCapture$1.L$0 = capturePipelineImpl5;
                            capturePipelineImpl$torchApplyCapture$1.L$1 = list5;
                            capturePipelineImpl$torchApplyCapture$1.L$2 = mainCaptureParams5;
                            capturePipelineImpl$torchApplyCapture$1.L$3 = autoCloseable3;
                            capturePipelineImpl$torchApplyCapture$1.I$0 = i11;
                            capturePipelineImpl$torchApplyCapture$1.Z$0 = z3;
                            capturePipelineImpl$torchApplyCapture$1.I$1 = i8;
                            capturePipelineImpl$torchApplyCapture$1.I$2 = i7;
                            capturePipelineImpl$torchApplyCapture$1.label = 4;
                            obj = ((Deferred) obj).await(capturePipelineImpl$torchApplyCapture$1);
                            if (obj != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        } catch (Throwable th4) {
                            th = th4;
                            autoCloseable2 = autoCloseable3;
                            throw th;
                        }
                    case 4:
                        i7 = capturePipelineImpl$torchApplyCapture$1.I$2;
                        i8 = capturePipelineImpl$torchApplyCapture$1.I$1;
                        z2 = capturePipelineImpl$torchApplyCapture$1.Z$0;
                        i9 = capturePipelineImpl$torchApplyCapture$1.I$0;
                        autoCloseable2 = capturePipelineImpl$torchApplyCapture$1.L$3;
                        mainCaptureParams6 = capturePipelineImpl$torchApplyCapture$1.L$2;
                        list6 = capturePipelineImpl$torchApplyCapture$1.L$1;
                        capturePipelineImpl6 = capturePipelineImpl$torchApplyCapture$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                            Result3A result3A2 = (Result3A) obj;
                            Cache.Companion.closeFinally(autoCloseable2, null);
                            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            }
                            capturePipelineImpl = capturePipelineImpl6;
                            mainCaptureParams4 = mainCaptureParams6;
                            list2 = list6;
                            i4 = 3;
                            i5 = 1;
                            if (StringUtilsKt.isLogLevelEnabled(i4, "CXCP")) {
                            }
                            mainCaptureParams2 = mainCaptureParams4;
                            i6 = i9;
                            i2 = i8;
                            if (list2.contains(PipelineTask.MAIN_CAPTURE)) {
                            }
                            if (list2.contains(PipelineTask.POST_CAPTURE)) {
                            }
                            return listOf;
                        } catch (Throwable th5) {
                            th = th5;
                            throw th;
                        }
                    case 5:
                        i7 = capturePipelineImpl$torchApplyCapture$1.I$2;
                        i8 = capturePipelineImpl$torchApplyCapture$1.I$1;
                        z2 = capturePipelineImpl$torchApplyCapture$1.Z$0;
                        i9 = capturePipelineImpl$torchApplyCapture$1.I$0;
                        mainCaptureParams4 = capturePipelineImpl$torchApplyCapture$1.L$2;
                        list2 = capturePipelineImpl$torchApplyCapture$1.L$1;
                        capturePipelineImpl3 = capturePipelineImpl$torchApplyCapture$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        if (StringUtilsKt.isLogLevelEnabled(i14, "CXCP")) {
                        }
                        capturePipelineImpl = capturePipelineImpl3;
                        i4 = i14;
                        i5 = 1;
                        if (StringUtilsKt.isLogLevelEnabled(i4, "CXCP")) {
                        }
                        mainCaptureParams2 = mainCaptureParams4;
                        i6 = i9;
                        i2 = i8;
                        if (list2.contains(PipelineTask.MAIN_CAPTURE)) {
                        }
                        if (list2.contains(PipelineTask.POST_CAPTURE)) {
                        }
                        return listOf;
                    case 6:
                        i7 = capturePipelineImpl$torchApplyCapture$1.I$2;
                        i8 = capturePipelineImpl$torchApplyCapture$1.I$1;
                        z2 = capturePipelineImpl$torchApplyCapture$1.Z$0;
                        i9 = capturePipelineImpl$torchApplyCapture$1.I$0;
                        mainCaptureParams4 = capturePipelineImpl$torchApplyCapture$1.L$2;
                        list2 = capturePipelineImpl$torchApplyCapture$1.L$1;
                        capturePipelineImpl2 = capturePipelineImpl$torchApplyCapture$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        i4 = 3;
                        i5 = 1;
                        if (StringUtilsKt.isLogLevelEnabled(i4, "CXCP")) {
                        }
                        capturePipelineImpl = capturePipelineImpl2;
                        if (StringUtilsKt.isLogLevelEnabled(i4, "CXCP")) {
                        }
                        mainCaptureParams2 = mainCaptureParams4;
                        i6 = i9;
                        i2 = i8;
                        if (list2.contains(PipelineTask.MAIN_CAPTURE)) {
                        }
                        if (list2.contains(PipelineTask.POST_CAPTURE)) {
                        }
                        return listOf;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        capturePipelineImpl$torchApplyCapture$1 = new CapturePipelineImpl$torchApplyCapture$1(this, continuationImpl);
        Object obj2 = capturePipelineImpl$torchApplyCapture$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i142 = 3;
        switch (capturePipelineImpl$torchApplyCapture$1.label) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r12 > 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0074, code lost:
    
        if (r14 == r0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object torchAsFlashCapture(MainCaptureParams mainCaptureParams, int i, int i2, List list, ContinuationImpl continuationImpl) {
        CapturePipelineImpl$torchAsFlashCapture$1 capturePipelineImpl$torchAsFlashCapture$1;
        Object obj;
        int i3;
        if (continuationImpl instanceof CapturePipelineImpl$torchAsFlashCapture$1) {
            capturePipelineImpl$torchAsFlashCapture$1 = (CapturePipelineImpl$torchAsFlashCapture$1) continuationImpl;
            int i4 = capturePipelineImpl$torchAsFlashCapture$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                capturePipelineImpl$torchAsFlashCapture$1.label = i4 - PKIFailureInfo.systemUnavail;
                CapturePipelineImpl$torchAsFlashCapture$1 capturePipelineImpl$torchAsFlashCapture$12 = capturePipelineImpl$torchAsFlashCapture$1;
                obj = capturePipelineImpl$torchAsFlashCapture$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = capturePipelineImpl$torchAsFlashCapture$12.label;
                boolean z = true;
                if (i3 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#torchAsFlashCapture");
                    }
                    if (((Boolean) this.hasFlashUnit$delegate.getValue()).booleanValue()) {
                        capturePipelineImpl$torchAsFlashCapture$12.L$0 = mainCaptureParams;
                        capturePipelineImpl$torchAsFlashCapture$12.L$1 = list;
                        capturePipelineImpl$torchAsFlashCapture$12.I$0 = i;
                        capturePipelineImpl$torchAsFlashCapture$12.label = 1;
                        obj = isPhysicalFlashRequired(i2, capturePipelineImpl$torchAsFlashCapture$12);
                    }
                    capturePipelineImpl$torchAsFlashCapture$12.L$0 = null;
                    capturePipelineImpl$torchAsFlashCapture$12.L$1 = null;
                    capturePipelineImpl$torchAsFlashCapture$12.label = 3;
                    Object defaultNoFlashCapture = defaultNoFlashCapture(mainCaptureParams, i, list, capturePipelineImpl$torchAsFlashCapture$12);
                    return defaultNoFlashCapture != obj2 ? obj2 : defaultNoFlashCapture;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    if (i3 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = capturePipelineImpl$torchAsFlashCapture$12.I$0;
                list = capturePipelineImpl$torchAsFlashCapture$12.L$1;
                mainCaptureParams = capturePipelineImpl$torchAsFlashCapture$12.L$0;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) obj).booleanValue()) {
                    capturePipelineImpl$torchAsFlashCapture$12.L$0 = null;
                    capturePipelineImpl$torchAsFlashCapture$12.L$1 = null;
                    capturePipelineImpl$torchAsFlashCapture$12.label = 3;
                    Object defaultNoFlashCapture2 = defaultNoFlashCapture(mainCaptureParams, i, list, capturePipelineImpl$torchAsFlashCapture$12);
                    if (defaultNoFlashCapture2 != obj2) {
                    }
                } else {
                    if (!this.useTorchAsFlash.shouldDisableAePrecapture()) {
                        int i5 = this.videoUsageControl.videoUsage.value;
                        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                            CameraState$Type$EnumUnboxingLocalUtility.m(i5, "isInVideoUsage: videoUsage = ", "CXCP");
                        }
                    }
                    z = false;
                    boolean z2 = z;
                    capturePipelineImpl$torchAsFlashCapture$12.L$0 = null;
                    capturePipelineImpl$torchAsFlashCapture$12.L$1 = null;
                    capturePipelineImpl$torchAsFlashCapture$12.label = 2;
                    Object obj3 = torchApplyCapture(mainCaptureParams, i, 5000000000L, list, z2, capturePipelineImpl$torchAsFlashCapture$12);
                    if (obj3 != obj2) {
                        return obj3;
                    }
                }
            }
        }
        capturePipelineImpl$torchAsFlashCapture$1 = new CapturePipelineImpl$torchAsFlashCapture$1(this, continuationImpl);
        CapturePipelineImpl$torchAsFlashCapture$1 capturePipelineImpl$torchAsFlashCapture$122 = capturePipelineImpl$torchAsFlashCapture$1;
        obj = capturePipelineImpl$torchAsFlashCapture$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = capturePipelineImpl$torchAsFlashCapture$122.label;
        boolean z3 = true;
        if (i3 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitForResult(long j, Function1 function1, ContinuationImpl continuationImpl) {
        CapturePipelineImpl$waitForResult$1 capturePipelineImpl$waitForResult$1;
        Object obj;
        int i;
        ResultListener resultListener;
        if (continuationImpl instanceof CapturePipelineImpl$waitForResult$1) {
            capturePipelineImpl$waitForResult$1 = (CapturePipelineImpl$waitForResult$1) continuationImpl;
            int i2 = capturePipelineImpl$waitForResult$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                capturePipelineImpl$waitForResult$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = capturePipelineImpl$waitForResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = capturePipelineImpl$waitForResult$1.label;
                Continuation continuation = null;
                ComboRequestListener comboRequestListener = this.requestListener;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ResultListener resultListener2 = new ResultListener(j, function1);
                    UseCaseThreads useCaseThreads = this.threads;
                    comboRequestListener.addListener(resultListener2, useCaseThreads.sequentialExecutor);
                    JobKt.launch$default(useCaseThreads.sequentialScope, null, null, new VirtualCameraState$connect$2$1(resultListener2, this, continuation, 3), 3);
                    ThumbNode$onAttach$1 thumbNode$onAttach$1 = new ThumbNode$onAttach$1(resultListener2, continuation, 2);
                    capturePipelineImpl$waitForResult$1.L$0 = resultListener2;
                    capturePipelineImpl$waitForResult$1.label = 1;
                    Object withTimeoutOrNull = JobKt.withTimeoutOrNull(j / 1000000, thumbNode$onAttach$1, capturePipelineImpl$waitForResult$1);
                    if (withTimeoutOrNull == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = withTimeoutOrNull;
                    resultListener = resultListener2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    resultListener = capturePipelineImpl$waitForResult$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (((FrameInfo) obj) == null) {
                    comboRequestListener.removeListener(resultListener);
                }
                return obj;
            }
        }
        capturePipelineImpl$waitForResult$1 = new CapturePipelineImpl$waitForResult$1(this, continuationImpl);
        obj = capturePipelineImpl$waitForResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = capturePipelineImpl$waitForResult$1.label;
        Continuation continuation2 = null;
        ComboRequestListener comboRequestListener2 = this.requestListener;
        if (i != 0) {
        }
        if (((FrameInfo) obj) == null) {
        }
        return obj;
    }
}
