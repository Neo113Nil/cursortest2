package com.google.android.datatransport;

import java.io.Serializable;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSyntaxInheritance implements WinterFlowValidatorPipeline, Serializable {
    public WinterFlowFrameworkObject WinterFlowTransactionManagerStrategy;
    public LinkedBlockingQueue WinterFlowUnitTestResponse;
    public String WinterFlowVariableVersionControl;

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final void WinterFlowArrayNetwork(Object obj, String str) {
        WinterFlowThreadListener(5, new Object[]{obj});
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final void WinterFlowCacheManagerAgent(String str) {
        WinterFlowThreadListener(1, null);
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final boolean WinterFlowHookDataSource() {
        return true;
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final void WinterFlowResponseEngine(String str, Exception exc) {
        WinterFlowThreadListener(1, null);
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final boolean WinterFlowRouterRouter() {
        return true;
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final boolean WinterFlowRouterStructure() {
        return true;
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final void WinterFlowServerProtocol(String str, Integer num, Object obj) {
        if (obj instanceof Throwable) {
            WinterFlowThreadListener(5, new Object[]{num});
        } else {
            WinterFlowThreadListener(5, new Object[]{num, obj});
        }
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final void WinterFlowSyntax(String str, WinterFlowStackLayer winterFlowStackLayer) {
        WinterFlowThreadListener(5, null);
    }

    public final void WinterFlowThreadListener(int i, Object[] objArr) {
        WinterFlowThreadTransaction winterFlowThreadTransaction = new WinterFlowThreadTransaction();
        System.currentTimeMillis();
        winterFlowThreadTransaction.WinterFlowRouterStructure = i;
        winterFlowThreadTransaction.WinterFlowHookDataSource = this.WinterFlowTransactionManagerStrategy;
        Thread.currentThread().getName();
        winterFlowThreadTransaction.WinterFlowCacheManagerAgent = objArr;
        this.WinterFlowUnitTestResponse.add(winterFlowThreadTransaction);
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final boolean WinterFlowTransactionAgent() {
        return true;
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final boolean WinterFlowTransactionManagerStrategy() {
        return true;
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final void WinterFlowVariableVersionControl(String str) {
        WinterFlowThreadListener(5, null);
    }

    @Override // com.google.android.datatransport.WinterFlowValidatorPipeline
    public final String getName() {
        return this.WinterFlowVariableVersionControl;
    }
}
