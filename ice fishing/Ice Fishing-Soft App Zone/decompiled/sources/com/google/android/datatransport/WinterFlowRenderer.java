package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRenderer extends WinterFlowServiceLayer {
    public Object[] WinterFlowRouterRouter;
    public boolean WinterFlowSyntax;
    public int WinterFlowUnitTestResponse;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public WinterFlowRenderer(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.WinterFlowUnitTestResponse = i3;
        Object[] objArr2 = new Object[i3];
        this.WinterFlowRouterRouter = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.WinterFlowSyntax = r5;
        objArr2[0] = objArr;
        WinterFlowHookDataSource(i - r5, 1);
    }

    public final void WinterFlowCacheManagerAgent(int i) {
        int i2 = 0;
        while (WinterFlowWorkerVersionControl.WinterFlowRouterRouter(this.WinterFlowVariableVersionControl, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            WinterFlowHookDataSource(this.WinterFlowVariableVersionControl, ((this.WinterFlowUnitTestResponse - 1) - (i2 / 5)) + 1);
        }
    }

    public final void WinterFlowHookDataSource(int i, int i2) {
        int i3 = (this.WinterFlowUnitTestResponse - i2) * 5;
        while (i2 < this.WinterFlowUnitTestResponse) {
            Object[] objArr = this.WinterFlowRouterRouter;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[WinterFlowWorkerVersionControl.WinterFlowRouterRouter(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final Object WinterFlowRouterStructure() {
        int i = this.WinterFlowVariableVersionControl & 31;
        Object obj = this.WinterFlowRouterRouter[this.WinterFlowUnitTestResponse - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
            return null;
        }
        Object WinterFlowRouterStructure = WinterFlowRouterStructure();
        int i = this.WinterFlowVariableVersionControl + 1;
        this.WinterFlowVariableVersionControl = i;
        if (i == this.WinterFlowTransactionManagerStrategy) {
            this.WinterFlowSyntax = true;
            return WinterFlowRouterStructure;
        }
        WinterFlowCacheManagerAgent(0);
        return WinterFlowRouterStructure;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
            return null;
        }
        this.WinterFlowVariableVersionControl--;
        if (this.WinterFlowSyntax) {
            this.WinterFlowSyntax = false;
            return WinterFlowRouterStructure();
        }
        WinterFlowCacheManagerAgent(31);
        return WinterFlowRouterStructure();
    }
}
