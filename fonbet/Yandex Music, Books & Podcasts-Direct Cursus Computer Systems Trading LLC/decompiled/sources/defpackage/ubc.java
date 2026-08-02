package defpackage;

/* loaded from: classes3.dex */
public final class ubc extends vbc {
    public final boolean a;

    public ubc(boolean z) {
        this.a = z;
    }

    @Override // defpackage.vbc
    public final String a() {
        return "songs";
    }

    @Override // defpackage.vbc
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ubc) && this.a == ((ubc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("SongsSort(isSelected=", ")", this.a);
    }
}
