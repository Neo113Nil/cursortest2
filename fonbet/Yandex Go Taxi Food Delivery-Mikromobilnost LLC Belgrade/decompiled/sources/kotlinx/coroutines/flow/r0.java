package kotlinx.coroutines.flow;

import defpackage.bvf0;
import defpackage.dvw;
import defpackage.ffx;
import defpackage.fse;
import defpackage.gqs;
import defpackage.j18;
import defpackage.jb20;
import defpackage.jl40;
import defpackage.l8x;
import defpackage.ny61;
import defpackage.o4u0;
import defpackage.oa;
import defpackage.pa;
import defpackage.pz40;
import defpackage.r18;
import defpackage.seu;
import defpackage.tpr;
import defpackage.vez0;
import defpackage.vpr;
import defpackage.wb4;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes9.dex */
public final class r0 extends oa implements pz40, r18, gqs {
    public static final /* synthetic */ AtomicReferenceFieldUpdater y = AtomicReferenceFieldUpdater.newUpdater(r0.class, Object.class, "_state$volatile");
    public static final /* synthetic */ long z = wb4.a.objectFieldOffset(r0.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int x;

    public r0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.gqs
    public final tpr a(fse fseVar, int i, BufferOverflow bufferOverflow) {
        return (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? ffx.G(this, fseVar, i, bufferOverflow) : this;
    }

    @Override // defpackage.hnr0
    public final List b() {
        return Collections.singletonList(getValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0103, code lost:
    
        if (r9 == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
    
        if (r15 != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009b A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0038, B:14:0x0093, B:16:0x009b, B:18:0x00a0, B:20:0x00c1, B:23:0x00ce, B:24:0x00ea, B:30:0x00fa, B:26:0x00f1, B:29:0x00f7, B:40:0x00a6, B:43:0x00ad, B:52:0x0053, B:54:0x0061, B:55:0x0084, B:57:0x006f, B:59:0x0073), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0038, B:14:0x0093, B:16:0x009b, B:18:0x00a0, B:20:0x00c1, B:23:0x00ce, B:24:0x00ea, B:30:0x00fa, B:26:0x00f1, B:29:0x00f7, B:40:0x00a6, B:43:0x00ad, B:52:0x0053, B:54:0x0061, B:55:0x0084, B:57:0x006f, B:59:0x0073), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0038, B:14:0x0093, B:16:0x009b, B:18:0x00a0, B:20:0x00c1, B:23:0x00ce, B:24:0x00ea, B:30:0x00fa, B:26:0x00f1, B:29:0x00f7, B:40:0x00a6, B:43:0x00ad, B:52:0x0053, B:54:0x0061, B:55:0x0084, B:57:0x006f, B:59:0x0073), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00cd -> B:14:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        StateFlowImpl$collect$1 stateFlowImpl$collect$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        o4u0 o4u0Var;
        vpr vprVar2;
        l8x l8xVar;
        Object obj;
        AtomicReference atomicReference;
        jb20 jb20Var;
        Object obj2;
        Object obj3;
        try {
            if (continuation instanceof StateFlowImpl$collect$1) {
                stateFlowImpl$collect$1 = (StateFlowImpl$collect$1) continuation;
                int i2 = stateFlowImpl$collect$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    stateFlowImpl$collect$1.label = i2 - Integer.MIN_VALUE;
                    Object obj4 = stateFlowImpl$collect$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = stateFlowImpl$collect$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj4);
                        o4u0Var = (o4u0) d();
                        if (vprVar instanceof s0) {
                            stateFlowImpl$collect$1.L$0 = vprVar;
                            stateFlowImpl$collect$1.L$1 = o4u0Var;
                            stateFlowImpl$collect$1.label = 1;
                            if (((s0) vprVar).a(stateFlowImpl$collect$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else if (i == 1) {
                        o4u0Var = (o4u0) stateFlowImpl$collect$1.L$1;
                        vprVar = (vpr) stateFlowImpl$collect$1.L$0;
                        kotlin.b.b(obj4);
                    } else if (i == 2) {
                        obj = stateFlowImpl$collect$1.L$4;
                        l8xVar = (l8x) stateFlowImpl$collect$1.L$2;
                        o4u0Var = (o4u0) stateFlowImpl$collect$1.L$1;
                        vprVar2 = (vpr) stateFlowImpl$collect$1.L$0;
                        kotlin.b.b(obj4);
                        atomicReference = o4u0Var.a;
                        jb20Var = bvf0.h;
                        if (atomicReference.getAndSet(jb20Var) == bvf0.i) {
                        }
                        obj2 = y.get(this);
                        if (l8xVar != null) {
                        }
                        if (obj != null) {
                        }
                        if (obj2 == vez0.b) {
                        }
                        stateFlowImpl$collect$1.L$0 = vprVar2;
                        stateFlowImpl$collect$1.L$1 = o4u0Var;
                        stateFlowImpl$collect$1.L$2 = l8xVar;
                        stateFlowImpl$collect$1.L$3 = null;
                        stateFlowImpl$collect$1.L$4 = obj2;
                        stateFlowImpl$collect$1.label = 2;
                        if (vprVar2.emit(obj3, stateFlowImpl$collect$1) == coroutineSingletons) {
                        }
                    } else {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = stateFlowImpl$collect$1.L$3;
                        l8xVar = (l8x) stateFlowImpl$collect$1.L$2;
                        o4u0Var = (o4u0) stateFlowImpl$collect$1.L$1;
                        vprVar2 = (vpr) stateFlowImpl$collect$1.L$0;
                        kotlin.b.b(obj4);
                        obj2 = y.get(this);
                        if (l8xVar != null) {
                            kotlinx.coroutines.a.l(l8xVar);
                        }
                        if (obj != null || !obj.equals(obj2)) {
                            obj3 = obj2 == vez0.b ? null : obj2;
                            stateFlowImpl$collect$1.L$0 = vprVar2;
                            stateFlowImpl$collect$1.L$1 = o4u0Var;
                            stateFlowImpl$collect$1.L$2 = l8xVar;
                            stateFlowImpl$collect$1.L$3 = null;
                            stateFlowImpl$collect$1.L$4 = obj2;
                            stateFlowImpl$collect$1.label = 2;
                            if (vprVar2.emit(obj3, stateFlowImpl$collect$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            obj = obj2;
                        }
                        atomicReference = o4u0Var.a;
                        jb20Var = bvf0.h;
                        if (atomicReference.getAndSet(jb20Var) == bvf0.i) {
                            stateFlowImpl$collect$1.L$0 = vprVar2;
                            stateFlowImpl$collect$1.L$1 = o4u0Var;
                            stateFlowImpl$collect$1.L$2 = l8xVar;
                            stateFlowImpl$collect$1.L$3 = obj;
                            stateFlowImpl$collect$1.L$4 = null;
                            stateFlowImpl$collect$1.label = 3;
                            zy11 zy11Var = zy11.a;
                            j18 j18Var = new j18(1, dvw.b(stateFlowImpl$collect$1));
                            j18Var.u();
                            AtomicReference atomicReference2 = o4u0Var.a;
                            while (true) {
                                if (atomicReference2.compareAndSet(jb20Var, j18Var)) {
                                    break;
                                }
                                if (atomicReference2.get() != jb20Var) {
                                    j18Var.resumeWith(zy11Var);
                                    break;
                                }
                            }
                            Object s = j18Var.s();
                            if (s == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            }
                        }
                        obj2 = y.get(this);
                        if (l8xVar != null) {
                        }
                        if (obj != null) {
                        }
                        if (obj2 == vez0.b) {
                        }
                        stateFlowImpl$collect$1.L$0 = vprVar2;
                        stateFlowImpl$collect$1.L$1 = o4u0Var;
                        stateFlowImpl$collect$1.L$2 = l8xVar;
                        stateFlowImpl$collect$1.L$3 = null;
                        stateFlowImpl$collect$1.L$4 = obj2;
                        stateFlowImpl$collect$1.label = 2;
                        if (vprVar2.emit(obj3, stateFlowImpl$collect$1) == coroutineSingletons) {
                        }
                    }
                    vprVar2 = vprVar;
                    l8xVar = (l8x) stateFlowImpl$collect$1.get_context().get(seu.C);
                    obj = null;
                    obj2 = y.get(this);
                    if (l8xVar != null) {
                    }
                    if (obj != null) {
                    }
                    if (obj2 == vez0.b) {
                    }
                    stateFlowImpl$collect$1.L$0 = vprVar2;
                    stateFlowImpl$collect$1.L$1 = o4u0Var;
                    stateFlowImpl$collect$1.L$2 = l8xVar;
                    stateFlowImpl$collect$1.L$3 = null;
                    stateFlowImpl$collect$1.L$4 = obj2;
                    stateFlowImpl$collect$1.label = 2;
                    if (vprVar2.emit(obj3, stateFlowImpl$collect$1) == coroutineSingletons) {
                    }
                }
            }
            if (i != 0) {
            }
            vprVar2 = vprVar;
            l8xVar = (l8x) stateFlowImpl$collect$1.get_context().get(seu.C);
            obj = null;
            obj2 = y.get(this);
            if (l8xVar != null) {
            }
            if (obj != null) {
            }
            if (obj2 == vez0.b) {
            }
            stateFlowImpl$collect$1.L$0 = vprVar2;
            stateFlowImpl$collect$1.L$1 = o4u0Var;
            stateFlowImpl$collect$1.L$2 = l8xVar;
            stateFlowImpl$collect$1.L$3 = null;
            stateFlowImpl$collect$1.L$4 = obj2;
            stateFlowImpl$collect$1.label = 2;
            if (vprVar2.emit(obj3, stateFlowImpl$collect$1) == coroutineSingletons) {
            }
        } catch (Throwable th) {
            i(o4u0Var);
            throw th;
        }
        stateFlowImpl$collect$1 = new StateFlowImpl$collect$1(this, continuation);
        Object obj42 = stateFlowImpl$collect$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stateFlowImpl$collect$1.label;
    }

    @Override // defpackage.oa
    public final pa e() {
        return new o4u0();
    }

    @Override // defpackage.lz40, defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        l(obj);
        return zy11.a;
    }

    @Override // defpackage.lz40
    public final void f() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.lz40
    public final boolean g(Object obj) {
        l(obj);
        return true;
    }

    @Override // defpackage.n4u0
    public final Object getValue() {
        jb20 jb20Var = vez0.b;
        y.getClass();
        Object objectVolatile = wb4.a.getObjectVolatile(this, z);
        if (objectVolatile == jb20Var) {
            return null;
        }
        return objectVolatile;
    }

    @Override // defpackage.oa
    public final pa[] h() {
        return new o4u0[2];
    }

    public final boolean k(Object obj, Object obj2) {
        jb20 jb20Var = vez0.b;
        if (obj == null) {
            obj = jb20Var;
        }
        if (obj2 == null) {
            obj2 = jb20Var;
        }
        return m(obj, obj2);
    }

    public final void l(Object obj) {
        if (obj == null) {
            obj = vez0.b;
        }
        m(null, obj);
    }

    public final boolean m(Object obj, Object obj2) {
        int i;
        pa[] paVarArr;
        jb20 jb20Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !jl40.l(obj3, obj)) {
                return false;
            }
            if (jl40.l(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.x;
            if ((i2 & 1) != 0) {
                this.x = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.x = i3;
            pa[] paVarArr2 = this.a;
            while (true) {
                o4u0[] o4u0VarArr = (o4u0[]) paVarArr2;
                if (o4u0VarArr != null) {
                    for (o4u0 o4u0Var : o4u0VarArr) {
                        if (o4u0Var != null) {
                            AtomicReference atomicReference = o4u0Var.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (jb20Var = bvf0.i)) {
                                    jb20 jb20Var2 = bvf0.h;
                                    if (obj4 != jb20Var2) {
                                        while (!atomicReference.compareAndSet(obj4, jb20Var2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((j18) obj4).resumeWith(zy11.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, jb20Var)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.x;
                    if (i == i3) {
                        this.x = i3 + 1;
                        return true;
                    }
                    paVarArr = this.a;
                }
                paVarArr2 = paVarArr;
                i3 = i;
            }
        }
    }
}
