package androidx.versionedparcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ObsidianEngineBootstrapInterpreterWLOwwzuPfqMJ3dwpMH11107253899661 {
    public final long AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public ObsidianEngineBootstrapInterpreterWLOwwzuPfqMJ3dwpMH11107253899661(int i, long j) {
        if (i == 0) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050("Null status");
            throw null;
        }
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ObsidianEngineBootstrapInterpreterWLOwwzuPfqMJ3dwpMH11107253899661)) {
            return false;
        }
        ObsidianEngineBootstrapInterpreterWLOwwzuPfqMJ3dwpMH11107253899661 obsidianEngineBootstrapInterpreterWLOwwzuPfqMJ3dwpMH11107253899661 = (ObsidianEngineBootstrapInterpreterWLOwwzuPfqMJ3dwpMH11107253899661) obj;
        return MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, obsidianEngineBootstrapInterpreterWLOwwzuPfqMJ3dwpMH11107253899661.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) && this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 == obsidianEngineBootstrapInterpreterWLOwwzuPfqMJ3dwpMH11107253899661.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    }

    public final int hashCode() {
        int XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195 = (MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) ^ 1000003) * 1000003;
        long j = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        return ((int) ((j >>> 32) ^ j)) ^ XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
        sb.append("}");
        return sb.toString();
    }
}
