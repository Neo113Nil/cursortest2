package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.config.UseCaseGraphContext;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.impl.UseCaseCameraState;
import androidx.camera.camera2.interop.Camera2CaptureRequestConfiguratorKt;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.MutableTagBundle;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.paging.FlowExtKt$simpleScan$1;
import androidx.paging.PagingDataPresenter$collectFrom$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.profile.RealReferralManager$refresh$2$1;
import com.squareup.cash.graphics.swampgl.components.Scene;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;
import squareup.cash.overdraft.OverdraftStatus;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class UseCaseCameraRequestControlImpl implements UseCaseCameraRequestControl {
    public static final CompletableDeferredImpl canceledResult;
    public static final CompletableDeferredImpl submitFailedResult = JobKt.CompletableDeferred(new Result3A(4, null));
    public final CameraXConfig cameraXConfig;
    public final Lazy capturePipeline$delegate;
    public final Provider capturePipelineProvider;
    public volatile boolean closed;
    public final LinkedHashMap infoBundleMap;
    public final UseCaseThreads threads;
    public final Lazy useCaseCameraState$delegate;
    public final Provider useCaseCameraStateProvider;
    public final UseCaseGraphContext useCaseGraphContext;
    public final Lazy useCaseSurfaceManager$delegate;
    public final Provider useCaseSurfaceManagerProvider;

    static {
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
        completableDeferredImpl.cancel(null);
        canceledResult = completableDeferredImpl;
    }

    public UseCaseCameraRequestControlImpl(Provider provider, Provider provider2, UseCaseGraphContext useCaseGraphContext, Provider provider3, UseCaseThreads useCaseThreads, CameraXConfig cameraXConfig) {
        provider.getClass();
        provider2.getClass();
        useCaseGraphContext.getClass();
        provider3.getClass();
        useCaseThreads.getClass();
        this.capturePipelineProvider = provider;
        this.useCaseCameraStateProvider = provider2;
        this.useCaseGraphContext = useCaseGraphContext;
        this.useCaseSurfaceManagerProvider = provider3;
        this.threads = useCaseThreads;
        this.cameraXConfig = cameraXConfig;
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "Configured " + this);
        }
        final int i = 0;
        this.capturePipeline$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$$ExternalSyntheticLambda1
            public final /* synthetic */ UseCaseCameraRequestControlImpl f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.f$0;
                switch (i2) {
                    case 0:
                        return (CapturePipeline) useCaseCameraRequestControlImpl.capturePipelineProvider.get();
                    case 1:
                        return (UseCaseSurfaceManager) useCaseCameraRequestControlImpl.useCaseSurfaceManagerProvider.get();
                    default:
                        return (UseCaseCameraState) useCaseCameraRequestControlImpl.useCaseCameraStateProvider.get();
                }
            }
        });
        final int i2 = 1;
        this.useCaseSurfaceManager$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$$ExternalSyntheticLambda1
            public final /* synthetic */ UseCaseCameraRequestControlImpl f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.f$0;
                switch (i22) {
                    case 0:
                        return (CapturePipeline) useCaseCameraRequestControlImpl.capturePipelineProvider.get();
                    case 1:
                        return (UseCaseSurfaceManager) useCaseCameraRequestControlImpl.useCaseSurfaceManagerProvider.get();
                    default:
                        return (UseCaseCameraState) useCaseCameraRequestControlImpl.useCaseCameraStateProvider.get();
                }
            }
        });
        final int i3 = 2;
        this.useCaseCameraState$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$$ExternalSyntheticLambda1
            public final /* synthetic */ UseCaseCameraRequestControlImpl f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.f$0;
                switch (i22) {
                    case 0:
                        return (CapturePipeline) useCaseCameraRequestControlImpl.capturePipelineProvider.get();
                    case 1:
                        return (UseCaseSurfaceManager) useCaseCameraRequestControlImpl.useCaseSurfaceManagerProvider.get();
                    default:
                        return (UseCaseCameraState) useCaseCameraRequestControlImpl.useCaseCameraStateProvider.get();
                }
            }
        });
        this.infoBundleMap = new LinkedHashMap();
    }

    public static final Object access$setParametersInternal(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, UseCaseCameraRequestControl.Type type2, Map map, Config.OptionPriority optionPriority, SuspendLambda suspendLambda) {
        LinkedHashMap linkedHashMap = useCaseCameraRequestControlImpl.infoBundleMap;
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl#setParametersAsync: [" + type2 + "] values = " + map + ", optionPriority = " + optionPriority);
        }
        Object obj = linkedHashMap.get(type2);
        Toolbar.AnonymousClass1 anonymousClass1 = null;
        boolean z = false;
        boolean z2 = false;
        Object obj2 = obj;
        if (obj == null) {
            InfoBundle infoBundle = new InfoBundle(anonymousClass1, (LinkedHashMap) (z2 ? 1 : 0), (RequestTemplate) (z ? 1 : 0), 15);
            linkedHashMap.put(type2, infoBundle);
            obj2 = infoBundle;
        }
        InfoBundle infoBundle2 = (InfoBundle) obj2;
        Toolbar.AnonymousClass1 anonymousClass12 = new Toolbar.AnonymousClass1(5);
        anonymousClass12.insertAllOptions((MutableOptionsBundle) infoBundle2.options.this$0);
        map.getClass();
        optionPriority.getClass();
        for (Map.Entry entry : map.entrySet()) {
            CaptureRequest.Key key = (CaptureRequest.Key) entry.getKey();
            ((MutableOptionsBundle) anonymousClass12.this$0).insertOption(OverdraftStatus.State_.createCaptureRequestOption(key), optionPriority, entry.getValue());
        }
        linkedHashMap.put(type2, new InfoBundle(anonymousClass12, MapsKt__MapsKt.toMutableMap(infoBundle2.tags), CollectionsKt.toMutableSet(infoBundle2.listeners), infoBundle2.template));
        return useCaseCameraRequestControlImpl.updateCameraStateAsync(merge(linkedHashMap), null, suspendLambda);
    }

    public static ArrayList failedResults(int i, String str) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
            completableDeferredImpl.completeExceptionally(new ImageCaptureException(2, str, null));
            arrayList.add(completableDeferredImpl);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InfoBundle merge(LinkedHashMap linkedHashMap) {
        InfoBundle infoBundle = new InfoBundle((Toolbar.AnonymousClass1) null, (LinkedHashMap) (0 == true ? 1 : 0), new RequestTemplate(1), 7);
        EnumEntriesList enumEntriesList = UseCaseCameraRequestControl.Type.$ENTRIES;
        ArrayIterator m = CameraState$Type$EnumUnboxingLocalUtility.m(enumEntriesList, enumEntriesList);
        while (m.hasNext()) {
            InfoBundle infoBundle2 = (InfoBundle) linkedHashMap.get((UseCaseCameraRequestControl.Type) m.next());
            if (infoBundle2 != null) {
                infoBundle.options.insertAllOptions((MutableOptionsBundle) infoBundle2.options.this$0);
                infoBundle.tags.putAll(infoBundle2.tags);
                infoBundle.listeners.addAll(infoBundle2.listeners);
                RequestTemplate requestTemplate = infoBundle2.template;
                if (requestTemplate != null) {
                    infoBundle.template = new RequestTemplate(requestTemplate.value);
                }
            }
        }
        return infoBundle;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final Object awaitSurfaceSetup(SuspendLambda suspendLambda) {
        UseCaseSurfaceManager useCaseSurfaceManager = (UseCaseSurfaceManager) this.useCaseSurfaceManager$delegate.getValue();
        useCaseSurfaceManager.getClass();
        return UseCaseSurfaceManager.awaitSetupCompletion$suspendImpl(useCaseSurfaceManager, suspendLambda);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final Deferred cancelFocusAndMeteringAsync() {
        CompletableDeferredImpl runOnSequential = this.closed ? null : runOnSequential(new PagingDataPresenter$collectFrom$2((Object) this, (Continuation) (0 == true ? 1 : 0), 1));
        return runOnSequential == null ? submitFailedResult : runOnSequential;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final void close() {
        this.closed = true;
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControl: closed");
        }
        UseCaseCameraState useCaseCameraState = (UseCaseCameraState) this.useCaseCameraState$delegate.getValue();
        synchronized (useCaseCameraState.lock) {
            try {
                if (useCaseCameraState.updating) {
                    useCaseCameraState.updating = false;
                    CompletableDeferredImpl completableDeferredImpl = useCaseCameraState.updateSignal;
                    if (completableDeferredImpl != null) {
                        completableDeferredImpl.completeExceptionally(new CancellationException("UseCaseCameraState closed"));
                    }
                    useCaseCameraState.updateSignal = null;
                }
                while (!useCaseCameraState.updateSignals.isEmpty()) {
                    ((UseCaseCameraState.RequestSignal) useCaseCameraState.updateSignals.removeFirst()).signal.completeExceptionally(new CancellationException("UseCaseCameraState closed"));
                    useCaseCameraState.pendingSignalCount.decrementAndGet();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final List issueSingleCaptureAsync(int i, int i2, int i3, ArrayList arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3 = null;
        Object[] objArr = 0;
        if (this.closed) {
            arrayList2 = arrayList;
        } else {
            int size = arrayList.size();
            arrayList2 = arrayList;
            UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1 useCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1 = new UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1(this, arrayList2, i, i2, i3, null);
            UseCaseThreads useCaseThreads = this.threads;
            useCaseThreads.getClass();
            CoroutineStart coroutineStart = Intrinsics.areEqual(useCaseThreads.isSequentialThread.get(), Boolean.TRUE) ? CoroutineStart.UNDISPATCHED : CoroutineStart.DEFAULT;
            ArrayList arrayList4 = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList4.add(new CompletableDeferredImpl());
            }
            JobKt.launch$default(useCaseThreads.sequentialScope, null, coroutineStart, new VirtualCameraState$connect$2$1(useCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1, arrayList4, objArr == true ? 1 : 0, 8), 1);
            arrayList3 = arrayList4;
        }
        return arrayList3 == null ? failedResults(arrayList2.size(), "Capture request is cancelled on closed CameraGraph") : arrayList3;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final Deferred removeParametersAsync(List list) {
        UseCaseCameraRequestControl.Type type2 = UseCaseCameraRequestControl.Type.SESSION_CONFIG;
        list.getClass();
        CompletableDeferredImpl runOnSequential = this.closed ? null : runOnSequential(new PagingDataPresenter$collectFrom$2(this, list, (Continuation) null));
        return runOnSequential == null ? canceledResult : runOnSequential;
    }

    public final CompletableDeferredImpl runOnSequential(Function1 function1) {
        UseCaseThreads useCaseThreads = this.threads;
        useCaseThreads.getClass();
        CoroutineStart coroutineStart = Intrinsics.areEqual(useCaseThreads.isSequentialThread.get(), Boolean.TRUE) ? CoroutineStart.UNDISPATCHED : CoroutineStart.DEFAULT;
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
        JobKt.launch$default(useCaseThreads.sequentialScope, null, coroutineStart, new VirtualCameraState$connect$2$1(function1, completableDeferredImpl, null, 7), 1);
        return completableDeferredImpl;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final Deferred setParametersAsync(Map map, Config.OptionPriority optionPriority) {
        UseCaseCameraRequestControl.Type type2 = UseCaseCameraRequestControl.Type.SESSION_CONFIG;
        map.getClass();
        optionPriority.getClass();
        CompletableDeferredImpl runOnSequential = this.closed ? null : runOnSequential(new SessionWorker$doWork$2$2(this, map, optionPriority, (Continuation) null));
        return runOnSequential == null ? canceledResult : runOnSequential;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    /* renamed from: setTorchOffAsync-MtizInI */
    public final Deferred mo33setTorchOffAsyncMtizInI(int i) {
        CompletableDeferredImpl runOnSequential = this.closed ? null : runOnSequential(new UseCaseCameraRequestControlImpl$setTorchOffAsync$1$1(this, i, null));
        return runOnSequential == null ? submitFailedResult : runOnSequential;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final Deferred setTorchOnAsync() {
        CompletableDeferredImpl runOnSequential = this.closed ? null : runOnSequential(new Scene.AnonymousClass1((Object) this, (Continuation) (0 == true ? 1 : 0), 2));
        return runOnSequential == null ? submitFailedResult : runOnSequential;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    /* renamed from: startFocusAndMeteringAsync-NxRnBj4 */
    public final Deferred mo34startFocusAndMeteringAsyncNxRnBj4(List list, List list2, List list3, Lock3ABehavior lock3ABehavior, AeMode aeMode, long j) {
        CompletableDeferredImpl runOnSequential = !this.closed ? runOnSequential(new UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1(this, list, list2, list3, lock3ABehavior, aeMode, j, null)) : null;
        return runOnSequential == null ? submitFailedResult : runOnSequential;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final Deferred submitParameters(Map map, UseCaseCameraRequestControl.Type type2, Config.OptionPriority optionPriority) {
        type2.getClass();
        optionPriority.getClass();
        if (this.closed) {
            return canceledResult;
        }
        if (Intrinsics.areEqual(this.threads.isSequentialThread.get(), Boolean.TRUE)) {
            return JobKt.async$default(this.threads.sequentialScope, null, CoroutineStart.UNDISPATCHED, new FlowExtKt$simpleScan$1(this, type2, map, optionPriority, (Continuation) null, 4), 1);
        }
        Handlers$$ExternalSyntheticBUOutline0.m(Thread.currentThread().getName(), "Thread check failed: This method must be called from the UseCaseThreads sequential scope. Current thread: ");
        return null;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final Deferred update3aRegions(List list, List list2, List list3) {
        CompletableDeferredImpl runOnSequential = !this.closed ? runOnSequential(new UseCaseCameraRequestControlImpl$update3aRegions$1$1(this, list, list2, list3, null)) : null;
        return runOnSequential == null ? submitFailedResult : runOnSequential;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final Deferred updateCamera2ConfigAsync(Camera2ImplConfig camera2ImplConfig, Map map) {
        map.getClass();
        CompletableDeferredImpl runOnSequential = this.closed ? null : runOnSequential(new SessionWorker$doWork$2$2(this, camera2ImplConfig, map, 0 == true ? 1 : 0, 2));
        return runOnSequential == null ? canceledResult : runOnSequential;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateCameraStateAsync(InfoBundle infoBundle, LinkedHashSet linkedHashSet, ContinuationImpl continuationImpl) {
        UseCaseCameraRequestControlImpl$updateCameraStateAsync$1 useCaseCameraRequestControlImpl$updateCameraStateAsync$1;
        int i;
        Deferred deferred;
        int i2;
        if (continuationImpl instanceof UseCaseCameraRequestControlImpl$updateCameraStateAsync$1) {
            useCaseCameraRequestControlImpl$updateCameraStateAsync$1 = (UseCaseCameraRequestControlImpl$updateCameraStateAsync$1) continuationImpl;
            int i3 = useCaseCameraRequestControlImpl$updateCameraStateAsync$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                useCaseCameraRequestControlImpl$updateCameraStateAsync$1.label = i3 - PKIFailureInfo.systemUnavail;
                UseCaseCameraRequestControlImpl$updateCameraStateAsync$1 useCaseCameraRequestControlImpl$updateCameraStateAsync$12 = useCaseCameraRequestControlImpl$updateCameraStateAsync$1;
                Object obj = useCaseCameraRequestControlImpl$updateCameraStateAsync$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = useCaseCameraRequestControlImpl$updateCameraStateAsync$12.label;
                deferred = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!this.closed) {
                        CameraXConfig cameraXConfig = this.cameraXConfig;
                        AutoValue_Config_Option autoValue_Config_Option = Camera2CaptureRequestConfiguratorKt.OPTION_CAPTURE_REQUEST_CONFIGURATOR;
                        if (cameraXConfig.mConfig.retrieveOption(Camera2CaptureRequestConfiguratorKt.OPTION_CAPTURE_REQUEST_CONFIGURATOR, null) != null) {
                            a$$ExternalSyntheticBUOutline0.m$1();
                            return null;
                        }
                        CapturePipeline capturePipeline = (CapturePipeline) this.capturePipeline$delegate.getValue();
                        RequestTemplate requestTemplate = infoBundle.template;
                        requestTemplate.getClass();
                        if (requestTemplate.value != -1) {
                            RequestTemplate requestTemplate2 = infoBundle.template;
                            requestTemplate2.getClass();
                            i2 = requestTemplate2.value;
                        } else {
                            i2 = 1;
                        }
                        capturePipeline.setTemplate(i2);
                        UseCaseCameraState useCaseCameraState = (UseCaseCameraState) this.useCaseCameraState$delegate.getValue();
                        LinkedHashMap parameters = OverdraftStatus.State_.toParameters(infoBundle.options.build());
                        Metadata.Key key = TagsKt.CAMERAX_TAG_BUNDLE;
                        MutableTagBundle create = MutableTagBundle.create();
                        for (Map.Entry entry : infoBundle.tags.entrySet()) {
                            create.mTagMap.put((String) entry.getKey(), entry.getValue());
                        }
                        Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair(key, create));
                        RequestTemplate requestTemplate3 = infoBundle.template;
                        Set set = infoBundle.listeners;
                        useCaseCameraRequestControlImpl$updateCameraStateAsync$12.label = 1;
                        obj = useCaseCameraState.m38updateAsyncTp9XwKQ(parameters, mapOf, linkedHashSet, requestTemplate3, set, useCaseCameraRequestControlImpl$updateCameraStateAsync$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return deferred == null ? canceledResult : deferred;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                deferred = (Deferred) obj;
                if (deferred == null) {
                }
            }
        }
        useCaseCameraRequestControlImpl$updateCameraStateAsync$1 = new UseCaseCameraRequestControlImpl$updateCameraStateAsync$1(this, continuationImpl);
        UseCaseCameraRequestControlImpl$updateCameraStateAsync$1 useCaseCameraRequestControlImpl$updateCameraStateAsync$122 = useCaseCameraRequestControlImpl$updateCameraStateAsync$1;
        Object obj2 = useCaseCameraRequestControlImpl$updateCameraStateAsync$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = useCaseCameraRequestControlImpl$updateCameraStateAsync$122.label;
        deferred = null;
        if (i != 0) {
        }
        deferred = (Deferred) obj2;
        if (deferred == null) {
        }
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final Deferred updateRepeatingRequestAsync(LinkedHashSet linkedHashSet, boolean z) {
        CompletableDeferredImpl runOnSequential = this.closed ? null : runOnSequential(new RealReferralManager$refresh$2$1(linkedHashSet, z, this, (Continuation) null));
        return runOnSequential == null ? canceledResult : runOnSequential;
    }

    public final class InfoBundle {
        public final Set listeners;
        public final Toolbar.AnonymousClass1 options;
        public final Map tags;
        public RequestTemplate template;

        public /* synthetic */ InfoBundle(Toolbar.AnonymousClass1 anonymousClass1, LinkedHashMap linkedHashMap, RequestTemplate requestTemplate, int i) {
            this((i & 1) != 0 ? new Toolbar.AnonymousClass1(5) : anonymousClass1, (i & 2) != 0 ? new LinkedHashMap() : linkedHashMap, new LinkedHashSet(), (i & 8) != 0 ? null : requestTemplate);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoBundle)) {
                return false;
            }
            InfoBundle infoBundle = (InfoBundle) obj;
            return Intrinsics.areEqual(this.options, infoBundle.options) && Intrinsics.areEqual(this.tags, infoBundle.tags) && Intrinsics.areEqual(this.listeners, infoBundle.listeners) && Intrinsics.areEqual(this.template, infoBundle.template);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.options.hashCode() * 31, this.tags, 31), 31, this.listeners);
            RequestTemplate requestTemplate = this.template;
            return m + (requestTemplate == null ? 0 : Integer.hashCode(requestTemplate.value));
        }

        public final String toString() {
            return "InfoBundle(options=" + this.options + ", tags=" + this.tags + ", listeners=" + this.listeners + ", template=" + this.template + ')';
        }

        public InfoBundle(Toolbar.AnonymousClass1 anonymousClass1, Map map, Set set, RequestTemplate requestTemplate) {
            anonymousClass1.getClass();
            map.getClass();
            this.options = anonymousClass1;
            this.tags = map;
            this.listeners = set;
            this.template = requestTemplate;
        }
    }
}
