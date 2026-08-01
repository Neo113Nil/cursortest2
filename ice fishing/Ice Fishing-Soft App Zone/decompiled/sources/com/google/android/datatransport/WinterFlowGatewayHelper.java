package com.google.android.datatransport;

import android.content.Intent;
import android.content.IntentSender;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowGatewayHelper implements Runnable {
    public final /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowGatewayHelper(int i, int i2, Object obj, Object obj2) {
        this.WinterFlowVariableVersionControl = i2;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = i;
        this.WinterFlowRouterRouter = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowRouterRouter;
        int i2 = this.WinterFlowUnitTestResponse;
        Object obj2 = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowResolverProcess winterFlowResolverProcess = (WinterFlowResolverProcess) obj2;
                Object obj3 = ((WinterFlowNodeEngine) obj).WinterFlowRouterStructure;
                String str = (String) winterFlowResolverProcess.WinterFlowRouterStructure.get(Integer.valueOf(i2));
                if (str != null) {
                    WinterFlowRefactoringAPI winterFlowRefactoringAPI = (WinterFlowRefactoringAPI) winterFlowResolverProcess.WinterFlowVariableVersionControl.get(str);
                    if ((winterFlowRefactoringAPI != null ? winterFlowRefactoringAPI.WinterFlowRouterStructure : null) != null) {
                        WinterFlowExceptionBandwidth winterFlowExceptionBandwidth = winterFlowRefactoringAPI.WinterFlowRouterStructure;
                        if (winterFlowResolverProcess.WinterFlowArrayNetwork.remove(str)) {
                            winterFlowExceptionBandwidth.WinterFlowTransactionManagerStrategy(obj3);
                            break;
                        }
                    } else {
                        winterFlowResolverProcess.WinterFlowUnitTestResponse.remove(str);
                        winterFlowResolverProcess.WinterFlowTransactionManagerStrategy.put(str, obj3);
                        break;
                    }
                }
                break;
            case 1:
                ((WinterFlowResolverProcess) obj2).WinterFlowRouterStructure(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            default:
                ((WinterFlowUnitTestLayer) obj2).WinterFlowHookDataSource.WinterFlowSyntax(i2, obj);
                break;
        }
    }
}
