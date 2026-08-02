package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ymk {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final Float e;

    public ymk(long j, long j2, long j3, long j4, Float f) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymk)) {
            return false;
        }
        ymk ymkVar = (ymk) obj;
        return d85.c(this.a, ymkVar.a) && d85.c(this.b, ymkVar.b) && d85.c(this.c, ymkVar.c) && d85.c(this.d, ymkVar.d) && Intrinsics.d(this.e, ymkVar.e);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        int c = tlm.c(this.d, tlm.c(this.c, tlm.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
        Float f = this.e;
        return c + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        String i = d85.i(this.a);
        String i2 = d85.i(this.b);
        String i3 = d85.i(this.c);
        String i4 = d85.i(this.d);
        StringBuilder m = f1d.m("PersonalWaveColorPalette(backgroundColor=", i, ", coverBackgroundColor=", i2, ", trailerIconBackgroundColor=");
        su4.v(m, i3, ", playlistBackgroundColor=", i4, ", rawHue=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }
}
