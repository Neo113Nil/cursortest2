package com.icewinter.flow.winter.icecatch;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.google.android.datatransport.WinterFlowEventFramework;
import com.google.android.datatransport.WinterFlowEventTool;
import com.google.android.datatransport.WinterFlowFrontendJava;
import com.google.android.datatransport.WinterFlowManagerRequest;
import com.google.android.datatransport.WinterFlowObjectManager;
import com.google.android.datatransport.WinterFlowPackageResponse;
import com.google.android.datatransport.WinterFlowProxyProcess;
import com.google.android.datatransport.WinterFlowUnitTestLibrary;
import com.google.android.datatransport.WinterFlowUserManagerHandler;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class RunningActivity extends ComponentActivity {
    public static final /* synthetic */ int WinterFlowCompilerVariable = 0;
    public WinterFlowEventFramework WinterFlowArrayHelper;
    public final List WinterFlowEventEmitterController = WinterFlowUnitTestLibrary.WinterFlowCacheManagerListener("android.permission.POST_NOTIFICATIONS");

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WinterFlowProxyProcess.WinterFlowRouterStructure(this);
        WinterFlowUserManagerHandler.WinterFlowRouterStructure(this, new WinterFlowEventTool(1008423918, true, new WinterFlowFrontendJava(this, 1)));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        WinterFlowPackageResponse winterFlowPackageResponse;
        WinterFlowObjectManager winterFlowObjectManager;
        super.onDestroy();
        WinterFlowEventFramework winterFlowEventFramework = this.WinterFlowArrayHelper;
        if (winterFlowEventFramework == null || (winterFlowObjectManager = (winterFlowPackageResponse = (WinterFlowPackageResponse) winterFlowEventFramework.WinterFlowUnitTestResponse.getValue()).WinterFlowCacheManagerAgent) == null || winterFlowObjectManager.WinterFlowServerProtocol.WinterFlowSyntax != 2) {
            return;
        }
        WinterFlowObjectManager winterFlowObjectManager2 = winterFlowPackageResponse.WinterFlowCacheManagerAgent;
        if (winterFlowObjectManager2 != null) {
            winterFlowObjectManager2.WinterFlowRouterStructure();
        } else {
            WinterFlowManagerRequest.WinterFlowCloudMicroservice("client");
            throw null;
        }
    }
}
