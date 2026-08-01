package com.google.android.datatransport;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMapperEngine {
    public final String WinterFlowArrayNetwork;
    public final String WinterFlowCacheManagerAgent;
    public final String WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;
    public final String WinterFlowTransactionManagerStrategy;
    public final String WinterFlowUnitTestResponse;
    public final String WinterFlowVariableVersionControl;

    public WinterFlowMapperEngine(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = WinterFlowDatabaseSchemaQuery.WinterFlowRouterStructure;
        if (str == null || str.trim().isEmpty()) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("ApplicationId must be set.");
            throw null;
        }
        this.WinterFlowHookDataSource = str;
        this.WinterFlowRouterStructure = str2;
        this.WinterFlowCacheManagerAgent = str3;
        this.WinterFlowArrayNetwork = str4;
        this.WinterFlowVariableVersionControl = str5;
        this.WinterFlowTransactionManagerStrategy = str6;
        this.WinterFlowUnitTestResponse = str7;
    }

    public static WinterFlowMapperEngine WinterFlowRouterStructure(Context context) {
        WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = new WinterFlowCacheManagerVersionControl(context);
        String WinterFlowVariableVersionControl = winterFlowCacheManagerVersionControl.WinterFlowVariableVersionControl("google_app_id");
        if (TextUtils.isEmpty(WinterFlowVariableVersionControl)) {
            return null;
        }
        return new WinterFlowMapperEngine(WinterFlowVariableVersionControl, winterFlowCacheManagerVersionControl.WinterFlowVariableVersionControl("google_api_key"), winterFlowCacheManagerVersionControl.WinterFlowVariableVersionControl("firebase_database_url"), winterFlowCacheManagerVersionControl.WinterFlowVariableVersionControl("ga_trackingId"), winterFlowCacheManagerVersionControl.WinterFlowVariableVersionControl("gcm_defaultSenderId"), winterFlowCacheManagerVersionControl.WinterFlowVariableVersionControl("google_storage_bucket"), winterFlowCacheManagerVersionControl.WinterFlowVariableVersionControl("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WinterFlowMapperEngine)) {
            return false;
        }
        WinterFlowMapperEngine winterFlowMapperEngine = (WinterFlowMapperEngine) obj;
        return WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(this.WinterFlowHookDataSource, winterFlowMapperEngine.WinterFlowHookDataSource) && WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(this.WinterFlowRouterStructure, winterFlowMapperEngine.WinterFlowRouterStructure) && WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(this.WinterFlowCacheManagerAgent, winterFlowMapperEngine.WinterFlowCacheManagerAgent) && WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(this.WinterFlowArrayNetwork, winterFlowMapperEngine.WinterFlowArrayNetwork) && WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(this.WinterFlowVariableVersionControl, winterFlowMapperEngine.WinterFlowVariableVersionControl) && WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(this.WinterFlowTransactionManagerStrategy, winterFlowMapperEngine.WinterFlowTransactionManagerStrategy) && WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(this.WinterFlowUnitTestResponse, winterFlowMapperEngine.WinterFlowUnitTestResponse);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.WinterFlowHookDataSource, this.WinterFlowRouterStructure, this.WinterFlowCacheManagerAgent, this.WinterFlowArrayNetwork, this.WinterFlowVariableVersionControl, this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse});
    }

    public final String toString() {
        WinterFlowAlgorithmArray winterFlowAlgorithmArray = new WinterFlowAlgorithmArray(this);
        winterFlowAlgorithmArray.WinterFlowSyntax(this.WinterFlowHookDataSource, "applicationId");
        winterFlowAlgorithmArray.WinterFlowSyntax(this.WinterFlowRouterStructure, "apiKey");
        winterFlowAlgorithmArray.WinterFlowSyntax(this.WinterFlowCacheManagerAgent, "databaseUrl");
        winterFlowAlgorithmArray.WinterFlowSyntax(this.WinterFlowVariableVersionControl, "gcmSenderId");
        winterFlowAlgorithmArray.WinterFlowSyntax(this.WinterFlowTransactionManagerStrategy, "storageBucket");
        winterFlowAlgorithmArray.WinterFlowSyntax(this.WinterFlowUnitTestResponse, "projectId");
        return winterFlowAlgorithmArray.toString();
    }
}
