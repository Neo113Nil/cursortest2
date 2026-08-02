package defpackage;

import java.util.Iterator;
import kotlin.a;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class xuo0 {
    public final b03 a;
    public final wnt b;
    public final dne0 c;
    public final tig0 d;
    public final i3y e;
    public final i3y f;

    public xuo0(b03 b03Var, wnt wntVar, dne0 dne0Var, tig0 tig0Var) {
        this.a = b03Var;
        this.b = wntVar;
        this.c = dne0Var;
        this.d = tig0Var;
        final int i = 0;
        this.e = a.a(new sls(this) { // from class: wuo0
            public final /* synthetic */ xuo0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                xuo0 xuo0Var = this.b;
                switch (i2) {
                    case 0:
                        return xuo0Var.c.a(xuo0Var.a.getApplicationId() + ".LpmSelectedPayment");
                    default:
                        return bvf0.c(xuo0Var.a());
                }
            }
        });
        final int i2 = 1;
        this.f = a.a(new sls(this) { // from class: wuo0
            public final /* synthetic */ xuo0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                xuo0 xuo0Var = this.b;
                switch (i22) {
                    case 0:
                        return xuo0Var.c.a(xuo0Var.a.getApplicationId() + ".LpmSelectedPayment");
                    default:
                        return bvf0.c(xuo0Var.a());
                }
            }
        });
    }

    public final m6a0 a() {
        Object obj;
        tig0 tig0Var = this.d;
        fga0 fga0Var = (fga0) tig0Var.a;
        if (!fga0Var.a.f(fga0Var.z)) {
            tig0Var.j();
        }
        int i = fga0Var.a.i(fga0Var.A, -2);
        Iterator<E> it = PaymentMethod$Type.f().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((PaymentMethod$Type) obj).getId() == i) {
                break;
            }
        }
        PaymentMethod$Type paymentMethod$Type = (PaymentMethod$Type) obj;
        i3y i3yVar = this.e;
        wnt wntVar = this.b;
        if (paymentMethod$Type != null && paymentMethod$Type != e4a0.R3 && paymentMethod$Type != e4a0.S3) {
            cne0 cne0Var = fga0Var.a;
            String str = fga0Var.B;
            cne0 cne0Var2 = fga0Var.a;
            if (!cne0Var.f(fga0Var.z)) {
                tig0Var.j();
            }
            String l = cne0Var2.l(str, null);
            m6a0 m6a0Var = new m6a0(paymentMethod$Type, l, null);
            kv90 kv90Var = lv90.Companion;
            kv90Var.getClass();
            ((cne0) i3yVar.getValue()).r("scooters_no_feature", ((xnt) wntVar).e(kv90.b(l, paymentMethod$Type), kv90Var.serializer()));
            r0 r0Var = (r0) ((pz40) this.f.getValue());
            r0Var.getClass();
            r0Var.m(null, m6a0Var);
            cne0Var2.p(-2, fga0Var.A);
            cne0Var2.r(str, null);
        }
        String l2 = ((cne0) i3yVar.getValue()).l("scooters_no_feature", null);
        if (l2 != null) {
            try {
                return vez0.c0((lv90) ((xnt) wntVar).c(l2, lv90.Companion.serializer()), null);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
