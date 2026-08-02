package defpackage;

import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class r9y0 implements t9y0 {
    public final o2y0 a;
    public final TaxiCardNavigationAction b;

    public r9y0(o2y0 o2y0Var, TaxiCardNavigationAction taxiCardNavigationAction) {
        this.a = o2y0Var;
        this.b = taxiCardNavigationAction;
    }

    @Override // defpackage.t9y0
    public final o2y0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9y0)) {
            return false;
        }
        r9y0 r9y0Var = (r9y0) obj;
        return jl40.l(this.a, r9y0Var.a) && this.b == r9y0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Details(orderHolder=" + this.a + ", navigationAction=" + this.b + Extension.C_BRAKE;
    }
}
