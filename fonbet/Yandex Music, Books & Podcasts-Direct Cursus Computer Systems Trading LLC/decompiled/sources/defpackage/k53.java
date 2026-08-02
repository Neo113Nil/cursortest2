package defpackage;

/* loaded from: classes3.dex */
public final class k53 implements l53 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public k53(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    @Override // defpackage.l53
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.l53
    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k53)) {
            return false;
        }
        k53 k53Var = (k53) obj;
        return this.a == k53Var.a && this.b == k53Var.b && this.c == k53Var.c && this.d == k53Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.e(k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return v3w.g(eta.j("Success(isShowKidsTab=", this.a, ", isOnlyKidsContent=", this.b, ", isEnableSettingOnlyKidsContent="), this.c, ", isEnableSettingSwitchKidsTabVisibility=", this.d, ")");
    }
}
