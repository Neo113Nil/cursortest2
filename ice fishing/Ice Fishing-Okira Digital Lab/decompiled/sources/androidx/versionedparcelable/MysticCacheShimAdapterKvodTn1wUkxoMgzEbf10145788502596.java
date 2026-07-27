package androidx.versionedparcelable;

import java.util.Iterator;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class MysticCacheShimAdapterKvodTn1wUkxoMgzEbf10145788502596 implements Iterator, LunarNodeContextRuntimeSCpyKGDYBhqjPXAetg19809747678198 {
    public final int LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public int TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public boolean YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public MysticCacheShimAdapterKvodTn1wUkxoMgzEbf10145788502596(int i, int i2, int i3) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i3;
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = z;
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        if (i != this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119) {
            this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 + i;
            return i;
        }
        if (this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) {
            this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = false;
            return i;
        }
        CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339();
        return 0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
