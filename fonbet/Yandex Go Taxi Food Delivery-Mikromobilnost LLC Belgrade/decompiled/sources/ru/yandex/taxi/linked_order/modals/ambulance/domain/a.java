package ru.yandex.taxi.linked_order.modals.ambulance.domain;

import defpackage.a22;
import defpackage.avj0;
import defpackage.dny;
import defpackage.gjz0;
import defpackage.kyh0;
import defpackage.mrj;
import defpackage.ny61;
import defpackage.vo70;
import defpackage.vpr;
import defpackage.wo70;
import defpackage.xo70;
import defpackage.z12;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ mrj b;

    public a(vpr vprVar, mrj mrjVar) {
        this.a = vprVar;
        this.b = mrjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AmbulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$2$1 ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$2$1;
        int i;
        gjz0 gjz0Var;
        gjz0 gjz0Var2;
        xo70 vo70Var;
        if (continuation instanceof AmbulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$2$1) {
            ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$2$1 = (AmbulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    dny dnyVar = (dny) obj;
                    a22 a22Var = (a22) this.b.w;
                    String str = dnyVar.e;
                    String str2 = dnyVar.f;
                    String str3 = dnyVar.g;
                    zuj0 zuj0Var = a22Var.a;
                    if (dnyVar.a) {
                        vo70Var = new wo70(((avj0) zuj0Var).h(kyh0.common_done));
                    } else {
                        String str4 = dnyVar.i;
                        if (str4.length() <= 0) {
                            str4 = null;
                        }
                        if (str4 != null) {
                            gjz0Var = new gjz0(((avj0) zuj0Var).h(kyh0.order_action_communication_with_driver_v2), str4);
                        } else {
                            gjz0Var = null;
                        }
                        String str5 = dnyVar.H;
                        if (str5.length() <= 0) {
                            str5 = null;
                        }
                        if (str5 != null) {
                            gjz0Var2 = new gjz0(((avj0) zuj0Var).h(kyh0.order_options_share_route_v2), str5);
                        } else {
                            gjz0Var2 = null;
                        }
                        vo70Var = new vo70(gjz0Var, gjz0Var2, dnyVar.p);
                    }
                    z12 z12Var = new z12(str, str2, str3, vo70Var);
                    ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(z12Var, ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$2$1 = new AmbulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ambulanceLinkedOrderUiStateInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
