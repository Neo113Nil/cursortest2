package defpackage;

import com.yandex.payment.sdk.ui.view.ChallengerInputView;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class z80 implements wqw {
    public final rb8 a;
    public final boolean b;
    public final /* synthetic */ tu5 c;
    public final /* synthetic */ xqw d;

    public z80(m2v m2vVar, boolean z, tu5 tu5Var, xqw xqwVar) {
        this.c = tu5Var;
        this.d = xqwVar;
        this.a = (rb8) m2vVar.a;
        this.b = z;
    }

    public final boolean a() {
        boolean z = this.b;
        xqw xqwVar = this.d;
        if (!z) {
            ((Runnable) ((a90) xqwVar).b.w).run();
        }
        return ((y80) ((a90) xqwVar).b.b).n(c());
    }

    public final jv5 b() {
        return this.a;
    }

    public final String c() {
        m831 m831Var;
        String str;
        tu5 tu5Var = this.c;
        return (tu5Var == null || (m831Var = tu5Var.b.a) == null || (str = m831Var.a) == null) ? "" : str;
    }

    public final String d() {
        tu5 tu5Var = this.c;
        if (tu5Var != null) {
            m831 m831Var = tu5Var.b.a;
            if (m831Var instanceof k831) {
                k831 k831Var = (k831) m831Var;
                String str = k831Var.d;
                if (str == null) {
                    str = "";
                }
                String str2 = k831Var.c;
                if (str2 == null) {
                    str2 = "";
                }
                String v = cvu0.v(cvu0.v(str2, "*", ChallengerInputView.DEFAULT_SMS_HINT, false), "••••", "•••• ", false);
                if (v.length() > 6) {
                    return g8e.p(str, " ", v.substring(6));
                }
            }
        }
        return "";
    }

    public final e4a0 e() {
        m831 m831Var;
        PaymentMethod$Type paymentMethod$Type;
        tu5 tu5Var = this.c;
        return (tu5Var == null || (m831Var = tu5Var.b.a) == null || (paymentMethod$Type = m831Var.b) == null) ? e4a0.R3 : paymentMethod$Type;
    }

    public final boolean f() {
        return this.b;
    }
}
