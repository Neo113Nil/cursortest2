package ru.yandex.taxi.masstransit.trains.checkout;

import defpackage.a2a0;
import defpackage.avj0;
import defpackage.bvf0;
import defpackage.db40;
import defpackage.e0h0;
import defpackage.ea40;
import defpackage.fef;
import defpackage.ga40;
import defpackage.ib40;
import defpackage.kga0;
import defpackage.kyh0;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.od40;
import defpackage.p6o;
import defpackage.pwy0;
import defpackage.pz40;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.u1n;
import defpackage.uyj;
import defpackage.vb40;
import defpackage.vd40;
import defpackage.wd40;
import defpackage.xd40;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class r {
    public final k a;
    public final com.yandex.go.payments.data.p b;
    public final a2a0 c;
    public final zuj0 d;
    public final ga40 e;
    public final ea40 f;
    public final r0 g;
    public final r0 h;
    public p6o i;
    public final tpr j;

    public r(pwy0 pwy0Var, tt2 tt2Var, k kVar, com.yandex.go.payments.data.p pVar, a2a0 a2a0Var, zuj0 zuj0Var, ga40 ga40Var, ea40 ea40Var) {
        this.a = kVar;
        this.b = pVar;
        this.c = a2a0Var;
        this.d = zuj0Var;
        this.e = ga40Var;
        this.f = ea40Var;
        r0 c = bvf0.c(new wd40((String) null, 3));
        this.g = c;
        this.h = bvf0.c(kga0.a);
        tpr t = kotlinx.coroutines.flow.e.t(new m0(pwy0Var.a(), c, new MtTrainCheckoutUiStateRepository$uiStateFlow$1(3, null)));
        tt2Var.getClass();
        this.j = kotlinx.coroutines.flow.e.F(t, uyj.a);
    }

    public final void a() {
        r0 r0Var;
        Object value;
        p6o p6oVar;
        do {
            r0Var = this.g;
            value = r0Var.getValue();
            p6oVar = this.i;
            if (p6oVar == null) {
                int i = kyh0.masstransit_vertical_trains_buy_ticket;
                avj0 avj0Var = (avj0) this.d;
                p6o p6oVar2 = new p6o(avj0Var.h(i), e0h0.ic_error_ticket, avj0Var.h(kyh0.masstransit_trains_checkout_error_title), avj0Var.h(kyh0.masstransit_trains_error_subtitle), new u1n(9, avj0Var.h(kyh0.mt_refresh), od40.a));
                this.i = p6oVar2;
                p6oVar = p6oVar2;
            }
        } while (!r0Var.k(value, new vd40(p6oVar)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0091 -> B:10:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(vb40 vb40Var, ib40 ib40Var, db40 db40Var, fef fefVar, tse tseVar, ContinuationImpl continuationImpl) {
        MtTrainCheckoutUiStateRepository$updateScreenData$1 mtTrainCheckoutUiStateRepository$updateScreenData$1;
        int i;
        n4u0 n4u0Var;
        vb40 vb40Var2;
        ib40 ib40Var2;
        db40 db40Var2;
        fef fefVar2;
        tse tseVar2;
        MtTrainCheckoutUiStateRepository$updateScreenData$1 mtTrainCheckoutUiStateRepository$updateScreenData$12;
        Object value;
        Object h;
        if (continuationImpl instanceof MtTrainCheckoutUiStateRepository$updateScreenData$1) {
            mtTrainCheckoutUiStateRepository$updateScreenData$1 = (MtTrainCheckoutUiStateRepository$updateScreenData$1) continuationImpl;
            int i2 = mtTrainCheckoutUiStateRepository$updateScreenData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainCheckoutUiStateRepository$updateScreenData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtTrainCheckoutUiStateRepository$updateScreenData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainCheckoutUiStateRepository$updateScreenData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n4u0Var = this.g;
                    vb40Var2 = vb40Var;
                    ib40Var2 = ib40Var;
                    db40Var2 = db40Var;
                    fefVar2 = fefVar;
                    tseVar2 = tseVar;
                    mtTrainCheckoutUiStateRepository$updateScreenData$12 = mtTrainCheckoutUiStateRepository$updateScreenData$1;
                    value = n4u0Var.getValue();
                    String h2 = ((avj0) this.d).h(kyh0.masstransit_vertical_trains_buy_ticket);
                    mtTrainCheckoutUiStateRepository$updateScreenData$12.L$0 = vb40Var2;
                    mtTrainCheckoutUiStateRepository$updateScreenData$12.L$1 = ib40Var2;
                    mtTrainCheckoutUiStateRepository$updateScreenData$12.L$2 = db40Var2;
                    mtTrainCheckoutUiStateRepository$updateScreenData$12.L$3 = fefVar2;
                    mtTrainCheckoutUiStateRepository$updateScreenData$12.L$4 = tseVar2;
                    mtTrainCheckoutUiStateRepository$updateScreenData$12.L$5 = n4u0Var;
                    mtTrainCheckoutUiStateRepository$updateScreenData$12.L$6 = value;
                    mtTrainCheckoutUiStateRepository$updateScreenData$12.L$7 = null;
                    mtTrainCheckoutUiStateRepository$updateScreenData$12.label = 1;
                    h = this.a.h(h2, vb40Var2, ib40Var2, db40Var2, fefVar2, tseVar2, mtTrainCheckoutUiStateRepository$updateScreenData$12);
                    if (h != coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    value = mtTrainCheckoutUiStateRepository$updateScreenData$1.L$6;
                    n4u0 n4u0Var2 = (pz40) mtTrainCheckoutUiStateRepository$updateScreenData$1.L$5;
                    tse tseVar3 = (tse) mtTrainCheckoutUiStateRepository$updateScreenData$1.L$4;
                    fef fefVar3 = (fef) mtTrainCheckoutUiStateRepository$updateScreenData$1.L$3;
                    db40 db40Var3 = (db40) mtTrainCheckoutUiStateRepository$updateScreenData$1.L$2;
                    ib40 ib40Var3 = (ib40) mtTrainCheckoutUiStateRepository$updateScreenData$1.L$1;
                    vb40 vb40Var3 = (vb40) mtTrainCheckoutUiStateRepository$updateScreenData$1.L$0;
                    kotlin.b.b(obj);
                    fefVar2 = fefVar3;
                    vb40Var2 = vb40Var3;
                    db40Var2 = db40Var3;
                    ib40Var2 = ib40Var3;
                    mtTrainCheckoutUiStateRepository$updateScreenData$12 = mtTrainCheckoutUiStateRepository$updateScreenData$1;
                    tseVar2 = tseVar3;
                    r0 r0Var = (r0) n4u0Var2;
                    if (!r0Var.k(value, (xd40) obj)) {
                        return zy11.a;
                    }
                    n4u0Var = r0Var;
                    value = n4u0Var.getValue();
                    String h22 = ((avj0) this.d).h(kyh0.masstransit_vertical_trains_buy_ticket);
                    mtTrainCheckoutUiStateRepository$updateScreenData$12.L$0 = vb40Var2;
                    mtTrainCheckoutUiStateRepository$updateScreenData$12.L$1 = ib40Var2;
                    mtTrainCheckoutUiStateRepository$updateScreenData$12.L$2 = db40Var2;
                    mtTrainCheckoutUiStateRepository$updateScreenData$12.L$3 = fefVar2;
                    mtTrainCheckoutUiStateRepository$updateScreenData$12.L$4 = tseVar2;
                    mtTrainCheckoutUiStateRepository$updateScreenData$12.L$5 = n4u0Var;
                    mtTrainCheckoutUiStateRepository$updateScreenData$12.L$6 = value;
                    mtTrainCheckoutUiStateRepository$updateScreenData$12.L$7 = null;
                    mtTrainCheckoutUiStateRepository$updateScreenData$12.label = 1;
                    h = this.a.h(h22, vb40Var2, ib40Var2, db40Var2, fefVar2, tseVar2, mtTrainCheckoutUiStateRepository$updateScreenData$12);
                    if (h != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    n4u0Var2 = n4u0Var;
                    obj = h;
                    r0 r0Var2 = (r0) n4u0Var2;
                    if (!r0Var2.k(value, (xd40) obj)) {
                    }
                }
            }
        }
        mtTrainCheckoutUiStateRepository$updateScreenData$1 = new MtTrainCheckoutUiStateRepository$updateScreenData$1(this, continuationImpl);
        Object obj2 = mtTrainCheckoutUiStateRepository$updateScreenData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainCheckoutUiStateRepository$updateScreenData$1.label;
        if (i != 0) {
        }
    }
}
