package defpackage;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class q9y0 implements t9y0 {
    public final o2y0 a;
    public final OrderScreen b;
    public final tls c;

    public q9y0(o2y0 o2y0Var, OrderScreen orderScreen, tls tlsVar) {
        this.a = o2y0Var;
        this.b = orderScreen;
        this.c = tlsVar;
    }

    @Override // defpackage.t9y0
    public final o2y0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9y0)) {
            return false;
        }
        q9y0 q9y0Var = (q9y0) obj;
        return jl40.l(this.a, q9y0Var.a) && this.b == q9y0Var.b && this.c.equals(q9y0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Compact(orderHolder=" + this.a + ", sourceScreen=" + this.b + ", viewProvider=" + this.c + Extension.C_BRAKE;
    }
}
