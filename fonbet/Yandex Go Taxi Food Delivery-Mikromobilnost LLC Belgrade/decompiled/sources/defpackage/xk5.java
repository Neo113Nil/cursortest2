package defpackage;

import android.animation.Animator;
import android.view.View;
import androidx.core.view.b;
import com.yandex.go.beginners.presentation.BeginnersOnboardingModalView;
import com.yandex.go.beginners.presentation.services_info.animation.CommonServicesAnimationManager$startServiceAnimation$lambda$0$$inlined$doOnDetach$1;
import com.yandex.go.beginners.presentation.services_info.animation.a;
import com.yandex.go.beginners.presentation.services_info.views.ServicesMainInfoContainer;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.badge.DiscountBadgeView;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes12.dex */
public final class xk5 implements cl5 {
    public final /* synthetic */ BeginnersOnboardingModalView a;

    public xk5(BeginnersOnboardingModalView beginnersOnboardingModalView) {
        this.a = beginnersOnboardingModalView;
    }

    @Override // defpackage.cl5
    public final void R0() {
        a servicesAnimationManager;
        servicesAnimationManager = this.a.getServicesAnimationManager();
        servicesAnimationManager.d(0L);
    }

    @Override // defpackage.cl5
    public final void disableExitAnimation() {
        this.a.disableExitAnimation();
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        f0w0 f0w0Var;
        pwy0 pwy0Var;
        rk5 binding;
        rk5 binding2;
        rk5 binding3;
        rk5 binding4;
        rk5 binding5;
        rk5 binding6;
        rk5 binding7;
        bl5 bl5Var = (bl5) obj;
        BeginnersOnboardingModalView beginnersOnboardingModalView = this.a;
        f0w0Var = beginnersOnboardingModalView.superAppHeaderLogoViewDelegate;
        pwy0Var = beginnersOnboardingModalView.themeSwitcherProvider;
        boolean z = pwy0Var.getThemeType() == ThemeType.LIGHT;
        ((jlh) f0w0Var).getClass();
        int i = z ? m2h0.ic_default_logo : m2h0.ic_default_logo_night;
        binding = beginnersOnboardingModalView.getBinding();
        binding.d.setImageResource(i);
        binding2 = beginnersOnboardingModalView.getBinding();
        binding2.d.setTransitionName("splash_logo_transition");
        binding3 = beginnersOnboardingModalView.getBinding();
        binding3.e.setVisibility(0);
        binding4 = beginnersOnboardingModalView.getBinding();
        ButtonComponent buttonComponent = binding4.b;
        String str = bl5Var.d;
        String str2 = bl5Var.b;
        ArrayList arrayList = bl5Var.e;
        buttonComponent.setText(str);
        if (arrayList.isEmpty()) {
            buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControl));
            buttonComponent.setButtonBackground(new bdc(xng0.controlMain));
        } else {
            buttonComponent.setEnabled(bl5Var.g);
            buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControlMinor));
            buttonComponent.setButtonBackground(new bdc(xng0.controlMinor));
        }
        binding5 = beginnersOnboardingModalView.getBinding();
        DiscountBadgeView discountBadgeView = binding5.c;
        discountBadgeView.setText(str2);
        discountBadgeView.setVisibility(str2.length() <= 0 ? 8 : 0);
        discountBadgeView.setAlpha(arrayList.isEmpty() ? 1.0f : 0.0f);
        binding6 = beginnersOnboardingModalView.getBinding();
        binding6.f.setText(bl5Var.c);
        binding7 = beginnersOnboardingModalView.getBinding();
        binding7.g.setupServicesInfo(arrayList, bl5Var.f);
    }

    @Override // defpackage.cl5
    public final void startAnimation() {
        final a servicesAnimationManager;
        servicesAnimationManager = this.a.getServicesAnimationManager();
        if (servicesAnimationManager.h) {
            return;
        }
        ServicesMainInfoContainer c = servicesAnimationManager.c();
        WeakHashMap weakHashMap = b.a;
        if (!c.isLaidOut() || c.isLayoutRequested()) {
            c.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.beginners.presentation.services_info.animation.CommonServicesAnimationManager$startServiceAnimation$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    a.a(a.this);
                    ServicesMainInfoContainer c2 = a.this.c();
                    WeakHashMap weakHashMap2 = b.a;
                    boolean isAttachedToWindow = c2.isAttachedToWindow();
                    a aVar = a.this;
                    if (isAttachedToWindow) {
                        c2.addOnAttachStateChangeListener(new CommonServicesAnimationManager$startServiceAnimation$lambda$0$$inlined$doOnDetach$1(c2, aVar));
                        return;
                    }
                    Animator animator = aVar.i;
                    if (animator != null) {
                        animator.cancel();
                    }
                }
            });
            return;
        }
        a.a(servicesAnimationManager);
        ServicesMainInfoContainer c2 = servicesAnimationManager.c();
        if (c2.isAttachedToWindow()) {
            c2.addOnAttachStateChangeListener(new CommonServicesAnimationManager$startServiceAnimation$lambda$0$$inlined$doOnDetach$1(c2, servicesAnimationManager));
            return;
        }
        Animator animator = servicesAnimationManager.i;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // defpackage.cl5
    public final void startProgress() {
        rk5 binding;
        binding = this.a.getBinding();
        ButtonComponent buttonComponent = binding.b;
        buttonComponent.startProgress();
        buttonComponent.setClickable(false);
        buttonComponent.setFocusable(false);
        buttonComponent.setOnTouchListener(new cz2(1));
    }

    @Override // defpackage.cl5
    public final void stopProgress() {
        rk5 binding;
        binding = this.a.getBinding();
        ButtonComponent buttonComponent = binding.b;
        buttonComponent.stopAnimation();
        buttonComponent.setClickable(true);
        buttonComponent.setFocusable(true);
        buttonComponent.setOnTouchListener(null);
    }
}
