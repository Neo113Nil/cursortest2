package defpackage;

import android.R;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.music.screen.landing.api.header.ui.view.BottomsheetCollapsingTopBar;
import com.yandex.music.screen.landing.api.skeleton.SkeletonListView;
import com.yandex.music.screen.landing.ui.view.HomeLandingBottomSheetBehavior;
import com.yandex.music.screen.landing.ui.view.HomeLandingBottomSheetLayout;
import com.yandex.music.shared.plus.features.plaque.api.PlusPlaqueContainerView;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class s2e {
    public static final /* synthetic */ s9f[] G = {new yxm(s2e.class, "rootView", "getRootView()Landroid/view/View;", 0), f1d.c(ern.a, s2e.class, "headerContentView", "getHeaderContentView()Lcom/yandex/music/screen/landing/api/header/ui/view/HeaderContentViewFrameLayout;", 0), new yxm(s2e.class, "headerBackgroundView", "getHeaderBackgroundView()Lcom/yandex/music/screen/landing/api/header/ui/view/SpecialHeaderBackgroundView;", 0), new yxm(s2e.class, "myVibeView", "getMyVibeView()Landroidx/compose/ui/platform/ComposeView;", 0), new yxm(s2e.class, "refreshLayout", "getRefreshLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", 0), new yxm(s2e.class, "landingWaveScrollView", "getLandingWaveScrollView()Landroidx/core/widget/NestedScrollView;", 0), new yxm(s2e.class, "bottomSheetLayout", "getBottomSheetLayout()Lcom/yandex/music/screen/landing/ui/view/HomeLandingBottomSheetLayout;", 0), new yxm(s2e.class, "myVibeShaderView", "getMyVibeShaderView()Lcom/yandex/music/shared/wave/shader/api/component/WaveGlShaderView;", 0), new yxm(s2e.class, "fullscreenView", "getFullscreenView()Landroid/view/View;", 0), new yxm(s2e.class, "skeletonListView", "getSkeletonListView()Lcom/yandex/music/screen/landing/api/skeleton/SkeletonListView;", 0), new yxm(s2e.class, "collapsingTopBar", "getCollapsingTopBar()Lcom/yandex/music/screen/landing/api/header/ui/view/BottomsheetCollapsingTopBar;", 0), new yxm(s2e.class, "plaqueContainer", "getPlaqueContainer()Lcom/yandex/music/shared/plus/features/plaque/api/PlusPlaqueContainerView;", 0), new opi(s2e.class, "bottomSheetState", "getBottomSheetState()I", 0)};
    public int A;
    public float B;
    public final int C;
    public boolean D;
    public final boolean E;
    public HashMap F;
    public final q13 a;
    public final q13 b;
    public final q13 c;
    public final q13 d;
    public final Context e;
    public final q13 f;
    public final q13 g;
    public final q13 h;
    public final View i;
    public final q13 j;
    public final q13 k;
    public final q13 l;
    public final q13 m;
    public final q13 n;
    public float o;
    public final HomeLandingBottomSheetBehavior p;
    public final xdr q;
    public int r;
    public final r2e s;
    public int t;
    public int u;
    public final l2e v;
    public AnimatorSet w;
    public h4b x;
    public int y;
    public int z;

    /* JADX WARN: Multi-variable type inference failed */
    public s2e(View view, Bundle bundle) {
        npq npqVar;
        int i = 4;
        view.getClass();
        this.a = new q13(new etb(view, 16));
        this.b = new q13(new etb(view, 17));
        this.c = new q13(new etb(view, 18));
        this.d = new q13(new etb(view, 19));
        Context context = view.getContext();
        context.getClass();
        this.e = context;
        int i2 = 20;
        this.f = new q13(new etb(view, i2));
        this.g = new q13(new etb(view, 21));
        this.h = new q13(new etb(view, 22));
        ViewParent parent = view.getParent();
        this.i = parent instanceof View ? (View) parent : null;
        this.j = new q13(new etb(view, 23));
        this.k = new q13(new etb(view, 24));
        this.l = new q13(new etb(view, 13));
        this.m = new q13(new etb(view, 14));
        this.n = new q13(new etb(view, 15));
        BottomSheetBehavior from = BottomSheetBehavior.from(c());
        from.getClass();
        HomeLandingBottomSheetBehavior homeLandingBottomSheetBehavior = (HomeLandingBottomSheetBehavior) from;
        this.p = homeLandingBottomSheetBehavior;
        xdr a = ydr.a(4);
        this.q = a;
        this.r = weo.M(context, R.attr.colorBackground);
        r2e r2eVar = new r2e(this);
        this.s = r2eVar;
        Context context2 = j().getContext();
        context2.getClass();
        this.t = weo.M(context2, ru.yandex.music.R.attr.bgPrimary);
        Context context3 = j().getContext();
        context3.getClass();
        TypedValue typedValue = new TypedValue();
        int i3 = 1;
        context3.getTheme().resolveAttribute(ru.yandex.music.R.attr.waveAnimationPlaceholder, typedValue, true);
        this.u = typedValue.resourceId;
        this.v = new l2e(this);
        this.C = ngg.r(context, 56);
        jyr jyrVar = o5j.e;
        this.E = tyf.v();
        d().setOnSearchClick(new j1e(this, i3));
        qdq.c(13, h());
        pv9 pv9Var = new pv9(10, this);
        e6d e6dVar = new e6d(context, new yif(pv9Var), null);
        qdq.c(13, f());
        f().setOnTouchListener(new m2e(null == true ? 1 : 0, pv9Var, e6dVar));
        i().setColorSchemeColors(weo.M(context, ru.yandex.music.R.attr.iconPrimary));
        i().setProgressBackgroundColorSchemeColor(weo.M(context, ru.yandex.music.R.attr.bgSecondary));
        i().setOnRefreshListener(new l2e(this));
        homeLandingBottomSheetBehavior.setCanSlideDownCallback(new lhd(i, this));
        homeLandingBottomSheetBehavior.setSlideDownCallback(new cib(6, this));
        int i4 = 5;
        homeLandingBottomSheetBehavior.addBottomSheetCallback(new xe3(i4, this));
        Integer valueOf = bundle != null ? Integer.valueOf(bundle.getInt("BUNDLE_BOTTOM_SHEET_STATE")) : null;
        l(valueOf != null ? valueOf.intValue() : 4);
        a.m(null, Integer.valueOf(valueOf != null ? valueOf.intValue() : 4));
        if (((Number) r2eVar.getValue(this, G[12])).intValue() != 3 && valueOf != null && (npqVar = k().j) != null) {
            npqVar.a().U(0);
        }
        g().setNestedScrollingEnabled(true);
        g().setOnScrollChangeListener(new l2e(this));
        view.addOnLayoutChangeListener(new c34(i3, this));
        qdq.j(j(), new t31(11, this));
        final SwipeRefreshLayout i5 = i();
        Context context4 = i5.getContext();
        context4.getClass();
        final int r = ngg.r(context4, 64);
        qdq.j(i5, new ryc() { // from class: n2e
            @Override // defpackage.ryc
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                kqv kqvVar = (kqv) obj2;
                cme cmeVar = (cme) obj3;
                ((View) obj).getClass();
                kqvVar.getClass();
                cmeVar.getClass();
                int i6 = cmeVar.b;
                zne g = kqvVar.a.g(519);
                g.getClass();
                int i7 = g.b;
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                swipeRefreshLayout.setPadding(swipeRefreshLayout.getPaddingLeft(), i6 + i7, swipeRefreshLayout.getPaddingRight(), swipeRefreshLayout.getPaddingBottom());
                swipeRefreshLayout.x = i6 + i7 + r;
                swipeRefreshLayout.t.invalidate();
                return Unit.a;
            }
        });
        wdu.q(c(), new fu2(i4, this));
        c().setOnClickListener(new ol(i2, this));
        n(homeLandingBottomSheetBehavior.getState());
        m(bundle != null ? bundle.getBoolean("BUNDLE_IS_STICKY_ENABLED", false) : false);
        jyr jyrVar2 = t5j.e;
        if (wyf.M()) {
            h().setVisibility(4);
        }
    }

    public final void a(float f) {
        boolean z = this.p.getState() == 3;
        float f2 = (!z && f < 0.5f) ? f + 0.5f : 1.0f;
        float f3 = (!z && f < 0.5f) ? f / 0.5f : 1.0f;
        c().setBackgroundColor(aa5.l(this.r, (int) (KotlinVersion.MAX_COMPONENT_VALUE * f3)));
        float f4 = z ? 1.0f : f;
        this.B = f4;
        h4b h4bVar = this.x;
        float f5 = 0.0f;
        if (h4bVar != null) {
            u1e u1eVar = (u1e) h4bVar.a;
            tjf tjfVar = u1eVar.x;
            tjfVar.h.setValue(tjfVar, tjf.y[0], Float.valueOf(1.0f - f4));
            z5r z5rVar = u1eVar.y;
            z5rVar.d.setValue(z5rVar, z5r.i[0], Float.valueOf(f4 <= 0.5f ? 1.0f - (2 * f4) : 0.0f));
        }
        k().setBottomSheetExpanded(z);
        k().setContentAlpha(f2);
        this.o = 1.0f - f3;
        SkeletonListView k = k();
        float f6 = this.o;
        npq npqVar = k.j;
        if (npqVar != null) {
            npqVar.b(f6);
        }
        poi rootAlpha = d().getRootAlpha();
        if (z) {
            f5 = 1.0f;
        } else if (f > 0.5f) {
            f5 = (2 * f) - 1.0f;
        }
        ((t6k) rootAlpha).h(f5);
        c().setEnableRoundedCorners(!(this.B == 1.0f));
        HomeLandingBottomSheetLayout c = c();
        float f7 = 0.1f;
        if (f < 0.5f) {
            f7 = 0.1f * (f / 0.5f);
        } else if (f > 0.7f) {
            f7 = 0.1f * (1.0f - ((f - 0.7f) / 0.3f));
        }
        c.setAnchorAlpha(f7);
    }

    public final void b(int i) {
        if (i == 3) {
            a(1.0f);
        } else {
            if (i != 4) {
                return;
            }
            a(0.0f);
        }
    }

    public final HomeLandingBottomSheetLayout c() {
        return (HomeLandingBottomSheetLayout) this.h.a(G[6]);
    }

    public final BottomsheetCollapsingTopBar d() {
        return (BottomsheetCollapsingTopBar) this.m.a(G[10]);
    }

    public final int e(int i) {
        Context context = this.e;
        return context.getResources().getColor(i, context.getTheme());
    }

    public final View f() {
        return (View) this.k.a(G[8]);
    }

    public final NestedScrollView g() {
        return (NestedScrollView) this.g.a(G[5]);
    }

    public final PlusPlaqueContainerView h() {
        return (PlusPlaqueContainerView) this.n.a(G[11]);
    }

    public final SwipeRefreshLayout i() {
        return (SwipeRefreshLayout) this.f.a(G[4]);
    }

    public final View j() {
        return (View) this.a.a(G[0]);
    }

    public final SkeletonListView k() {
        return (SkeletonListView) this.l.a(G[9]);
    }

    public final void l(int i) {
        this.s.setValue(this, G[12], Integer.valueOf(i));
    }

    public final void m(boolean z) {
        this.D = z;
        if (!z) {
            SkeletonListView k = k();
            k.setPadding(k.getPaddingLeft(), 0, k.getPaddingRight(), k.getPaddingBottom());
            k().setTranslationY(0.0f);
        } else {
            if (c().isLaidOut()) {
                p(c());
                return;
            }
            HomeLandingBottomSheetLayout c = c();
            if (!c.isLaidOut() || c.isLayoutRequested()) {
                c.addOnLayoutChangeListener(new f27(4, this));
            } else {
                p(c);
            }
        }
    }

    public final void n(int i) {
        boolean z = i == 3;
        ViewParent parent = c().getParent();
        CoordinatorLayout coordinatorLayout = parent instanceof CoordinatorLayout ? (CoordinatorLayout) parent : null;
        if (coordinatorLayout != null) {
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.F == null) {
                    this.F = new HashMap(childCount);
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != c() && childAt != d() && childAt != h()) {
                    HashMap hashMap = this.F;
                    if (z) {
                        if (hashMap != null) {
                            childAt.getClass();
                        }
                        WeakHashMap weakHashMap = wdu.a;
                        childAt.setImportantForAccessibility(4);
                    } else if (hashMap != null && hashMap.containsKey(childAt)) {
                        HashMap hashMap2 = this.F;
                        hashMap2.getClass();
                        Object obj = hashMap2.get(childAt);
                        obj.getClass();
                        int intValue = ((Number) obj).intValue();
                        WeakHashMap weakHashMap2 = wdu.a;
                        childAt.setImportantForAccessibility(intValue);
                    }
                }
            }
            if (!z) {
                this.F = null;
            }
        }
        if (i == 3) {
            k().setImportantForAccessibility(0);
            c().setImportantForAccessibility(2);
            jyr jyrVar = t5j.e;
            if (wyf.M()) {
                return;
            }
            BottomsheetCollapsingTopBar d = d();
            qb qbVar = qb.l;
            l2e l2eVar = this.v;
            wdu.o(d, qbVar, null, l2eVar);
            wdu.o(h(), qbVar, null, l2eVar);
            wdu.o(k(), qbVar, null, l2eVar);
            return;
        }
        k().setImportantForAccessibility(4);
        c().setImportantForAccessibility(1);
        BottomsheetCollapsingTopBar d2 = d();
        qb qbVar2 = qb.l;
        wdu.n(qbVar2.a(), d2);
        wdu.k(0, d2);
        PlusPlaqueContainerView h = h();
        wdu.n(qbVar2.a(), h);
        wdu.k(0, h);
        SkeletonListView k = k();
        wdu.n(qbVar2.a(), k);
        wdu.k(0, k);
    }

    public final void o() {
        int scrollY = this.z + this.y + this.A + g().getScrollY();
        if (scrollY < 0) {
            scrollY = 0;
        }
        this.p.setPeekHeight(scrollY);
    }

    public final void p(View view) {
        int i;
        if (!this.D || (i = this.C) == 0) {
            return;
        }
        int top = view.getTop();
        if (top < 0) {
            top = 0;
        }
        int state = this.p.getState();
        if (top == 0 && state == 4) {
            top = Integer.MAX_VALUE;
        }
        k().setTranslationY(-Math.min(i, top));
    }
}
