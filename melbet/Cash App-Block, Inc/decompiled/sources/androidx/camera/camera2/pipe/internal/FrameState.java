package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.OutputStatus;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.internal.OutputDistributor;
import androidx.camera.camera2.pipe.media.ImageWrapper;
import androidx.camera.camera2.pipe.media.OutputImage;
import androidx.camera.camera2.pipe.media.SharedOutputImage$Companion$SharedOutputImageImpl;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.mlkit.vision.text.Text;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Reflection;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicInt;
import kotlinx.atomicfu.AtomicLong;
import kotlinx.atomicfu.AtomicRef;
import kotlinx.coroutines.CompletableDeferredImpl;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class FrameState {
    public static final AtomicLong frameIds;
    public final long frameId;
    public final FrameInfoOutput frameInfoOutput;
    public final long frameNumber;
    public final long frameTimestamp;
    public final ListBuilder imageOutputs;
    public final CopyOnWriteArrayList listenerStates;
    public final AtomicInt remainingStreamCount;
    public final AtomicRef state;

    public final class FrameInfoOutput extends Text.TextBase implements OutputDistributor.OutputListener {
        public FrameInfoOutput() {
            super(3, false);
        }

        @Override // androidx.camera.camera2.pipe.internal.OutputDistributor.OutputListener
        /* renamed from: onOutputComplete-3ejhThk, reason: not valid java name */
        public final void mo96onOutputComplete3ejhThk(Object obj) {
            Object obj2;
            State state;
            ((CompletableDeferredImpl) this.zzd).makeCompleting$kotlinx_coroutines_core(new OutputResult(obj));
            FrameState frameState = FrameState.this;
            AtomicRef atomicRef = frameState.state;
            do {
                obj2 = atomicRef.value;
                State state2 = (State) obj2;
                int ordinal = state2.ordinal();
                if (ordinal == 0) {
                    state = State.FRAME_INFO_COMPLETE;
                } else {
                    if (ordinal != 2) {
                        throw new IllegalStateException("Unexpected frame state for " + frameState + "! State is " + state2 + ' ');
                    }
                    state = State.COMPLETE;
                }
            } while (!atomicRef.compareAndSet(obj2, state));
            Iterator it = frameState.listenerStates.iterator();
            it.getClass();
            if (it.hasNext()) {
                throw Recorder$$ExternalSyntheticOutline2.m(it);
            }
            if (state == State.COMPLETE) {
                Iterator it2 = frameState.listenerStates.iterator();
                it2.getClass();
                if (it2.hasNext()) {
                    throw Recorder$$ExternalSyntheticOutline2.m(it2);
                }
            }
        }

        @Override // com.google.mlkit.vision.text.Text.TextBase
        public final void release() {
        }
    }

    public final class ImageOutput extends Text.TextBase implements OutputDistributor.OutputListener {
        public final int outputId;
        public final AtomicInt remainingOutputResults;
        public final int streamId;

        public ImageOutput(int i, int i2, AtomicInt atomicInt) {
            super(3, false);
            this.streamId = i;
            this.outputId = i2;
            this.remainingOutputResults = atomicInt;
        }

        @Override // androidx.camera.camera2.pipe.internal.OutputDistributor.OutputListener
        /* renamed from: onOutputComplete-3ejhThk */
        public final void mo96onOutputComplete3ejhThk(Object obj) {
            Object obj2;
            State state;
            AutoCloseable acquire;
            boolean isTerminated;
            boolean z = obj instanceof OutputStatus;
            OutputImage outputImage = (OutputImage) ((z || obj == null) ? null : obj);
            if (outputImage != null) {
                if (outputImage instanceof SharedOutputImage$Companion$SharedOutputImageImpl) {
                    acquire = ((SharedOutputImage$Companion$SharedOutputImageImpl) outputImage).acquire();
                } else {
                    SharedOutputImage$Companion$SharedOutputImageImpl sharedOutputImage$Companion$SharedOutputImageImpl = (SharedOutputImage$Companion$SharedOutputImageImpl) outputImage.unwrapAs(Reflection.factory.getOrCreateKotlinClass(SharedOutputImage$Companion$SharedOutputImageImpl.class));
                    acquire = sharedOutputImage$Companion$SharedOutputImageImpl != null ? sharedOutputImage$Companion$SharedOutputImageImpl.acquire() : new SharedOutputImage$Companion$SharedOutputImageImpl(outputImage, new Recorder.AnonymousClass3(outputImage));
                }
                if (!((CompletableDeferredImpl) this.zzd).makeCompleting$kotlinx_coroutines_core(new OutputResult(acquire))) {
                    if (acquire instanceof AutoCloseable) {
                        acquire.close();
                    } else {
                        if (!(acquire instanceof ExecutorService)) {
                            Path$$ExternalSyntheticBUOutline0.m$3();
                            return;
                        }
                        ExecutorService executorService = (ExecutorService) acquire;
                        if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                            executorService.shutdown();
                            boolean z2 = false;
                            while (!isTerminated) {
                                try {
                                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                } catch (InterruptedException unused) {
                                    if (!z2) {
                                        executorService.shutdownNow();
                                        z2 = true;
                                    }
                                }
                            }
                            if (z2) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                }
            } else {
                ((CompletableDeferredImpl) this.zzd).makeCompleting$kotlinx_coroutines_core(new OutputResult(new OutputStatus((z || obj == null) ? obj == null ? 2 : ((OutputStatus) obj).value : 1)));
            }
            AtomicInt atomicInt = this.remainingOutputResults;
            atomicInt.getClass();
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = AtomicInt.FU;
            if (atomicIntegerFieldUpdater.decrementAndGet(atomicInt) == 0) {
                Iterator it = FrameState.this.listenerStates.iterator();
                it.getClass();
                if (it.hasNext()) {
                    throw Recorder$$ExternalSyntheticOutline2.m(it);
                }
                FrameState frameState = FrameState.this;
                AtomicInt atomicInt2 = frameState.remainingStreamCount;
                atomicInt2.getClass();
                if (atomicIntegerFieldUpdater.decrementAndGet(atomicInt2) != 0) {
                    return;
                }
                AtomicRef atomicRef = frameState.state;
                do {
                    obj2 = atomicRef.value;
                    State state2 = (State) obj2;
                    int ordinal = state2.ordinal();
                    if (ordinal == 0) {
                        state = State.STREAM_RESULTS_COMPLETE;
                    } else {
                        if (ordinal != 1) {
                            throw new IllegalStateException("Unexpected frame state for " + frameState + "! State is " + state2 + ' ');
                        }
                        state = State.COMPLETE;
                    }
                } while (!atomicRef.compareAndSet(obj2, state));
                Iterator it2 = frameState.listenerStates.iterator();
                it2.getClass();
                if (it2.hasNext()) {
                    throw Recorder$$ExternalSyntheticOutline2.m(it2);
                }
                if (state == State.COMPLETE) {
                    Iterator it3 = frameState.listenerStates.iterator();
                    it3.getClass();
                    if (it3.hasNext()) {
                        throw Recorder$$ExternalSyntheticOutline2.m(it3);
                    }
                }
            }
        }

        @Override // com.google.mlkit.vision.text.Text.TextBase
        public final void release() {
            boolean isTerminated;
            CompletableDeferredImpl completableDeferredImpl = (CompletableDeferredImpl) this.zzd;
            Object obj = null;
            if (completableDeferredImpl.isCompleted() && !completableDeferredImpl.isCancelled()) {
                Object obj2 = ((OutputResult) completableDeferredImpl.getCompletedInternal$kotlinx_coroutines_core()).result;
                if (!(obj2 instanceof OutputStatus) && obj2 != null) {
                    obj = obj2;
                }
            }
            ImageWrapper imageWrapper = (SharedOutputImage$Companion$SharedOutputImageImpl) obj;
            if (imageWrapper != null) {
                if (imageWrapper instanceof AutoCloseable) {
                    imageWrapper.close();
                    return;
                }
                if (!(imageWrapper instanceof ExecutorService)) {
                    Path$$ExternalSyntheticBUOutline0.m$3();
                    return;
                }
                ExecutorService executorService = (ExecutorService) imageWrapper;
                if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
                    return;
                }
                executorService.shutdown();
                boolean z = false;
                while (!isTerminated) {
                    try {
                        isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            executorService.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class State {
        public static final /* synthetic */ State[] $VALUES;
        public static final State COMPLETE;
        public static final State FRAME_INFO_COMPLETE;
        public static final State STARTED;
        public static final State STREAM_RESULTS_COMPLETE;

        static {
            State state = new State("STARTED", 0);
            STARTED = state;
            State state2 = new State("FRAME_INFO_COMPLETE", 1);
            FRAME_INFO_COMPLETE = state2;
            State state3 = new State("STREAM_RESULTS_COMPLETE", 2);
            STREAM_RESULTS_COMPLETE = state3;
            State state4 = new State("COMPLETE", 3);
            COMPLETE = state4;
            $VALUES = new State[]{state, state2, state3, state4};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    static {
        AtomicLong atomicLong = new AtomicLong();
        atomicLong.value = 0L;
        frameIds = atomicLong;
    }

    public FrameState(RequestMetadata requestMetadata, long j, long j2, Set set) {
        Object obj;
        requestMetadata.getClass();
        set.getClass();
        this.frameNumber = j;
        this.frameTimestamp = j2;
        AtomicLong atomicLong = frameIds;
        atomicLong.getClass();
        this.frameId = AtomicLong.FU.incrementAndGet(atomicLong);
        this.frameInfoOutput = new FrameInfoOutput();
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        Iterator it = requestMetadata.getStreams().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int i = ((StreamId) it.next()).value;
            Iterator it2 = set.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (((CameraStream) obj).id == i) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            CameraStream cameraStream = (CameraStream) obj;
            if (cameraStream != null) {
                ArrayList arrayList = cameraStream.outputs;
                AtomicInt atomic = AtomicFU.atomic(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    createListBuilder.add(new ImageOutput(i, ((StreamGraphImpl.OutputStreamImpl) arrayList.get(i2)).id, atomic));
                }
            }
        }
        ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
        this.imageOutputs = build;
        this.state = AtomicFU.atomic(State.STARTED);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(build, 10));
        ListIterator listIterator = build.listIterator(0);
        while (true) {
            ListBuilder.Itr itr = (ListBuilder.Itr) listIterator;
            if (!itr.hasNext()) {
                this.remainingStreamCount = AtomicFU.atomic(CollectionsKt.toList(CollectionsKt.toMutableSet(arrayList2)).size());
                this.listenerStates = new CopyOnWriteArrayList();
                return;
            }
            arrayList2.add(new StreamId(((ImageOutput) itr.next()).streamId));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame-");
        sb.append((Object) ("FrameId(value=" + this.frameId + ')'));
        sb.append('(');
        sb.append(this.frameNumber);
        sb.append('@');
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.frameTimestamp, ')');
    }
}
