package com.google.android.datatransport;

import android.os.Looper;
import android.view.Choreographer;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Random;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowValidatorProtocol extends ThreadLocal {
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowValidatorProtocol(int i) {
        this.WinterFlowRouterStructure = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    WinterFlowServerHook winterFlowServerHook = new WinterFlowServerHook(choreographer, WinterFlowServerManager.WinterFlowServiceUtility(myLooper));
                    return WinterFlowTestingCloud.WinterFlowArrayHelper(winterFlowServerHook, winterFlowServerHook.WinterFlowOrchestrationSubsystem);
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("no Looper on this thread");
                return null;
            default:
                return new Random();
        }
    }
}
