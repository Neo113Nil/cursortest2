package kotlinx.coroutines.flow;

import defpackage.abl0;
import defpackage.b2k;
import defpackage.bc4;
import defpackage.bms;
import defpackage.bvf0;
import defpackage.dms;
import defpackage.dqr0;
import defpackage.eci0;
import defpackage.ems;
import defpackage.ffx;
import defpackage.fi9;
import defpackage.fse;
import defpackage.fyc;
import defpackage.gci0;
import defpackage.gi9;
import defpackage.gqs;
import defpackage.ha2;
import defpackage.j0z0;
import defpackage.j73;
import defpackage.jb20;
import defpackage.jl40;
import defpackage.jq6;
import defpackage.jqr;
import defpackage.kqr;
import defpackage.l8x;
import defpackage.ljo;
import defpackage.lqr;
import defpackage.lz40;
import defpackage.mqr;
import defpackage.mth;
import defpackage.n4u0;
import defpackage.nm;
import defpackage.nqr;
import defpackage.ny61;
import defpackage.oqr;
import defpackage.oyr;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qv10;
import defpackage.rol0;
import defpackage.seu;
import defpackage.tfi0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vez0;
import defpackage.vg10;
import defpackage.vng;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wls;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.ye60;
import defpackage.ym11;
import defpackage.zk6;
import defpackage.zls;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public abstract class e {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object A(tpr tprVar, Continuation continuation) {
        FlowKt__ReduceKt$firstOrNull$1 flowKt__ReduceKt$firstOrNull$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        vpr vprVar;
        if (continuation instanceof FlowKt__ReduceKt$firstOrNull$1) {
            flowKt__ReduceKt$firstOrNull$1 = (FlowKt__ReduceKt$firstOrNull$1) continuation;
            int i2 = flowKt__ReduceKt$firstOrNull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$1.label = i2 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$firstOrNull$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__ReduceKt$firstOrNull$1.label;
                if (i != 0) {
                    Ref$ObjectRef z = qv10.z(obj);
                    vpr mqrVar = new mqr(z);
                    try {
                        flowKt__ReduceKt$firstOrNull$1.L$0 = null;
                        flowKt__ReduceKt$firstOrNull$1.L$1 = z;
                        flowKt__ReduceKt$firstOrNull$1.L$2 = null;
                        flowKt__ReduceKt$firstOrNull$1.L$3 = mqrVar;
                        flowKt__ReduceKt$firstOrNull$1.I$0 = 0;
                        flowKt__ReduceKt$firstOrNull$1.label = 1;
                        if (tprVar.collect(mqrVar, flowKt__ReduceKt$firstOrNull$1) == obj2) {
                            return obj2;
                        }
                        ref$ObjectRef = z;
                    } catch (AbortFlowException e2) {
                        ref$ObjectRef = z;
                        e = e2;
                        vprVar = mqrVar;
                        if (e.a == vprVar) {
                            throw e;
                        }
                        kotlinx.coroutines.a.k(flowKt__ReduceKt$firstOrNull$1.get_context());
                        return ref$ObjectRef.element;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vprVar = (mqr) flowKt__ReduceKt$firstOrNull$1.L$3;
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$firstOrNull$1.L$1;
                    try {
                        kotlin.b.b(obj);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        if (e.a == vprVar) {
                        }
                    }
                }
                return ref$ObjectRef.element;
            }
        }
        flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(continuation);
        Object obj3 = flowKt__ReduceKt$firstOrNull$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ReduceKt$firstOrNull$1.label;
        if (i != 0) {
        }
        return ref$ObjectRef.element;
    }

    public static final mth B(tpr tprVar, wls wlsVar) {
        int i = kqr.a;
        return D(new jqr(tprVar, wlsVar, 1));
    }

    public static tpr C(tpr tprVar, wls wlsVar) {
        return E(new jqr(tprVar, wlsVar, 2), kqr.a);
    }

    public static final mth D(tpr tprVar) {
        int i = kqr.a;
        return new mth(tprVar, 5);
    }

    public static final tpr E(tpr tprVar, int i) {
        int i2 = kqr.a;
        if (i <= 0) {
            w511.f(oyr.i(i, "Expected positive concurrency level, but had "));
            return null;
        }
        if (i == 1) {
            return D(tprVar);
        }
        return new kotlinx.coroutines.flow.internal.d(i, -2, EmptyCoroutineContext.a, tprVar, BufferOverflow.SUSPEND);
    }

    public static final tpr F(tpr tprVar, fse fseVar) {
        if (fseVar.get(seu.C) == null) {
            return fseVar.equals(EmptyCoroutineContext.a) ? tprVar : tprVar instanceof gqs ? gqs.c((gqs) tprVar, fseVar, 0, null, 6) : new gi9(0, 12, fseVar, tprVar, null);
        }
        vg10.r(fseVar, "Flow context cannot contain job in it. Had ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, jb20] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G(tpr tprVar, ContinuationImpl continuationImpl) {
        FlowKt__ReduceKt$last$1 flowKt__ReduceKt$last$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        T t;
        ?? r0 = vez0.b;
        if (continuationImpl instanceof FlowKt__ReduceKt$last$1) {
            flowKt__ReduceKt$last$1 = (FlowKt__ReduceKt$last$1) continuationImpl;
            int i2 = flowKt__ReduceKt$last$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$last$1.label = i2 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$last$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__ReduceKt$last$1.label;
                if (i != 0) {
                    Ref$ObjectRef z = qv10.z(obj);
                    z.element = r0;
                    vpr bc4Var = new bc4(2, z);
                    flowKt__ReduceKt$last$1.L$0 = null;
                    flowKt__ReduceKt$last$1.L$1 = z;
                    flowKt__ReduceKt$last$1.label = 1;
                    if (tprVar.collect(bc4Var, flowKt__ReduceKt$last$1) == obj2) {
                        return obj2;
                    }
                    ref$ObjectRef = z;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$last$1.L$1;
                    kotlin.b.b(obj);
                }
                t = ref$ObjectRef.element;
                if (t == r0) {
                    return t;
                }
                w511.i("Expected at least one element");
                return null;
            }
        }
        flowKt__ReduceKt$last$1 = new FlowKt__ReduceKt$last$1(continuationImpl);
        Object obj3 = flowKt__ReduceKt$last$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ReduceKt$last$1.label;
        if (i != 0) {
        }
        t = ref$ObjectRef.element;
        if (t == r0) {
        }
    }

    public static final pzt0 H(tse tseVar, tpr tprVar) {
        return tje.N(tseVar, null, null, new FlowKt__CollectKt$launchIn$1(tprVar, null), 3);
    }

    public static final kotlinx.coroutines.flow.internal.g I(tpr tprVar, wls wlsVar) {
        int i = kqr.a;
        return X(tprVar, new FlowKt__MergeKt$mapLatest$1(wlsVar, null));
    }

    public static final kotlinx.coroutines.flow.internal.h J(Iterable iterable) {
        int i = kqr.a;
        return new kotlinx.coroutines.flow.internal.h(iterable, EmptyCoroutineContext.a, -2, BufferOverflow.SUSPEND);
    }

    public static final kotlinx.coroutines.flow.internal.h K(tpr... tprVarArr) {
        int i = kqr.a;
        return J(j73.u(tprVarArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, jb20] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object L(pz40 pz40Var, zls zlsVar, ContinuationImpl continuationImpl) {
        FlowKt__ReduceKt$reduce$1 flowKt__ReduceKt$reduce$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        T t;
        ?? r0 = vez0.b;
        if (continuationImpl instanceof FlowKt__ReduceKt$reduce$1) {
            flowKt__ReduceKt$reduce$1 = (FlowKt__ReduceKt$reduce$1) continuationImpl;
            int i2 = flowKt__ReduceKt$reduce$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$reduce$1.label = i2 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$reduce$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__ReduceKt$reduce$1.label;
                if (i != 0) {
                    Ref$ObjectRef z = qv10.z(obj);
                    z.element = r0;
                    vpr d0Var = new d0(z, zlsVar);
                    flowKt__ReduceKt$reduce$1.L$0 = null;
                    flowKt__ReduceKt$reduce$1.L$1 = null;
                    flowKt__ReduceKt$reduce$1.L$2 = z;
                    flowKt__ReduceKt$reduce$1.label = 1;
                    if (pz40Var.collect(d0Var, flowKt__ReduceKt$reduce$1) == obj2) {
                        return obj2;
                    }
                    ref$ObjectRef = z;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$reduce$1.L$2;
                    kotlin.b.b(obj);
                }
                t = ref$ObjectRef.element;
                if (t == r0) {
                    return t;
                }
                w511.i("Empty flow can't be reduced");
                return null;
            }
        }
        flowKt__ReduceKt$reduce$1 = new FlowKt__ReduceKt$reduce$1(continuationImpl);
        Object obj3 = flowKt__ReduceKt$reduce$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ReduceKt$reduce$1.label;
        if (i != 0) {
        }
        t = ref$ObjectRef.element;
        if (t == r0) {
        }
    }

    public static q M(tpr tprVar, wls wlsVar, int i) {
        if ((i & 2) != 0) {
            wlsVar = new FlowKt__ErrorsKt$retry$1();
        }
        return new q(tprVar, new FlowKt__ErrorsKt$retry$3(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, wlsVar, null));
    }

    public static final kotlinx.coroutines.flow.internal.k N(tpr tprVar, long j) {
        if (j > 0) {
            return new kotlinx.coroutines.flow.internal.k(new FlowKt__DelayKt$sample$2(j, tprVar, null));
        }
        ny61.g("Sample period should be positive");
        return null;
    }

    public static final eci0 O(tpr tprVar, tse tseVar, xsr0 xsr0Var, int i) {
        dqr0 l = bvf0.l(tprVar, i);
        n0 b = ffx.b(i, l.b, l.c);
        fse fseVar = l.d;
        tpr tprVar2 = l.a;
        jb20 jb20Var = ffx.i;
        xsr0.a.getClass();
        return new eci0(b, tje.M(tseVar, fseVar, jl40.l(xsr0Var, wsr0.b) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowKt__ShareKt$launchSharing$1(xsr0Var, tprVar2, b, jb20Var, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, jb20] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(tpr tprVar, ContinuationImpl continuationImpl) {
        FlowKt__ReduceKt$single$1 flowKt__ReduceKt$single$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        T t;
        ?? r0 = vez0.b;
        if (continuationImpl instanceof FlowKt__ReduceKt$single$1) {
            flowKt__ReduceKt$single$1 = (FlowKt__ReduceKt$single$1) continuationImpl;
            int i2 = flowKt__ReduceKt$single$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$single$1.label = i2 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$single$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__ReduceKt$single$1.label;
                if (i != 0) {
                    Ref$ObjectRef z = qv10.z(obj);
                    z.element = r0;
                    vpr nqrVar = new nqr(0, z);
                    flowKt__ReduceKt$single$1.L$0 = null;
                    flowKt__ReduceKt$single$1.L$1 = z;
                    flowKt__ReduceKt$single$1.label = 1;
                    if (tprVar.collect(nqrVar, flowKt__ReduceKt$single$1) == obj2) {
                        return obj2;
                    }
                    ref$ObjectRef = z;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$single$1.L$1;
                    kotlin.b.b(obj);
                }
                t = ref$ObjectRef.element;
                if (t == r0) {
                    return t;
                }
                w511.i("Flow is empty");
                return null;
            }
        }
        flowKt__ReduceKt$single$1 = new FlowKt__ReduceKt$single$1(continuationImpl);
        Object obj3 = flowKt__ReduceKt$single$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ReduceKt$single$1.label;
        if (i != 0) {
        }
        t = ref$ObjectRef.element;
        if (t == r0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, jb20] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(rol0 rol0Var, ContinuationImpl continuationImpl) {
        FlowKt__ReduceKt$singleOrNull$1 flowKt__ReduceKt$singleOrNull$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        vpr vprVar;
        T t;
        ?? r0 = vez0.b;
        if (continuationImpl instanceof FlowKt__ReduceKt$singleOrNull$1) {
            flowKt__ReduceKt$singleOrNull$1 = (FlowKt__ReduceKt$singleOrNull$1) continuationImpl;
            int i2 = flowKt__ReduceKt$singleOrNull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$singleOrNull$1.label = i2 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$singleOrNull$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__ReduceKt$singleOrNull$1.label;
                if (i != 0) {
                    Ref$ObjectRef z = qv10.z(obj);
                    z.element = r0;
                    vpr oqrVar = new oqr(z);
                    try {
                        flowKt__ReduceKt$singleOrNull$1.L$0 = null;
                        flowKt__ReduceKt$singleOrNull$1.L$1 = z;
                        flowKt__ReduceKt$singleOrNull$1.L$2 = null;
                        flowKt__ReduceKt$singleOrNull$1.L$3 = oqrVar;
                        flowKt__ReduceKt$singleOrNull$1.I$0 = 0;
                        flowKt__ReduceKt$singleOrNull$1.label = 1;
                        if (rol0Var.collect(oqrVar, flowKt__ReduceKt$singleOrNull$1) == obj2) {
                            return obj2;
                        }
                        ref$ObjectRef = z;
                    } catch (AbortFlowException e2) {
                        ref$ObjectRef = z;
                        e = e2;
                        vprVar = oqrVar;
                        if (e.a == vprVar) {
                            throw e;
                        }
                        kotlinx.coroutines.a.k(flowKt__ReduceKt$singleOrNull$1.get_context());
                        t = ref$ObjectRef.element;
                        if (t == r0) {
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vprVar = (oqr) flowKt__ReduceKt$singleOrNull$1.L$3;
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$singleOrNull$1.L$1;
                    try {
                        kotlin.b.b(obj);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        if (e.a == vprVar) {
                        }
                    }
                }
                t = ref$ObjectRef.element;
                if (t == r0) {
                    return null;
                }
                return t;
            }
        }
        flowKt__ReduceKt$singleOrNull$1 = new FlowKt__ReduceKt$singleOrNull$1(continuationImpl);
        Object obj3 = flowKt__ReduceKt$singleOrNull$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ReduceKt$singleOrNull$1.label;
        if (i != 0) {
        }
        t = ref$ObjectRef.element;
        if (t == r0) {
        }
    }

    public static final gci0 R(tpr tprVar, tse tseVar, xsr0 xsr0Var, Object obj) {
        dqr0 l = bvf0.l(tprVar, 1);
        r0 c = bvf0.c(obj);
        fse fseVar = l.d;
        tpr tprVar2 = l.a;
        xsr0.a.getClass();
        return new gci0(c, tje.M(tseVar, fseVar, jl40.l(xsr0Var, wsr0.b) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowKt__ShareKt$launchSharing$1(xsr0Var, tprVar2, c, obj, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object S(o oVar, tse tseVar, ContinuationImpl continuationImpl) {
        FlowKt__ShareKt$stateIn$1 flowKt__ShareKt$stateIn$1;
        int i;
        if (continuationImpl instanceof FlowKt__ShareKt$stateIn$1) {
            flowKt__ShareKt$stateIn$1 = (FlowKt__ShareKt$stateIn$1) continuationImpl;
            int i2 = flowKt__ShareKt$stateIn$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ShareKt$stateIn$1.label = i2 - Integer.MIN_VALUE;
                Object obj = flowKt__ShareKt$stateIn$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__ShareKt$stateIn$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dqr0 l = bvf0.l(oVar, 1);
                    fyc fycVar = new fyc((l8x) tseVar.getCoroutineContext().get(seu.C));
                    tje.N(tseVar, l.d, null, new FlowKt__ShareKt$launchSharingDeferred$1(l.a, fycVar, null), 2);
                    flowKt__ShareKt$stateIn$1.L$0 = null;
                    flowKt__ShareKt$stateIn$1.L$1 = null;
                    flowKt__ShareKt$stateIn$1.L$2 = null;
                    flowKt__ShareKt$stateIn$1.L$3 = null;
                    flowKt__ShareKt$stateIn$1.label = 1;
                    obj = fycVar.s(flowKt__ShareKt$stateIn$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Object value = ((Result) obj).getValue();
                kotlin.b.b(value);
                return value;
            }
        }
        flowKt__ShareKt$stateIn$1 = new FlowKt__ShareKt$stateIn$1(continuationImpl);
        Object obj2 = flowKt__ShareKt$stateIn$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ShareKt$stateIn$1.label;
        if (i != 0) {
        }
        Object value2 = ((Result) obj2).getValue();
        kotlin.b.b(value2);
        return value2;
    }

    public static final t T(tpr tprVar, int i) {
        if (i > 0) {
            return new t(tprVar, i);
        }
        w511.f(oyr.j(i, "Requested element count ", " should be positive"));
        return null;
    }

    public static final kotlinx.coroutines.flow.internal.k U(tpr tprVar, long j) {
        return new kotlinx.coroutines.flow.internal.k(new FlowKt__DelayKt$timeoutInternal$1(j, tprVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object V(tpr tprVar, Collection collection, ContinuationImpl continuationImpl) {
        FlowKt__CollectionKt$toCollection$1 flowKt__CollectionKt$toCollection$1;
        int i;
        if (continuationImpl instanceof FlowKt__CollectionKt$toCollection$1) {
            flowKt__CollectionKt$toCollection$1 = (FlowKt__CollectionKt$toCollection$1) continuationImpl;
            int i2 = flowKt__CollectionKt$toCollection$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__CollectionKt$toCollection$1.label = i2 - Integer.MIN_VALUE;
                Object obj = flowKt__CollectionKt$toCollection$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__CollectionKt$toCollection$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    vpr nmVar = new nm(19, collection);
                    flowKt__CollectionKt$toCollection$1.L$0 = null;
                    flowKt__CollectionKt$toCollection$1.L$1 = collection;
                    flowKt__CollectionKt$toCollection$1.label = 1;
                    return tprVar.collect(nmVar, flowKt__CollectionKt$toCollection$1) == obj2 ? obj2 : collection;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Collection collection2 = (Collection) flowKt__CollectionKt$toCollection$1.L$1;
                kotlin.b.b(obj);
                return collection2;
            }
        }
        flowKt__CollectionKt$toCollection$1 = new FlowKt__CollectionKt$toCollection$1(continuationImpl);
        Object obj3 = flowKt__CollectionKt$toCollection$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__CollectionKt$toCollection$1.label;
        if (i != 0) {
        }
    }

    public static Object W(tpr tprVar, ContinuationImpl continuationImpl) {
        return V(tprVar, new ArrayList(), continuationImpl);
    }

    public static final kotlinx.coroutines.flow.internal.g X(tpr tprVar, zls zlsVar) {
        int i = kqr.a;
        return new kotlinx.coroutines.flow.internal.g(zlsVar, tprVar, EmptyCoroutineContext.a, -2, BufferOverflow.SUSPEND);
    }

    public static final rol0 Y(tpr tprVar, zls zlsVar) {
        return new rol0(new FlowKt__LimitKt$transformWhile$1(tprVar, zlsVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons a(vpr vprVar, Object obj, Object obj2, ContinuationImpl continuationImpl) {
        FlowKt__LimitKt$emitAbort$1 flowKt__LimitKt$emitAbort$1;
        int i;
        if (continuationImpl instanceof FlowKt__LimitKt$emitAbort$1) {
            flowKt__LimitKt$emitAbort$1 = (FlowKt__LimitKt$emitAbort$1) continuationImpl;
            int i2 = flowKt__LimitKt$emitAbort$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$emitAbort$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = flowKt__LimitKt$emitAbort$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__LimitKt$emitAbort$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    flowKt__LimitKt$emitAbort$1.L$0 = null;
                    flowKt__LimitKt$emitAbort$1.L$1 = null;
                    flowKt__LimitKt$emitAbort$1.L$2 = obj2;
                    flowKt__LimitKt$emitAbort$1.label = 1;
                    if (vprVar.emit(obj, flowKt__LimitKt$emitAbort$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = flowKt__LimitKt$emitAbort$1.L$2;
                    kotlin.b.b(obj3);
                }
                throw new AbortFlowException(obj2);
            }
        }
        flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(continuationImpl);
        Object obj32 = flowKt__LimitKt$emitAbort$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__LimitKt$emitAbort$1.label;
        if (i != 0) {
        }
        throw new AbortFlowException(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(j0z0 j0z0Var, zls zlsVar, Throwable th, ContinuationImpl continuationImpl) {
        FlowKt__EmittersKt$invokeSafely$1 flowKt__EmittersKt$invokeSafely$1;
        int i;
        try {
            if (continuationImpl instanceof FlowKt__EmittersKt$invokeSafely$1) {
                flowKt__EmittersKt$invokeSafely$1 = (FlowKt__EmittersKt$invokeSafely$1) continuationImpl;
                int i2 = flowKt__EmittersKt$invokeSafely$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    flowKt__EmittersKt$invokeSafely$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = flowKt__EmittersKt$invokeSafely$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = flowKt__EmittersKt$invokeSafely$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        flowKt__EmittersKt$invokeSafely$1.L$0 = null;
                        flowKt__EmittersKt$invokeSafely$1.L$1 = null;
                        flowKt__EmittersKt$invokeSafely$1.L$2 = th;
                        flowKt__EmittersKt$invokeSafely$1.label = 1;
                        if (zlsVar.invoke(j0z0Var, th, flowKt__EmittersKt$invokeSafely$1) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) flowKt__EmittersKt$invokeSafely$1.L$2;
                        kotlin.b.b(obj);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                ljo.a(th2, th);
            }
            throw th2;
        }
        flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(continuationImpl);
        Object obj3 = flowKt__EmittersKt$invokeSafely$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__EmittersKt$invokeSafely$1.label;
    }

    public static final eci0 c(lz40 lz40Var) {
        return new eci0(lz40Var, null);
    }

    public static final gci0 d(pz40 pz40Var) {
        return new gci0(pz40Var, null);
    }

    public static final tpr e(tpr tprVar, int i, BufferOverflow bufferOverflow) {
        if (i < 0 && i != -2 && i != -1) {
            w511.f(oyr.i(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1 && bufferOverflow != BufferOverflow.SUSPEND) {
            ny61.g("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == -1) {
            bufferOverflow = BufferOverflow.DROP_OLDEST;
            i = 0;
        }
        int i2 = i;
        BufferOverflow bufferOverflow2 = bufferOverflow;
        return tprVar instanceof gqs ? gqs.c((gqs) tprVar, null, i2, bufferOverflow2, 1) : new gi9(i2, 2, null, tprVar, bufferOverflow2);
    }

    public static /* synthetic */ tpr f(tpr tprVar, int i, BufferOverflow bufferOverflow, int i2) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return e(tprVar, i, bufferOverflow);
    }

    public static final b g(wls wlsVar) {
        return new b(wlsVar, EmptyCoroutineContext.a, -2, BufferOverflow.SUSPEND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable h(tpr tprVar, vpr vprVar, ContinuationImpl continuationImpl) {
        FlowKt__ErrorsKt$catchImpl$1 flowKt__ErrorsKt$catchImpl$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        Throwable th;
        l8x l8xVar;
        CancellationException I;
        if (continuationImpl instanceof FlowKt__ErrorsKt$catchImpl$1) {
            flowKt__ErrorsKt$catchImpl$1 = (FlowKt__ErrorsKt$catchImpl$1) continuationImpl;
            int i2 = flowKt__ErrorsKt$catchImpl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = flowKt__ErrorsKt$catchImpl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__ErrorsKt$catchImpl$1.label;
                if (i != 0) {
                    Ref$ObjectRef z = qv10.z(obj);
                    try {
                        vpr pVar = new p(vprVar, z);
                        flowKt__ErrorsKt$catchImpl$1.L$0 = null;
                        flowKt__ErrorsKt$catchImpl$1.L$1 = null;
                        flowKt__ErrorsKt$catchImpl$1.L$2 = z;
                        flowKt__ErrorsKt$catchImpl$1.label = 1;
                        if (tprVar.collect(pVar, flowKt__ErrorsKt$catchImpl$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        ref$ObjectRef = z;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ErrorsKt$catchImpl$1.L$2;
                    try {
                        kotlin.b.b(obj);
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                th = (Throwable) ref$ObjectRef.element;
                if ((th == null && th.equals(th)) || ((l8xVar = (l8x) flowKt__ErrorsKt$catchImpl$1.get_context().get(seu.C)) != null && l8xVar.isCancelled() && (I = l8xVar.I()) != null && I.equals(th))) {
                    throw th;
                }
                if (th != null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    ljo.a(th, th);
                    throw th;
                }
                ljo.a(th, th);
                throw th;
            }
        }
        flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(continuationImpl);
        Object obj2 = flowKt__ErrorsKt$catchImpl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ErrorsKt$catchImpl$1.label;
        if (i != 0) {
        }
        th = (Throwable) ref$ObjectRef.element;
        if (th == null) {
        }
        if (th != null) {
        }
    }

    public static final fi9 i(wls wlsVar) {
        return new fi9(wlsVar, EmptyCoroutineContext.a, -2, BufferOverflow.SUSPEND);
    }

    public static final Object j(tpr tprVar, Continuation continuation) {
        Object collect = tprVar.collect(ye60.a, continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11.a;
    }

    public static final Object k(tpr tprVar, wls wlsVar, Continuation continuation) {
        Object j = j(f(I(tprVar, wlsVar), 0, null, 2), continuation);
        return j == CoroutineSingletons.COROUTINE_SUSPENDED ? j : zy11.a;
    }

    public static final ha2 l(tpr tprVar, tpr tprVar2, tpr tprVar3, tpr tprVar4, tpr tprVar5, ems emsVar) {
        return new ha2(4, new tpr[]{tprVar, tprVar2, tprVar3, tprVar4, tprVar5}, emsVar);
    }

    public static final ha2 m(tpr tprVar, tpr tprVar2, tpr tprVar3, tpr tprVar4, dms dmsVar) {
        return new ha2(3, new tpr[]{tprVar, tprVar2, tprVar3, tprVar4}, dmsVar);
    }

    public static final ha2 n(tpr tprVar, tpr tprVar2, tpr tprVar3, bms bmsVar) {
        return new ha2(2, new tpr[]{tprVar, tprVar2, tprVar3}, bmsVar);
    }

    public static final tpr o(tpr tprVar) {
        return f(tprVar, -1, null, 2);
    }

    public static final tpr p(tpr tprVar, long j) {
        if (j >= 0) {
            return j == 0 ? tprVar : r(tprVar, new zk6(j, 3));
        }
        ny61.g("Debounce timeout should not be negative");
        return null;
    }

    public static final tpr q(tpr tprVar, long j) {
        return p(tprVar, kotlinx.coroutines.a.t(j));
    }

    public static final kotlinx.coroutines.flow.internal.k r(tpr tprVar, tls tlsVar) {
        return new kotlinx.coroutines.flow.internal.k(new FlowKt__DelayKt$debounceInternal$1(tprVar, tlsVar, null));
    }

    public static final b2k s(tpr tprVar, wls wlsVar) {
        abl0 abl0Var = vng.b;
        ym11.e(2, wlsVar);
        return vng.l(tprVar, abl0Var, wlsVar);
    }

    public static final tpr t(tpr tprVar) {
        return tprVar instanceof n4u0 ? tprVar : vng.l(tprVar, vng.b, vng.c);
    }

    public static final Object u(tpr tprVar, vpr vprVar, Continuation continuation) {
        w(vprVar);
        Object collect = tprVar.collect(vprVar, continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (r2.emit(r10, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:12:0x0035, B:14:0x005f, B:20:0x0076, B:22:0x007e, B:32:0x0051, B:34:0x005b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0092 -> B:13:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object v(vpr vprVar, tfi0 tfi0Var, boolean z, Continuation continuation) {
        FlowKt__ChannelsKt$emitAllImpl$1 flowKt__ChannelsKt$emitAllImpl$1;
        int i;
        jq6 it;
        jq6 jq6Var;
        vpr vprVar2;
        Object a;
        try {
            if (continuation instanceof FlowKt__ChannelsKt$emitAllImpl$1) {
                flowKt__ChannelsKt$emitAllImpl$1 = (FlowKt__ChannelsKt$emitAllImpl$1) continuation;
                int i2 = flowKt__ChannelsKt$emitAllImpl$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    flowKt__ChannelsKt$emitAllImpl$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = flowKt__ChannelsKt$emitAllImpl$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = flowKt__ChannelsKt$emitAllImpl$1.label;
                    CancellationException cancellationException = null;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        w(vprVar);
                        it = tfi0Var.iterator();
                        flowKt__ChannelsKt$emitAllImpl$1.L$0 = vprVar;
                        flowKt__ChannelsKt$emitAllImpl$1.L$1 = tfi0Var;
                        flowKt__ChannelsKt$emitAllImpl$1.L$2 = it;
                        flowKt__ChannelsKt$emitAllImpl$1.L$3 = null;
                        flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z;
                        flowKt__ChannelsKt$emitAllImpl$1.label = 1;
                        a = it.a(flowKt__ChannelsKt$emitAllImpl$1);
                        if (a != coroutineSingletons) {
                        }
                    } else if (i == 1) {
                        z = flowKt__ChannelsKt$emitAllImpl$1.Z$0;
                        jq6Var = (jq6) flowKt__ChannelsKt$emitAllImpl$1.L$2;
                        tfi0Var = (tfi0) flowKt__ChannelsKt$emitAllImpl$1.L$1;
                        vprVar2 = (vpr) flowKt__ChannelsKt$emitAllImpl$1.L$0;
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = flowKt__ChannelsKt$emitAllImpl$1.Z$0;
                        jq6Var = (jq6) flowKt__ChannelsKt$emitAllImpl$1.L$2;
                        tfi0Var = (tfi0) flowKt__ChannelsKt$emitAllImpl$1.L$1;
                        vprVar2 = (vpr) flowKt__ChannelsKt$emitAllImpl$1.L$0;
                        kotlin.b.b(obj);
                        it = jq6Var;
                        vprVar = vprVar2;
                        flowKt__ChannelsKt$emitAllImpl$1.L$0 = vprVar;
                        flowKt__ChannelsKt$emitAllImpl$1.L$1 = tfi0Var;
                        flowKt__ChannelsKt$emitAllImpl$1.L$2 = it;
                        flowKt__ChannelsKt$emitAllImpl$1.L$3 = null;
                        flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z;
                        flowKt__ChannelsKt$emitAllImpl$1.label = 1;
                        a = it.a(flowKt__ChannelsKt$emitAllImpl$1);
                        if (a != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        vprVar2 = vprVar;
                        jq6Var = it;
                        obj = a;
                        if (((Boolean) obj).booleanValue()) {
                            if (z) {
                                tfi0Var.a(null);
                            }
                            return zy11.a;
                        }
                        Object b = jq6Var.b();
                        flowKt__ChannelsKt$emitAllImpl$1.L$0 = vprVar2;
                        flowKt__ChannelsKt$emitAllImpl$1.L$1 = tfi0Var;
                        flowKt__ChannelsKt$emitAllImpl$1.L$2 = jq6Var;
                        flowKt__ChannelsKt$emitAllImpl$1.L$3 = null;
                        flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z;
                        flowKt__ChannelsKt$emitAllImpl$1.label = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } finally {
        }
        flowKt__ChannelsKt$emitAllImpl$1 = new FlowKt__ChannelsKt$emitAllImpl$1(continuation);
        Object obj2 = flowKt__ChannelsKt$emitAllImpl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ChannelsKt$emitAllImpl$1.label;
        CancellationException cancellationException2 = null;
    }

    public static final void w(vpr vprVar) {
        if (vprVar instanceof j0z0) {
            throw ((j0z0) vprVar).a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, jb20] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x(tpr tprVar, wls wlsVar, Continuation continuation) {
        FlowKt__ReduceKt$first$3 flowKt__ReduceKt$first$3;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        vpr vprVar;
        T t;
        ?? r0 = vez0.b;
        if (continuation instanceof FlowKt__ReduceKt$first$3) {
            flowKt__ReduceKt$first$3 = (FlowKt__ReduceKt$first$3) continuation;
            int i2 = flowKt__ReduceKt$first$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$3.label = i2 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$first$3.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__ReduceKt$first$3.label;
                if (i != 0) {
                    Ref$ObjectRef z = qv10.z(obj);
                    z.element = r0;
                    vpr b0Var = new b0(wlsVar, z);
                    try {
                        flowKt__ReduceKt$first$3.L$0 = null;
                        flowKt__ReduceKt$first$3.L$1 = null;
                        flowKt__ReduceKt$first$3.L$2 = z;
                        flowKt__ReduceKt$first$3.L$3 = null;
                        flowKt__ReduceKt$first$3.L$4 = b0Var;
                        flowKt__ReduceKt$first$3.I$0 = 0;
                        flowKt__ReduceKt$first$3.label = 1;
                        if (tprVar.collect(b0Var, flowKt__ReduceKt$first$3) == obj2) {
                            return obj2;
                        }
                        ref$ObjectRef = z;
                    } catch (AbortFlowException e2) {
                        ref$ObjectRef = z;
                        e = e2;
                        vprVar = b0Var;
                        if (e.a == vprVar) {
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vprVar = (b0) flowKt__ReduceKt$first$3.L$4;
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$first$3.L$2;
                    try {
                        kotlin.b.b(obj);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        if (e.a == vprVar) {
                            throw e;
                        }
                        kotlinx.coroutines.a.k(flowKt__ReduceKt$first$3.get_context());
                        t = ref$ObjectRef.element;
                        if (t != r0) {
                        }
                    }
                }
                t = ref$ObjectRef.element;
                if (t != r0) {
                    return t;
                }
                w511.i("Expected at least one element matching the predicate");
                return null;
            }
        }
        flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(continuation);
        Object obj3 = flowKt__ReduceKt$first$3.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ReduceKt$first$3.label;
        if (i != 0) {
        }
        t = ref$ObjectRef.element;
        if (t != r0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, jb20] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y(tpr tprVar, Continuation continuation) {
        FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        vpr vprVar;
        T t;
        ?? r0 = vez0.b;
        if (continuation instanceof FlowKt__ReduceKt$first$1) {
            flowKt__ReduceKt$first$1 = (FlowKt__ReduceKt$first$1) continuation;
            int i2 = flowKt__ReduceKt$first$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$1.label = i2 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$first$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__ReduceKt$first$1.label;
                if (i != 0) {
                    Ref$ObjectRef z = qv10.z(obj);
                    z.element = r0;
                    vpr lqrVar = new lqr(z);
                    try {
                        flowKt__ReduceKt$first$1.L$0 = null;
                        flowKt__ReduceKt$first$1.L$1 = z;
                        flowKt__ReduceKt$first$1.L$2 = null;
                        flowKt__ReduceKt$first$1.L$3 = lqrVar;
                        flowKt__ReduceKt$first$1.I$0 = 0;
                        flowKt__ReduceKt$first$1.label = 1;
                        if (tprVar.collect(lqrVar, flowKt__ReduceKt$first$1) == obj2) {
                            return obj2;
                        }
                        ref$ObjectRef = z;
                    } catch (AbortFlowException e2) {
                        ref$ObjectRef = z;
                        e = e2;
                        vprVar = lqrVar;
                        if (e.a == vprVar) {
                            throw e;
                        }
                        kotlinx.coroutines.a.k(flowKt__ReduceKt$first$1.get_context());
                        t = ref$ObjectRef.element;
                        if (t != r0) {
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vprVar = (lqr) flowKt__ReduceKt$first$1.L$3;
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$first$1.L$1;
                    try {
                        kotlin.b.b(obj);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        if (e.a == vprVar) {
                        }
                    }
                }
                t = ref$ObjectRef.element;
                if (t != r0) {
                    return t;
                }
                w511.i("Expected at least one element");
                return null;
            }
        }
        flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(continuation);
        Object obj3 = flowKt__ReduceKt$first$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ReduceKt$first$1.label;
        if (i != 0) {
        }
        t = ref$ObjectRef.element;
        if (t != r0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object z(tpr tprVar, wls wlsVar, Continuation continuation) {
        FlowKt__ReduceKt$firstOrNull$3 flowKt__ReduceKt$firstOrNull$3;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        vpr vprVar;
        if (continuation instanceof FlowKt__ReduceKt$firstOrNull$3) {
            flowKt__ReduceKt$firstOrNull$3 = (FlowKt__ReduceKt$firstOrNull$3) continuation;
            int i2 = flowKt__ReduceKt$firstOrNull$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$3.label = i2 - Integer.MIN_VALUE;
                Object obj = flowKt__ReduceKt$firstOrNull$3.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flowKt__ReduceKt$firstOrNull$3.label;
                if (i != 0) {
                    Ref$ObjectRef z = qv10.z(obj);
                    vpr c0Var = new c0(wlsVar, z);
                    try {
                        flowKt__ReduceKt$firstOrNull$3.L$0 = null;
                        flowKt__ReduceKt$firstOrNull$3.L$1 = null;
                        flowKt__ReduceKt$firstOrNull$3.L$2 = z;
                        flowKt__ReduceKt$firstOrNull$3.L$3 = null;
                        flowKt__ReduceKt$firstOrNull$3.L$4 = c0Var;
                        flowKt__ReduceKt$firstOrNull$3.I$0 = 0;
                        flowKt__ReduceKt$firstOrNull$3.label = 1;
                        if (tprVar.collect(c0Var, flowKt__ReduceKt$firstOrNull$3) == obj2) {
                            return obj2;
                        }
                        ref$ObjectRef = z;
                    } catch (AbortFlowException e2) {
                        ref$ObjectRef = z;
                        e = e2;
                        vprVar = c0Var;
                        if (e.a == vprVar) {
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vprVar = (c0) flowKt__ReduceKt$firstOrNull$3.L$4;
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$firstOrNull$3.L$2;
                    try {
                        kotlin.b.b(obj);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        if (e.a == vprVar) {
                            throw e;
                        }
                        kotlinx.coroutines.a.k(flowKt__ReduceKt$firstOrNull$3.get_context());
                        return ref$ObjectRef.element;
                    }
                }
                return ref$ObjectRef.element;
            }
        }
        flowKt__ReduceKt$firstOrNull$3 = new FlowKt__ReduceKt$firstOrNull$3(continuation);
        Object obj3 = flowKt__ReduceKt$firstOrNull$3.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flowKt__ReduceKt$firstOrNull$3.label;
        if (i != 0) {
        }
        return ref$ObjectRef.element;
    }
}
