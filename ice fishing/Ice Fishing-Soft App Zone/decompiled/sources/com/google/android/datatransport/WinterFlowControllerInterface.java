package com.google.android.datatransport;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowControllerInterface {
    public final WinterFlowManagerConsumer WinterFlowHookDataSource;
    public final WinterFlowDatabaseSchemaAlgorithm WinterFlowRouterStructure;

    public WinterFlowControllerInterface(WinterFlowDatabaseSchemaAlgorithm winterFlowDatabaseSchemaAlgorithm) {
        WinterFlowServerPlatform winterFlowServerPlatform;
        winterFlowDatabaseSchemaAlgorithm.getClass();
        this.WinterFlowRouterStructure = winterFlowDatabaseSchemaAlgorithm;
        WinterFlowCloudFramework winterFlowCloudFramework = winterFlowDatabaseSchemaAlgorithm.WinterFlowRouterStructure;
        WinterFlowInterfaceSoftware winterFlowInterfaceSoftware = new WinterFlowInterfaceSoftware(12);
        WinterFlowResponseConfiguration WinterFlowArrayNetwork = winterFlowCloudFramework.WinterFlowArrayNetwork();
        int i = 1;
        String[] strArr = (String[]) Arrays.copyOf(new String[]{"caught_fish"}, 1);
        WinterFlowGatewaySession winterFlowGatewaySession = WinterFlowArrayNetwork.WinterFlowHookDataSource;
        winterFlowGatewaySession.getClass();
        WinterFlowRendererDecorator winterFlowRendererDecorator = new WinterFlowRendererDecorator();
        int i2 = 0;
        for (String str : strArr) {
            LinkedHashMap linkedHashMap = winterFlowGatewaySession.WinterFlowCacheManagerAgent;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                winterFlowRendererDecorator.addAll(set);
            } else {
                winterFlowRendererDecorator.add(str);
            }
        }
        String[] strArr2 = (String[]) WinterFlowMicroserviceWidget.WinterFlowHookDataSource(winterFlowRendererDecorator).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        while (true) {
            if (i2 >= length) {
                winterFlowServerPlatform = new WinterFlowServerPlatform(strArr2, iArr);
                break;
            }
            String str2 = strArr2[i2];
            LinkedHashMap linkedHashMap2 = winterFlowGatewaySession.WinterFlowTransactionManagerStrategy;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) linkedHashMap2.get(lowerCase2);
            if (num == null) {
                WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("There is no table with name ".concat(str2));
                winterFlowServerPlatform = null;
                break;
            } else {
                iArr[i2] = num.intValue();
                i2++;
            }
        }
        String[] strArr3 = (String[]) winterFlowServerPlatform.WinterFlowVariableVersionControl;
        int[] iArr2 = (int[]) winterFlowServerPlatform.WinterFlowTransactionManagerStrategy;
        strArr3.getClass();
        iArr2.getClass();
        this.WinterFlowHookDataSource = new WinterFlowManagerConsumer(WinterFlowEncryptionSubsystem.WinterFlowRouterRouter(new WinterFlowUserManagerQuery(i, new WinterFlowMiddlewareVariable(winterFlowGatewaySession, iArr2, strArr3, null, 6)), -1), winterFlowCloudFramework, winterFlowInterfaceSoftware);
    }
}
