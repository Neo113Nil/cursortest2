package androidx.versionedparcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class DragonRoutePrimitiveAPINOXWfAT1ZDI2qffHAV97080351415384 {
    public final Object[] ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final long[] AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public DragonRoutePrimitiveAPINOXWfAT1ZDI2qffHAV97080351415384(int i, long[] jArr, Object[] objArr) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = jArr;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = objArr;
    }

    public final DragonRoutePrimitiveAPINOXWfAT1ZDI2qffHAV97080351415384 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(long j, Object obj) {
        long[] jArr;
        int i;
        Object[] objArr = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
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
                jArr = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                i = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
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
        return new DragonRoutePrimitiveAPINOXWfAT1ZDI2qffHAV97080351415384(i4, jArr2, objArr2);
    }

    public final int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(long j) {
        int i = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 - 1;
        if (i != -1) {
            long[] jArr = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
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
}
