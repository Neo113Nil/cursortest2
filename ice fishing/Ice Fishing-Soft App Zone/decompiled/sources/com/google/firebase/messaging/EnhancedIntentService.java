package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.datatransport.WinterFlowArrayEngine;
import com.google.android.datatransport.WinterFlowCacheRuntime;
import com.google.android.datatransport.WinterFlowCompilerScheduler;
import com.google.android.datatransport.WinterFlowExceptionParser;
import com.google.android.datatransport.WinterFlowJSONDecorator;
import com.google.android.datatransport.WinterFlowOrchestrationSession;
import com.google.android.datatransport.WinterFlowStackInterface;
import com.google.android.datatransport.WinterFlowUserManagerOrchestration;
import com.google.android.datatransport.WinterFlowVariableVersionControl;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class EnhancedIntentService extends Service {
    public static final /* synthetic */ int WinterFlowResponseEngine = 0;
    public int WinterFlowRouterRouter;
    public int WinterFlowSyntax;
    public WinterFlowUserManagerOrchestration WinterFlowTransactionManagerStrategy;
    public final Object WinterFlowUnitTestResponse;
    public final ExecutorService WinterFlowVariableVersionControl;

    public EnhancedIntentService() {
        WinterFlowCompilerScheduler winterFlowCompilerScheduler = new WinterFlowCompilerScheduler("Firebase-Messaging-Intent-Handle");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), winterFlowCompilerScheduler);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.WinterFlowVariableVersionControl = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.WinterFlowUnitTestResponse = new Object();
        this.WinterFlowSyntax = 0;
    }

    public abstract void WinterFlowCacheManagerAgent(Intent intent);

    public final void WinterFlowRouterStructure(Intent intent) {
        if (intent != null) {
            WinterFlowCacheRuntime.WinterFlowServiceUtility(intent);
        }
        synchronized (this.WinterFlowUnitTestResponse) {
            try {
                int i = this.WinterFlowSyntax - 1;
                this.WinterFlowSyntax = i;
                if (i == 0) {
                    stopSelfResult(this.WinterFlowRouterRouter);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        WinterFlowUserManagerOrchestration winterFlowUserManagerOrchestration;
        winterFlowUserManagerOrchestration = this.WinterFlowTransactionManagerStrategy;
        if (winterFlowUserManagerOrchestration == null) {
            winterFlowUserManagerOrchestration = new WinterFlowUserManagerOrchestration(new WinterFlowJSONDecorator(12, this));
            this.WinterFlowTransactionManagerStrategy = winterFlowUserManagerOrchestration;
        }
        return winterFlowUserManagerOrchestration;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.WinterFlowVariableVersionControl.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        synchronized (this.WinterFlowUnitTestResponse) {
            this.WinterFlowRouterRouter = i2;
            i3 = 1;
            this.WinterFlowSyntax++;
        }
        Intent WinterFlowHookDataSource = WinterFlowHookDataSource(intent);
        int i4 = 2;
        if (WinterFlowHookDataSource == null) {
            WinterFlowRouterStructure(intent);
            return 2;
        }
        WinterFlowArrayEngine winterFlowArrayEngine = new WinterFlowArrayEngine();
        this.WinterFlowVariableVersionControl.execute(new WinterFlowVariableVersionControl(this, WinterFlowHookDataSource, winterFlowArrayEngine, i4));
        WinterFlowExceptionParser winterFlowExceptionParser = winterFlowArrayEngine.WinterFlowRouterStructure;
        if (winterFlowExceptionParser.WinterFlowUnitTestResponse()) {
            WinterFlowRouterStructure(intent);
            return 2;
        }
        winterFlowExceptionParser.WinterFlowRouterStructure(new WinterFlowOrchestrationSession(1), new WinterFlowStackInterface(i3, this, intent));
        return 3;
    }

    public Intent WinterFlowHookDataSource(Intent intent) {
        return intent;
    }
}
