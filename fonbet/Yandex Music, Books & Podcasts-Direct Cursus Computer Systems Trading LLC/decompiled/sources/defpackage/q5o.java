package defpackage;

import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class q5o {

    @NotNull
    public static final p5o Companion = new p5o();
    public final double a;
    public final double b;
    public final double c;

    public /* synthetic */ q5o(int i, double d, double d2, double d3) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, o5o.a.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5o)) {
            return false;
        }
        q5o q5oVar = (q5o) obj;
        return Double.compare(this.a, q5oVar.a) == 0 && Double.compare(this.b, q5oVar.b) == 0 && Double.compare(this.c, q5oVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + k5r.b(this.b, Double.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Coordinates(latitude=");
        sb.append(this.a);
        sb.append(", longitude=");
        sb.append(this.b);
        sb.append(", accuracy=");
        return k5r.n(sb, this.c, ')');
    }
}
