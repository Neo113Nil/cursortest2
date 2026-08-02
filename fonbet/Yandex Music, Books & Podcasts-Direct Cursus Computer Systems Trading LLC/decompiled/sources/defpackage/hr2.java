package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.timepicker.ClockHandView;
import com.yandex.passport.common.ui.view.FancyProgressBar;
import com.yandex.passport.common.ui.view.d;
import com.yandex.passport.internal.widget.InputFieldView;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.bdui.templating.render.a;
import com.yandex.plus.home.dailyquests.feature.internal.ui.states.c;
import com.yandex.plus.plaquesdk.design.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class hr2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hr2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                k5c k5cVar = qr2.G;
                ((qr2) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                return;
            case 1:
                mr2 mr2Var = (mr2) obj;
                mr2Var.t = 1.0f - valueAnimator.getAnimatedFraction();
                WeakHashMap weakHashMap = wdu.a;
                mr2Var.postInvalidateOnAnimation();
                return;
            case 2:
                int i2 = ClockHandView.n;
                ((ClockHandView) obj).b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                ms7 ms7Var = (ms7) obj;
                int i3 = ms7.J;
                ms7Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ms7Var.invalidate(ms7Var.a);
                return;
            case 4:
                ns7 ns7Var = (ns7) obj;
                int i4 = ns7.y0;
                ns7Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ns7Var.invalidate(ns7Var.a);
                return;
            case 5:
                kz7 kz7Var = (kz7) obj;
                kz7Var.q.e = kz7Var.v.getInterpolation(kz7Var.u.getAnimatedFraction());
                return;
            case 6:
                ((wra) obj).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                asa asaVar = (asa) obj;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = asaVar.b;
                if (animatorUpdateListener != null) {
                    animatorUpdateListener.onAnimationUpdate(valueAnimator);
                }
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                Float f = (Float) animatedValue;
                gn0[] gn0VarArr = asaVar.c;
                if (gn0VarArr == null) {
                    Intrinsics.j("animationActors");
                    throw null;
                }
                for (gn0 gn0Var : gn0VarArr) {
                    gn0Var.a.invoke(f);
                }
                return;
            case 8:
                valueAnimator.getClass();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                int intValue = ((Integer) animatedValue2).intValue();
                Iterator it = ((HashSet) ((mmo) obj).b).iterator();
                while (it.hasNext()) {
                    ((mkf) it.next()).setBorderAlpha(intValue);
                }
                return;
            case 9:
                czg czgVar = (czg) obj;
                pt1 pt1Var = czgVar.L;
                if (pt1Var == null) {
                    pt1Var = pt1.a;
                }
                if (pt1Var == pt1.b) {
                    czgVar.invalidateSelf();
                    return;
                }
                xr5 xr5Var = czgVar.o;
                if (xr5Var != null) {
                    xr5Var.q(czgVar.b.e());
                    return;
                }
                return;
            case 10:
                ddh ddhVar = (ddh) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ddhVar.j.setAlpha((int) (255.0f * floatValue));
                ddhVar.x = floatValue;
                return;
            case 11:
                ((ClippableRoundedCornerLayout) obj).a(r4.getLeft(), r4.getTop(), r4.getRight(), r4.getBottom(), (float[]) valueAnimator.getAnimatedValue());
                return;
            case 12:
                aqa aqaVar = (aqa) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (aqaVar.i != floatValue2) {
                    aqaVar.i = floatValue2;
                    aqaVar.invalidateSelf();
                    return;
                }
                return;
            case 13:
                ((j4c) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 14:
                t8p t8pVar = (t8p) obj;
                t8pVar.j.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                t8pVar.p.getTextView().setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                ((ImageButton) obj).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                valueAnimator.getClass();
                ((hdq) obj).invalidateSelf();
                return;
            case 17:
                valueAnimator.getClass();
                View view = ((lls) obj).getView();
                if (view != null) {
                    Object animatedValue3 = valueAnimator.getAnimatedValue();
                    animatedValue3.getClass();
                    view.setTranslationX(((Float) animatedValue3).floatValue());
                    return;
                }
                return;
            case 18:
                d dVar = (d) obj;
                int i5 = d.d;
                valueAnimator.getClass();
                Object animatedValue4 = valueAnimator.getAnimatedValue();
                animatedValue4.getClass();
                dVar.a = ((Float) animatedValue4).floatValue();
                dVar.invalidate();
                return;
            case 19:
                FancyProgressBar fancyProgressBar = (FancyProgressBar) obj;
                int i6 = FancyProgressBar.f;
                valueAnimator.getClass();
                Object animatedValue5 = valueAnimator.getAnimatedValue();
                animatedValue5.getClass();
                fancyProgressBar.a = ((Float) animatedValue5).floatValue();
                fancyProgressBar.invalidate();
                return;
            case 20:
                InputFieldView inputFieldView = (InputFieldView) obj;
                inputFieldView.i.setPadding(inputFieldView.k, inputFieldView.l, ((Integer) valueAnimator.getAnimatedValue()).intValue(), inputFieldView.m);
                return;
            case 21:
                valueAnimator.getClass();
                Object animatedValue6 = valueAnimator.getAnimatedValue();
                animatedValue6.getClass();
                ((Function1) obj).invoke((Integer) animatedValue6);
                return;
            case 22:
                com.yandex.plus.home.animation.d dVar2 = (com.yandex.plus.home.animation.d) obj;
                int i7 = com.yandex.plus.home.animation.d.r;
                valueAnimator.getClass();
                Object animatedValue7 = valueAnimator.getAnimatedValue();
                animatedValue7.getClass();
                dVar2.q = ((Float) animatedValue7).floatValue();
                dVar2.invalidate();
                return;
            case 23:
                c cVar = (c) obj;
                valueAnimator.getClass();
                Object animatedValue8 = valueAnimator.getAnimatedValue();
                animatedValue8.getClass();
                float floatValue3 = ((Float) animatedValue8).floatValue();
                f fVar = cVar.b;
                s9f[] s9fVarArr = c.g;
                ((View) fVar.g(s9fVarArr[0])).setAlpha(floatValue3);
                ((View) cVar.c.g(s9fVarArr[1])).setAlpha(floatValue3);
                ((View) cVar.d.g(s9fVarArr[2])).setAlpha(floatValue3);
                ((View) cVar.e.g(s9fVarArr[3])).setAlpha(floatValue3);
                return;
            case 24:
                valueAnimator.getClass();
                Object animatedValue9 = valueAnimator.getAnimatedValue();
                animatedValue9.getClass();
                ((a) obj).invoke((Float) animatedValue9);
                return;
            case 25:
                valueAnimator.getClass();
                Object animatedValue10 = valueAnimator.getAnimatedValue();
                animatedValue10.getClass();
                ((a) obj).invoke((Float) animatedValue10);
                return;
            case 26:
                valueAnimator.getClass();
                Object animatedValue11 = valueAnimator.getAnimatedValue();
                animatedValue11.getClass();
                ((com.yandex.plus.bdui.plus.webview.navigation.a) obj).invoke((Integer) animatedValue11);
                return;
            default:
                ((e) obj).setThumbProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
