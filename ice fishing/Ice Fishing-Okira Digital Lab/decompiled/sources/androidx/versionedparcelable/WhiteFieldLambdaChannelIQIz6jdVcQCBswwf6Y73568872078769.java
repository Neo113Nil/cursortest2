package androidx.versionedparcelable;

import java.util.Arrays;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class WhiteFieldLambdaChannelIQIz6jdVcQCBswwf6Y73568872078769 implements JadeCircuitChannelProxyTIhHcv6fI5wNppSQBF76293771512526 {
    public final float[] AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final float[] ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public WhiteFieldLambdaChannelIQIz6jdVcQCBswwf6Y73568872078769(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119("Array lengths must match and be nonzero");
            throw null;
        }
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = fArr;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = fArr2;
    }

    @Override // androidx.versionedparcelable.JadeCircuitChannelProxyTIhHcv6fI5wNppSQBF76293771512526
    public final float AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(float f) {
        return VertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(f, this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
    }

    @Override // androidx.versionedparcelable.JadeCircuitChannelProxyTIhHcv6fI5wNppSQBF76293771512526
    public final float ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(float f) {
        return VertexLinkPipelineResourceDYqVJxsG5HMc015KYK27808645358516.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(f, this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WhiteFieldLambdaChannelIQIz6jdVcQCBswwf6Y73568872078769)) {
            return false;
        }
        WhiteFieldLambdaChannelIQIz6jdVcQCBswwf6Y73568872078769 whiteFieldLambdaChannelIQIz6jdVcQCBswwf6Y73568872078769 = (WhiteFieldLambdaChannelIQIz6jdVcQCBswwf6Y73568872078769) obj;
        return Arrays.equals(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800, whiteFieldLambdaChannelIQIz6jdVcQCBswwf6Y73568872078769.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) && Arrays.equals(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, whiteFieldLambdaChannelIQIz6jdVcQCBswwf6Y73568872078769.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365) + (Arrays.hashCode(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
        arrays.getClass();
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
        arrays2.getClass();
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
