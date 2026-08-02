package defpackage;

/* loaded from: classes.dex */
public final class lds {
    public static final lds c = new lds(2, false);
    public static final lds d = new lds(1, true);
    public final int a;
    public final boolean b;

    public lds(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lds)) {
            return false;
        }
        lds ldsVar = (lds) obj;
        return this.a == ldsVar.a && this.b == ldsVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return equals(c) ? "TextMotion.Static" : equals(d) ? "TextMotion.Animated" : "Invalid";
    }
}
