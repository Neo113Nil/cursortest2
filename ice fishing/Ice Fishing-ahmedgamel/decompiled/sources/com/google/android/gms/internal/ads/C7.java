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
public final class C7 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: F, reason: collision with root package name */
    public static final Handler f24042F = new Handler(Looper.getMainLooper());

    /* renamed from: A, reason: collision with root package name */
    public WeakReference f24043A;

    /* renamed from: B, reason: collision with root package name */
    public final C3818r7 f24044B;

    /* renamed from: C, reason: collision with root package name */
    public byte f24045C = -1;

    /* renamed from: D, reason: collision with root package name */
    public int f24046D = -1;

    /* renamed from: E, reason: collision with root package name */
    public long f24047E = -3;

    /* renamed from: n, reason: collision with root package name */
    public final Context f24048n;

    /* renamed from: u, reason: collision with root package name */
    public final Application f24049u;

    /* renamed from: v, reason: collision with root package name */
    public final PowerManager f24050v;

    /* renamed from: w, reason: collision with root package name */
    public final KeyguardManager f24051w;

    /* renamed from: x, reason: collision with root package name */
    public Q0.d f24052x;

    /* renamed from: y, reason: collision with root package name */
    public final C3926t7 f24053y;

    /* renamed from: z, reason: collision with root package name */
    public WeakReference f24054z;

    public C7(Context context, C3926t7 c3926t7) {
        Context applicationContext = context.getApplicationContext();
        this.f24048n = applicationContext;
        this.f24053y = c3926t7;
        this.f24050v = (PowerManager) applicationContext.getSystemService("power");
        this.f24051w = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f24049u = application;
            this.f24044B = new C3818r7(application, this);
        }
        a(null);
    }

    public final void a(View view) {
        long j6;
        WeakReference weakReference = this.f24043A;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            e(view2);
        }
        this.f24043A = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                d(view);
            }
            view.addOnAttachStateChangeListener(this);
            j6 = -2;
        } else {
            j6 = -3;
        }
        this.f24047E = j6;
    }

    public final void b(Activity activity, int i) {
        Window window;
        if (this.f24043A == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        WeakReference weakReference = this.f24043A;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.f24046D = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0084, code lost:
    
        if ((r2.flags & 524288) != 0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        Activity activity;
        WeakReference weakReference = this.f24043A;
        if (weakReference == null) {
            return;
        }
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            this.f24047E = -3L;
            this.f24045C = (byte) -1;
            return;
        }
        int i = view.getVisibility() != 0 ? 1 : 0;
        if (!view.isShown()) {
            i |= 2;
        }
        PowerManager powerManager = this.f24050v;
        if (powerManager != null && !powerManager.isScreenOn()) {
            i |= 4;
        }
        if (!this.f24053y.f34220a) {
            KeyguardManager keyguardManager = this.f24051w;
            if (keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode()) {
                char[] cArr = A7.f23634a;
                View rootView = view.getRootView();
                if (rootView == null) {
                    rootView = view;
                }
                Context context = rootView.getContext();
                for (int i6 = 0; (context instanceof ContextWrapper) && i6 < 10; i6++) {
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
        int i9 = this.f24046D;
        if (i9 != -1) {
            windowVisibility = i9;
        }
        if (windowVisibility != 0) {
            i |= 64;
        }
        if (this.f24045C != i) {
            this.f24045C = (byte) i;
            this.f24047E = i == 0 ? SystemClock.elapsedRealtime() : (-3) - i;
        }
    }

    public final void d(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f24054z = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f24052x == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            Q0.d dVar = new Q0.d(this);
            this.f24052x = dVar;
            this.f24048n.registerReceiver(dVar, intentFilter);
        }
        Application application = this.f24049u;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f24044B);
            } catch (Exception unused) {
            }
        }
    }

    public final void e(View view) {
        try {
            WeakReference weakReference = this.f24054z;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f24054z = null;
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
        Q0.d dVar = this.f24052x;
        if (dVar != null) {
            try {
                this.f24048n.unregisterReceiver(dVar);
            } catch (Exception unused3) {
            }
            this.f24052x = null;
        }
        Application application = this.f24049u;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f24044B);
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
        f24042F.post(new RunnableC3111e(this));
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
        this.f24046D = -1;
        d(view);
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f24046D = -1;
        c();
        f24042F.post(new RunnableC3111e(this));
        e(view);
    }
}
