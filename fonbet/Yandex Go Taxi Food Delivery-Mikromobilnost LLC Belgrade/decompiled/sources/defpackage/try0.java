package defpackage;

/* loaded from: classes.dex */
public final class try0 {
    public static final try0 c = new try0(2, false);
    public static final try0 d = new try0(1, true);
    public final int a;
    public final boolean b;

    public try0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof try0)) {
            return false;
        }
        try0 try0Var = (try0) obj;
        return sry0.a(this.a, try0Var.a) && this.b == try0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (sry0.b(this.a) * 31);
    }

    public final String toString() {
        return equals(c) ? "TextMotion.Static" : equals(d) ? "TextMotion.Animated" : "Invalid";
    }
}
