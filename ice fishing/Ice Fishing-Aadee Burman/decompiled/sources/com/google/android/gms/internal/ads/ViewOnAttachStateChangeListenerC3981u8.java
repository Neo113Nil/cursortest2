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
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.u8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC3981u8 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: H, reason: collision with root package name */
    public static final long f34486H = ((Long) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32143U1)).longValue();

    /* renamed from: A, reason: collision with root package name */
    public final C3818r7 f34487A;

    /* renamed from: B, reason: collision with root package name */
    public final N1.l f34488B = new N1.l(f34486H, 3);

    /* renamed from: C, reason: collision with root package name */
    public boolean f34489C = false;

    /* renamed from: D, reason: collision with root package name */
    public int f34490D = -1;

    /* renamed from: E, reason: collision with root package name */
    public final HashSet f34491E = new HashSet();

    /* renamed from: F, reason: collision with root package name */
    public final DisplayMetrics f34492F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f34493G;

    /* renamed from: n, reason: collision with root package name */
    public final Context f34494n;

    /* renamed from: u, reason: collision with root package name */
    public final Application f34495u;

    /* renamed from: v, reason: collision with root package name */
    public final PowerManager f34496v;

    /* renamed from: w, reason: collision with root package name */
    public final KeyguardManager f34497w;

    /* renamed from: x, reason: collision with root package name */
    public Q0.d f34498x;

    /* renamed from: y, reason: collision with root package name */
    public WeakReference f34499y;

    /* renamed from: z, reason: collision with root package name */
    public final WeakReference f34500z;

    public ViewOnAttachStateChangeListenerC3981u8(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f34494n = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.f34496v = (PowerManager) applicationContext.getSystemService("power");
        this.f34497w = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f34495u = application;
            this.f34487A = new C3818r7(application, this);
        }
        this.f34492F = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f34493G = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f34500z;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            f(view2);
        }
        this.f34500z = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                e(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect) {
        float f3 = rect.left;
        float f9 = this.f34492F.density;
        return new Rect((int) (f3 / f9), (int) (rect.top / f9), (int) (rect.right / f9), (int) (rect.bottom / f9));
    }

    public final void b() {
        u2.D.f41234l.post(new RunnableC3111e(8, this));
    }

    public final void c(Activity activity, int i) {
        Window window;
        WeakReference weakReference = this.f34500z;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.f34490D = i;
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
        boolean z3;
        boolean z6;
        ?? r02;
        ?? r42;
        PowerManager powerManager;
        boolean z9;
        boolean z10;
        boolean z11;
        Iterator it;
        HashSet hashSet = this.f34491E;
        if (hashSet.isEmpty() || (weakReference = this.f34500z) == null) {
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
            z3 = view2.getGlobalVisibleRect(rect2);
            z6 = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
            } catch (Exception e9) {
                int i6 = u2.z.f41319b;
                v2.i.d("Failure getting view location.", e9);
            }
            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32189Z5)).booleanValue()) {
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
            z3 = false;
            z6 = false;
        }
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32169X1)).booleanValue() || view == null) {
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
                C4835j.f39730C.f39740h.d("PositionWatcher.getParentScrollViewRects", e10);
                r02 = Collections.EMPTY_LIST;
            }
        }
        List list = r02;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i9 = this.f34490D;
        if (i9 != -1) {
            windowVisibility = i9;
        }
        C4835j c4835j = C4835j.f39730C;
        u2.D d2 = c4835j.f39735c;
        long Q8 = u2.D.Q(view);
        C3301ha c3301ha = AbstractC3569ma.Wb;
        q2.r rVar = q2.r.f40204e;
        boolean booleanValue = ((Boolean) rVar.f40207c.a(c3301ha)).booleanValue();
        KeyguardManager keyguardManager = this.f34497w;
        PowerManager powerManager2 = this.f34496v;
        if (!booleanValue) {
            if (view2 != null && u2.D.r(view, powerManager2, keyguardManager)) {
                if (z3) {
                    if (z6) {
                    }
                    r42 = 0;
                    z3 = true;
                    z6 = false;
                    int i10 = windowVisibility;
                    if (((Boolean) rVar.f40207c.a(AbstractC3569ma.bc)).booleanValue()) {
                    }
                    if (i == 1) {
                    }
                    if (r42 == 0) {
                    }
                    z11 = true;
                    c4835j.f39742k.getClass();
                    SystemClock.elapsedRealtime();
                    powerManager.isScreenOn();
                    if (view == null) {
                    }
                    if (view != null) {
                    }
                    Rect a9 = a(this.f34493G);
                    Rect a10 = a(rect);
                    Rect a11 = a(rect2);
                    Rect a12 = a(rect3);
                    Rect a13 = a(rect4);
                    float f3 = this.f34492F.density;
                    boolean z12 = r42;
                    C3873s8 c3873s8 = new C3873s8(r17, r18, a9, a10, a11, z9, a12, z10, a13, z12, list);
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                    }
                    this.f34489C = z12;
                }
                r42 = 0;
                z3 = false;
                int i102 = windowVisibility;
                if (((Boolean) rVar.f40207c.a(AbstractC3569ma.bc)).booleanValue()) {
                }
                if (i == 1) {
                }
                if (r42 == 0) {
                }
                z11 = true;
                c4835j.f39742k.getClass();
                SystemClock.elapsedRealtime();
                powerManager.isScreenOn();
                if (view == null) {
                }
                if (view != null) {
                }
                Rect a92 = a(this.f34493G);
                Rect a102 = a(rect);
                Rect a112 = a(rect2);
                Rect a122 = a(rect3);
                Rect a132 = a(rect4);
                float f32 = this.f34492F.density;
                boolean z122 = r42;
                C3873s8 c3873s82 = new C3873s8(r17, r18, a92, a102, a112, z9, a122, z10, a132, z122, list);
                it = hashSet.iterator();
                while (it.hasNext()) {
                }
                this.f34489C = z122;
            }
            r42 = 0;
            int i1022 = windowVisibility;
            if (((Boolean) rVar.f40207c.a(AbstractC3569ma.bc)).booleanValue()) {
            }
            if (i == 1) {
            }
            if (r42 == 0) {
            }
            z11 = true;
            c4835j.f39742k.getClass();
            SystemClock.elapsedRealtime();
            powerManager.isScreenOn();
            if (view == null) {
            }
            if (view != null) {
            }
            Rect a922 = a(this.f34493G);
            Rect a1022 = a(rect);
            Rect a1122 = a(rect2);
            Rect a1222 = a(rect3);
            Rect a1322 = a(rect4);
            float f322 = this.f34492F.density;
            boolean z1222 = r42;
            C3873s8 c3873s822 = new C3873s8(r17, r18, a922, a1022, a1122, z9, a1222, z10, a1322, z1222, list);
            it = hashSet.iterator();
            while (it.hasNext()) {
            }
            this.f34489C = z1222;
        }
        if (view2 != null && u2.D.r(view, powerManager2, keyguardManager)) {
            if (z3) {
                if (z6) {
                    if (Q8 >= ((Integer) rVar.f40207c.a(AbstractC3569ma.Zb)).intValue()) {
                    }
                    boolean z13 = false;
                    z3 = true;
                    z6 = true;
                    r42 = z13;
                    int i10222 = windowVisibility;
                    if (((Boolean) rVar.f40207c.a(AbstractC3569ma.bc)).booleanValue()) {
                        int i11 = true != u2.D.r(view, powerManager2, keyguardManager) ? 0 : 64;
                        int i12 = true != z3 ? 0 : 8;
                        powerManager = powerManager2;
                        u2.D.j((Q8 >= ((long) ((Integer) rVar.f40207c.a(AbstractC3569ma.Zb)).intValue()) ? 32 : 0) | i11 | i12 | (true != z6 ? 0 : 16) | (i10222 == 0 ? 128 : 0) | r42, view);
                    } else {
                        powerManager = powerManager2;
                    }
                    if (i == 1) {
                        N1.l lVar = this.f34488B;
                        synchronized (lVar.f1926v) {
                            c4835j.f39742k.getClass();
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            z9 = z3;
                            z10 = z6;
                            if (lVar.f1925u + lVar.f1924n <= elapsedRealtime) {
                                lVar.f1925u = elapsedRealtime;
                            } else if (r42 == this.f34489C) {
                                return;
                            }
                        }
                    } else {
                        z9 = z3;
                        z10 = z6;
                    }
                    if (r42 == 0 || this.f34489C) {
                        z11 = true;
                    } else {
                        z11 = true;
                        if (i == 1) {
                            return;
                        }
                    }
                    c4835j.f39742k.getClass();
                    SystemClock.elapsedRealtime();
                    powerManager.isScreenOn();
                    boolean z14 = (view == null && view.isAttachedToWindow()) ? z11 : false;
                    int windowVisibility2 = view != null ? view.getWindowVisibility() : 8;
                    Rect a9222 = a(this.f34493G);
                    Rect a10222 = a(rect);
                    Rect a11222 = a(rect2);
                    Rect a12222 = a(rect3);
                    Rect a13222 = a(rect4);
                    float f3222 = this.f34492F.density;
                    boolean z12222 = r42;
                    C3873s8 c3873s8222 = new C3873s8(z14, windowVisibility2, a9222, a10222, a11222, z9, a12222, z10, a13222, z12222, list);
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC3927t8) it.next()).f(c3873s8222);
                    }
                    this.f34489C = z12222;
                }
                r42 = 0;
                z3 = true;
                z6 = false;
                int i102222 = windowVisibility;
                if (((Boolean) rVar.f40207c.a(AbstractC3569ma.bc)).booleanValue()) {
                }
                if (i == 1) {
                }
                if (r42 == 0) {
                }
                z11 = true;
                c4835j.f39742k.getClass();
                SystemClock.elapsedRealtime();
                powerManager.isScreenOn();
                if (view == null) {
                }
                if (view != null) {
                }
                Rect a92222 = a(this.f34493G);
                Rect a102222 = a(rect);
                Rect a112222 = a(rect2);
                Rect a122222 = a(rect3);
                Rect a132222 = a(rect4);
                float f32222 = this.f34492F.density;
                boolean z122222 = r42;
                C3873s8 c3873s82222 = new C3873s8(z14, windowVisibility2, a92222, a102222, a112222, z9, a122222, z10, a132222, z122222, list);
                it = hashSet.iterator();
                while (it.hasNext()) {
                }
                this.f34489C = z122222;
            }
            r42 = 0;
            z3 = false;
            int i1022222 = windowVisibility;
            if (((Boolean) rVar.f40207c.a(AbstractC3569ma.bc)).booleanValue()) {
            }
            if (i == 1) {
            }
            if (r42 == 0) {
            }
            z11 = true;
            c4835j.f39742k.getClass();
            SystemClock.elapsedRealtime();
            powerManager.isScreenOn();
            if (view == null) {
            }
            if (view != null) {
            }
            Rect a922222 = a(this.f34493G);
            Rect a1022222 = a(rect);
            Rect a1122222 = a(rect2);
            Rect a1222222 = a(rect3);
            Rect a1322222 = a(rect4);
            float f322222 = this.f34492F.density;
            boolean z1222222 = r42;
            C3873s8 c3873s822222 = new C3873s8(z14, windowVisibility2, a922222, a1022222, a1122222, z9, a1222222, z10, a1322222, z1222222, list);
            it = hashSet.iterator();
            while (it.hasNext()) {
            }
            this.f34489C = z1222222;
        }
        r42 = 0;
        int i10222222 = windowVisibility;
        if (((Boolean) rVar.f40207c.a(AbstractC3569ma.bc)).booleanValue()) {
        }
        if (i == 1) {
        }
        if (r42 == 0) {
        }
        z11 = true;
        c4835j.f39742k.getClass();
        SystemClock.elapsedRealtime();
        powerManager.isScreenOn();
        if (view == null) {
        }
        if (view != null) {
        }
        Rect a9222222 = a(this.f34493G);
        Rect a10222222 = a(rect);
        Rect a11222222 = a(rect2);
        Rect a12222222 = a(rect3);
        Rect a13222222 = a(rect4);
        float f3222222 = this.f34492F.density;
        boolean z12222222 = r42;
        C3873s8 c3873s8222222 = new C3873s8(z14, windowVisibility2, a9222222, a10222222, a11222222, z9, a12222222, z10, a13222222, z12222222, list);
        it = hashSet.iterator();
        while (it.hasNext()) {
        }
        this.f34489C = z12222222;
    }

    public final void e(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f34499y = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f34498x == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            Q0.d dVar = new Q0.d(this);
            this.f34498x = dVar;
            Context context = this.f34494n;
            C3428jv c3428jv = C4835j.f39730C.f39757z;
            synchronized (c3428jv) {
                if (c3428jv.f31346u) {
                    ((WeakHashMap) c3428jv.f31348w).put(dVar, intentFilter);
                } else {
                    AbstractC3569ma.a(context);
                    if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.tc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                        context.registerReceiver(dVar, intentFilter);
                    } else {
                        context.registerReceiver(dVar, intentFilter, 4);
                    }
                }
            }
        }
        Application application = this.f34495u;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f34487A);
            } catch (Exception e9) {
                int i = u2.z.f41319b;
                v2.i.d("Error registering activity lifecycle callbacks.", e9);
            }
        }
    }

    public final void f(View view) {
        try {
            WeakReference weakReference = this.f34499y;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f34499y = null;
            }
        } catch (Exception e9) {
            int i = u2.z.f41319b;
            v2.i.d("Error while unregistering listeners from the last ViewTreeObserver.", e9);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e10) {
            int i6 = u2.z.f41319b;
            v2.i.d("Error while unregistering listeners from the ViewTreeObserver.", e10);
        }
        Q0.d dVar = this.f34498x;
        if (dVar != null) {
            try {
                C4835j.f39730C.f39757z.i(this.f34494n, dVar);
            } catch (IllegalStateException e11) {
                int i9 = u2.z.f41319b;
                v2.i.d("Failed trying to unregister the receiver", e11);
            } catch (Exception e12) {
                C4835j.f39730C.f39740h.d("ActiveViewUnit.stopScreenStatusMonitoring", e12);
            }
            this.f34498x = null;
        }
        Application application = this.f34495u;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f34487A);
            } catch (Exception e13) {
                int i10 = u2.z.f41319b;
                v2.i.d("Error registering activity lifecycle callbacks.", e13);
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
        this.f34490D = -1;
        e(view);
        d(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f34490D = -1;
        d(3);
        b();
        f(view);
    }
}
