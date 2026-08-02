package defpackage;

/* loaded from: classes3.dex */
public final class tbc extends vbc {
    public final boolean a;

    public tbc(boolean z) {
        this.a = z;
    }

    @Override // defpackage.vbc
    public final String a() {
        return "release_date";
    }

    @Override // defpackage.vbc
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tbc) && this.a == ((tbc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("ReleaseDateSort(isSelected=", ")", this.a);
    }
}
