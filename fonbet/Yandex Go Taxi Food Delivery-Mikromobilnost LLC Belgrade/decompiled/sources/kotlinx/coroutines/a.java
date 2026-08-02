package kotlinx.coroutines;

import defpackage.dse;
import defpackage.dvw;
import defpackage.e3n;
import defpackage.ebh;
import defpackage.fph;
import defpackage.fse;
import defpackage.j18;
import defpackage.kp50;
import defpackage.l8x;
import defpackage.m1k;
import defpackage.noh;
import defpackage.ny61;
import defpackage.q1k;
import defpackage.s8x;
import defpackage.sb2;
import defpackage.seu;
import defpackage.sls;
import defpackage.t8x;
import defpackage.tje;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.yb4;
import defpackage.yhl;
import defpackage.zdz0;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.DurationUnit;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public abstract class a {
    public static s8x a() {
        return new s8x(null);
    }

    public static final Object b(Collection collection, Continuation continuation) {
        return collection.isEmpty() ? EmptyList.a : new yb4((noh[]) collection.toArray(new noh[0])).a(continuation);
    }

    public static final Object c(noh[] nohVarArr, SuspendLambda suspendLambda) {
        return nohVarArr.length == 0 ? EmptyList.a : new yb4(nohVarArr).a(suspendLambda);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons d(Continuation continuation) {
        DelayKt$awaitCancellation$1 delayKt$awaitCancellation$1;
        int i;
        if (continuation instanceof DelayKt$awaitCancellation$1) {
            delayKt$awaitCancellation$1 = (DelayKt$awaitCancellation$1) continuation;
            int i2 = delayKt$awaitCancellation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                delayKt$awaitCancellation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = delayKt$awaitCancellation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = delayKt$awaitCancellation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    delayKt$awaitCancellation$1.I$0 = 0;
                    delayKt$awaitCancellation$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(delayKt$awaitCancellation$1));
                    j18Var.u();
                    if (j18Var.s() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ny61.A();
                return null;
            }
        }
        delayKt$awaitCancellation$1 = new DelayKt$awaitCancellation$1(continuation);
        Object obj2 = delayKt$awaitCancellation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = delayKt$awaitCancellation$1.label;
        if (i != 0) {
        }
        ny61.A();
        return null;
    }

    public static final void e(fse fseVar, CancellationException cancellationException) {
        l8x l8xVar = (l8x) fseVar.get(seu.C);
        if (l8xVar != null) {
            l8xVar.a(cancellationException);
        }
    }

    public static final Object f(l8x l8xVar, Continuation continuation) {
        l8xVar.a(null);
        Object u0 = l8xVar.u0(continuation);
        return u0 == CoroutineSingletons.COROUTINE_SUSPENDED ? u0 : zy11.a;
    }

    public static final void g(fse fseVar, CancellationException cancellationException) {
        l8x l8xVar = (l8x) fseVar.get(seu.C);
        if (l8xVar != null) {
            Iterator it = l8xVar.getChildren().iterator();
            while (it.hasNext()) {
                ((l8x) it.next()).a(cancellationException);
            }
        }
    }

    public static void h(l8x l8xVar) {
        Iterator it = l8xVar.getChildren().iterator();
        while (it.hasNext()) {
            ((l8x) it.next()).a(null);
        }
    }

    public static final Object i(long j, Continuation continuation) {
        if (j > 0) {
            j18 j18Var = new j18(1, dvw.b(continuation));
            j18Var.u();
            if (j < ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                m(j18Var.x).d(j, j18Var);
            }
            Object s = j18Var.s();
            if (s == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return s;
            }
        }
        return zy11.a;
    }

    public static final Object j(long j, Continuation continuation) {
        Object i = i(t(j), continuation);
        return i == CoroutineSingletons.COROUTINE_SUSPENDED ? i : zy11.a;
    }

    public static final void k(fse fseVar) {
        l8x l8xVar = (l8x) fseVar.get(seu.C);
        if (l8xVar != null) {
            l(l8xVar);
        }
    }

    public static final void l(l8x l8xVar) {
        if (!l8xVar.isActive()) {
            throw l8xVar.I();
        }
    }

    public static final fph m(fse fseVar) {
        dse dseVar = fseVar.get(x4c.K);
        fph fphVar = dseVar instanceof fph ? (fph) dseVar : null;
        return fphVar == null ? ebh.a : fphVar;
    }

    public static final l8x n(fse fseVar) {
        l8x l8xVar = (l8x) fseVar.get(seu.C);
        if (l8xVar != null) {
            return l8xVar;
        }
        yhl.d(fseVar, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final m1k o(l8x l8xVar, boolean z, t8x t8xVar) {
        if (l8xVar instanceof c) {
            return ((c) l8xVar).R(z, t8xVar);
        }
        return l8xVar.D(new JobKt__JobKt$invokeOnCompletion$1(1, t8xVar, t8x.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0), t8xVar.n(), z);
    }

    public static final boolean p(fse fseVar) {
        l8x l8xVar = (l8x) fseVar.get(seu.C);
        if (l8xVar != null) {
            return l8xVar.isActive();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0069 -> B:10:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q(l8x[] l8xVarArr, ContinuationImpl continuationImpl) {
        AwaitKt$joinAll$1 awaitKt$joinAll$1;
        int i;
        l8x[] l8xVarArr2;
        int length;
        int i2;
        int i3;
        if (continuationImpl instanceof AwaitKt$joinAll$1) {
            awaitKt$joinAll$1 = (AwaitKt$joinAll$1) continuationImpl;
            int i4 = awaitKt$joinAll$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                awaitKt$joinAll$1.label = i4 - Integer.MIN_VALUE;
                Object obj = awaitKt$joinAll$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = awaitKt$joinAll$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l8xVarArr2 = l8xVarArr;
                    length = l8xVarArr.length;
                    i2 = 0;
                    i3 = 0;
                    if (i2 < length) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    length = awaitKt$joinAll$1.I$2;
                    i2 = awaitKt$joinAll$1.I$1;
                    i3 = awaitKt$joinAll$1.I$0;
                    l8x[] l8xVarArr3 = (l8x[]) awaitKt$joinAll$1.L$1;
                    kotlin.b.b(obj);
                    l8xVarArr2 = l8xVarArr3;
                    i2++;
                    if (i2 < length) {
                        l8x l8xVar = l8xVarArr2[i2];
                        awaitKt$joinAll$1.L$0 = null;
                        awaitKt$joinAll$1.L$1 = l8xVarArr2;
                        awaitKt$joinAll$1.L$2 = null;
                        awaitKt$joinAll$1.L$3 = null;
                        awaitKt$joinAll$1.I$0 = i3;
                        awaitKt$joinAll$1.I$1 = i2;
                        awaitKt$joinAll$1.I$2 = length;
                        awaitKt$joinAll$1.I$3 = 0;
                        awaitKt$joinAll$1.label = 1;
                        if (l8xVar.u0(awaitKt$joinAll$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i2++;
                        if (i2 < length) {
                            return zy11.a;
                        }
                    }
                }
            }
        }
        awaitKt$joinAll$1 = new AwaitKt$joinAll$1(continuationImpl);
        Object obj2 = awaitKt$joinAll$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = awaitKt$joinAll$1.label;
        if (i != 0) {
        }
    }

    public static Object r(sls slsVar, ContinuationImpl continuationImpl) {
        return tje.k0(EmptyCoroutineContext.a, new InterruptibleKt$runInterruptible$2(slsVar, null), continuationImpl);
    }

    public static final Object s(zdz0 zdz0Var, wls wlsVar) {
        o(zdz0Var, true, new q1k(m(zdz0Var.y.get_context()).e(zdz0Var.z, zdz0Var, zdz0Var.x)));
        return sb2.H(zdz0Var, false, zdz0Var, wlsVar);
    }

    public static final long t(long j) {
        boolean j2 = e3n.j(j);
        if (j2) {
            return e3n.e(e3n.k(j, kp50.V(999999L, DurationUnit.NANOSECONDS)));
        }
        if (!j2) {
            return 0L;
        }
        w511.b();
        return 0L;
    }

    public static final Object u(long j, wls wlsVar, ContinuationImpl continuationImpl) {
        if (j <= 0) {
            throw new TimeoutCancellationException("Timed out immediately", null);
        }
        Object s = s(new zdz0(j, continuationImpl), wlsVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    public static final Object v(long j, wls wlsVar, ContinuationImpl continuationImpl) {
        return u(t(j), wlsVar, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, zdz0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object w(long j, wls wlsVar, Continuation continuation) {
        TimeoutKt$withTimeoutOrNull$1 timeoutKt$withTimeoutOrNull$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        if (continuation instanceof TimeoutKt$withTimeoutOrNull$1) {
            timeoutKt$withTimeoutOrNull$1 = (TimeoutKt$withTimeoutOrNull$1) continuation;
            int i2 = timeoutKt$withTimeoutOrNull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                timeoutKt$withTimeoutOrNull$1.label = i2 - Integer.MIN_VALUE;
                Object obj = timeoutKt$withTimeoutOrNull$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = timeoutKt$withTimeoutOrNull$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (j > 0) {
                        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                        try {
                            timeoutKt$withTimeoutOrNull$1.L$0 = wlsVar;
                            timeoutKt$withTimeoutOrNull$1.L$1 = ref$ObjectRef2;
                            timeoutKt$withTimeoutOrNull$1.J$0 = j;
                            timeoutKt$withTimeoutOrNull$1.label = 1;
                            ?? zdz0Var = new zdz0(j, timeoutKt$withTimeoutOrNull$1);
                            ref$ObjectRef2.element = zdz0Var;
                            Object s = s(zdz0Var, wlsVar);
                            return s == coroutineSingletons ? coroutineSingletons : s;
                        } catch (TimeoutCancellationException e) {
                            e = e;
                            ref$ObjectRef = ref$ObjectRef2;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef = (Ref$ObjectRef) timeoutKt$withTimeoutOrNull$1.L$1;
                try {
                    kotlin.b.b(obj);
                    return obj;
                } catch (TimeoutCancellationException e2) {
                    e = e2;
                }
                if (e.a != ref$ObjectRef.element) {
                    throw e;
                }
                return null;
            }
        }
        timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(continuation);
        Object obj2 = timeoutKt$withTimeoutOrNull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = timeoutKt$withTimeoutOrNull$1.label;
        if (i != 0) {
        }
        if (e.a != ref$ObjectRef.element) {
        }
        return null;
    }

    public static final Object x(long j, wls wlsVar, Continuation continuation) {
        return w(t(j), wlsVar, continuation);
    }
}
