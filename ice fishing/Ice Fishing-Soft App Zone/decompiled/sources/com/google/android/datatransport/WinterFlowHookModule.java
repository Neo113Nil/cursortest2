package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowHookModule extends WinterFlowDatabaseSchemaSystem {
    public static String WinterFlowMapperProtocol(String str, String str2, String str3) {
        int WinterFlowBackendCacheManager = WinterFlowFrameworkStrategy.WinterFlowBackendCacheManager(str, str2, 0, false);
        if (WinterFlowBackendCacheManager < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, WinterFlowBackendCacheManager);
            sb.append(str3);
            i2 = WinterFlowBackendCacheManager + length;
            if (WinterFlowBackendCacheManager >= str.length()) {
                break;
            }
            WinterFlowBackendCacheManager = WinterFlowFrameworkStrategy.WinterFlowBackendCacheManager(str, str2, WinterFlowBackendCacheManager + i, false);
        } while (WinterFlowBackendCacheManager > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    public static boolean WinterFlowResolverController(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str.startsWith(str2);
    }
}
