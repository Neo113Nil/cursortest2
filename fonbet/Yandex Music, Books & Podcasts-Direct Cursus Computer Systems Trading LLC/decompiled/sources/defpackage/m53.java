package defpackage;

/* loaded from: classes3.dex */
public final class m53 implements o53 {
    public final boolean a;

    public m53(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m53) && this.a == ((m53) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Loading(isChangeStorageAvailable=", ")", this.a);
    }
}
