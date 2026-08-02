package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class sje {
    public final int a;
    public final boolean b;
    public final float c;
    public final weo d;
    public final float e;

    public sje(int i, boolean z, float f, weo weoVar, float f2) {
        this.a = i;
        this.b = z;
        this.c = f;
        this.d = weoVar;
        this.e = f2;
    }

    public static sje a(sje sjeVar, float f, weo weoVar, float f2, int i) {
        int i2 = sjeVar.a;
        boolean z = sjeVar.b;
        if ((i & 4) != 0) {
            f = sjeVar.c;
        }
        float f3 = f;
        if ((i & 8) != 0) {
            weoVar = sjeVar.d;
        }
        weo weoVar2 = weoVar;
        if ((i & 16) != 0) {
            f2 = sjeVar.e;
        }
        return new sje(i2, z, f3, weoVar2, f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sje)) {
            return false;
        }
        sje sjeVar = (sje) obj;
        return this.a == sjeVar.a && this.b == sjeVar.b && Float.compare(this.c, sjeVar.c) == 0 && Intrinsics.d(this.d, sjeVar.d) && Float.compare(this.e, sjeVar.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + ((this.d.hashCode() + eta.a(k5r.e(Integer.hashCode(this.a) * 31, 31, this.b), this.c, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Indicator(position=");
        sb.append(this.a);
        sb.append(", active=");
        sb.append(this.b);
        sb.append(", centerOffset=");
        sb.append(this.c);
        sb.append(", itemSize=");
        sb.append(this.d);
        sb.append(", scaleFactor=");
        return ouj.p(sb, this.e, ')');
    }
}
