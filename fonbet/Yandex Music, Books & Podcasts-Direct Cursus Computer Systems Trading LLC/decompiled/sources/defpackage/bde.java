package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bde {
    public static int k;
    public static final mvn l = new mvn(25);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final mzt f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public bde(String str, float f, float f2, float f3, float f4, mzt mztVar, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = mztVar;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bde)) {
            return false;
        }
        bde bdeVar = (bde) obj;
        return Intrinsics.d(this.a, bdeVar.a) && cma.a(this.b, bdeVar.b) && cma.a(this.c, bdeVar.c) && this.d == bdeVar.d && this.e == bdeVar.e && this.f.equals(bdeVar.f) && d85.c(this.g, bdeVar.g) && this.h == bdeVar.h && this.i == bdeVar.i;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + eta.a(eta.a(eta.a(eta.a(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31)) * 31;
        int i = d85.o;
        met metVar = net.b;
        return Boolean.hashCode(this.i) + f1d.a(this.h, tlm.c(this.g, hashCode, 31), 31);
    }
}
