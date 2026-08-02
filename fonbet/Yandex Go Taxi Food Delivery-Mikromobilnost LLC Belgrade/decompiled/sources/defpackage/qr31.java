package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.a;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.tooltips.manager.TooltipPlacement;
import ru.yandex.taxi.widget.accessibility.AccessibilityLiveRegionTextView;

/* loaded from: classes6.dex */
public final class qr31 {
    public final FrameLayout a;
    public final gvz0 b;
    public final g7h c;
    public pr31 e;
    public sls f;
    public tls g;
    public mr31 h;
    public TooltipPlacement i;
    public final i3y d = a.a(new ec31(6, this));
    public final k4c0 j = new k4c0();

    public qr31(FrameLayout frameLayout, gvz0 gvz0Var) {
        this.a = frameLayout;
        this.b = gvz0Var;
        this.c = new g7h(frameLayout.getContext());
    }

    public final void a() {
        if (this.e != null) {
            b();
            BubbleComponent.hide$default(c().a, false, 1, null);
        }
        this.e = null;
        this.h = null;
    }

    public final void b() {
        Object value;
        LinkedHashMap linkedHashMap;
        mr31 mr31Var;
        tls tlsVar;
        if (this.e != null && (mr31Var = this.h) != null && (tlsVar = this.g) != null) {
            tlsVar.invoke(mr31Var);
        }
        if (this.i != null) {
            r0 r0Var = this.b.a;
            do {
                value = r0Var.getValue();
                linkedHashMap = new LinkedHashMap((Map) value);
                linkedHashMap.remove(this.j);
            } while (!r0Var.k(value, linkedHashMap));
            this.i = null;
        }
        pr31 pr31Var = this.e;
        if (pr31Var != null) {
            ons0 ons0Var = pr31Var.i;
            View view = pr31Var.a;
            view.removeOnAttachStateChangeListener(pr31Var.h);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnScrollChangedListener(pr31Var.j);
            }
            view.removeOnLayoutChangeListener(ons0Var);
            pr31Var.f.removeOnLayoutChangeListener(ons0Var);
            pr31Var.b.removeOnLayoutChangeListener(ons0Var);
        }
        BubbleComponent.hide$default(c().a, false, 1, null);
    }

    public final nr31 c() {
        return (nr31) this.d.getValue();
    }

    public final boolean d(View view, mr31 mr31Var, TooltipPlacement tooltipPlacement) {
        if (this.h == null) {
            mr31Var.getClass();
        }
        this.h = mr31Var;
        AccessibilityLiveRegionTextView accessibilityLiveRegionTextView = c().c;
        String str = mr31Var.a;
        boolean z = mr31Var.c;
        accessibilityLiveRegionTextView.setText(str);
        c().c.setGravity(mr31Var.f);
        Integer num = mr31Var.e;
        if (num != null) {
            c().c.setMaxLines(num.intValue());
        }
        if (mr31Var.d) {
            c().b.setVisibility(z ? 0 : 8);
        } else {
            c().b.setVisibility(8);
        }
        c().a.setImportantForAccessibility(1);
        c().c.setImportantForAccessibility(1);
        c().c.setAccessibilityLiveRegion(true);
        sls slsVar = this.f;
        if (!z) {
            slsVar = null;
        }
        c.z(slsVar, c().a);
        pr31 pr31Var = this.e;
        if (view == (pr31Var != null ? pr31Var.a : null) && this.i == tooltipPlacement && c().a.getVisibility() == 0) {
            return true;
        }
        b();
        BubbleComponent bubbleComponent = c().a;
        if (bubbleComponent.getParent() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = c.d(mrg0.go_design_m_space, view);
            layoutParams.rightMargin = tje.r(mrg0.go_design_m_space, view.getContext());
            layoutParams.gravity = 3;
            bubbleComponent.setBubbleColor(mr31Var.g);
            this.a.addView(bubbleComponent, layoutParams);
        }
        this.e = new pr31(view, bubbleComponent, this.c, mr31Var.i);
        if (tooltipPlacement != null && !this.b.a(this.j, tooltipPlacement)) {
            return false;
        }
        this.i = tooltipPlacement;
        pr31 pr31Var2 = this.e;
        if (pr31Var2 != null) {
            ons0 ons0Var = pr31Var2.i;
            View view2 = pr31Var2.a;
            view2.addOnAttachStateChangeListener(pr31Var2.h);
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnScrollChangedListener(pr31Var2.j);
            }
            view2.addOnLayoutChangeListener(ons0Var);
            pr31Var2.f.addOnLayoutChangeListener(ons0Var);
            pr31Var2.b.addOnLayoutChangeListener(ons0Var);
        }
        BubbleComponent.show$default(c().a, false, 1, null);
        return true;
    }
}
