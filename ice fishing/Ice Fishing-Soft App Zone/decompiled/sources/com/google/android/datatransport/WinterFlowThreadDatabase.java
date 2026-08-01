package com.google.android.datatransport;

import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowThreadDatabase implements WinterFlowEncryptionComponent {
    public final WinterFlowEncryption WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowParserSystem WinterFlowVariableVersionControl;

    public WinterFlowThreadDatabase(WinterFlowParserSystem winterFlowParserSystem, WinterFlowEncryption winterFlowEncryption) {
        this.WinterFlowVariableVersionControl = winterFlowParserSystem;
        this.WinterFlowTransactionManagerStrategy = winterFlowEncryption;
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionComponent
    public final WinterFlowLoaderHook WinterFlowArrayNetwork(String str, WinterFlowObjectUI winterFlowObjectUI) {
        return this.WinterFlowVariableVersionControl.WinterFlowArrayNetwork(str, winterFlowObjectUI);
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionComponent
    public final boolean WinterFlowCacheManagerAgent(Object obj) {
        return this.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(obj);
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionComponent
    public final Object WinterFlowTransactionManagerStrategy(String str) {
        return this.WinterFlowVariableVersionControl.WinterFlowTransactionManagerStrategy(str);
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionComponent
    public final Map WinterFlowVariableVersionControl() {
        return this.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl();
    }
}
