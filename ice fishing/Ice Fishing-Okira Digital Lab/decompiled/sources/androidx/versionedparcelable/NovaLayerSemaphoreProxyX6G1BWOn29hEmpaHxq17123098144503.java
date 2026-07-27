package androidx.versionedparcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class NovaLayerSemaphoreProxyX6G1BWOn29hEmpaHxq17123098144503 extends TitanCloudListenerJSONVqd6RrXom5gagcqtYi57187946044658 {
    public final VertexLinkShimCoroutineH08KUnGgNBU49Ka2Yk82585484059297 TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public final Object[] YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public NovaLayerSemaphoreProxyX6G1BWOn29hEmpaHxq17123098144503(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = new VertexLinkShimCoroutineH08KUnGgNBU49Ka2Yk82585484059297(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339();
            return null;
        }
        VertexLinkShimCoroutineH08KUnGgNBU49Ka2Yk82585484059297 vertexLinkShimCoroutineH08KUnGgNBU49Ka2Yk82585484059297 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        if (vertexLinkShimCoroutineH08KUnGgNBU49Ka2Yk82585484059297.hasNext()) {
            this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867++;
            return vertexLinkShimCoroutineH08KUnGgNBU49Ka2Yk82585484059297.next();
        }
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i + 1;
        return this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170[i - vertexLinkShimCoroutineH08KUnGgNBU49Ka2Yk82585484059297.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            CrimsonRouteSyntaxAbstractionJyYSLfFXdh4a3LeSOH90795751755356.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339();
            return null;
        }
        int i = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
        VertexLinkShimCoroutineH08KUnGgNBU49Ka2Yk82585484059297 vertexLinkShimCoroutineH08KUnGgNBU49Ka2Yk82585484059297 = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
        int i2 = vertexLinkShimCoroutineH08KUnGgNBU49Ka2Yk82585484059297.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        if (i <= i2) {
            this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i - 1;
            return vertexLinkShimCoroutineH08KUnGgNBU49Ka2Yk82585484059297.previous();
        }
        int i3 = i - 1;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i3;
        return this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170[i3 - i2];
    }
}
