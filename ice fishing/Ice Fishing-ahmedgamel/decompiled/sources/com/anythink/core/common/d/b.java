package com.anythink.core.common.d;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13086a = "AdLifecycleManager";

    /* renamed from: c, reason: collision with root package name */
    private static volatile b f13087c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f13089d;

    /* renamed from: e, reason: collision with root package name */
    private String f13090e;

    /* renamed from: f, reason: collision with root package name */
    private final List<Application.ActivityLifecycleCallbacks> f13091f = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Set<WeakReference<a>> f13088b = new HashSet();

    /* renamed from: com.anythink.core.common.d.b$1, reason: invalid class name */
    public class AnonymousClass1 implements Application.ActivityLifecycleCallbacks {
        public AnonymousClass1() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Log.e(b.f13086a, "onActivityCreated() called with: activity = [" + activity + "], savedInstanceState = [" + bundle + "]");
            b.this.f13090e = activity.getClass().getName();
            b.a(b.this, activity, bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            Log.e(b.f13086a, "onActivityDestroyed() called with: activity = [" + activity + "]");
            b.e(b.this, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            Log.e(b.f13086a, "onActivityPaused() called with: activity = [" + activity + "]");
            b.c(b.this, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Log.e(b.f13086a, "onActivityResumed() called with: activity = [" + activity + "]");
            b.this.f13090e = activity.getClass().getName();
            b.b(b.this, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Log.e(b.f13086a, "onActivitySaveInstanceState() called with: activity = [" + activity + "], outState = [" + bundle + "]");
            b.this.a(activity, bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            Log.e(b.f13086a, "onActivityStarted() called with: activity = [" + activity + "]");
            t.b().a(activity);
            b.a(b.this, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            Log.e(b.f13086a, "onActivityStopped() called with: activity = [" + activity + "]");
            b.d(b.this, activity);
        }
    }

    public interface a {
        void onCreate(Activity activity);

        void onDestroy(Activity activity);

        void onPause(Activity activity);

        void onResume(Activity activity);

        void onStart(Activity activity);

        void onStop(Activity activity);
    }

    public static b b() {
        if (f13087c == null) {
            synchronized (b.class) {
                try {
                    if (f13087c == null) {
                        f13087c = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13087c;
    }

    private boolean c(a aVar) {
        try {
            Iterator it = new CopyOnWriteArraySet(this.f13088b).iterator();
            while (it.hasNext()) {
                if (((WeakReference) it.next()).get() == aVar) {
                    return true;
                }
            }
            return false;
        } catch (Exception e9) {
            e9.printStackTrace();
            return false;
        }
    }

    private WeakReference<a> d(a aVar) {
        Iterator it = new CopyOnWriteArraySet(this.f13088b).iterator();
        while (it.hasNext()) {
            WeakReference<a> weakReference = (WeakReference) it.next();
            if (weakReference.get() == aVar) {
                return weakReference;
            }
        }
        return null;
    }

    private void e(Activity activity) {
        try {
            synchronized (this.f13091f) {
                try {
                    if (!this.f13091f.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.f13091f) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityDestroyed(activity);
                            }
                        }
                    }
                } finally {
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.f13088b).iterator();
            while (it.hasNext()) {
                a aVar = (a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onDestroy(activity);
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final String a() {
        return this.f13090e;
    }

    public final void a(Application application) {
        try {
            if (this.f13089d) {
                return;
            }
            if (application == null) {
                Log.e(f13086a, "activityCallBack error, application is null");
            } else {
                application.registerActivityLifecycleCallbacks(new AnonymousClass1());
            }
            this.f13089d = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void d(Activity activity) {
        try {
            synchronized (this.f13091f) {
                try {
                    if (!this.f13091f.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.f13091f) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityStopped(activity);
                            }
                        }
                    }
                } finally {
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.f13088b).iterator();
            while (it.hasNext()) {
                a aVar = (a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onStop(activity);
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private void c(Activity activity) {
        try {
            synchronized (this.f13091f) {
                try {
                    if (!this.f13091f.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.f13091f) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityResumed(activity);
                            }
                        }
                    }
                } finally {
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.f13088b).iterator();
            while (it.hasNext()) {
                a aVar = (a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onResume(activity);
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private void b(Application application) {
        if (application == null) {
            Log.e(f13086a, "activityCallBack error, application is null");
        } else {
            application.registerActivityLifecycleCallbacks(new AnonymousClass1());
        }
    }

    public final void a(a aVar) {
        try {
            synchronized (this.f13088b) {
                try {
                    if (!c(aVar)) {
                        this.f13088b.add(new WeakReference<>(aVar));
                    }
                } finally {
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void b(a aVar) {
        try {
            synchronized (this.f13088b) {
                try {
                    Iterator<WeakReference<a>> it = this.f13088b.iterator();
                    while (it.hasNext()) {
                        if (it.next().get() == aVar) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static /* synthetic */ void e(b bVar, Activity activity) {
        try {
            synchronized (bVar.f13091f) {
                try {
                    if (!bVar.f13091f.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : bVar.f13091f) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityDestroyed(activity);
                            }
                        }
                    }
                } finally {
                }
            }
            Iterator it = new CopyOnWriteArraySet(bVar.f13088b).iterator();
            while (it.hasNext()) {
                a aVar = (a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onDestroy(activity);
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private void a(Activity activity) {
        try {
            synchronized (this.f13091f) {
                try {
                    if (!this.f13091f.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.f13091f) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityStarted(activity);
                            }
                        }
                    }
                } finally {
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.f13088b).iterator();
            while (it.hasNext()) {
                a aVar = (a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onStart(activity);
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static /* synthetic */ void d(b bVar, Activity activity) {
        try {
            synchronized (bVar.f13091f) {
                try {
                    if (!bVar.f13091f.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : bVar.f13091f) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityStopped(activity);
                            }
                        }
                    }
                } finally {
                }
            }
            Iterator it = new CopyOnWriteArraySet(bVar.f13088b).iterator();
            while (it.hasNext()) {
                a aVar = (a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onStop(activity);
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static /* synthetic */ void c(b bVar, Activity activity) {
        try {
            synchronized (bVar.f13091f) {
                try {
                    if (!bVar.f13091f.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : bVar.f13091f) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityPaused(activity);
                            }
                        }
                    }
                } finally {
                }
            }
            Iterator it = new CopyOnWriteArraySet(bVar.f13088b).iterator();
            while (it.hasNext()) {
                a aVar = (a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onPause(activity);
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private void b(Activity activity, Bundle bundle) {
        try {
            synchronized (this.f13091f) {
                try {
                    if (!this.f13091f.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.f13091f) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                            }
                        }
                    }
                } finally {
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.f13088b).iterator();
            while (it.hasNext()) {
                a aVar = (a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onCreate(activity);
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void a(Activity activity, Bundle bundle) {
        try {
            synchronized (this.f13091f) {
                try {
                    if (!this.f13091f.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.f13091f) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
                            }
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private void b(Activity activity) {
        try {
            synchronized (this.f13091f) {
                try {
                    if (!this.f13091f.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.f13091f) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityPaused(activity);
                            }
                        }
                    }
                } finally {
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.f13088b).iterator();
            while (it.hasNext()) {
                a aVar = (a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onPause(activity);
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        try {
            synchronized (this.f13091f) {
                try {
                    if (!this.f13091f.contains(activityLifecycleCallbacks)) {
                        this.f13091f.add(activityLifecycleCallbacks);
                    }
                } finally {
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static /* synthetic */ void a(b bVar, Activity activity) {
        try {
            synchronized (bVar.f13091f) {
                try {
                    if (!bVar.f13091f.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : bVar.f13091f) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityStarted(activity);
                            }
                        }
                    }
                } finally {
                }
            }
            Iterator it = new CopyOnWriteArraySet(bVar.f13088b).iterator();
            while (it.hasNext()) {
                a aVar = (a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onStart(activity);
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static /* synthetic */ void b(b bVar, Activity activity) {
        try {
            synchronized (bVar.f13091f) {
                try {
                    if (!bVar.f13091f.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : bVar.f13091f) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityResumed(activity);
                            }
                        }
                    }
                } finally {
                }
            }
            Iterator it = new CopyOnWriteArraySet(bVar.f13088b).iterator();
            while (it.hasNext()) {
                a aVar = (a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onResume(activity);
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static /* synthetic */ void a(b bVar, Activity activity, Bundle bundle) {
        try {
            synchronized (bVar.f13091f) {
                try {
                    if (!bVar.f13091f.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : bVar.f13091f) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                            }
                        }
                    }
                } finally {
                }
            }
            Iterator it = new CopyOnWriteArraySet(bVar.f13088b).iterator();
            while (it.hasNext()) {
                a aVar = (a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.onCreate(activity);
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }
}
