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
    public static final Handler f24805F = new Handler(Looper.getMainLooper());

    /* renamed from: A, reason: collision with root package name */
    public WeakReference f24806A;

    /* renamed from: B, reason: collision with root package name */
    public final C3841r7 f24807B;

    /* renamed from: C, reason: collision with root package name */
    public byte f24808C = -1;

    /* renamed from: D, reason: collision with root package name */
    public int f24809D = -1;

    /* renamed from: E, reason: collision with root package name */
    public long f24810E = -3;

    /* renamed from: n, reason: collision with root package name */
    public final Context f24811n;

    /* renamed from: u, reason: collision with root package name */
    public final Application f24812u;

    /* renamed from: v, reason: collision with root package name */
    public final PowerManager f24813v;

    /* renamed from: w, reason: collision with root package name */
    public final KeyguardManager f24814w;

    /* renamed from: x, reason: collision with root package name */
    public Q0.d f24815x;

    /* renamed from: y, reason: collision with root package name */
    public final C3949t7 f24816y;

    /* renamed from: z, reason: collision with root package name */
    public WeakReference f24817z;

    public C7(Context context, C3949t7 c3949t7) {
        Context applicationContext = context.getApplicationContext();
        this.f24811n = applicationContext;
        this.f24816y = c3949t7;
        this.f24813v = (PowerManager) applicationContext.getSystemService("power");
        this.f24814w = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f24812u = application;
            this.f24807B = new C3841r7(application, this);
        }
        a(null);
    }

    public final void a(View view) {
        long j6;
        WeakReference weakReference = this.f24806A;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            e(view2);
        }
        this.f24806A = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                d(view);
            }
            view.addOnAttachStateChangeListener(this);
            j6 = -2;
        } else {
            j6 = -3;
        }
        this.f24810E = j6;
    }

    public final void b(Activity activity, int i) {
        Window window;
        if (this.f24806A == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        WeakReference weakReference = this.f24806A;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.f24809D = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0084, code lost:
    
        if ((r2.flags & 524288) != 0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        Activity activity;
        WeakReference weakReference = this.f24806A;
        if (weakReference == null) {
            return;
        }
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            this.f24810E = -3L;
            this.f24808C = (byte) -1;
            return;
        }
        int i = view.getVisibility() != 0 ? 1 : 0;
        if (!view.isShown()) {
            i |= 2;
        }
        PowerManager powerManager = this.f24813v;
        if (powerManager != null && !powerManager.isScreenOn()) {
            i |= 4;
        }
        if (!this.f24816y.f35006a) {
            KeyguardManager keyguardManager = this.f24814w;
            if (keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode()) {
                char[] cArr = A7.f24414a;
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
        int i6 = this.f24809D;
        if (i6 != -1) {
            windowVisibility = i6;
        }
        if (windowVisibility != 0) {
            i |= 64;
        }
        if (this.f24808C != i) {
            this.f24808C = (byte) i;
            this.f24810E = i == 0 ? SystemClock.elapsedRealtime() : (-3) - i;
        }
    }

    public final void d(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f24817z = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f24815x == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            Q0.d dVar = new Q0.d(this);
            this.f24815x = dVar;
            this.f24811n.registerReceiver(dVar, intentFilter);
        }
        Application application = this.f24812u;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f24807B);
            } catch (Exception unused) {
            }
        }
    }

    public final void e(View view) {
        try {
            WeakReference weakReference = this.f24817z;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f24817z = null;
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
        Q0.d dVar = this.f24815x;
        if (dVar != null) {
            try {
                this.f24811n.unregisterReceiver(dVar);
            } catch (Exception unused3) {
            }
            this.f24815x = null;
        }
        Application application = this.f24812u;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f24807B);
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
        f24805F.post(new RunnableC3134e(this));
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
        this.f24809D = -1;
        d(view);
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f24809D = -1;
        c();
        f24805F.post(new RunnableC3134e(this));
        e(view);
    }
}
