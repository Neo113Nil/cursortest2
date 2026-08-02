package ru.yandex.taxi.cashback.sdk;

import com.yandex.go.zone.dto.objects.ServiceLevelWidget$Invisible;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$SurgeAlert;
import com.yandex.go.zone.dto.objects.ServiceLevelWidget$SurgeBalance;
import com.yandex.go.zone.dto.objects.e5;
import com.yandex.go.zone.dto.objects.f5;
import defpackage.fnx0;
import defpackage.i49;
import defpackage.j49;
import defpackage.jl40;
import defpackage.lux0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.s2c;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ j49 c;
    public final /* synthetic */ fnx0 w;

    public e(vpr vprVar, boolean z, j49 j49Var, fnx0 fnx0Var) {
        this.a = vprVar;
        this.b = z;
        this.c = j49Var;
        this.w = fnx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CashbackTariffContextInteractor$tariffContext$$inlined$map$1$2$1 cashbackTariffContextInteractor$tariffContext$$inlined$map$1$2$1;
        int i;
        s2c s2cVar;
        pex0 pex0Var;
        if (continuation instanceof CashbackTariffContextInteractor$tariffContext$$inlined$map$1$2$1) {
            cashbackTariffContextInteractor$tariffContext$$inlined$map$1$2$1 = (CashbackTariffContextInteractor$tariffContext$$inlined$map$1$2$1) continuation;
            int i2 = cashbackTariffContextInteractor$tariffContext$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cashbackTariffContextInteractor$tariffContext$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cashbackTariffContextInteractor$tariffContext$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashbackTariffContextInteractor$tariffContext$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    lux0 lux0Var = (lux0) obj;
                    boolean z = this.b;
                    boolean z2 = false;
                    fnx0 fnx0Var = this.w;
                    j49 j49Var = this.c;
                    if (z) {
                        f5 f5Var = (fnx0Var == null || (pex0Var = fnx0Var.c) == null) ? null : pex0Var.w0;
                        j49Var.getClass();
                        if (f5Var instanceof ServiceLevelWidget$SurgeAlert) {
                            z2 = true;
                        } else if (!(f5Var instanceof ServiceLevelWidget$Invisible) && !(f5Var instanceof ServiceLevelWidget$SurgeBalance) && !jl40.l(f5Var, e5.INSTANCE) && f5Var != null) {
                            w511.b();
                            return null;
                        }
                    }
                    if (fnx0Var != null) {
                        j49Var.getClass();
                        s2cVar = new s2c(fnx0Var.c.b, fnx0Var.a.b);
                    } else {
                        s2cVar = null;
                    }
                    i49 i49Var = new i49(s2cVar, z2, lux0Var);
                    cashbackTariffContextInteractor$tariffContext$$inlined$map$1$2$1.L$0 = null;
                    cashbackTariffContextInteractor$tariffContext$$inlined$map$1$2$1.L$1 = null;
                    cashbackTariffContextInteractor$tariffContext$$inlined$map$1$2$1.L$2 = null;
                    cashbackTariffContextInteractor$tariffContext$$inlined$map$1$2$1.L$3 = null;
                    cashbackTariffContextInteractor$tariffContext$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(i49Var, cashbackTariffContextInteractor$tariffContext$$inlined$map$1$2$1) == coroutineSingletons) {
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
        cashbackTariffContextInteractor$tariffContext$$inlined$map$1$2$1 = new CashbackTariffContextInteractor$tariffContext$$inlined$map$1$2$1(this, continuation);
        Object obj22 = cashbackTariffContextInteractor$tariffContext$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashbackTariffContextInteractor$tariffContext$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
