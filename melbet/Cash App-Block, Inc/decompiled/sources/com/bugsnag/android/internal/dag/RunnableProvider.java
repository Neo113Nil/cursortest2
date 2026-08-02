package com.bugsnag.android.internal.dag;

import android.os.Looper;
import androidx.room.RoomDatabase;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class RunnableProvider implements Provider, Runnable {
    public static Thread _mainThread;
    public final AtomicInteger state = new AtomicInteger(0);
    public volatile Object value;

    public final void awaitResult() {
        synchronized (this) {
            while (!isComplete()) {
                wait();
            }
        }
    }

    @Override // com.bugsnag.android.internal.dag.Provider
    public final Object get() {
        while (true) {
            int i = this.state.get();
            if (i == 0) {
                Thread currentThread = Thread.currentThread();
                if (_mainThread == null) {
                    _mainThread = Looper.getMainLooper().getThread();
                }
                Thread thread = _mainThread;
                thread.getClass();
                if (currentThread == thread) {
                    awaitResult();
                } else {
                    run();
                }
            } else if (i == 1) {
                awaitResult();
            } else {
                if (i == 2) {
                    return this.value;
                }
                if (i == 999) {
                    Object obj = this.value;
                    obj.getClass();
                    throw ((Throwable) obj);
                }
            }
        }
    }

    @Override // com.bugsnag.android.internal.dag.Provider
    public final Object getOrNull() {
        while (true) {
            int i = this.state.get();
            if (i == 0) {
                Thread currentThread = Thread.currentThread();
                if (_mainThread == null) {
                    _mainThread = Looper.getMainLooper().getThread();
                }
                Thread thread = _mainThread;
                thread.getClass();
                if (currentThread == thread) {
                    awaitResult();
                } else {
                    run();
                }
            } else if (i == 1) {
                awaitResult();
            } else {
                if (i == 2) {
                    return this.value;
                }
                if (i == 999) {
                    return null;
                }
            }
        }
    }

    public abstract Object invoke();

    @Override // com.bugsnag.android.internal.dag.Provider
    public final boolean isComplete() {
        int i = this.state.get();
        return (i == 0 || i == 1) ? false : true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.state.compareAndSet(0, 1)) {
            try {
                this.value = invoke();
                this.state.set(2);
                synchronized (this) {
                    notifyAll();
                }
            } catch (Throwable th) {
                try {
                    this.value = th;
                    this.state.set(RoomDatabase.MAX_BIND_PARAMETER_CNT);
                    synchronized (this) {
                        notifyAll();
                    }
                } catch (Throwable th2) {
                    synchronized (this) {
                        notifyAll();
                        throw th2;
                    }
                }
            }
        }
    }
}
