package com.bugsnag.android.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import com.bugsnag.android.SessionTracker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class ForegroundDetector implements Application.ActivityLifecycleCallbacks, Handler.Callback {
    public static final ForegroundDetector INSTANCE;
    public static int activityInstanceCount;
    public static boolean backgroundSent;
    public static boolean isInForeground;
    public static volatile long lastEnteredForegroundMs;
    public static volatile long lastExitedForegroundMs;
    public static final ArrayList listeners;
    public static final Handler mainThreadHandler;
    public static Application observedApplication;
    public static int startedActivityCount;
    public static final long startupTime;
    public static boolean waitingForActivityRestart;

    static {
        ForegroundDetector foregroundDetector = new ForegroundDetector();
        INSTANCE = foregroundDetector;
        listeners = new ArrayList();
        mainThreadHandler = new Handler(Looper.getMainLooper(), foregroundDetector);
        startupTime = Process.getStartElapsedRealtime();
        backgroundSent = true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        waitingForActivityRestart = false;
        if (!backgroundSent) {
            isInForeground = false;
            backgroundSent = true;
            long j = message.arg2 | (message.arg1 << 32);
            ArrayList arrayList = listeners;
            synchronized (arrayList) {
                try {
                    if (!arrayList.isEmpty()) {
                        try {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                SessionTracker sessionTracker = (SessionTracker) ((WeakReference) it.next()).get();
                                if (sessionTracker == null) {
                                    it.remove();
                                } else {
                                    sessionTracker.onForegroundStatus(j, false);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            lastExitedForegroundMs = j;
        }
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activityInstanceCount++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activityInstanceCount = Math.max(0, activityInstanceCount - 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        ArrayList arrayList = listeners;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    return;
                }
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        SessionTracker sessionTracker = (SessionTracker) ((WeakReference) it.next()).get();
                        if (sessionTracker == null) {
                            it.remove();
                        } else {
                            sessionTracker.updateContext(activity.getClass().getSimpleName(), true);
                        }
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStopped(Activity activity) {
        ArrayList arrayList = listeners;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    return;
                }
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        SessionTracker sessionTracker = (SessionTracker) ((WeakReference) it.next()).get();
                        if (sessionTracker == null) {
                            it.remove();
                        } else {
                            sessionTracker.updateContext(activity.getClass().getSimpleName(), false);
                        }
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (startedActivityCount == 0 && !waitingForActivityRestart) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ArrayList arrayList = listeners;
            synchronized (arrayList) {
                try {
                    if (!arrayList.isEmpty()) {
                        try {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                SessionTracker sessionTracker = (SessionTracker) ((WeakReference) it.next()).get();
                                if (sessionTracker == null) {
                                    it.remove();
                                } else {
                                    sessionTracker.onForegroundStatus(elapsedRealtime, true);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            lastEnteredForegroundMs = elapsedRealtime;
        }
        startedActivityCount++;
        mainThreadHandler.removeMessages(1);
        isInForeground = true;
        waitingForActivityRestart = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int max = Math.max(0, startedActivityCount - 1);
        startedActivityCount = max;
        if (max == 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (activity.isChangingConfigurations()) {
                waitingForActivityRestart = true;
                Handler handler = mainThreadHandler;
                Message obtainMessage = handler.obtainMessage(1);
                obtainMessage.arg1 = (int) ((elapsedRealtime >>> 32) & BodyPartID.bodyIdMax);
                obtainMessage.arg2 = (int) (elapsedRealtime & BodyPartID.bodyIdMax);
                handler.sendMessageDelayed(obtainMessage, 700L);
                return;
            }
            ArrayList arrayList = listeners;
            synchronized (arrayList) {
                try {
                    if (!arrayList.isEmpty()) {
                        try {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                SessionTracker sessionTracker = (SessionTracker) ((WeakReference) it.next()).get();
                                if (sessionTracker == null) {
                                    it.remove();
                                } else {
                                    sessionTracker.onForegroundStatus(elapsedRealtime, false);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            isInForeground = false;
            lastExitedForegroundMs = elapsedRealtime;
        }
    }
}
