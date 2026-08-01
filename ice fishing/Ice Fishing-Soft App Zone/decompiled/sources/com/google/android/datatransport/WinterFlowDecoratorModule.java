package com.google.android.datatransport;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowDecoratorModule implements WinterFlowDeserializationRenderer, WinterFlowUserManagerSubsystem {
    public final /* synthetic */ Object WinterFlowRouterRouter;
    public final /* synthetic */ Object WinterFlowSyntax;
    public final /* synthetic */ Object WinterFlowTransactionManagerStrategy;
    public final /* synthetic */ long WinterFlowUnitTestResponse;
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowDecoratorModule(WinterFlowJSONProxy winterFlowJSONProxy, Iterable iterable, WinterFlowViewNode winterFlowViewNode, long j) {
        this.WinterFlowVariableVersionControl = 2;
        this.WinterFlowTransactionManagerStrategy = winterFlowJSONProxy;
        this.WinterFlowSyntax = iterable;
        this.WinterFlowRouterRouter = winterFlowViewNode;
        this.WinterFlowUnitTestResponse = j;
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerSubsystem
    public Object WinterFlowHookDataSource() {
        WinterFlowJSONProxy winterFlowJSONProxy = (WinterFlowJSONProxy) this.WinterFlowTransactionManagerStrategy;
        Iterable iterable = (Iterable) this.WinterFlowSyntax;
        WinterFlowViewNode winterFlowViewNode = (WinterFlowViewNode) this.WinterFlowRouterRouter;
        WinterFlowFrameworkManager winterFlowFrameworkManager = (WinterFlowFrameworkManager) winterFlowJSONProxy.WinterFlowCacheManagerAgent;
        winterFlowFrameworkManager.getClass();
        if (iterable.iterator().hasNext()) {
            String concat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(WinterFlowFrameworkManager.WinterFlowServiceUtility(iterable));
            SQLiteDatabase WinterFlowHookDataSource = winterFlowFrameworkManager.WinterFlowHookDataSource();
            WinterFlowHookDataSource.beginTransaction();
            try {
                WinterFlowHookDataSource.compileStatement(concat).execute();
                Cursor rawQuery = WinterFlowHookDataSource.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        winterFlowFrameworkManager.WinterFlowTransactionAgent(rawQuery.getInt(0), WinterFlowProtocol.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                WinterFlowHookDataSource.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                WinterFlowHookDataSource.setTransactionSuccessful();
            } finally {
                WinterFlowHookDataSource.endTransaction();
            }
        }
        winterFlowFrameworkManager.WinterFlowTransactionManagerStrategy(new WinterFlowWorkerSubsystem(((WinterFlowFunctionProcessor) winterFlowJSONProxy.WinterFlowUnitTestResponse).WinterFlowTransactionManagerStrategy() + this.WinterFlowUnitTestResponse, winterFlowViewNode));
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationRenderer
    public ScheduledFuture WinterFlowRouterStructure(final WinterFlowJSONDecorator winterFlowJSONDecorator) {
        int i = this.WinterFlowVariableVersionControl;
        Object obj = this.WinterFlowRouterRouter;
        long j = this.WinterFlowUnitTestResponse;
        Object obj2 = this.WinterFlowSyntax;
        final WinterFlowProxyThreadPool winterFlowProxyThreadPool = (WinterFlowProxyThreadPool) this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return winterFlowProxyThreadPool.WinterFlowTransactionManagerStrategy.schedule(new WinterFlowMapperDecorator(winterFlowProxyThreadPool, (Runnable) obj2, winterFlowJSONDecorator, 1), j, (TimeUnit) obj);
            default:
                final Callable callable = (Callable) obj2;
                return winterFlowProxyThreadPool.WinterFlowTransactionManagerStrategy.schedule(new Callable() { // from class: com.google.android.datatransport.WinterFlowJSONSessionManager
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return WinterFlowProxyThreadPool.this.WinterFlowVariableVersionControl.submit(new WinterFlowControllerManager(7, callable, winterFlowJSONDecorator));
                    }
                }, j, (TimeUnit) obj);
        }
    }

    public /* synthetic */ WinterFlowDecoratorModule(WinterFlowProxyThreadPool winterFlowProxyThreadPool, Object obj, long j, TimeUnit timeUnit, int i) {
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = winterFlowProxyThreadPool;
        this.WinterFlowSyntax = obj;
        this.WinterFlowUnitTestResponse = j;
        this.WinterFlowRouterRouter = timeUnit;
    }
}
