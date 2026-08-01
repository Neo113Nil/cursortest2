package com.google.android.datatransport;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowXMLSoftware extends WinterFlowUserManagerController implements WinterFlowNetworkPlatform, ViewTreeObserver.OnGlobalFocusChangeListener {
    public final WinterFlowDatabaseSchemaLibrary WinterFlowBatchUI = new WinterFlowDatabaseSchemaLibrary(this, 0);
    public final WinterFlowDatabaseSchemaLibrary WinterFlowRouterAdapter = new WinterFlowDatabaseSchemaLibrary(this, 1);
    public ViewTreeObserver WinterFlowVariableBandwidth;

    @Override // com.google.android.datatransport.WinterFlowNetworkPlatform
    public final void WinterFlowConcurrencyThread(WinterFlowBackendServer winterFlowBackendServer) {
        winterFlowBackendServer.WinterFlowHookDataSource(false);
        winterFlowBackendServer.WinterFlowCacheManagerAgent(this.WinterFlowBatchUI);
        winterFlowBackendServer.WinterFlowArrayNetwork(this.WinterFlowRouterAdapter);
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerController
    public final void WinterFlowSingletonWidget() {
        ViewTreeObserver viewTreeObserver = WinterFlowTestingCloud.WinterFlowCacheManagerListener(this).getViewTreeObserver();
        this.WinterFlowVariableBandwidth = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerController
    public final void WinterFlowTestingTransactionManager() {
        ViewTreeObserver viewTreeObserver = this.WinterFlowVariableBandwidth;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.WinterFlowVariableBandwidth = null;
        WinterFlowTestingCloud.WinterFlowCacheManagerListener(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    public final WinterFlowDeploymentWidget WinterFlowValidatorNetwork() {
        boolean z;
        if (!this.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            WinterFlowViewUtility.WinterFlowHookDataSource("visitLocalDescendants called on an unattached node");
        }
        WinterFlowUserManagerController winterFlowUserManagerController = this.WinterFlowVariableVersionControl;
        if ((winterFlowUserManagerController.WinterFlowRouterRouter & 1024) != 0) {
            boolean z2 = false;
            for (WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowUserManagerController.WinterFlowResponseEngine; winterFlowUserManagerController2 != null; winterFlowUserManagerController2 = winterFlowUserManagerController2.WinterFlowResponseEngine) {
                if ((winterFlowUserManagerController2.WinterFlowUnitTestResponse & 1024) != 0) {
                    WinterFlowUserManagerController winterFlowUserManagerController3 = winterFlowUserManagerController2;
                    WinterFlowJSON winterFlowJSON = null;
                    while (winterFlowUserManagerController3 != null) {
                        if (winterFlowUserManagerController3 instanceof WinterFlowDeploymentWidget) {
                            WinterFlowDeploymentWidget winterFlowDeploymentWidget = (WinterFlowDeploymentWidget) winterFlowUserManagerController3;
                            if (z2) {
                                return winterFlowDeploymentWidget;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (winterFlowUserManagerController3.WinterFlowUnitTestResponse & 1024) != 0 && (winterFlowUserManagerController3 instanceof WinterFlowTestingEntity)) {
                            int i = 0;
                            for (WinterFlowUserManagerController winterFlowUserManagerController4 = ((WinterFlowTestingEntity) winterFlowUserManagerController3).WinterFlowBatchUI; winterFlowUserManagerController4 != null; winterFlowUserManagerController4 = winterFlowUserManagerController4.WinterFlowResponseEngine) {
                                if ((winterFlowUserManagerController4.WinterFlowUnitTestResponse & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        winterFlowUserManagerController3 = winterFlowUserManagerController4;
                                    } else {
                                        if (winterFlowJSON == null) {
                                            winterFlowJSON = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                        }
                                        if (winterFlowUserManagerController3 != null) {
                                            winterFlowJSON.WinterFlowHookDataSource(winterFlowUserManagerController3);
                                            winterFlowUserManagerController3 = null;
                                        }
                                        winterFlowJSON.WinterFlowHookDataSource(winterFlowUserManagerController4);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        winterFlowUserManagerController3 = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON);
                    }
                }
            }
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        boolean z2;
        if (WinterFlowCloudStack.WinterFlowSyntaxSubsystem(this).WinterFlowSingletonPlatform == null) {
            return;
        }
        View WinterFlowSingletonPlatform = WinterFlowServerManager.WinterFlowSingletonPlatform(this);
        WinterFlowProtocolArray focusOwner = ((WinterFlowSyntaxTransactionManager) WinterFlowCloudStack.WinterFlowTestingNode(this)).getFocusOwner();
        WinterFlowListenerService WinterFlowTestingNode = WinterFlowCloudStack.WinterFlowTestingNode(this);
        if (view != null && !view.equals(WinterFlowTestingNode)) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == WinterFlowSingletonPlatform.getParent()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (view2 != null && !view2.equals(WinterFlowTestingNode)) {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == WinterFlowSingletonPlatform.getParent()) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (z && z2) {
            return;
        }
        if (!z2) {
            if (z && WinterFlowValidatorNetwork().WinterFlowEncryptionAdapter().WinterFlowRouterStructure()) {
                ((WinterFlowHookMechanism) focusOwner).WinterFlowHookDataSource(8, false, false);
                return;
            }
            return;
        }
        WinterFlowDeploymentWidget WinterFlowValidatorNetwork = WinterFlowValidatorNetwork();
        int ordinal = WinterFlowValidatorNetwork.WinterFlowEncryptionAdapter().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return;
        }
        if (ordinal == 3) {
            WinterFlowManagerRequest.WinterFlowSoftwareEngine(WinterFlowValidatorNetwork);
        } else {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
        }
    }
}
