package com.google.android.datatransport;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProvider extends SQLiteOpenHelper {
    public static final /* synthetic */ int WinterFlowTransactionAgent = 0;
    public boolean WinterFlowResponseEngine;
    public boolean WinterFlowRouterRouter;
    public final WinterFlowServiceHelper WinterFlowSyntax;
    public final WinterFlowConfigurationModule WinterFlowTransactionManagerStrategy;
    public final WinterFlowSyntax WinterFlowUnitTestResponse;
    public final Context WinterFlowVariableVersionControl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowProvider(Context context, String str, final WinterFlowConfigurationModule winterFlowConfigurationModule, final WinterFlowSyntax winterFlowSyntax) {
        super(context, str, null, winterFlowSyntax.WinterFlowRouterStructure, new DatabaseErrorHandler() { // from class: com.google.android.datatransport.WinterFlowFrontendRuntime
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = WinterFlowProvider.WinterFlowTransactionAgent;
                sQLiteDatabase.getClass();
                WinterFlowConfigurationModule winterFlowConfigurationModule2 = winterFlowConfigurationModule;
                WinterFlowSchedulerSyntax winterFlowSchedulerSyntax = (WinterFlowSchedulerSyntax) winterFlowConfigurationModule2.WinterFlowTransactionManagerStrategy;
                if (winterFlowSchedulerSyntax == null || !winterFlowSchedulerSyntax.WinterFlowVariableVersionControl.equals(sQLiteDatabase)) {
                    winterFlowSchedulerSyntax = new WinterFlowSchedulerSyntax(sQLiteDatabase);
                    winterFlowConfigurationModule2.WinterFlowTransactionManagerStrategy = winterFlowSchedulerSyntax;
                }
                SQLiteDatabase sQLiteDatabase2 = winterFlowSchedulerSyntax.WinterFlowVariableVersionControl;
                WinterFlowSyntax.this.getClass();
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        WinterFlowSyntax.WinterFlowArrayNetwork(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                WinterFlowSyntax.WinterFlowArrayNetwork((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                WinterFlowSyntax.WinterFlowArrayNetwork(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    winterFlowSchedulerSyntax.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            }
        });
        String str2;
        context.getClass();
        winterFlowSyntax.getClass();
        this.WinterFlowVariableVersionControl = context;
        this.WinterFlowTransactionManagerStrategy = winterFlowConfigurationModule;
        this.WinterFlowUnitTestResponse = winterFlowSyntax;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            str2.getClass();
        } else {
            str2 = str;
        }
        this.WinterFlowSyntax = new WinterFlowServiceHelper(str2, context.getCacheDir(), false);
    }

    public final WinterFlowSchedulerSyntax WinterFlowArrayNetwork(SQLiteDatabase sQLiteDatabase) {
        WinterFlowConfigurationModule winterFlowConfigurationModule = this.WinterFlowTransactionManagerStrategy;
        WinterFlowSchedulerSyntax winterFlowSchedulerSyntax = (WinterFlowSchedulerSyntax) winterFlowConfigurationModule.WinterFlowTransactionManagerStrategy;
        if (winterFlowSchedulerSyntax != null && winterFlowSchedulerSyntax.WinterFlowVariableVersionControl.equals(sQLiteDatabase)) {
            return winterFlowSchedulerSyntax;
        }
        WinterFlowSchedulerSyntax winterFlowSchedulerSyntax2 = new WinterFlowSchedulerSyntax(sQLiteDatabase);
        winterFlowConfigurationModule.WinterFlowTransactionManagerStrategy = winterFlowSchedulerSyntax2;
        return winterFlowSchedulerSyntax2;
    }

    public final WinterFlowSchedulerSyntax WinterFlowHookDataSource(boolean z) {
        WinterFlowServiceHelper winterFlowServiceHelper = this.WinterFlowSyntax;
        try {
            winterFlowServiceHelper.WinterFlowRouterStructure((this.WinterFlowResponseEngine || getDatabaseName() == null) ? false : true);
            this.WinterFlowRouterRouter = false;
            SQLiteDatabase WinterFlowTransactionManagerStrategy = WinterFlowTransactionManagerStrategy(z);
            if (!this.WinterFlowRouterRouter) {
                WinterFlowSchedulerSyntax WinterFlowArrayNetwork = WinterFlowArrayNetwork(WinterFlowTransactionManagerStrategy);
                winterFlowServiceHelper.WinterFlowHookDataSource();
                return WinterFlowArrayNetwork;
            }
            close();
            WinterFlowSchedulerSyntax WinterFlowHookDataSource = WinterFlowHookDataSource(z);
            winterFlowServiceHelper.WinterFlowHookDataSource();
            return WinterFlowHookDataSource;
        } catch (Throwable th) {
            winterFlowServiceHelper.WinterFlowHookDataSource();
            throw th;
        }
    }

    public final SQLiteDatabase WinterFlowTransactionManagerStrategy(boolean z) {
        SQLiteDatabase readableDatabase;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.WinterFlowResponseEngine;
        if (databaseName != null && !z2 && (parentFile = this.WinterFlowVariableVersionControl.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                parentFile.toString();
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase2 = getReadableDatabase();
            readableDatabase2.getClass();
            return readableDatabase2;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase = getWritableDatabase();
                    readableDatabase.getClass();
                } else {
                    readableDatabase = getReadableDatabase();
                    readableDatabase.getClass();
                }
                return readableDatabase;
            } catch (Throwable th) {
                th = th;
                if (th instanceof WinterFlowBatchAdapter) {
                    WinterFlowBatchAdapter winterFlowBatchAdapter = (WinterFlowBatchAdapter) th;
                    int ordinal = winterFlowBatchAdapter.WinterFlowVariableVersionControl.ordinal();
                    th = winterFlowBatchAdapter.WinterFlowTransactionManagerStrategy;
                    if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                        throw th;
                    }
                    if (ordinal != 4) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        WinterFlowServiceHelper winterFlowServiceHelper = this.WinterFlowSyntax;
        try {
            winterFlowServiceHelper.WinterFlowRouterStructure(winterFlowServiceHelper.WinterFlowRouterStructure);
            super.close();
            this.WinterFlowTransactionManagerStrategy.WinterFlowTransactionManagerStrategy = null;
            this.WinterFlowResponseEngine = false;
        } finally {
            winterFlowServiceHelper.WinterFlowHookDataSource();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.WinterFlowRouterRouter;
        WinterFlowSyntax winterFlowSyntax = this.WinterFlowUnitTestResponse;
        if (!z && winterFlowSyntax.WinterFlowRouterStructure != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            WinterFlowArrayNetwork(sQLiteDatabase);
            winterFlowSyntax.getClass();
        } catch (Throwable th) {
            throw new WinterFlowBatchAdapter(WinterFlowServiceProviderValidator.WinterFlowVariableVersionControl, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((WinterFlowConsumerServiceProvider) this.WinterFlowUnitTestResponse.WinterFlowHookDataSource).WinterFlowOrchestrationSubsystem(new WinterFlowSerializerDatabase(WinterFlowArrayNetwork(sQLiteDatabase)));
        } catch (Throwable th) {
            throw new WinterFlowBatchAdapter(WinterFlowServiceProviderValidator.WinterFlowTransactionManagerStrategy, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.WinterFlowRouterRouter = true;
        try {
            this.WinterFlowUnitTestResponse.WinterFlowVariableVersionControl(WinterFlowArrayNetwork(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new WinterFlowBatchAdapter(WinterFlowServiceProviderValidator.WinterFlowRouterRouter, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.WinterFlowRouterRouter) {
            try {
                WinterFlowSyntax winterFlowSyntax = this.WinterFlowUnitTestResponse;
                WinterFlowSchedulerSyntax WinterFlowArrayNetwork = WinterFlowArrayNetwork(sQLiteDatabase);
                WinterFlowConsumerServiceProvider winterFlowConsumerServiceProvider = (WinterFlowConsumerServiceProvider) winterFlowSyntax.WinterFlowHookDataSource;
                winterFlowConsumerServiceProvider.WinterFlowSingletonPlatform(new WinterFlowSerializerDatabase(WinterFlowArrayNetwork));
                winterFlowConsumerServiceProvider.WinterFlowRouterRouter = WinterFlowArrayNetwork;
            } catch (Throwable th) {
                throw new WinterFlowBatchAdapter(WinterFlowServiceProviderValidator.WinterFlowSyntax, th);
            }
        }
        this.WinterFlowResponseEngine = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.WinterFlowRouterRouter = true;
        try {
            this.WinterFlowUnitTestResponse.WinterFlowVariableVersionControl(WinterFlowArrayNetwork(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new WinterFlowBatchAdapter(WinterFlowServiceProviderValidator.WinterFlowUnitTestResponse, th);
        }
    }
}
