package defpackage;

import android.graphics.Insets;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.suggest.impl.view.error.a;
import defpackage.yfw0;
import java.util.List;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes14.dex */
public final class yfw0 extends a {
    public rm j;
    public float k;

    @Override // com.yandex.go.suggest.impl.view.error.a
    public final void b() {
        GoFrameLayout p;
        rm rmVar = this.j;
        if (rmVar == null || (p = rmVar.p()) == null) {
            return;
        }
        OneShotPreDrawListener.add(p, new h3s0(3, p));
    }

    @Override // com.yandex.go.suggest.impl.view.error.a
    public final void c(ThemeType themeType) {
        ((AppCompatTextView) m().g).setTextColor(qje.t(xng0.textMain, m().p().getContext()));
        xvy0.b(m().p(), themeType, false, new c90(19));
    }

    @Override // com.yandex.go.suggest.impl.view.error.a
    public final ViewGroup d(ViewGroup viewGroup) {
        rm rmVar;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(hkh0.superapp_suggest_error_floating_placeholder, viewGroup, false);
        int i = x7h0.content_container;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
        if (frameLayout != null) {
            i = x7h0.error_container;
            GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
            if (goLinearLayout != null) {
                i = x7h0.order_taxi_button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent != null) {
                    i = x7h0.reload_button;
                    ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                    if (buttonComponent2 != null) {
                        i = x7h0.title;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i, inflate);
                        if (appCompatTextView != null) {
                            rmVar = new rm((GoFrameLayout) inflate, frameLayout, goLinearLayout, buttonComponent, buttonComponent2, appCompatTextView, 11);
                            this.j = rmVar;
                            GoFrameLayout p = m().p();
                            OneShotPreDrawListener.add(p, new do91(15, p, this));
                            ((ButtonComponent) m().f).setRippleColor(new bdc(xng0.controlPressed));
                            ((ButtonComponent) m().e).setRippleColor(new bdc(xng0.controlPressed));
                            Boolean bool = tp11.a;
                            tp11.b(3, (ButtonComponent) m().e);
                            return m().p();
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        rmVar = null;
        this.j = rmVar;
        GoFrameLayout p2 = m().p();
        OneShotPreDrawListener.add(p2, new do91(15, p2, this));
        ((ButtonComponent) m().f).setRippleColor(new bdc(xng0.controlPressed));
        ((ButtonComponent) m().e).setRippleColor(new bdc(xng0.controlPressed));
        Boolean bool2 = tp11.a;
        tp11.b(3, (ButtonComponent) m().e);
        return m().p();
    }

    @Override // com.yandex.go.suggest.impl.view.error.a
    public final void e() {
        this.j = null;
    }

    @Override // com.yandex.go.suggest.impl.view.error.a
    public final FrameLayout f() {
        return (FrameLayout) m().c;
    }

    @Override // com.yandex.go.suggest.impl.view.error.a
    public final void i() {
        final int i = 0;
        ((ButtonComponent) m().f).setDebounceClickListener(new Runnable(this) { // from class: xfw0
            public final /* synthetic */ yfw0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                yfw0 yfw0Var = this.b;
                switch (i2) {
                    case 0:
                        yfw0Var.h();
                        break;
                    default:
                        yfw0Var.g();
                        break;
                }
            }
        });
        final int i2 = 1;
        ((ButtonComponent) m().e).setDebounceClickListener(new Runnable(this) { // from class: xfw0
            public final /* synthetic */ yfw0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                yfw0 yfw0Var = this.b;
                switch (i22) {
                    case 0:
                        yfw0Var.h();
                        break;
                    default:
                        yfw0Var.g();
                        break;
                }
            }
        });
    }

    @Override // com.yandex.go.suggest.impl.view.error.a
    public final void j() {
        if (!jx81.d()) {
            tje.j(new s5w0(6, this), m().p());
            return;
        }
        GoFrameLayout p = m().p();
        n2v0 n2v0Var = new n2v0(5, this);
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.o(p, n2v0Var);
        m().p().setWindowInsetsAnimationCallback(new WindowInsetsAnimation$Callback() { // from class: com.yandex.go.suggest.impl.view.error.SuperappSuggestFloatingErrorController$setupInsets$1
            {
                super(0);
            }

            public WindowInsets onProgress(WindowInsets insets, List<WindowInsetsAnimation> runningAnimations) {
                int systemBars;
                Insets insets2;
                int ime;
                Insets insets3;
                systemBars = WindowInsets.Type.systemBars();
                insets2 = insets.getInsets(systemBars);
                int i = insets2.bottom;
                ime = WindowInsets.Type.ime();
                insets3 = insets.getInsets(ime);
                yfw0.this.n(Math.max(i, insets3.bottom));
                return insets;
            }
        });
    }

    @Override // com.yandex.go.suggest.impl.view.error.a
    public final void k() {
        ((ButtonComponent) m().f).setVisibility(0);
        ((ButtonComponent) m().e).setVisibility(0);
        ((ButtonComponent) m().f).setButtonTitleColor(new bdc(xng0.textMain));
        ((ButtonComponent) m().f).setButtonBackground(new bdc(xng0.controlMinor));
        Boolean bool = tp11.a;
        tp11.b(0, (ButtonComponent) m().f);
    }

    @Override // com.yandex.go.suggest.impl.view.error.a
    public final void l() {
        ((ButtonComponent) m().f).setVisibility(0);
        ((ButtonComponent) m().e).setVisibility(8);
        ((ButtonComponent) m().f).setButtonBackground(new bdc(xng0.controlMain));
        ((ButtonComponent) m().f).setButtonTitleColor(new bdc(xng0.textOnControl));
        Boolean bool = tp11.a;
        tp11.b(3, (ButtonComponent) m().f);
    }

    public final rm m() {
        rm rmVar = this.j;
        if (rmVar != null) {
            return rmVar;
        }
        ny61.g("Required value was null.");
        return null;
    }

    public final void n(int i) {
        ((GoLinearLayout) m().d).setTranslationY((((GoLinearLayout) m().d).getTop() - ((m().p().getHeight() - i) * this.k)) * (-1.0f));
    }
}
