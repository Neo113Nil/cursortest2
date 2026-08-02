package defpackage;

/* loaded from: classes.dex */
public final class wfk extends xfk {
    public final int a;

    public wfk(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wfk) && this.a == ((wfk) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("Solid(color="), this.a, ')');
    }
}
