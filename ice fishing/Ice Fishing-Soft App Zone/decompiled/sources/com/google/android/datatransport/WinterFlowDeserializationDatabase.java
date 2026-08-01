package com.google.android.datatransport;

import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDeserializationDatabase extends WinterFlowDebugFramework implements WinterFlowObjectSession {
    public final /* synthetic */ int WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowServiceProviderController WinterFlowUnitTestResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowDeserializationDatabase(WinterFlowServiceProviderController winterFlowServiceProviderController, int i) {
        super(1);
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = winterFlowServiceProviderController;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        boolean dispatchTouchEvent;
        int i = this.WinterFlowTransactionManagerStrategy;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowServiceProviderController winterFlowServiceProviderController = this.WinterFlowUnitTestResponse;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowListenerService winterFlowListenerService = (WinterFlowListenerService) obj;
                WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager = winterFlowListenerService instanceof WinterFlowSyntaxTransactionManager ? (WinterFlowSyntaxTransactionManager) winterFlowListenerService : null;
                if (winterFlowSyntaxTransactionManager != null) {
                    winterFlowSyntaxTransactionManager.getAndroidViewsHandler$ui().removeViewInLayout(winterFlowServiceProviderController);
                    WinterFlowUnitTestLibrary.WinterFlowSyntax(winterFlowSyntaxTransactionManager.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(winterFlowSyntaxTransactionManager.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(winterFlowServiceProviderController));
                    winterFlowServiceProviderController.setImportantForAccessibility(0);
                }
                winterFlowServiceProviderController.removeAllViewsInLayout();
                return winterFlowAlgorithmSession;
            case 1:
                winterFlowServiceProviderController.WinterFlowRouterAdapter = (WinterFlowObjectSession) obj;
                return winterFlowAlgorithmSession;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        dispatchTouchEvent = winterFlowServiceProviderController.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = winterFlowServiceProviderController.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
        }
    }
}
