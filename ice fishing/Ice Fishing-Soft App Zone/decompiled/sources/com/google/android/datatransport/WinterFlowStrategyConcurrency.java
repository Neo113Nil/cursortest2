package com.google.android.datatransport;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowStrategyConcurrency implements WinterFlowInterfaceScript {
    public final /* synthetic */ WinterFlowValidatorProcess WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowStrategyConcurrency(WinterFlowValidatorProcess winterFlowValidatorProcess, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowValidatorProcess;
    }

    @Override // com.google.android.datatransport.WinterFlowInterfaceScript
    public final Object WinterFlowUnitTestResponse(WinterFlowRequestEngine winterFlowRequestEngine) {
        FirebaseMessaging lambda$getComponents$0;
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowValidatorProcess winterFlowValidatorProcess = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowDeserializationPlatform((Context) winterFlowRequestEngine.WinterFlowRouterStructure(Context.class), ((com.google.firebase.WinterFlowSyntaxEvent) winterFlowRequestEngine.WinterFlowRouterStructure(com.google.firebase.WinterFlowSyntaxEvent.class)).WinterFlowCacheManagerAgent(), winterFlowRequestEngine.WinterFlowCacheManagerAgent(WinterFlowValidatorProcess.WinterFlowRouterStructure(WinterFlowSessionManagerProcess.class)), winterFlowRequestEngine.WinterFlowArrayNetwork(WinterFlowListenerSystem.class), (Executor) winterFlowRequestEngine.WinterFlowVariableVersionControl(winterFlowValidatorProcess));
            default:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(winterFlowValidatorProcess, winterFlowRequestEngine);
                return lambda$getComponents$0;
        }
    }
}
