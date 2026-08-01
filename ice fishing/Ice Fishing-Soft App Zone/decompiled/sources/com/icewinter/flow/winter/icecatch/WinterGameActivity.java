package com.icewinter.flow.winter.icecatch;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.google.android.datatransport.WinterFlowInvokerComponent;
import com.google.android.datatransport.WinterFlowProxyProcess;
import com.google.android.datatransport.WinterFlowUserManagerHandler;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterGameActivity extends ComponentActivity {
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WinterFlowProxyProcess.WinterFlowRouterStructure(this);
        WinterFlowUserManagerHandler.WinterFlowRouterStructure(this, WinterFlowInvokerComponent.WinterFlowSyntax);
    }
}
