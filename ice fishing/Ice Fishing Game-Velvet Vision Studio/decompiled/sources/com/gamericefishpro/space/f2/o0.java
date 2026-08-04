package com.gamericefishpro.space.f2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements j1 {
    public static final o0 e = new o0(0);
    public final /* synthetic */ int d;

    public /* synthetic */ o0(int i) {
        this.d = i;
    }

    public long a(long j, long j2) {
        switch (this.d) {
            case 1:
                float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i = a1.a;
                return jFloatToRawIntBits;
            case 2:
                float fC = x.c(j, j2);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fC)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L);
                int i2 = a1.a;
                return jFloatToRawIntBits2;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i3 = a1.a;
                    return jFloatToRawIntBits3;
                }
                float fC2 = x.c(j, j2);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fC2)) << 32) | (((long) Float.floatToRawIntBits(fC2)) & 4294967295L);
                int i4 = a1.a;
                return jFloatToRawIntBits4;
        }
    }

    @Override // com.gamericefishpro.space.f2.j1
    public void c(i1 i1Var) {
        i1Var.clear();
    }

    @Override // com.gamericefishpro.space.f2.j1
    public boolean e(Object obj, Object obj2) {
        return false;
    }

    public String toString() {
        switch (this.d) {
            case 4:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
