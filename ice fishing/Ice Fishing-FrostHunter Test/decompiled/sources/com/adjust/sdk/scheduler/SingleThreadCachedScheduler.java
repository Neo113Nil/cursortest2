package com.adjust.sdk.scheduler;

import android.content.Context.FrostHunterActivityRogueFusionRogue5543;
import android.content.Context.FrostHunterBannerAdCelestialCyberVortex5553;
import android.content.Context.FrostHunterMotionEventOlympianHyperionPrime9094;
import com.adjust.sdk.AdjustFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class SingleThreadCachedScheduler implements ThreadScheduler {
    private ThreadPoolExecutor threadPoolExecutor;
    private final List<Runnable> queue = new ArrayList();
    private boolean isThreadProcessing = false;
    private boolean isTeardown = false;

    public SingleThreadCachedScheduler(String str) {
        this.threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactoryWrapper(str), new FrostHunterBannerAdCelestialCyberVortex5553(str, 0));
    }

    private void processQueue(Runnable runnable) {
        this.threadPoolExecutor.submit(new FrostHunterActivityRogueFusionRogue5543(24, this, runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryExecuteRunnable(Runnable runnable) {
        try {
            if (this.isTeardown) {
                return;
            }
            runnable.run();
        } catch (Throwable th) {
            AdjustFactory.getLogger().warn("Execution failed: %s", th.getMessage());
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadScheduler
    public void schedule(Runnable runnable, long j) {
        synchronized (this.queue) {
            try {
                if (this.isTeardown) {
                    return;
                }
                this.threadPoolExecutor.submit(new FrostHunterMotionEventOlympianHyperionPrime9094(this, j, runnable));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadExecutor
    public void submit(Runnable runnable) {
        synchronized (this.queue) {
            try {
                if (this.isTeardown) {
                    return;
                }
                if (this.isThreadProcessing) {
                    this.queue.add(runnable);
                } else {
                    this.isThreadProcessing = true;
                    processQueue(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.adjust.sdk.scheduler.ThreadExecutor
    public void teardown() {
        synchronized (this.queue) {
            this.isTeardown = true;
            this.queue.clear();
            this.threadPoolExecutor.shutdown();
        }
    }
}
