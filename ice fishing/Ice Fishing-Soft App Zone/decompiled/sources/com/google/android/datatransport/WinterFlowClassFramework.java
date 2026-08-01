package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowClassFramework extends WinterFlowServiceLayer {
    public final Object WinterFlowRouterRouter;
    public final /* synthetic */ int WinterFlowUnitTestResponse = 1;

    public WinterFlowClassFramework(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.WinterFlowRouterRouter = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.WinterFlowUnitTestResponse;
        Object obj = this.WinterFlowRouterRouter;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!hasNext()) {
                    WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
                    break;
                } else {
                    int i2 = this.WinterFlowVariableVersionControl;
                    this.WinterFlowVariableVersionControl = i2 + 1;
                    break;
                }
            default:
                if (!hasNext()) {
                    WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
                    break;
                } else {
                    this.WinterFlowVariableVersionControl++;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.WinterFlowUnitTestResponse;
        Object obj = this.WinterFlowRouterRouter;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!hasPrevious()) {
                    WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
                    break;
                } else {
                    int i2 = this.WinterFlowVariableVersionControl - 1;
                    this.WinterFlowVariableVersionControl = i2;
                    break;
                }
            default:
                if (!hasPrevious()) {
                    WinterFlowEventEmitterOrchestration.WinterFlowThreadListener();
                    break;
                } else {
                    this.WinterFlowVariableVersionControl--;
                    break;
                }
        }
        return null;
    }

    public WinterFlowClassFramework(int i, Object obj) {
        super(i, 1);
        this.WinterFlowRouterRouter = obj;
    }
}
