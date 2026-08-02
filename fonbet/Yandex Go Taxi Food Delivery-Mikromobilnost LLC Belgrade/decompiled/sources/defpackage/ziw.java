package defpackage;

/* loaded from: classes14.dex */
public final class ziw {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ziw(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ziw)) {
            return false;
        }
        ziw ziwVar = (ziw) obj;
        return jl40.l(this.a, ziwVar.a) && jl40.l(this.b, ziwVar.b) && jl40.l(this.c, ziwVar.c) && jl40.l(this.d, ziwVar.d) && jl40.l(this.e, ziwVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
