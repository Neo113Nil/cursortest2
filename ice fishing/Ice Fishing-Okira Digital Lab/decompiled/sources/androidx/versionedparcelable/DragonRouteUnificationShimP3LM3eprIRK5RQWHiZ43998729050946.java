package androidx.versionedparcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class DragonRouteUnificationShimP3LM3eprIRK5RQWHiZ43998729050946 implements AxiomCoreReflectionPolymorphismJtSfl09dA69GCGBZku20735028634776 {
    public final float AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final float ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public DragonRouteUnificationShimP3LM3eprIRK5RQWHiZ43998729050946(float f, float f2) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = f;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = f2;
    }

    @Override // androidx.versionedparcelable.AxiomCoreReflectionPolymorphismJtSfl09dA69GCGBZku20735028634776
    public final long ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(long j, long j2, HeliosRuntimeVariableInheritanceMn6y0Y6u9gAylmwc5F75136047155422 heliosRuntimeVariableInheritanceMn6y0Y6u9gAylmwc5F75136047155422) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        HeliosRuntimeVariableInheritanceMn6y0Y6u9gAylmwc5F75136047155422 heliosRuntimeVariableInheritanceMn6y0Y6u9gAylmwc5F751360471554222 = HeliosRuntimeVariableInheritanceMn6y0Y6u9gAylmwc5F75136047155422.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        float f3 = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (heliosRuntimeVariableInheritanceMn6y0Y6u9gAylmwc5F75136047155422 != heliosRuntimeVariableInheritanceMn6y0Y6u9gAylmwc5F751360471554222) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) * f2;
        int round = Math.round((f3 + 1.0f) * f);
        return (Math.round(f4) & 4294967295L) | (round << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragonRouteUnificationShimP3LM3eprIRK5RQWHiZ43998729050946)) {
            return false;
        }
        DragonRouteUnificationShimP3LM3eprIRK5RQWHiZ43998729050946 dragonRouteUnificationShimP3LM3eprIRK5RQWHiZ43998729050946 = (DragonRouteUnificationShimP3LM3eprIRK5RQWHiZ43998729050946) obj;
        return Float.compare(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, dragonRouteUnificationShimP3LM3eprIRK5RQWHiZ43998729050946.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) == 0 && Float.compare(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, dragonRouteUnificationShimP3LM3eprIRK5RQWHiZ43998729050946.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) + (Float.hashCode(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
        sb.append(", verticalBias=");
        return MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050(sb, this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, ')');
    }
}
