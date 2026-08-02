package defpackage;

/* loaded from: classes3.dex */
public final class kbc extends vbc {
    public final boolean a;

    public kbc(boolean z) {
        this.a = z;
    }

    @Override // defpackage.vbc
    public final String a() {
        return "alphabet";
    }

    @Override // defpackage.vbc
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kbc) && this.a == ((kbc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("AlphabetSort(isSelected=", ")", this.a);
    }
}
