package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class tgd extends vgd {
    public final ygd a;
    public final double b;
    public final String c;
    public final lfd d;

    public tgd(ygd ygdVar, double d, String str) {
        str.getClass();
        this.a = ygdVar;
        this.b = d;
        this.c = str;
        this.d = new lfd(kfd.TRACK, ygdVar.a, ygdVar, Double.valueOf(d), str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgd)) {
            return false;
        }
        tgd tgdVar = (tgd) obj;
        return this.a.equals(tgdVar.a) && Double.compare(this.b, tgdVar.b) == 0 && Intrinsics.d(this.c, tgdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.a.a;
        StringBuilder sb = new StringBuilder("Track(id=");
        sb.append(str);
        sb.append(", progress=");
        sb.append(this.b);
        return vz1.s(sb, "s, from=", this.c, ")");
    }
}
