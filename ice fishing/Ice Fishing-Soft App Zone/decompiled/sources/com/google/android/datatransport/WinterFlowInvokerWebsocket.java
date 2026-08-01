package com.google.android.datatransport;

import android.graphics.Typeface;
import android.text.Spannable;
import com.android.installreferrer.api.InstallReferrerClient;
import com.icewinter.flow.winter.icecatch.RunningActivity;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowInvokerWebsocket implements WinterFlowControllerScript {
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowInvokerWebsocket(int i, Object obj, Object obj2) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = obj2;
    }

    @Override // com.google.android.datatransport.WinterFlowControllerScript
    public final Object WinterFlowArrayNetwork(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj4 = this.WinterFlowUnitTestResponse;
        Object obj5 = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowSerializerLayer winterFlowSerializerLayer = (WinterFlowSerializerLayer) obj5;
                RunningActivity runningActivity = (RunningActivity) obj4;
                WinterFlowRefactoringManager winterFlowRefactoringManager = (WinterFlowRefactoringManager) obj;
                WinterFlowResolverLibrary winterFlowResolverLibrary = (WinterFlowResolverLibrary) obj2;
                int intValue = ((Integer) obj3).intValue();
                int i2 = RunningActivity.WinterFlowCompilerVariable;
                winterFlowRefactoringManager.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowRefactoringManager) ? 4 : 2;
                }
                if (!winterFlowResolverLibrary.WinterFlowFrontendBackend(intValue & 1, (intValue & 19) != 18)) {
                    winterFlowResolverLibrary.WinterFlowQueueService();
                    break;
                } else {
                    WinterFlowCloudStack.WinterFlowHookDataSource(WinterFlowCacheRuntime.WinterFlowUserManagerUserManager(WinterFlowCacheRuntime.WinterFlowThreadListener, winterFlowRefactoringManager), winterFlowResolverLibrary, 0);
                    boolean WinterFlowUnitTestResponse = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowSerializerLayer) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(runningActivity);
                    Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                    if (WinterFlowUnitTestResponse || WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
                        WinterFlowSyntaxSubsystem = new WinterFlowModuleStack(winterFlowSerializerLayer, runningActivity, null, 25);
                        winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
                    }
                    WinterFlowSoftwareException.WinterFlowArrayNetwork((WinterFlowEventEvent) WinterFlowSyntaxSubsystem, winterFlowResolverLibrary, winterFlowAlgorithmSession);
                    break;
                }
            default:
                Spannable spannable = (Spannable) obj5;
                WinterFlowDataSourceLibrary winterFlowDataSourceLibrary = (WinterFlowDataSourceLibrary) obj4;
                WinterFlowDebugUtility winterFlowDebugUtility = (WinterFlowDebugUtility) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int intValue3 = ((Integer) obj3).intValue();
                WinterFlowRendererSystem winterFlowRendererSystem = winterFlowDebugUtility.WinterFlowTransactionManagerStrategy;
                WinterFlowObjectHook winterFlowObjectHook = winterFlowDebugUtility.WinterFlowCacheManagerAgent;
                if (winterFlowObjectHook == null) {
                    winterFlowObjectHook = WinterFlowObjectHook.WinterFlowSyntax;
                }
                WinterFlowPackageTool winterFlowPackageTool = winterFlowDebugUtility.WinterFlowArrayNetwork;
                int i3 = winterFlowPackageTool != null ? winterFlowPackageTool.WinterFlowRouterStructure : 0;
                WinterFlowManagerResponse winterFlowManagerResponse = winterFlowDebugUtility.WinterFlowVariableVersionControl;
                int i4 = winterFlowManagerResponse != null ? winterFlowManagerResponse.WinterFlowRouterStructure : 65535;
                WinterFlowRendererEngine winterFlowRendererEngine = (WinterFlowRendererEngine) winterFlowDataSourceLibrary.WinterFlowTransactionManagerStrategy;
                WinterFlowControllerInvoker WinterFlowHookDataSource = ((WinterFlowObjectUtility) winterFlowRendererEngine.WinterFlowSyntax).WinterFlowHookDataSource(winterFlowRendererSystem, winterFlowObjectHook, i3, i4);
                if (WinterFlowHookDataSource instanceof WinterFlowCacheNode) {
                    Object obj6 = ((WinterFlowCacheNode) WinterFlowHookDataSource).WinterFlowVariableVersionControl;
                    obj6.getClass();
                    typeface = (Typeface) obj6;
                } else {
                    WinterFlowObjectPackage winterFlowObjectPackage = new WinterFlowObjectPackage(WinterFlowHookDataSource, winterFlowRendererEngine.WinterFlowServiceUtility);
                    winterFlowRendererEngine.WinterFlowServiceUtility = winterFlowObjectPackage;
                    Object obj7 = winterFlowObjectPackage.WinterFlowRouterRouter;
                    obj7.getClass();
                    typeface = (Typeface) obj7;
                }
                spannable.setSpan(new WinterFlowAPITransactionManager(1, typeface), intValue2, intValue3, 33);
                break;
        }
        return winterFlowAlgorithmSession;
    }
}
