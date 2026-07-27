package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class B7 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: F, reason: collision with root package name */
    public static final Handler f23984F = new Handler(Looper.getMainLooper());

    /* renamed from: A, reason: collision with root package name */
    public WeakReference f23985A;

    /* renamed from: B, reason: collision with root package name */
    public final C3724p7 f23986B;

    /* renamed from: C, reason: collision with root package name */
    public byte f23987C = -1;

    /* renamed from: D, reason: collision with root package name */
    public int f23988D = -1;

    /* renamed from: E, reason: collision with root package name */
    public long f23989E = -3;

    /* renamed from: n, reason: collision with root package name */
    public final Context f23990n;

    /* renamed from: u, reason: collision with root package name */
    public final Application f23991u;

    /* renamed from: v, reason: collision with root package name */
    public final PowerManager f23992v;

    /* renamed from: w, reason: collision with root package name */
    public final KeyguardManager f23993w;

    /* renamed from: x, reason: collision with root package name */
    public Q0.d f23994x;

    /* renamed from: y, reason: collision with root package name */
    public final C3831r7 f23995y;

    /* renamed from: z, reason: collision with root package name */
    public WeakReference f23996z;

    public B7(Context context, C3831r7 c3831r7) {
        Context applicationContext = context.getApplicationContext();
        this.f23990n = applicationContext;
        this.f23995y = c3831r7;
        this.f23992v = (PowerManager) applicationContext.getSystemService("power");
        this.f23993w = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f23991u = application;
            this.f23986B = new C3724p7(application, this);
        }
        a(null);
    }

    public final void a(View view) {
        long j9;
        WeakReference weakReference = this.f23985A;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            e(view2);
        }
        this.f23985A = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                d(view);
            }
            view.addOnAttachStateChangeListener(this);
            j9 = -2;
        } else {
            j9 = -3;
        }
        this.f23989E = j9;
    }

    public final void b(Activity activity, int i) {
        Window window;
        if (this.f23985A == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        WeakReference weakReference = this.f23985A;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.f23988D = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0084, code lost:
    
        if ((r2.flags & 524288) != 0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        Activity activity;
        WeakReference weakReference = this.f23985A;
        if (weakReference == null) {
            return;
        }
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            this.f23989E = -3L;
            this.f23987C = (byte) -1;
            return;
        }
        int i = view.getVisibility() != 0 ? 1 : 0;
        if (!view.isShown()) {
            i |= 2;
        }
        PowerManager powerManager = this.f23992v;
        if (powerManager != null && !powerManager.isScreenOn()) {
            i |= 4;
        }
        if (!this.f23995y.f33968a) {
            KeyguardManager keyguardManager = this.f23993w;
            if (keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode()) {
                char[] cArr = AbstractC4263z7.f35480a;
                View rootView = view.getRootView();
                if (rootView == null) {
                    rootView = view;
                }
                Context context = rootView.getContext();
                for (int i4 = 0; (context instanceof ContextWrapper) && i4 < 10; i4++) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
                activity = null;
                if (activity != null) {
                    Window window = activity.getWindow();
                    WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes != null) {
                    }
                }
            }
            i |= 8;
        }
        if (!view.getGlobalVisibleRect(new Rect())) {
            i |= 16;
        }
        if (!view.getLocalVisibleRect(new Rect())) {
            i |= 32;
        }
        int windowVisibility = view.getWindowVisibility();
        int i9 = this.f23988D;
        if (i9 != -1) {
            windowVisibility = i9;
        }
        if (windowVisibility != 0) {
            i |= 64;
        }
        if (this.f23987C != i) {
            this.f23987C = (byte) i;
            this.f23989E = i == 0 ? SystemClock.elapsedRealtime() : (-3) - i;
        }
    }

    public final void d(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f23996z = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f23994x == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            Q0.d dVar = new Q0.d(this);
            this.f23994x = dVar;
            this.f23990n.registerReceiver(dVar, intentFilter);
        }
        Application application = this.f23991u;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f23986B);
            } catch (Exception unused) {
            }
        }
    }

    public final void e(View view) {
        try {
            WeakReference weakReference = this.f23996z;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f23996z = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        Q0.d dVar = this.f23994x;
        if (dVar != null) {
            try {
                this.f23990n.unregisterReceiver(dVar);
            } catch (Exception unused3) {
            }
            this.f23994x = null;
        }
        Application application = this.f23991u;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f23986B);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b(activity, 0);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        b(activity, 4);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(activity, 0);
        c();
        f23984F.post(new RunnableC3068d(this));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity, 0);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f23988D = -1;
        d(view);
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f23988D = -1;
        c();
        f23984F.post(new RunnableC3068d(this));
        e(view);
    }
}
