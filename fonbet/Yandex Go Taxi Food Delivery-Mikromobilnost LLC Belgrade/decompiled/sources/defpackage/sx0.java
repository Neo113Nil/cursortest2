package defpackage;

import androidx.lifecycle.o;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes5.dex */
public final class sx0 {
    public final String a;
    public final RoutePointType b;
    public final o c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final hbp0 h;
    public final boolean i;

    public sx0(String str, RoutePointType routePointType, o oVar, boolean z, boolean z2, boolean z3, String str2, hbp0 hbp0Var, boolean z4) {
        this.a = str;
        this.b = routePointType;
        this.c = oVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str2;
        this.h = hbp0Var;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx0)) {
            return false;
        }
        sx0 sx0Var = (sx0) obj;
        return jl40.l(this.a, sx0Var.a) && this.b == sx0Var.b && jl40.l(this.c, sx0Var.c) && this.d == sx0Var.d && this.e == sx0Var.e && this.f == sx0Var.f && jl40.l(this.g, sx0Var.g) && jl40.l(this.h, sx0Var.h) && this.i == sx0Var.i;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + unr0.b(unr0.e(unr0.e(unr0.e((this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddressMapFragmentAddressControllerConfig(forcedCurrentMode=");
        sb.append(this.a);
        sb.append(", pointType=");
        sb.append(this.b);
        sb.append(", lifecycleScope=");
        sb.append(this.c);
        sb.append(", isClarifyMode=");
        sb.append(this.d);
        sb.append(", shouldCacheAddressByLocationTap=");
        nnm.v(", needUpdatePositionOnResume=", ", businessName=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", decodePointScopeDelegate=");
        sb.append(this.h);
        sb.append(", reactOnUnsupportedAddress=");
        return x4e.i(sb, this.i, Extension.C_BRAKE);
    }
}
