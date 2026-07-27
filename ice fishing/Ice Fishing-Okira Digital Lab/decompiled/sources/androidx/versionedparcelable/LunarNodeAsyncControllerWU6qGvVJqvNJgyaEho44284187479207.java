package androidx.versionedparcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class LunarNodeAsyncControllerWU6qGvVJqvNJgyaEho44284187479207 {
    public final int ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final CrimsonRouteMonitorWorkerT6WQwWPTm73EZkymz132835256884483 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public LunarNodeAsyncControllerWU6qGvVJqvNJgyaEho44284187479207(CrimsonRouteMonitorWorkerT6WQwWPTm73EZkymz132835256884483 crimsonRouteMonitorWorkerT6WQwWPTm73EZkymz132835256884483, int i, int i2) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = crimsonRouteMonitorWorkerT6WQwWPTm73EZkymz132835256884483;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = i;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = i2;
    }

    public static LunarNodeAsyncControllerWU6qGvVJqvNJgyaEho44284187479207 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Class cls) {
        return new LunarNodeAsyncControllerWU6qGvVJqvNJgyaEho44284187479207(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LunarNodeAsyncControllerWU6qGvVJqvNJgyaEho44284187479207)) {
            return false;
        }
        LunarNodeAsyncControllerWU6qGvVJqvNJgyaEho44284187479207 lunarNodeAsyncControllerWU6qGvVJqvNJgyaEho44284187479207 = (LunarNodeAsyncControllerWU6qGvVJqvNJgyaEho44284187479207) obj;
        return this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.equals(lunarNodeAsyncControllerWU6qGvVJqvNJgyaEho44284187479207.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) && this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 == lunarNodeAsyncControllerWU6qGvVJqvNJgyaEho44284187479207.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 && this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 == lunarNodeAsyncControllerWU6qGvVJqvNJgyaEho44284187479207.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    }

    public final int hashCode() {
        return this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 ^ ((((this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.hashCode() ^ 1000003) * 1000003) ^ this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
        sb.append(", type=");
        int i = this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339("Unsupported injection: ", i2));
            }
            str = "deferred";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public LunarNodeAsyncControllerWU6qGvVJqvNJgyaEho44284187479207(int i, int i2, Class cls) {
        this(CrimsonRouteMonitorWorkerT6WQwWPTm73EZkymz132835256884483.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(cls), i, i2);
    }
}
