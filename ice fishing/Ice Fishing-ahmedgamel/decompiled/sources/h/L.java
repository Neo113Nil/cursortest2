package h;

import O.C0330e0;
import O.X;
import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.icefishing.icefishingbigwin.C5275R;
import g.AbstractC4518a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.AbstractC4615b;
import k.C4623j;
import k.C4624k;
import k.InterfaceC4614a;
import m.InterfaceC4681d;
import m.InterfaceC4692i0;
import m.S0;
import m.X0;

/* loaded from: classes.dex */
public final class L extends AbstractC4541a implements InterfaceC4681d {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f37840y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f37841z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f37842a;

    /* renamed from: b, reason: collision with root package name */
    public Context f37843b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f37844c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f37845d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC4692i0 f37846e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f37847f;

    /* renamed from: g, reason: collision with root package name */
    public final View f37848g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f37849h;
    public K i;

    /* renamed from: j, reason: collision with root package name */
    public K f37850j;

    /* renamed from: k, reason: collision with root package name */
    public S0.e f37851k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f37852l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f37853m;

    /* renamed from: n, reason: collision with root package name */
    public int f37854n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f37855o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f37856p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f37857q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f37858r;

    /* renamed from: s, reason: collision with root package name */
    public C4624k f37859s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f37860t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f37861u;

    /* renamed from: v, reason: collision with root package name */
    public final J f37862v;

    /* renamed from: w, reason: collision with root package name */
    public final J f37863w;

    /* renamed from: x, reason: collision with root package name */
    public final F1.a f37864x;

    public L(Activity activity, boolean z3) {
        new ArrayList();
        this.f37853m = new ArrayList();
        this.f37854n = 0;
        this.f37855o = true;
        this.f37858r = true;
        this.f37862v = new J(this, 0);
        this.f37863w = new J(this, 1);
        this.f37864x = new F1.a(20, this);
        View decorView = activity.getWindow().getDecorView();
        u(decorView);
        if (z3) {
            return;
        }
        this.f37848g = decorView.findViewById(R.id.content);
    }

    @Override // h.AbstractC4541a
    public final boolean b() {
        S0 s02;
        InterfaceC4692i0 interfaceC4692i0 = this.f37846e;
        if (interfaceC4692i0 == null || (s02 = ((X0) interfaceC4692i0).f39081a.f4620v0) == null || s02.f39060u == null) {
            return false;
        }
        S0 s03 = ((X0) interfaceC4692i0).f39081a.f4620v0;
        l.o oVar = s03 == null ? null : s03.f39060u;
        if (oVar == null) {
            return true;
        }
        oVar.collapseActionView();
        return true;
    }

    @Override // h.AbstractC4541a
    public final void c(boolean z3) {
        if (z3 == this.f37852l) {
            return;
        }
        this.f37852l = z3;
        ArrayList arrayList = this.f37853m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // h.AbstractC4541a
    public final int d() {
        return ((X0) this.f37846e).f39082b;
    }

    @Override // h.AbstractC4541a
    public final Context e() {
        if (this.f37843b == null) {
            TypedValue typedValue = new TypedValue();
            this.f37842a.getTheme().resolveAttribute(C5275R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f37843b = new ContextThemeWrapper(this.f37842a, i);
            } else {
                this.f37843b = this.f37842a;
            }
        }
        return this.f37843b;
    }

    @Override // h.AbstractC4541a
    public final void g() {
        v(this.f37842a.getResources().getBoolean(C5275R.bool.abc_action_bar_embed_tabs));
    }

    @Override // h.AbstractC4541a
    public final boolean i(int i, KeyEvent keyEvent) {
        l.m mVar;
        K k9 = this.i;
        if (k9 == null || (mVar = k9.f37836w) == null) {
            return false;
        }
        mVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return mVar.performShortcut(i, keyEvent, 0);
    }

    @Override // h.AbstractC4541a
    public final void l(boolean z3) {
        if (this.f37849h) {
            return;
        }
        m(z3);
    }

    @Override // h.AbstractC4541a
    public final void m(boolean z3) {
        int i = z3 ? 4 : 0;
        X0 x02 = (X0) this.f37846e;
        int i6 = x02.f39082b;
        this.f37849h = true;
        x02.a((i & 4) | (i6 & (-5)));
    }

    @Override // h.AbstractC4541a
    public final void n(int i) {
        ((X0) this.f37846e).b(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.graphics.drawable.Drawable] */
    @Override // h.AbstractC4541a
    public final void o(j.a aVar) {
        X0 x02 = (X0) this.f37846e;
        x02.f39086f = aVar;
        int i = x02.f39082b & 4;
        Toolbar toolbar = x02.f39081a;
        j.a aVar2 = aVar;
        if (i == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (aVar == null) {
            aVar2 = x02.f39094o;
        }
        toolbar.setNavigationIcon(aVar2);
    }

    @Override // h.AbstractC4541a
    public final void p() {
        this.f37846e.getClass();
    }

    @Override // h.AbstractC4541a
    public final void q(boolean z3) {
        C4624k c4624k;
        this.f37860t = z3;
        if (z3 || (c4624k = this.f37859s) == null) {
            return;
        }
        c4624k.a();
    }

    @Override // h.AbstractC4541a
    public final void r(CharSequence charSequence) {
        X0 x02 = (X0) this.f37846e;
        if (x02.f39087g) {
            return;
        }
        x02.f39088h = charSequence;
        if ((x02.f39082b & 8) != 0) {
            Toolbar toolbar = x02.f39081a;
            toolbar.setTitle(charSequence);
            if (x02.f39087g) {
                X.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // h.AbstractC4541a
    public final AbstractC4615b s(S0.e eVar) {
        K k9 = this.i;
        if (k9 != null) {
            k9.a();
        }
        this.f37844c.setHideOnContentScrollEnabled(false);
        this.f37847f.e();
        K k10 = new K(this, this.f37847f.getContext(), eVar);
        l.m mVar = k10.f37836w;
        mVar.w();
        try {
            if (!((InterfaceC4614a) k10.f37837x.f2781u).g(k10, mVar)) {
                return null;
            }
            this.i = k10;
            k10.g();
            this.f37847f.c(k10);
            t(true);
            return k10;
        } finally {
            mVar.v();
        }
    }

    public final void t(boolean z3) {
        C0330e0 i;
        C0330e0 c0330e0;
        if (z3) {
            if (!this.f37857q) {
                this.f37857q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f37844c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                w(false);
            }
        } else if (this.f37857q) {
            this.f37857q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f37844c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            w(false);
        }
        if (!this.f37845d.isLaidOut()) {
            if (z3) {
                ((X0) this.f37846e).f39081a.setVisibility(4);
                this.f37847f.setVisibility(0);
                return;
            } else {
                ((X0) this.f37846e).f39081a.setVisibility(0);
                this.f37847f.setVisibility(8);
                return;
            }
        }
        if (z3) {
            X0 x02 = (X0) this.f37846e;
            i = X.a(x02.f39081a);
            i.a(0.0f);
            i.c(100L);
            i.d(new C4623j(x02, 4));
            c0330e0 = this.f37847f.i(0, 200L);
        } else {
            X0 x03 = (X0) this.f37846e;
            C0330e0 a9 = X.a(x03.f39081a);
            a9.a(1.0f);
            a9.c(200L);
            a9.d(new C4623j(x03, 0));
            i = this.f37847f.i(8, 100L);
            c0330e0 = a9;
        }
        C4624k c4624k = new C4624k();
        ArrayList arrayList = c4624k.f38544a;
        arrayList.add(i);
        View view = (View) i.f2073a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0330e0.f2073a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0330e0);
        c4624k.b();
    }

    public final void u(View view) {
        InterfaceC4692i0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C5275R.id.decor_content_parent);
        this.f37844c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(C5275R.id.action_bar);
        if (findViewById instanceof InterfaceC4692i0) {
            wrapper = (InterfaceC4692i0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f37846e = wrapper;
        this.f37847f = (ActionBarContextView) view.findViewById(C5275R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C5275R.id.action_bar_container);
        this.f37845d = actionBarContainer;
        InterfaceC4692i0 interfaceC4692i0 = this.f37846e;
        if (interfaceC4692i0 == null || this.f37847f == null || actionBarContainer == null) {
            throw new IllegalStateException(L.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((X0) interfaceC4692i0).f39081a.getContext();
        this.f37842a = context;
        if ((((X0) this.f37846e).f39082b & 4) != 0) {
            this.f37849h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        p();
        v(context.getResources().getBoolean(C5275R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f37842a.obtainStyledAttributes(null, AbstractC4518a.f37588a, C5275R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f37844c;
            if (!actionBarOverlayLayout2.f4558z) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f37861u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f37845d;
            WeakHashMap weakHashMap = X.f2054a;
            O.L.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void v(boolean z3) {
        if (z3) {
            this.f37845d.setTabContainer(null);
            ((X0) this.f37846e).getClass();
        } else {
            ((X0) this.f37846e).getClass();
            this.f37845d.setTabContainer(null);
        }
        this.f37846e.getClass();
        ((X0) this.f37846e).f39081a.setCollapsible(false);
        this.f37844c.setHasNonEmbeddedTabs(false);
    }

    public final void w(boolean z3) {
        boolean z6 = this.f37857q || !this.f37856p;
        View view = this.f37848g;
        final F1.a aVar = this.f37864x;
        if (!z6) {
            if (this.f37858r) {
                this.f37858r = false;
                C4624k c4624k = this.f37859s;
                if (c4624k != null) {
                    c4624k.a();
                }
                int i = this.f37854n;
                J j6 = this.f37862v;
                if (i != 0 || (!this.f37860t && !z3)) {
                    j6.c();
                    return;
                }
                this.f37845d.setAlpha(1.0f);
                this.f37845d.setTransitioning(true);
                C4624k c4624k2 = new C4624k();
                float f3 = -this.f37845d.getHeight();
                if (z3) {
                    this.f37845d.getLocationInWindow(new int[]{0, 0});
                    f3 -= r12[1];
                }
                C0330e0 a9 = X.a(this.f37845d);
                a9.e(f3);
                final View view2 = (View) a9.f2073a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(aVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: O.d0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((h.L) F1.a.this.f903u).f37845d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z9 = c4624k2.f38548e;
                ArrayList arrayList = c4624k2.f38544a;
                if (!z9) {
                    arrayList.add(a9);
                }
                if (this.f37855o && view != null) {
                    C0330e0 a10 = X.a(view);
                    a10.e(f3);
                    if (!c4624k2.f38548e) {
                        arrayList.add(a10);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f37840y;
                boolean z10 = c4624k2.f38548e;
                if (!z10) {
                    c4624k2.f38546c = accelerateInterpolator;
                }
                if (!z10) {
                    c4624k2.f38545b = 250L;
                }
                if (!z10) {
                    c4624k2.f38547d = j6;
                }
                this.f37859s = c4624k2;
                c4624k2.b();
                return;
            }
            return;
        }
        if (this.f37858r) {
            return;
        }
        this.f37858r = true;
        C4624k c4624k3 = this.f37859s;
        if (c4624k3 != null) {
            c4624k3.a();
        }
        this.f37845d.setVisibility(0);
        int i6 = this.f37854n;
        J j9 = this.f37863w;
        if (i6 == 0 && (this.f37860t || z3)) {
            this.f37845d.setTranslationY(0.0f);
            float f9 = -this.f37845d.getHeight();
            if (z3) {
                this.f37845d.getLocationInWindow(new int[]{0, 0});
                f9 -= r12[1];
            }
            this.f37845d.setTranslationY(f9);
            C4624k c4624k4 = new C4624k();
            C0330e0 a11 = X.a(this.f37845d);
            a11.e(0.0f);
            final View view3 = (View) a11.f2073a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(aVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: O.d0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((h.L) F1.a.this.f903u).f37845d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z11 = c4624k4.f38548e;
            ArrayList arrayList2 = c4624k4.f38544a;
            if (!z11) {
                arrayList2.add(a11);
            }
            if (this.f37855o && view != null) {
                view.setTranslationY(f9);
                C0330e0 a12 = X.a(view);
                a12.e(0.0f);
                if (!c4624k4.f38548e) {
                    arrayList2.add(a12);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f37841z;
            boolean z12 = c4624k4.f38548e;
            if (!z12) {
                c4624k4.f38546c = decelerateInterpolator;
            }
            if (!z12) {
                c4624k4.f38545b = 250L;
            }
            if (!z12) {
                c4624k4.f38547d = j9;
            }
            this.f37859s = c4624k4;
            c4624k4.b();
        } else {
            this.f37845d.setAlpha(1.0f);
            this.f37845d.setTranslationY(0.0f);
            if (this.f37855o && view != null) {
                view.setTranslationY(0.0f);
            }
            j9.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f37844c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = X.f2054a;
            O.J.c(actionBarOverlayLayout);
        }
    }

    public L(Dialog dialog) {
        new ArrayList();
        this.f37853m = new ArrayList();
        this.f37854n = 0;
        this.f37855o = true;
        this.f37858r = true;
        this.f37862v = new J(this, 0);
        this.f37863w = new J(this, 1);
        this.f37864x = new F1.a(20, this);
        u(dialog.getWindow().getDecorView());
    }
}
