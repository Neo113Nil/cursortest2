package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.animation.LinearInterpolator;
import defpackage.zcu0;

/* loaded from: classes5.dex */
public final /* synthetic */ class ycu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zcu0 b;

    public /* synthetic */ ycu0(zcu0 zcu0Var, int i) {
        this.a = i;
        this.b = zcu0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        final zcu0 zcu0Var = this.b;
        switch (i) {
            case 0:
                ValueAnimator valueAnimator = zcu0Var.e;
                valueAnimator.removeAllListeners();
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.cancel();
                ValueAnimator valueAnimator2 = new ValueAnimator();
                zcu0Var.e = valueAnimator2;
                valueAnimator2.setIntValues(1900, 0);
                zcu0Var.e.setDuration(1900L);
                zcu0Var.e.setInterpolator(new LinearInterpolator());
                zcu0Var.e.addUpdateListener(new xcu0(zcu0Var, 1));
                zcu0Var.e.addListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.eatskit.widget.placeholder.grocery.mvp.StickerSplashViewPresenter$startHideAnimation$2
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation, boolean isReverse) {
                        zcu0.this.b();
                    }
                });
                Handler handler = zcu0Var.f;
                handler.removeCallbacksAndMessages(null);
                handler.postDelayed(new ycu0(zcu0Var, 1), zcu0Var.e.getDuration());
                zcu0Var.e.start();
                break;
            default:
                zcu0Var.b();
                break;
        }
    }
}
