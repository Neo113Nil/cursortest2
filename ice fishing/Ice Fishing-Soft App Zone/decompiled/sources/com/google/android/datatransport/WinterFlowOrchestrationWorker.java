package com.google.android.datatransport;

import android.content.SharedPreferences;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowOrchestrationWorker implements WinterFlowObjectUI {
    public final /* synthetic */ WinterFlowSyntaxMechanism WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowJavaManager WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowOrchestrationWorker(WinterFlowSyntaxMechanism winterFlowSyntaxMechanism, WinterFlowJavaManager winterFlowJavaManager, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowSyntaxMechanism;
        this.WinterFlowUnitTestResponse = winterFlowJavaManager;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowJavaManager winterFlowJavaManager = this.WinterFlowUnitTestResponse;
        WinterFlowSyntaxMechanism winterFlowSyntaxMechanism = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                winterFlowSyntaxMechanism.WinterFlowVariableVersionControl(winterFlowJavaManager);
                break;
            default:
                SharedPreferences sharedPreferences = winterFlowSyntaxMechanism.WinterFlowHookDataSource;
                WinterFlowHandlerPlatform winterFlowHandlerPlatform = winterFlowSyntaxMechanism.WinterFlowRouterRouter;
                WinterFlowHandlerPlatform winterFlowHandlerPlatform2 = winterFlowSyntaxMechanism.WinterFlowArrayNetwork;
                int intValue = ((Number) winterFlowHandlerPlatform2.getValue()).intValue();
                int i2 = winterFlowJavaManager.WinterFlowUnitTestResponse;
                if (intValue >= i2 && !((Set) winterFlowHandlerPlatform.getValue()).contains(winterFlowJavaManager)) {
                    int i3 = intValue - i2;
                    winterFlowHandlerPlatform2.WinterFlowTransactionAgent(null, Integer.valueOf(i3));
                    sharedPreferences.edit().putInt("PREF_USER_POINTS", i3).apply();
                    winterFlowHandlerPlatform.WinterFlowTransactionAgent(null, WinterFlowSchedulerRefactoring.WinterFlowServerProtocol((Set) winterFlowHandlerPlatform.getValue(), winterFlowJavaManager));
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.getClass();
                    edit.putBoolean(winterFlowSyntaxMechanism.WinterFlowCacheManagerAgent + winterFlowJavaManager.name(), true);
                    edit.apply();
                    winterFlowSyntaxMechanism.WinterFlowVariableVersionControl(winterFlowJavaManager);
                    break;
                }
                break;
        }
        return winterFlowAlgorithmSession;
    }
}
