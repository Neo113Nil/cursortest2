package com.anythink.core.mg.api;

import com.anythink.core.common.t.b;
import com.anythink.core.common.t.d;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class MgPreLoadCallbackRegister {
    private static final String TAG = "MgPreLoadCallbackRegister";
    private volatile b timeoutRunnable;
    private final Object timeoutLock = new Object();
    private final Object callbackLock = new Object();
    private final List<MgPreLoadCallback> preLoadCallbackList = new CopyOnWriteArrayList();
    private final AtomicBoolean isCallback = new AtomicBoolean(false);
    private final AtomicReference<MgAdInfo> mgAdInfoRef = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyCallback(boolean z8) {
        notifyCallback(z8, false);
    }

    public MgAdInfo getMgAdInfo() {
        return this.mgAdInfoRef.get();
    }

    public void notifyPreLoadCallback(MgAdInfo mgAdInfo) {
        this.mgAdInfoRef.set(mgAdInfo);
        synchronized (this.timeoutLock) {
            try {
                if (this.timeoutRunnable != null) {
                    d.a().b(this.timeoutRunnable);
                    this.timeoutRunnable = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyCallback(false, true);
    }

    public void registerPreLoadCallback(MgPreLoadCallback mgPreLoadCallback) {
        this.mgAdInfoRef.get();
        if (mgPreLoadCallback == null) {
            return;
        }
        synchronized (this.callbackLock) {
            this.isCallback.set(false);
            this.preLoadCallbackList.add(mgPreLoadCallback);
        }
    }

    public void startTimeoutCountDown(long j9) {
        synchronized (this.timeoutLock) {
            try {
                if (this.timeoutRunnable != null) {
                    d.a().b(this.timeoutRunnable);
                }
                if (j9 <= 0) {
                    notifyCallback(false);
                } else if (!this.isCallback.get()) {
                    this.timeoutRunnable = new b() { // from class: com.anythink.core.mg.api.MgPreLoadCallbackRegister.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            MgPreLoadCallbackRegister.this.notifyCallback(true);
                        }
                    };
                    d.a().a(this.timeoutRunnable, j9, false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void notifyCallback(final boolean z8, boolean z9) {
        CopyOnWriteArrayList<MgPreLoadCallback> copyOnWriteArrayList;
        if (this.preLoadCallbackList.isEmpty()) {
            return;
        }
        synchronized (this.callbackLock) {
            try {
                if (this.preLoadCallbackList.isEmpty() || this.isCallback.get()) {
                    copyOnWriteArrayList = null;
                } else {
                    this.isCallback.set(true);
                    copyOnWriteArrayList = new CopyOnWriteArrayList(this.preLoadCallbackList);
                    this.preLoadCallbackList.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        final MgAdInfo mgAdInfo = this.mgAdInfoRef.get();
        try {
            for (final MgPreLoadCallback mgPreLoadCallback : copyOnWriteArrayList) {
                if (mgPreLoadCallback != null) {
                    if (!z8 && !z9) {
                        mgPreLoadCallback.onMgAdInfo(mgAdInfo, false);
                    }
                    com.anythink.core.common.v.b.b.a().a(new Runnable() { // from class: com.anythink.core.mg.api.MgPreLoadCallbackRegister.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            mgPreLoadCallback.onMgAdInfo(mgAdInfo, z8);
                        }
                    });
                }
            }
        } catch (Throwable unused) {
        }
    }
}
