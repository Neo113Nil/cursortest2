package defpackage;

import com.yandex.go.navigator.order.NavigationOrder$NavigationType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class s850 {
    public final String a;
    public final String b;
    public final String c;
    public final NavigationOrder$NavigationType d;
    public final int e;
    public final int f;

    public s850(String str, String str2, String str3, NavigationOrder$NavigationType navigationOrder$NavigationType, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = navigationOrder$NavigationType;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s850)) {
            return false;
        }
        s850 s850Var = (s850) obj;
        return jl40.l(this.a, s850Var.a) && jl40.l(this.b, s850Var.b) && jl40.l(this.c, s850Var.c) && this.d == s850Var.d && this.e == s850Var.e && this.f == s850Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + oyr.b(this.e, (this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("NavigationOrder(id=", this.a, ", title=", this.b, ", subtitle=");
        v.append(this.c);
        v.append(", navigationType=");
        v.append(this.d);
        v.append(", sideIconResId=");
        return ly3.k(this.e, this.f, ", invertedSideIconResId=", Extension.C_BRAKE, v);
    }
}
