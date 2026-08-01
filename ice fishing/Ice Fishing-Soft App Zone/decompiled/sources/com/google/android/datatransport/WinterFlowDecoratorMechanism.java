package com.google.android.datatransport;

import androidx.activity.ComponentActivity;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowDecoratorMechanism implements Runnable {
    public final /* synthetic */ ComponentActivity WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowDecoratorMechanism(ComponentActivity componentActivity, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.WinterFlowVariableVersionControl;
        ComponentActivity componentActivity = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ComponentActivity.WinterFlowSyntax(componentActivity);
                break;
            default:
                int i2 = ComponentActivity.WinterFlowBackendCacheManager;
                componentActivity.invalidateOptionsMenu();
                break;
        }
    }
}
