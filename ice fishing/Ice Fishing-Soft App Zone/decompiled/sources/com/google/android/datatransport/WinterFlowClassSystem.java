package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowClassSystem implements Comparator {
    public final /* synthetic */ int WinterFlowRouterStructure;
    public static final WinterFlowClassSystem WinterFlowHookDataSource = new WinterFlowClassSystem(0);
    public static final WinterFlowClassSystem WinterFlowCacheManagerAgent = new WinterFlowClassSystem(1);
    public static final WinterFlowClassSystem WinterFlowArrayNetwork = new WinterFlowClassSystem(2);
    public static final WinterFlowClassSystem WinterFlowVariableVersionControl = new WinterFlowClassSystem(3);
    public static final WinterFlowClassSystem WinterFlowTransactionManagerStrategy = new WinterFlowClassSystem(4);

    public /* synthetic */ WinterFlowClassSystem(int i) {
        this.WinterFlowRouterStructure = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.WinterFlowRouterStructure) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowDeploymentWidget winterFlowDeploymentWidget = (WinterFlowDeploymentWidget) obj;
                WinterFlowDeploymentWidget winterFlowDeploymentWidget2 = (WinterFlowDeploymentWidget) obj2;
                if (!WinterFlowCloudStack.WinterFlowConfigurationSubsystem(winterFlowDeploymentWidget) || !WinterFlowCloudStack.WinterFlowConfigurationSubsystem(winterFlowDeploymentWidget2)) {
                    if (WinterFlowCloudStack.WinterFlowConfigurationSubsystem(winterFlowDeploymentWidget)) {
                        return -1;
                    }
                    return WinterFlowCloudStack.WinterFlowConfigurationSubsystem(winterFlowDeploymentWidget2) ? 1 : 0;
                }
                WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowDeploymentWidget);
                WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem2 = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowDeploymentWidget2);
                if (WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowSyntaxSubsystem, WinterFlowSyntaxSubsystem2)) {
                    return 0;
                }
                WinterFlowSchedulerStructure[] winterFlowSchedulerStructureArr = new WinterFlowSchedulerStructure[16];
                int i = 0;
                while (WinterFlowSyntaxSubsystem != null) {
                    int i2 = i + 1;
                    if (winterFlowSchedulerStructureArr.length < i2) {
                        int length = winterFlowSchedulerStructureArr.length;
                        ?? r4 = new Object[Math.max(i2, length * 2)];
                        System.arraycopy(winterFlowSchedulerStructureArr, 0, r4, 0, length);
                        winterFlowSchedulerStructureArr = r4;
                    }
                    if (i != 0) {
                        System.arraycopy(winterFlowSchedulerStructureArr, 0, winterFlowSchedulerStructureArr, 0 + 1, i + 0);
                    }
                    winterFlowSchedulerStructureArr[0] = WinterFlowSyntaxSubsystem;
                    i++;
                    WinterFlowSyntaxSubsystem = WinterFlowSyntaxSubsystem.WinterFlowVariableBandwidth();
                }
                WinterFlowSchedulerStructure[] winterFlowSchedulerStructureArr2 = new WinterFlowSchedulerStructure[16];
                int i3 = 0;
                while (WinterFlowSyntaxSubsystem2 != null) {
                    int i4 = i3 + 1;
                    if (winterFlowSchedulerStructureArr2.length < i4) {
                        int length2 = winterFlowSchedulerStructureArr2.length;
                        ?? r42 = new Object[Math.max(i4, length2 * 2)];
                        System.arraycopy(winterFlowSchedulerStructureArr2, 0, r42, 0, length2);
                        winterFlowSchedulerStructureArr2 = r42;
                    }
                    if (i3 != 0) {
                        System.arraycopy(winterFlowSchedulerStructureArr2, 0, winterFlowSchedulerStructureArr2, 0 + 1, i3 + 0);
                    }
                    winterFlowSchedulerStructureArr2[0] = WinterFlowSyntaxSubsystem2;
                    i3++;
                    WinterFlowSyntaxSubsystem2 = WinterFlowSyntaxSubsystem2.WinterFlowVariableBandwidth();
                }
                int min = Math.min(i - 1, i3 - 1);
                if (min >= 0) {
                    int i5 = 0;
                    while (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowSchedulerStructureArr[i5], winterFlowSchedulerStructureArr2[i5])) {
                        if (i5 != min) {
                            i5++;
                        }
                    }
                    return WinterFlowManagerRequest.WinterFlowBatchUI(winterFlowSchedulerStructureArr[i5].WinterFlowRouterAdapter(), winterFlowSchedulerStructureArr2[i5].WinterFlowRouterAdapter());
                }
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            case 1:
                WinterFlowVersionParser WinterFlowRouterRouter = ((WinterFlowProcessorSystem) obj).WinterFlowRouterRouter();
                WinterFlowVersionParser WinterFlowRouterRouter2 = ((WinterFlowProcessorSystem) obj2).WinterFlowRouterRouter();
                int compare = Float.compare(WinterFlowRouterRouter.WinterFlowRouterStructure, WinterFlowRouterRouter2.WinterFlowRouterStructure);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(WinterFlowRouterRouter.WinterFlowHookDataSource, WinterFlowRouterRouter2.WinterFlowHookDataSource);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(WinterFlowRouterRouter.WinterFlowArrayNetwork, WinterFlowRouterRouter2.WinterFlowArrayNetwork);
                return compare3 != 0 ? compare3 : Float.compare(WinterFlowRouterRouter.WinterFlowCacheManagerAgent, WinterFlowRouterRouter2.WinterFlowCacheManagerAgent);
            case 2:
                WinterFlowSchedulerStructure winterFlowSchedulerStructure = (WinterFlowSchedulerStructure) obj;
                WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = (WinterFlowSchedulerStructure) obj2;
                int WinterFlowBatchUI = WinterFlowManagerRequest.WinterFlowBatchUI(winterFlowSchedulerStructure2.WinterFlowBatchUI, winterFlowSchedulerStructure.WinterFlowBatchUI);
                return WinterFlowBatchUI != 0 ? WinterFlowBatchUI : WinterFlowManagerRequest.WinterFlowBatchUI(winterFlowSchedulerStructure.hashCode(), winterFlowSchedulerStructure2.hashCode());
            case 3:
                WinterFlowVersionParser WinterFlowRouterRouter3 = ((WinterFlowProcessorSystem) obj).WinterFlowRouterRouter();
                WinterFlowVersionParser WinterFlowRouterRouter4 = ((WinterFlowProcessorSystem) obj2).WinterFlowRouterRouter();
                int compare4 = Float.compare(WinterFlowRouterRouter4.WinterFlowCacheManagerAgent, WinterFlowRouterRouter3.WinterFlowCacheManagerAgent);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(WinterFlowRouterRouter3.WinterFlowHookDataSource, WinterFlowRouterRouter4.WinterFlowHookDataSource);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(WinterFlowRouterRouter3.WinterFlowArrayNetwork, WinterFlowRouterRouter4.WinterFlowArrayNetwork);
                return compare6 != 0 ? compare6 : Float.compare(WinterFlowRouterRouter4.WinterFlowRouterStructure, WinterFlowRouterRouter3.WinterFlowRouterStructure);
            case 4:
                WinterFlowServerPlatform winterFlowServerPlatform = (WinterFlowServerPlatform) obj;
                WinterFlowServerPlatform winterFlowServerPlatform2 = (WinterFlowServerPlatform) obj2;
                int compare7 = Float.compare(((WinterFlowVersionParser) winterFlowServerPlatform.WinterFlowVariableVersionControl).WinterFlowHookDataSource, ((WinterFlowVersionParser) winterFlowServerPlatform2.WinterFlowVariableVersionControl).WinterFlowHookDataSource);
                return compare7 != 0 ? compare7 : Float.compare(((WinterFlowVersionParser) winterFlowServerPlatform.WinterFlowVariableVersionControl).WinterFlowArrayNetwork, ((WinterFlowVersionParser) winterFlowServerPlatform2.WinterFlowVariableVersionControl).WinterFlowArrayNetwork);
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                return Integer.valueOf(((WinterFlowVariableTransaction) obj).WinterFlowHookDataSource).compareTo(Integer.valueOf(((WinterFlowVariableTransaction) obj2).WinterFlowHookDataSource));
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                return Integer.valueOf(((WinterFlowVariableTransaction) obj).WinterFlowHookDataSource).compareTo(Integer.valueOf(((WinterFlowVariableTransaction) obj2).WinterFlowHookDataSource));
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                WinterFlowSchedulerStructure winterFlowSchedulerStructure3 = (WinterFlowSchedulerStructure) obj;
                WinterFlowSchedulerStructure winterFlowSchedulerStructure4 = (WinterFlowSchedulerStructure) obj2;
                int WinterFlowBatchUI2 = WinterFlowManagerRequest.WinterFlowBatchUI(winterFlowSchedulerStructure3.WinterFlowBatchUI, winterFlowSchedulerStructure4.WinterFlowBatchUI);
                return WinterFlowBatchUI2 != 0 ? WinterFlowBatchUI2 : WinterFlowManagerRequest.WinterFlowBatchUI(winterFlowSchedulerStructure3.hashCode(), winterFlowSchedulerStructure4.hashCode());
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                return WinterFlowQuerySyntax.WinterFlowUnitTestResponse((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 9:
                return WinterFlowQuerySyntax.WinterFlowUnitTestResponse((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 10:
                return WinterFlowQuerySyntax.WinterFlowUnitTestResponse(((WinterFlowHandlerService) obj).WinterFlowRouterStructure, ((WinterFlowHandlerService) obj2).WinterFlowRouterStructure);
            default:
                return WinterFlowQuerySyntax.WinterFlowUnitTestResponse(((WinterFlowGatewayNode) obj).WinterFlowRouterStructure, ((WinterFlowGatewayNode) obj2).WinterFlowRouterStructure);
        }
    }
}
