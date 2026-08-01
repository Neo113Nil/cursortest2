package com.google.android.datatransport;

import com.adjust.sdk.GooglePlayInstallReferrerDetails;
import com.adjust.sdk.OnGooglePlayInstallReferrerReadListener;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCompilerXML implements WinterFlowDeserializationProcess, OnGooglePlayInstallReferrerReadListener {
    public final /* synthetic */ WinterFlowEventCloud WinterFlowVariableVersionControl;

    @Override // com.google.android.datatransport.WinterFlowDeserializationProcess
    public void WinterFlowRouterStructure(WinterFlowExceptionParser winterFlowExceptionParser) {
        boolean WinterFlowRouterRouter = winterFlowExceptionParser.WinterFlowRouterRouter();
        WinterFlowEventCloud winterFlowEventCloud = this.WinterFlowVariableVersionControl;
        if (winterFlowEventCloud.WinterFlowRouterAdapter() instanceof WinterFlowWorkerNetwork) {
            winterFlowEventCloud.WinterFlowSyntax(WinterFlowRouterRouter ? (String) winterFlowExceptionParser.WinterFlowTransactionManagerStrategy() : "");
        }
    }

    @Override // com.adjust.sdk.OnGooglePlayInstallReferrerReadListener
    public void onFail(String str) {
        WinterFlowEventCloud winterFlowEventCloud = this.WinterFlowVariableVersionControl;
        if (!(winterFlowEventCloud.WinterFlowRouterAdapter() instanceof WinterFlowWorkerNetwork)) {
            winterFlowEventCloud = null;
        }
        if (winterFlowEventCloud != null) {
            winterFlowEventCloud.WinterFlowSyntax("");
        }
    }

    @Override // com.adjust.sdk.OnGooglePlayInstallReferrerReadListener
    public void onInstallReferrerRead(GooglePlayInstallReferrerDetails googlePlayInstallReferrerDetails) {
        WinterFlowEventCloud winterFlowEventCloud = this.WinterFlowVariableVersionControl;
        if (!(winterFlowEventCloud.WinterFlowRouterAdapter() instanceof WinterFlowWorkerNetwork)) {
            winterFlowEventCloud = null;
        }
        if (winterFlowEventCloud != null) {
            String str = googlePlayInstallReferrerDetails != null ? googlePlayInstallReferrerDetails.installReferrer : null;
            if (str == null) {
                str = "";
            }
            winterFlowEventCloud.WinterFlowSyntax(str);
        }
    }
}
