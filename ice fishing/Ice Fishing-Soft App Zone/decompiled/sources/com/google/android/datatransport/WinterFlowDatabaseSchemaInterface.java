package com.google.android.datatransport;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowDatabaseSchemaInterface extends WinterFlowLibraryProtocol {
    public boolean WinterFlowResponseEngine;
    public final WinterFlowTransactionManagerUnitTest WinterFlowRouterRouter;
    public Object WinterFlowSyntax;
    public int WinterFlowTransactionAgent;

    public WinterFlowDatabaseSchemaInterface(WinterFlowTransactionManagerUnitTest winterFlowTransactionManagerUnitTest, WinterFlowStackHandler[] winterFlowStackHandlerArr) {
        super(winterFlowTransactionManagerUnitTest.WinterFlowTransactionManagerStrategy, winterFlowStackHandlerArr);
        this.WinterFlowRouterRouter = winterFlowTransactionManagerUnitTest;
        this.WinterFlowTransactionAgent = winterFlowTransactionManagerUnitTest.WinterFlowRouterRouter;
    }

    public final void WinterFlowCacheManagerAgent(int i, WinterFlowLoaderScheduler winterFlowLoaderScheduler, Object obj, int i2) {
        int i3 = i2 * 5;
        WinterFlowStackHandler[] winterFlowStackHandlerArr = this.WinterFlowVariableVersionControl;
        if (i3 <= 30) {
            int WinterFlowTransactionManagerStrategy = 1 << WinterFlowPackageProcess.WinterFlowTransactionManagerStrategy(i, i3);
            if (winterFlowLoaderScheduler.WinterFlowRouterRouter(WinterFlowTransactionManagerStrategy)) {
                winterFlowStackHandlerArr[i2].WinterFlowRouterStructure(winterFlowLoaderScheduler.WinterFlowArrayNetwork, Integer.bitCount(winterFlowLoaderScheduler.WinterFlowRouterStructure) * 2, winterFlowLoaderScheduler.WinterFlowTransactionManagerStrategy(WinterFlowTransactionManagerStrategy));
                this.WinterFlowTransactionManagerStrategy = i2;
                return;
            } else {
                int WinterFlowBatchUI = winterFlowLoaderScheduler.WinterFlowBatchUI(WinterFlowTransactionManagerStrategy);
                WinterFlowLoaderScheduler WinterFlowVariableBandwidth = winterFlowLoaderScheduler.WinterFlowVariableBandwidth(WinterFlowBatchUI);
                winterFlowStackHandlerArr[i2].WinterFlowRouterStructure(winterFlowLoaderScheduler.WinterFlowArrayNetwork, Integer.bitCount(winterFlowLoaderScheduler.WinterFlowRouterStructure) * 2, WinterFlowBatchUI);
                WinterFlowCacheManagerAgent(i, WinterFlowVariableBandwidth, obj, i2 + 1);
                return;
            }
        }
        WinterFlowStackHandler winterFlowStackHandler = winterFlowStackHandlerArr[i2];
        Object[] objArr = winterFlowLoaderScheduler.WinterFlowArrayNetwork;
        winterFlowStackHandler.WinterFlowRouterStructure(objArr, objArr.length, 0);
        while (true) {
            WinterFlowStackHandler winterFlowStackHandler2 = winterFlowStackHandlerArr[i2];
            if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowStackHandler2.WinterFlowVariableVersionControl[winterFlowStackHandler2.WinterFlowUnitTestResponse], obj)) {
                this.WinterFlowTransactionManagerStrategy = i2;
                return;
            } else {
                winterFlowStackHandlerArr[i2].WinterFlowUnitTestResponse += 2;
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowLibraryProtocol, java.util.Iterator
    public final Object next() {
        if (this.WinterFlowRouterRouter.WinterFlowRouterRouter != this.WinterFlowTransactionAgent) {
            throw new ConcurrentModificationException();
        }
        if (!this.WinterFlowUnitTestResponse) {
            WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
            return null;
        }
        WinterFlowStackHandler winterFlowStackHandler = this.WinterFlowVariableVersionControl[this.WinterFlowTransactionManagerStrategy];
        this.WinterFlowSyntax = winterFlowStackHandler.WinterFlowVariableVersionControl[winterFlowStackHandler.WinterFlowUnitTestResponse];
        this.WinterFlowResponseEngine = true;
        return super.next();
    }

    @Override // com.google.android.datatransport.WinterFlowLibraryProtocol, java.util.Iterator
    public final void remove() {
        if (!this.WinterFlowResponseEngine) {
            throw new IllegalStateException();
        }
        boolean z = this.WinterFlowUnitTestResponse;
        WinterFlowTransactionManagerUnitTest winterFlowTransactionManagerUnitTest = this.WinterFlowRouterRouter;
        if (!z) {
            WinterFlowUnitTestLibrary.WinterFlowSyntax(winterFlowTransactionManagerUnitTest).remove(this.WinterFlowSyntax);
        } else {
            if (!z) {
                WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
                return;
            }
            WinterFlowStackHandler winterFlowStackHandler = this.WinterFlowVariableVersionControl[this.WinterFlowTransactionManagerStrategy];
            Object obj = winterFlowStackHandler.WinterFlowVariableVersionControl[winterFlowStackHandler.WinterFlowUnitTestResponse];
            WinterFlowUnitTestLibrary.WinterFlowSyntax(winterFlowTransactionManagerUnitTest).remove(this.WinterFlowSyntax);
            WinterFlowCacheManagerAgent(obj != null ? obj.hashCode() : 0, winterFlowTransactionManagerUnitTest.WinterFlowTransactionManagerStrategy, obj, 0);
        }
        this.WinterFlowSyntax = null;
        this.WinterFlowResponseEngine = false;
        this.WinterFlowTransactionAgent = winterFlowTransactionManagerUnitTest.WinterFlowRouterRouter;
    }
}
