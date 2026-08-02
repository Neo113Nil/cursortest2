package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class wp31 {
    public final boolean a;
    public final float b;
    public final int c;
    public final Float d;
    public final List e;
    public final String f;
    public final String g;

    public wp31(boolean z, float f, int i, Float f2, List list, String str, String str2) {
        this.a = z;
        this.b = f;
        this.c = i;
        this.d = f2;
        this.e = list;
        this.f = str;
        this.g = str2;
    }

    public static wp31 a(wp31 wp31Var) {
        boolean z = wp31Var.a;
        float f = wp31Var.b;
        Float f2 = wp31Var.d;
        List list = wp31Var.e;
        String str = wp31Var.f;
        String str2 = wp31Var.g;
        wp31Var.getClass();
        return new wp31(z, f, Integer.MAX_VALUE, f2, list, str, str2);
    }

    public final String b() {
        return this.g;
    }

    public final List c() {
        return this.e;
    }

    public final boolean d() {
        return this.a;
    }

    public final Float e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp31)) {
            return false;
        }
        wp31 wp31Var = (wp31) obj;
        return this.a == wp31Var.a && Float.compare(this.b, wp31Var.b) == 0 && this.c == wp31Var.c && jl40.l(this.d, wp31Var.d) && this.e.equals(wp31Var.e) && jl40.l(this.f, wp31Var.f) && jl40.l(this.g, wp31Var.g);
    }

    public final int f() {
        return this.c;
    }

    public final String g() {
        return this.f;
    }

    public final int hashCode() {
        int b = oyr.b(this.c, g8e.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
        Float f = this.d;
        int c = unr0.c((b + (f == null ? 0 : f.hashCode())) * 31, 31, this.e);
        String str = this.f;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewConfig(gravity=");
        sb.append(this.a);
        sb.append(", gravityScale=");
        sb.append(this.b);
        sb.append(", viewPriorityWeight=");
        sb.append(this.c);
        sb.append(", simplifiedZoom=");
        sb.append(this.d);
        sb.append(", blockDirectPixelShowUrls=");
        oyr.D(", yclid=", this.f, ", bannerId=", sb, this.e);
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
