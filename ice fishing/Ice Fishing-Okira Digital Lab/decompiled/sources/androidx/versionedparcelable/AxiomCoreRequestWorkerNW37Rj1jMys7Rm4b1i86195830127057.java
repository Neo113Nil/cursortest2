package androidx.versionedparcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class AxiomCoreRequestWorkerNW37Rj1jMys7Rm4b1i86195830127057 {
    public final long ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final long AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final long ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public AxiomCoreRequestWorkerNW37Rj1jMys7Rm4b1i86195830127057(long j, long j2, long j3) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = j;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = j2;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AxiomCoreRequestWorkerNW37Rj1jMys7Rm4b1i86195830127057) {
            AxiomCoreRequestWorkerNW37Rj1jMys7Rm4b1i86195830127057 axiomCoreRequestWorkerNW37Rj1jMys7Rm4b1i86195830127057 = (AxiomCoreRequestWorkerNW37Rj1jMys7Rm4b1i86195830127057) obj;
            if (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 == axiomCoreRequestWorkerNW37Rj1jMys7Rm4b1i86195830127057.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 && this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 == axiomCoreRequestWorkerNW37Rj1jMys7Rm4b1i86195830127057.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 && this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 == axiomCoreRequestWorkerNW37Rj1jMys7Rm4b1i86195830127057.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        long j2 = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 + ", elapsedRealtime=" + this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 + ", uptimeMillis=" + this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 + "}";
    }
}
