package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.x0;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.e;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.g;
import com.yandex.go.flex.common.facade.routers.views.SlidableFlexView;
import com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutsModalView;
import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;

/* loaded from: classes12.dex */
public final class qgn0 implements ctn0, ca20, nxp0, jg5, t030, gfs0, kos0, u52, sxr, dzh {
    public final /* synthetic */ int a;
    public Object b;

    public qgn0(Context context, tt5 tt5Var) {
        this.a = 15;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        afo afoVar = new afo(tt5Var, "in_app_calls.ru/all_sensors/proximity");
        this.b = afoVar;
        afoVar.a(new brq0(sensorManager, powerManager));
    }

    public static ValueAnimator h(boolean z) {
        return z ? ValueAnimator.ofFloat(0.0f, 1.0f) : ValueAnimator.ofFloat(1.0f, 0.0f);
    }

    @Override // defpackage.t030
    public boolean H() {
        return true;
    }

    @Override // defpackage.nxp0
    public void a(boolean z) {
        g gVar = (g) this.b;
        TouchObserverFrameLayout touchObserverFrameLayout = gVar.n;
        if (z) {
            g.d(gVar, 0.0f);
            gVar.g.setAlpha(0.0f);
            touchObserverFrameLayout.setAlpha(0.0f);
            gVar.s.setVisibility(4);
        } else {
            g.d(gVar, 1.0f);
            touchObserverFrameLayout.setAlpha(1.0f);
        }
        gVar.h.setVisibility(0);
    }

    public lzr0 c() {
        lzr0 lzr0Var = (lzr0) this.b;
        if (TextUtils.isEmpty(lzr0Var.d)) {
            ny61.g("Shortcut must have a non-empty label");
            return null;
        }
        Intent[] intentArr = lzr0Var.c;
        if (intentArr != null && intentArr.length != 0) {
            return lzr0Var;
        }
        ny61.g("Shortcut must have an intent");
        return null;
    }

    @Override // defpackage.t030
    public void collapse() {
        ((ShortcutsModalView) this.b).anchor();
    }

    @Override // defpackage.nxp0
    public AnimatorSet d(boolean z) {
        Animator animator;
        char c;
        View d;
        View b;
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator h = h(z);
        g gVar = (g) this.b;
        TextView textView = gVar.k;
        int i = gVar.x;
        TimeInterpolator timeInterpolator = gVar.v;
        TimeInterpolator timeInterpolator2 = gVar.w;
        int i2 = gVar.y;
        h.setDuration(i2);
        h.setStartDelay(z ? 0L : i);
        h.setInterpolator(z ? timeInterpolator2 : timeInterpolator);
        final int i3 = 1;
        h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: pxp0
            public final /* synthetic */ qgn0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i4 = i3;
                qgn0 qgn0Var = this.b;
                switch (i4) {
                    case 0:
                        ((g) qgn0Var.b).g.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 1:
                        g.d((g) qgn0Var.b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        TextView textView2 = ((g) qgn0Var.b).j;
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                        layoutParams.width = intValue;
                        textView2.setLayoutParams(layoutParams);
                        break;
                }
            }
        });
        ValueAnimator h2 = h(z);
        h2.setDuration(i2);
        h2.setStartDelay(z ? i : 0L);
        h2.setInterpolator(z ? timeInterpolator : timeInterpolator2);
        final int i4 = 0;
        h2.addUpdateListener(MultiViewUpdateListener.alphaListener(gVar.n));
        ValueAnimator h3 = h(z);
        h3.setDuration(i2);
        h3.setInterpolator(z ? timeInterpolator2 : timeInterpolator);
        h3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: pxp0
            public final /* synthetic */ qgn0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i42 = i4;
                qgn0 qgn0Var = this.b;
                switch (i42) {
                    case 0:
                        ((g) qgn0Var.b).g.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 1:
                        g.d((g) qgn0Var.b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        TextView textView2 = ((g) qgn0Var.b).j;
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                        layoutParams.width = intValue;
                        textView2.setLayoutParams(layoutParams);
                        break;
                }
            }
        });
        TextView textView2 = z ? gVar.s.getTextView() : textView;
        if (!z) {
            textView = gVar.s.getTextView();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(textView2.getWidth(), textView.getWidth());
        ofInt.setDuration(i2);
        if (z) {
            timeInterpolator = timeInterpolator2;
        }
        ofInt.setInterpolator(timeInterpolator);
        final int i5 = 2;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: pxp0
            public final /* synthetic */ qgn0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i42 = i5;
                qgn0 qgn0Var = this.b;
                switch (i42) {
                    case 0:
                        ((g) qgn0Var.b).g.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 1:
                        g.d((g) qgn0Var.b, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        TextView textView22 = ((g) qgn0Var.b).j;
                        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        ViewGroup.LayoutParams layoutParams = textView22.getLayoutParams();
                        layoutParams.width = intValue;
                        textView22.setLayoutParams(layoutParams);
                        break;
                }
            }
        });
        Animator g = g.g(gVar, z);
        AnimatorSet animatorSet2 = new AnimatorSet();
        AppBarLayout appBarLayoutParentIfExists = gVar.s.getAppBarLayoutParentIfExists();
        SearchBar searchBar = gVar.s;
        if (searchBar == null || appBarLayoutParentIfExists == null) {
            animator = g;
            c = 0;
        } else {
            int startSiblingViewId = searchBar.getStartSiblingViewId();
            c = 0;
            if (startSiblingViewId != -1) {
                d = appBarLayoutParentIfExists.findViewById(startSiblingViewId);
            } else {
                ViewParent parent = gVar.s.getParent();
                d = !(parent instanceof Toolbar) ? null : v5a1.d((Toolbar) parent);
            }
            int endSiblingViewId = gVar.s.getEndSiblingViewId();
            if (endSiblingViewId != -1) {
                b = appBarLayoutParentIfExists.findViewById(endSiblingViewId);
            } else {
                ViewParent parent2 = gVar.s.getParent();
                b = !(parent2 instanceof Toolbar) ? null : v5a1.b((Toolbar) parent2);
            }
            boolean i6 = e.i(gVar.s);
            int width = appBarLayoutParentIfExists.getWidth();
            if (d != null) {
                Rect a = e.a(appBarLayoutParentIfExists, d);
                float f = i6 ? width - a.left : -a.right;
                float f2 = z ? 0.0f : f;
                if (!z) {
                    f = 0.0f;
                }
                animator = g;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                ofFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(d));
                animatorSet2.playTogether(ofFloat);
                ValueAnimator h4 = h(!z);
                h4.addUpdateListener(MultiViewUpdateListener.alphaListener(d));
                animatorSet2.playTogether(h4);
            } else {
                animator = g;
            }
            if (b != null) {
                Rect a2 = e.a(appBarLayoutParentIfExists, b);
                float f3 = i6 ? -a2.right : width - a2.left;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(z ? 0.0f : f3, z ? f3 : 0.0f);
                ofFloat2.addUpdateListener(MultiViewUpdateListener.translationXListener(b));
                animatorSet2.playTogether(ofFloat2);
                ValueAnimator h5 = h(!z);
                h5.addUpdateListener(MultiViewUpdateListener.alphaListener(b));
                animatorSet2.playTogether(h5);
            }
            animatorSet2.setDuration(i2);
            animatorSet2.setInterpolator(mj2.a);
        }
        Animator[] animatorArr = new Animator[6];
        animatorArr[c] = h;
        animatorArr[1] = h2;
        animatorArr[2] = h3;
        animatorArr[3] = ofInt;
        animatorArr[4] = animator;
        animatorArr[5] = animatorSet2;
        animatorSet.playTogether(animatorArr);
        return animatorSet;
    }

    @Override // defpackage.t030
    public void dismissWithAction(Runnable runnable) {
        ((ShortcutsModalView) this.b).dismissWithAction(runnable);
    }

    @Override // defpackage.nxp0
    public List e(boolean z) {
        g gVar = (g) this.b;
        Toolbar toolbar = gVar.h;
        MaterialToolbar materialToolbar = gVar.g;
        nwt0 m = m(materialToolbar, z);
        int l = l(materialToolbar);
        int i = z ? l : 0;
        if (z) {
            l = 0;
        }
        u4n u4nVar = y4n.m;
        nwt0 i2 = i(materialToolbar, u4nVar, i, l);
        int i3 = 0;
        nwt0 m2 = m(toolbar, z);
        int l2 = l(toolbar);
        int i4 = z ? l2 : 0;
        if (z) {
            l2 = 0;
        }
        nwt0 i5 = i(toolbar, u4nVar, i4, l2);
        int b = g.b(gVar, gVar.s) - g.b(gVar, materialToolbar);
        int i6 = z ? b : 0;
        if (!z) {
            i3 = b;
        }
        return Arrays.asList(m, i2, m2, i5, i(gVar.f, y4n.n, i6, i3), k(gVar.k, z), k(gVar.j, z));
    }

    @Override // defpackage.t030
    public void expand() {
        ((ShortcutsModalView) this.b).expand();
    }

    @Override // defpackage.nxp0
    public void f(boolean z) {
        g gVar = (g) this.b;
        TouchObserverFrameLayout touchObserverFrameLayout = gVar.n;
        if (z) {
            g.d(gVar, 1.0f);
            touchObserverFrameLayout.setAlpha(1.0f);
        } else {
            g.d(gVar, 0.0f);
            touchObserverFrameLayout.setAlpha(0.0f);
            gVar.s.setVisibility(0);
        }
        gVar.h.setVisibility(4);
        TextView textView = gVar.j;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = -2;
        textView.setLayoutParams(layoutParams);
    }

    @Override // defpackage.nxp0
    public void g() {
    }

    public nwt0 i(View view, mor morVar, float f, float f2) {
        nwt0 nwt0Var = new nwt0(view, morVar);
        nwt0Var.u = kp50.Q(((g) this.b).t, eng0.motionSpringFastSpatial, g2i0.Motion_Material3_Spring_Standard_Default_Spatial);
        nwt0Var.g(f);
        nwt0Var.u.i = f2;
        return nwt0Var;
    }

    @Override // defpackage.t030
    public boolean isCollapsed() {
        ShortcutsModalView shortcutsModalView = (ShortcutsModalView) this.b;
        return shortcutsModalView.isModalViewCollapsed() || shortcutsModalView.isAnchored();
    }

    @Override // defpackage.t030
    public boolean isExpanded() {
        return ((ShortcutsModalView) this.b).isExpanded();
    }

    @Override // defpackage.nxp0
    public void j() {
        g gVar = (g) this.b;
        Toolbar toolbar = gVar.h;
        TextView textView = gVar.s.getTextView();
        TextView textView2 = gVar.j;
        textView2.setText(textView.getText());
        textView2.setHint(textView.getHint());
        textView2.setVisibility(0);
        if (gVar.s.getBackground() != null && gVar.s.getBackground().getConstantState() != null) {
            toolbar.setBackground(gVar.s.getBackground().getConstantState().newDrawable());
        }
        Menu menu = toolbar.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (g.e(gVar)) {
            toolbar.inflateMenu(gVar.s.getMenuResId());
            g.f(gVar, toolbar);
        }
    }

    public nwt0 k(View view, boolean z) {
        g gVar = (g) this.b;
        TextView placeholderTextView = gVar.s.getPlaceholderTextView();
        if (TextUtils.isEmpty(placeholderTextView.getText()) || z) {
            placeholderTextView = gVar.s.getTextView();
        }
        float c = g.c(gVar, placeholderTextView, view) - l(gVar.g);
        if (e.i(gVar.s)) {
            c += placeholderTextView.getWidth() - view.getWidth();
        }
        float f = z ? c : 0.0f;
        if (z) {
            c = 0.0f;
        }
        return i(view, y4n.m, f, c);
    }

    public int l(Toolbar toolbar) {
        g gVar = (g) this.b;
        int k = gVar.k(gVar.s);
        FrameLayout frameLayout = gVar.f;
        int paddingStart = frameLayout.getPaddingStart();
        int marginStart = ((ViewGroup.MarginLayoutParams) toolbar.getLayoutParams()).getMarginStart();
        return e.i(gVar.s) ? (gVar.s.getWidth() + k) - ((frameLayout.getWidth() - paddingStart) - marginStart) : (k - paddingStart) - marginStart;
    }

    public nwt0 m(final Toolbar toolbar, final boolean z) {
        g gVar = (g) this.b;
        int width = gVar.s.getWidth();
        FrameLayout frameLayout = gVar.f;
        int width2 = frameLayout.getWidth();
        int paddingEnd = frameLayout.getPaddingEnd() + frameLayout.getPaddingStart();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.g.getLayoutParams();
        int marginEnd = (width2 - paddingEnd) - (marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart());
        int i = z ? width : marginEnd;
        if (z) {
            width = marginEnd;
        }
        nwt0 i2 = i(toolbar, new v9j(this), i, width);
        i2.a(new w4n(this) { // from class: oxp0
            @Override // defpackage.w4n
            public final void a(y4n y4nVar, boolean z2, float f, float f2) {
                if (z) {
                    Toolbar toolbar2 = toolbar;
                    ViewGroup.LayoutParams layoutParams = toolbar2.getLayoutParams();
                    layoutParams.width = -1;
                    toolbar2.setLayoutParams(layoutParams);
                }
            }
        });
        return i2;
    }

    public void n(String str, Map map) {
        ((xjg) this.b).k(str, map);
    }

    public void o(String str, Throwable th) {
        String message = th.getMessage();
        if (message == null) {
            message = th.toString();
        }
        Pair pair = new Pair("error", message);
        if (str == null) {
            str = "";
        }
        ((xjg) this.b).k("native_error", b.i(pair, new Pair(AppSettingsContract$Setting.COLUMN_PREFIX, str)));
    }

    @Override // defpackage.dzh
    public void onDismiss() {
        ((lu5) this.b).invoke();
    }

    @Override // defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        boolean isStylusHandwritingAvailable;
        boolean isStylusHandwritingAvailable2;
        boolean z = true;
        switch (this.a) {
            case 9:
                pgp0 pgp0Var = (pgp0) this.b;
                if (pgp0Var.a != null) {
                    String str = x920Var.a;
                    str.getClass();
                    switch (str) {
                        case "Scribe.isFeatureAvailable":
                            try {
                                qgp0 qgp0Var = pgp0Var.a;
                                if (Build.VERSION.SDK_INT >= 34) {
                                    isStylusHandwritingAvailable = qgp0Var.a.isStylusHandwritingAvailable();
                                    if (isStylusHandwritingAvailable) {
                                        ((ba20) da20Var).success(Boolean.valueOf(z));
                                        break;
                                    }
                                } else {
                                    qgp0Var.getClass();
                                }
                                z = false;
                                ((ba20) da20Var).success(Boolean.valueOf(z));
                            } catch (IllegalStateException e) {
                                ((ba20) da20Var).error("error", e.getMessage(), null);
                                return;
                            }
                        case "Scribe.startStylusHandwriting":
                            if (Build.VERSION.SDK_INT < 33) {
                                ((ba20) da20Var).error("error", "Requires API level 33 or higher.", null);
                                break;
                            } else {
                                try {
                                    qgp0 qgp0Var2 = pgp0Var.a;
                                    qgp0Var2.a.startStylusHandwriting(qgp0Var2.b);
                                    ((ba20) da20Var).success(null);
                                    break;
                                } catch (IllegalStateException e2) {
                                    ((ba20) da20Var).error("error", e2.getMessage(), null);
                                    return;
                                }
                            }
                        case "Scribe.isStylusHandwritingAvailable":
                            if (Build.VERSION.SDK_INT < 34) {
                                ((ba20) da20Var).error("error", "Requires API level 34 or higher.", null);
                                break;
                            } else {
                                try {
                                    isStylusHandwritingAvailable2 = pgp0Var.a.a.isStylusHandwritingAvailable();
                                    ((ba20) da20Var).success(Boolean.valueOf(isStylusHandwritingAvailable2));
                                    break;
                                } catch (IllegalStateException e3) {
                                    ((ba20) da20Var).error("error", e3.getMessage(), null);
                                    return;
                                }
                            }
                        default:
                            ((ba20) da20Var).notImplemented();
                            break;
                    }
                }
                break;
            default:
                opt0 opt0Var = (opt0) this.b;
                if (opt0Var.a != null) {
                    String str2 = x920Var.a;
                    Object obj = x920Var.b;
                    str2.getClass();
                    if (!str2.equals("SpellCheck.initiateSpellCheck")) {
                        ((ba20) da20Var).notImplemented();
                        break;
                    } else {
                        try {
                            ArrayList arrayList = (ArrayList) obj;
                            opt0Var.a.initiateSpellCheck((String) arrayList.get(0), (String) arrayList.get(1), da20Var);
                            break;
                        } catch (IllegalStateException e4) {
                            ((ba20) da20Var).error("error", e4.getMessage(), null);
                        }
                    }
                }
                break;
        }
    }

    public void p(IconCompat iconCompat) {
        ((lzr0) this.b).e = iconCompat;
    }

    public void q(Intent intent) {
        ((lzr0) this.b).c = new Intent[]{intent};
    }

    @Override // defpackage.kos0
    public void r(int i) {
        RecyclerView flexRecyclerView;
        t1w currentInsets;
        cos0 geometryInput;
        AnchorBottomSheetBehavior bottomSheetBehavior;
        eos0 eos0Var;
        SlidableFlexView slidableFlexView = (SlidableFlexView) this.b;
        slidableFlexView.updateCardBottomPaddingForCurrentState();
        flexRecyclerView = slidableFlexView.flexRecyclerView();
        Integer valueOf = flexRecyclerView != null ? Integer.valueOf(flexRecyclerView.getHeight()) : null;
        currentInsets = slidableFlexView.getCurrentInsets();
        geometryInput = slidableFlexView.geometryInput(valueOf, currentInsets);
        bottomSheetBehavior = slidableFlexView.getBottomSheetBehavior();
        eos0Var = slidableFlexView.sheetGeometryCalculator;
        bottomSheetBehavior.K(((fos0) eos0Var).c(geometryInput), true);
    }

    public void s() {
        ((lzr0) this.b).g = true;
    }

    public void t(x0 x0Var) {
        ((lzr0) this.b).f = new x0[]{x0Var};
    }

    public void u(String str) {
        ((lzr0) this.b).d = str;
    }

    public List v(CharSequence charSequence) {
        charSequence.getClass();
        com.google.common.base.b bVar = new com.google.common.base.b(this, charSequence, (bj9) ((ykn0) this.b).b);
        ArrayList arrayList = new ArrayList();
        while (bVar.hasNext()) {
            arrayList.add((String) bVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // defpackage.jg5
    public void y(ig5 ig5Var, jh5 jh5Var) {
        Map map;
        String str;
        if (!(ig5Var instanceof dqq0) || (map = ((dqq0) ig5Var).a) == null || (str = (String) map.get("last_used_card_id")) == null) {
            return;
        }
        ((j011) this.b).a(str);
    }

    public /* synthetic */ qgn0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public qgn0(CharSequence charSequence, CharSequence charSequence2) {
        this.a = 16;
        this.b = charSequence;
    }

    public qgn0(rqo rqoVar) {
        this.a = 17;
        ljr0.Companion.getClass();
        qqo c = ((jbh) rqoVar).c(ljr0.o);
        this.b = c.a();
    }

    public /* synthetic */ qgn0() {
        this.a = 21;
    }

    public qgn0(Context context, String str) {
        this.a = 18;
        lzr0 lzr0Var = new lzr0();
        this.b = lzr0Var;
        lzr0Var.a = context;
        lzr0Var.b = str;
    }
}
