package defpackage;

/* loaded from: classes.dex */
public final class dds {
    public final cds a;
    public wof b = null;
    public wof c;

    public dds(cds cdsVar, wof wofVar) {
        this.a = cdsVar;
        this.c = wofVar;
    }

    public final long a(long j) {
        ynn ynnVar;
        wof wofVar = this.b;
        ynn ynnVar2 = ynn.e;
        if (wofVar != null) {
            if (wofVar.d()) {
                wof wofVar2 = this.c;
                ynnVar = wofVar2 != null ? wofVar2.y(wofVar, true) : null;
            } else {
                ynnVar = ynnVar2;
            }
            if (ynnVar != null) {
                ynnVar2 = ynnVar;
            }
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float f = ynnVar2.a;
        if (intBitsToFloat >= f) {
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            f = ynnVar2.c;
            if (intBitsToFloat2 <= f) {
                f = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat3 = Float.intBitsToFloat(i2);
        float f2 = ynnVar2.b;
        if (intBitsToFloat3 >= f2) {
            float intBitsToFloat4 = Float.intBitsToFloat(i2);
            f2 = ynnVar2.d;
            if (intBitsToFloat4 <= f2) {
                f2 = Float.intBitsToFloat(i2);
            }
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.i(d(j));
    }

    public final boolean c(long j) {
        long d = d(a(j));
        float intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & d));
        cds cdsVar = this.a;
        ogi ogiVar = cdsVar.b;
        int f = ogiVar.f(intBitsToFloat);
        int i = (int) (d >> 32);
        return Float.intBitsToFloat(i) >= ogiVar.g(f) && Float.intBitsToFloat(i) <= cdsVar.d(f);
    }

    public final long d(long j) {
        wof wofVar;
        wof wofVar2 = this.b;
        if (wofVar2 == null) {
            return j;
        }
        if (!wofVar2.d()) {
            wofVar2 = null;
        }
        if (wofVar2 == null || (wofVar = this.c) == null) {
            return j;
        }
        wof wofVar3 = wofVar.d() ? wofVar : null;
        return wofVar3 == null ? j : wofVar2.v(wofVar3, j);
    }

    public final long e(long j) {
        wof wofVar;
        wof wofVar2 = this.b;
        if (wofVar2 == null) {
            return j;
        }
        if (!wofVar2.d()) {
            wofVar2 = null;
        }
        if (wofVar2 == null || (wofVar = this.c) == null) {
            return j;
        }
        wof wofVar3 = wofVar.d() ? wofVar : null;
        return wofVar3 == null ? j : wofVar3.v(wofVar2, j);
    }
}
