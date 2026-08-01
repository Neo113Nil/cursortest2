package com.google.android.datatransport;

import com.icewinter.flow.winter.icecatch.db.AppDatabase_Impl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSyntaxUtility extends WinterFlowRepositoryProtocol {
    public final /* synthetic */ AppDatabase_Impl WinterFlowArrayNetwork;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowSyntaxUtility(AppDatabase_Impl appDatabase_Impl) {
        super("cf51c5b745e53c7be496baffc3a77e6c", 1, "927cac5e5d2cf971b9bf189f341569d9");
        this.WinterFlowArrayNetwork = appDatabase_Impl;
    }

    @Override // com.google.android.datatransport.WinterFlowRepositoryProtocol
    public final void WinterFlowArrayNetwork(WinterFlowDeserializationHandler winterFlowDeserializationHandler) {
        winterFlowDeserializationHandler.getClass();
        WinterFlowResponseConfiguration WinterFlowArrayNetwork = this.WinterFlowArrayNetwork.WinterFlowArrayNetwork();
        WinterFlowGatewaySession winterFlowGatewaySession = WinterFlowArrayNetwork.WinterFlowHookDataSource;
        winterFlowGatewaySession.getClass();
        WinterFlowConcurrencyLayer WinterFlowArrayHelper = winterFlowDeserializationHandler.WinterFlowArrayHelper("PRAGMA query_only");
        try {
            WinterFlowArrayHelper.WinterFlowBackendCacheManager();
            boolean WinterFlowConcurrencyThread = WinterFlowArrayHelper.WinterFlowConcurrencyThread();
            WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, null);
            if (!WinterFlowConcurrencyThread) {
                WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "PRAGMA temp_store = MEMORY");
                WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "PRAGMA recursive_triggers = 1");
                WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "DROP TABLE IF EXISTS room_table_modification_log");
                if (winterFlowGatewaySession.WinterFlowArrayNetwork) {
                    WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, WinterFlowHookModule.WinterFlowMapperProtocol("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                WinterFlowSerializerComponent winterFlowSerializerComponent = winterFlowGatewaySession.WinterFlowRouterRouter;
                ReentrantLock reentrantLock = winterFlowSerializerComponent.WinterFlowRouterStructure;
                reentrantLock.lock();
                try {
                    winterFlowSerializerComponent.WinterFlowArrayNetwork = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (WinterFlowArrayNetwork.WinterFlowUnitTestResponse) {
            }
        } finally {
        }
    }

    @Override // com.google.android.datatransport.WinterFlowRepositoryProtocol
    public final void WinterFlowCacheManagerAgent(WinterFlowDeserializationHandler winterFlowDeserializationHandler) {
        winterFlowDeserializationHandler.getClass();
    }

    @Override // com.google.android.datatransport.WinterFlowRepositoryProtocol
    public final void WinterFlowHookDataSource(WinterFlowDeserializationHandler winterFlowDeserializationHandler) {
        winterFlowDeserializationHandler.getClass();
        WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "DROP TABLE IF EXISTS `caught_fish`");
    }

    @Override // com.google.android.datatransport.WinterFlowRepositoryProtocol
    public final void WinterFlowRouterStructure(WinterFlowDeserializationHandler winterFlowDeserializationHandler) {
        winterFlowDeserializationHandler.getClass();
        WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "CREATE TABLE IF NOT EXISTS `caught_fish` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `energyReward` INTEGER NOT NULL, `imageResId` INTEGER NOT NULL)");
        WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cf51c5b745e53c7be496baffc3a77e6c')");
    }

    @Override // com.google.android.datatransport.WinterFlowRepositoryProtocol
    public final void WinterFlowTransactionManagerStrategy(WinterFlowDeserializationHandler winterFlowDeserializationHandler) {
        winterFlowDeserializationHandler.getClass();
        WinterFlowUserManagerResolver WinterFlowBatchUI = WinterFlowUnitTestLibrary.WinterFlowBatchUI();
        WinterFlowConcurrencyLayer WinterFlowArrayHelper = winterFlowDeserializationHandler.WinterFlowArrayHelper("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (WinterFlowArrayHelper.WinterFlowBackendCacheManager()) {
            try {
                WinterFlowBatchUI.add(WinterFlowArrayHelper.WinterFlowVariableVersionControl(0));
            } finally {
            }
        }
        WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, null);
        ListIterator listIterator = WinterFlowUnitTestLibrary.WinterFlowServerProtocol(WinterFlowBatchUI).listIterator(0);
        while (true) {
            WinterFlowClassAlgorithm winterFlowClassAlgorithm = (WinterFlowClassAlgorithm) listIterator;
            if (!winterFlowClassAlgorithm.hasNext()) {
                return;
            }
            String str = (String) winterFlowClassAlgorithm.next();
            if (WinterFlowHookModule.WinterFlowResolverController(str, "room_fts_content_sync_")) {
                WinterFlowConfigurationException.WinterFlowCacheManagerAgent(winterFlowDeserializationHandler, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023a  */
    @Override // com.google.android.datatransport.WinterFlowRepositoryProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WinterFlowSingletonQuery WinterFlowUnitTestResponse(WinterFlowDeserializationHandler winterFlowDeserializationHandler) {
        long j;
        Map WinterFlowHookDataSource;
        WinterFlowRendererDecorator winterFlowRendererDecorator;
        WinterFlowLibraryUtility winterFlowLibraryUtility;
        winterFlowDeserializationHandler.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new WinterFlowHandlerService("id", "INTEGER", true, 1, null, 1));
        linkedHashMap.put("name", new WinterFlowHandlerService("name", "TEXT", true, 0, null, 1));
        linkedHashMap.put("energyReward", new WinterFlowHandlerService("energyReward", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("imageResId", new WinterFlowHandlerService("imageResId", "INTEGER", true, 0, null, 1));
        WinterFlowLibraryUtility winterFlowLibraryUtility2 = new WinterFlowLibraryUtility(linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        WinterFlowConcurrencyLayer WinterFlowArrayHelper = winterFlowDeserializationHandler.WinterFlowArrayHelper("PRAGMA table_info(`caught_fish`)");
        try {
            long j2 = 0;
            if (WinterFlowArrayHelper.WinterFlowBackendCacheManager()) {
                int WinterFlowHookDataSource2 = WinterFlowProtocolNetwork.WinterFlowHookDataSource(WinterFlowArrayHelper, "name");
                int WinterFlowHookDataSource3 = WinterFlowProtocolNetwork.WinterFlowHookDataSource(WinterFlowArrayHelper, "type");
                int WinterFlowHookDataSource4 = WinterFlowProtocolNetwork.WinterFlowHookDataSource(WinterFlowArrayHelper, "notnull");
                int WinterFlowHookDataSource5 = WinterFlowProtocolNetwork.WinterFlowHookDataSource(WinterFlowArrayHelper, "pk");
                int WinterFlowHookDataSource6 = WinterFlowProtocolNetwork.WinterFlowHookDataSource(WinterFlowArrayHelper, "dflt_value");
                WinterFlowDatabaseScript winterFlowDatabaseScript = new WinterFlowDatabaseScript();
                while (true) {
                    String WinterFlowVariableVersionControl = WinterFlowArrayHelper.WinterFlowVariableVersionControl(WinterFlowHookDataSource2);
                    j = j2;
                    winterFlowDatabaseScript.put(WinterFlowVariableVersionControl, new WinterFlowHandlerService(WinterFlowVariableVersionControl, WinterFlowArrayHelper.WinterFlowVariableVersionControl(WinterFlowHookDataSource3), WinterFlowArrayHelper.getLong(WinterFlowHookDataSource4) != j2, (int) WinterFlowArrayHelper.getLong(WinterFlowHookDataSource5), WinterFlowArrayHelper.isNull(WinterFlowHookDataSource6) ? null : WinterFlowArrayHelper.WinterFlowVariableVersionControl(WinterFlowHookDataSource6), 2));
                    if (!WinterFlowArrayHelper.WinterFlowBackendCacheManager()) {
                        break;
                    }
                    winterFlowLibraryUtility2 = winterFlowLibraryUtility2;
                    j2 = j;
                }
                WinterFlowHookDataSource = winterFlowDatabaseScript.WinterFlowHookDataSource();
                WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, null);
            } else {
                WinterFlowHookDataSource = WinterFlowFrontendNode.WinterFlowVariableVersionControl;
                WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, null);
                j = 0;
            }
            WinterFlowArrayHelper = winterFlowDeserializationHandler.WinterFlowArrayHelper("PRAGMA foreign_key_list(`caught_fish`)");
            try {
                int WinterFlowHookDataSource7 = WinterFlowProtocolNetwork.WinterFlowHookDataSource(WinterFlowArrayHelper, "id");
                int WinterFlowHookDataSource8 = WinterFlowProtocolNetwork.WinterFlowHookDataSource(WinterFlowArrayHelper, "seq");
                int WinterFlowHookDataSource9 = WinterFlowProtocolNetwork.WinterFlowHookDataSource(WinterFlowArrayHelper, "table");
                int WinterFlowHookDataSource10 = WinterFlowProtocolNetwork.WinterFlowHookDataSource(WinterFlowArrayHelper, "on_delete");
                int WinterFlowHookDataSource11 = WinterFlowProtocolNetwork.WinterFlowHookDataSource(WinterFlowArrayHelper, "on_update");
                List WinterFlowTransactionManagerStrategy = WinterFlowProtocolNetwork.WinterFlowTransactionManagerStrategy(WinterFlowArrayHelper);
                WinterFlowArrayHelper.reset();
                WinterFlowRendererDecorator winterFlowRendererDecorator2 = new WinterFlowRendererDecorator();
                while (WinterFlowArrayHelper.WinterFlowBackendCacheManager()) {
                    if (WinterFlowArrayHelper.getLong(WinterFlowHookDataSource8) == j) {
                        WinterFlowLibraryUtility winterFlowLibraryUtility3 = winterFlowLibraryUtility2;
                        int i = (int) WinterFlowArrayHelper.getLong(WinterFlowHookDataSource7);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : WinterFlowTransactionManagerStrategy) {
                            int i2 = WinterFlowHookDataSource7;
                            if (((WinterFlowLoaderService) obj).WinterFlowVariableVersionControl == i) {
                                arrayList3.add(obj);
                            }
                            WinterFlowHookDataSource7 = i2;
                        }
                        int i3 = WinterFlowHookDataSource7;
                        int i4 = 0;
                        for (int size = arrayList3.size(); i4 < size; size = size) {
                            Object obj2 = arrayList3.get(i4);
                            i4++;
                            WinterFlowLoaderService winterFlowLoaderService = (WinterFlowLoaderService) obj2;
                            arrayList.add(winterFlowLoaderService.WinterFlowUnitTestResponse);
                            arrayList2.add(winterFlowLoaderService.WinterFlowRouterRouter);
                        }
                        winterFlowRendererDecorator2.add(new WinterFlowVersionControlValidator(WinterFlowArrayHelper.WinterFlowVariableVersionControl(WinterFlowHookDataSource9), WinterFlowArrayHelper.WinterFlowVariableVersionControl(WinterFlowHookDataSource10), WinterFlowArrayHelper.WinterFlowVariableVersionControl(WinterFlowHookDataSource11), arrayList, arrayList2));
                        winterFlowLibraryUtility2 = winterFlowLibraryUtility3;
                        WinterFlowHookDataSource7 = i3;
                    }
                }
                WinterFlowLibraryUtility winterFlowLibraryUtility4 = winterFlowLibraryUtility2;
                WinterFlowRendererDecorator WinterFlowHookDataSource12 = WinterFlowMicroserviceWidget.WinterFlowHookDataSource(winterFlowRendererDecorator2);
                WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, null);
                WinterFlowArrayHelper = winterFlowDeserializationHandler.WinterFlowArrayHelper("PRAGMA index_list(`caught_fish`)");
                try {
                    int WinterFlowHookDataSource13 = WinterFlowProtocolNetwork.WinterFlowHookDataSource(WinterFlowArrayHelper, "name");
                    int WinterFlowHookDataSource14 = WinterFlowProtocolNetwork.WinterFlowHookDataSource(WinterFlowArrayHelper, "origin");
                    int WinterFlowHookDataSource15 = WinterFlowProtocolNetwork.WinterFlowHookDataSource(WinterFlowArrayHelper, "unique");
                    if (WinterFlowHookDataSource13 != -1 && WinterFlowHookDataSource14 != -1 && WinterFlowHookDataSource15 != -1) {
                        WinterFlowRendererDecorator winterFlowRendererDecorator3 = new WinterFlowRendererDecorator();
                        while (WinterFlowArrayHelper.WinterFlowBackendCacheManager()) {
                            if ("c".equals(WinterFlowArrayHelper.WinterFlowVariableVersionControl(WinterFlowHookDataSource14))) {
                                WinterFlowGatewayNode WinterFlowUnitTestResponse = WinterFlowProtocolNetwork.WinterFlowUnitTestResponse(winterFlowDeserializationHandler, WinterFlowArrayHelper.WinterFlowVariableVersionControl(WinterFlowHookDataSource13), WinterFlowArrayHelper.getLong(WinterFlowHookDataSource15) == 1);
                                if (WinterFlowUnitTestResponse == null) {
                                    WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, null);
                                } else {
                                    winterFlowRendererDecorator3.add(WinterFlowUnitTestResponse);
                                }
                            }
                        }
                        WinterFlowRendererDecorator WinterFlowHookDataSource16 = WinterFlowMicroserviceWidget.WinterFlowHookDataSource(winterFlowRendererDecorator3);
                        WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, null);
                        winterFlowRendererDecorator = WinterFlowHookDataSource16;
                        winterFlowLibraryUtility = new WinterFlowLibraryUtility(WinterFlowHookDataSource, WinterFlowHookDataSource12, winterFlowRendererDecorator);
                        if (!winterFlowLibraryUtility4.equals(winterFlowLibraryUtility)) {
                            return new WinterFlowSingletonQuery((String) null, true);
                        }
                        return new WinterFlowSingletonQuery("caught_fish(com.icewinter.flow.winter.icecatch.db.model.FishEntity).\n Expected:\n" + winterFlowLibraryUtility4 + "\n Found:\n" + winterFlowLibraryUtility, false);
                    }
                    WinterFlowCacheRuntime.WinterFlowThreadListener(WinterFlowArrayHelper, null);
                    winterFlowRendererDecorator = null;
                    winterFlowLibraryUtility = new WinterFlowLibraryUtility(WinterFlowHookDataSource, WinterFlowHookDataSource12, winterFlowRendererDecorator);
                    if (!winterFlowLibraryUtility4.equals(winterFlowLibraryUtility)) {
                    }
                } finally {
                }
            } catch (Throwable th) {
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

    @Override // com.google.android.datatransport.WinterFlowRepositoryProtocol
    public final void WinterFlowVariableVersionControl(WinterFlowDeserializationHandler winterFlowDeserializationHandler) {
        winterFlowDeserializationHandler.getClass();
    }
}
