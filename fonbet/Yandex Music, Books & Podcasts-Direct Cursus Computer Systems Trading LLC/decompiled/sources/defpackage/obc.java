package defpackage;

/* loaded from: classes3.dex */
public final class obc extends vbc {
    public final boolean a;

    public obc(boolean z) {
        this.a = z;
    }

    @Override // defpackage.vbc
    public final String a() {
        return "default";
    }

    @Override // defpackage.vbc
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof obc) && this.a == ((obc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("DefaultSort(isSelected=", ")", this.a);
    }
}
