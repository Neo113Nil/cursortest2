package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class v1v0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public v1v0(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public static v1v0 a(v1v0 v1v0Var, boolean z, boolean z2, boolean z3, int i) {
        String str = v1v0Var.a;
        String str2 = v1v0Var.b;
        if ((i & 16) != 0) {
            z3 = v1v0Var.e;
        }
        v1v0Var.getClass();
        return new v1v0(str, str2, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1v0)) {
            return false;
        }
        v1v0 v1v0Var = (v1v0) obj;
        return jl40.l(this.a, v1v0Var.a) && jl40.l(this.b, v1v0Var.b) && this.c == v1v0Var.c && this.d == v1v0Var.d && this.e == v1v0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("SubscriptionWidgetEntity(title=", this.a, ", description=", this.b, ", checked=");
        nnm.v(", switching=", ", enabled=", v, this.c, this.d);
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }

    public /* synthetic */ v1v0(String str, String str2) {
        this(str, str2, false, false, true);
    }
}
