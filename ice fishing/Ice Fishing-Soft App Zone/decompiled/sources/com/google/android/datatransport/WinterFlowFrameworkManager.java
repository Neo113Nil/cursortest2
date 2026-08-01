package com.google.android.datatransport;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrameworkManager implements Closeable {
    public static final WinterFlowFrontendCache WinterFlowResponseEngine = new WinterFlowFrontendCache("proto");
    public final WinterFlowLibraryStack WinterFlowRouterRouter;
    public final WinterFlowSoftwareStrategy WinterFlowSyntax;
    public final WinterFlowFunctionProcessor WinterFlowTransactionManagerStrategy;
    public final WinterFlowFunctionProcessor WinterFlowUnitTestResponse;
    public final WinterFlowVersionControlTransaction WinterFlowVariableVersionControl;

    public WinterFlowFrameworkManager(WinterFlowFunctionProcessor winterFlowFunctionProcessor, WinterFlowFunctionProcessor winterFlowFunctionProcessor2, WinterFlowLibraryStack winterFlowLibraryStack, WinterFlowVersionControlTransaction winterFlowVersionControlTransaction, WinterFlowSoftwareStrategy winterFlowSoftwareStrategy) {
        this.WinterFlowVariableVersionControl = winterFlowVersionControlTransaction;
        this.WinterFlowTransactionManagerStrategy = winterFlowFunctionProcessor;
        this.WinterFlowUnitTestResponse = winterFlowFunctionProcessor2;
        this.WinterFlowRouterRouter = winterFlowLibraryStack;
        this.WinterFlowSyntax = winterFlowSoftwareStrategy;
    }

    public static Long WinterFlowArrayNetwork(SQLiteDatabase sQLiteDatabase, WinterFlowViewNode winterFlowViewNode) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(winterFlowViewNode.WinterFlowRouterStructure, String.valueOf(WinterFlowProxyCompiler.WinterFlowRouterStructure(winterFlowViewNode.WinterFlowCacheManagerAgent))));
        byte[] bArr = winterFlowViewNode.WinterFlowHookDataSource;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public static Object WinterFlowBandwidthObject(Cursor cursor, WinterFlowFrontendDatabase winterFlowFrontendDatabase) {
        try {
            return winterFlowFrontendDatabase.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static String WinterFlowServiceUtility(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((WinterFlowBackendEngine) it.next()).WinterFlowRouterStructure);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final SQLiteDatabase WinterFlowHookDataSource() {
        WinterFlowVersionControlTransaction winterFlowVersionControlTransaction = this.WinterFlowVariableVersionControl;
        Objects.requireNonNull(winterFlowVersionControlTransaction);
        WinterFlowFunctionProcessor winterFlowFunctionProcessor = this.WinterFlowUnitTestResponse;
        long WinterFlowTransactionManagerStrategy = winterFlowFunctionProcessor.WinterFlowTransactionManagerStrategy();
        while (true) {
            try {
                return winterFlowVersionControlTransaction.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (winterFlowFunctionProcessor.WinterFlowTransactionManagerStrategy() >= this.WinterFlowRouterRouter.WinterFlowCacheManagerAgent + WinterFlowTransactionManagerStrategy) {
                    throw new WinterFlowXMLTool("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final ArrayList WinterFlowRouterRouter(SQLiteDatabase sQLiteDatabase, WinterFlowViewNode winterFlowViewNode, int i) {
        ArrayList arrayList = new ArrayList();
        Long WinterFlowArrayNetwork = WinterFlowArrayNetwork(sQLiteDatabase, winterFlowViewNode);
        if (WinterFlowArrayNetwork == null) {
            return arrayList;
        }
        WinterFlowBandwidthObject(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{WinterFlowArrayNetwork.toString()}, null, null, null, String.valueOf(i)), new WinterFlowTransactionManagerPlatform(this, (Object) arrayList, winterFlowViewNode, 1));
        return arrayList;
    }

    public final Object WinterFlowThreadListener(WinterFlowUserManagerSubsystem winterFlowUserManagerSubsystem) {
        SQLiteDatabase WinterFlowHookDataSource = WinterFlowHookDataSource();
        WinterFlowFunctionProcessor winterFlowFunctionProcessor = this.WinterFlowUnitTestResponse;
        long WinterFlowTransactionManagerStrategy = winterFlowFunctionProcessor.WinterFlowTransactionManagerStrategy();
        while (true) {
            try {
                WinterFlowHookDataSource.beginTransaction();
                try {
                    Object WinterFlowHookDataSource2 = winterFlowUserManagerSubsystem.WinterFlowHookDataSource();
                    WinterFlowHookDataSource.setTransactionSuccessful();
                    return WinterFlowHookDataSource2;
                } finally {
                    WinterFlowHookDataSource.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (winterFlowFunctionProcessor.WinterFlowTransactionManagerStrategy() >= this.WinterFlowRouterRouter.WinterFlowCacheManagerAgent + WinterFlowTransactionManagerStrategy) {
                    throw new WinterFlowXMLTool("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final void WinterFlowTransactionAgent(long j, WinterFlowProtocol winterFlowProtocol, String str) {
        WinterFlowTransactionManagerStrategy(new WinterFlowPackageService(j, str, winterFlowProtocol));
    }

    public final Object WinterFlowTransactionManagerStrategy(WinterFlowFrontendDatabase winterFlowFrontendDatabase) {
        SQLiteDatabase WinterFlowHookDataSource = WinterFlowHookDataSource();
        WinterFlowHookDataSource.beginTransaction();
        try {
            Object apply = winterFlowFrontendDatabase.apply(WinterFlowHookDataSource);
            WinterFlowHookDataSource.setTransactionSuccessful();
            return apply;
        } finally {
            WinterFlowHookDataSource.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.WinterFlowVariableVersionControl.close();
    }
}
