package com.icewinter.flow.winter.icecatch.db;

import com.google.android.datatransport.WinterFlowAPISystem;
import com.google.android.datatransport.WinterFlowDataSourceEngine;
import com.google.android.datatransport.WinterFlowDatabaseSchemaAlgorithm;
import com.google.android.datatransport.WinterFlowListenerProtocol;
import com.google.android.datatransport.WinterFlowRendererNode;
import com.google.android.datatransport.WinterFlowRepositoryProtocol;
import com.google.android.datatransport.WinterFlowResponseConfiguration;
import com.google.android.datatransport.WinterFlowSyntaxUtility;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {
    public final WinterFlowRendererNode WinterFlowTransactionAgent = new WinterFlowRendererNode(new WinterFlowAPISystem(1, this));

    @Override // com.google.android.datatransport.WinterFlowCloudFramework
    public final WinterFlowRepositoryProtocol WinterFlowCacheManagerAgent() {
        return new WinterFlowSyntaxUtility(this);
    }

    @Override // com.google.android.datatransport.WinterFlowCloudFramework
    public final WinterFlowResponseConfiguration WinterFlowHookDataSource() {
        return new WinterFlowResponseConfiguration(this, new LinkedHashMap(), new LinkedHashMap(), "caught_fish");
    }

    @Override // com.google.android.datatransport.WinterFlowCloudFramework
    public final List WinterFlowRouterStructure(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // com.icewinter.flow.winter.icecatch.db.AppDatabase
    public final WinterFlowDatabaseSchemaAlgorithm WinterFlowTransactionAgent() {
        return (WinterFlowDatabaseSchemaAlgorithm) this.WinterFlowTransactionAgent.getValue();
    }

    @Override // com.google.android.datatransport.WinterFlowCloudFramework
    public final LinkedHashMap WinterFlowTransactionManagerStrategy() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(WinterFlowListenerProtocol.WinterFlowRouterStructure(WinterFlowDatabaseSchemaAlgorithm.class), WinterFlowDataSourceEngine.WinterFlowVariableVersionControl);
        return linkedHashMap;
    }

    @Override // com.google.android.datatransport.WinterFlowCloudFramework
    public final Set WinterFlowVariableVersionControl() {
        return new LinkedHashSet();
    }
}
