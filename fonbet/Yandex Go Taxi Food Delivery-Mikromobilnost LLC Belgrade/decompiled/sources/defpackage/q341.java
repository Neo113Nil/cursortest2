package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class q341 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public q341(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q341)) {
            return false;
        }
        q341 q341Var = (q341) obj;
        return jl40.l(this.a, q341Var.a) && jl40.l(this.b, q341Var.b) && jl40.l(this.c, q341Var.c) && this.d == q341Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("WalkNavLocalOrder(id=", this.a, ", title=", this.b, ", subtitle=");
        v.append(this.c);
        v.append(", sideIconResId=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
