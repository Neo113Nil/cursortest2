package defpackage;

/* loaded from: classes4.dex */
public final class mjq extends ojq {
    public final boolean a;
    public final boolean b;

    public mjq(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjq)) {
            return false;
        }
        mjq mjqVar = (mjq) obj;
        return this.a == mjqVar.a && this.b == mjqVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.t("Placeholder(isLoading=", this.a, ", withCover=", this.b, ")");
    }
}
