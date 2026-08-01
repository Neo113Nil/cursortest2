package com.google.android.datatransport;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDeserializationHelper implements WinterFlowTransactionManagerLayer, WinterFlowEventConfiguration {
    public static final AtomicReferenceFieldUpdater WinterFlowTransactionManagerStrategy = AtomicReferenceFieldUpdater.newUpdater(WinterFlowDeserializationHelper.class, Object.class, "result");
    public final WinterFlowTransactionManagerLayer WinterFlowVariableVersionControl;
    private volatile Object result;

    public WinterFlowDeserializationHelper(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        this.WinterFlowVariableVersionControl = winterFlowTransactionManagerLayer;
        this.result = winterFlowListenerJava;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerLayer
    public final void WinterFlowSyntax(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = WinterFlowTransactionManagerStrategy;
        while (true) {
            Object obj2 = this.result;
            WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowTransactionManagerStrategy;
            if (obj2 == winterFlowListenerJava) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, winterFlowListenerJava, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != winterFlowListenerJava) {
                        break;
                    }
                }
                return;
            }
            WinterFlowListenerJava winterFlowListenerJava2 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
            if (obj2 != winterFlowListenerJava2) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Already resumed");
                return;
            }
            WinterFlowListenerJava winterFlowListenerJava3 = WinterFlowListenerJava.WinterFlowUnitTestResponse;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, winterFlowListenerJava2, winterFlowListenerJava3)) {
                if (atomicReferenceFieldUpdater.get(this) != winterFlowListenerJava2) {
                    break;
                }
            }
            this.WinterFlowVariableVersionControl.WinterFlowSyntax(obj);
            return;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowEventConfiguration
    public final WinterFlowEventConfiguration WinterFlowTransactionManagerStrategy() {
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = this.WinterFlowVariableVersionControl;
        if (winterFlowTransactionManagerLayer instanceof WinterFlowEventConfiguration) {
            return (WinterFlowEventConfiguration) winterFlowTransactionManagerLayer;
        }
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionManagerLayer
    public final WinterFlowEncryptionMicroservice getContext() {
        return this.WinterFlowVariableVersionControl.getContext();
    }

    public final String toString() {
        return "SafeContinuation for " + this.WinterFlowVariableVersionControl;
    }
}
