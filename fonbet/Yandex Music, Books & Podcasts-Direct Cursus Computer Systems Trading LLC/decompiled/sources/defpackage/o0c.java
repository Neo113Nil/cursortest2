package defpackage;

/* loaded from: classes4.dex */
public final class o0c {
    public final String a;
    public final String b;
    public final String c;

    public o0c(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0c)) {
            return false;
        }
        o0c o0cVar = (o0c) obj;
        return this.a.equals(o0cVar.a) && this.b.equals(o0cVar.b) && this.c.equals(o0cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return su4.o(f1d.m("ExtendedTextSlideContentUiData(title=", this.a, ", subtitle=", this.b, ", description="), this.c, ")");
    }
}
