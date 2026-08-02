package ru.yandex.taxi.masstransit.trains.checkout;

import defpackage.avj0;
import defpackage.hb40;
import defpackage.jl40;
import defpackage.kga0;
import defpackage.lga0;
import defpackage.mga0;
import defpackage.mzh0;
import defpackage.nga0;
import defpackage.ny61;
import defpackage.oga0;
import defpackage.pga0;
import defpackage.qga0;
import defpackage.ud40;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wi70;
import defpackage.xd40;
import defpackage.y940;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class p implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ r b;
    public final /* synthetic */ xd40 c;

    public p(vpr vprVar, r rVar, xd40 xd40Var) {
        this.a = vprVar;
        this.b = rVar;
        this.c = xd40Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtTrainCheckoutUiStateRepository$uiStateFlow$lambda$1$$inlined$map$1$2$1 mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$1$$inlined$map$1$2$1;
        int i;
        hb40 hb40Var;
        if (continuation instanceof MtTrainCheckoutUiStateRepository$uiStateFlow$lambda$1$$inlined$map$1$2$1) {
            mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$1$$inlined$map$1$2$1 = (MtTrainCheckoutUiStateRepository$uiStateFlow$lambda$1$$inlined$map$1$2$1) continuation;
            int i2 = mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$1$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$1$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$1$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    qga0 qga0Var = (qga0) obj;
                    r rVar = this.b;
                    rVar.getClass();
                    Object obj3 = this.c;
                    if (obj3 instanceof ud40) {
                        if ((qga0Var instanceof lga0) || (qga0Var instanceof nga0)) {
                            ud40 ud40Var = (ud40) obj3;
                            hb40 hb40Var2 = ud40Var.f.a;
                            if (hb40Var2 != null) {
                                hb40Var = hb40.a(hb40Var2, new wi70(78, ((avj0) rVar.d).h(mzh0.common_loading), null, false), null, 27);
                            } else {
                                hb40Var = null;
                            }
                            obj3 = ud40.a(ud40Var, null, null, new y940(hb40Var), 31);
                        } else if (!(qga0Var instanceof oga0) && !(qga0Var instanceof mga0) && !(qga0Var instanceof pga0) && !jl40.l(qga0Var, kga0.a)) {
                            w511.b();
                            return null;
                        }
                    }
                    mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$1$$inlined$map$1$2$1.L$0 = null;
                    mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$1$$inlined$map$1$2$1.L$1 = null;
                    mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$1$$inlined$map$1$2$1.L$2 = null;
                    mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$1$$inlined$map$1$2$1.L$3 = null;
                    mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$1$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj3, mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$1$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$1$$inlined$map$1$2$1 = new MtTrainCheckoutUiStateRepository$uiStateFlow$lambda$1$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$1$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainCheckoutUiStateRepository$uiStateFlow$lambda$1$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
