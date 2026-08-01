package com.google.android.datatransport;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServerMechanism extends WinterFlowServiceLayer {
    public int WinterFlowResponseEngine;
    public int WinterFlowRouterRouter;
    public WinterFlowRenderer WinterFlowSyntax;
    public final WinterFlowDataSourceController WinterFlowUnitTestResponse;

    public WinterFlowServerMechanism(WinterFlowDataSourceController winterFlowDataSourceController, int i) {
        super(i, winterFlowDataSourceController.WinterFlowServerProtocol);
        this.WinterFlowUnitTestResponse = winterFlowDataSourceController;
        this.WinterFlowRouterRouter = winterFlowDataSourceController.WinterFlowTransactionManagerStrategy();
        this.WinterFlowResponseEngine = -1;
        WinterFlowHookDataSource();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void WinterFlowHookDataSource() {
        WinterFlowDataSourceController winterFlowDataSourceController = this.WinterFlowUnitTestResponse;
        Object[] objArr = winterFlowDataSourceController.WinterFlowResponseEngine;
        if (objArr == null) {
            this.WinterFlowSyntax = null;
            return;
        }
        int i = (winterFlowDataSourceController.WinterFlowServerProtocol - 1) & (-32);
        int i2 = this.WinterFlowVariableVersionControl;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (winterFlowDataSourceController.WinterFlowRouterRouter / 5) + 1;
        WinterFlowRenderer winterFlowRenderer = this.WinterFlowSyntax;
        if (winterFlowRenderer == null) {
            this.WinterFlowSyntax = new WinterFlowRenderer(objArr, i2, i, i3);
            return;
        }
        winterFlowRenderer.WinterFlowVariableVersionControl = i2;
        winterFlowRenderer.WinterFlowTransactionManagerStrategy = i;
        winterFlowRenderer.WinterFlowUnitTestResponse = i3;
        Object[] objArr2 = winterFlowRenderer.WinterFlowRouterRouter;
        if (objArr2.length < i3) {
            objArr2 = new Object[i3];
            winterFlowRenderer.WinterFlowRouterRouter = objArr2;
        }
        objArr2[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        winterFlowRenderer.WinterFlowSyntax = r0;
        winterFlowRenderer.WinterFlowHookDataSource(i2 - r0, 1);
    }

    public final void WinterFlowRouterStructure() {
        if (this.WinterFlowRouterRouter != this.WinterFlowUnitTestResponse.WinterFlowTransactionManagerStrategy()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowServiceLayer, java.util.ListIterator
    public final void add(Object obj) {
        WinterFlowRouterStructure();
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowDataSourceController winterFlowDataSourceController = this.WinterFlowUnitTestResponse;
        winterFlowDataSourceController.add(i, obj);
        this.WinterFlowVariableVersionControl++;
        this.WinterFlowTransactionManagerStrategy = winterFlowDataSourceController.WinterFlowRouterStructure();
        this.WinterFlowRouterRouter = winterFlowDataSourceController.WinterFlowTransactionManagerStrategy();
        this.WinterFlowResponseEngine = -1;
        WinterFlowHookDataSource();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        WinterFlowRouterStructure();
        if (!hasNext()) {
            WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
            return null;
        }
        int i = this.WinterFlowVariableVersionControl;
        this.WinterFlowResponseEngine = i;
        WinterFlowRenderer winterFlowRenderer = this.WinterFlowSyntax;
        WinterFlowDataSourceController winterFlowDataSourceController = this.WinterFlowUnitTestResponse;
        if (winterFlowRenderer == null) {
            Object[] objArr = winterFlowDataSourceController.WinterFlowTransactionAgent;
            this.WinterFlowVariableVersionControl = i + 1;
            return objArr[i];
        }
        if (winterFlowRenderer.hasNext()) {
            this.WinterFlowVariableVersionControl++;
            return winterFlowRenderer.next();
        }
        Object[] objArr2 = winterFlowDataSourceController.WinterFlowTransactionAgent;
        int i2 = this.WinterFlowVariableVersionControl;
        this.WinterFlowVariableVersionControl = i2 + 1;
        return objArr2[i2 - winterFlowRenderer.WinterFlowTransactionManagerStrategy];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        WinterFlowRouterStructure();
        if (!hasPrevious()) {
            WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
            return null;
        }
        int i = this.WinterFlowVariableVersionControl;
        this.WinterFlowResponseEngine = i - 1;
        WinterFlowRenderer winterFlowRenderer = this.WinterFlowSyntax;
        WinterFlowDataSourceController winterFlowDataSourceController = this.WinterFlowUnitTestResponse;
        if (winterFlowRenderer == null) {
            Object[] objArr = winterFlowDataSourceController.WinterFlowTransactionAgent;
            int i2 = i - 1;
            this.WinterFlowVariableVersionControl = i2;
            return objArr[i2];
        }
        int i3 = winterFlowRenderer.WinterFlowTransactionManagerStrategy;
        if (i <= i3) {
            this.WinterFlowVariableVersionControl = i - 1;
            return winterFlowRenderer.previous();
        }
        Object[] objArr2 = winterFlowDataSourceController.WinterFlowTransactionAgent;
        int i4 = i - 1;
        this.WinterFlowVariableVersionControl = i4;
        return objArr2[i4 - i3];
    }

    @Override // com.google.android.datatransport.WinterFlowServiceLayer, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        WinterFlowRouterStructure();
        int i = this.WinterFlowResponseEngine;
        if (i == -1) {
            throw new IllegalStateException();
        }
        WinterFlowDataSourceController winterFlowDataSourceController = this.WinterFlowUnitTestResponse;
        winterFlowDataSourceController.WinterFlowCacheManagerAgent(i);
        int i2 = this.WinterFlowResponseEngine;
        if (i2 < this.WinterFlowVariableVersionControl) {
            this.WinterFlowVariableVersionControl = i2;
        }
        this.WinterFlowTransactionManagerStrategy = winterFlowDataSourceController.WinterFlowRouterStructure();
        this.WinterFlowRouterRouter = winterFlowDataSourceController.WinterFlowTransactionManagerStrategy();
        this.WinterFlowResponseEngine = -1;
        WinterFlowHookDataSource();
    }

    @Override // com.google.android.datatransport.WinterFlowServiceLayer, java.util.ListIterator
    public final void set(Object obj) {
        WinterFlowRouterStructure();
        int i = this.WinterFlowResponseEngine;
        if (i == -1) {
            throw new IllegalStateException();
        }
        WinterFlowDataSourceController winterFlowDataSourceController = this.WinterFlowUnitTestResponse;
        winterFlowDataSourceController.set(i, obj);
        this.WinterFlowRouterRouter = winterFlowDataSourceController.WinterFlowTransactionManagerStrategy();
        WinterFlowHookDataSource();
    }
}
