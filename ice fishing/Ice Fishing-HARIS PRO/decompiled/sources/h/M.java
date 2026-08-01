package h;

import O.AbstractC0049z;
import O.N;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import g.AbstractC0155a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.C0185i;
import m.InterfaceC0248d;
import m.InterfaceC0263k0;
import m.c1;

/* loaded from: classes.dex */
public final class M extends R.j implements InterfaceC0248d {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f3154y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f3155z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f3156a;

    /* renamed from: b, reason: collision with root package name */
    public Context f3157b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f3158c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f3159d;
    public InterfaceC0263k0 e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f3160f;

    /* renamed from: g, reason: collision with root package name */
    public final View f3161g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3162h;
    public L i;
    public L j;

    /* renamed from: k, reason: collision with root package name */
    public F.i f3163k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3164l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f3165m;

    /* renamed from: n, reason: collision with root package name */
    public int f3166n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3167o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3168p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3169q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3170r;

    /* renamed from: s, reason: collision with root package name */
    public k.j f3171s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3172t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3173u;

    /* renamed from: v, reason: collision with root package name */
    public final K f3174v;

    /* renamed from: w, reason: collision with root package name */
    public final K f3175w;

    /* renamed from: x, reason: collision with root package name */
    public final B.b f3176x;

    public M(Activity activity, boolean z2) {
        new ArrayList();
        this.f3165m = new ArrayList();
        this.f3166n = 0;
        this.f3167o = true;
        this.f3170r = true;
        this.f3174v = new K(this, 0);
        this.f3175w = new K(this, 1);
        this.f3176x = new B.b(22, this);
        View decorView = activity.getWindow().getDecorView();
        x0(decorView);
        if (z2) {
            return;
        }
        this.f3161g = decorView.findViewById(R.id.content);
    }

    public final void A0(boolean z2) {
        boolean z3 = this.f3169q || !this.f3168p;
        View view = this.f3161g;
        B.b bVar = this.f3176x;
        if (!z3) {
            if (this.f3170r) {
                this.f3170r = false;
                k.j jVar = this.f3171s;
                if (jVar != null) {
                    jVar.a();
                }
                int i = this.f3166n;
                K k2 = this.f3174v;
                if (i != 0 || (!this.f3172t && !z2)) {
                    k2.a();
                    return;
                }
                this.f3159d.setAlpha(1.0f);
                this.f3159d.setTransitioning(true);
                k.j jVar2 = new k.j();
                float f2 = -this.f3159d.getHeight();
                if (z2) {
                    this.f3159d.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                N a2 = O.K.a(this.f3159d);
                a2.e(f2);
                View view2 = (View) a2.f756a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(bVar != null ? new D0.b(bVar, view2) : null);
                }
                boolean z4 = jVar2.e;
                ArrayList arrayList = jVar2.f3362a;
                if (!z4) {
                    arrayList.add(a2);
                }
                if (this.f3167o && view != null) {
                    N a3 = O.K.a(view);
                    a3.e(f2);
                    if (!jVar2.e) {
                        arrayList.add(a3);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f3154y;
                boolean z5 = jVar2.e;
                if (!z5) {
                    jVar2.f3364c = accelerateInterpolator;
                }
                if (!z5) {
                    jVar2.f3363b = 250L;
                }
                if (!z5) {
                    jVar2.f3365d = k2;
                }
                this.f3171s = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f3170r) {
            return;
        }
        this.f3170r = true;
        k.j jVar3 = this.f3171s;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f3159d.setVisibility(0);
        int i2 = this.f3166n;
        K k3 = this.f3175w;
        if (i2 == 0 && (this.f3172t || z2)) {
            this.f3159d.setTranslationY(RecyclerView.f2111C0);
            float f3 = -this.f3159d.getHeight();
            if (z2) {
                this.f3159d.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.f3159d.setTranslationY(f3);
            k.j jVar4 = new k.j();
            N a4 = O.K.a(this.f3159d);
            a4.e(RecyclerView.f2111C0);
            View view3 = (View) a4.f756a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(bVar != null ? new D0.b(bVar, view3) : null);
            }
            boolean z6 = jVar4.e;
            ArrayList arrayList2 = jVar4.f3362a;
            if (!z6) {
                arrayList2.add(a4);
            }
            if (this.f3167o && view != null) {
                view.setTranslationY(f3);
                N a5 = O.K.a(view);
                a5.e(RecyclerView.f2111C0);
                if (!jVar4.e) {
                    arrayList2.add(a5);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f3155z;
            boolean z7 = jVar4.e;
            if (!z7) {
                jVar4.f3364c = decelerateInterpolator;
            }
            if (!z7) {
                jVar4.f3363b = 250L;
            }
            if (!z7) {
                jVar4.f3365d = k3;
            }
            this.f3171s = jVar4;
            jVar4.b();
        } else {
            this.f3159d.setAlpha(1.0f);
            this.f3159d.setTranslationY(RecyclerView.f2111C0);
            if (this.f3167o && view != null) {
                view.setTranslationY(RecyclerView.f2111C0);
            }
            k3.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3158c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = O.K.f747a;
            AbstractC0049z.c(actionBarOverlayLayout);
        }
    }

    public final void v0(boolean z2) {
        N i;
        N n2;
        if (z2) {
            if (!this.f3169q) {
                this.f3169q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3158c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                A0(false);
            }
        } else if (this.f3169q) {
            this.f3169q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3158c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            A0(false);
        }
        if (!this.f3159d.isLaidOut()) {
            if (z2) {
                ((c1) this.e).f3923a.setVisibility(4);
                this.f3160f.setVisibility(0);
                return;
            } else {
                ((c1) this.e).f3923a.setVisibility(0);
                this.f3160f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            c1 c1Var = (c1) this.e;
            i = O.K.a(c1Var.f3923a);
            i.a(RecyclerView.f2111C0);
            i.c(100L);
            i.d(new C0185i(c1Var, 4));
            n2 = this.f3160f.i(0, 200L);
        } else {
            c1 c1Var2 = (c1) this.e;
            N a2 = O.K.a(c1Var2.f3923a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new C0185i(c1Var2, 0));
            i = this.f3160f.i(8, 100L);
            n2 = a2;
        }
        k.j jVar = new k.j();
        ArrayList arrayList = jVar.f3362a;
        arrayList.add(i);
        View view = (View) i.f756a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) n2.f756a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(n2);
        jVar.b();
    }

    public final Context w0() {
        if (this.f3157b == null) {
            TypedValue typedValue = new TypedValue();
            this.f3156a.getTheme().resolveAttribute(com.lumenpath.harispro.hrnavigator.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f3157b = new ContextThemeWrapper(this.f3156a, i);
            } else {
                this.f3157b = this.f3156a;
            }
        }
        return this.f3157b;
    }

    public final void x0(View view) {
        InterfaceC0263k0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.lumenpath.harispro.hrnavigator.R.id.decor_content_parent);
        this.f3158c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.lumenpath.harispro.hrnavigator.R.id.action_bar);
        if (findViewById instanceof InterfaceC0263k0) {
            wrapper = (InterfaceC0263k0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.e = wrapper;
        this.f3160f = (ActionBarContextView) view.findViewById(com.lumenpath.harispro.hrnavigator.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.lumenpath.harispro.hrnavigator.R.id.action_bar_container);
        this.f3159d = actionBarContainer;
        InterfaceC0263k0 interfaceC0263k0 = this.e;
        if (interfaceC0263k0 == null || this.f3160f == null || actionBarContainer == null) {
            throw new IllegalStateException(M.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((c1) interfaceC0263k0).f3923a.getContext();
        this.f3156a = context;
        if ((((c1) this.e).f3924b & 4) != 0) {
            this.f3162h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        z0(context.getResources().getBoolean(com.lumenpath.harispro.hrnavigator.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f3156a.obtainStyledAttributes(null, AbstractC0155a.f3034a, com.lumenpath.harispro.hrnavigator.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3158c;
            if (!actionBarOverlayLayout2.f1804g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f3173u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f3159d;
            WeakHashMap weakHashMap = O.K.f747a;
            O.B.k(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void y0(boolean z2) {
        if (this.f3162h) {
            return;
        }
        int i = z2 ? 4 : 0;
        c1 c1Var = (c1) this.e;
        int i2 = c1Var.f3924b;
        this.f3162h = true;
        c1Var.a((i & 4) | (i2 & (-5)));
    }

    public final void z0(boolean z2) {
        if (z2) {
            this.f3159d.setTabContainer(null);
            ((c1) this.e).getClass();
        } else {
            ((c1) this.e).getClass();
            this.f3159d.setTabContainer(null);
        }
        this.e.getClass();
        ((c1) this.e).f3923a.setCollapsible(false);
        this.f3158c.setHasNonEmbeddedTabs(false);
    }

    public M(Dialog dialog) {
        new ArrayList();
        this.f3165m = new ArrayList();
        this.f3166n = 0;
        this.f3167o = true;
        this.f3170r = true;
        this.f3174v = new K(this, 0);
        this.f3175w = new K(this, 1);
        this.f3176x = new B.b(22, this);
        x0(dialog.getWindow().getDecorView());
    }
}
