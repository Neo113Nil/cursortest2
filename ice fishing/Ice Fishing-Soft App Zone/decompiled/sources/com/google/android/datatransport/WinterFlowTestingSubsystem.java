package com.google.android.datatransport;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTestingSubsystem implements WinterFlowAPIVersion, WinterFlowTransactionIDE {
    public final /* synthetic */ WinterFlowIDEPlatform WinterFlowTransactionManagerStrategy;
    public final WinterFlowEventCloud WinterFlowVariableVersionControl;

    public WinterFlowTestingSubsystem(WinterFlowIDEPlatform winterFlowIDEPlatform, WinterFlowEventCloud winterFlowEventCloud) {
        this.WinterFlowTransactionManagerStrategy = winterFlowIDEPlatform;
        this.WinterFlowVariableVersionControl = winterFlowEventCloud;
    }

    @Override // com.google.android.datatransport.WinterFlowAPIVersion
    public final WinterFlowJSONDecorator WinterFlowCacheManagerAgent(Object obj, WinterFlowControllerScript winterFlowControllerScript) {
        WinterFlowIDEPlatform winterFlowIDEPlatform = this.WinterFlowTransactionManagerStrategy;
        WinterFlowUnitTestUtility winterFlowUnitTestUtility = new WinterFlowUnitTestUtility(winterFlowIDEPlatform, this);
        WinterFlowJSONDecorator WinterFlowCacheManagerAgent = this.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent((WinterFlowAlgorithmSession) obj, winterFlowUnitTestUtility);
        if (WinterFlowCacheManagerAgent != null) {
            WinterFlowIDEPlatform.WinterFlowThreadListener.set(winterFlowIDEPlatform, null);
        }
        return WinterFlowCacheManagerAgent;
    }

    @Override // com.google.android.datatransport.WinterFlowAPIVersion
    public final void WinterFlowConcurrencyThread(Object obj, WinterFlowControllerScript winterFlowControllerScript) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = WinterFlowIDEPlatform.WinterFlowThreadListener;
        WinterFlowIDEPlatform winterFlowIDEPlatform = this.WinterFlowTransactionManagerStrategy;
        atomicReferenceFieldUpdater.set(winterFlowIDEPlatform, null);
        WinterFlowCompilerCloud winterFlowCompilerCloud = new WinterFlowCompilerCloud(14, winterFlowIDEPlatform, this);
        WinterFlowEventCloud winterFlowEventCloud = this.WinterFlowVariableVersionControl;
        winterFlowEventCloud.WinterFlowConfigurationSubsystem(WinterFlowAlgorithmSession.WinterFlowRouterStructure, winterFlowEventCloud.WinterFlowUnitTestResponse, new WinterFlowUnitTestUtility(1, winterFlowCompilerCloud));
    }

    @Override // com.google.android.datatransport.WinterFlowAPIVersion
    public final boolean WinterFlowResponseEngine(Throwable th) {
        return this.WinterFlowVariableVersionControl.WinterFlowResponseEngine(th);
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionIDE
    public final void WinterFlowRouterStructure(WinterFlowDatabaseDeserialization winterFlowDatabaseDeserialization, int i) {
        this.WinterFlowVariableVersionControl.WinterFlowRouterStructure(winterFlowDatabaseDeserialization, i);
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerLayer
    public final void WinterFlowSyntax(Object obj) {
        this.WinterFlowVariableVersionControl.WinterFlowSyntax(obj);
    }

    @Override // com.google.android.datatransport.WinterFlowAPIVersion
    public final void WinterFlowVariableBandwidth(Object obj) {
        this.WinterFlowVariableVersionControl.WinterFlowVariableBandwidth(obj);
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerLayer
    public final WinterFlowEncryptionMicroservice getContext() {
        return this.WinterFlowVariableVersionControl.WinterFlowSyntax;
    }
}
