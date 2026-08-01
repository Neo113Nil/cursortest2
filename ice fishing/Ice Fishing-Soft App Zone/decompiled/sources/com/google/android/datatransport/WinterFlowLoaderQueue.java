package com.google.android.datatransport;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowLoaderQueue extends WinterFlowAlgorithmService {
    public double[] WinterFlowResponseEngine;
    public int[] WinterFlowRouterRouter;
    public byte[][] WinterFlowServerProtocol;
    public long[] WinterFlowSyntax;
    public Cursor WinterFlowThreadListener;
    public String[] WinterFlowTransactionAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowLoaderQueue(WinterFlowSchedulerSyntax winterFlowSchedulerSyntax, String str) {
        super(winterFlowSchedulerSyntax, str);
        winterFlowSchedulerSyntax.getClass();
        str.getClass();
        this.WinterFlowRouterRouter = new int[0];
        this.WinterFlowSyntax = new long[0];
        this.WinterFlowResponseEngine = new double[0];
        this.WinterFlowTransactionAgent = new String[0];
        this.WinterFlowServerProtocol = new byte[0][];
    }

    public static void WinterFlowRouterRouter(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            WinterFlowConfigurationException.WinterFlowSyntax("column index out of range", 25);
            throw null;
        }
    }

    public final void WinterFlowArrayNetwork(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.WinterFlowRouterRouter;
        if (iArr.length < i3) {
            this.WinterFlowRouterRouter = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.WinterFlowSyntax;
            if (jArr.length < i3) {
                this.WinterFlowSyntax = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.WinterFlowResponseEngine;
            if (dArr.length < i3) {
                this.WinterFlowResponseEngine = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.WinterFlowTransactionAgent;
            if (strArr.length < i3) {
                this.WinterFlowTransactionAgent = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.WinterFlowServerProtocol;
        if (bArr.length < i3) {
            this.WinterFlowServerProtocol = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final boolean WinterFlowBackendCacheManager() {
        WinterFlowHookDataSource();
        WinterFlowTransactionManagerStrategy();
        Cursor cursor = this.WinterFlowThreadListener;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Required value was null.");
        return false;
    }

    @Override // com.google.android.datatransport.WinterFlowAlgorithmService, com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final void WinterFlowCacheManagerAgent() {
        WinterFlowHookDataSource();
        this.WinterFlowRouterRouter = new int[0];
        this.WinterFlowSyntax = new long[0];
        this.WinterFlowResponseEngine = new double[0];
        this.WinterFlowTransactionAgent = new String[0];
        this.WinterFlowServerProtocol = new byte[0][];
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final void WinterFlowRouterStructure(int i, long j) {
        WinterFlowHookDataSource();
        WinterFlowArrayNetwork(1, i);
        this.WinterFlowRouterRouter[i] = 1;
        this.WinterFlowSyntax[i] = j;
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final void WinterFlowSyntax(String str) {
        str.getClass();
        WinterFlowHookDataSource();
        WinterFlowArrayNetwork(3, 2);
        this.WinterFlowRouterRouter[2] = 3;
        this.WinterFlowTransactionAgent[2] = str;
    }

    public final void WinterFlowTransactionManagerStrategy() {
        if (this.WinterFlowThreadListener == null) {
            WinterFlowNodeSerializer winterFlowNodeSerializer = new WinterFlowNodeSerializer(this);
            WinterFlowSchedulerSyntax winterFlowSchedulerSyntax = this.WinterFlowVariableVersionControl;
            winterFlowSchedulerSyntax.getClass();
            final WinterFlowDataSourceLibrary winterFlowDataSourceLibrary = new WinterFlowDataSourceLibrary(1, winterFlowNodeSerializer);
            Cursor rawQueryWithFactory = winterFlowSchedulerSyntax.WinterFlowVariableVersionControl.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: com.google.android.datatransport.WinterFlowRendererDatabaseSchema
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    return (Cursor) WinterFlowDataSourceLibrary.this.WinterFlowTransactionAgent(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            }, ((WinterFlowLoaderQueue) winterFlowNodeSerializer.WinterFlowVariableVersionControl).WinterFlowTransactionManagerStrategy, WinterFlowSchedulerSyntax.WinterFlowTransactionManagerStrategy, null);
            rawQueryWithFactory.getClass();
            this.WinterFlowThreadListener = rawQueryWithFactory;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final String WinterFlowVariableVersionControl(int i) {
        WinterFlowHookDataSource();
        Cursor cursor = this.WinterFlowThreadListener;
        if (cursor == null) {
            WinterFlowConfigurationException.WinterFlowSyntax("no row", 21);
            throw null;
        }
        WinterFlowRouterRouter(cursor, i);
        String string = cursor.getString(i);
        string.getClass();
        return string;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.WinterFlowUnitTestResponse) {
            WinterFlowCacheManagerAgent();
            reset();
        }
        this.WinterFlowUnitTestResponse = true;
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final int getColumnCount() {
        WinterFlowHookDataSource();
        WinterFlowTransactionManagerStrategy();
        Cursor cursor = this.WinterFlowThreadListener;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final String getColumnName(int i) {
        WinterFlowHookDataSource();
        WinterFlowTransactionManagerStrategy();
        Cursor cursor = this.WinterFlowThreadListener;
        if (cursor == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Required value was null.");
            return null;
        }
        WinterFlowRouterRouter(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final long getLong(int i) {
        WinterFlowHookDataSource();
        Cursor cursor = this.WinterFlowThreadListener;
        if (cursor != null) {
            WinterFlowRouterRouter(cursor, i);
            return cursor.getLong(i);
        }
        WinterFlowConfigurationException.WinterFlowSyntax("no row", 21);
        throw null;
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final boolean isNull(int i) {
        WinterFlowHookDataSource();
        Cursor cursor = this.WinterFlowThreadListener;
        if (cursor != null) {
            WinterFlowRouterRouter(cursor, i);
            return cursor.isNull(i);
        }
        WinterFlowConfigurationException.WinterFlowSyntax("no row", 21);
        throw null;
    }

    @Override // com.google.android.datatransport.WinterFlowAlgorithmService, com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final void reset() {
        WinterFlowHookDataSource();
        Cursor cursor = this.WinterFlowThreadListener;
        if (cursor != null) {
            cursor.close();
        }
        this.WinterFlowThreadListener = null;
    }
}
