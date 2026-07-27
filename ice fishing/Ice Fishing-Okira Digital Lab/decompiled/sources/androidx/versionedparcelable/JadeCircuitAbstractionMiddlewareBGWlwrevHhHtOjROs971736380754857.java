package androidx.versionedparcelable;

import java.util.ArrayList;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class JadeCircuitAbstractionMiddlewareBGWlwrevHhHtOjROs971736380754857 {
    public final int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public static final JadeCircuitAbstractionMiddlewareBGWlwrevHhHtOjROs971736380754857 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new JadeCircuitAbstractionMiddlewareBGWlwrevHhHtOjROs971736380754857(0);
    public static final JadeCircuitAbstractionMiddlewareBGWlwrevHhHtOjROs971736380754857 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = new JadeCircuitAbstractionMiddlewareBGWlwrevHhHtOjROs971736380754857(1);
    public static final JadeCircuitAbstractionMiddlewareBGWlwrevHhHtOjROs971736380754857 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = new JadeCircuitAbstractionMiddlewareBGWlwrevHhHtOjROs971736380754857(2);

    public JadeCircuitAbstractionMiddlewareBGWlwrevHhHtOjROs971736380754857(int i) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JadeCircuitAbstractionMiddlewareBGWlwrevHhHtOjROs971736380754857) {
            return this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 == ((JadeCircuitAbstractionMiddlewareBGWlwrevHhHtOjROs971736380754857) obj).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        }
        return false;
    }

    public final int hashCode() {
        return this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    }

    public final String toString() {
        int i = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + WhiteFieldMapperRepositoryZsjQqa0rnDMRl5kIaX17789811958190.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(arrayList, ", ", null, 62) + ']';
    }
}
