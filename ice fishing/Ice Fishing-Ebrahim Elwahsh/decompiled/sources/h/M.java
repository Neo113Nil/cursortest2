package h;

import O.C0343e0;
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
import com.icefishing.icefishingliveapp.C5284R;
import g.AbstractC4518a;
import g1.C4523c;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.AbstractC4614b;
import k.C4622j;
import k.C4623k;
import k.InterfaceC4613a;
import m.InterfaceC4729d;
import m.InterfaceC4740i0;
import m.T0;
import m.Y0;

/* loaded from: classes.dex */
public final class M extends AbstractC4542a implements InterfaceC4729d {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f38053y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f38054z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f38055a;

    /* renamed from: b, reason: collision with root package name */
    public Context f38056b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f38057c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f38058d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC4740i0 f38059e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f38060f;

    /* renamed from: g, reason: collision with root package name */
    public final View f38061g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f38062h;
    public L i;

    /* renamed from: j, reason: collision with root package name */
    public L f38063j;

    /* renamed from: k, reason: collision with root package name */
    public S0.l f38064k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f38065l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f38066m;

    /* renamed from: n, reason: collision with root package name */
    public int f38067n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f38068o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f38069p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f38070q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f38071r;

    /* renamed from: s, reason: collision with root package name */
    public C4623k f38072s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f38073t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f38074u;

    /* renamed from: v, reason: collision with root package name */
    public final K f38075v;

    /* renamed from: w, reason: collision with root package name */
    public final K f38076w;

    /* renamed from: x, reason: collision with root package name */
    public final C4523c f38077x;

    public M(Activity activity, boolean z8) {
        new ArrayList();
        this.f38066m = new ArrayList();
        this.f38067n = 0;
        this.f38068o = true;
        this.f38071r = true;
        this.f38075v = new K(this, 0);
        this.f38076w = new K(this, 1);
        this.f38077x = new C4523c(22, this);
        View decorView = activity.getWindow().getDecorView();
        u(decorView);
        if (z8) {
            return;
        }
        this.f38061g = decorView.findViewById(R.id.content);
    }

    @Override // h.AbstractC4542a
    public final boolean b() {
        T0 t02;
        InterfaceC4740i0 interfaceC4740i0 = this.f38059e;
        if (interfaceC4740i0 == null || (t02 = ((Y0) interfaceC4740i0).f39353a.f4735v0) == null || t02.f39331u == null) {
            return false;
        }
        T0 t03 = ((Y0) interfaceC4740i0).f39353a.f4735v0;
        l.n nVar = t03 == null ? null : t03.f39331u;
        if (nVar == null) {
            return true;
        }
        nVar.collapseActionView();
        return true;
    }

    @Override // h.AbstractC4542a
    public final void c(boolean z8) {
        if (z8 == this.f38065l) {
            return;
        }
        this.f38065l = z8;
        ArrayList arrayList = this.f38066m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // h.AbstractC4542a
    public final int d() {
        return ((Y0) this.f38059e).f39354b;
    }

    @Override // h.AbstractC4542a
    public final Context e() {
        if (this.f38056b == null) {
            TypedValue typedValue = new TypedValue();
            this.f38055a.getTheme().resolveAttribute(C5284R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f38056b = new ContextThemeWrapper(this.f38055a, i);
            } else {
                this.f38056b = this.f38055a;
            }
        }
        return this.f38056b;
    }

    @Override // h.AbstractC4542a
    public final void g() {
        v(this.f38055a.getResources().getBoolean(C5284R.bool.abc_action_bar_embed_tabs));
    }

    @Override // h.AbstractC4542a
    public final boolean i(int i, KeyEvent keyEvent) {
        l.l lVar;
        L l9 = this.i;
        if (l9 == null || (lVar = l9.f38049w) == null) {
            return false;
        }
        lVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return lVar.performShortcut(i, keyEvent, 0);
    }

    @Override // h.AbstractC4542a
    public final void l(boolean z8) {
        if (this.f38062h) {
            return;
        }
        m(z8);
    }

    @Override // h.AbstractC4542a
    public final void m(boolean z8) {
        int i = z8 ? 4 : 0;
        Y0 y02 = (Y0) this.f38059e;
        int i4 = y02.f39354b;
        this.f38062h = true;
        y02.a((i & 4) | (i4 & (-5)));
    }

    @Override // h.AbstractC4542a
    public final void n(int i) {
        ((Y0) this.f38059e).b(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.graphics.drawable.Drawable] */
    @Override // h.AbstractC4542a
    public final void o(j.a aVar) {
        Y0 y02 = (Y0) this.f38059e;
        y02.f39358f = aVar;
        int i = y02.f39354b & 4;
        Toolbar toolbar = y02.f39353a;
        j.a aVar2 = aVar;
        if (i == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (aVar == null) {
            aVar2 = y02.f39366o;
        }
        toolbar.setNavigationIcon(aVar2);
    }

    @Override // h.AbstractC4542a
    public final void p() {
        this.f38059e.getClass();
    }

    @Override // h.AbstractC4542a
    public final void q(boolean z8) {
        C4623k c4623k;
        this.f38073t = z8;
        if (z8 || (c4623k = this.f38072s) == null) {
            return;
        }
        c4623k.a();
    }

    @Override // h.AbstractC4542a
    public final void r(CharSequence charSequence) {
        Y0 y02 = (Y0) this.f38059e;
        if (y02.f39359g) {
            return;
        }
        y02.f39360h = charSequence;
        if ((y02.f39354b & 8) != 0) {
            Toolbar toolbar = y02.f39353a;
            toolbar.setTitle(charSequence);
            if (y02.f39359g) {
                X.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // h.AbstractC4542a
    public final AbstractC4614b s(S0.l lVar) {
        L l9 = this.i;
        if (l9 != null) {
            l9.a();
        }
        this.f38057c.setHideOnContentScrollEnabled(false);
        this.f38060f.e();
        L l10 = new L(this, this.f38060f.getContext(), lVar);
        l.l lVar2 = l10.f38049w;
        lVar2.w();
        try {
            if (!((InterfaceC4613a) l10.f38050x.f2910u).e(l10, lVar2)) {
                return null;
            }
            this.i = l10;
            l10.g();
            this.f38060f.c(l10);
            t(true);
            return l10;
        } finally {
            lVar2.v();
        }
    }

    public final void t(boolean z8) {
        C0343e0 i;
        C0343e0 c0343e0;
        if (z8) {
            if (!this.f38070q) {
                this.f38070q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f38057c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                w(false);
            }
        } else if (this.f38070q) {
            this.f38070q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f38057c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            w(false);
        }
        if (!this.f38058d.isLaidOut()) {
            if (z8) {
                ((Y0) this.f38059e).f39353a.setVisibility(4);
                this.f38060f.setVisibility(0);
                return;
            } else {
                ((Y0) this.f38059e).f39353a.setVisibility(0);
                this.f38060f.setVisibility(8);
                return;
            }
        }
        if (z8) {
            Y0 y02 = (Y0) this.f38059e;
            i = X.a(y02.f39353a);
            i.a(0.0f);
            i.c(100L);
            i.d(new C4622j(y02, 4));
            c0343e0 = this.f38060f.i(0, 200L);
        } else {
            Y0 y03 = (Y0) this.f38059e;
            C0343e0 a9 = X.a(y03.f39353a);
            a9.a(1.0f);
            a9.c(200L);
            a9.d(new C4622j(y03, 0));
            i = this.f38060f.i(8, 100L);
            c0343e0 = a9;
        }
        C4623k c4623k = new C4623k();
        ArrayList arrayList = c4623k.f38664a;
        arrayList.add(i);
        View view = (View) i.f2259a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0343e0.f2259a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0343e0);
        c4623k.b();
    }

    public final void u(View view) {
        InterfaceC4740i0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C5284R.id.decor_content_parent);
        this.f38057c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(C5284R.id.action_bar);
        if (findViewById instanceof InterfaceC4740i0) {
            wrapper = (InterfaceC4740i0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f38059e = wrapper;
        this.f38060f = (ActionBarContextView) view.findViewById(C5284R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C5284R.id.action_bar_container);
        this.f38058d = actionBarContainer;
        InterfaceC4740i0 interfaceC4740i0 = this.f38059e;
        if (interfaceC4740i0 == null || this.f38060f == null || actionBarContainer == null) {
            throw new IllegalStateException(M.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((Y0) interfaceC4740i0).f39353a.getContext();
        this.f38055a = context;
        if ((((Y0) this.f38059e).f39354b & 4) != 0) {
            this.f38062h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        p();
        v(context.getResources().getBoolean(C5284R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f38055a.obtainStyledAttributes(null, AbstractC4518a.f37818a, C5284R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f38057c;
            if (!actionBarOverlayLayout2.f4673z) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f38074u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f38058d;
            WeakHashMap weakHashMap = X.f2240a;
            O.L.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void v(boolean z8) {
        if (z8) {
            this.f38058d.setTabContainer(null);
            ((Y0) this.f38059e).getClass();
        } else {
            ((Y0) this.f38059e).getClass();
            this.f38058d.setTabContainer(null);
        }
        this.f38059e.getClass();
        ((Y0) this.f38059e).f39353a.setCollapsible(false);
        this.f38057c.setHasNonEmbeddedTabs(false);
    }

    public final void w(boolean z8) {
        boolean z9 = this.f38070q || !this.f38069p;
        View view = this.f38061g;
        final C4523c c4523c = this.f38077x;
        if (!z9) {
            if (this.f38071r) {
                this.f38071r = false;
                C4623k c4623k = this.f38072s;
                if (c4623k != null) {
                    c4623k.a();
                }
                int i = this.f38067n;
                K k6 = this.f38075v;
                if (i != 0 || (!this.f38073t && !z8)) {
                    k6.c();
                    return;
                }
                this.f38058d.setAlpha(1.0f);
                this.f38058d.setTransitioning(true);
                C4623k c4623k2 = new C4623k();
                float f6 = -this.f38058d.getHeight();
                if (z8) {
                    this.f38058d.getLocationInWindow(new int[]{0, 0});
                    f6 -= r12[1];
                }
                C0343e0 a9 = X.a(this.f38058d);
                a9.e(f6);
                final View view2 = (View) a9.f2259a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c4523c != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: O.d0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((h.M) C4523c.this.f37856u).f38058d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z10 = c4623k2.f38668e;
                ArrayList arrayList = c4623k2.f38664a;
                if (!z10) {
                    arrayList.add(a9);
                }
                if (this.f38068o && view != null) {
                    C0343e0 a10 = X.a(view);
                    a10.e(f6);
                    if (!c4623k2.f38668e) {
                        arrayList.add(a10);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f38053y;
                boolean z11 = c4623k2.f38668e;
                if (!z11) {
                    c4623k2.f38666c = accelerateInterpolator;
                }
                if (!z11) {
                    c4623k2.f38665b = 250L;
                }
                if (!z11) {
                    c4623k2.f38667d = k6;
                }
                this.f38072s = c4623k2;
                c4623k2.b();
                return;
            }
            return;
        }
        if (this.f38071r) {
            return;
        }
        this.f38071r = true;
        C4623k c4623k3 = this.f38072s;
        if (c4623k3 != null) {
            c4623k3.a();
        }
        this.f38058d.setVisibility(0);
        int i4 = this.f38067n;
        K k9 = this.f38076w;
        if (i4 == 0 && (this.f38073t || z8)) {
            this.f38058d.setTranslationY(0.0f);
            float f9 = -this.f38058d.getHeight();
            if (z8) {
                this.f38058d.getLocationInWindow(new int[]{0, 0});
                f9 -= r12[1];
            }
            this.f38058d.setTranslationY(f9);
            C4623k c4623k4 = new C4623k();
            C0343e0 a11 = X.a(this.f38058d);
            a11.e(0.0f);
            final View view3 = (View) a11.f2259a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c4523c != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: O.d0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((h.M) C4523c.this.f37856u).f38058d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z12 = c4623k4.f38668e;
            ArrayList arrayList2 = c4623k4.f38664a;
            if (!z12) {
                arrayList2.add(a11);
            }
            if (this.f38068o && view != null) {
                view.setTranslationY(f9);
                C0343e0 a12 = X.a(view);
                a12.e(0.0f);
                if (!c4623k4.f38668e) {
                    arrayList2.add(a12);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f38054z;
            boolean z13 = c4623k4.f38668e;
            if (!z13) {
                c4623k4.f38666c = decelerateInterpolator;
            }
            if (!z13) {
                c4623k4.f38665b = 250L;
            }
            if (!z13) {
                c4623k4.f38667d = k9;
            }
            this.f38072s = c4623k4;
            c4623k4.b();
        } else {
            this.f38058d.setAlpha(1.0f);
            this.f38058d.setTranslationY(0.0f);
            if (this.f38068o && view != null) {
                view.setTranslationY(0.0f);
            }
            k9.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38057c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = X.f2240a;
            O.J.c(actionBarOverlayLayout);
        }
    }

    public M(Dialog dialog) {
        new ArrayList();
        this.f38066m = new ArrayList();
        this.f38067n = 0;
        this.f38068o = true;
        this.f38071r = true;
        this.f38075v = new K(this, 0);
        this.f38076w = new K(this, 1);
        this.f38077x = new C4523c(22, this);
        u(dialog.getWindow().getDecorView());
    }
}
