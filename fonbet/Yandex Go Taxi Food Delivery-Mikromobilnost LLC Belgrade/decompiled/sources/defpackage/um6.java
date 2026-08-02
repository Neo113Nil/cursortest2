package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class um6 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public um6(String str, int i, String str2, String str3, boolean z) {
        boolean z2 = (i & 32) != 0;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um6)) {
            return false;
        }
        um6 um6Var = (um6) obj;
        return this.a.equals(um6Var.a) && jl40.l(this.b, um6Var.b) && jl40.l(this.c, um6Var.c) && this.d == um6Var.d && this.e == um6Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 961, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("BubbleGridContent(name=", this.a, ", id=", this.b, ", label=");
        tse0.y(this.c, ", isSelected=", ", imageTag=, isVisible=", v, this.d);
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}
