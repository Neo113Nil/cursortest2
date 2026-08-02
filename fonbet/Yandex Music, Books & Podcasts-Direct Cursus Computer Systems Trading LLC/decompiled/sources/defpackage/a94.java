package defpackage;

/* loaded from: classes4.dex */
public final class a94 implements z84 {
    public final boolean a;

    public a94(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a94) && this.a == ((a94) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("ChromecastOnly(isCasting=", ")", this.a);
    }
}
