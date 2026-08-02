package androidx.camera.camera2.impl;

import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.camera.core.impl.Config;
import androidx.compose.material.SliderDraggableState$drag$2;
import androidx.paging.FlowExtKt$simpleScan$1;
import androidx.room.RoomDatabase$performClear$1;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.squareup.cash.profile.views.RingtoneView$playRingtone$1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$9$1$3;
import com.stripe.android.uicore.image.DefaultStripeImageLoader$load$2;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes3.dex */
public final class DeferredUseCaseCameraRequestControl implements UseCaseCameraRequestControl {
    public volatile UseCaseCameraRequestControlImpl impl;
    public final Provider implProvider;
    public final AtomicBoolean isClosed;
    public final UseCaseThreads threads;

    public DeferredUseCaseCameraRequestControl(Provider provider, UseCaseThreads useCaseThreads) {
        provider.getClass();
        useCaseThreads.getClass();
        this.implProvider = provider;
        this.threads = useCaseThreads;
        this.isClosed = new AtomicBoolean(false);
    }

    public static final UseCaseCameraRequestControlImpl access$getOrCreateImpl(DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl) {
        if (deferredUseCaseCameraRequestControl.isClosed.get()) {
            throw new CancellationException("UseCaseCameraRequestControl is closed");
        }
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = deferredUseCaseCameraRequestControl.impl;
        if (useCaseCameraRequestControlImpl != null) {
            return useCaseCameraRequestControlImpl;
        }
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl2 = (UseCaseCameraRequestControlImpl) deferredUseCaseCameraRequestControl.implProvider.get();
        if (deferredUseCaseCameraRequestControl.isClosed.get()) {
            useCaseCameraRequestControlImpl2.close();
            throw new CancellationException("UseCaseCameraRequestControl closed during initialization");
        }
        deferredUseCaseCameraRequestControl.impl = useCaseCameraRequestControlImpl2;
        useCaseCameraRequestControlImpl2.getClass();
        return useCaseCameraRequestControlImpl2;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final Object awaitSurfaceSetup(SuspendLambda suspendLambda) {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.awaitSurfaceSetup(suspendLambda) : JobKt.withContext(JobKt.from(this.threads.sequentialExecutor), new DeferredUseCaseCameraRequestControl$setTorchOnAsync$$inlined$runOnSequential$1(this, null, 1), suspendLambda);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final Deferred cancelFocusAndMeteringAsync() {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        if (useCaseCameraRequestControlImpl != null) {
            return useCaseCameraRequestControlImpl.cancelFocusAndMeteringAsync();
        }
        return JobKt.async$default(this.threads.sequentialScope, null, null, new DeferredUseCaseCameraRequestControl$setTorchOnAsync$$inlined$runOnSequential$1(this, null, 2), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final void close() {
        if (this.isClosed.getAndSet(true)) {
            return;
        }
        JobKt.launch$default(this.threads.sequentialScope, null, null, new DiskLruCache$launchCleanup$1((Continuation) null, this, 2), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final List issueSingleCaptureAsync(int i, int i2, int i3, ArrayList arrayList) {
        int size = arrayList.size();
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        if (useCaseCameraRequestControlImpl != null) {
            return useCaseCameraRequestControlImpl.issueSingleCaptureAsync(i, i2, i3, arrayList);
        }
        ContextScope contextScope = this.threads.sequentialScope;
        DefaultStripeImageLoader$load$2 defaultStripeImageLoader$load$2 = new DefaultStripeImageLoader$load$2(this, null, arrayList, i, i2, i3);
        Continuation continuation = null;
        DeferredCoroutine async$default = JobKt.async$default(contextScope, null, null, defaultStripeImageLoader$load$2, 3);
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList2.add(JobKt.async$default(this.threads.sequentialScope, null, null, new RingtoneView$playRingtone$1(async$default, i4, continuation, 1), 3));
        }
        return arrayList2;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final Deferred removeParametersAsync(List list) {
        UseCaseCameraRequestControl.Type type2 = UseCaseCameraRequestControl.Type.SESSION_CONFIG;
        list.getClass();
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.removeParametersAsync(list) : JobKt.async$default(this.threads.sequentialScope, null, null, new VirtualCameraState$connect$2$1(this, (Continuation) null, list), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final Deferred setParametersAsync(Map map, Config.OptionPriority optionPriority) {
        UseCaseCameraRequestControl.Type type2 = UseCaseCameraRequestControl.Type.SESSION_CONFIG;
        map.getClass();
        optionPriority.getClass();
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.setParametersAsync(map, optionPriority) : JobKt.async$default(this.threads.sequentialScope, null, null, new SliderDraggableState$drag$2(this, (Continuation) null, map, optionPriority), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    /* renamed from: setTorchOffAsync-MtizInI, reason: not valid java name */
    public final Deferred mo33setTorchOffAsyncMtizInI(int i) {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.mo33setTorchOffAsyncMtizInI(i) : JobKt.async$default(this.threads.sequentialScope, null, null, new RingtoneView$playRingtone$1(this, (Continuation) null, i), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final Deferred setTorchOnAsync() {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        if (useCaseCameraRequestControlImpl != null) {
            return useCaseCameraRequestControlImpl.setTorchOnAsync();
        }
        return JobKt.async$default(this.threads.sequentialScope, null, null, new DeferredUseCaseCameraRequestControl$setTorchOnAsync$$inlined$runOnSequential$1(this, null, 0), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    /* renamed from: startFocusAndMeteringAsync-NxRnBj4, reason: not valid java name */
    public final Deferred mo34startFocusAndMeteringAsyncNxRnBj4(List list, List list2, List list3, Lock3ABehavior lock3ABehavior, AeMode aeMode, long j) {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.mo34startFocusAndMeteringAsyncNxRnBj4(list, list2, list3, lock3ABehavior, aeMode, j) : JobKt.async$default(this.threads.sequentialScope, null, null, new Hero3DCardViewKt$InteractiveCard$9$1$3.AnonymousClass2(this, null, list, list2, list3, lock3ABehavior, aeMode, j), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final Deferred submitParameters(Map map, UseCaseCameraRequestControl.Type type2, Config.OptionPriority optionPriority) {
        type2.getClass();
        optionPriority.getClass();
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.submitParameters(map, type2, optionPriority) : JobKt.async$default(this.threads.sequentialScope, null, null, new FlowExtKt$simpleScan$1(this, (Continuation) null, map, type2, optionPriority, 2), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final Deferred update3aRegions(List list, List list2, List list3) {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.update3aRegions(list, list2, list3) : JobKt.async$default(this.threads.sequentialScope, null, null, new FlowExtKt$simpleScan$1(this, (Continuation) null, list, list2, list3, 3), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final Deferred updateCamera2ConfigAsync(Camera2ImplConfig camera2ImplConfig, Map map) {
        map.getClass();
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        return useCaseCameraRequestControlImpl != null ? useCaseCameraRequestControlImpl.updateCamera2ConfigAsync(camera2ImplConfig, map) : JobKt.async$default(this.threads.sequentialScope, null, null, new SliderDraggableState$drag$2(this, (Continuation) null, camera2ImplConfig, map), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final Deferred updateRepeatingRequestAsync(LinkedHashSet linkedHashSet, boolean z) {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.impl;
        if (useCaseCameraRequestControlImpl != null) {
            return useCaseCameraRequestControlImpl.updateRepeatingRequestAsync(linkedHashSet, z);
        }
        return JobKt.async$default(this.threads.sequentialScope, null, null, new RoomDatabase$performClear$1(this, (Continuation) null, z, linkedHashSet, 2), 3);
    }
}
