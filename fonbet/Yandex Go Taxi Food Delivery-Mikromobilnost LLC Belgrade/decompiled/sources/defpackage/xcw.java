package defpackage;

/* loaded from: classes14.dex */
public final class xcw {
    public final String a;
    public final String b;
    public final String c;

    public xcw(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcw)) {
            return false;
        }
        xcw xcwVar = (xcw) obj;
        return jl40.l(this.a, xcwVar.a) && this.b.equals(xcwVar.b) && jl40.l(this.c, xcwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }
}
