package com.google.android.datatransport;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowWorkerSubsystem implements WinterFlowFrontendDatabase {
    public final /* synthetic */ WinterFlowViewNode WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ long WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowWorkerSubsystem(long j, WinterFlowViewNode winterFlowViewNode) {
        this.WinterFlowVariableVersionControl = j;
        this.WinterFlowTransactionManagerStrategy = winterFlowViewNode;
    }

    @Override // com.google.android.datatransport.WinterFlowFrontendDatabase
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.WinterFlowVariableVersionControl));
        WinterFlowViewNode winterFlowViewNode = this.WinterFlowTransactionManagerStrategy;
        String str = winterFlowViewNode.WinterFlowRouterStructure;
        WinterFlowMicroserviceSubsystem winterFlowMicroserviceSubsystem = winterFlowViewNode.WinterFlowCacheManagerAgent;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(WinterFlowProxyCompiler.WinterFlowRouterStructure(winterFlowMicroserviceSubsystem))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(WinterFlowProxyCompiler.WinterFlowRouterStructure(winterFlowMicroserviceSubsystem)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
