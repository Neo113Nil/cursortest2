package com.google.android.datatransport;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWidgetService extends WinterFlowSoftwareException {
    public final AtomicReferenceFieldUpdater WinterFlowResponseEngine;
    public final AtomicReferenceFieldUpdater WinterFlowServerProtocol;
    public final AtomicReferenceFieldUpdater WinterFlowServiceUtility;
    public final AtomicReferenceFieldUpdater WinterFlowThreadListener;
    public final AtomicReferenceFieldUpdater WinterFlowTransactionAgent;

    public WinterFlowWidgetService(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.WinterFlowResponseEngine = atomicReferenceFieldUpdater;
        this.WinterFlowTransactionAgent = atomicReferenceFieldUpdater2;
        this.WinterFlowServerProtocol = atomicReferenceFieldUpdater3;
        this.WinterFlowThreadListener = atomicReferenceFieldUpdater4;
        this.WinterFlowServiceUtility = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareException
    public final boolean WinterFlowBatchUI(WinterFlowThreadHelper winterFlowThreadHelper, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.WinterFlowServiceUtility;
            if (atomicReferenceFieldUpdater.compareAndSet(winterFlowThreadHelper, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(winterFlowThreadHelper) == obj);
        return false;
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareException
    public final void WinterFlowCompilerHandler(WinterFlowTransaction winterFlowTransaction, WinterFlowTransaction winterFlowTransaction2) {
        this.WinterFlowTransactionAgent.lazySet(winterFlowTransaction, winterFlowTransaction2);
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareException
    public final void WinterFlowFrontendBackend(WinterFlowTransaction winterFlowTransaction, Thread thread) {
        this.WinterFlowResponseEngine.lazySet(winterFlowTransaction, thread);
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareException
    public final boolean WinterFlowRouterAdapter(WinterFlowThreadHelper winterFlowThreadHelper, WinterFlowTransaction winterFlowTransaction, WinterFlowTransaction winterFlowTransaction2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.WinterFlowServerProtocol;
            if (atomicReferenceFieldUpdater.compareAndSet(winterFlowThreadHelper, winterFlowTransaction, winterFlowTransaction2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(winterFlowThreadHelper) == winterFlowTransaction);
        return false;
    }

    @Override // com.google.android.datatransport.WinterFlowSoftwareException
    public final boolean WinterFlowVariableBandwidth(WinterFlowThreadHelper winterFlowThreadHelper, WinterFlowProcessorFunction winterFlowProcessorFunction) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.WinterFlowThreadListener;
            if (atomicReferenceFieldUpdater.compareAndSet(winterFlowThreadHelper, winterFlowProcessorFunction, WinterFlowProcessorFunction.WinterFlowHookDataSource)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(winterFlowThreadHelper) == winterFlowProcessorFunction);
        return false;
    }
}
