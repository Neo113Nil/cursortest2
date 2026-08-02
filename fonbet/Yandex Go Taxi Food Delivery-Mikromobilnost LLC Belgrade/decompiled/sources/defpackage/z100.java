package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;

/* loaded from: classes6.dex */
public final class z100 extends v96 {
    public final h3y a;
    public final wiq0 b;

    public z100(h3y h3yVar, wiq0 wiq0Var) {
        this.a = h3yVar;
        this.b = wiq0Var;
    }

    @Override // defpackage.v96
    public final boolean b() {
        String str;
        pex0 m = ((k) this.b).m();
        if (m == null || (str = m.G) == null) {
            return false;
        }
        int hashCode = str.hashCode();
        if (hashCode == -1442054172) {
            if (!str.equals("maas_payment_method_unavailable")) {
                return false;
            }
            ((d770) this.a.get()).a();
            return true;
        }
        if (hashCode != -114350713) {
            if (hashCode != 394480673 || !str.equals("maas_route_unavailable")) {
                return false;
            }
        } else if (!str.equals("maas_subscription_unavailable")) {
            return false;
        }
        return true;
    }
}
