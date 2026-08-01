package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowTransactionModule {
    public final WinterFlowObjectPackage WinterFlowRouterStructure;

    public WinterFlowTransactionModule(WinterFlowAlgorithmCloud winterFlowAlgorithmCloud, WinterFlowAlgorithmCloud winterFlowAlgorithmCloud2, WinterFlowJSONLibrary winterFlowJSONLibrary) {
        this.WinterFlowRouterStructure = new WinterFlowObjectPackage(winterFlowAlgorithmCloud, winterFlowAlgorithmCloud2, winterFlowJSONLibrary, 15);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int WinterFlowRouterStructure(WinterFlowObjectPackage winterFlowObjectPackage, Object obj, Object obj2) {
        int WinterFlowResponseEngine;
        int size;
        int WinterFlowSyntax;
        WinterFlowAlgorithmCloud winterFlowAlgorithmCloud;
        int size2;
        int WinterFlowSyntax2;
        WinterFlowAlgorithmCloud winterFlowAlgorithmCloud2 = (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy;
        int i = WinterFlowWorkerSystem.WinterFlowCacheManagerAgent;
        int i2 = 1;
        int WinterFlowRouterRouter = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(1);
        WinterFlowUserManagerTesting winterFlowUserManagerTesting = WinterFlowAlgorithmCloud.WinterFlowRouterRouter;
        if (winterFlowAlgorithmCloud2 == winterFlowUserManagerTesting) {
            WinterFlowRouterRouter *= 2;
        }
        switch (winterFlowAlgorithmCloud2.ordinal()) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Double) obj).getClass();
                WinterFlowResponseEngine = 8;
                int i3 = WinterFlowResponseEngine + WinterFlowRouterRouter;
                winterFlowAlgorithmCloud = (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                int WinterFlowRouterRouter2 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(2);
                if (winterFlowAlgorithmCloud == winterFlowUserManagerTesting) {
                    WinterFlowRouterRouter2 *= 2;
                }
                switch (winterFlowAlgorithmCloud.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Double) obj2).getClass();
                        i2 = 8;
                        return i2 + WinterFlowRouterRouter2 + i3;
                    case 1:
                        ((Float) obj2).getClass();
                        i2 = 4;
                        return i2 + WinterFlowRouterRouter2 + i3;
                    case 2:
                        i2 = WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(((Long) obj2).longValue());
                        return i2 + WinterFlowRouterRouter2 + i3;
                    case 3:
                        i2 = WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(((Long) obj2).longValue());
                        return i2 + WinterFlowRouterRouter2 + i3;
                    case 4:
                        i2 = WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(((Integer) obj2).intValue());
                        return i2 + WinterFlowRouterRouter2 + i3;
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        ((Long) obj2).getClass();
                        i2 = 8;
                        return i2 + WinterFlowRouterRouter2 + i3;
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        ((Integer) obj2).getClass();
                        i2 = 4;
                        return i2 + WinterFlowRouterRouter2 + i3;
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) obj2).getClass();
                        return i2 + WinterFlowRouterRouter2 + i3;
                    case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                        if (!(obj2 instanceof WinterFlowMicroserviceCloud)) {
                            i2 = WinterFlowSessionManagerSingleton.WinterFlowUnitTestResponse((String) obj2);
                            return i2 + WinterFlowRouterRouter2 + i3;
                        }
                        size2 = ((WinterFlowMicroserviceCloud) obj2).size();
                        WinterFlowSyntax2 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size2);
                        i2 = WinterFlowSyntax2 + size2;
                        return i2 + WinterFlowRouterRouter2 + i3;
                    case 9:
                        i2 = ((WinterFlowDecoratorResponse) ((WinterFlowHookBackend) obj2)).WinterFlowRouterStructure(null);
                        return i2 + WinterFlowRouterRouter2 + i3;
                    case 10:
                        size2 = ((WinterFlowDecoratorResponse) ((WinterFlowHookBackend) obj2)).WinterFlowRouterStructure(null);
                        WinterFlowSyntax2 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size2);
                        i2 = WinterFlowSyntax2 + size2;
                        return i2 + WinterFlowRouterRouter2 + i3;
                    case 11:
                        if (obj2 instanceof WinterFlowMicroserviceCloud) {
                            size2 = ((WinterFlowMicroserviceCloud) obj2).size();
                            WinterFlowSyntax2 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            WinterFlowSyntax2 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size2);
                        }
                        i2 = WinterFlowSyntax2 + size2;
                        return i2 + WinterFlowRouterRouter2 + i3;
                    case 12:
                        i2 = WinterFlowSessionManagerSingleton.WinterFlowSyntax(((Integer) obj2).intValue());
                        return i2 + WinterFlowRouterRouter2 + i3;
                    case 13:
                        i2 = WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(((Integer) obj2).intValue());
                        return i2 + WinterFlowRouterRouter2 + i3;
                    case 14:
                        ((Integer) obj2).getClass();
                        i2 = 4;
                        return i2 + WinterFlowRouterRouter2 + i3;
                    case 15:
                        ((Long) obj2).getClass();
                        i2 = 8;
                        return i2 + WinterFlowRouterRouter2 + i3;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i2 = WinterFlowSessionManagerSingleton.WinterFlowSyntax((intValue >> 31) ^ (intValue << 1));
                        return i2 + WinterFlowRouterRouter2 + i3;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i2 = WinterFlowSessionManagerSingleton.WinterFlowResponseEngine((longValue >> 63) ^ (longValue << 1));
                        return i2 + WinterFlowRouterRouter2 + i3;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                WinterFlowResponseEngine = 4;
                int i32 = WinterFlowResponseEngine + WinterFlowRouterRouter;
                winterFlowAlgorithmCloud = (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                int WinterFlowRouterRouter22 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(2);
                if (winterFlowAlgorithmCloud == winterFlowUserManagerTesting) {
                }
                switch (winterFlowAlgorithmCloud.ordinal()) {
                }
            case 2:
                WinterFlowResponseEngine = WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(((Long) obj).longValue());
                int i322 = WinterFlowResponseEngine + WinterFlowRouterRouter;
                winterFlowAlgorithmCloud = (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                int WinterFlowRouterRouter222 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(2);
                if (winterFlowAlgorithmCloud == winterFlowUserManagerTesting) {
                }
                switch (winterFlowAlgorithmCloud.ordinal()) {
                }
            case 3:
                WinterFlowResponseEngine = WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(((Long) obj).longValue());
                int i3222 = WinterFlowResponseEngine + WinterFlowRouterRouter;
                winterFlowAlgorithmCloud = (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                int WinterFlowRouterRouter2222 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(2);
                if (winterFlowAlgorithmCloud == winterFlowUserManagerTesting) {
                }
                switch (winterFlowAlgorithmCloud.ordinal()) {
                }
            case 4:
                WinterFlowResponseEngine = WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(((Integer) obj).intValue());
                int i32222 = WinterFlowResponseEngine + WinterFlowRouterRouter;
                winterFlowAlgorithmCloud = (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                int WinterFlowRouterRouter22222 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(2);
                if (winterFlowAlgorithmCloud == winterFlowUserManagerTesting) {
                }
                switch (winterFlowAlgorithmCloud.ordinal()) {
                }
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                ((Long) obj).getClass();
                WinterFlowResponseEngine = 8;
                int i322222 = WinterFlowResponseEngine + WinterFlowRouterRouter;
                winterFlowAlgorithmCloud = (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                int WinterFlowRouterRouter222222 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(2);
                if (winterFlowAlgorithmCloud == winterFlowUserManagerTesting) {
                }
                switch (winterFlowAlgorithmCloud.ordinal()) {
                }
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj).getClass();
                WinterFlowResponseEngine = 4;
                int i3222222 = WinterFlowResponseEngine + WinterFlowRouterRouter;
                winterFlowAlgorithmCloud = (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                int WinterFlowRouterRouter2222222 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(2);
                if (winterFlowAlgorithmCloud == winterFlowUserManagerTesting) {
                }
                switch (winterFlowAlgorithmCloud.ordinal()) {
                }
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj).getClass();
                WinterFlowResponseEngine = 1;
                int i32222222 = WinterFlowResponseEngine + WinterFlowRouterRouter;
                winterFlowAlgorithmCloud = (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                int WinterFlowRouterRouter22222222 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(2);
                if (winterFlowAlgorithmCloud == winterFlowUserManagerTesting) {
                }
                switch (winterFlowAlgorithmCloud.ordinal()) {
                }
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof WinterFlowMicroserviceCloud) {
                    size = ((WinterFlowMicroserviceCloud) obj).size();
                    WinterFlowSyntax = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size);
                    WinterFlowResponseEngine = size + WinterFlowSyntax;
                    int i322222222 = WinterFlowResponseEngine + WinterFlowRouterRouter;
                    winterFlowAlgorithmCloud = (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                    int WinterFlowRouterRouter222222222 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(2);
                    if (winterFlowAlgorithmCloud == winterFlowUserManagerTesting) {
                    }
                    switch (winterFlowAlgorithmCloud.ordinal()) {
                    }
                } else {
                    WinterFlowResponseEngine = WinterFlowSessionManagerSingleton.WinterFlowUnitTestResponse((String) obj);
                    int i3222222222 = WinterFlowResponseEngine + WinterFlowRouterRouter;
                    winterFlowAlgorithmCloud = (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                    int WinterFlowRouterRouter2222222222 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(2);
                    if (winterFlowAlgorithmCloud == winterFlowUserManagerTesting) {
                    }
                    switch (winterFlowAlgorithmCloud.ordinal()) {
                    }
                }
            case 9:
                WinterFlowResponseEngine = ((WinterFlowDecoratorResponse) ((WinterFlowHookBackend) obj)).WinterFlowRouterStructure(null);
                int i32222222222 = WinterFlowResponseEngine + WinterFlowRouterRouter;
                winterFlowAlgorithmCloud = (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                int WinterFlowRouterRouter22222222222 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(2);
                if (winterFlowAlgorithmCloud == winterFlowUserManagerTesting) {
                }
                switch (winterFlowAlgorithmCloud.ordinal()) {
                }
            case 10:
                size = ((WinterFlowDecoratorResponse) ((WinterFlowHookBackend) obj)).WinterFlowRouterStructure(null);
                WinterFlowSyntax = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size);
                WinterFlowResponseEngine = size + WinterFlowSyntax;
                int i322222222222 = WinterFlowResponseEngine + WinterFlowRouterRouter;
                winterFlowAlgorithmCloud = (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                int WinterFlowRouterRouter222222222222 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(2);
                if (winterFlowAlgorithmCloud == winterFlowUserManagerTesting) {
                }
                switch (winterFlowAlgorithmCloud.ordinal()) {
                }
            case 11:
                if (obj instanceof WinterFlowMicroserviceCloud) {
                    size = ((WinterFlowMicroserviceCloud) obj).size();
                    WinterFlowSyntax = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size);
                } else {
                    size = ((byte[]) obj).length;
                    WinterFlowSyntax = WinterFlowSessionManagerSingleton.WinterFlowSyntax(size);
                }
                WinterFlowResponseEngine = size + WinterFlowSyntax;
                int i3222222222222 = WinterFlowResponseEngine + WinterFlowRouterRouter;
                winterFlowAlgorithmCloud = (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                int WinterFlowRouterRouter2222222222222 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(2);
                if (winterFlowAlgorithmCloud == winterFlowUserManagerTesting) {
                }
                switch (winterFlowAlgorithmCloud.ordinal()) {
                }
            case 12:
                WinterFlowResponseEngine = WinterFlowSessionManagerSingleton.WinterFlowSyntax(((Integer) obj).intValue());
                int i32222222222222 = WinterFlowResponseEngine + WinterFlowRouterRouter;
                winterFlowAlgorithmCloud = (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                int WinterFlowRouterRouter22222222222222 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(2);
                if (winterFlowAlgorithmCloud == winterFlowUserManagerTesting) {
                }
                switch (winterFlowAlgorithmCloud.ordinal()) {
                }
            case 13:
                WinterFlowResponseEngine = WinterFlowSessionManagerSingleton.WinterFlowResponseEngine(((Integer) obj).intValue());
                int i322222222222222 = WinterFlowResponseEngine + WinterFlowRouterRouter;
                winterFlowAlgorithmCloud = (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                int WinterFlowRouterRouter222222222222222 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(2);
                if (winterFlowAlgorithmCloud == winterFlowUserManagerTesting) {
                }
                switch (winterFlowAlgorithmCloud.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                WinterFlowResponseEngine = 4;
                int i3222222222222222 = WinterFlowResponseEngine + WinterFlowRouterRouter;
                winterFlowAlgorithmCloud = (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                int WinterFlowRouterRouter2222222222222222 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(2);
                if (winterFlowAlgorithmCloud == winterFlowUserManagerTesting) {
                }
                switch (winterFlowAlgorithmCloud.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                WinterFlowResponseEngine = 8;
                int i32222222222222222 = WinterFlowResponseEngine + WinterFlowRouterRouter;
                winterFlowAlgorithmCloud = (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                int WinterFlowRouterRouter22222222222222222 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(2);
                if (winterFlowAlgorithmCloud == winterFlowUserManagerTesting) {
                }
                switch (winterFlowAlgorithmCloud.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                WinterFlowResponseEngine = WinterFlowSessionManagerSingleton.WinterFlowSyntax((intValue2 >> 31) ^ (intValue2 << 1));
                int i322222222222222222 = WinterFlowResponseEngine + WinterFlowRouterRouter;
                winterFlowAlgorithmCloud = (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                int WinterFlowRouterRouter222222222222222222 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(2);
                if (winterFlowAlgorithmCloud == winterFlowUserManagerTesting) {
                }
                switch (winterFlowAlgorithmCloud.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                WinterFlowResponseEngine = WinterFlowSessionManagerSingleton.WinterFlowResponseEngine((longValue2 >> 63) ^ (longValue2 << 1));
                int i3222222222222222222 = WinterFlowResponseEngine + WinterFlowRouterRouter;
                winterFlowAlgorithmCloud = (WinterFlowAlgorithmCloud) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                int WinterFlowRouterRouter2222222222222222222 = WinterFlowSessionManagerSingleton.WinterFlowRouterRouter(2);
                if (winterFlowAlgorithmCloud == winterFlowUserManagerTesting) {
                }
                switch (winterFlowAlgorithmCloud.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
