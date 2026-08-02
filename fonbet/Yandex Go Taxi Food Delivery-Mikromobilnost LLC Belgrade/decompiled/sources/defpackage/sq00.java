package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class sq00 {
    public final p0c0 a;
    public final f0c0 b;
    public final boolean c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final rq00 j;
    public final Integer k;
    public final float l;

    public /* synthetic */ sq00(p0c0 p0c0Var, f0c0 f0c0Var, boolean z, Integer num, String str, String str2, String str3, boolean z2, boolean z3, rq00 rq00Var, Integer num2, float f, int i) {
        this((i & 1) != 0 ? null : p0c0Var, (i & 2) != 0 ? null : f0c0Var, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str, (i & 32) != 0 ? "" : str2, (i & 64) == 0 ? str3 : "", (i & 128) != 0 ? false : z2, (i & 256) == 0 ? z3 : false, (i & 512) != 0 ? null : rq00Var, (i & 2048) == 0 ? num2 : null, (i & 4096) != 0 ? 1.0f : f);
    }

    public static sq00 a(sq00 sq00Var, p0c0 p0c0Var, f0c0 f0c0Var, String str, int i) {
        if ((i & 1) != 0) {
            p0c0Var = sq00Var.a;
        }
        p0c0 p0c0Var2 = p0c0Var;
        f0c0 f0c0Var2 = (i & 2) != 0 ? sq00Var.b : f0c0Var;
        boolean z = sq00Var.c;
        Integer num = sq00Var.d;
        String str2 = (i & 16) != 0 ? sq00Var.e : str;
        String str3 = sq00Var.f;
        String str4 = sq00Var.g;
        boolean z2 = sq00Var.h;
        boolean z3 = sq00Var.i;
        rq00 rq00Var = sq00Var.j;
        sq00Var.getClass();
        Integer num2 = sq00Var.k;
        float f = sq00Var.l;
        sq00Var.getClass();
        return new sq00(p0c0Var2, f0c0Var2, z, num, str2, str3, str4, z2, z3, rq00Var, num2, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq00)) {
            return false;
        }
        sq00 sq00Var = (sq00) obj;
        return jl40.l(this.a, sq00Var.a) && jl40.l(this.b, sq00Var.b) && this.c == sq00Var.c && jl40.l(this.d, sq00Var.d) && jl40.l(this.e, sq00Var.e) && jl40.l(this.f, sq00Var.f) && jl40.l(this.g, sq00Var.g) && this.h == sq00Var.h && this.i == sq00Var.i && jl40.l(this.j, sq00Var.j) && jl40.l(this.k, sq00Var.k) && Float.compare(this.l, sq00Var.l) == 0;
    }

    public final int hashCode() {
        p0c0 p0c0Var = this.a;
        int hashCode = (p0c0Var == null ? 0 : p0c0Var.hashCode()) * 31;
        f0c0 f0c0Var = this.b;
        int e = unr0.e((hashCode + (f0c0Var == null ? 0 : f0c0Var.hashCode())) * 31, 31, this.c);
        Integer num = this.d;
        int hashCode2 = (e + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        int e2 = unr0.e(unr0.e(unr0.b(unr0.b((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        rq00 rq00Var = this.j;
        int hashCode3 = (e2 + (rq00Var == null ? 0 : rq00Var.hashCode())) * 961;
        Integer num2 = this.k;
        return Float.hashCode(this.l) + ((hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapPinInfo(style=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", anchored=");
        sb.append(this.c);
        sb.append(", eta=");
        sb.append(this.d);
        sb.append(", iconTag=");
        g8e.D(sb, this.e, ", text=", this.f, ", hint=");
        tse0.y(this.g, ", textWithChevron=", ", shouldSwapTexts=", sb, this.h);
        sb.append(this.i);
        sb.append(", buttonsTrail=");
        sb.append(this.j);
        sb.append(", contentColorState=null, outerBgColor=");
        sb.append(this.k);
        sb.append(", iconScale=");
        sb.append(this.l);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public sq00(p0c0 p0c0Var, f0c0 f0c0Var, boolean z, Integer num, String str, String str2, String str3, boolean z2, boolean z3, rq00 rq00Var, Integer num2, float f) {
        this.a = p0c0Var;
        this.b = f0c0Var;
        this.c = z;
        this.d = num;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = z2;
        this.i = z3;
        this.j = rq00Var;
        this.k = num2;
        this.l = f;
    }

    public sq00() {
        this(null, null, false, null, null, null, null, false, false, null, null, 0.0f, 8191);
    }
}
