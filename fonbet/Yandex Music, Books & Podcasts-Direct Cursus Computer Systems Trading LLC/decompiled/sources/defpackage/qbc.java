package defpackage;

/* loaded from: classes3.dex */
public final class qbc extends vbc {
    public final boolean a;

    public qbc(boolean z) {
        this.a = z;
    }

    @Override // defpackage.vbc
    public final String a() {
        return "episodes";
    }

    @Override // defpackage.vbc
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qbc) && this.a == ((qbc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("EpisodesSort(isSelected=", ")", this.a);
    }
}
