package com.icewinter.flow.winter.icecatch;

import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.activity.ComponentActivity;
import com.adjust.sdk.Adjust;
import com.google.android.datatransport.WinterFlowAlgorithmArray;
import com.google.android.datatransport.WinterFlowBatchConsumer;
import com.google.android.datatransport.WinterFlowConfigurationModule;
import com.google.android.datatransport.WinterFlowEncryptionSystem;
import com.google.android.datatransport.WinterFlowEventTool;
import com.google.android.datatransport.WinterFlowFunctionHelper;
import com.google.android.datatransport.WinterFlowJSONDecorator;
import com.google.android.datatransport.WinterFlowListenerProtocol;
import com.google.android.datatransport.WinterFlowObjectPackage;
import com.google.android.datatransport.WinterFlowProxyProcess;
import com.google.android.datatransport.WinterFlowQueueProcess;
import com.google.android.datatransport.WinterFlowRendererNode;
import com.google.android.datatransport.WinterFlowRendererProxy;
import com.google.android.datatransport.WinterFlowRequestEngine;
import com.google.android.datatransport.WinterFlowRequestHandler;
import com.google.android.datatransport.WinterFlowSoftware;
import com.google.android.datatransport.WinterFlowUserManagerDatabase;
import com.google.android.datatransport.WinterFlowUserManagerHandler;
import com.google.android.datatransport.WinterFlowVersionControlDeployment;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class ColdActivity extends ComponentActivity {
    public static final /* synthetic */ int WinterFlowUserManagerUserManager = 0;
    public WinterFlowFunctionHelper WinterFlowArrayHelper;
    public final WinterFlowEncryptionSystem WinterFlowCacheManagerListener;
    public WinterFlowRendererProxy WinterFlowEventEmitterController;
    public final WinterFlowRequestEngine WinterFlowPackageIDE;
    public final WinterFlowAlgorithmArray WinterFlowCompilerVariable = new WinterFlowAlgorithmArray(this);
    public final WinterFlowObjectPackage WinterFlowConfigurationSubsystem = new WinterFlowObjectPackage(this);
    public final WinterFlowVersionControlDeployment WinterFlowStrategyTool = new WinterFlowVersionControlDeployment(1);
    public final WinterFlowRendererNode WinterFlowSoftwareProtocol = new WinterFlowRendererNode(new WinterFlowQueueProcess(this, 1));

    public ColdActivity() {
        int i = 0;
        this.WinterFlowCacheManagerListener = new WinterFlowEncryptionSystem(this, i);
        this.WinterFlowPackageIDE = new WinterFlowRequestEngine(WinterFlowListenerProtocol.WinterFlowRouterStructure(WinterFlowRequestHandler.class), new WinterFlowUserManagerDatabase(0, this), new WinterFlowQueueProcess(this, i), new WinterFlowUserManagerDatabase(1, this));
    }

    public static WebView WinterFlowTransactionAgent(RelativeLayout relativeLayout) {
        Object next;
        relativeLayout.getClass();
        WinterFlowSoftware winterFlowSoftware = new WinterFlowSoftware(3, relativeLayout);
        if (winterFlowSoftware.hasNext()) {
            next = winterFlowSoftware.next();
            while (winterFlowSoftware.hasNext()) {
                next = winterFlowSoftware.next();
            }
        } else {
            next = null;
        }
        if (next instanceof WebView) {
            return (WebView) next;
        }
        return null;
    }

    public final RelativeLayout WinterFlowServerProtocol() {
        return (RelativeLayout) this.WinterFlowSoftwareProtocol.getValue();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WinterFlowProxyProcess.WinterFlowRouterStructure(this);
        this.WinterFlowEventEmitterController = new WinterFlowRendererProxy(new WinterFlowConfigurationModule(23));
        this.WinterFlowArrayHelper = new WinterFlowFunctionHelper(new WinterFlowJSONDecorator(this.WinterFlowCacheManagerListener), this.WinterFlowCompilerVariable, this.WinterFlowConfigurationSubsystem, this.WinterFlowStrategyTool);
        WinterFlowUserManagerHandler.WinterFlowRouterStructure(this, new WinterFlowEventTool(1412693054, true, new WinterFlowBatchConsumer(this, 1)));
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        CookieManager.getInstance().flush();
        WebView WinterFlowTransactionAgent = WinterFlowTransactionAgent(WinterFlowServerProtocol());
        if (WinterFlowTransactionAgent != null) {
            WinterFlowTransactionAgent.onPause();
        }
        Adjust.onPause();
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onRestoreInstanceState(bundle);
        WebView WinterFlowTransactionAgent = WinterFlowTransactionAgent(WinterFlowServerProtocol());
        if (WinterFlowTransactionAgent != null) {
            WinterFlowTransactionAgent.restoreState(bundle);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        CookieManager.getInstance().flush();
        WebView WinterFlowTransactionAgent = WinterFlowTransactionAgent(WinterFlowServerProtocol());
        if (WinterFlowTransactionAgent != null) {
            WinterFlowTransactionAgent.onResume();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        WebView WinterFlowTransactionAgent = WinterFlowTransactionAgent(WinterFlowServerProtocol());
        if (WinterFlowTransactionAgent != null) {
            WinterFlowTransactionAgent.saveState(bundle);
        }
    }
}
