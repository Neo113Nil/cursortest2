package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import com.icewinter.flow.winter.icecatch.data.cpp.StaticIdProvider;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowArrayHelper implements WinterFlowObjectUI {
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowArrayHelper(int i) {
        this.WinterFlowVariableVersionControl = i;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        Map map_delegate$lambda$0;
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new WinterFlowResponseManager();
            case 1:
                return new WinterFlowPackageResponse();
            case 2:
                return new WinterFlowDecoratorPlatform(new LinkedHashMap());
            case 3:
                return null;
            case 4:
                return new WinterFlowStackQuery(0);
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                return null;
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                return new WinterFlowRouterSystem();
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                map_delegate$lambda$0 = StaticIdProvider.map_delegate$lambda$0();
                return map_delegate$lambda$0;
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                return new WinterFlowRequestScheduler(0.0f);
            case 9:
                return WinterFlowEncryptionProxy.WinterFlowRouterStructure;
            case 10:
                return WinterFlowInterfaceIDE.WinterFlowRouterStructure;
            default:
                return new WinterFlowUserManagerEntity(null, 32767);
        }
    }
}
