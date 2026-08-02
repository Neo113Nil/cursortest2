package defpackage;

/* loaded from: classes3.dex */
public final class nyl {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public nyl(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyl)) {
            return false;
        }
        nyl nylVar = (nyl) obj;
        return this.a == nylVar.a && this.b == nylVar.b && this.c == nylVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return ouj.r(eta.j("PlaylistScreenEntityInfo(isOwned=", this.a, ", isDefault=", this.b, ", isPublic="), this.c, ")");
    }
}
