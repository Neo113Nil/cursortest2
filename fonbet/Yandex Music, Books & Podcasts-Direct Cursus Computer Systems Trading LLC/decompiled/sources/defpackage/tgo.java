package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tgo implements dup {
    public final am6 a;
    public final am6 b;
    public final am6 c;
    public final am6 d;

    public tgo(am6 am6Var, am6 am6Var2, am6 am6Var3, am6 am6Var4) {
        this.a = am6Var;
        this.b = am6Var2;
        this.c = am6Var3;
        this.d = am6Var4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [am6] */
    /* JADX WARN: Type inference failed for: r3v2, types: [am6] */
    public static tgo a(tgo tgoVar, dma dmaVar, dma dmaVar2, dma dmaVar3, int i) {
        dma dmaVar4 = dmaVar;
        if ((i & 1) != 0) {
            dmaVar4 = tgoVar.a;
        }
        am6 am6Var = tgoVar.b;
        dma dmaVar5 = dmaVar2;
        if ((i & 4) != 0) {
            dmaVar5 = tgoVar.c;
        }
        tgoVar.getClass();
        return new tgo(dmaVar4, am6Var, dmaVar5, dmaVar3);
    }

    @Override // defpackage.dup
    public final ocg I(long j, xof xofVar, jx7 jx7Var) {
        float a = this.a.a(j, jx7Var);
        float a2 = this.b.a(j, jx7Var);
        float a3 = this.c.a(j, jx7Var);
        float a4 = this.d.a(j, jx7Var);
        float c = nmq.c(j);
        float f = a + a4;
        if (f > c) {
            float f2 = c / f;
            a *= f2;
            a4 *= f2;
        }
        float f3 = a2 + a3;
        if (f3 > c) {
            float f4 = c / f3;
            a2 *= f4;
            a3 *= f4;
        }
        if (a < 0.0f || a2 < 0.0f || a3 < 0.0f || a4 < 0.0f) {
            vme.a("Corner size in Px can't be negative(topStart = " + a + ", topEnd = " + a2 + ", bottomEnd = " + a3 + ", bottomStart = " + a4 + ")!");
        }
        if (a + a2 + a3 + a4 == 0.0f) {
            return new ayj(ywf.d(0L, j));
        }
        ynn d = ywf.d(0L, j);
        xof xofVar2 = xof.a;
        float f5 = xofVar == xofVar2 ? a : a2;
        long floatToRawIntBits = (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
        if (xofVar == xofVar2) {
            a = a2;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(a) & 4294967295L) | (Float.floatToRawIntBits(a) << 32);
        float f6 = xofVar == xofVar2 ? a3 : a4;
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
        if (xofVar != xofVar2) {
            a4 = a3;
        }
        return new byj(cb0.l(d, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(a4) << 32) | (Float.floatToRawIntBits(a4) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgo)) {
            return false;
        }
        tgo tgoVar = (tgo) obj;
        return Intrinsics.d(this.a, tgoVar.a) && this.b.equals(tgoVar.b) && Intrinsics.d(this.c, tgoVar.c) && this.d.equals(tgoVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
