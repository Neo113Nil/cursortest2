package androidx.versionedparcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class VertexLinkDispatcherJITEbKvrx27eFIDxCtH8y23859998051656 {
    public final int ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final long AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final String ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public VertexLinkDispatcherJITEbKvrx27eFIDxCtH8y23859998051656(int i, long j, String str) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = str;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = j;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = i;
    }

    public static XenoGridSingletonArrayCuOkXptCuErlhFUdyx75976631528604 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        XenoGridSingletonArrayCuOkXptCuErlhFUdyx75976631528604 xenoGridSingletonArrayCuOkXptCuErlhFUdyx75976631528604 = new XenoGridSingletonArrayCuOkXptCuErlhFUdyx75976631528604();
        xenoGridSingletonArrayCuOkXptCuErlhFUdyx75976631528604.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = 0L;
        return xenoGridSingletonArrayCuOkXptCuErlhFUdyx75976631528604;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VertexLinkDispatcherJITEbKvrx27eFIDxCtH8y23859998051656)) {
            return false;
        }
        VertexLinkDispatcherJITEbKvrx27eFIDxCtH8y23859998051656 vertexLinkDispatcherJITEbKvrx27eFIDxCtH8y23859998051656 = (VertexLinkDispatcherJITEbKvrx27eFIDxCtH8y23859998051656) obj;
        String str = vertexLinkDispatcherJITEbKvrx27eFIDxCtH8y23859998051656.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        String str2 = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 != vertexLinkDispatcherJITEbKvrx27eFIDxCtH8y23859998051656.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) {
            return false;
        }
        int i = vertexLinkDispatcherJITEbKvrx27eFIDxCtH8y23859998051656.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        int i2 = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        return i2 == 0 ? i == 0 : MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(i2, i);
    }

    public final int hashCode() {
        String str = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i2 = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        return i ^ (i2 != 0 ? MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.XenoGridVectorHashmapRiVZttryRmb3kjjndT78819484033195(i2) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
        sb.append(", responseCode=");
        int i = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
