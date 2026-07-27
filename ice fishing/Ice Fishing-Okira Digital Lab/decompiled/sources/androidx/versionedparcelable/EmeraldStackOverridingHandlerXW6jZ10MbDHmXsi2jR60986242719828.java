package androidx.versionedparcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class EmeraldStackOverridingHandlerXW6jZ10MbDHmXsi2jR60986242719828 implements AxiomCoreReflectionPolymorphismJtSfl09dA69GCGBZku20735028634776 {
    public final float ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public EmeraldStackOverridingHandlerXW6jZ10MbDHmXsi2jR60986242719828(float f) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = f;
    }

    @Override // androidx.versionedparcelable.AxiomCoreReflectionPolymorphismJtSfl09dA69GCGBZku20735028634776
    public final long ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(long j, long j2, HeliosRuntimeVariableInheritanceMn6y0Y6u9gAylmwc5F75136047155422 heliosRuntimeVariableInheritanceMn6y0Y6u9gAylmwc5F75136047155422) {
        long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
        return (Math.round((((int) (j3 & 4294967295L)) / 2.0f) * 0.0f) & 4294967295L) | (Math.round((1.0f + this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) * (((int) (j3 >> 32)) / 2.0f)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EmeraldStackOverridingHandlerXW6jZ10MbDHmXsi2jR60986242719828) && Float.compare(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, ((EmeraldStackOverridingHandlerXW6jZ10MbDHmXsi2jR60986242719828) obj).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) == 0 && Float.compare(-1.0f, -1.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 + ", verticalBias=-1.0)";
    }
}
