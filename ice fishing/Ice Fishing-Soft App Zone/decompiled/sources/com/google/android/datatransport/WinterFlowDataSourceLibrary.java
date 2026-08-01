package com.google.android.datatransport;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowDataSourceLibrary implements WinterFlowVersionEngine {
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowDataSourceLibrary(int i, Object obj) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowVersionEngine
    public final Object WinterFlowTransactionAgent(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.WinterFlowVariableVersionControl;
        Object obj5 = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowRendererEngine winterFlowRendererEngine = (WinterFlowRendererEngine) obj5;
                WinterFlowControllerInvoker WinterFlowHookDataSource = ((WinterFlowObjectUtility) winterFlowRendererEngine.WinterFlowSyntax).WinterFlowHookDataSource((WinterFlowRendererSystem) obj, (WinterFlowObjectHook) obj2, ((WinterFlowPackageTool) obj3).WinterFlowRouterStructure, ((WinterFlowManagerResponse) obj4).WinterFlowRouterStructure);
                if (WinterFlowHookDataSource instanceof WinterFlowCacheNode) {
                    Object obj6 = ((WinterFlowCacheNode) WinterFlowHookDataSource).WinterFlowVariableVersionControl;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                WinterFlowObjectPackage winterFlowObjectPackage = new WinterFlowObjectPackage(WinterFlowHookDataSource, winterFlowRendererEngine.WinterFlowServiceUtility);
                winterFlowRendererEngine.WinterFlowServiceUtility = winterFlowObjectPackage;
                Object obj7 = winterFlowObjectPackage.WinterFlowRouterRouter;
                obj7.getClass();
                return (Typeface) obj7;
            default:
                SQLiteCursorDriver sQLiteCursorDriver = (SQLiteCursorDriver) obj2;
                String str = (String) obj3;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                WinterFlowTransactionAdapter winterFlowTransactionAdapter = new WinterFlowTransactionAdapter(sQLiteQuery);
                WinterFlowLoaderQueue winterFlowLoaderQueue = (WinterFlowLoaderQueue) ((WinterFlowNodeSerializer) obj5).WinterFlowVariableVersionControl;
                int length = winterFlowLoaderQueue.WinterFlowRouterRouter.length;
                for (int i2 = 1; i2 < length; i2++) {
                    int i3 = winterFlowLoaderQueue.WinterFlowRouterRouter[i2];
                    if (i3 == 1) {
                        winterFlowTransactionAdapter.WinterFlowRouterStructure(i2, winterFlowLoaderQueue.WinterFlowSyntax[i2]);
                    } else if (i3 == 2) {
                        winterFlowTransactionAdapter.WinterFlowUnitTestResponse(winterFlowLoaderQueue.WinterFlowResponseEngine[i2], i2);
                    } else if (i3 == 3) {
                        String str2 = winterFlowLoaderQueue.WinterFlowTransactionAgent[i2];
                        str2.getClass();
                        winterFlowTransactionAdapter.WinterFlowResolverController(str2, i2);
                    } else if (i3 == 4) {
                        byte[] bArr = winterFlowLoaderQueue.WinterFlowServerProtocol[i2];
                        bArr.getClass();
                        winterFlowTransactionAdapter.WinterFlowMapperProtocol(i2, bArr);
                    } else if (i3 == 5) {
                        winterFlowTransactionAdapter.WinterFlowResponseEngine(i2);
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }
}
