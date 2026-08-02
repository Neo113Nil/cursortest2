package ru.yandex.taxi.widgets.domain;

import com.yandex.go.dto.response.SwipeActionDto$Defer;
import com.yandex.go.superapp.orders.card.experiments.y;
import defpackage.bjz;
import defpackage.d3p;
import defpackage.f501;
import defpackage.g501;
import defpackage.h501;
import defpackage.i501;
import defpackage.jem;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.pu6;
import defpackage.q6o0;
import defpackage.q6y0;
import defpackage.qg50;
import defpackage.txw0;
import defpackage.v7y0;
import defpackage.w201;
import defpackage.w511;
import defpackage.xda;
import defpackage.y2y0;
import defpackage.z4y0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class c {
    public final y a;

    public c(y yVar) {
        this.a = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(w201 w201Var, String str, txw0 txw0Var, ContinuationImpl continuationImpl) {
        TrackingCardSwipeBehaviourInteractor$enrichTrackingWithSwipeBehaviour$1 trackingCardSwipeBehaviourInteractor$enrichTrackingWithSwipeBehaviour$1;
        int i;
        w201 w201Var2;
        if (continuationImpl instanceof TrackingCardSwipeBehaviourInteractor$enrichTrackingWithSwipeBehaviour$1) {
            trackingCardSwipeBehaviourInteractor$enrichTrackingWithSwipeBehaviour$1 = (TrackingCardSwipeBehaviourInteractor$enrichTrackingWithSwipeBehaviour$1) continuationImpl;
            int i2 = trackingCardSwipeBehaviourInteractor$enrichTrackingWithSwipeBehaviour$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingCardSwipeBehaviourInteractor$enrichTrackingWithSwipeBehaviour$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trackingCardSwipeBehaviourInteractor$enrichTrackingWithSwipeBehaviour$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingCardSwipeBehaviourInteractor$enrichTrackingWithSwipeBehaviour$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    trackingCardSwipeBehaviourInteractor$enrichTrackingWithSwipeBehaviour$1.L$0 = w201Var;
                    trackingCardSwipeBehaviourInteractor$enrichTrackingWithSwipeBehaviour$1.L$1 = null;
                    trackingCardSwipeBehaviourInteractor$enrichTrackingWithSwipeBehaviour$1.L$2 = null;
                    trackingCardSwipeBehaviourInteractor$enrichTrackingWithSwipeBehaviour$1.label = 1;
                    Object b = b(txw0Var, str, trackingCardSwipeBehaviourInteractor$enrichTrackingWithSwipeBehaviour$1);
                    if (b == obj2) {
                        return obj2;
                    }
                    obj = b;
                    w201Var2 = w201Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w201Var2 = (w201) trackingCardSwipeBehaviourInteractor$enrichTrackingWithSwipeBehaviour$1.L$0;
                    kotlin.b.b(obj);
                }
                i501 i501Var = (i501) obj;
                if (!(w201Var2 instanceof pu6)) {
                    return pu6.c((pu6) w201Var2, i501Var);
                }
                if (w201Var2 instanceof qg50) {
                    qg50 qg50Var = (qg50) w201Var2;
                    return new qg50(qg50Var.a, i501Var, qg50Var.c, qg50Var.d, qg50Var.e, qg50Var.f);
                }
                if (w201Var2 instanceof v7y0) {
                    return v7y0.c((v7y0) w201Var2, i501Var);
                }
                if (w201Var2 instanceof xda) {
                    xda xdaVar = (xda) w201Var2;
                    return new xda(xdaVar.a, i501Var, xdaVar.c, xdaVar.d, xdaVar.e, xdaVar.f, xdaVar.g);
                }
                if (w201Var2 instanceof jem) {
                    return jem.c((jem) w201Var2, i501Var, null, 509);
                }
                if (w201Var2 instanceof d3p) {
                    d3p d3pVar = (d3p) w201Var2;
                    return new d3p(d3pVar.a, i501Var, d3pVar.c, d3pVar.d, d3pVar.e, d3pVar.f, d3pVar.g, d3pVar.h, d3pVar.i, d3pVar.j, d3pVar.k, d3pVar.l, d3pVar.m);
                }
                if (w201Var2 instanceof y2y0) {
                    y2y0 y2y0Var = (y2y0) w201Var2;
                    return new y2y0(y2y0Var.a, i501Var, y2y0Var.c, y2y0Var.d, y2y0Var.e, y2y0Var.f, y2y0Var.g, y2y0Var.h, y2y0Var.i);
                }
                if (w201Var2 instanceof bjz) {
                    bjz bjzVar = (bjz) w201Var2;
                    return new bjz(bjzVar.a, bjzVar.b, bjzVar.c, bjzVar.d, bjzVar.e, bjzVar.f, bjzVar.g, bjzVar.h, bjzVar.i, bjzVar.j, bjzVar.k, bjzVar.l, bjzVar.m, bjzVar.n, bjzVar.o, i501Var, bjzVar.q);
                }
                if (w201Var2 instanceof q6o0) {
                    q6o0 q6o0Var = (q6o0) w201Var2;
                    return new q6o0(q6o0Var.a, i501Var, q6o0Var.c, q6o0Var.d, q6o0Var.e, q6o0Var.f, q6o0Var.g);
                }
                if (w201Var2 instanceof q6y0) {
                    return q6y0.c((q6y0) w201Var2, i501Var, 33554430);
                }
                if (w201Var2 instanceof z4y0) {
                    return w201Var2;
                }
                w511.b();
                return null;
            }
        }
        trackingCardSwipeBehaviourInteractor$enrichTrackingWithSwipeBehaviour$1 = new TrackingCardSwipeBehaviourInteractor$enrichTrackingWithSwipeBehaviour$1(this, continuationImpl);
        Object obj3 = trackingCardSwipeBehaviourInteractor$enrichTrackingWithSwipeBehaviour$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingCardSwipeBehaviourInteractor$enrichTrackingWithSwipeBehaviour$1.label;
        if (i != 0) {
        }
        i501 i501Var2 = (i501) obj3;
        if (!(w201Var2 instanceof pu6)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(txw0 txw0Var, String str, ContinuationImpl continuationImpl) {
        TrackingCardSwipeBehaviourInteractor$swipeBehaviour$1 trackingCardSwipeBehaviourInteractor$swipeBehaviour$1;
        int i;
        txw0 txw0Var2;
        if (continuationImpl instanceof TrackingCardSwipeBehaviourInteractor$swipeBehaviour$1) {
            trackingCardSwipeBehaviourInteractor$swipeBehaviour$1 = (TrackingCardSwipeBehaviourInteractor$swipeBehaviour$1) continuationImpl;
            int i2 = trackingCardSwipeBehaviourInteractor$swipeBehaviour$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackingCardSwipeBehaviourInteractor$swipeBehaviour$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trackingCardSwipeBehaviourInteractor$swipeBehaviour$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackingCardSwipeBehaviourInteractor$swipeBehaviour$1.label;
                y yVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    trackingCardSwipeBehaviourInteractor$swipeBehaviour$1.L$0 = txw0Var;
                    trackingCardSwipeBehaviourInteractor$swipeBehaviour$1.L$1 = str;
                    trackingCardSwipeBehaviourInteractor$swipeBehaviour$1.label = 1;
                    obj = yVar.Q(trackingCardSwipeBehaviourInteractor$swipeBehaviour$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        txw0Var2 = (txw0) trackingCardSwipeBehaviourInteractor$swipeBehaviour$1.L$0;
                        kotlin.b.b(obj);
                        return new g501((String) obj, ((SwipeActionDto$Defer) txw0Var2).getA());
                    }
                    str = (String) trackingCardSwipeBehaviourInteractor$swipeBehaviour$1.L$1;
                    txw0Var = (txw0) trackingCardSwipeBehaviourInteractor$swipeBehaviour$1.L$0;
                    kotlin.b.b(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = !booleanValue ? h501.a : f501.a;
                if (txw0Var instanceof SwipeActionDto$Defer) {
                    if (txw0Var != null) {
                        w511.b();
                        return null;
                    }
                } else if (booleanValue && !jl40.l(((SwipeActionDto$Defer) txw0Var).getA(), str)) {
                    trackingCardSwipeBehaviourInteractor$swipeBehaviour$1.L$0 = txw0Var;
                    trackingCardSwipeBehaviourInteractor$swipeBehaviour$1.L$1 = null;
                    trackingCardSwipeBehaviourInteractor$swipeBehaviour$1.L$2 = null;
                    trackingCardSwipeBehaviourInteractor$swipeBehaviour$1.Z$0 = booleanValue;
                    trackingCardSwipeBehaviourInteractor$swipeBehaviour$1.label = 2;
                    obj = yVar.h(trackingCardSwipeBehaviourInteractor$swipeBehaviour$1);
                    if (obj != coroutineSingletons) {
                        txw0Var2 = txw0Var;
                        return new g501((String) obj, ((SwipeActionDto$Defer) txw0Var2).getA());
                    }
                    return coroutineSingletons;
                }
                return obj2;
            }
        }
        trackingCardSwipeBehaviourInteractor$swipeBehaviour$1 = new TrackingCardSwipeBehaviourInteractor$swipeBehaviour$1(this, continuationImpl);
        Object obj3 = trackingCardSwipeBehaviourInteractor$swipeBehaviour$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackingCardSwipeBehaviourInteractor$swipeBehaviour$1.label;
        y yVar2 = this.a;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        if (!booleanValue2) {
        }
        if (txw0Var instanceof SwipeActionDto$Defer) {
        }
        return obj2;
    }
}
