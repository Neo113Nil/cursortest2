package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowGatewayManager implements WinterFlowObjectSession {
    public final /* synthetic */ WinterFlowDatabaseSchemaAlgorithm WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ WinterFlowCloudMicroservice WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowGatewayManager(WinterFlowDatabaseSchemaAlgorithm winterFlowDatabaseSchemaAlgorithm, WinterFlowCloudMicroservice winterFlowCloudMicroservice, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowDatabaseSchemaAlgorithm;
        this.WinterFlowUnitTestResponse = winterFlowCloudMicroservice;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        WinterFlowConcurrencyLayer WinterFlowArrayHelper;
        int i = this.WinterFlowVariableVersionControl;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        WinterFlowCloudMicroservice winterFlowCloudMicroservice = this.WinterFlowUnitTestResponse;
        WinterFlowDatabaseSchemaAlgorithm winterFlowDatabaseSchemaAlgorithm = this.WinterFlowTransactionManagerStrategy;
        WinterFlowDeserializationHandler winterFlowDeserializationHandler = (WinterFlowDeserializationHandler) obj;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                winterFlowDeserializationHandler.getClass();
                WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = winterFlowDatabaseSchemaAlgorithm.WinterFlowCacheManagerAgent;
                if (winterFlowCloudMicroservice != null) {
                    WinterFlowArrayHelper = winterFlowDeserializationHandler.WinterFlowArrayHelper("DELETE FROM `caught_fish` WHERE `id` = ?");
                    try {
                        WinterFlowArrayHelper.getClass();
                        WinterFlowArrayHelper.WinterFlowRouterStructure(1, winterFlowCloudMicroservice.WinterFlowRouterStructure);
                        WinterFlowArrayHelper.WinterFlowBackendCacheManager();
                        WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, null);
                        WinterFlowArrayHelper = winterFlowDeserializationHandler.WinterFlowArrayHelper("SELECT changes()");
                        try {
                            WinterFlowArrayHelper.WinterFlowBackendCacheManager();
                            WinterFlowArrayHelper.getLong(0);
                            WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, null);
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return winterFlowAlgorithmSession;
            default:
                winterFlowDeserializationHandler.getClass();
                WinterFlowAlgorithmDebug winterFlowAlgorithmDebug = winterFlowDatabaseSchemaAlgorithm.WinterFlowHookDataSource;
                WinterFlowArrayHelper = winterFlowDeserializationHandler.WinterFlowArrayHelper("INSERT OR ABORT INTO `caught_fish` (`id`,`name`,`energyReward`,`imageResId`) VALUES (nullif(?, 0),?,?,?)");
                try {
                    WinterFlowArrayHelper.getClass();
                    WinterFlowArrayHelper.WinterFlowRouterStructure(1, winterFlowCloudMicroservice.WinterFlowRouterStructure);
                    WinterFlowArrayHelper.WinterFlowSyntax(winterFlowCloudMicroservice.WinterFlowHookDataSource);
                    WinterFlowArrayHelper.WinterFlowRouterStructure(3, winterFlowCloudMicroservice.WinterFlowCacheManagerAgent);
                    WinterFlowArrayHelper.WinterFlowRouterStructure(4, winterFlowCloudMicroservice.WinterFlowArrayNetwork);
                    WinterFlowArrayHelper.WinterFlowBackendCacheManager();
                    WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, null);
                    return winterFlowAlgorithmSession;
                } finally {
                }
        }
    }
}
