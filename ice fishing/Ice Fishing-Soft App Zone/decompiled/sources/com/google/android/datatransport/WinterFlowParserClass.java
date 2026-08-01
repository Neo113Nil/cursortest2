package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowParserClass extends WinterFlowCacheManagerNode implements WinterFlowHookView {
    public final void WinterFlowMapperProtocol(int i) {
        synchronized (this) {
            Object[] objArr = this.WinterFlowServerProtocol;
            objArr.getClass();
            WinterFlowConcurrencyThread(Integer.valueOf(((Number) objArr[((int) ((this.WinterFlowThreadListener + ((int) ((WinterFlowBandwidthObject() + this.WinterFlowBandwidthObject) - this.WinterFlowThreadListener))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }

    @Override // com.google.android.datatransport.WinterFlowHookView
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.WinterFlowServerProtocol;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.WinterFlowThreadListener + ((int) ((WinterFlowBandwidthObject() + this.WinterFlowBandwidthObject) - this.WinterFlowThreadListener))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }
}
