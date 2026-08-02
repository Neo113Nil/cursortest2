package ru.yandex.taxi.summary.solid.interactor;

import android.content.Context;
import defpackage.cjw0;
import defpackage.fnx0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.rsn;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class z implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ cjw0 b;

    public z(vpr vprVar, cjw0 cjw0Var) {
        this.a = vprVar;
        this.b = cjw0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1 tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1;
        int i;
        boolean z;
        String str;
        String e;
        String e2;
        Context context = (Context) this.b.a;
        if (continuation instanceof TariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1) {
            tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1 = (TariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1) continuation;
            int i2 = tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rsn rsnVar = (rsn) obj;
                    fnx0 fnx0Var = (fnx0) rsnVar.a;
                    fnx0 fnx0Var2 = (fnx0) rsnVar.b;
                    pex0 pex0Var = fnx0Var2.c;
                    pex0 pex0Var2 = fnx0Var2.c;
                    String e3 = (pex0Var.u || (e2 = pex0Var.e()) == null || e2.length() == 0) ? null : pex0Var2.e();
                    boolean z2 = false;
                    boolean z3 = (fnx0Var == null || jl40.l(fnx0Var.c.b, pex0Var2.b)) ? false : true;
                    if (fnx0Var != null) {
                        pex0 pex0Var3 = fnx0Var.c;
                        if (!jl40.l((pex0Var3.u || (e = pex0Var3.e()) == null || e.length() == 0) ? null : pex0Var3.e(), e3)) {
                            z = true;
                            if (fnx0Var != null && !jl40.l(fnx0Var.c.O, pex0Var2.O)) {
                                z2 = true;
                            }
                            str = pex0Var2.E0;
                            if ((!z3 && !z2) || str == null) {
                                String c = fnx0Var2.a.c();
                                str = z3 ? e3 != null ? context.getString(kyh0.summary_tariff_changed_with_price_content_description, Arrays.copyOf(new Object[]{c, e3}, 2)) : context.getString(kyh0.summary_tariff_changed_content_description, Arrays.copyOf(new Object[]{c}, 1)) : z ? e3 != null ? context.getString(kyh0.summary_tariff_price_changed_with_price_content_description, Arrays.copyOf(new Object[]{c, e3}, 2)) : context.getString(kyh0.summary_tariff_price_changed_content_description, Arrays.copyOf(new Object[]{c}, 1)) : "";
                            }
                            tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1.L$0 = null;
                            tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1.L$1 = null;
                            tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1.L$2 = null;
                            tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1.L$3 = null;
                            tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1.label = 1;
                            if (this.a.emit(str, tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    z = false;
                    if (fnx0Var != null) {
                        z2 = true;
                    }
                    str = pex0Var2.E0;
                    if (!z3) {
                        String c2 = fnx0Var2.a.c();
                        str = z3 ? e3 != null ? context.getString(kyh0.summary_tariff_changed_with_price_content_description, Arrays.copyOf(new Object[]{c2, e3}, 2)) : context.getString(kyh0.summary_tariff_changed_content_description, Arrays.copyOf(new Object[]{c2}, 1)) : z ? e3 != null ? context.getString(kyh0.summary_tariff_price_changed_with_price_content_description, Arrays.copyOf(new Object[]{c2, e3}, 2)) : context.getString(kyh0.summary_tariff_price_changed_content_description, Arrays.copyOf(new Object[]{c2}, 1)) : "";
                        tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1.L$0 = null;
                        tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1.L$1 = null;
                        tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1.L$2 = null;
                        tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1.L$3 = null;
                        tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1.label = 1;
                        if (this.a.emit(str, tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        }
                    }
                    String c22 = fnx0Var2.a.c();
                    str = z3 ? e3 != null ? context.getString(kyh0.summary_tariff_changed_with_price_content_description, Arrays.copyOf(new Object[]{c22, e3}, 2)) : context.getString(kyh0.summary_tariff_changed_content_description, Arrays.copyOf(new Object[]{c22}, 1)) : z ? e3 != null ? context.getString(kyh0.summary_tariff_price_changed_with_price_content_description, Arrays.copyOf(new Object[]{c22, e3}, 2)) : context.getString(kyh0.summary_tariff_price_changed_content_description, Arrays.copyOf(new Object[]{c22}, 1)) : "";
                    tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1.L$0 = null;
                    tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1.L$1 = null;
                    tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1.L$2 = null;
                    tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1.L$3 = null;
                    tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(str, tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1 = new TariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffAccessibilityNotifyInteractor$notifyTariffFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
