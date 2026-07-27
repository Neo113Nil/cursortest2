package androidx.versionedparcelable;

import java.util.List;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class VertexLinkValidationProxyIQ6RhY7ooTBzpOgoqr55167179769983 {
    private static final void ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(int i, int i2) {
        throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + i2 + " elements.");
    }

    public static final void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(List list, int i, int i2) {
        if (i > i2) {
            YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(i, i2);
        }
        if (i < 0) {
            RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(i);
        }
        if (i2 > list.size()) {
            LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(i2, list.size());
        }
    }

    private static final void LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    public static final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(i, size);
        }
    }

    private static final void RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(int i) {
        throw new IndexOutOfBoundsException("fromIndex (" + i + ") is less than 0.");
    }

    private static final void YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(int i, int i2) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
    }
}
