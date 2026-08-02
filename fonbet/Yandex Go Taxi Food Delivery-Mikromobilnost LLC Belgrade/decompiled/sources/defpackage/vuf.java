package defpackage;

import com.yandex.payment.divkit.select.b;
import com.yandex.payment.divkit.select.h;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import kotlinx.coroutines.flow.r0;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class vuf implements ryj0 {
    public final /* synthetic */ h a;

    public vuf(h hVar) {
        this.a = hVar;
    }

    @Override // defpackage.ryj0
    public final void i(Object obj) {
        md51 md51Var;
        wga0 h;
        PaymentKitError paymentKitError = (PaymentKitError) obj;
        PaymentKitError.Kind6_6_0 kind6_6_0 = paymentKitError.getKind6_6_0();
        PaymentKitError.Kind6_6_0 kind6_6_02 = PaymentKitError.Kind6_6_0.payment_failed_but_new_attempt_allowed;
        h hVar = this.a;
        if (kind6_6_0 != kind6_6_02) {
            r0 r0Var = hVar.P;
            eeq0 eeq0Var = new eeq0(paymentKitError);
            r0Var.getClass();
            r0Var.m(null, eeq0Var);
            return;
        }
        ((y22) hVar.c).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Платеж завершился с ошибкой, но разрешена новая попытка", "payment_failed_but_new_attempt_allowed"));
        vv90 vv90Var = hVar.y;
        asw aswVar = vv90Var instanceof asw ? (asw) vv90Var : null;
        if (aswVar != null) {
            boj0 boj0Var = ((yv90) aswVar).i;
            if (boj0Var == null || (h = boj0Var.h()) == null) {
                md51Var = null;
            } else {
                aia0 aia0Var = h.b;
                bt5 bt5Var = aia0Var.a;
                md51Var = ymx.j(bt5Var.c, new l15(bt5Var, aia0Var.f, aia0Var.e, true, 1), null, 5);
                aia0Var.g = md51Var;
            }
            if (md51Var != null) {
                md51 l = ymx.l((ymx) md51Var, new b(hVar, 2), null, 5);
                if (l != null) {
                    l.b(new dke(10, hVar, paymentKitError));
                }
            }
        }
    }

    @Override // defpackage.ryj0
    public final void onSuccess(Object obj) {
        h.Y(this.a, (sm0) obj);
    }
}
