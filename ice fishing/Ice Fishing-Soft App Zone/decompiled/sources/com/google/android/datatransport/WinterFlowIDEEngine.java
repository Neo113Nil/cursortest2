package com.google.android.datatransport;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowIDEEngine {
    public static final Object WinterFlowResponseEngine = new Object();
    public static volatile WinterFlowIDEEngine WinterFlowTransactionAgent;
    public final Handler WinterFlowArrayNetwork;
    public volatile int WinterFlowCacheManagerAgent;
    public final WinterFlowRepositoryDatabase WinterFlowHookDataSource;
    public final int WinterFlowRouterRouter;
    public final ReentrantReadWriteLock WinterFlowRouterStructure;
    public final WinterFlowFunctionClass WinterFlowSyntax;
    public final WinterFlowObjectServiceProvider WinterFlowTransactionManagerStrategy;
    public final WinterFlowThreadPoolProcess WinterFlowUnitTestResponse;
    public final WinterFlowSingletonScheduler WinterFlowVariableVersionControl;

    public WinterFlowIDEEngine(WinterFlowMiddlewareSystem winterFlowMiddlewareSystem) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.WinterFlowRouterStructure = reentrantReadWriteLock;
        this.WinterFlowCacheManagerAgent = 3;
        WinterFlowObjectServiceProvider winterFlowObjectServiceProvider = (WinterFlowObjectServiceProvider) winterFlowMiddlewareSystem.WinterFlowHookDataSource;
        this.WinterFlowTransactionManagerStrategy = winterFlowObjectServiceProvider;
        int i = winterFlowMiddlewareSystem.WinterFlowRouterStructure;
        this.WinterFlowRouterRouter = i;
        this.WinterFlowSyntax = (WinterFlowFunctionClass) winterFlowMiddlewareSystem.WinterFlowCacheManagerAgent;
        this.WinterFlowArrayNetwork = new Handler(Looper.getMainLooper());
        this.WinterFlowHookDataSource = new WinterFlowRepositoryDatabase(0);
        this.WinterFlowUnitTestResponse = new WinterFlowThreadPoolProcess(6);
        WinterFlowSingletonScheduler winterFlowSingletonScheduler = new WinterFlowSingletonScheduler(this);
        this.WinterFlowVariableVersionControl = winterFlowSingletonScheduler;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.WinterFlowCacheManagerAgent = 0;
            } catch (Throwable th) {
                this.WinterFlowRouterStructure.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (WinterFlowHookDataSource() == 0) {
            try {
                winterFlowObjectServiceProvider.WinterFlowRouterStructure(new WinterFlowLoaderArray(winterFlowSingletonScheduler));
            } catch (Throwable th2) {
                WinterFlowArrayNetwork(th2);
            }
        }
    }

    public static WinterFlowIDEEngine WinterFlowRouterStructure() {
        WinterFlowIDEEngine winterFlowIDEEngine;
        synchronized (WinterFlowResponseEngine) {
            try {
                winterFlowIDEEngine = WinterFlowTransactionAgent;
                if (!(winterFlowIDEEngine != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return winterFlowIDEEngine;
    }

    public final void WinterFlowArrayNetwork(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.WinterFlowRouterStructure.writeLock().lock();
        try {
            this.WinterFlowCacheManagerAgent = 2;
            arrayList.addAll(this.WinterFlowHookDataSource);
            this.WinterFlowHookDataSource.clear();
            this.WinterFlowRouterStructure.writeLock().unlock();
            this.WinterFlowArrayNetwork.post(new WinterFlowSessionThreadPool(arrayList, this.WinterFlowCacheManagerAgent, th));
        } catch (Throwable th2) {
            this.WinterFlowRouterStructure.writeLock().unlock();
            throw th2;
        }
    }

    public final void WinterFlowCacheManagerAgent() {
        if (!(this.WinterFlowRouterRouter == 1)) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (WinterFlowHookDataSource() == 1) {
            return;
        }
        this.WinterFlowRouterStructure.writeLock().lock();
        try {
            if (this.WinterFlowCacheManagerAgent == 0) {
                return;
            }
            this.WinterFlowCacheManagerAgent = 0;
            this.WinterFlowRouterStructure.writeLock().unlock();
            WinterFlowSingletonScheduler winterFlowSingletonScheduler = this.WinterFlowVariableVersionControl;
            WinterFlowIDEEngine winterFlowIDEEngine = winterFlowSingletonScheduler.WinterFlowRouterStructure;
            try {
                winterFlowIDEEngine.WinterFlowTransactionManagerStrategy.WinterFlowRouterStructure(new WinterFlowLoaderArray(winterFlowSingletonScheduler));
            } catch (Throwable th) {
                winterFlowIDEEngine.WinterFlowArrayNetwork(th);
            }
        } finally {
            this.WinterFlowRouterStructure.writeLock().unlock();
        }
    }

    public final int WinterFlowHookDataSource() {
        this.WinterFlowRouterStructure.readLock().lock();
        try {
            return this.WinterFlowCacheManagerAgent;
        } finally {
            this.WinterFlowRouterStructure.readLock().unlock();
        }
    }
}
