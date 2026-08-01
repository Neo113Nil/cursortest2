package com.google.android.datatransport;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowTransactionManagerPlatform implements WinterFlowUserManagerSubsystem, WinterFlowFrontendDatabase {
    public final /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ Object WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowTransactionManagerPlatform(WinterFlowFrameworkManager winterFlowFrameworkManager, Object obj, WinterFlowViewNode winterFlowViewNode, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowUnitTestResponse = winterFlowFrameworkManager;
        this.WinterFlowRouterRouter = obj;
        this.WinterFlowTransactionManagerStrategy = winterFlowViewNode;
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerSubsystem
    public Object WinterFlowHookDataSource() {
        WinterFlowDatabaseSchemaBatch winterFlowDatabaseSchemaBatch = (WinterFlowDatabaseSchemaBatch) this.WinterFlowUnitTestResponse;
        WinterFlowViewNode winterFlowViewNode = (WinterFlowViewNode) this.WinterFlowTransactionManagerStrategy;
        WinterFlowObjectFrontend winterFlowObjectFrontend = (WinterFlowObjectFrontend) this.WinterFlowRouterRouter;
        WinterFlowFrameworkManager winterFlowFrameworkManager = winterFlowDatabaseSchemaBatch.WinterFlowArrayNetwork;
        winterFlowFrameworkManager.getClass();
        WinterFlowMicroserviceSubsystem winterFlowMicroserviceSubsystem = winterFlowViewNode.WinterFlowCacheManagerAgent;
        if (Log.isLoggable("TRuntime.".concat("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(winterFlowMicroserviceSubsystem);
        }
        ((Long) winterFlowFrameworkManager.WinterFlowTransactionManagerStrategy(new WinterFlowTransactionManagerPlatform(winterFlowFrameworkManager, (Object) winterFlowObjectFrontend, winterFlowViewNode, 2))).getClass();
        winterFlowDatabaseSchemaBatch.WinterFlowRouterStructure.WinterFlowRouterAdapter(winterFlowViewNode, 1, false);
        return null;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e A[SYNTHETIC] */
    @Override // com.google.android.datatransport.WinterFlowFrontendDatabase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        Object obj2;
        WinterFlowFrameworkManager winterFlowFrameworkManager;
        String str;
        long insert;
        WinterFlowProtocol winterFlowProtocol;
        int i = this.WinterFlowVariableVersionControl;
        String str2 = "bytes";
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        WinterFlowProtocol winterFlowProtocol2 = WinterFlowProtocol.CACHE_FULL;
        int i6 = 2;
        Object obj3 = null;
        Object obj4 = this.WinterFlowRouterRouter;
        Object obj5 = this.WinterFlowTransactionManagerStrategy;
        int i7 = 0;
        WinterFlowFrameworkManager winterFlowFrameworkManager2 = (WinterFlowFrameworkManager) this.WinterFlowUnitTestResponse;
        switch (i) {
            case 1:
                ArrayList arrayList = (ArrayList) obj4;
                WinterFlowViewNode winterFlowViewNode = (WinterFlowViewNode) obj5;
                Cursor cursor = (Cursor) obj;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    boolean z = cursor.getInt(7) != 0;
                    WinterFlowSchedulerParser winterFlowSchedulerParser = new WinterFlowSchedulerParser();
                    winterFlowSchedulerParser.WinterFlowTransactionManagerStrategy = new HashMap();
                    String string = cursor.getString(1);
                    if (string == null) {
                        Object obj6 = obj3;
                        WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("Null transportName");
                        return obj6;
                    }
                    winterFlowSchedulerParser.WinterFlowRouterStructure = string;
                    winterFlowSchedulerParser.WinterFlowArrayNetwork = Long.valueOf(cursor.getLong(i6));
                    winterFlowSchedulerParser.WinterFlowVariableVersionControl = Long.valueOf(cursor.getLong(3));
                    if (z) {
                        String string2 = cursor.getString(4);
                        winterFlowSchedulerParser.WinterFlowCacheManagerAgent = new WinterFlowBatchSubsystem(string2 == null ? WinterFlowFrameworkManager.WinterFlowResponseEngine : new WinterFlowFrontendCache(string2), cursor.getBlob(5));
                        winterFlowFrameworkManager = winterFlowFrameworkManager2;
                        str = str2;
                        obj2 = obj3;
                    } else {
                        String string3 = cursor.getString(4);
                        WinterFlowFrontendCache winterFlowFrontendCache = string3 == null ? WinterFlowFrameworkManager.WinterFlowResponseEngine : new WinterFlowFrontendCache(string3);
                        Cursor query = winterFlowFrameworkManager2.WinterFlowHookDataSource().query("event_payloads", new String[]{str2}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int i8 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(0);
                                arrayList2.add(blob);
                                i8 += blob.length;
                                obj3 = obj3;
                            }
                            obj2 = obj3;
                            byte[] bArr = new byte[i8];
                            int i9 = 0;
                            int i10 = 0;
                            while (i9 < arrayList2.size()) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i9);
                                WinterFlowFrameworkManager winterFlowFrameworkManager3 = winterFlowFrameworkManager2;
                                String str3 = str2;
                                System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                                i10 += bArr2.length;
                                i9++;
                                winterFlowFrameworkManager2 = winterFlowFrameworkManager3;
                                str2 = str3;
                            }
                            winterFlowFrameworkManager = winterFlowFrameworkManager2;
                            str = str2;
                            query.close();
                            winterFlowSchedulerParser.WinterFlowCacheManagerAgent = new WinterFlowBatchSubsystem(winterFlowFrontendCache, bArr);
                        } catch (Throwable th) {
                            query.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        winterFlowSchedulerParser.WinterFlowHookDataSource = Integer.valueOf(cursor.getInt(6));
                    }
                    arrayList.add(new WinterFlowBackendEngine(j, winterFlowViewNode, winterFlowSchedulerParser.WinterFlowUnitTestResponse()));
                    obj3 = obj2;
                    winterFlowFrameworkManager2 = winterFlowFrameworkManager;
                    str2 = str;
                    i6 = 2;
                }
                return obj3;
            case 2:
                WinterFlowObjectFrontend winterFlowObjectFrontend = (WinterFlowObjectFrontend) obj4;
                WinterFlowBatchSubsystem winterFlowBatchSubsystem = winterFlowObjectFrontend.WinterFlowCacheManagerAgent;
                String str4 = winterFlowObjectFrontend.WinterFlowRouterStructure;
                WinterFlowViewNode winterFlowViewNode2 = (WinterFlowViewNode) obj5;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = winterFlowFrameworkManager2.WinterFlowHookDataSource().compileStatement("PRAGMA page_size").simpleQueryForLong() * winterFlowFrameworkManager2.WinterFlowHookDataSource().compileStatement("PRAGMA page_count").simpleQueryForLong();
                WinterFlowLibraryStack winterFlowLibraryStack = winterFlowFrameworkManager2.WinterFlowRouterRouter;
                if (simpleQueryForLong >= winterFlowLibraryStack.WinterFlowRouterStructure) {
                    winterFlowFrameworkManager2.WinterFlowTransactionAgent(1L, winterFlowProtocol2, str4);
                    return -1L;
                }
                Long WinterFlowArrayNetwork = WinterFlowFrameworkManager.WinterFlowArrayNetwork(sQLiteDatabase, winterFlowViewNode2);
                if (WinterFlowArrayNetwork != null) {
                    insert = WinterFlowArrayNetwork.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", winterFlowViewNode2.WinterFlowRouterStructure);
                    contentValues.put("priority", Integer.valueOf(WinterFlowProxyCompiler.WinterFlowRouterStructure(winterFlowViewNode2.WinterFlowCacheManagerAgent)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr3 = winterFlowViewNode2.WinterFlowHookDataSource;
                    if (bArr3 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr3, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i11 = winterFlowLibraryStack.WinterFlowVariableVersionControl;
                byte[] bArr4 = winterFlowBatchSubsystem.WinterFlowHookDataSource;
                boolean z2 = bArr4.length <= i11;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str4);
                contentValues2.put("timestamp_ms", Long.valueOf(winterFlowObjectFrontend.WinterFlowArrayNetwork));
                contentValues2.put("uptime_ms", Long.valueOf(winterFlowObjectFrontend.WinterFlowVariableVersionControl));
                contentValues2.put("payload_encoding", winterFlowBatchSubsystem.WinterFlowRouterStructure.WinterFlowRouterStructure);
                contentValues2.put("code", winterFlowObjectFrontend.WinterFlowHookDataSource);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z2));
                contentValues2.put("payload", z2 ? bArr4 : new byte[0]);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z2) {
                    int ceil = (int) Math.ceil(bArr4.length / i11);
                    for (int i12 = 1; i12 <= ceil; i12++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr4, (i12 - 1) * i11, Math.min(i12 * i11, bArr4.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i12));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(winterFlowObjectFrontend.WinterFlowTransactionManagerStrategy).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            default:
                HashMap hashMap = (HashMap) obj5;
                WinterFlowStackProvider winterFlowStackProvider = (WinterFlowStackProvider) obj4;
                ArrayList arrayList3 = (ArrayList) winterFlowStackProvider.WinterFlowUnitTestResponse;
                Cursor cursor2 = (Cursor) obj;
                winterFlowFrameworkManager2.getClass();
                while (cursor2.moveToNext()) {
                    String string4 = cursor2.getString(i7);
                    int i13 = cursor2.getInt(1);
                    WinterFlowProtocol winterFlowProtocol3 = WinterFlowProtocol.REASON_UNKNOWN;
                    if (i13 != 0) {
                        if (i13 == 1) {
                            winterFlowProtocol3 = WinterFlowProtocol.MESSAGE_TOO_OLD;
                        } else if (i13 == 2) {
                            winterFlowProtocol = winterFlowProtocol2;
                            long j2 = cursor2.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new WinterFlowAPIInvoker(j2, winterFlowProtocol));
                            i2 = 6;
                            i3 = 5;
                            i4 = 4;
                            i5 = 3;
                            i7 = 0;
                        } else if (i13 == i5) {
                            winterFlowProtocol3 = WinterFlowProtocol.PAYLOAD_TOO_BIG;
                        } else if (i13 == i4) {
                            winterFlowProtocol3 = WinterFlowProtocol.MAX_RETRIES_REACHED;
                        } else if (i13 == i3) {
                            winterFlowProtocol3 = WinterFlowProtocol.INVALID_PAYLOD;
                        } else if (i13 == i2) {
                            winterFlowProtocol3 = WinterFlowProtocol.SERVER_ERROR;
                        } else {
                            WinterFlowServerManager.WinterFlowBandwidthObject("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i13));
                        }
                    }
                    winterFlowProtocol = winterFlowProtocol3;
                    long j22 = cursor2.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new WinterFlowAPIInvoker(j22, winterFlowProtocol));
                    i2 = 6;
                    i3 = 5;
                    i4 = 4;
                    i5 = 3;
                    i7 = 0;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i14 = WinterFlowListenerFramework.WinterFlowCacheManagerAgent;
                    new ArrayList();
                    arrayList3.add(new WinterFlowListenerFramework((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long WinterFlowTransactionManagerStrategy = winterFlowFrameworkManager2.WinterFlowTransactionManagerStrategy.WinterFlowTransactionManagerStrategy();
                SQLiteDatabase WinterFlowHookDataSource = winterFlowFrameworkManager2.WinterFlowHookDataSource();
                WinterFlowHookDataSource.beginTransaction();
                try {
                    Cursor rawQuery = WinterFlowHookDataSource.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        WinterFlowRequestDecorator winterFlowRequestDecorator = new WinterFlowRequestDecorator(rawQuery.getLong(0), WinterFlowTransactionManagerStrategy);
                        rawQuery.close();
                        WinterFlowHookDataSource.setTransactionSuccessful();
                        WinterFlowHookDataSource.endTransaction();
                        winterFlowStackProvider.WinterFlowTransactionManagerStrategy = winterFlowRequestDecorator;
                        winterFlowStackProvider.WinterFlowRouterRouter = new WinterFlowHandler(new WinterFlowServiceResolver(winterFlowFrameworkManager2.WinterFlowHookDataSource().compileStatement("PRAGMA page_size").simpleQueryForLong() * winterFlowFrameworkManager2.WinterFlowHookDataSource().compileStatement("PRAGMA page_count").simpleQueryForLong(), WinterFlowLibraryStack.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure));
                        winterFlowStackProvider.WinterFlowVariableVersionControl = (String) winterFlowFrameworkManager2.WinterFlowSyntax.get();
                        return new WinterFlowObjectAgent((WinterFlowRequestDecorator) winterFlowStackProvider.WinterFlowTransactionManagerStrategy, Collections.unmodifiableList(arrayList3), (WinterFlowHandler) winterFlowStackProvider.WinterFlowRouterRouter, (String) winterFlowStackProvider.WinterFlowVariableVersionControl);
                    } catch (Throwable th2) {
                        rawQuery.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    WinterFlowHookDataSource.endTransaction();
                    throw th3;
                }
        }
    }

    public /* synthetic */ WinterFlowTransactionManagerPlatform(Object obj, Object obj2, Object obj3, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowUnitTestResponse = obj;
        this.WinterFlowTransactionManagerStrategy = obj2;
        this.WinterFlowRouterRouter = obj3;
    }
}
