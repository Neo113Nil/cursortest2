package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class fnh {
    public static final fnh f = new fnh(new dnh());
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        int i2 = dvt.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
    }

    public fnh(dnh dnhVar) {
        long j2 = dnhVar.a;
        long j3 = dnhVar.b;
        long j4 = dnhVar.c;
        float f2 = dnhVar.d;
        float f3 = dnhVar.e;
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = f2;
        this.e = f3;
    }

    public static fnh b(Bundle bundle) {
        dnh dnhVar = new dnh();
        fnh fnhVar = f;
        dnhVar.a = bundle.getLong(g, fnhVar.a);
        dnhVar.b = bundle.getLong(h, fnhVar.b);
        dnhVar.c = bundle.getLong(i, fnhVar.c);
        dnhVar.d = bundle.getFloat(j, fnhVar.d);
        dnhVar.e = bundle.getFloat(k, fnhVar.e);
        return new fnh(dnhVar);
    }

    public final dnh a() {
        dnh dnhVar = new dnh();
        dnhVar.a = this.a;
        dnhVar.b = this.b;
        dnhVar.c = this.c;
        dnhVar.d = this.d;
        dnhVar.e = this.e;
        return dnhVar;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        fnh fnhVar = f;
        long j2 = fnhVar.a;
        long j3 = this.a;
        if (j3 != j2) {
            bundle.putLong(g, j3);
        }
        long j4 = fnhVar.b;
        long j5 = this.b;
        if (j5 != j4) {
            bundle.putLong(h, j5);
        }
        long j6 = fnhVar.c;
        long j7 = this.c;
        if (j7 != j6) {
            bundle.putLong(i, j7);
        }
        float f2 = fnhVar.d;
        float f3 = this.d;
        if (f3 != f2) {
            bundle.putFloat(j, f3);
        }
        float f4 = fnhVar.e;
        float f5 = this.e;
        if (f5 != f4) {
            bundle.putFloat(k, f5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnh)) {
            return false;
        }
        fnh fnhVar = (fnh) obj;
        return this.a == fnhVar.a && this.b == fnhVar.b && this.c == fnhVar.c && this.d == fnhVar.d && this.e == fnhVar.e;
    }

    public final int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.c;
        int i3 = (i2 + ((int) ((j4 >>> 32) ^ j4))) * 31;
        float f2 = this.d;
        int floatToIntBits = (i3 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.e;
        return floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }
}
