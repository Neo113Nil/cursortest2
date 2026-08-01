package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public enum WinterFlowXMLAgent implements WinterFlowConcurrencyDatabase {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);

    public final int WinterFlowVariableVersionControl;

    WinterFlowXMLAgent(int i) {
        this.WinterFlowVariableVersionControl = i;
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyDatabase
    public final int WinterFlowRouterStructure() {
        return this.WinterFlowVariableVersionControl;
    }
}
