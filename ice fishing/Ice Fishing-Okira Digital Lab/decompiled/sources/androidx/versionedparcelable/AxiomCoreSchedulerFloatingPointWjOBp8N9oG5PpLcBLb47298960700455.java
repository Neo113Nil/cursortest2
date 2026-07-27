package androidx.versionedparcelable;

import java.util.Iterator;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class AxiomCoreSchedulerFloatingPointWjOBp8N9oG5PpLcBLb47298960700455 implements Iterator, LunarNodeContextRuntimeSCpyKGDYBhqjPXAetg19809747678198 {
    public int BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818;
    public int LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final String RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public int TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public int YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public AxiomCoreSchedulerFloatingPointWjOBp8N9oG5PpLcBLb47298960700455(String str) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 < 0) {
            this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = 2;
            return false;
        }
        String str = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170; i4 < length2; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = 1;
                this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = i;
                this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = length;
                return true;
            }
        }
        i = -1;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = 1;
        this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 = i;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339();
            return null;
        }
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = 0;
        int i = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        int i2 = this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = this.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818 + i;
        return this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
