package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class p5x implements Comparable, Serializable {
    public static final p5x b = new p5x(0);
    public static final p5x c = new p5x(1);
    public final /* synthetic */ int a;

    public /* synthetic */ p5x(int i) {
        this.a = i;
    }

    public final int a(p5x p5xVar) {
        switch (this.a) {
            case 0:
                return p5xVar == this ? 0 : 1;
            default:
                return p5xVar == this ? 0 : -1;
        }
    }

    public final void b(StringBuilder sb) {
        switch (this.a) {
            case 0:
                throw new AssertionError();
            default:
                sb.append("(-∞");
                return;
        }
    }

    public final void c(StringBuilder sb) {
        switch (this.a) {
            case 0:
                sb.append("+∞)");
                return;
            default:
                throw new AssertionError();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        switch (this.a) {
            case 0:
                return ((p5x) obj) == this ? 0 : 1;
            default:
                return ((p5x) obj) == this ? 0 : -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p5x) {
            try {
                if (a((p5x) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return System.identityHashCode(this);
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "+∞";
            default:
                return "-∞";
        }
    }
}
