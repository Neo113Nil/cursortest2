package com.google.android.datatransport;

import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrameworkObject implements WinterFlowValidatorPipeline {
    public final LinkedBlockingQueue WinterFlowResponseEngine;
    public Method WinterFlowRouterRouter;
    public WinterFlowSyntaxInheritance WinterFlowSyntax;
    public final boolean WinterFlowTransactionAgent;
    public volatile WinterFlowValidatorPipeline WinterFlowTransactionManagerStrategy;
    public Boolean WinterFlowUnitTestResponse;
    public final String WinterFlowVariableVersionControl;

    public WinterFlowFrameworkObject(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.WinterFlowVariableVersionControl = str;
        this.WinterFlowResponseEngine = linkedBlockingQueue;
        this.WinterFlowTransactionAgent = z;
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final void WinterFlowArrayNetwork(Object obj, String str) {
        WinterFlowThreadListener().WinterFlowArrayNetwork(obj, str);
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final void WinterFlowCacheManagerAgent(String str) {
        WinterFlowThreadListener().WinterFlowCacheManagerAgent(str);
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final boolean WinterFlowHookDataSource() {
        return WinterFlowThreadListener().WinterFlowHookDataSource();
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final void WinterFlowResponseEngine(String str, Exception exc) {
        WinterFlowThreadListener().WinterFlowResponseEngine(str, exc);
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final boolean WinterFlowRouterRouter() {
        return WinterFlowThreadListener().WinterFlowRouterRouter();
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final boolean WinterFlowRouterStructure() {
        return WinterFlowThreadListener().WinterFlowRouterStructure();
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final void WinterFlowServerProtocol(String str, Integer num, Object obj) {
        WinterFlowThreadListener().WinterFlowServerProtocol(str, num, obj);
    }

    public final boolean WinterFlowServiceUtility() {
        Boolean bool;
        Boolean bool2 = this.WinterFlowUnitTestResponse;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        try {
            this.WinterFlowRouterRouter = this.WinterFlowTransactionManagerStrategy.getClass().getMethod("log", WinterFlowThreadTransaction.class);
            bool = Boolean.TRUE;
            this.WinterFlowUnitTestResponse = bool;
        } catch (NoSuchMethodException unused) {
            bool = Boolean.FALSE;
            this.WinterFlowUnitTestResponse = bool;
        }
        return bool.booleanValue();
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final void WinterFlowSyntax(String str, WinterFlowStackLayer winterFlowStackLayer) {
        WinterFlowThreadListener().WinterFlowSyntax(str, winterFlowStackLayer);
    }

    public final WinterFlowValidatorPipeline WinterFlowThreadListener() {
        if (this.WinterFlowTransactionManagerStrategy != null) {
            return this.WinterFlowTransactionManagerStrategy;
        }
        if (this.WinterFlowTransactionAgent) {
            return WinterFlowProviderOrchestration.WinterFlowVariableVersionControl;
        }
        WinterFlowSyntaxInheritance winterFlowSyntaxInheritance = this.WinterFlowSyntax;
        if (winterFlowSyntaxInheritance != null) {
            return winterFlowSyntaxInheritance;
        }
        LinkedBlockingQueue linkedBlockingQueue = this.WinterFlowResponseEngine;
        WinterFlowSyntaxInheritance winterFlowSyntaxInheritance2 = new WinterFlowSyntaxInheritance();
        winterFlowSyntaxInheritance2.WinterFlowTransactionManagerStrategy = this;
        winterFlowSyntaxInheritance2.WinterFlowVariableVersionControl = this.WinterFlowVariableVersionControl;
        winterFlowSyntaxInheritance2.WinterFlowUnitTestResponse = linkedBlockingQueue;
        this.WinterFlowSyntax = winterFlowSyntaxInheritance2;
        return winterFlowSyntaxInheritance2;
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final boolean WinterFlowTransactionAgent() {
        return WinterFlowThreadListener().WinterFlowTransactionAgent();
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final boolean WinterFlowTransactionManagerStrategy() {
        return WinterFlowThreadListener().WinterFlowTransactionManagerStrategy();
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final boolean WinterFlowUnitTestResponse(int i) {
        return WinterFlowThreadListener().WinterFlowUnitTestResponse(i);
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final void WinterFlowVariableVersionControl(String str) {
        WinterFlowThreadListener().WinterFlowVariableVersionControl(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && WinterFlowFrameworkObject.class == obj.getClass() && this.WinterFlowVariableVersionControl.equals(((WinterFlowFrameworkObject) obj).WinterFlowVariableVersionControl);
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final String getName() {
        return this.WinterFlowVariableVersionControl;
    }

    public final int hashCode() {
        return this.WinterFlowVariableVersionControl.hashCode();
    }
}
