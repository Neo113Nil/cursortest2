package defpackage;

/* loaded from: classes3.dex */
public final class yps {
    public bxj a;
    public long b;

    public /* synthetic */ yps(long j, bxj bxjVar) {
        this.a = bxjVar;
        this.b = j;
    }

    public long a(lfm lfmVar, float f) {
        long h = enj.h(this.b, enj.g(lfmVar.c, lfmVar.g));
        this.b = h;
        bxj bxjVar = this.a;
        if ((bxjVar == null ? enj.d(h) : Math.abs(b(h))) < f) {
            return 9205357640488583168L;
        }
        long j = this.b;
        if (bxjVar == null) {
            return enj.g(this.b, enj.i(f, enj.b(enj.d(j), j)));
        }
        float b = b(j) - (Math.signum(b(this.b)) * f);
        long j2 = this.b;
        bxj bxjVar2 = bxj.b;
        float intBitsToFloat = Float.intBitsToFloat((int) (bxjVar == bxjVar2 ? j2 & 4294967295L : j2 >> 32));
        if (bxjVar == bxjVar2) {
            return (Float.floatToRawIntBits(b) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        }
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(b) & 4294967295L);
    }

    public float b(long j) {
        return Float.intBitsToFloat((int) (this.a == bxj.b ? j >> 32 : j & 4294967295L));
    }
}
