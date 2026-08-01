package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowHandlerDecorator extends WinterFlowStackHandler {
    public final /* synthetic */ int WinterFlowRouterRouter;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.WinterFlowRouterRouter) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i = this.WinterFlowUnitTestResponse;
                this.WinterFlowUnitTestResponse = i + 2;
                Object[] objArr = this.WinterFlowVariableVersionControl;
                return new WinterFlowCompilerHook(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.WinterFlowUnitTestResponse;
                this.WinterFlowUnitTestResponse = i2 + 2;
                return this.WinterFlowVariableVersionControl[i2];
            default:
                int i3 = this.WinterFlowUnitTestResponse;
                this.WinterFlowUnitTestResponse = i3 + 2;
                return this.WinterFlowVariableVersionControl[i3 + 1];
        }
    }
}
