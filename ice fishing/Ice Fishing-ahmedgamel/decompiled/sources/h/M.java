package h;

import O.C0335e0;
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
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.gms.internal.ads.LP;
import g.AbstractC4528a;
import i1.C4586c;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.AbstractC4625b;
import k.C4633j;
import k.C4634k;
import k.InterfaceC4624a;
import m.InterfaceC4694d;
import m.InterfaceC4705i0;
import m.T0;
import m.Y0;

/* loaded from: classes.dex */
public final class M extends AbstractC4545a implements InterfaceC4694d {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f37866y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f37867z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f37868a;

    /* renamed from: b, reason: collision with root package name */
    public Context f37869b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f37870c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f37871d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC4705i0 f37872e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f37873f;

    /* renamed from: g, reason: collision with root package name */
    public final View f37874g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f37875h;
    public L i;

    /* renamed from: j, reason: collision with root package name */
    public L f37876j;

    /* renamed from: k, reason: collision with root package name */
    public LP f37877k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f37878l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f37879m;

    /* renamed from: n, reason: collision with root package name */
    public int f37880n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f37881o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f37882p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f37883q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f37884r;

    /* renamed from: s, reason: collision with root package name */
    public C4634k f37885s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f37886t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f37887u;

    /* renamed from: v, reason: collision with root package name */
    public final K f37888v;

    /* renamed from: w, reason: collision with root package name */
    public final K f37889w;

    /* renamed from: x, reason: collision with root package name */
    public final C4586c f37890x;

    public M(Activity activity, boolean z6) {
        new ArrayList();
        this.f37879m = new ArrayList();
        this.f37880n = 0;
        this.f37881o = true;
        this.f37884r = true;
        this.f37888v = new K(this, 0);
        this.f37889w = new K(this, 1);
        this.f37890x = new C4586c(23, this);
        View decorView = activity.getWindow().getDecorView();
        u(decorView);
        if (z6) {
            return;
        }
        this.f37874g = decorView.findViewById(R.id.content);
    }

    @Override // h.AbstractC4545a
    public final boolean b() {
        T0 t02;
        InterfaceC4705i0 interfaceC4705i0 = this.f37872e;
        if (interfaceC4705i0 == null || (t02 = ((Y0) interfaceC4705i0).f39151a.f4583q0) == null || t02.f39129u == null) {
            return false;
        }
        T0 t03 = ((Y0) interfaceC4705i0).f39151a.f4583q0;
        l.o oVar = t03 == null ? null : t03.f39129u;
        if (oVar == null) {
            return true;
        }
        oVar.collapseActionView();
        return true;
    }

    @Override // h.AbstractC4545a
    public final void c(boolean z6) {
        if (z6 == this.f37878l) {
            return;
        }
        this.f37878l = z6;
        ArrayList arrayList = this.f37879m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // h.AbstractC4545a
    public final int d() {
        return ((Y0) this.f37872e).f39152b;
    }

    @Override // h.AbstractC4545a
    public final Context e() {
        if (this.f37869b == null) {
            TypedValue typedValue = new TypedValue();
            this.f37868a.getTheme().resolveAttribute(C5248R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f37869b = new ContextThemeWrapper(this.f37868a, i);
            } else {
                this.f37869b = this.f37868a;
            }
        }
        return this.f37869b;
    }

    @Override // h.AbstractC4545a
    public final void g() {
        v(this.f37868a.getResources().getBoolean(C5248R.bool.abc_action_bar_embed_tabs));
    }

    @Override // h.AbstractC4545a
    public final boolean i(int i, KeyEvent keyEvent) {
        l.m mVar;
        L l9 = this.i;
        if (l9 == null || (mVar = l9.f37862w) == null) {
            return false;
        }
        mVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return mVar.performShortcut(i, keyEvent, 0);
    }

    @Override // h.AbstractC4545a
    public final void l(boolean z6) {
        if (this.f37875h) {
            return;
        }
        m(z6);
    }

    @Override // h.AbstractC4545a
    public final void m(boolean z6) {
        int i = z6 ? 4 : 0;
        Y0 y02 = (Y0) this.f37872e;
        int i4 = y02.f39152b;
        this.f37875h = true;
        y02.a((i & 4) | (i4 & (-5)));
    }

    @Override // h.AbstractC4545a
    public final void n(int i) {
        ((Y0) this.f37872e).b(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.graphics.drawable.Drawable] */
    @Override // h.AbstractC4545a
    public final void o(j.a aVar) {
        Y0 y02 = (Y0) this.f37872e;
        y02.f39156f = aVar;
        int i = y02.f39152b & 4;
        Toolbar toolbar = y02.f39151a;
        j.a aVar2 = aVar;
        if (i == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (aVar == null) {
            aVar2 = y02.f39164o;
        }
        toolbar.setNavigationIcon(aVar2);
    }

    @Override // h.AbstractC4545a
    public final void p() {
        this.f37872e.getClass();
    }

    @Override // h.AbstractC4545a
    public final void q(boolean z6) {
        C4634k c4634k;
        this.f37886t = z6;
        if (z6 || (c4634k = this.f37885s) == null) {
            return;
        }
        c4634k.a();
    }

    @Override // h.AbstractC4545a
    public final void r(CharSequence charSequence) {
        Y0 y02 = (Y0) this.f37872e;
        if (y02.f39157g) {
            return;
        }
        y02.f39158h = charSequence;
        if ((y02.f39152b & 8) != 0) {
            Toolbar toolbar = y02.f39151a;
            toolbar.setTitle(charSequence);
            if (y02.f39157g) {
                X.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // h.AbstractC4545a
    public final AbstractC4625b s(LP lp) {
        L l9 = this.i;
        if (l9 != null) {
            l9.a();
        }
        this.f37870c.setHideOnContentScrollEnabled(false);
        this.f37873f.e();
        L l10 = new L(this, this.f37873f.getContext(), lp);
        l.m mVar = l10.f37862w;
        mVar.w();
        try {
            if (!((InterfaceC4624a) l10.f37863x.f26916u).f(l10, mVar)) {
                return null;
            }
            this.i = l10;
            l10.g();
            this.f37873f.c(l10);
            t(true);
            return l10;
        } finally {
            mVar.v();
        }
    }

    public final void t(boolean z6) {
        C0335e0 i;
        C0335e0 c0335e0;
        if (z6) {
            if (!this.f37883q) {
                this.f37883q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f37870c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                w(false);
            }
        } else if (this.f37883q) {
            this.f37883q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f37870c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            w(false);
        }
        if (!this.f37871d.isLaidOut()) {
            if (z6) {
                ((Y0) this.f37872e).f39151a.setVisibility(4);
                this.f37873f.setVisibility(0);
                return;
            } else {
                ((Y0) this.f37872e).f39151a.setVisibility(0);
                this.f37873f.setVisibility(8);
                return;
            }
        }
        if (z6) {
            Y0 y02 = (Y0) this.f37872e;
            i = X.a(y02.f39151a);
            i.a(0.0f);
            i.c(100L);
            i.d(new C4633j(y02, 4));
            c0335e0 = this.f37873f.i(0, 200L);
        } else {
            Y0 y03 = (Y0) this.f37872e;
            C0335e0 a9 = X.a(y03.f39151a);
            a9.a(1.0f);
            a9.c(200L);
            a9.d(new C4633j(y03, 0));
            i = this.f37873f.i(8, 100L);
            c0335e0 = a9;
        }
        C4634k c4634k = new C4634k();
        ArrayList arrayList = c4634k.f38556a;
        arrayList.add(i);
        View view = (View) i.f2161a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0335e0.f2161a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0335e0);
        c4634k.b();
    }

    public final void u(View view) {
        InterfaceC4705i0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C5248R.id.decor_content_parent);
        this.f37870c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(C5248R.id.action_bar);
        if (findViewById instanceof InterfaceC4705i0) {
            wrapper = (InterfaceC4705i0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f37872e = wrapper;
        this.f37873f = (ActionBarContextView) view.findViewById(C5248R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C5248R.id.action_bar_container);
        this.f37871d = actionBarContainer;
        InterfaceC4705i0 interfaceC4705i0 = this.f37872e;
        if (interfaceC4705i0 == null || this.f37873f == null || actionBarContainer == null) {
            throw new IllegalStateException(M.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((Y0) interfaceC4705i0).f39151a.getContext();
        this.f37868a = context;
        if ((((Y0) this.f37872e).f39152b & 4) != 0) {
            this.f37875h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        p();
        v(context.getResources().getBoolean(C5248R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f37868a.obtainStyledAttributes(null, AbstractC4528a.f37550a, C5248R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f37870c;
            if (!actionBarOverlayLayout2.f4526z) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f37887u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f37871d;
            WeakHashMap weakHashMap = X.f2142a;
            O.L.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void v(boolean z6) {
        if (z6) {
            this.f37871d.setTabContainer(null);
            ((Y0) this.f37872e).getClass();
        } else {
            ((Y0) this.f37872e).getClass();
            this.f37871d.setTabContainer(null);
        }
        this.f37872e.getClass();
        ((Y0) this.f37872e).f39151a.setCollapsible(false);
        this.f37870c.setHasNonEmbeddedTabs(false);
    }

    public final void w(boolean z6) {
        boolean z9 = this.f37883q || !this.f37882p;
        View view = this.f37874g;
        final C4586c c4586c = this.f37890x;
        if (!z9) {
            if (this.f37884r) {
                this.f37884r = false;
                C4634k c4634k = this.f37885s;
                if (c4634k != null) {
                    c4634k.a();
                }
                int i = this.f37880n;
                K k9 = this.f37888v;
                if (i != 0 || (!this.f37886t && !z6)) {
                    k9.c();
                    return;
                }
                this.f37871d.setAlpha(1.0f);
                this.f37871d.setTransitioning(true);
                C4634k c4634k2 = new C4634k();
                float f2 = -this.f37871d.getHeight();
                if (z6) {
                    this.f37871d.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                C0335e0 a9 = X.a(this.f37871d);
                a9.e(f2);
                final View view2 = (View) a9.f2161a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c4586c != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: O.d0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((h.M) C4586c.this.f38154u).f37871d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z10 = c4634k2.f38560e;
                ArrayList arrayList = c4634k2.f38556a;
                if (!z10) {
                    arrayList.add(a9);
                }
                if (this.f37881o && view != null) {
                    C0335e0 a10 = X.a(view);
                    a10.e(f2);
                    if (!c4634k2.f38560e) {
                        arrayList.add(a10);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f37866y;
                boolean z11 = c4634k2.f38560e;
                if (!z11) {
                    c4634k2.f38558c = accelerateInterpolator;
                }
                if (!z11) {
                    c4634k2.f38557b = 250L;
                }
                if (!z11) {
                    c4634k2.f38559d = k9;
                }
                this.f37885s = c4634k2;
                c4634k2.b();
                return;
            }
            return;
        }
        if (this.f37884r) {
            return;
        }
        this.f37884r = true;
        C4634k c4634k3 = this.f37885s;
        if (c4634k3 != null) {
            c4634k3.a();
        }
        this.f37871d.setVisibility(0);
        int i4 = this.f37880n;
        K k10 = this.f37889w;
        if (i4 == 0 && (this.f37886t || z6)) {
            this.f37871d.setTranslationY(0.0f);
            float f9 = -this.f37871d.getHeight();
            if (z6) {
                this.f37871d.getLocationInWindow(new int[]{0, 0});
                f9 -= r12[1];
            }
            this.f37871d.setTranslationY(f9);
            C4634k c4634k4 = new C4634k();
            C0335e0 a11 = X.a(this.f37871d);
            a11.e(0.0f);
            final View view3 = (View) a11.f2161a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c4586c != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: O.d0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((h.M) C4586c.this.f38154u).f37871d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z12 = c4634k4.f38560e;
            ArrayList arrayList2 = c4634k4.f38556a;
            if (!z12) {
                arrayList2.add(a11);
            }
            if (this.f37881o && view != null) {
                view.setTranslationY(f9);
                C0335e0 a12 = X.a(view);
                a12.e(0.0f);
                if (!c4634k4.f38560e) {
                    arrayList2.add(a12);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f37867z;
            boolean z13 = c4634k4.f38560e;
            if (!z13) {
                c4634k4.f38558c = decelerateInterpolator;
            }
            if (!z13) {
                c4634k4.f38557b = 250L;
            }
            if (!z13) {
                c4634k4.f38559d = k10;
            }
            this.f37885s = c4634k4;
            c4634k4.b();
        } else {
            this.f37871d.setAlpha(1.0f);
            this.f37871d.setTranslationY(0.0f);
            if (this.f37881o && view != null) {
                view.setTranslationY(0.0f);
            }
            k10.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f37870c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = X.f2142a;
            O.J.c(actionBarOverlayLayout);
        }
    }

    public M(Dialog dialog) {
        new ArrayList();
        this.f37879m = new ArrayList();
        this.f37880n = 0;
        this.f37881o = true;
        this.f37884r = true;
        this.f37888v = new K(this, 0);
        this.f37889w = new K(this, 1);
        this.f37890x = new C4586c(23, this);
        u(dialog.getWindow().getDecorView());
    }
}
