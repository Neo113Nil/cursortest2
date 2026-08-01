package com.google.android.datatransport;

import android.content.Intent;
import com.android.installreferrer.api.InstallReferrerClient;
import com.icewinter.flow.winter.icecatch.ColdActivity;
import com.icewinter.flow.winter.icecatch.RunningActivity;
import com.icewinter.flow.winter.icecatch.WinterGameActivity;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCloudComponent implements WinterFlowCacheInterface {
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowCloudComponent(int i, Object obj) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    @Override // com.google.android.datatransport.WinterFlowCacheInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WinterFlowRouterRouter(Object obj, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowEncryptionQueue winterFlowEncryptionQueue;
        int i;
        Object WinterFlowRouterRouter;
        Class cls;
        int i2 = this.WinterFlowVariableVersionControl;
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj2 = this.WinterFlowTransactionManagerStrategy;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (winterFlowTransactionManagerLayer instanceof WinterFlowEncryptionQueue) {
                    winterFlowEncryptionQueue = (WinterFlowEncryptionQueue) winterFlowTransactionManagerLayer;
                    int i3 = winterFlowEncryptionQueue.WinterFlowSyntax;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        winterFlowEncryptionQueue.WinterFlowSyntax = i3 - Integer.MIN_VALUE;
                        Object obj3 = winterFlowEncryptionQueue.WinterFlowRouterRouter;
                        i = winterFlowEncryptionQueue.WinterFlowSyntax;
                        if (i == 0) {
                            if (i == 1) {
                                WinterFlowPackageProcess.WinterFlowThreadListener(obj3);
                                return winterFlowAlgorithmSession;
                            }
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj3);
                        WinterFlowCacheInterface winterFlowCacheInterface = (WinterFlowCacheInterface) obj2;
                        WinterFlowValidatorBandwidth winterFlowValidatorBandwidth = (WinterFlowValidatorBandwidth) obj;
                        if (winterFlowValidatorBandwidth instanceof WinterFlowDecoratorServiceProvider) {
                            throw ((WinterFlowDecoratorServiceProvider) winterFlowValidatorBandwidth).WinterFlowHookDataSource;
                        }
                        if (!(winterFlowValidatorBandwidth instanceof WinterFlowDebugMechanism)) {
                            if (winterFlowValidatorBandwidth instanceof WinterFlowArrayTool ? true : winterFlowValidatorBandwidth instanceof WinterFlowMicroservice) {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            } else {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                            }
                            return null;
                        }
                        Object obj4 = ((WinterFlowDebugMechanism) winterFlowValidatorBandwidth).WinterFlowHookDataSource;
                        winterFlowEncryptionQueue.WinterFlowSyntax = 1;
                        if (winterFlowCacheInterface.WinterFlowRouterRouter(obj4, winterFlowEncryptionQueue) == winterFlowListenerJava) {
                            return winterFlowListenerJava;
                        }
                        return winterFlowAlgorithmSession;
                    }
                }
                winterFlowEncryptionQueue = new WinterFlowEncryptionQueue(this, winterFlowTransactionManagerLayer);
                Object obj32 = winterFlowEncryptionQueue.WinterFlowRouterRouter;
                i = winterFlowEncryptionQueue.WinterFlowSyntax;
                if (i == 0) {
                }
            case 1:
                WinterFlowStrategyResolver winterFlowStrategyResolver = (WinterFlowStrategyResolver) obj2;
                return ((winterFlowStrategyResolver.WinterFlowServerProtocol.WinterFlowHookDataSource() instanceof WinterFlowArrayTool) || (WinterFlowRouterRouter = winterFlowStrategyResolver.WinterFlowRouterRouter(true, winterFlowTransactionManagerLayer)) != winterFlowListenerJava) ? winterFlowAlgorithmSession : WinterFlowRouterRouter;
            case 2:
                ((WinterFlowBandwidthCache) obj2).WinterFlowVariableVersionControl = obj;
                throw new WinterFlowSyntaxEvent(this);
            case 3:
                ((WinterFlowProcessorAgent) obj2).WinterFlowUnitTestResponse.WinterFlowSyntax(((Number) obj).floatValue());
                return winterFlowAlgorithmSession;
            default:
                RunningActivity runningActivity = (RunningActivity) obj2;
                int ordinal = ((WinterFlowSerializerLibrary) obj).ordinal();
                if (ordinal == 0) {
                    cls = ColdActivity.class;
                } else {
                    if (ordinal != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                        return null;
                    }
                    cls = WinterGameActivity.class;
                }
                runningActivity.startActivity(new Intent(runningActivity, (Class<?>) cls));
                runningActivity.finish();
                return winterFlowAlgorithmSession;
        }
    }
}
