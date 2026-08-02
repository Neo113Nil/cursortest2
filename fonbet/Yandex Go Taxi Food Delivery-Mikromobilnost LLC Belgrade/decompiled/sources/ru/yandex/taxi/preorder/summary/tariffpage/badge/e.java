package ru.yandex.taxi.preorder.summary.tariffpage.badge;

import android.graphics.drawable.Drawable;
import com.yandex.go.zone.dto.objects.PaidOptions;
import defpackage.dzg0;
import defpackage.evu0;
import defpackage.jbx0;
import defpackage.mi31;
import defpackage.npw0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.ppw0;
import defpackage.tje;
import defpackage.ud30;
import defpackage.vpr;
import defpackage.wl4;
import defpackage.y990;
import defpackage.zy11;
import java.util.Collections;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ y990 b;

    public e(vpr vprVar, y990 y990Var) {
        this.a = vprVar;
        this.b = y990Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PaidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1 paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1;
        int i;
        Drawable drawable;
        Object singletonList;
        if (continuation instanceof PaidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1) {
            paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1 = (PaidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1) continuation;
            int i2 = paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pex0 pex0Var = ((mi31) obj).a;
                    PaidOptions.Alert alert = pex0Var.e0.d;
                    String str = alert.a;
                    String str2 = alert.c;
                    if (evu0.J(str)) {
                        singletonList = EmptyList.a;
                    } else {
                        FormattedText c = FormattedText.Companion.c(str);
                        String str3 = pex0Var.b;
                        boolean J = evu0.J(str2);
                        y990 y990Var = this.b;
                        ud30 ud30Var = !J ? new ud30(10, y990Var, alert, str3) : null;
                        jbx0 jbx0Var = new jbx0(!evu0.J(str2) ? dzg0.info_icon : 0);
                        ppw0 ppw0Var = y990Var.a;
                        if (pex0Var.e0.a()) {
                            npw0 c2 = ppw0Var.c(pex0Var);
                            Drawable y = tje.y(c2.a, ppw0Var.a);
                            y.setTint(c2.b);
                            drawable = y;
                        } else {
                            drawable = null;
                        }
                        singletonList = Collections.singletonList(new wl4(null, c, null, 0, null, drawable, null, jbx0Var, null, null, null, null, ud30Var, 65245));
                    }
                    paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.L$0 = null;
                    paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.L$1 = null;
                    paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.L$2 = null;
                    paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.L$3 = null;
                    paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(singletonList, paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1 = new PaidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paidOptionAlertTariffBadgeInteractor$badgesFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
