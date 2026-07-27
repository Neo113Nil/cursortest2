package androidx.versionedparcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class FrostBridgeManagerBinaryQqNkrjWyaZVl8TSgjb61002060331714 {
    public final long ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public static final float ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final long LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static long ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(long j, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i & 2) != 0) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static final long RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static String YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(long j) {
        return "(" + AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(j) + ", " + ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(j) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FrostBridgeManagerBinaryQqNkrjWyaZVl8TSgjb61002060331714) {
            return this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 == ((FrostBridgeManagerBinaryQqNkrjWyaZVl8TSgjb61002060331714) obj).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
    }

    public final String toString() {
        return YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
    }
}
