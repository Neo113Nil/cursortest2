package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qtd {
    public static final qtd f = new qtd(d85.n, c5b.a, Float.NaN, -1.0f, std.d);
    public final long a;
    public final List b;
    public final float c;
    public final float d;
    public final std e;

    public qtd(long j, List list, float f2, float f3, std stdVar) {
        list.getClass();
        stdVar.getClass();
        this.a = j;
        this.b = list;
        this.c = f2;
        this.d = f3;
        this.e = stdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtd)) {
            return false;
        }
        qtd qtdVar = (qtd) obj;
        return d85.c(this.a, qtdVar.a) && Intrinsics.d(this.b, qtdVar.b) && cma.a(this.c, qtdVar.c) && Float.compare(this.d, qtdVar.d) == 0 && Intrinsics.d(this.e, qtdVar.e);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return this.e.hashCode() + eta.a(eta.a(k5r.d(Long.hashCode(this.a) * 31, 31, this.b), this.c, 31), this.d, 31);
    }

    public final String toString() {
        String i = d85.i(this.a);
        String b = cma.b(this.c);
        StringBuilder v = ouj.v("HazeStyle(backgroundColor=", i, ", tints=", ", blurRadius=", this.b);
        v.append(b);
        v.append(", noiseFactor=");
        v.append(this.d);
        v.append(", fallbackTint=");
        v.append(this.e);
        v.append(")");
        return v.toString();
    }
}
