package defpackage;

/* loaded from: classes6.dex */
public final class lcr {
    public final int a;

    public /* synthetic */ lcr(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lcr) {
            return this.a == ((lcr) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return hrg.o("StartQuality(height=", this.a, ')');
    }
}
