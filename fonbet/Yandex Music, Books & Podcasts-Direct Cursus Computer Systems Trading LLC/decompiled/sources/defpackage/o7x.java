package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class o7x implements Serializable {
    public static final o7x c = new o7x(p5x.c, p5x.b);
    public final p5x a;
    public final p5x b;

    public o7x(p5x p5xVar, p5x p5xVar2) {
        this.a = p5xVar;
        this.b = p5xVar2;
        if (p5xVar.a(p5xVar2) > 0 || p5xVar == p5x.b || p5xVar2 == p5x.c) {
            StringBuilder sb = new StringBuilder(16);
            p5xVar.b(sb);
            sb.append("..");
            p5xVar2.c(sb);
            xq0.x("Invalid range: ".concat(sb.toString()));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o7x)) {
            return false;
        }
        o7x o7xVar = (o7x) obj;
        return this.a.equals(o7xVar.a) && this.b.equals(o7xVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.a.b(sb);
        sb.append("..");
        this.b.c(sb);
        return sb.toString();
    }
}
