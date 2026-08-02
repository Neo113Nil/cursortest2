package ru.yandex.taxi.scooters.presentation.detailed_order.show_navigation;

import android.graphics.drawable.Drawable;
import com.yandex.mapkit.ScreenPoint;
import defpackage.dvw;
import defpackage.ewo0;
import defpackage.g7h;
import defpackage.j18;
import defpackage.ny61;
import defpackage.r6b;
import defpackage.sls;
import defpackage.tj;
import defpackage.tje;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Position;

/* loaded from: classes6.dex */
public final class a implements ewo0 {
    public final /* synthetic */ ScootersShowNavigationBubbleModalView a;

    public a(ScootersShowNavigationBubbleModalView scootersShowNavigationBubbleModalView) {
        this.a = scootersShowNavigationBubbleModalView;
    }

    @Override // defpackage.ewo0
    public final void Sa(ScreenPoint screenPoint) {
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView;
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView2;
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView3;
        g7h g7hVar;
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView4;
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView5;
        float x;
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView6;
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView7;
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView8;
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView9;
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView10;
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView11;
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView12;
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView13;
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView14;
        float x2 = screenPoint != null ? screenPoint.getX() : 0.0f;
        ScootersShowNavigationBubbleModalView scootersShowNavigationBubbleModalView = this.a;
        scootersShowNavigationBubbleView = scootersShowNavigationBubbleModalView.bubble;
        float width = scootersShowNavigationBubbleView.getWidth() / 2;
        float max = Math.max(x2 - width, scootersShowNavigationBubbleModalView.getLeft());
        scootersShowNavigationBubbleView2 = scootersShowNavigationBubbleModalView.bubble;
        if (scootersShowNavigationBubbleView2.getWidth() + max > scootersShowNavigationBubbleModalView.getRight()) {
            int right = scootersShowNavigationBubbleModalView.getRight();
            scootersShowNavigationBubbleView14 = scootersShowNavigationBubbleModalView.bubble;
            max = right - scootersShowNavigationBubbleView14.getWidth();
        }
        scootersShowNavigationBubbleView3 = scootersShowNavigationBubbleModalView.bubble;
        scootersShowNavigationBubbleView3.setTranslationX(max);
        g7hVar = scootersShowNavigationBubbleModalView.defaultBubbleDecorator;
        DefaultBubbleDecorator$Position defaultBubbleDecorator$Position = DefaultBubbleDecorator$Position.CENTER;
        scootersShowNavigationBubbleView4 = scootersShowNavigationBubbleModalView.bubble;
        if (scootersShowNavigationBubbleView4.getX() + width >= x2) {
            scootersShowNavigationBubbleView12 = scootersShowNavigationBubbleModalView.bubble;
            x = -((scootersShowNavigationBubbleView12.getX() + width) - x2);
            float f = width + x;
            scootersShowNavigationBubbleView13 = scootersShowNavigationBubbleModalView.bubble;
            if (f < scootersShowNavigationBubbleView13.getX() + tje.u(40, scootersShowNavigationBubbleModalView.getContext())) {
                x = -(width - tje.u(40, scootersShowNavigationBubbleModalView.getContext()));
            }
        } else {
            scootersShowNavigationBubbleView5 = scootersShowNavigationBubbleModalView.bubble;
            x = x2 - (scootersShowNavigationBubbleView5.getX() + width);
            scootersShowNavigationBubbleView6 = scootersShowNavigationBubbleModalView.bubble;
            float x3 = scootersShowNavigationBubbleView6.getX() + width + x;
            scootersShowNavigationBubbleView7 = scootersShowNavigationBubbleModalView.bubble;
            float x4 = scootersShowNavigationBubbleView7.getX();
            scootersShowNavigationBubbleView8 = scootersShowNavigationBubbleModalView.bubble;
            if (x3 > (x4 + scootersShowNavigationBubbleView8.getWidth()) - tje.u(40, scootersShowNavigationBubbleModalView.getContext())) {
                x = width - tje.u(40, scootersShowNavigationBubbleModalView.getContext());
            }
        }
        g7hVar.p(defaultBubbleDecorator$Position, x);
        float y = screenPoint != null ? screenPoint.getY() : 0.0f;
        scootersShowNavigationBubbleView9 = scootersShowNavigationBubbleModalView.bubble;
        scootersShowNavigationBubbleView10 = scootersShowNavigationBubbleModalView.bubble;
        scootersShowNavigationBubbleView9.setTranslationY(y - (scootersShowNavigationBubbleView10.getHeight() * 1.1f));
        scootersShowNavigationBubbleView11 = scootersShowNavigationBubbleModalView.bubble;
        scootersShowNavigationBubbleView11.setVisibility(0);
    }

    @Override // defpackage.ewo0
    public final void d8(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView;
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView2;
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView3;
        ScootersShowNavigationBubbleModalView scootersShowNavigationBubbleModalView = this.a;
        scootersShowNavigationBubbleView = scootersShowNavigationBubbleModalView.bubble;
        scootersShowNavigationBubbleView.getTitle().setTitle(charSequence);
        scootersShowNavigationBubbleView2 = scootersShowNavigationBubbleModalView.bubble;
        scootersShowNavigationBubbleView2.getYes().setText(charSequence2);
        scootersShowNavigationBubbleView3 = scootersShowNavigationBubbleModalView.bubble;
        scootersShowNavigationBubbleView3.getNo().setText(charSequence3);
    }

    @Override // defpackage.ewo0
    public final void g7() {
        sls slsVar;
        slsVar = this.a.onNavigateRoute;
        slsVar.invoke();
    }

    @Override // defpackage.ewo0
    public final void goBack() {
        Runnable runnable;
        runnable = this.a.onBackPressedListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ewo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h7(ContinuationImpl continuationImpl) {
        ScootersShowNavigationBubbleModalView$MvpImpl$waitForNextLoop$1 scootersShowNavigationBubbleModalView$MvpImpl$waitForNextLoop$1;
        int i;
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView;
        if (continuationImpl instanceof ScootersShowNavigationBubbleModalView$MvpImpl$waitForNextLoop$1) {
            scootersShowNavigationBubbleModalView$MvpImpl$waitForNextLoop$1 = (ScootersShowNavigationBubbleModalView$MvpImpl$waitForNextLoop$1) continuationImpl;
            int i2 = scootersShowNavigationBubbleModalView$MvpImpl$waitForNextLoop$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersShowNavigationBubbleModalView$MvpImpl$waitForNextLoop$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersShowNavigationBubbleModalView$MvpImpl$waitForNextLoop$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersShowNavigationBubbleModalView$MvpImpl$waitForNextLoop$1.label;
                if (i != 0) {
                    b.b(obj);
                    ScootersShowNavigationBubbleModalView scootersShowNavigationBubbleModalView = this.a;
                    scootersShowNavigationBubbleModalView$MvpImpl$waitForNextLoop$1.L$0 = scootersShowNavigationBubbleModalView;
                    scootersShowNavigationBubbleModalView$MvpImpl$waitForNextLoop$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(scootersShowNavigationBubbleModalView$MvpImpl$waitForNextLoop$1));
                    j18Var.u();
                    r6b r6bVar = new r6b(j18Var, 5);
                    scootersShowNavigationBubbleView = scootersShowNavigationBubbleModalView.bubble;
                    scootersShowNavigationBubbleView.getHandler().post(r6bVar);
                    j18Var.w(new tj(25, scootersShowNavigationBubbleModalView, r6bVar));
                    if (j18Var.s() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        scootersShowNavigationBubbleModalView$MvpImpl$waitForNextLoop$1 = new ScootersShowNavigationBubbleModalView$MvpImpl$waitForNextLoop$1(this, continuationImpl);
        Object obj2 = scootersShowNavigationBubbleModalView$MvpImpl$waitForNextLoop$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersShowNavigationBubbleModalView$MvpImpl$waitForNextLoop$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    @Override // defpackage.ewo0
    public final int i6() {
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView;
        scootersShowNavigationBubbleView = this.a.bubble;
        return scootersShowNavigationBubbleView.getContentContainer().getHeight();
    }

    @Override // defpackage.ewo0
    public final void l1(Drawable drawable) {
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView;
        scootersShowNavigationBubbleView = this.a.bubble;
        scootersShowNavigationBubbleView.setBackground(drawable);
    }

    @Override // defpackage.ewo0
    public final int l5() {
        ScootersShowNavigationBubbleView scootersShowNavigationBubbleView;
        scootersShowNavigationBubbleView = this.a.bubble;
        return scootersShowNavigationBubbleView.getContentContainer().getWidth();
    }
}
