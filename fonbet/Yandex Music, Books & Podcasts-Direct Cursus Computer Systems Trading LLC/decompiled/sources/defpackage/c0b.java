package defpackage;

/* loaded from: classes4.dex */
public final class c0b implements d0b {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public c0b(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // defpackage.d0b
    public final boolean a() {
        return this.c;
    }

    @Override // defpackage.d0b
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.d0b
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0b)) {
            return false;
        }
        c0b c0bVar = (c0b) obj;
        return this.a == c0bVar.a && this.b == c0bVar.b && this.c == c0bVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return ouj.r(eta.j("Enabled(bottomSheetMain=", this.a, ", bottomSheetClip=", this.b, ", kidsBlock="), this.c, ")");
    }
}
