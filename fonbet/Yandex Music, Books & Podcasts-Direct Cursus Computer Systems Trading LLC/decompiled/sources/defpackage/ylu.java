package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ylu {
    public final long a;
    public final ai3 b;
    public final long c;
    public final long d;
    public final long e;

    public ylu(long j, ai3 ai3Var, long j2, long j3, long j4) {
        ai3Var.getClass();
        this.a = j;
        this.b = ai3Var;
        this.c = j2;
        this.d = j3;
        this.e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylu)) {
            return false;
        }
        ylu yluVar = (ylu) obj;
        return d85.c(this.a, yluVar.a) && Intrinsics.d(this.b, yluVar.b) && d85.c(this.c, yluVar.c) && d85.c(this.d, yluVar.d) && d85.c(this.e, yluVar.e);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.e) + tlm.c(this.d, tlm.c(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        String i = d85.i(this.a);
        String i2 = d85.i(this.c);
        String i3 = d85.i(this.d);
        String i4 = d85.i(this.e);
        StringBuilder sb = new StringBuilder("WaveAnimatedColors(bgTint=");
        sb.append(i);
        sb.append(", gradient=");
        sb.append(this.b);
        sb.append(", primaryPaletteColor=");
        su4.v(sb, i2, ", secondaryPaletteColor=", i3, ", wordsButtonTint=");
        return su4.o(sb, i4, ")");
    }
}
