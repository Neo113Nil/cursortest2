package com.google.android.datatransport;

import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowLibraryProtocol implements Iterator, WinterFlowLoaderProcess {
    public int WinterFlowTransactionManagerStrategy;
    public boolean WinterFlowUnitTestResponse = true;
    public final WinterFlowStackHandler[] WinterFlowVariableVersionControl;

    public WinterFlowLibraryProtocol(WinterFlowLoaderScheduler winterFlowLoaderScheduler, WinterFlowStackHandler[] winterFlowStackHandlerArr) {
        this.WinterFlowVariableVersionControl = winterFlowStackHandlerArr;
        winterFlowStackHandlerArr[0].WinterFlowRouterStructure(winterFlowLoaderScheduler.WinterFlowArrayNetwork, Integer.bitCount(winterFlowLoaderScheduler.WinterFlowRouterStructure) * 2, 0);
        this.WinterFlowTransactionManagerStrategy = 0;
        WinterFlowRouterStructure();
    }

    public final int WinterFlowHookDataSource(int i) {
        WinterFlowStackHandler[] winterFlowStackHandlerArr = this.WinterFlowVariableVersionControl;
        WinterFlowStackHandler winterFlowStackHandler = winterFlowStackHandlerArr[i];
        int i2 = winterFlowStackHandler.WinterFlowUnitTestResponse;
        if (i2 < winterFlowStackHandler.WinterFlowTransactionManagerStrategy) {
            return i;
        }
        Object[] objArr = winterFlowStackHandler.WinterFlowVariableVersionControl;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        WinterFlowLoaderScheduler winterFlowLoaderScheduler = (WinterFlowLoaderScheduler) obj;
        if (i == 6) {
            WinterFlowStackHandler winterFlowStackHandler2 = winterFlowStackHandlerArr[i + 1];
            Object[] objArr2 = winterFlowLoaderScheduler.WinterFlowArrayNetwork;
            winterFlowStackHandler2.WinterFlowRouterStructure(objArr2, objArr2.length, 0);
        } else {
            winterFlowStackHandlerArr[i + 1].WinterFlowRouterStructure(winterFlowLoaderScheduler.WinterFlowArrayNetwork, Integer.bitCount(winterFlowLoaderScheduler.WinterFlowRouterStructure) * 2, 0);
        }
        return WinterFlowHookDataSource(i + 1);
    }

    public final void WinterFlowRouterStructure() {
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowStackHandler[] winterFlowStackHandlerArr = this.WinterFlowVariableVersionControl;
        WinterFlowStackHandler winterFlowStackHandler = winterFlowStackHandlerArr[i];
        if (winterFlowStackHandler.WinterFlowUnitTestResponse < winterFlowStackHandler.WinterFlowTransactionManagerStrategy) {
            return;
        }
        while (-1 < i) {
            int WinterFlowHookDataSource = WinterFlowHookDataSource(i);
            if (WinterFlowHookDataSource == -1) {
                WinterFlowStackHandler winterFlowStackHandler2 = winterFlowStackHandlerArr[i];
                int i2 = winterFlowStackHandler2.WinterFlowUnitTestResponse;
                Object[] objArr = winterFlowStackHandler2.WinterFlowVariableVersionControl;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    winterFlowStackHandler2.WinterFlowUnitTestResponse = i2 + 1;
                    WinterFlowHookDataSource = WinterFlowHookDataSource(i);
                }
            }
            if (WinterFlowHookDataSource != -1) {
                this.WinterFlowTransactionManagerStrategy = WinterFlowHookDataSource;
                return;
            }
            if (i > 0) {
                WinterFlowStackHandler winterFlowStackHandler3 = winterFlowStackHandlerArr[i - 1];
                int i3 = winterFlowStackHandler3.WinterFlowUnitTestResponse;
                int length2 = winterFlowStackHandler3.WinterFlowVariableVersionControl.length;
                winterFlowStackHandler3.WinterFlowUnitTestResponse = i3 + 1;
            }
            winterFlowStackHandlerArr[i].WinterFlowRouterStructure(WinterFlowLoaderScheduler.WinterFlowVariableVersionControl.WinterFlowArrayNetwork, 0, 0);
            i--;
        }
        this.WinterFlowUnitTestResponse = false;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.WinterFlowUnitTestResponse;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.WinterFlowUnitTestResponse) {
            WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
            return null;
        }
        Object next = this.WinterFlowVariableVersionControl[this.WinterFlowTransactionManagerStrategy].next();
        WinterFlowRouterStructure();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
