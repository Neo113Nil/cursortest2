package com.gamericefishpro.space.g3;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d.t;
import com.gamericefishpro.space.oh.s;
import com.gamericefishpro.space.z4.m0;
import com.gamericefishpro.space.z4.u;
import com.gamericefishpro.space.z4.w;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends Dialog implements u, t, com.gamericefishpro.space.j5.c, com.gamericefishpro.space.z5.e {
    public final n A;
    public boolean B;
    public w d;
    public final com.gamericefishpro.space.u6.c e;
    public final s i;
    public final s v;
    public Function0 w;
    public o y;
    public final View z;

    public q(Function0 function0, o oVar, View view, com.gamericefishpro.space.c3.l lVar, com.gamericefishpro.space.c3.c cVar, UUID uuid) {
        ContextThemeWrapper context = new ContextThemeWrapper(view.getContext(), oVar.e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme);
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, 0);
        Intrinsics.checkNotNullParameter(this, "owner");
        this.e = new com.gamericefishpro.space.u6.c(new com.gamericefishpro.space.b6.b(this, new com.gamericefishpro.space.a3.b(24, this)));
        final int i = 0;
        this.i = com.gamericefishpro.space.oh.i.b(new Function0(this) { // from class: com.gamericefishpro.space.d.l
            public final /* synthetic */ com.gamericefishpro.space.g3.q e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        com.gamericefishpro.space.j5.a aVar = new com.gamericefishpro.space.j5.a();
                        this.e.c().b(aVar);
                        return aVar;
                    default:
                        return new r(new com.appsflyer.a(2, this.e));
                }
            }
        });
        final int i2 = 1;
        this.v = com.gamericefishpro.space.oh.i.b(new Function0(this) { // from class: com.gamericefishpro.space.d.l
            public final /* synthetic */ com.gamericefishpro.space.g3.q e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        com.gamericefishpro.space.j5.a aVar = new com.gamericefishpro.space.j5.a();
                        this.e.c().b(aVar);
                        return aVar;
                    default:
                        return new r(new com.appsflyer.a(2, this.e));
                }
            }
        });
        this.w = function0;
        this.y = oVar;
        this.z = view;
        float f = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        com.gamericefishpro.space.wa.b.N(window, this.y.e);
        window.setGravity(17);
        if (!this.y.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                j.a.a(attributes);
            }
            if (i3 >= 30) {
                k kVar = k.a;
                kVar.b(attributes, 0);
                kVar.c(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        n nVar = new n(getContext(), window);
        setTitle(this.y.f);
        nVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        nVar.setClipChildren(false);
        nVar.setElevation(cVar.r(f));
        nVar.setOutlineProvider(new p(0));
        this.A = nVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            e(viewGroup);
        }
        setContentView(nVar);
        m0.i(nVar, m0.e(view));
        m0.j(nVar, m0.f(view));
        com.gamericefishpro.space.z5.g.c(nVar, com.gamericefishpro.space.z5.g.b(view));
        h(this.w, this.y, lVar);
        com.gamericefishpro.space.d.r rVarA = a();
        a onBackPressed = new a(this, 1);
        Intrinsics.checkNotNullParameter(rVarA, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        com.gamericefishpro.space.d.s onBackPressedCallback = new com.gamericefishpro.space.d.s(onBackPressed);
        rVarA.getClass();
        Intrinsics.checkNotNullParameter(this, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        w wVarG = g();
        if (wVarG.c == com.gamericefishpro.space.z4.p.d) {
            return;
        }
        com.gamericefishpro.space.d.o info = new com.gamericefishpro.space.d.o(onBackPressedCallback, this);
        Intrinsics.checkNotNullParameter(info, "info");
        com.gamericefishpro.space.d.n nVar2 = new com.gamericefishpro.space.d.n(onBackPressedCallback, info);
        onBackPressedCallback.a.add(nVar2);
        nVar2.g(false);
        com.gamericefishpro.space.tb.s.a(rVarA.a().c, nVar2);
        com.gamericefishpro.space.d.q closeable = new com.gamericefishpro.space.d.q(nVar2, rVarA, wVarG);
        wVarG.a(closeable);
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        onBackPressedCallback.c.add(closeable);
    }

    public static void d(q qVar) {
        super.onBackPressed();
    }

    public static final void e(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof n) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                e(viewGroup2);
            }
        }
    }

    @Override // com.gamericefishpro.space.d.t
    public final com.gamericefishpro.space.d.r a() {
        return (com.gamericefishpro.space.d.r) this.v.getValue();
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        f();
        super.addContentView(view, layoutParams);
    }

    @Override // com.gamericefishpro.space.z5.e
    public final com.gamericefishpro.space.u6.s b() {
        return (com.gamericefishpro.space.u6.s) this.e.e;
    }

    @Override // com.gamericefishpro.space.j5.c
    public final com.gamericefishpro.space.tb.s c() {
        return a().a().c;
    }

    public final void f() {
        Window window = getWindow();
        Intrinsics.b(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        m0.i(decorView, this);
        Window window2 = getWindow();
        Intrinsics.b(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        Intrinsics.b(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "getDecorView(...)");
        com.gamericefishpro.space.z5.g.c(decorView3, this);
        Window window4 = getWindow();
        Intrinsics.b(window4);
        View decorView4 = window4.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "getDecorView(...)");
        Intrinsics.checkNotNullParameter(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // com.gamericefishpro.space.z4.u
    public final w g() {
        w wVar = this.d;
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this);
        this.d = wVar2;
        return wVar2;
    }

    public final void h(Function0 function0, o oVar, com.gamericefishpro.space.c3.l lVar) {
        int i;
        this.w = function0;
        this.y = oVar;
        r rVar = oVar.c;
        int i2 = h.a;
        ViewGroup.LayoutParams layoutParams = this.z.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i3 = 0;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int iOrdinal = rVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z = true;
            } else {
                if (iOrdinal != 2) {
                    throw new com.gamericefishpro.space.oh.k();
                }
                z = false;
            }
        }
        Window window = getWindow();
        Intrinsics.b(window);
        window.setFlags(z ? 8192 : -8193, 8192);
        int iOrdinal2 = lVar.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new com.gamericefishpro.space.oh.k();
            }
            i = 1;
        }
        n nVar = this.A;
        nVar.setLayoutDirection(i);
        boolean z2 = oVar.e;
        boolean z3 = oVar.d;
        Window window2 = nVar.B;
        boolean z4 = (nVar.F && z3 == nVar.D && z2 == nVar.E) ? false : true;
        nVar.D = z3;
        nVar.E = z2;
        if (z4) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i4 = z3 ? -2 : -1;
            if (i4 != attributes.width || !nVar.F) {
                window2.setLayout(i4, -2);
                nVar.F = true;
            }
        }
        setCanceledOnTouchOutside(oVar.b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z2) {
                i3 = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window3.setSoftInputMode(i3);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((com.gamericefishpro.space.j5.a) this.i.getValue()).a();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            com.gamericefishpro.space.d.r rVarA = a();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            rVarA.b(onBackInvokedDispatcher);
        }
        this.e.p(bundle);
        w wVar = this.d;
        if (wVar == null) {
            wVar = new w(this);
            this.d = wVar;
        }
        wVar.d(com.gamericefishpro.space.z4.o.ON_CREATE);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.y.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.w.invoke();
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(bundleOnSaveInstanceState, "onSaveInstanceState(...)");
        this.e.q(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        w wVar = this.d;
        if (wVar == null) {
            wVar = new w(this);
            this.d = wVar;
        }
        wVar.d(com.gamericefishpro.space.z4.o.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        w wVar = this.d;
        if (wVar == null) {
            wVar = new w(this);
            this.d = wVar;
        }
        wVar.d(com.gamericefishpro.space.z4.o.ON_DESTROY);
        this.d = null;
        super.onStop();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iA;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.y.b) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
            }
            this.B = false;
            return zOnTouchEvent;
        }
        n nVar = this.A;
        nVar.getClass();
        float x = motionEvent.getX();
        if (!Float.isInfinite(x) && !Float.isNaN(x)) {
            float y = motionEvent.getY();
            if (!Float.isInfinite(y) && !Float.isNaN(y) && (childAt = nVar.getChildAt(0)) != null) {
                int left = childAt.getLeft() + nVar.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + nVar.getTop();
                int height = childAt.getHeight() + top;
                int iA2 = com.gamericefishpro.space.gi.c.a(motionEvent.getX());
                if (left <= iA2 && iA2 <= width && top <= (iA = com.gamericefishpro.space.gi.c.a(motionEvent.getY())) && iA <= height) {
                    actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 0 || actionMasked == 1 || actionMasked == 3) {
                        this.B = false;
                        return zOnTouchEvent;
                    }
                }
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.B = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.B = false;
                return zOnTouchEvent;
            }
        } else if (this.B) {
            this.w.invoke();
            this.B = false;
            return true;
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        f();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        f();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        f();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
