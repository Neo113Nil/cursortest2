package com.google.android.datatransport;

import java.util.Locale;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowHandlerService {
    public final int WinterFlowArrayNetwork;
    public final boolean WinterFlowCacheManagerAgent;
    public final String WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;
    public final int WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse;
    public final String WinterFlowVariableVersionControl;

    public WinterFlowHandlerService(String str, String str2, boolean z, int i, String str3, int i2) {
        str.getClass();
        str2.getClass();
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = str2;
        this.WinterFlowCacheManagerAgent = z;
        this.WinterFlowArrayNetwork = i;
        this.WinterFlowVariableVersionControl = str3;
        this.WinterFlowTransactionManagerStrategy = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.WinterFlowUnitTestResponse = WinterFlowFrameworkStrategy.WinterFlowConsumerUserManager(upperCase, "INT") ? 3 : (WinterFlowFrameworkStrategy.WinterFlowConsumerUserManager(upperCase, "CHAR") || WinterFlowFrameworkStrategy.WinterFlowConsumerUserManager(upperCase, "CLOB") || WinterFlowFrameworkStrategy.WinterFlowConsumerUserManager(upperCase, "TEXT")) ? 2 : WinterFlowFrameworkStrategy.WinterFlowConsumerUserManager(upperCase, "BLOB") ? 5 : (WinterFlowFrameworkStrategy.WinterFlowConsumerUserManager(upperCase, "REAL") || WinterFlowFrameworkStrategy.WinterFlowConsumerUserManager(upperCase, "FLOA") || WinterFlowFrameworkStrategy.WinterFlowConsumerUserManager(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WinterFlowHandlerService) {
                boolean z = this.WinterFlowArrayNetwork > 0;
                WinterFlowHandlerService winterFlowHandlerService = (WinterFlowHandlerService) obj;
                int i = winterFlowHandlerService.WinterFlowTransactionManagerStrategy;
                if (z == (winterFlowHandlerService.WinterFlowArrayNetwork > 0) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowHandlerService.WinterFlowRouterStructure) && this.WinterFlowCacheManagerAgent == winterFlowHandlerService.WinterFlowCacheManagerAgent) {
                    String str = winterFlowHandlerService.WinterFlowVariableVersionControl;
                    int i2 = this.WinterFlowTransactionManagerStrategy;
                    String str2 = this.WinterFlowVariableVersionControl;
                    if ((i2 != 1 || i != 2 || str2 == null || WinterFlowConfigurationException.WinterFlowHookDataSource(str2, str)) && ((i2 != 2 || i != 1 || str == null || WinterFlowConfigurationException.WinterFlowHookDataSource(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : WinterFlowConfigurationException.WinterFlowHookDataSource(str2, str))) && this.WinterFlowUnitTestResponse == winterFlowHandlerService.WinterFlowUnitTestResponse))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.WinterFlowRouterStructure.hashCode() * 31) + this.WinterFlowUnitTestResponse) * 31) + (this.WinterFlowCacheManagerAgent ? 1231 : 1237)) * 31) + this.WinterFlowArrayNetwork;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.WinterFlowRouterStructure);
        sb.append("',\n            |   type = '");
        sb.append(this.WinterFlowHookDataSource);
        sb.append("',\n            |   affinity = '");
        sb.append(this.WinterFlowUnitTestResponse);
        sb.append("',\n            |   notNull = '");
        sb.append(this.WinterFlowCacheManagerAgent);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.WinterFlowArrayNetwork);
        sb.append("',\n            |   defaultValue = '");
        String str = this.WinterFlowVariableVersionControl;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return WinterFlowEventUtility.WinterFlowRouterAdapter(WinterFlowEventUtility.WinterFlowSerializerStructure(sb.toString()));
    }
}
