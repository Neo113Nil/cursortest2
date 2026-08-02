package ru.yandex.video.m3.player.impl.tracking.pip;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import defpackage.h5z0;
import defpackage.zy11;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.api.tracking.pip.PictureInPictureStateListener;
import ru.yandex.video.m3.player.api.tracking.pip.PictureInPictureStateObserver;
import ru.yandex.video.m3.player.impl.utils.WeakObserverDispatcher;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u00060\u001cR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/pip/PictureInPictureStateObserverImpl;", "Lru/yandex/video/m3/player/api/tracking/pip/PictureInPictureStateObserver;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "checkIsNeedRegisterActivityLifecycleCallbacks", "()V", "", "checkIsNeedUnregisterActivityLifecycleCallbacks", "()Z", "registerActivityLifecycleCallbacks", "unregisterActivityLifecycleCallbacks", "checkIsNeedNotifyObservers", "checkIsInPictureInPictureMode", "Lru/yandex/video/m3/player/api/tracking/pip/PictureInPictureStateListener;", "listener", "addListener", "(Lru/yandex/video/m3/player/api/tracking/pip/PictureInPictureStateListener;)V", "removeListener", "Landroid/app/Application;", ClidProvider.APPLICATION, "Landroid/app/Application;", "", "Landroid/app/Activity;", "activities", "Ljava/util/Set;", "Lru/yandex/video/m3/player/impl/tracking/pip/PictureInPictureStateObserverImpl$ActivityLifecycleObserver;", "activityLifecycleObserver", "Lru/yandex/video/m3/player/impl/tracking/pip/PictureInPictureStateObserverImpl$ActivityLifecycleObserver;", "Lru/yandex/video/m3/player/impl/utils/WeakObserverDispatcher;", "observerDispatcher", "Lru/yandex/video/m3/player/impl/utils/WeakObserverDispatcher;", "isActivityLifecycleCallbacksRegistered", "Z", "isInPictureInPictureMode", "", "lock", "Ljava/lang/Object;", "ActivityLifecycleObserver", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PictureInPictureStateObserverImpl implements PictureInPictureStateObserver {
    public static final int $stable = 8;
    private Set<Activity> activities;
    private final ActivityLifecycleObserver activityLifecycleObserver;
    private final Application application;
    private boolean isActivityLifecycleCallbacksRegistered;
    private boolean isInPictureInPictureMode;
    private final Object lock;
    private final WeakObserverDispatcher<PictureInPictureStateListener> observerDispatcher;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000f\u0010\fJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/pip/PictureInPictureStateObserverImpl$ActivityLifecycleObserver;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "(Lru/yandex/video/m3/player/impl/tracking/pip/PictureInPictureStateObserverImpl;)V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ActivityLifecycleObserver implements Application.ActivityLifecycleCallbacks {
        public ActivityLifecycleObserver() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Object obj = PictureInPictureStateObserverImpl.this.lock;
            PictureInPictureStateObserverImpl pictureInPictureStateObserverImpl = PictureInPictureStateObserverImpl.this;
            synchronized (obj) {
                pictureInPictureStateObserverImpl.activities.remove(activity);
                pictureInPictureStateObserverImpl.checkIsNeedNotifyObservers();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Object obj = PictureInPictureStateObserverImpl.this.lock;
            PictureInPictureStateObserverImpl pictureInPictureStateObserverImpl = PictureInPictureStateObserverImpl.this;
            synchronized (obj) {
                pictureInPictureStateObserverImpl.activities.add(activity);
                pictureInPictureStateObserverImpl.checkIsNeedNotifyObservers();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Object obj = PictureInPictureStateObserverImpl.this.lock;
            PictureInPictureStateObserverImpl pictureInPictureStateObserverImpl = PictureInPictureStateObserverImpl.this;
            synchronized (obj) {
                pictureInPictureStateObserverImpl.activities.add(activity);
                pictureInPictureStateObserverImpl.checkIsNeedNotifyObservers();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Object obj = PictureInPictureStateObserverImpl.this.lock;
            PictureInPictureStateObserverImpl pictureInPictureStateObserverImpl = PictureInPictureStateObserverImpl.this;
            synchronized (obj) {
                pictureInPictureStateObserverImpl.activities.add(activity);
                pictureInPictureStateObserverImpl.checkIsNeedNotifyObservers();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Object obj = PictureInPictureStateObserverImpl.this.lock;
            PictureInPictureStateObserverImpl pictureInPictureStateObserverImpl = PictureInPictureStateObserverImpl.this;
            synchronized (obj) {
                pictureInPictureStateObserverImpl.activities.remove(activity);
                pictureInPictureStateObserverImpl.checkIsNeedNotifyObservers();
            }
        }
    }

    public PictureInPictureStateObserverImpl(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.application = applicationContext instanceof Application ? (Application) applicationContext : null;
        this.activities = Collections.newSetFromMap(new WeakHashMap());
        this.activityLifecycleObserver = new ActivityLifecycleObserver();
        this.observerDispatcher = new WeakObserverDispatcher<>();
        this.lock = new Object();
    }

    private final boolean checkIsInPictureInPictureMode() {
        Object obj;
        Iterator<T> it = this.activities.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Activity) obj).isInPictureInPictureMode()) {
                break;
            }
        }
        Activity activity = (Activity) obj;
        if (activity == null) {
            return false;
        }
        return activity.isInPictureInPictureMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkIsNeedNotifyObservers() {
        boolean checkIsInPictureInPictureMode;
        HashSet H0;
        Object failure;
        if (checkIsNeedUnregisterActivityLifecycleCallbacks() || this.isInPictureInPictureMode == (checkIsInPictureInPictureMode = checkIsInPictureInPictureMode())) {
            return;
        }
        this.isInPictureInPictureMode = checkIsInPictureInPictureMode;
        WeakObserverDispatcher<PictureInPictureStateListener> weakObserverDispatcher = this.observerDispatcher;
        synchronized (weakObserverDispatcher.getObservers()) {
            H0 = a.H0(weakObserverDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PictureInPictureStateListener) it.next()).onPictureInPictureStateChanged(this.isInPictureInPictureMode);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
    }

    private final void checkIsNeedRegisterActivityLifecycleCallbacks() {
        if (this.isActivityLifecycleCallbacksRegistered) {
            return;
        }
        registerActivityLifecycleCallbacks();
        this.isActivityLifecycleCallbacksRegistered = true;
    }

    private final boolean checkIsNeedUnregisterActivityLifecycleCallbacks() {
        if (!this.observerDispatcher.getObservers().isEmpty() || !this.isActivityLifecycleCallbacksRegistered) {
            return false;
        }
        unregisterActivityLifecycleCallbacks();
        this.isActivityLifecycleCallbacksRegistered = false;
        return true;
    }

    private final void registerActivityLifecycleCallbacks() {
        Application application = this.application;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this.activityLifecycleObserver);
        }
    }

    private final void unregisterActivityLifecycleCallbacks() {
        Application application = this.application;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.activityLifecycleObserver);
        }
    }

    @Override // ru.yandex.video.m3.player.api.tracking.pip.PictureInPictureStateObserver
    public void addListener(PictureInPictureStateListener listener) {
        synchronized (this.lock) {
            WeakObserverDispatcher.add$default(this.observerDispatcher, listener, null, 2, null);
            checkIsNeedRegisterActivityLifecycleCallbacks();
        }
    }

    @Override // ru.yandex.video.m3.player.api.tracking.pip.PictureInPictureStateObserver
    public void removeListener(PictureInPictureStateListener listener) {
        synchronized (this.lock) {
            WeakObserverDispatcher.remove$default(this.observerDispatcher, listener, null, 2, null);
            checkIsNeedUnregisterActivityLifecycleCallbacks();
        }
    }
}
