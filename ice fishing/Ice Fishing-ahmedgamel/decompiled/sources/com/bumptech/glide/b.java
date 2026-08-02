package com.bumptech.glide;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24155n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f24156u;

    public b() {
        this.f24155n = 1;
        this.f24156u = Collections.newSetFromMap(new WeakHashMap());
    }

    public static void a(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e9) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e9);
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    if (Q3.g.c().b(R3.a.class) != null) {
                        throw new ClassCastException();
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            f.p("_no", bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f24155n) {
            case 0:
                break;
            default:
                Intent intent = activity.getIntent();
                if (intent != null && ((Set) this.f24156u).add(intent)) {
                    if (Build.VERSION.SDK_INT > 25) {
                        a(intent);
                        break;
                    } else {
                        new Handler(Looper.getMainLooper()).post(new A3.p(this, intent));
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = this.f24155n;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f24155n) {
            case 0:
                break;
            default:
                if (activity.isFinishing()) {
                    ((Set) this.f24156u).remove(activity.getIntent());
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f24155n) {
            case 0:
                ((c) this.f24156u).getClass();
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = this.f24155n;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.f24155n;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.f24155n;
    }

    public b(c cVar) {
        this.f24155n = 0;
        this.f24156u = cVar;
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void j(Activity activity) {
    }

    private final void k(Activity activity) {
    }

    private final void l(Activity activity) {
    }

    private final void b(Activity activity, Bundle bundle) {
    }

    private final void g(Activity activity, Bundle bundle) {
    }

    private final void h(Activity activity, Bundle bundle) {
    }
}
