package defpackage;

import com.yandex.go.payments.lpm.domain.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class yyz implements ffa0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ yyz(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ffa0
    public final void c(lea0 lea0Var, iba0 iba0Var, sls slsVar) {
        m6a0 m6a0Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                PaymentMethod$Type c = lea0Var.c();
                c9v c9vVar = ((e) obj).k;
                m6a0 m6a0Var2 = (m6a0) ((r0) c9vVar.c).getValue();
                if (lea0Var instanceof h8b0) {
                    h8b0 h8b0Var = (h8b0) lea0Var;
                    if (m6a0Var2 == null) {
                        m6a0Var = null;
                    } else {
                        PaymentMethod$Type paymentMethod$Type = m6a0Var2.a;
                        if (h8b0Var.f()) {
                            m6a0Var = new m6a0(paymentMethod$Type, m6a0Var2.b, (m6a0Var2.a() || !h8b0Var.g(paymentMethod$Type)) ? null : new m6a0(PaymentMethod$Type.PERSONAL_WALLET, h8b0Var.a, null));
                        } else {
                            m6a0Var = m6a0Var2;
                        }
                    }
                } else {
                    m6a0Var = new m6a0(c, lea0Var.getId(), m6a0Var2 != null ? m6a0Var2.c : null);
                }
                if (m6a0Var != null && !m6a0Var.equals(m6a0Var2)) {
                    r0 r0Var = (r0) c9vVar.c;
                    r0Var.getClass();
                    r0Var.m(null, m6a0Var);
                    break;
                }
                break;
            default:
                ((dy90) obj).a.b().g(lea0Var, "no_feature");
                break;
        }
    }
}
