package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import kotlin.collections.a;

/* loaded from: classes6.dex */
public final class u380 {
    public final iu6 a;
    public final wiq0 b;

    public u380(iu6 iu6Var, wiq0 wiq0Var) {
        this.a = iu6Var;
        this.b = wiq0Var;
    }

    public final ntv a(cu6 cu6Var) {
        is60 is60Var;
        n8e0 n8e0Var = cu6Var.a;
        String str = n8e0Var.a;
        int i = n8e0Var.g;
        iu6 iu6Var = this.a;
        iu6Var.getClass();
        int i2 = iu6Var.a.i("bullets_order_popup_show_count" + str, 0);
        k kVar = (k) this.b;
        pex0 m = kVar.m();
        String a = (m == null || (is60Var = m.J0.b) == null) ? null : is60Var.a();
        pex0 m2 = kVar.m();
        String str2 = m2 != null ? m2.b : null;
        String str3 = n8e0Var.b;
        boolean z = !n8e0Var.f.isEmpty();
        pex0 m3 = kVar.m();
        return new ntv(str, i, i2, a, str2, str3, z, n8e0Var.d.length() > 0, m3 != null ? m3.u : false, ((i8e0) a.P(n8e0Var.i)).b());
    }
}
