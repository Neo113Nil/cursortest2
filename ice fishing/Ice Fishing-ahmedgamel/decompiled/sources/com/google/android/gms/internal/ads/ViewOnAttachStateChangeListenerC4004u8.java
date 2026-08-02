package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.u8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC4004u8 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: H, reason: collision with root package name */
    public static final long f35260H = ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32922U1)).longValue();

    /* renamed from: A, reason: collision with root package name */
    public final C3841r7 f35261A;

    /* renamed from: B, reason: collision with root package name */
    public final P1.l f35262B = new P1.l(f35260H, 3);

    /* renamed from: C, reason: collision with root package name */
    public boolean f35263C = false;

    /* renamed from: D, reason: collision with root package name */
    public int f35264D = -1;

    /* renamed from: E, reason: collision with root package name */
    public final HashSet f35265E = new HashSet();

    /* renamed from: F, reason: collision with root package name */
    public final DisplayMetrics f35266F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f35267G;

    /* renamed from: n, reason: collision with root package name */
    public final Context f35268n;

    /* renamed from: u, reason: collision with root package name */
    public final Application f35269u;

    /* renamed from: v, reason: collision with root package name */
    public final PowerManager f35270v;

    /* renamed from: w, reason: collision with root package name */
    public final KeyguardManager f35271w;

    /* renamed from: x, reason: collision with root package name */
    public Q0.d f35272x;

    /* renamed from: y, reason: collision with root package name */
    public WeakReference f35273y;

    /* renamed from: z, reason: collision with root package name */
    public final WeakReference f35274z;

    public ViewOnAttachStateChangeListenerC4004u8(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f35268n = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.f35270v = (PowerManager) applicationContext.getSystemService("power");
        this.f35271w = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f35269u = application;
            this.f35261A = new C3841r7(application, this);
        }
        this.f35266F = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f35267G = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f35274z;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            f(view2);
        }
        this.f35274z = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                e(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect) {
        float f2 = rect.left;
        float f9 = this.f35266F.density;
        return new Rect((int) (f2 / f9), (int) (rect.top / f9), (int) (rect.right / f9), (int) (rect.bottom / f9));
    }

    public final void b() {
        w2.D.f41627l.post(new RunnableC3134e(8, this));
    }

    public final void c(Activity activity, int i) {
        Window window;
        WeakReference weakReference = this.f35274z;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.f35264D = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x014e, code lost:
    
        if (r10 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0130, code lost:
    
        if (r10 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0132, code lost:
    
        r4 = true;
        r10 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023c A[LOOP:1: B:87:0x0236->B:89:0x023c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020d  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i) {
        WeakReference weakReference;
        View view;
        boolean z6;
        boolean z9;
        ?? r02;
        ?? r42;
        PowerManager powerManager;
        boolean z10;
        boolean z11;
        boolean z12;
        Iterator it;
        HashSet hashSet = this.f35265E;
        if (hashSet.isEmpty() || (weakReference = this.f35274z) == null) {
            return;
        }
        View view2 = (View) weakReference.get();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            z6 = view2.getGlobalVisibleRect(rect2);
            z9 = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
            } catch (Exception e9) {
                int i4 = w2.z.f41712b;
                x2.i.d("Failure getting view location.", e9);
            }
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32968Z5)).booleanValue()) {
                rect.left = iArr2[0];
                rect.top = iArr2[1];
            } else {
                rect.left = iArr[0];
                rect.top = iArr[1];
            }
            rect.right = view2.getWidth() + rect.left;
            rect.bottom = view2.getHeight() + rect.top;
            view = view2;
        } else {
            view = null;
            z6 = false;
            z9 = false;
        }
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32948X1)).booleanValue() || view == null) {
            r02 = Collections.EMPTY_LIST;
        } else {
            try {
                r02 = new ArrayList();
                ViewParent parent = view.getParent();
                while (parent instanceof View) {
                    View view3 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        r02.add(a(rect5));
                    }
                    parent = parent.getParent();
                }
            } catch (Exception e10) {
                C4906k.f40186C.f40196h.d("PositionWatcher.getParentScrollViewRects", e10);
                r02 = Collections.EMPTY_LIST;
            }
        }
        List list = r02;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i6 = this.f35264D;
        if (i6 != -1) {
            windowVisibility = i6;
        }
        C4906k c4906k = C4906k.f40186C;
        w2.D d9 = c4906k.f40191c;
        long Q8 = w2.D.Q(view);
        C3324ha c3324ha = AbstractC3592ma.Wb;
        s2.r rVar = s2.r.f40506e;
        boolean booleanValue = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue();
        KeyguardManager keyguardManager = this.f35271w;
        PowerManager powerManager2 = this.f35270v;
        if (!booleanValue) {
            if (view2 != null && w2.D.r(view, powerManager2, keyguardManager)) {
                if (z6) {
                    if (z9) {
                    }
                    r42 = 0;
                    z6 = true;
                    z9 = false;
                    int i9 = windowVisibility;
                    if (((Boolean) rVar.f40509c.a(AbstractC3592ma.bc)).booleanValue()) {
                    }
                    if (i == 1) {
                    }
                    if (r42 == 0) {
                    }
                    z12 = true;
                    c4906k.f40198k.getClass();
                    SystemClock.elapsedRealtime();
                    powerManager.isScreenOn();
                    if (view == null) {
                    }
                    if (view != null) {
                    }
                    Rect a9 = a(this.f35267G);
                    Rect a10 = a(rect);
                    Rect a11 = a(rect2);
                    Rect a12 = a(rect3);
                    Rect a13 = a(rect4);
                    float f2 = this.f35266F.density;
                    boolean z13 = r42;
                    C3896s8 c3896s8 = new C3896s8(r17, r18, a9, a10, a11, z10, a12, z11, a13, z13, list);
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                    }
                    this.f35263C = z13;
                }
                r42 = 0;
                z6 = false;
                int i92 = windowVisibility;
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.bc)).booleanValue()) {
                }
                if (i == 1) {
                }
                if (r42 == 0) {
                }
                z12 = true;
                c4906k.f40198k.getClass();
                SystemClock.elapsedRealtime();
                powerManager.isScreenOn();
                if (view == null) {
                }
                if (view != null) {
                }
                Rect a92 = a(this.f35267G);
                Rect a102 = a(rect);
                Rect a112 = a(rect2);
                Rect a122 = a(rect3);
                Rect a132 = a(rect4);
                float f22 = this.f35266F.density;
                boolean z132 = r42;
                C3896s8 c3896s82 = new C3896s8(r17, r18, a92, a102, a112, z10, a122, z11, a132, z132, list);
                it = hashSet.iterator();
                while (it.hasNext()) {
                }
                this.f35263C = z132;
            }
            r42 = 0;
            int i922 = windowVisibility;
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.bc)).booleanValue()) {
            }
            if (i == 1) {
            }
            if (r42 == 0) {
            }
            z12 = true;
            c4906k.f40198k.getClass();
            SystemClock.elapsedRealtime();
            powerManager.isScreenOn();
            if (view == null) {
            }
            if (view != null) {
            }
            Rect a922 = a(this.f35267G);
            Rect a1022 = a(rect);
            Rect a1122 = a(rect2);
            Rect a1222 = a(rect3);
            Rect a1322 = a(rect4);
            float f222 = this.f35266F.density;
            boolean z1322 = r42;
            C3896s8 c3896s822 = new C3896s8(r17, r18, a922, a1022, a1122, z10, a1222, z11, a1322, z1322, list);
            it = hashSet.iterator();
            while (it.hasNext()) {
            }
            this.f35263C = z1322;
        }
        if (view2 != null && w2.D.r(view, powerManager2, keyguardManager)) {
            if (z6) {
                if (z9) {
                    if (Q8 >= ((Integer) rVar.f40509c.a(AbstractC3592ma.Zb)).intValue()) {
                    }
                    boolean z14 = false;
                    z6 = true;
                    z9 = true;
                    r42 = z14;
                    int i9222 = windowVisibility;
                    if (((Boolean) rVar.f40509c.a(AbstractC3592ma.bc)).booleanValue()) {
                        int i10 = true != w2.D.r(view, powerManager2, keyguardManager) ? 0 : 64;
                        int i11 = true != z6 ? 0 : 8;
                        powerManager = powerManager2;
                        w2.D.j((Q8 >= ((long) ((Integer) rVar.f40509c.a(AbstractC3592ma.Zb)).intValue()) ? 32 : 0) | i10 | i11 | (true != z9 ? 0 : 16) | (i9222 == 0 ? 128 : 0) | r42, view);
                    } else {
                        powerManager = powerManager2;
                    }
                    if (i == 1) {
                        P1.l lVar = this.f35262B;
                        synchronized (lVar.f2370v) {
                            c4906k.f40198k.getClass();
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            z10 = z6;
                            z11 = z9;
                            if (lVar.f2369u + lVar.f2368n <= elapsedRealtime) {
                                lVar.f2369u = elapsedRealtime;
                            } else if (r42 == this.f35263C) {
                                return;
                            }
                        }
                    } else {
                        z10 = z6;
                        z11 = z9;
                    }
                    if (r42 == 0 || this.f35263C) {
                        z12 = true;
                    } else {
                        z12 = true;
                        if (i == 1) {
                            return;
                        }
                    }
                    c4906k.f40198k.getClass();
                    SystemClock.elapsedRealtime();
                    powerManager.isScreenOn();
                    boolean z15 = (view == null && view.isAttachedToWindow()) ? z12 : false;
                    int windowVisibility2 = view != null ? view.getWindowVisibility() : 8;
                    Rect a9222 = a(this.f35267G);
                    Rect a10222 = a(rect);
                    Rect a11222 = a(rect2);
                    Rect a12222 = a(rect3);
                    Rect a13222 = a(rect4);
                    float f2222 = this.f35266F.density;
                    boolean z13222 = r42;
                    C3896s8 c3896s8222 = new C3896s8(z15, windowVisibility2, a9222, a10222, a11222, z10, a12222, z11, a13222, z13222, list);
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC3950t8) it.next()).f(c3896s8222);
                    }
                    this.f35263C = z13222;
                }
                r42 = 0;
                z6 = true;
                z9 = false;
                int i92222 = windowVisibility;
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.bc)).booleanValue()) {
                }
                if (i == 1) {
                }
                if (r42 == 0) {
                }
                z12 = true;
                c4906k.f40198k.getClass();
                SystemClock.elapsedRealtime();
                powerManager.isScreenOn();
                if (view == null) {
                }
                if (view != null) {
                }
                Rect a92222 = a(this.f35267G);
                Rect a102222 = a(rect);
                Rect a112222 = a(rect2);
                Rect a122222 = a(rect3);
                Rect a132222 = a(rect4);
                float f22222 = this.f35266F.density;
                boolean z132222 = r42;
                C3896s8 c3896s82222 = new C3896s8(z15, windowVisibility2, a92222, a102222, a112222, z10, a122222, z11, a132222, z132222, list);
                it = hashSet.iterator();
                while (it.hasNext()) {
                }
                this.f35263C = z132222;
            }
            r42 = 0;
            z6 = false;
            int i922222 = windowVisibility;
            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.bc)).booleanValue()) {
            }
            if (i == 1) {
            }
            if (r42 == 0) {
            }
            z12 = true;
            c4906k.f40198k.getClass();
            SystemClock.elapsedRealtime();
            powerManager.isScreenOn();
            if (view == null) {
            }
            if (view != null) {
            }
            Rect a922222 = a(this.f35267G);
            Rect a1022222 = a(rect);
            Rect a1122222 = a(rect2);
            Rect a1222222 = a(rect3);
            Rect a1322222 = a(rect4);
            float f222222 = this.f35266F.density;
            boolean z1322222 = r42;
            C3896s8 c3896s822222 = new C3896s8(z15, windowVisibility2, a922222, a1022222, a1122222, z10, a1222222, z11, a1322222, z1322222, list);
            it = hashSet.iterator();
            while (it.hasNext()) {
            }
            this.f35263C = z1322222;
        }
        r42 = 0;
        int i9222222 = windowVisibility;
        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.bc)).booleanValue()) {
        }
        if (i == 1) {
        }
        if (r42 == 0) {
        }
        z12 = true;
        c4906k.f40198k.getClass();
        SystemClock.elapsedRealtime();
        powerManager.isScreenOn();
        if (view == null) {
        }
        if (view != null) {
        }
        Rect a9222222 = a(this.f35267G);
        Rect a10222222 = a(rect);
        Rect a11222222 = a(rect2);
        Rect a12222222 = a(rect3);
        Rect a13222222 = a(rect4);
        float f2222222 = this.f35266F.density;
        boolean z13222222 = r42;
        C3896s8 c3896s8222222 = new C3896s8(z15, windowVisibility2, a9222222, a10222222, a11222222, z10, a12222222, z11, a13222222, z13222222, list);
        it = hashSet.iterator();
        while (it.hasNext()) {
        }
        this.f35263C = z13222222;
    }

    public final void e(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f35273y = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f35272x == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            Q0.d dVar = new Q0.d(this);
            this.f35272x = dVar;
            Context context = this.f35268n;
            C3451jv c3451jv = C4906k.f40186C.f40213z;
            synchronized (c3451jv) {
                if (c3451jv.f32125u) {
                    ((WeakHashMap) c3451jv.f32127w).put(dVar, intentFilter);
                } else {
                    AbstractC3592ma.a(context);
                    if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.tc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                        context.registerReceiver(dVar, intentFilter);
                    } else {
                        context.registerReceiver(dVar, intentFilter, 4);
                    }
                }
            }
        }
        Application application = this.f35269u;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f35261A);
            } catch (Exception e9) {
                int i = w2.z.f41712b;
                x2.i.d("Error registering activity lifecycle callbacks.", e9);
            }
        }
    }

    public final void f(View view) {
        try {
            WeakReference weakReference = this.f35273y;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f35273y = null;
            }
        } catch (Exception e9) {
            int i = w2.z.f41712b;
            x2.i.d("Error while unregistering listeners from the last ViewTreeObserver.", e9);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e10) {
            int i4 = w2.z.f41712b;
            x2.i.d("Error while unregistering listeners from the ViewTreeObserver.", e10);
        }
        Q0.d dVar = this.f35272x;
        if (dVar != null) {
            try {
                C4906k.f40186C.f40213z.i(this.f35268n, dVar);
            } catch (IllegalStateException e11) {
                int i6 = w2.z.f41712b;
                x2.i.d("Failed trying to unregister the receiver", e11);
            } catch (Exception e12) {
                C4906k.f40186C.f40196h.d("ActiveViewUnit.stopScreenStatusMonitoring", e12);
            }
            this.f35272x = null;
        }
        Application application = this.f35269u;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f35261A);
            } catch (Exception e13) {
                int i9 = w2.z.f41712b;
                x2.i.d("Error registering activity lifecycle callbacks.", e13);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(activity, 4);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        c(activity, 0);
        d(3);
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        d(3);
        b();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d(2);
        b();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        d(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f35264D = -1;
        e(view);
        d(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f35264D = -1;
        d(3);
        b();
        f(view);
    }
}
