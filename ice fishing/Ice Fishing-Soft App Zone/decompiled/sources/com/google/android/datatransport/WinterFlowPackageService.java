package com.google.android.datatransport;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowPackageService implements WinterFlowFrontendDatabase, WinterFlowUserManagerSubsystem {
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;
    public final /* synthetic */ long WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowPackageService(long j, Object obj, Object obj2) {
        this.WinterFlowTransactionManagerStrategy = obj;
        this.WinterFlowUnitTestResponse = obj2;
        this.WinterFlowVariableVersionControl = j;
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerSubsystem
    public Object WinterFlowHookDataSource() {
        WinterFlowJSONProxy winterFlowJSONProxy = (WinterFlowJSONProxy) this.WinterFlowTransactionManagerStrategy;
        WinterFlowViewNode winterFlowViewNode = (WinterFlowViewNode) this.WinterFlowUnitTestResponse;
        WinterFlowFrameworkManager winterFlowFrameworkManager = (WinterFlowFrameworkManager) winterFlowJSONProxy.WinterFlowCacheManagerAgent;
        long WinterFlowTransactionManagerStrategy = ((WinterFlowFunctionProcessor) winterFlowJSONProxy.WinterFlowUnitTestResponse).WinterFlowTransactionManagerStrategy() + this.WinterFlowVariableVersionControl;
        winterFlowFrameworkManager.getClass();
        winterFlowFrameworkManager.WinterFlowTransactionManagerStrategy(new WinterFlowWorkerSubsystem(WinterFlowTransactionManagerStrategy, winterFlowViewNode));
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowFrontendDatabase
    public Object apply(Object obj) {
        String str = (String) this.WinterFlowTransactionManagerStrategy;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((WinterFlowProtocol) this.WinterFlowUnitTestResponse).WinterFlowVariableVersionControl;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = rawQuery.getCount() > 0;
            rawQuery.close();
            long j = this.WinterFlowVariableVersionControl;
            if (z) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
