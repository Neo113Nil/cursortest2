package androidx.versionedparcelable;

import java.util.Arrays;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class TitanCloudDataframeContainerLV1gw1FPvgDrcAUiTO84315846643638 {
    public final byte[] AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final FrostBridgeValidationEngineSeAmCgcDLfAkcMW74137954048796977 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public TitanCloudDataframeContainerLV1gw1FPvgDrcAUiTO84315846643638(FrostBridgeValidationEngineSeAmCgcDLfAkcMW74137954048796977 frostBridgeValidationEngineSeAmCgcDLfAkcMW74137954048796977, byte[] bArr) {
        if (frostBridgeValidationEngineSeAmCgcDLfAkcMW74137954048796977 == null) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050("encoding is null");
            throw null;
        }
        if (bArr == null) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.ObsidianEngineArrayExceptionQfzuWPsbR7V1emEwQB68147360471050("bytes is null");
            throw null;
        }
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = frostBridgeValidationEngineSeAmCgcDLfAkcMW74137954048796977;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitanCloudDataframeContainerLV1gw1FPvgDrcAUiTO84315846643638)) {
            return false;
        }
        TitanCloudDataframeContainerLV1gw1FPvgDrcAUiTO84315846643638 titanCloudDataframeContainerLV1gw1FPvgDrcAUiTO84315846643638 = (TitanCloudDataframeContainerLV1gw1FPvgDrcAUiTO84315846643638) obj;
        if (this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.equals(titanCloudDataframeContainerLV1gw1FPvgDrcAUiTO84315846643638.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800)) {
            return Arrays.equals(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, titanCloudDataframeContainerLV1gw1FPvgDrcAUiTO84315846643638.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) ^ ((this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 + ", bytes=[...]}";
    }
}
