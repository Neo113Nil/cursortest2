package defpackage;

import com.yandex.go.payments.data.model.response.CorpAccount;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.preorder.repositories.g;

/* loaded from: classes8.dex */
public final class ycq0 {
    public final fga0 a;
    public final g b;
    public final drd c;
    public final h3y d;
    public final usx e;

    public ycq0(fga0 fga0Var, g gVar, drd drdVar, h3y h3yVar, usx usxVar) {
        this.a = fga0Var;
        this.b = gVar;
        this.c = drdVar;
        this.d = h3yVar;
        this.e = usxVar;
    }

    public final void a(lv90 lv90Var) {
        fga0 fga0Var = this.a;
        fga0Var.getClass();
        fga0Var.B(lv90Var.a(), lv90Var.b);
        Boolean bool = lv90Var.d;
        String str = fga0Var.v;
        cne0 cne0Var = fga0Var.a;
        if (bool != null) {
            cne0Var.p(bool.booleanValue() ? 1 : 0, str);
        } else {
            cne0Var.w(str);
        }
        this.c.e(lv90Var);
    }

    public final void b(lv90 lv90Var) {
        fga0 fga0Var = this.a;
        fga0Var.getClass();
        fga0Var.B(lv90Var.a(), lv90Var.b);
        Boolean bool = lv90Var.d;
        String str = fga0Var.v;
        cne0 cne0Var = fga0Var.a;
        if (bool != null) {
            cne0Var.p(bool.booleanValue() ? 1 : 0, str);
        } else {
            cne0Var.w(str);
        }
        c(lv90Var);
        this.c.e(lv90Var);
    }

    public final void c(lv90 lv90Var) {
        g gVar = this.b;
        gVar.a.a.i(lv90Var);
        gVar.c.g(zy11.a);
        PaymentMethod$Type paymentMethod$Type = lv90Var.a;
        PaymentMethod$Type paymentMethod$Type2 = PaymentMethod$Type.CORP;
        if (paymentMethod$Type == paymentMethod$Type2) {
            fga0 fga0Var = this.a;
            fga0Var.getClass();
            CorpAccount j = fga0Var.j(fga0Var.q(paymentMethod$Type2));
            if (j != null) {
                ((amc) this.d.get()).h(j.h(), j.getI());
            }
        }
        if (this.b.a.a.w != null || this.b.c()) {
            usx usxVar = this.e;
            r0 r0Var = usxVar.b;
            usxVar.a.getClass();
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            r0Var.getClass();
            r0Var.m(null, valueOf);
            this.b.g(null, false);
        }
    }
}
