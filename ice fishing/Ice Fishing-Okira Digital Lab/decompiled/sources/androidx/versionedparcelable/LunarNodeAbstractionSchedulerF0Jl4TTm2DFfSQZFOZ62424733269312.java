package androidx.versionedparcelable;

import java.util.Set;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class LunarNodeAbstractionSchedulerF0Jl4TTm2DFfSQZFOZ62424733269312 {
    public final Set ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final long AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final long ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public LunarNodeAbstractionSchedulerF0Jl4TTm2DFfSQZFOZ62424733269312(long j, long j2, Set set) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = j;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = j2;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LunarNodeAbstractionSchedulerF0Jl4TTm2DFfSQZFOZ62424733269312) {
            LunarNodeAbstractionSchedulerF0Jl4TTm2DFfSQZFOZ62424733269312 lunarNodeAbstractionSchedulerF0Jl4TTm2DFfSQZFOZ62424733269312 = (LunarNodeAbstractionSchedulerF0Jl4TTm2DFfSQZFOZ62424733269312) obj;
            if (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 == lunarNodeAbstractionSchedulerF0Jl4TTm2DFfSQZFOZ62424733269312.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 && this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 == lunarNodeAbstractionSchedulerF0Jl4TTm2DFfSQZFOZ62424733269312.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 && this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.equals(lunarNodeAbstractionSchedulerF0Jl4TTm2DFfSQZFOZ62424733269312.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        return this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 + ", maxAllowedDelay=" + this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 + ", flags=" + this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 + "}";
    }
}
