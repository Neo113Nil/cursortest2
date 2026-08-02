package defpackage;

/* loaded from: classes3.dex */
public final class mbc extends vbc {
    public final boolean a;

    public mbc(boolean z) {
        this.a = z;
    }

    @Override // defpackage.vbc
    public final String a() {
        return "create_date";
    }

    @Override // defpackage.vbc
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mbc) && this.a == ((mbc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("CreateDateSort(isSelected=", ")", this.a);
    }
}
