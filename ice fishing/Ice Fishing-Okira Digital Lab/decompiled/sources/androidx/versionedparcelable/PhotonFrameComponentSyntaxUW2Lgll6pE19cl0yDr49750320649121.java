package androidx.versionedparcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class PhotonFrameComponentSyntaxUW2Lgll6pE19cl0yDr49750320649121 {
    public final long ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public /* synthetic */ PhotonFrameComponentSyntaxUW2Lgll6pE19cl0yDr49750320649121(long j) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = j;
    }

    public static final float ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final boolean AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(long j, long j2) {
        return j == j2;
    }

    public static final long LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static long ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(long j, float f, int i) {
        float intBitsToFloat = (i & 1) != 0 ? Float.intBitsToFloat((int) (j >> 32)) : 0.0f;
        if ((i & 2) != 0) {
            f = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
    }

    public static final long RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static String TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.XenoGridInheritanceEncoderLUWRDrGQFJijcNZ09l48202102995381(Float.intBitsToFloat((int) (j >> 32))) + ", " + AxiomCoreFloatingPointContextUxzEyKavz0EtEcNPMs21020501785756.XenoGridInheritanceEncoderLUWRDrGQFJijcNZ09l48202102995381(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public static final long YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(long j, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PhotonFrameComponentSyntaxUW2Lgll6pE19cl0yDr49750320649121) {
            return this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 == ((PhotonFrameComponentSyntaxUW2Lgll6pE19cl0yDr49750320649121) obj).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
    }

    public final String toString() {
        return TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
    }
}
