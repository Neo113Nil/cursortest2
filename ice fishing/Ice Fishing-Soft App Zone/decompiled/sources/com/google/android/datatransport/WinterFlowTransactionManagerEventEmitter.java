package com.google.android.datatransport;

import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTransactionManagerEventEmitter implements WinterFlowEncryptionComponent, WinterFlowExceptionProxy {
    public WinterFlowDatabaseUtility WinterFlowTransactionManagerStrategy;
    public WinterFlowCacheManagerVersionControl WinterFlowUnitTestResponse;
    public final /* synthetic */ WinterFlowParserSystem WinterFlowVariableVersionControl;

    public WinterFlowTransactionManagerEventEmitter(WinterFlowParserSystem winterFlowParserSystem) {
        this.WinterFlowVariableVersionControl = winterFlowParserSystem;
        Object WinterFlowTransactionManagerStrategy = winterFlowParserSystem.WinterFlowTransactionManagerStrategy("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = WinterFlowTransactionManagerStrategy instanceof Bundle ? (Bundle) WinterFlowTransactionManagerStrategy : null;
        if (bundle != null && this.WinterFlowUnitTestResponse == null) {
            WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = new WinterFlowCacheManagerVersionControl(new WinterFlowNodeGateway(this, new WinterFlowAPISystem(18, this)));
            this.WinterFlowUnitTestResponse = winterFlowCacheManagerVersionControl;
            winterFlowCacheManagerVersionControl.WinterFlowUnitTestResponse(bundle);
        }
        winterFlowParserSystem.WinterFlowArrayNetwork("androidx.savedstate.SavedStateRegistry", new WinterFlowAPISystem(16, this));
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionComponent
    public final WinterFlowLoaderHook WinterFlowArrayNetwork(String str, WinterFlowObjectUI winterFlowObjectUI) {
        return this.WinterFlowVariableVersionControl.WinterFlowArrayNetwork(str, winterFlowObjectUI);
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionComponent
    public final boolean WinterFlowCacheManagerAgent(Object obj) {
        return this.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(obj);
    }

    @Override // com.google.android.datatransport.WinterFlowExceptionProxy
    public final WinterFlowAlgorithmArray WinterFlowHookDataSource() {
        WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = this.WinterFlowUnitTestResponse;
        if (winterFlowCacheManagerVersionControl == null) {
            WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl2 = new WinterFlowCacheManagerVersionControl(new WinterFlowNodeGateway(this, new WinterFlowAPISystem(18, this)));
            this.WinterFlowUnitTestResponse = winterFlowCacheManagerVersionControl2;
            winterFlowCacheManagerVersionControl2.WinterFlowUnitTestResponse(null);
            winterFlowCacheManagerVersionControl = winterFlowCacheManagerVersionControl2;
        }
        return (WinterFlowAlgorithmArray) winterFlowCacheManagerVersionControl.WinterFlowUnitTestResponse;
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionComponent
    public final Object WinterFlowTransactionManagerStrategy(String str) {
        return this.WinterFlowVariableVersionControl.WinterFlowTransactionManagerStrategy(str);
    }

    @Override // com.google.android.datatransport.WinterFlowDecoratorVersion
    public final WinterFlowDatabaseUtility WinterFlowUnitTestResponse() {
        WinterFlowDatabaseUtility winterFlowDatabaseUtility = this.WinterFlowTransactionManagerStrategy;
        if (winterFlowDatabaseUtility != null) {
            return winterFlowDatabaseUtility;
        }
        WinterFlowDatabaseUtility winterFlowDatabaseUtility2 = new WinterFlowDatabaseUtility(this, false);
        this.WinterFlowTransactionManagerStrategy = winterFlowDatabaseUtility2;
        return winterFlowDatabaseUtility2;
    }

    @Override // com.google.android.datatransport.WinterFlowEncryptionComponent
    public final Map WinterFlowVariableVersionControl() {
        return this.WinterFlowVariableVersionControl.WinterFlowVariableVersionControl();
    }
}
