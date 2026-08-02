package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class zs51 extends bt51 {
    public final CharSequence a;
    public final String b;
    public final tv51 c;

    public zs51(CharSequence charSequence, String str, tv51 tv51Var) {
        this.a = charSequence;
        this.b = str;
        this.c = tv51Var;
    }

    @Override // defpackage.bt51
    public final String a() {
        return this.b;
    }

    @Override // defpackage.bt51
    public final CharSequence b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs51)) {
            return false;
        }
        zs51 zs51Var = (zs51) obj;
        return jl40.l(this.a, zs51Var.a) && jl40.l(this.b, zs51Var.b) && jl40.l(this.c, zs51Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "SimpleAction(title=" + ((Object) this.a) + ", contentDescription=" + this.b + ", ybSdkAction=" + this.c + Extension.C_BRAKE;
    }
}
