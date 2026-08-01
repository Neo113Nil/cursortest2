package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowConcurrencyUtility implements Runnable {
    public final /* synthetic */ WinterFlowConcurrencyObject WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowConcurrencyUtility(WinterFlowConcurrencyObject winterFlowConcurrencyObject, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowConcurrencyObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowConcurrencyObject winterFlowConcurrencyObject = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                winterFlowConcurrencyObject.WinterFlowBandwidthObject.onDismiss(null);
                break;
            default:
                if (winterFlowConcurrencyObject.WinterFlowSyntax != null && winterFlowConcurrencyObject.WinterFlowSyntax == null) {
                    WinterFlowObjectPackage winterFlowObjectPackage = new WinterFlowObjectPackage(12, false);
                    Object obj = WinterFlowConcurrencyObject.WinterFlowBatchUI;
                    winterFlowObjectPackage.WinterFlowTransactionManagerStrategy = obj;
                    winterFlowObjectPackage.WinterFlowUnitTestResponse = obj;
                    winterFlowObjectPackage.WinterFlowRouterRouter = obj;
                    winterFlowConcurrencyObject.WinterFlowSyntax = winterFlowObjectPackage;
                    break;
                }
                break;
        }
    }
}
