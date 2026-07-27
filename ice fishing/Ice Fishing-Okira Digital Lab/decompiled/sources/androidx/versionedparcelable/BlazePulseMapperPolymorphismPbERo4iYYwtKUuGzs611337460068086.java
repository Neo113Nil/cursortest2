package androidx.versionedparcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class BlazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086 {
    public final double ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final double AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final double LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final double ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public final double RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final double TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final double YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public BlazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = d;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = d2;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = d3;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = d4;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = d5;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = d6;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Parameters cannot be NaN");
            throw null;
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086)) {
            return false;
        }
        BlazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086 blazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086 = (BlazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086) obj;
        return Double.compare(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, blazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) == 0 && Double.compare(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, blazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) == 0 && Double.compare(this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495, blazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495) == 0 && Double.compare(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, blazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) == 0 && Double.compare(this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119, blazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) == 0 && Double.compare(this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170, blazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) == 0 && Double.compare(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333, blazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333) + ((Double.hashCode(this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) + ((Double.hashCode(this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) + ((Double.hashCode(this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) + ((Double.hashCode(this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495) + ((Double.hashCode(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) + (Double.hashCode(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 + ", a=" + this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 + ", b=" + this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 + ", c=" + this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 + ", d=" + this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 + ", e=" + this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 + ", f=" + this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 + ')';
    }

    public /* synthetic */ BlazePulseMapperPolymorphismPbERo4iYYwtKUuGzs611337460068086(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
