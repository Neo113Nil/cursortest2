package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterCoordinatorLayoutEliteBlaze9319 {
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final Object[] FrostHunterBundlePulseFusionHero2475;
    public final long[] FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterCoordinatorLayoutEliteBlaze9319(int i, long[] jArr, Object[] objArr) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = jArr;
        this.FrostHunterBundlePulseFusionHero2475 = objArr;
    }

    public final int FrostHunterAlphaAnimationNeoCosmos5761(long j) {
        int i = this.FrostHunterAlphaAnimationNeoCosmos5761 - 1;
        if (i != -1) {
            long[] jArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            int i2 = 0;
            if (i != 0) {
                while (i2 <= i) {
                    int i3 = (i2 + i) >>> 1;
                    long j2 = jArr[i3] - j;
                    if (j2 < 0) {
                        i2 = i3 + 1;
                    } else {
                        if (j2 <= 0) {
                            return i3;
                        }
                        i = i3 - 1;
                    }
                }
                return -(i2 + 1);
            }
            long j3 = jArr[0];
            if (j3 == j) {
                return 0;
            }
            if (j3 > j) {
                return -2;
            }
        }
        return -1;
    }

    public final FrostHunterCoordinatorLayoutEliteBlaze9319 FrostHunterConstraintSetCloneMasterUltraRogue2633(long j, Object obj) {
        long[] jArr;
        int i;
        Object[] objArr = this.FrostHunterBundlePulseFusionHero2475;
        int i2 = 0;
        int i3 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i3++;
            }
        }
        int i4 = i3 + 1;
        long[] jArr2 = new long[i4];
        Object[] objArr2 = new Object[i4];
        if (i4 > 1) {
            int i5 = 0;
            while (true) {
                jArr = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                i = this.FrostHunterAlphaAnimationNeoCosmos5761;
                if (i2 >= i4 || i5 >= i) {
                    break;
                }
                long j2 = jArr[i5];
                Object obj3 = objArr[i5];
                if (j2 > j) {
                    jArr2[i2] = j;
                    objArr2[i2] = obj;
                    i2++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i2] = j2;
                    objArr2[i2] = obj3;
                    i2++;
                }
                i5++;
            }
            if (i5 == i) {
                jArr2[i3] = j;
                objArr2[i3] = obj;
            } else {
                while (i2 < i4) {
                    long j3 = jArr[i5];
                    Object obj4 = objArr[i5];
                    if (obj4 != null) {
                        jArr2[i2] = j3;
                        objArr2[i2] = obj4;
                        i2++;
                    }
                    i5++;
                }
            }
        } else {
            jArr2[0] = j;
            objArr2[0] = obj;
        }
        return new FrostHunterCoordinatorLayoutEliteBlaze9319(i4, jArr2, objArr2);
    }
}
