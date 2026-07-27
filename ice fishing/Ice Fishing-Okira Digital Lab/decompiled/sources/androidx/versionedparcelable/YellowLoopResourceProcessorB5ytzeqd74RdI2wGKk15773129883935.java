package androidx.versionedparcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class YellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935 {
    public final int ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final long AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final String ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public YellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935(int i, long j, String str) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = str;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = j;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = i;
        if (str.length() == 0) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("The id must be between -1 and 63");
            throw null;
        }
    }

    public boolean ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495() {
        return false;
    }

    public abstract float AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(int i);

    public abstract float LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(float f, float f2, float f3);

    public abstract float ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(int i);

    public abstract long RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(float f, float f2, float f3);

    public abstract long YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(float f, float f2, float f3, float f4, YellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935 yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        YellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935 yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935 = (YellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935) obj;
        if (this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 == yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 && this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.equals(yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800)) {
            return QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, yellowLoopResourceProcessorB5ytzeqd74RdI2wGKk15773129883935.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
        }
        return false;
    }

    public int hashCode() {
        return MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.hashCode() * 31, 31, this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) + this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
        sb.append(" (id=");
        sb.append(this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495);
        sb.append(", model=");
        long j = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        sb.append((Object) (QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(j, 12884901888L) ? "Rgb" : QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(j, 12884901889L) ? "Xyz" : QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(j, 12884901890L) ? "Lab" : QuantumStreamDecoderSchedulerZuSI41Fu32QAmywXDr40521088394502.SolarMeshComponentDependencyAJmUjPhyXkQUviGZT247902093054571(j, 17179869187L) ? "Cmyk" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
