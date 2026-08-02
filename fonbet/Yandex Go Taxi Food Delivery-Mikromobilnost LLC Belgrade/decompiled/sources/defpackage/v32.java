package defpackage;

import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$PaymentMethodsScreen;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$VerificationProcessingAction;
import com.yandex.go.payments.addmethod.analytics.PaymentMethodsAnalytics$VerificationType;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.payment_options.model.pci_dss.CardType;

/* loaded from: classes8.dex */
public final class v32 implements u32 {
    public static final /* synthetic */ int e = 0;
    public final g9a0 b;
    public final h3y c;
    public String d = "unknown";

    public v32(g9a0 g9a0Var, h3y h3yVar) {
        this.b = g9a0Var;
        this.c = h3yVar;
    }

    @Override // defpackage.u32
    public final void a(boolean z, boolean z2) {
        cj20 cj20Var = (cj20) this.c.get();
        cj20Var.getClass();
        if (z && z2) {
            return;
        }
        cj20Var.a("Verification", z, z2);
    }

    @Override // defpackage.u32
    public final void b() {
        this.b.c(xe91.i(this.d), "card", "success");
    }

    @Override // defpackage.u32
    public final void c(boolean z, boolean z2) {
        cj20 cj20Var = (cj20) this.c.get();
        cj20Var.getClass();
        if (z && z2) {
            return;
        }
        cj20Var.a("CardVerificationStatus", z, z2);
    }

    @Override // defpackage.u32
    public final void d() {
        this.b.j(xe91.i(this.d), "card", PaymentMethodsAnalytics$VerificationType.Standard23ds, PaymentMethodsAnalytics$VerificationProcessingAction.ScreenOpened, null, null);
    }

    @Override // defpackage.u32
    public final void e(m831 m831Var) {
        PaymentMethodsAnalytics$PaymentMethodsScreen i = xe91.i(this.d);
        String E = o501.E(m831Var != null ? m831Var.a() : null);
        PaymentMethodsAnalytics$VerificationType paymentMethodsAnalytics$VerificationType = PaymentMethodsAnalytics$VerificationType.Standard23ds;
        CardType y = o501.y(m831Var);
        g9a0.i(this.b, i, E, paymentMethodsAnalytics$VerificationType, "too_many", y != null ? y.getAnalyticsName() : null, 32);
    }

    @Override // defpackage.u32
    public final void f() {
        this.b.j(xe91.i(this.d), "card", PaymentMethodsAnalytics$VerificationType.Standard23ds, PaymentMethodsAnalytics$VerificationProcessingAction.Cancelled, null, null);
    }

    @Override // defpackage.u32
    public final void g(int i, String str) {
        this.b.j(xe91.i(this.d), "card", PaymentMethodsAnalytics$VerificationType.Standard23ds, PaymentMethodsAnalytics$VerificationProcessingAction.LoadingFailed, Integer.valueOf(i), str);
    }

    @Override // defpackage.u32
    public final void h(m831 m831Var, String str) {
        PaymentMethodsAnalytics$PaymentMethodsScreen i = xe91.i(this.d);
        String E = o501.E(m831Var != null ? m831Var.a() : null);
        PaymentMethodsAnalytics$VerificationType z = o501.z(str);
        CardType y = o501.y(m831Var);
        g9a0.i(this.b, i, E, z, "error", y != null ? y.getAnalyticsName() : null, 32);
    }

    @Override // defpackage.u32
    public final void i(String str, j831 j831Var) {
        m831 a = j831Var != null ? j831Var.a() : null;
        PaymentMethodsAnalytics$PaymentMethodsScreen i = xe91.i(this.d);
        String E = o501.E(a != null ? a.a() : null);
        PaymentMethodsAnalytics$VerificationType z = o501.z(str);
        CardType y = o501.y(a);
        g9a0.i(this.b, i, E, z, "success", y != null ? y.getAnalyticsName() : null, 32);
    }

    @Override // defpackage.u32
    public final void j(m831 m831Var, String str) {
        PaymentMethodsAnalytics$PaymentMethodsScreen i = xe91.i(this.d);
        String E = o501.E(m831Var != null ? m831Var.a() : null);
        PaymentMethodsAnalytics$VerificationType z = o501.z(str);
        CardType y = o501.y(m831Var);
        g9a0.i(this.b, i, E, z, "fail", y != null ? y.getAnalyticsName() : null, 32);
    }

    @Override // defpackage.u32
    public final void k() {
        g9a0.i(this.b, xe91.i(this.d), "card", PaymentMethodsAnalytics$VerificationType.Standard23ds, "cancelled", null, 48);
    }

    @Override // defpackage.u32
    public final void l(PaymentMethod$Type paymentMethod$Type) {
        String str;
        PaymentMethodsAnalytics$PaymentMethodsScreen i = xe91.i(this.d);
        if (paymentMethod$Type == null || (str = paymentMethod$Type.getCode()) == null) {
            str = "";
        }
        this.b.j(i, str, PaymentMethodsAnalytics$VerificationType.RandomAmount, PaymentMethodsAnalytics$VerificationProcessingAction.Cancelled, null, null);
    }

    @Override // defpackage.u32
    public final void m(String str) {
        if (evu0.J(str)) {
            jst.e.h(null, "PaymentMethod.Confirmation.WrongMethod", null);
        } else {
            xby.l(jst.e, "PaymentMethod.Confirmation.WrongMethod", null, null, str, 2);
        }
    }

    @Override // defpackage.u32
    public final void n(PaymentMethod$Type paymentMethod$Type) {
        this.b.j(xe91.i(this.d), paymentMethod$Type.getCode(), PaymentMethodsAnalytics$VerificationType.RandomAmount, PaymentMethodsAnalytics$VerificationProcessingAction.ScreenOpened, null, null);
    }
}
