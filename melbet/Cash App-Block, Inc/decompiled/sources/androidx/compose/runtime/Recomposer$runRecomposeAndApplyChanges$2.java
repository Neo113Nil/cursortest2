package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectListKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry;
import com.squareup.cash.core.navigationcontainer.UiContainerKt$$ExternalSyntheticLambda32;
import com.squareup.wire.GrpcMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements Function3 {
    public /* synthetic */ MonotonicFrameClock L$0;
    public List L$1;
    public List L$2;
    public List L$3;
    public MutableScatterSet L$4;
    public MutableScatterSet L$5;
    public MutableScatterSet L$6;
    public Set L$7;
    public MutableScatterSet L$8;
    public int label;
    public final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, Continuation continuation) {
        super(3, continuation);
        this.this$0 = recomposer;
    }

    public static final void invokeSuspend$clearRecompositionState(Recomposer recomposer, List list, List list2, List list3, MutableScatterSet mutableScatterSet, MutableScatterSet mutableScatterSet2, MutableScatterSet mutableScatterSet3, MutableScatterSet mutableScatterSet4) {
        char c;
        long j;
        long j2;
        synchronized (recomposer.stateLock) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    CompositionImpl compositionImpl = (CompositionImpl) list3.get(i);
                    compositionImpl.abandonChanges();
                    recomposer.recordFailedCompositionLocked(compositionImpl);
                }
                list3.clear();
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    CompositionImpl compositionImpl2 = (CompositionImpl) objArr[(i2 << 3) + i4];
                                    compositionImpl2.abandonChanges();
                                    recomposer.recordFailedCompositionLocked(compositionImpl2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                mutableScatterSet.clear();
                Object[] objArr2 = mutableScatterSet2.elements;
                long[] jArr2 = mutableScatterSet2.metadata;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((CompositionImpl) objArr2[(i5 << 3) + i7]).changesApplied();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                mutableScatterSet2.clear();
                mutableScatterSet3.clear();
                Object[] objArr3 = mutableScatterSet4.elements;
                long[] jArr3 = mutableScatterSet4.metadata;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    CompositionImpl compositionImpl3 = (CompositionImpl) objArr3[(i8 << 3) + i10];
                                    compositionImpl3.abandonChanges();
                                    recomposer.recordFailedCompositionLocked(compositionImpl3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                mutableScatterSet4.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void invokeSuspend$fillToInsert(List list, Recomposer recomposer) {
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                ArrayList arrayList = recomposer.movableContentAwaitingInsert;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((MovableContentStateReference) arrayList.get(i));
                }
                recomposer.movableContentAwaitingInsert.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, (Continuation) obj3);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = (MonotonicFrameClock) obj2;
        recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(Unit.INSTANCE);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0151 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0144 -> B:6:0x014c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01f9 -> B:20:0x009f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MonotonicFrameClock monotonicFrameClock;
        MutableScatterSet mutableScatterSet;
        MutableScatterSet mutableScatterSet2;
        List list;
        Set set;
        List list2;
        MutableScatterSet mutableScatterSet3;
        List list3;
        MutableScatterSet mutableScatterSet4;
        List list4;
        MutableScatterSet mutableScatterSet5;
        List list5;
        MutableScatterSet mutableScatterSet6;
        Recomposer recomposer;
        Object obj2;
        CancellableContinuationImpl cancellableContinuationImpl;
        CoroutineSingletons coroutineSingletons;
        MonotonicFrameClock monotonicFrameClock2;
        MutableObjectList mutableObjectList;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            monotonicFrameClock = this.L$0;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            MutableScatterSet mutableScatterSet7 = ScatterSetKt.EmptyScatterSet;
            mutableScatterSet = new MutableScatterSet();
            MutableScatterSet mutableScatterSet8 = new MutableScatterSet();
            MutableScatterSet mutableScatterSet9 = new MutableScatterSet();
            ScatterSetWrapper scatterSetWrapper = new ScatterSetWrapper(mutableScatterSet9);
            mutableScatterSet2 = new MutableScatterSet();
            list = arrayList;
            set = scatterSetWrapper;
            list2 = arrayList2;
            mutableScatterSet3 = mutableScatterSet9;
            list3 = arrayList3;
            mutableScatterSet4 = mutableScatterSet8;
            synchronized (this.this$0.stateLock) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                MutableScatterSet mutableScatterSet10 = this.L$8;
                set = this.L$7;
                mutableScatterSet3 = this.L$6;
                mutableScatterSet4 = this.L$5;
                mutableScatterSet = this.L$4;
                list3 = this.L$3;
                list2 = this.L$2;
                list = this.L$1;
                MonotonicFrameClock monotonicFrameClock3 = this.L$0;
                SafeTrace.throwOnFailure(obj);
                mutableScatterSet2 = mutableScatterSet10;
                monotonicFrameClock = monotonicFrameClock3;
                Recomposer recomposer2 = this.this$0;
                synchronized (recomposer2.stateLock) {
                    try {
                        if (recomposer2.movableContentRemoved.isNotEmpty()) {
                            MutableObjectList m579valuesimpl = MultiValueMap.m579valuesimpl(recomposer2.movableContentRemoved);
                            recomposer2.movableContentRemoved.clear();
                            WorkLauncherImpl workLauncherImpl = recomposer2.movableContentNestedStatesAvailable;
                            ((MutableScatterMap) workLauncherImpl.processor).clear();
                            ((MutableScatterMap) workLauncherImpl.workTaskExecutor).clear();
                            recomposer2.movableContentNestedExtractionsPending.clear();
                            mutableObjectList = new MutableObjectList(m579valuesimpl._size);
                            Object[] objArr = m579valuesimpl.content;
                            int i4 = m579valuesimpl._size;
                            coroutineSingletons = coroutineSingletons2;
                            int i5 = 0;
                            while (i5 < i4) {
                                int i6 = i5;
                                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr[i5];
                                mutableObjectList.add(new Pair(movableContentStateReference, recomposer2.movableContentStatesAvailable.get(movableContentStateReference)));
                                i5 = i6 + 1;
                                monotonicFrameClock = monotonicFrameClock;
                                objArr = objArr;
                            }
                            monotonicFrameClock2 = monotonicFrameClock;
                            recomposer2.movableContentStatesAvailable.clear();
                        } else {
                            coroutineSingletons = coroutineSingletons2;
                            monotonicFrameClock2 = monotonicFrameClock;
                            mutableObjectList = ObjectListKt.EmptyObjectList;
                            mutableObjectList.getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr2 = mutableObjectList.content;
                int i7 = mutableObjectList._size;
                for (int i8 = 0; i8 < i7; i8++) {
                    Pair pair = (Pair) objArr2[i8];
                }
                GrpcMethod grpcMethod = this.this$0.nextFrameEndCallbackQueue;
                ((AtomicInt) grpcMethod.path).set(0);
                ((ComponentRegistry.Builder) grpcMethod.requestAdapter).flushAndDispatchAwaiters(new SaversKt$$ExternalSyntheticLambda2(9));
                coroutineSingletons2 = coroutineSingletons;
                monotonicFrameClock = monotonicFrameClock2;
                i2 = 2;
                i3 = 1;
                synchronized (this.this$0.stateLock) {
                }
                Recomposer recomposer3 = this.this$0;
                this.L$0 = monotonicFrameClock;
                this.L$1 = list;
                this.L$2 = list2;
                this.L$3 = list3;
                this.L$4 = mutableScatterSet;
                this.L$5 = mutableScatterSet4;
                this.L$6 = mutableScatterSet3;
                this.L$7 = set;
                this.L$8 = mutableScatterSet2;
                this.label = i3;
                if (recomposer3.getHasSchedulingWork()) {
                    obj2 = Unit.INSTANCE;
                } else {
                    CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(i3, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                    cancellableContinuationImpl2.initCancellability();
                    synchronized (recomposer3.stateLock) {
                        if (recomposer3.getHasSchedulingWork()) {
                            cancellableContinuationImpl = cancellableContinuationImpl2;
                        } else {
                            recomposer3.workContinuation = cancellableContinuationImpl2;
                            cancellableContinuationImpl = null;
                        }
                    }
                    if (cancellableContinuationImpl != null) {
                        Result.Companion companion = Result.Companion;
                        cancellableContinuationImpl.resumeWith(Unit.INSTANCE);
                    }
                    obj2 = cancellableContinuationImpl2.getResult();
                    if (obj2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        obj2 = Unit.INSTANCE;
                    }
                }
                if (obj2 != coroutineSingletons2) {
                    List list6 = list;
                    mutableScatterSet5 = mutableScatterSet;
                    mutableScatterSet6 = mutableScatterSet2;
                    list4 = list3;
                    list5 = list6;
                    Set set2 = set;
                    MutableScatterSet mutableScatterSet11 = mutableScatterSet4;
                    MutableScatterSet mutableScatterSet12 = mutableScatterSet3;
                    recomposer = this.this$0;
                    StateFlowImpl stateFlowImpl = Recomposer._runningRecomposers;
                    if (recomposer.recordComposerModifications()) {
                        List list7 = list4;
                        mutableScatterSet2 = mutableScatterSet6;
                        mutableScatterSet = mutableScatterSet5;
                        list = list5;
                        list3 = list7;
                        mutableScatterSet3 = mutableScatterSet12;
                        mutableScatterSet4 = mutableScatterSet11;
                        set = set2;
                        synchronized (this.this$0.stateLock) {
                        }
                    } else {
                        UiContainerKt$$ExternalSyntheticLambda32 uiContainerKt$$ExternalSyntheticLambda32 = new UiContainerKt$$ExternalSyntheticLambda32(this.this$0, mutableScatterSet12, mutableScatterSet6, list5, list2, mutableScatterSet5, list4, mutableScatterSet11, set2);
                        this.L$0 = monotonicFrameClock;
                        this.L$1 = list5;
                        this.L$2 = list2;
                        this.L$3 = list4;
                        this.L$4 = mutableScatterSet5;
                        this.L$5 = mutableScatterSet11;
                        this.L$6 = mutableScatterSet12;
                        this.L$7 = set2;
                        this.L$8 = mutableScatterSet6;
                        this.label = i2;
                        if (monotonicFrameClock.withFrameNanos(this, uiContainerKt$$ExternalSyntheticLambda32) != coroutineSingletons2) {
                            List list8 = list4;
                            mutableScatterSet2 = mutableScatterSet6;
                            mutableScatterSet = mutableScatterSet5;
                            list = list5;
                            list3 = list8;
                            mutableScatterSet3 = mutableScatterSet12;
                            mutableScatterSet4 = mutableScatterSet11;
                            set = set2;
                            Recomposer recomposer22 = this.this$0;
                            synchronized (recomposer22.stateLock) {
                            }
                        }
                    }
                }
                return coroutineSingletons2;
            }
            MutableScatterSet mutableScatterSet13 = this.L$8;
            set = this.L$7;
            mutableScatterSet3 = this.L$6;
            mutableScatterSet4 = this.L$5;
            MutableScatterSet mutableScatterSet14 = this.L$4;
            List list9 = this.L$3;
            list2 = this.L$2;
            List list10 = this.L$1;
            MonotonicFrameClock monotonicFrameClock4 = this.L$0;
            SafeTrace.throwOnFailure(obj);
            mutableScatterSet6 = mutableScatterSet13;
            monotonicFrameClock = monotonicFrameClock4;
            list4 = list9;
            list5 = list10;
            mutableScatterSet5 = mutableScatterSet14;
            Set set22 = set;
            MutableScatterSet mutableScatterSet112 = mutableScatterSet4;
            MutableScatterSet mutableScatterSet122 = mutableScatterSet3;
            recomposer = this.this$0;
            StateFlowImpl stateFlowImpl2 = Recomposer._runningRecomposers;
            if (recomposer.recordComposerModifications()) {
            }
        }
    }
}
