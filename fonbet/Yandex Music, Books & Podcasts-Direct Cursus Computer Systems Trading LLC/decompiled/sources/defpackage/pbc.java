package defpackage;

/* loaded from: classes3.dex */
public final class pbc extends vbc {
    public final boolean a;

    public pbc(boolean z) {
        this.a = z;
    }

    @Override // defpackage.vbc
    public final String a() {
        return "downloaded_date";
    }

    @Override // defpackage.vbc
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pbc) && this.a == ((pbc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("DownloadedDateSort(isSelected=", ")", this.a);
    }
}
