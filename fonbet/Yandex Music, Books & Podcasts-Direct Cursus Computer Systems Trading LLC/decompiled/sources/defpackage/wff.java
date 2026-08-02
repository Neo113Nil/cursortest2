package defpackage;

/* loaded from: classes3.dex */
public final class wff {
    public final String a;
    public final String b;
    public final String c;

    public wff(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wff)) {
            return false;
        }
        wff wffVar = (wff) obj;
        return this.a.equals(wffVar.a) && this.b.equals(wffVar.b) && this.c.equals(wffVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return su4.o(f1d.m("KidsTabVisibilityBlockUiState(title=", this.a, ", description=", this.b, ", imageUrl="), this.c, ")");
    }
}
