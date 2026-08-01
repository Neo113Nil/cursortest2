package com.google.android.datatransport;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowQueue extends WinterFlowAlgorithmService {
    public final /* synthetic */ int WinterFlowRouterRouter = 1;
    public final Object WinterFlowSyntax;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowQueue(WinterFlowSchedulerSyntax winterFlowSchedulerSyntax, String str) {
        super(winterFlowSchedulerSyntax, str);
        winterFlowSchedulerSyntax.getClass();
        str.getClass();
        str.getClass();
        SQLiteStatement compileStatement = winterFlowSchedulerSyntax.WinterFlowVariableVersionControl.compileStatement(str);
        compileStatement.getClass();
        this.WinterFlowSyntax = new WinterFlowTransactionProtocol(compileStatement);
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final boolean WinterFlowBackendCacheManager() {
        int i = this.WinterFlowRouterRouter;
        WinterFlowSchedulerSyntax winterFlowSchedulerSyntax = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowSyntax;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                WinterFlowLoaderQueue winterFlowLoaderQueue = (WinterFlowLoaderQueue) obj;
                boolean WinterFlowBackendCacheManager = winterFlowLoaderQueue.WinterFlowBackendCacheManager();
                if (!winterFlowLoaderQueue.WinterFlowVariableVersionControl(0).equalsIgnoreCase("wal")) {
                    winterFlowSchedulerSyntax.WinterFlowVariableVersionControl.disableWriteAheadLogging();
                    break;
                } else {
                    winterFlowSchedulerSyntax.WinterFlowVariableVersionControl.enableWriteAheadLogging();
                    break;
                }
            case 1:
                WinterFlowHookDataSource();
                ((WinterFlowTransactionProtocol) obj).WinterFlowTransactionManagerStrategy.execute();
                break;
            default:
                int ordinal = ((WinterFlowDebugException) obj).ordinal();
                if (ordinal == 0) {
                    winterFlowSchedulerSyntax.WinterFlowVariableVersionControl.setTransactionSuccessful();
                    winterFlowSchedulerSyntax.WinterFlowArrayNetwork();
                    break;
                } else if (ordinal == 1) {
                    winterFlowSchedulerSyntax.WinterFlowArrayNetwork();
                    break;
                } else if (ordinal == 2) {
                    winterFlowSchedulerSyntax.WinterFlowHookDataSource();
                    break;
                } else if (ordinal == 3) {
                    winterFlowSchedulerSyntax.WinterFlowVariableVersionControl.beginTransactionNonExclusive();
                    break;
                } else if (ordinal != 4) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                    break;
                } else {
                    SQLiteDatabase sQLiteDatabase = winterFlowSchedulerSyntax.WinterFlowVariableVersionControl;
                    WinterFlowCloudCache winterFlowCloudCache = WinterFlowSchedulerSyntax.WinterFlowRouterRouter;
                    if (((Method) winterFlowCloudCache.getValue()) != null) {
                        WinterFlowCloudCache winterFlowCloudCache2 = WinterFlowSchedulerSyntax.WinterFlowUnitTestResponse;
                        if (((Method) winterFlowCloudCache2.getValue()) != null) {
                            Method method = (Method) winterFlowCloudCache.getValue();
                            method.getClass();
                            Method method2 = (Method) winterFlowCloudCache2.getValue();
                            method2.getClass();
                            Object invoke = method2.invoke(sQLiteDatabase, null);
                            if (invoke == null) {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Required value was null.");
                                break;
                            } else {
                                method.invoke(invoke, 0, null, 0, null);
                                break;
                            }
                        }
                    }
                    winterFlowSchedulerSyntax.WinterFlowHookDataSource();
                    break;
                }
        }
        return false;
    }

    @Override // com.google.android.datatransport.WinterFlowAlgorithmService, com.google.android.datatransport.WinterFlowConcurrencyLayer
    public void WinterFlowCacheManagerAgent() {
        int i = this.WinterFlowRouterRouter;
        Object obj = this.WinterFlowSyntax;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((WinterFlowLoaderQueue) obj).WinterFlowCacheManagerAgent();
                break;
            case 1:
                WinterFlowHookDataSource();
                ((WinterFlowTransactionProtocol) obj).WinterFlowCacheManagerAgent();
                break;
            default:
                super.WinterFlowCacheManagerAgent();
                break;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public boolean WinterFlowConcurrencyThread() {
        switch (this.WinterFlowRouterRouter) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowLoaderQueue) this.WinterFlowSyntax).WinterFlowConcurrencyThread();
            default:
                return super.WinterFlowConcurrencyThread();
        }
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final void WinterFlowRouterStructure(int i, long j) {
        int i2 = this.WinterFlowRouterRouter;
        Object obj = this.WinterFlowSyntax;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((WinterFlowLoaderQueue) obj).WinterFlowRouterStructure(i, j);
                return;
            case 1:
                WinterFlowHookDataSource();
                ((WinterFlowTransactionProtocol) obj).WinterFlowRouterStructure(i, j);
                return;
            default:
                WinterFlowHookDataSource();
                WinterFlowConfigurationException.WinterFlowSyntax("column index out of range", 25);
                throw null;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final void WinterFlowSyntax(String str) {
        int i = this.WinterFlowRouterRouter;
        Object obj = this.WinterFlowSyntax;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                str.getClass();
                ((WinterFlowLoaderQueue) obj).WinterFlowSyntax(str);
                return;
            case 1:
                str.getClass();
                WinterFlowHookDataSource();
                ((WinterFlowTransactionProtocol) obj).WinterFlowResolverController(str, 2);
                return;
            default:
                str.getClass();
                WinterFlowHookDataSource();
                WinterFlowConfigurationException.WinterFlowSyntax("column index out of range", 25);
                throw null;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final String WinterFlowVariableVersionControl(int i) {
        switch (this.WinterFlowRouterRouter) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowLoaderQueue) this.WinterFlowSyntax).WinterFlowVariableVersionControl(i);
            case 1:
                WinterFlowHookDataSource();
                WinterFlowConfigurationException.WinterFlowSyntax("no row", 21);
                throw null;
            default:
                WinterFlowHookDataSource();
                WinterFlowConfigurationException.WinterFlowSyntax("no row", 21);
                throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.WinterFlowRouterRouter;
        Object obj = this.WinterFlowSyntax;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((WinterFlowLoaderQueue) obj).close();
                break;
            case 1:
                ((WinterFlowTransactionProtocol) obj).close();
                this.WinterFlowUnitTestResponse = true;
                break;
            default:
                this.WinterFlowUnitTestResponse = true;
                break;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final int getColumnCount() {
        switch (this.WinterFlowRouterRouter) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                WinterFlowHookDataSource();
                break;
            default:
                WinterFlowHookDataSource();
                break;
        }
        return 0;
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final String getColumnName(int i) {
        switch (this.WinterFlowRouterRouter) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowLoaderQueue) this.WinterFlowSyntax).getColumnName(i);
            case 1:
                WinterFlowHookDataSource();
                WinterFlowConfigurationException.WinterFlowSyntax("no row", 21);
                throw null;
            default:
                WinterFlowHookDataSource();
                WinterFlowConfigurationException.WinterFlowSyntax("no row", 21);
                throw null;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final long getLong(int i) {
        switch (this.WinterFlowRouterRouter) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowLoaderQueue) this.WinterFlowSyntax).getLong(i);
            case 1:
                WinterFlowHookDataSource();
                WinterFlowConfigurationException.WinterFlowSyntax("no row", 21);
                throw null;
            default:
                WinterFlowHookDataSource();
                WinterFlowConfigurationException.WinterFlowSyntax("no row", 21);
                throw null;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyLayer
    public final boolean isNull(int i) {
        switch (this.WinterFlowRouterRouter) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((WinterFlowLoaderQueue) this.WinterFlowSyntax).isNull(i);
            case 1:
                WinterFlowHookDataSource();
                WinterFlowConfigurationException.WinterFlowSyntax("no row", 21);
                throw null;
            default:
                WinterFlowHookDataSource();
                WinterFlowConfigurationException.WinterFlowSyntax("no row", 21);
                throw null;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowAlgorithmService, com.google.android.datatransport.WinterFlowConcurrencyLayer
    public void reset() {
        switch (this.WinterFlowRouterRouter) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((WinterFlowLoaderQueue) this.WinterFlowSyntax).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowQueue(WinterFlowSchedulerSyntax winterFlowSchedulerSyntax, String str, WinterFlowDebugException winterFlowDebugException) {
        super(winterFlowSchedulerSyntax, str);
        winterFlowSchedulerSyntax.getClass();
        str.getClass();
        this.WinterFlowSyntax = winterFlowDebugException;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowQueue(WinterFlowSchedulerSyntax winterFlowSchedulerSyntax, String str, WinterFlowLoaderQueue winterFlowLoaderQueue) {
        super(winterFlowSchedulerSyntax, str);
        winterFlowSchedulerSyntax.getClass();
        str.getClass();
        this.WinterFlowSyntax = winterFlowLoaderQueue;
    }
}
