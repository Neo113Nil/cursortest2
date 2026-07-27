package androidx.versionedparcelable;

import java.util.Arrays;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class TitanCloudSerializationLambdaEQ6Dzyaes1sJmMTTrQ21832191762753 {
    public int ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public int LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public long[] ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = TitanCloudPrimitiveConstructorFRucogUxBFhzDzOmFR65907432573103.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public long[] AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = NovaLayerOperatorServiceWckaen920NggX6F7Ou20602831666775.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public TitanCloudSerializationLambdaEQ6Dzyaes1sJmMTTrQ21832191762753(int i) {
        if (i >= 0) {
            ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(TitanCloudPrimitiveConstructorFRucogUxBFhzDzOmFR65907432573103.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(i));
        } else {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, TitanCloudPrimitiveConstructorFRucogUxBFhzDzOmFR65907432573103.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(i)) : 0;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = max;
        if (max == 0) {
            jArr = TitanCloudPrimitiveConstructorFRucogUxBFhzDzOmFR65907432573103.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = TitanCloudPrimitiveConstructorFRucogUxBFhzDzOmFR65907432573103.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495) - this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new long[max];
    }

    public final int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(int i) {
        int i2 = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(long j) {
        int i;
        int hashCode = Long.hashCode(j) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = (i3 * 72340172838076673L) ^ j2;
            long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j4 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365[i] == j) {
                    break loop0;
                }
                j4 &= j4 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        return i >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TitanCloudSerializationLambdaEQ6Dzyaes1sJmMTTrQ21832191762753)) {
            return false;
        }
        TitanCloudSerializationLambdaEQ6Dzyaes1sJmMTTrQ21832191762753 titanCloudSerializationLambdaEQ6Dzyaes1sJmMTTrQ21832191762753 = (TitanCloudSerializationLambdaEQ6Dzyaes1sJmMTTrQ21832191762753) obj;
        if (titanCloudSerializationLambdaEQ6Dzyaes1sJmMTTrQ21832191762753.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 != this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
            return false;
        }
        long[] jArr = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        long[] jArr2 = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !titanCloudSerializationLambdaEQ6Dzyaes1sJmMTTrQ21832191762753.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(jArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final int hashCode() {
        long[] jArr = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        long[] jArr2 = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        i2 = Long.hashCode(jArr[(i << 3) + i4]) + i2;
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        long[] jArr2 = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(j2);
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }
}
