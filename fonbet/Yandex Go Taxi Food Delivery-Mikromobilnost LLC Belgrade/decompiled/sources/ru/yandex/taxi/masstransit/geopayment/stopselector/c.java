package ru.yandex.taxi.masstransit.geopayment.stopselector;

import defpackage.jl40;
import defpackage.kiu0;
import defpackage.ny61;
import defpackage.ohu0;
import defpackage.piu0;
import defpackage.tiu0;
import defpackage.ujb;
import defpackage.vjb;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wiu0;
import defpackage.wjb;
import defpackage.xjb;
import defpackage.yjb;
import defpackage.zjb;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;
import ru.yandex.taxi.masstransit.model.StopSelectionStage;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ tiu0 b;

    public c(vpr vprVar, tiu0 tiu0Var) {
        this.a = vprVar;
        this.b = tiu0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x011e, code lost:
    
        if (r10.emit(r3, r7) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0120, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ce, code lost:
    
        if (r12 == r0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        StopsSelectorInteractor$uiState$$inlined$map$1$2$1 stopsSelectorInteractor$uiState$$inlined$map$1$2$1;
        int i;
        Object obj2;
        vpr vprVar;
        if (continuation instanceof StopsSelectorInteractor$uiState$$inlined$map$1$2$1) {
            stopsSelectorInteractor$uiState$$inlined$map$1$2$1 = (StopsSelectorInteractor$uiState$$inlined$map$1$2$1) continuation;
            int i2 = stopsSelectorInteractor$uiState$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stopsSelectorInteractor$uiState$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                StopsSelectorInteractor$uiState$$inlined$map$1$2$1 stopsSelectorInteractor$uiState$$inlined$map$1$2$12 = stopsSelectorInteractor$uiState$$inlined$map$1$2$1;
                Object obj3 = stopsSelectorInteractor$uiState$$inlined$map$1$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stopsSelectorInteractor$uiState$$inlined$map$1$2$12.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Pair pair = (Pair) obj;
                    zjb zjbVar = (zjb) pair.getFirst();
                    ohu0 ohu0Var = (ohu0) pair.getSecond();
                    boolean z = zjbVar instanceof yjb;
                    obj2 = kiu0.a;
                    tiu0 tiu0Var = this.b;
                    vprVar = this.a;
                    if (z) {
                        yjb yjbVar = (yjb) zjbVar;
                        CheckoutResponse checkoutResponse = yjbVar.a;
                        CheckoutResponse.StopsSelector stopsSelector = checkoutResponse.g;
                        if (stopsSelector != null && !stopsSelector.c.isEmpty()) {
                            StopSelectionStage stopSelectionStage = checkoutResponse.b != null ? StopSelectionStage.SELECT_DESTINATION_STOP : ohu0Var.c;
                            if (stopSelectionStage != ohu0Var.c) {
                                tiu0Var.e(stopSelectionStage);
                            }
                            tiu0Var.c(yjbVar.c);
                            e eVar = tiu0Var.b;
                            String str = checkoutResponse.b;
                            String str2 = yjbVar.b.e;
                            String str3 = checkoutResponse.f;
                            boolean z2 = ohu0Var.b;
                            stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$0 = null;
                            stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$1 = null;
                            stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$2 = null;
                            stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$3 = null;
                            stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$4 = vprVar;
                            stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$5 = null;
                            stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$6 = null;
                            stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$7 = null;
                            stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$8 = null;
                            stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$9 = null;
                            stopsSelectorInteractor$uiState$$inlined$map$1$2$12.label = 1;
                            obj3 = eVar.f(stopsSelector, str, str2, str3, z2, stopsSelectorInteractor$uiState$$inlined$map$1$2$12);
                        }
                    } else if (zjbVar instanceof vjb) {
                        tiu0Var.c(((vjb) zjbVar).c);
                    } else if (zjbVar instanceof ujb) {
                        tiu0Var.c(((ujb) zjbVar).c);
                    } else {
                        if (!jl40.l(zjbVar, wjb.a) && !jl40.l(zjbVar, xjb.a)) {
                            w511.b();
                            return null;
                        }
                        obj2 = piu0.a;
                    }
                    stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$0 = null;
                    stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$1 = null;
                    stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$2 = null;
                    stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$3 = null;
                    stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$4 = null;
                    stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$5 = null;
                    stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$6 = null;
                    stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$7 = null;
                    stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$8 = null;
                    stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$9 = null;
                    stopsSelectorInteractor$uiState$$inlined$map$1$2$12.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj3);
                        return zy11.a;
                    }
                    vprVar = (vpr) stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$4;
                    kotlin.b.b(obj3);
                }
                obj2 = (wiu0) obj3;
                stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$0 = null;
                stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$1 = null;
                stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$2 = null;
                stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$3 = null;
                stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$4 = null;
                stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$5 = null;
                stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$6 = null;
                stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$7 = null;
                stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$8 = null;
                stopsSelectorInteractor$uiState$$inlined$map$1$2$12.L$9 = null;
                stopsSelectorInteractor$uiState$$inlined$map$1$2$12.label = 2;
            }
        }
        stopsSelectorInteractor$uiState$$inlined$map$1$2$1 = new StopsSelectorInteractor$uiState$$inlined$map$1$2$1(this, continuation);
        StopsSelectorInteractor$uiState$$inlined$map$1$2$1 stopsSelectorInteractor$uiState$$inlined$map$1$2$122 = stopsSelectorInteractor$uiState$$inlined$map$1$2$1;
        Object obj32 = stopsSelectorInteractor$uiState$$inlined$map$1$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stopsSelectorInteractor$uiState$$inlined$map$1$2$122.label;
        if (i != 0) {
        }
        obj2 = (wiu0) obj32;
        stopsSelectorInteractor$uiState$$inlined$map$1$2$122.L$0 = null;
        stopsSelectorInteractor$uiState$$inlined$map$1$2$122.L$1 = null;
        stopsSelectorInteractor$uiState$$inlined$map$1$2$122.L$2 = null;
        stopsSelectorInteractor$uiState$$inlined$map$1$2$122.L$3 = null;
        stopsSelectorInteractor$uiState$$inlined$map$1$2$122.L$4 = null;
        stopsSelectorInteractor$uiState$$inlined$map$1$2$122.L$5 = null;
        stopsSelectorInteractor$uiState$$inlined$map$1$2$122.L$6 = null;
        stopsSelectorInteractor$uiState$$inlined$map$1$2$122.L$7 = null;
        stopsSelectorInteractor$uiState$$inlined$map$1$2$122.L$8 = null;
        stopsSelectorInteractor$uiState$$inlined$map$1$2$122.L$9 = null;
        stopsSelectorInteractor$uiState$$inlined$map$1$2$122.label = 2;
    }
}
