package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import ru.yandex.music.utils.Assertions;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class qrc implements Application.ActivityLifecycleCallbacks, Runnable {
    public boolean a;
    public final long b;
    public volatile long c;
    public volatile long d;
    public boolean e;
    public boolean f;
    public final ScheduledExecutorService g = Executors.newSingleThreadScheduledExecutor();
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public ScheduledFuture i;

    public qrc() {
        Assertions.assertTrue(true, "Period must be greater than 0");
        this.b = 300000L;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.a = false;
        n7w.O().removeCallbacks(this);
        n7w.O().postDelayed(this, 100L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.a = true;
        n7w.O().removeCallbacks(this);
        n7w.O().postDelayed(this, 100L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            this.e = false;
            Timber.d("suspending tasks", new Object[0]);
            ScheduledFuture scheduledFuture = this.i;
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay < 0) {
                    delay = 0;
                }
                this.c = delay;
                this.d = SystemClock.elapsedRealtime();
                this.i.cancel(false);
                return;
            }
            return;
        }
        eyq eyqVar = new eyq(10, new sr7(16, this));
        if (lbr.a.get() == gcr.c) {
            eyqVar.invoke();
            return;
        }
        ReentrantLock reentrantLock = lbr.e;
        reentrantLock.lock();
        try {
            lbr.f.add(eyqVar);
            reentrantLock.unlock();
            lbr.b();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
