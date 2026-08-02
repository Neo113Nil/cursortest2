package defpackage;

/* loaded from: classes4.dex */
public final class igt extends iht {
    public final int a;
    public final boolean b;

    public igt(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igt)) {
            return false;
        }
        igt igtVar = (igt) obj;
        return this.a == igtVar.a && this.b == igtVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Placeholder(countTracks=" + this.a + ", isLoading=" + this.b + ")";
    }
}
