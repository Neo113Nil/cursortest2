package com.google.android.datatransport;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowIDERepository implements WinterFlowCacheManagerInterface {
    public final /* synthetic */ Object WinterFlowCacheManagerAgent;
    public final /* synthetic */ Object WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowIDERepository(int i, Object obj, Object obj2) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = obj;
        this.WinterFlowCacheManagerAgent = obj2;
    }

    @Override // com.google.android.datatransport.WinterFlowCacheManagerInterface
    public final void WinterFlowRouterStructure() {
        int i = this.WinterFlowRouterStructure;
        Object obj = this.WinterFlowCacheManagerAgent;
        Object obj2 = this.WinterFlowHookDataSource;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((WinterFlowIDEOrchestration) obj2).WinterFlowHookDataSource((WinterFlowUnitTestRefactoring) obj);
                break;
            case 1:
                ((WinterFlowLibrarySessionManager) obj2).WinterFlowServerProtocol.WinterFlowResponseEngine.WinterFlowTransactionManagerStrategy((WinterFlowHandlerSessionManager) obj);
                break;
            case 2:
                ((WinterFlowObjectUserManager) obj2).WinterFlowUnitTestResponse.WinterFlowTransactionAgent(obj);
                break;
            case 3:
                Iterator it = ((List) ((WinterFlowBatchCacheManager) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((WinterFlowCacheException) obj).WinterFlowHookDataSource().WinterFlowCacheManagerAgent((WinterFlowLibrarySessionManager) it.next());
                }
                break;
            case 4:
                ((WinterFlowIDEOrchestration) obj2).WinterFlowHookDataSource((WinterFlowDataSourceResolver) obj);
                break;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                ((WinterFlowHandlerInvoker) obj2).WinterFlowResponseEngine.remove((WinterFlowHandlerInvoker) obj);
                break;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                WinterFlowHandlerInvoker winterFlowHandlerInvoker = (WinterFlowHandlerInvoker) obj2;
                winterFlowHandlerInvoker.getClass();
                WinterFlowVariableClass winterFlowVariableClass = (WinterFlowVariableClass) ((WinterFlowListenerSyntax) obj).WinterFlowHookDataSource.getValue();
                if (winterFlowVariableClass != null) {
                    winterFlowHandlerInvoker.WinterFlowSyntax.remove(winterFlowVariableClass.WinterFlowVariableVersionControl);
                    break;
                }
                break;
            default:
                WinterFlowBandwidthProcess winterFlowBandwidthProcess = (WinterFlowBandwidthProcess) obj2;
                View view = (View) obj;
                int i2 = winterFlowBandwidthProcess.WinterFlowBatchUI - 1;
                winterFlowBandwidthProcess.WinterFlowBatchUI = i2;
                if (i2 == 0) {
                    int i3 = WinterFlowIDEComponent.WinterFlowRouterStructure;
                    WinterFlowIDEEvent.WinterFlowHookDataSource(view, null);
                    WinterFlowValidatorEngine.WinterFlowRouterStructure(view, null);
                    view.removeOnAttachStateChangeListener(winterFlowBandwidthProcess.WinterFlowRouterAdapter);
                    break;
                }
                break;
        }
    }
}
