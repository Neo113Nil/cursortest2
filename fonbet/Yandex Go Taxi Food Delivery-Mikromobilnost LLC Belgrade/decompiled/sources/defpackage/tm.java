package defpackage;

import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.b;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes14.dex */
public final class tm extends vm {
    public ViewPropertyAnimator R;
    public final qg S;
    public final float T;
    public final float U;
    public q V;
    public final /* synthetic */ wm W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(wm wmVar, rm rmVar) {
        super(rmVar);
        this.W = wmVar;
        qg qgVar = new qg();
        this.S = qgVar;
        float d = c.d(wug0.achievement_inactive_image_width, this.a);
        float d2 = c.d(wug0.achievement_inactive_image_height, this.a);
        float d3 = c.d(wug0.achievement_active_image_width, this.a);
        this.T = d / d3;
        float d4 = c.d(wug0.achievement_active_image_height, this.a);
        this.U = d2 / d4;
        this.P.setPivotX(d3 / 2.0f);
        this.P.setPivotY(d4 / 2.0f);
        b.p(this.N, qgVar);
        this.a.setOnClickListener(new tf(2, this));
    }

    @Override // defpackage.vm
    public final void W(r8i0 r8i0Var, s8i0 s8i0Var) {
        ru.yandex.taxi.utils.c cVar = this.W.a;
        String str = r8i0Var.b;
        String str2 = r8i0Var.e;
        this.O.setText(str);
        X(r8i0Var.c, false);
        this.S.a = r8i0Var.c;
        this.V = new q(1, r8i0Var, this, s8i0Var);
        String str3 = r8i0Var.d;
        if (str3.length() <= 0 || str2.length() <= 0) {
            return;
        }
        nac nacVar = (nac) cVar.a.a(this.P);
        nacVar.e(n4h0.achievement_selected_fallback);
        nacVar.b(new obv(str3, null, 6, 0));
        nac nacVar2 = (nac) cVar.a.a(this.Q);
        nacVar2.e(n4h0.achievement_unselected_fallback);
        nacVar2.b(new obv(str2, null, 6, 0));
    }

    public final void X(boolean z, boolean z2) {
        ViewPropertyAnimator viewPropertyAnimator = this.R;
        AppCompatImageView appCompatImageView = this.Q;
        final int i = 0;
        AppCompatImageView appCompatImageView2 = this.P;
        if (z) {
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            if (!z2) {
                appCompatImageView2.setScaleX(1.0f);
                appCompatImageView2.setScaleY(1.0f);
                appCompatImageView2.setVisibility(0);
                appCompatImageView.setVisibility(8);
                return;
            }
            ViewPropertyAnimator withStartAction = appCompatImageView2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(new AccelerateInterpolator()).withStartAction(new Runnable(this) { // from class: sm
                public final /* synthetic */ tm b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    tm tmVar = this.b;
                    switch (i2) {
                        case 0:
                            AppCompatImageView appCompatImageView3 = tmVar.P;
                            appCompatImageView3.setScaleX(1.0f);
                            appCompatImageView3.setScaleY(1.0f);
                            appCompatImageView3.setVisibility(0);
                            tmVar.Q.setVisibility(8);
                            break;
                        default:
                            AppCompatImageView appCompatImageView4 = tmVar.P;
                            appCompatImageView4.setScaleX(tmVar.T);
                            appCompatImageView4.setScaleY(tmVar.U);
                            appCompatImageView4.setVisibility(8);
                            tmVar.Q.setVisibility(0);
                            break;
                    }
                }
            });
            this.R = withStartAction;
            if (withStartAction != null) {
                withStartAction.start();
                return;
            }
            return;
        }
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        float f = this.U;
        float f2 = this.T;
        if (!z2) {
            appCompatImageView2.setScaleX(f2);
            appCompatImageView2.setScaleY(f);
            appCompatImageView2.setVisibility(8);
            appCompatImageView.setVisibility(0);
            return;
        }
        ViewPropertyAnimator interpolator = appCompatImageView2.animate().scaleX(f2).scaleY(f).setDuration(150L).setInterpolator(new AccelerateInterpolator());
        final int i2 = 1;
        ViewPropertyAnimator withStartAction2 = interpolator.withStartAction(new Runnable(this) { // from class: sm
            public final /* synthetic */ tm b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                tm tmVar = this.b;
                switch (i22) {
                    case 0:
                        AppCompatImageView appCompatImageView3 = tmVar.P;
                        appCompatImageView3.setScaleX(1.0f);
                        appCompatImageView3.setScaleY(1.0f);
                        appCompatImageView3.setVisibility(0);
                        tmVar.Q.setVisibility(8);
                        break;
                    default:
                        AppCompatImageView appCompatImageView4 = tmVar.P;
                        appCompatImageView4.setScaleX(tmVar.T);
                        appCompatImageView4.setScaleY(tmVar.U);
                        appCompatImageView4.setVisibility(8);
                        tmVar.Q.setVisibility(0);
                        break;
                }
            }
        });
        this.R = withStartAction2;
        if (withStartAction2 != null) {
            withStartAction2.start();
        }
    }
}
