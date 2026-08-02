package defpackage;

/* loaded from: classes.dex */
public final class hf6 implements ohm {
    public final long a;

    public hf6(long j) {
        this.a = j;
    }

    @Override // defpackage.ohm
    public final long a(aqe aqeVar, long j, xof xofVar, long j2) {
        int i = aqeVar.a;
        long j3 = this.a;
        return (qwp.u(i + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), xofVar == xof.a) << 32) | (qwp.u(aqeVar.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L);
    }
}
