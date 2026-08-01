package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProxyBackend extends WinterFlowRuntimeBandwidth {
    public final transient WinterFlowRuntimeBandwidth WinterFlowUnitTestResponse;

    public WinterFlowProxyBackend(WinterFlowRuntimeBandwidth winterFlowRuntimeBandwidth) {
        this.WinterFlowUnitTestResponse = winterFlowRuntimeBandwidth;
    }

    @Override // com.google.android.datatransport.WinterFlowRuntimeBandwidth
    public final WinterFlowRuntimeBandwidth WinterFlowTransactionManagerStrategy() {
        return this.WinterFlowUnitTestResponse;
    }

    @Override // com.google.android.datatransport.WinterFlowRuntimeBandwidth, java.util.List
    /* renamed from: WinterFlowUnitTestResponse */
    public final WinterFlowRuntimeBandwidth subList(int i, int i2) {
        WinterFlowRuntimeBandwidth winterFlowRuntimeBandwidth = this.WinterFlowUnitTestResponse;
        WinterFlowProtocolNetwork.WinterFlowServerProtocol(i, i2, winterFlowRuntimeBandwidth.size());
        return winterFlowRuntimeBandwidth.subList(winterFlowRuntimeBandwidth.size() - i2, winterFlowRuntimeBandwidth.size() - i).WinterFlowTransactionManagerStrategy();
    }

    @Override // com.google.android.datatransport.WinterFlowRuntimeBandwidth, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.WinterFlowUnitTestResponse.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        WinterFlowRuntimeBandwidth winterFlowRuntimeBandwidth = this.WinterFlowUnitTestResponse;
        WinterFlowProtocolNetwork.WinterFlowTransactionAgent(i, winterFlowRuntimeBandwidth.size());
        return winterFlowRuntimeBandwidth.get((winterFlowRuntimeBandwidth.size() - 1) - i);
    }

    @Override // com.google.android.datatransport.WinterFlowRuntimeBandwidth, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.WinterFlowUnitTestResponse.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r1.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.datatransport.WinterFlowRuntimeBandwidth, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.WinterFlowUnitTestResponse.indexOf(obj);
        if (indexOf >= 0) {
            return (r1.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.WinterFlowUnitTestResponse.size();
    }
}
