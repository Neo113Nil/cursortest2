package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.transition.Transition;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class qu9 {
    public final w1a a;
    public final mf9 b;
    public final efb c;
    public final pv9 d;
    public final zb e;
    public final LinkedHashMap f = new LinkedHashMap();
    public final Handler g = new Handler(Looper.getMainLooper());

    public qu9(w1a w1aVar, mf9 mf9Var, pv9 pv9Var, zb zbVar, efb efbVar) {
        this.a = w1aVar;
        this.b = mf9Var;
        this.c = efbVar;
        this.d = pv9Var;
        this.e = zbVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ff9, mu9] */
    public static final void a(final qu9 qu9Var, final View view, final iu9 iu9Var, final e23 e23Var, final boolean z) {
        View view2;
        or0 or0Var;
        boolean z2;
        boolean z3;
        nu9 nu9Var;
        qpj onBackPressedDispatcher;
        Transition D;
        f29 D2;
        jc8 div;
        final gc8 gc8Var = e23Var.a;
        final xzb xzbVar = e23Var.b;
        final jc8 jc8Var = iu9Var.f;
        jc8 jc8Var2 = iu9Var.l;
        boolean z4 = jc8Var2 != null;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        int j0 = z4 ? -1 : vq1.j0(jc8Var.d().c(), displayMetrics, xzbVar, null);
        int j02 = z4 ? -1 : vq1.j0(jc8Var.d().a(), displayMetrics, xzbVar, null);
        String str = iu9Var.d;
        View I = str != null ? xv.I(gc8Var, str) : null;
        pv9 pv9Var = qu9Var.d;
        final ku9 ku9Var = new ku9(e23Var.a.getContext(), null, 0, 6, null);
        View C = jc8Var2 != null ? pv9Var.C(e23Var, jc8Var2) : null;
        if (I == null || (D2 = bg3.D(I)) == null || (div = D2.getDiv()) == null) {
            view2 = null;
        } else {
            view2 = pv9Var.C(e23Var, div);
            jf0.O(view2);
        }
        View C2 = pv9Var.C(e23Var, jc8Var);
        ku9Var.removeAllViews();
        ku9Var.n = false;
        ku9Var.o = false;
        if (C != null) {
            ku9Var.n = true;
            ku9Var.addView(C);
        }
        if (ku9Var.n && view2 != null) {
            ku9Var.o = true;
            ku9Var.addView(view2);
        }
        ku9Var.addView(C2);
        ku9Var.setLayoutParams(new ViewGroup.LayoutParams(j0, j02));
        final View tooltipView = ku9Var.getTooltipView();
        if (tooltipView == null) {
            return;
        }
        boolean z5 = iu9Var.i instanceof vu9;
        or0 or0Var2 = new or0((View) ku9Var, j0, j02, false);
        dxr dxrVar = new dxr(new fmq(view), or0Var2);
        final tqn tqnVar = new tqn();
        or0Var2.setTouchable(true);
        or0Var2.setOutsideTouchable(((Boolean) iu9Var.e.a(xzbVar)).booleanValue());
        or0Var2.setFocusable(z5);
        if (Build.VERSION.SDK_INT >= 29) {
            or0Var2.setTouchModal(z5);
        }
        boolean isOutsideTouchable = or0Var2.isOutsideTouchable();
        List list = iu9Var.m;
        if (jc8Var2 == null || !xv.M(jc8Var2)) {
            or0Var = or0Var2;
            z2 = false;
        } else {
            or0Var = or0Var2;
            z2 = true;
        }
        or0Var.setTouchInterceptor(new qhm(ku9Var, z5, isOutsideTouchable, list, e23Var, dxrVar, z2, new qs6(qu9Var, iu9Var, gc8Var)));
        if (z4) {
            z3 = false;
        } else {
            sm8 sm8Var = iu9Var.a;
            szb szbVar = iu9Var.k;
            or0Var.setEnterTransition(sm8Var != null ? pd.c0(sm8Var, (hu9) szbVar.a(xzbVar), true, xzbVar) : pd.D(iu9Var, xzbVar));
            sm8 sm8Var2 = iu9Var.b;
            if (sm8Var2 != null) {
                z3 = false;
                D = pd.c0(sm8Var2, (hu9) szbVar.a(xzbVar), false, xzbVar);
            } else {
                z3 = false;
                D = pd.D(iu9Var, xzbVar);
            }
            or0Var.setExitTransition(D);
        }
        if (z4) {
            or0Var.setAttachedInDecor(true);
            or0Var.setClippingEnabled(z3);
            tqnVar.a = true;
        }
        if (qu9Var.e.a(gc8Var.getContext())) {
            nu9 nu9Var2 = new nu9(qu9Var, iu9Var, gc8Var);
            rpj o = uwf.o(gc8Var);
            if (o == null || (onBackPressedDispatcher = o.getOnBackPressedDispatcher()) == null) {
                gc8Var.I(new AssertionError("Can't find onBackPressedDispatcher to set on back press listener on tooltip."));
            } else {
                onBackPressedDispatcher.b(nu9Var2);
            }
            nu9Var = nu9Var2;
        } else {
            nu9Var = null;
        }
        final or0 or0Var3 = or0Var;
        final dps dpsVar = new dps(iu9Var.h, e23Var, iu9Var, or0Var3, nu9Var);
        if (!z5) {
            ku9Var.setDismissAction(new az6(25, dxrVar));
        }
        or0Var3.setOnDismissListener(new PopupWindow.OnDismissListener(iu9Var, e23Var, ku9Var, gc8Var, view, or0Var3, dpsVar) { // from class: lu9
            public final /* synthetic */ iu9 b;
            public final /* synthetic */ e23 c;
            public final /* synthetic */ ku9 d;
            public final /* synthetic */ View e;
            public final /* synthetic */ or0 f;
            public final /* synthetic */ dps g;

            {
                this.e = view;
                this.f = or0Var3;
                this.g = dpsVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                List e;
                qu9 qu9Var2 = qu9.this;
                LinkedHashMap linkedHashMap = qu9Var2.f;
                iu9 iu9Var2 = this.b;
                linkedHashMap.remove(iu9Var2.h);
                jc8 jc8Var3 = iu9Var2.f;
                w1a w1aVar = qu9Var2.a;
                e23 e23Var2 = this.c;
                w1a.i(w1aVar, e23Var2.a, e23Var2.b, null, jc8Var3);
                LinkedHashMap d = w1aVar.d();
                ku9 ku9Var2 = this.d;
                jc8 jc8Var4 = (jc8) d.get(ku9Var2);
                if (jc8Var4 != null && (e = jc8Var4.d().e()) != null) {
                    xzb xzbVar2 = e23Var2.b;
                    w1aVar.g(e23Var2.a, xzbVar2, ku9Var2, jc8Var4, c5b.a, w1a.c(e, xzbVar2));
                }
                xv.R(this.f.getContentView(), qu9Var2.e);
                kpj kpjVar = this.g.f;
                if (kpjVar == null) {
                    return;
                }
                kpjVar.setEnabled(false);
            }
        });
        mf9 mf9Var = qu9Var.b;
        final boolean z6 = z4;
        final View view3 = I;
        ?? r0 = new ff9(view, qu9Var, gc8Var, iu9Var, z, ku9Var, or0Var3, tooltipView, xzbVar, z6, tqnVar, view3, e23Var, jc8Var) { // from class: mu9
            public final /* synthetic */ View b;
            public final /* synthetic */ qu9 c;
            public final /* synthetic */ gc8 d;
            public final /* synthetic */ iu9 e;
            public final /* synthetic */ ku9 f;
            public final /* synthetic */ or0 g;
            public final /* synthetic */ View h;
            public final /* synthetic */ xzb i;
            public final /* synthetic */ boolean j;
            public final /* synthetic */ tqn k;
            public final /* synthetic */ View l;
            public final /* synthetic */ e23 m;
            public final /* synthetic */ jc8 n;

            {
                this.f = ku9Var;
                this.g = or0Var3;
                this.h = tooltipView;
                this.i = xzbVar;
                this.j = z6;
                this.k = tqnVar;
                this.l = view3;
                this.m = e23Var;
                this.n = jc8Var;
            }

            @Override // defpackage.ff9
            public final void a(boolean z7) {
                gc8 gc8Var2;
                View view4;
                View view5;
                iu9 iu9Var2;
                xzb xzbVar2;
                iu9 iu9Var3;
                xzb xzbVar3;
                int i;
                Point point;
                qu9 qu9Var2 = this.c;
                iu9 iu9Var4 = this.e;
                if (!z7 && !dps.this.g) {
                    View view6 = this.b;
                    if (view6.isAttachedToWindow()) {
                        efb efbVar = qu9Var2.c;
                        ku9 ku9Var2 = this.f;
                        boolean K = wyf.K(ku9Var2);
                        gc8 gc8Var3 = this.d;
                        or0 or0Var4 = this.g;
                        View view7 = this.h;
                        xzb xzbVar4 = this.i;
                        boolean z8 = this.j;
                        tqn tqnVar2 = this.k;
                        View view8 = this.l;
                        e23 e23Var2 = this.m;
                        jc8 jc8Var3 = this.n;
                        if (!K || ku9Var2.isLayoutRequested()) {
                            gc8Var2 = gc8Var3;
                            view4 = view7;
                            view5 = view6;
                            iu9Var2 = iu9Var4;
                            xzbVar2 = xzbVar4;
                            ku9Var2.addOnLayoutChangeListener(new pu9(gc8Var2, view4, view5, iu9Var2, xzbVar2, qu9Var2, z8, tqnVar2, or0Var4, ku9Var2, view8, e23Var2, jc8Var3));
                        } else {
                            Rect rect = new Rect();
                            gc8Var3.getWindowVisibleDisplayFrame(rect);
                            Point A = xv.A(view7, view6, iu9Var4, xzbVar4);
                            int min = Math.min(view7.getWidth(), rect.width());
                            int min2 = Math.min(view7.getHeight(), rect.height());
                            if (min < view7.getWidth()) {
                                iu9Var3 = iu9Var4;
                                xzbVar3 = xzbVar4;
                                efbVar.a(gc8Var3.getDivData(), gc8Var3.getDataTag()).e(new Throwable("Tooltip width > screen size, width was changed"));
                            } else {
                                iu9Var3 = iu9Var4;
                                xzbVar3 = xzbVar4;
                            }
                            if (min2 < view7.getHeight()) {
                                efbVar.a(gc8Var3.getDivData(), gc8Var3.getDataTag()).e(new Throwable("Tooltip height > screen size, height was changed"));
                            }
                            if (z8) {
                                if (tqnVar2.a) {
                                    i = 0;
                                    point = new Point(0, 0);
                                } else {
                                    i = 0;
                                    point = new Point(rect.left, rect.top);
                                }
                                or0Var4.update(i, i, -1, -1);
                                ku9.f(ku9Var2.getTooltipView(), A.x - point.x, A.y - point.y, min, min2);
                                if (view8 != null) {
                                    int[] iArr = new int[2];
                                    view8.getLocationOnScreen(iArr);
                                    Point point2 = new Point(iArr[0], iArr[1]);
                                    ku9.f(ku9Var2.getBringToTopView(), point2.x - point.x, point2.y - point.y, view8.getWidth(), view8.getHeight());
                                }
                            } else {
                                or0Var4.update(A.x, A.y, min, min2);
                            }
                            w1a w1aVar = qu9Var2.a;
                            gc8 gc8Var4 = e23Var2.a;
                            xzb xzbVar5 = e23Var2.b;
                            w1a.i(w1aVar, gc8Var4, xzbVar5, null, jc8Var3);
                            w1a.i(w1aVar, e23Var2.a, xzbVar5, ku9Var2, jc8Var3);
                            gc8Var2 = gc8Var3;
                            view4 = view7;
                            view5 = view6;
                            iu9Var2 = iu9Var3;
                            xzbVar2 = xzbVar3;
                        }
                        or0Var4.showAtLocation(view5, 0, 0, 0);
                        View substrateView = ku9Var2.getSubstrateView();
                        if (substrateView != null) {
                            Animation B = pd.B(iu9Var2.a, (hu9) iu9Var2.k.a(xzbVar2), xzbVar2, view4, true);
                            AlphaAnimation z9 = pd.z(true);
                            z9.setDuration(B.getDuration());
                            z9.setInterpolator(B.getInterpolator());
                            view4.startAnimation(B);
                            substrateView.startAnimation(z9);
                        }
                        xv.R(view4, qu9Var2.e);
                        if (((Number) iu9Var2.g.a(xzbVar2)).longValue() != 0) {
                            qu9Var2.g.postDelayed(new pv7(qu9Var2, iu9Var2, gc8Var2), ((Number) iu9Var2.g.a(xzbVar2)).longValue());
                            return;
                        }
                        return;
                    }
                }
                qu9Var2.f.remove(iu9Var4.h);
            }
        };
        mf9Var.getClass();
        hf9 hf9Var = new hf9(r0);
        kf9 kf9Var = new kf9(mf9Var, hf9Var, r0, xzbVar);
        kf9Var.U(jc8Var, xzbVar);
        hf9Var.j0();
        dpsVar.e = kf9Var.p;
        qu9Var.f.put(iu9Var.h, dpsVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x001e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view) {
        LinkedHashMap linkedHashMap;
        String str;
        Object tag = view.getTag(R.id.div_tooltips_tag);
        List list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                linkedHashMap = this.f;
                if (!hasNext) {
                    break;
                }
                dps dpsVar = (dps) linkedHashMap.get(((iu9) it.next()).h);
                if (dpsVar != null) {
                    dpsVar.g = true;
                    or0 or0Var = dpsVar.d;
                    efo efoVar = dpsVar.e;
                    if (efoVar != null) {
                        Iterator it2 = ((ArrayList) efoVar.b).iterator();
                        while (it2.hasNext()) {
                            ((jf9) it2.next()).cancel();
                        }
                    }
                    if (or0Var.isShowing()) {
                        or0Var.setEnterTransition(null);
                        or0Var.setExitTransition(null);
                        or0Var.dismiss();
                    } else {
                        e23 e23Var = dpsVar.b;
                        w1a.i(this.a, e23Var.a, e23Var.b, null, dpsVar.c.f);
                        str = dpsVar.a;
                        if (str == null) {
                            arrayList.add(str);
                        }
                    }
                }
                str = null;
                if (str == null) {
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                linkedHashMap.remove((String) it3.next());
            }
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                rj7.m();
                return;
            } else {
                b(childAt);
                i = i2;
            }
        }
    }

    public final void c(String str) {
        dps dpsVar = (dps) this.f.get(str);
        if (dpsVar == null) {
            return;
        }
        or0 or0Var = dpsVar.d;
        View contentView = or0Var.getContentView();
        ku9 ku9Var = contentView instanceof ku9 ? (ku9) contentView : null;
        View substrateView = ku9Var != null ? ku9Var.getSubstrateView() : null;
        View tooltipView = ku9Var != null ? ku9Var.getTooltipView() : null;
        if (substrateView == null || tooltipView == null) {
            or0Var.dismiss();
            return;
        }
        substrateView.clearAnimation();
        tooltipView.clearAnimation();
        iu9 iu9Var = dpsVar.c;
        xzb xzbVar = dpsVar.b.b;
        rs6 rs6Var = new rs6(27, dpsVar);
        Animation B = pd.B(iu9Var.b, (hu9) iu9Var.k.a(xzbVar), xzbVar, tooltipView, false);
        B.setAnimationListener(new ju9(0, rs6Var));
        AlphaAnimation z = pd.z(false);
        z.setDuration(B.getDuration());
        z.setInterpolator(B.getInterpolator());
        tooltipView.startAnimation(B);
        substrateView.startAnimation(z);
    }

    public final void d(String str, e23 e23Var, boolean z) {
        e23 e23Var2;
        Unit unit;
        Pair J = xv.J(e23Var.a, str);
        if (J != null) {
            iu9 iu9Var = (iu9) J.a;
            View view = (View) J.b;
            if (this.f.containsKey(iu9Var.h)) {
                e23Var2 = e23Var;
            } else {
                if (!wyf.K(view) || view.isLayoutRequested()) {
                    e23Var2 = e23Var;
                    view.addOnLayoutChangeListener(new ou9(this, view, iu9Var, e23Var2, z));
                } else {
                    a(this, view, iu9Var, e23Var, z);
                    e23Var2 = e23Var;
                }
                if (!wyf.K(view) && !view.isLayoutRequested()) {
                    view.requestLayout();
                }
            }
            unit = Unit.a;
        } else {
            e23Var2 = e23Var;
            unit = null;
        }
        if (unit == null) {
            e23Var2.a.I(new IllegalStateException(ouj.k('\'', "Unable to find view for tooltip '", str)));
        }
    }
}
