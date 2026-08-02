package defpackage;

/* loaded from: classes3.dex */
public final class sbc extends vbc {
    public final boolean a;

    public sbc(boolean z) {
        this.a = z;
    }

    @Override // defpackage.vbc
    public final String a() {
        return "recently_updated";
    }

    @Override // defpackage.vbc
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sbc) && this.a == ((sbc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("RecentlyUpdatedSort(isSelected=", ")", this.a);
    }
}
