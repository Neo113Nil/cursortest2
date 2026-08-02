package defpackage;

/* loaded from: classes3.dex */
public final class j53 implements l53 {
    public final boolean a;
    public final boolean b;

    public j53(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.l53
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.l53
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j53)) {
            return false;
        }
        j53 j53Var = (j53) obj;
        return this.a == j53Var.a && this.b == j53Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.t("Loading(isEnableSettingOnlyKidsContent=", this.a, ", isEnableSettingSwitchKidsTabVisibility=", this.b, ")");
    }
}
