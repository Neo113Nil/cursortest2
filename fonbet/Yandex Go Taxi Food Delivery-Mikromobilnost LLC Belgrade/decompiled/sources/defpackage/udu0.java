package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.messaging.internal.view.timeline.i;

/* loaded from: classes15.dex */
public final class udu0 extends RecyclerView.g {
    public final ValueAnimator a;
    public final ValueAnimator b;
    public int c;
    public final vbb d;
    public final m8t0 e = new m8t0(22, this);
    public final Handler f = new Handler(Looper.getMainLooper());

    public udu0(vbb vbbVar) {
        this.d = vbbVar;
        final int i = 0;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        this.a = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: tdu0
            public final /* synthetic */ udu0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                udu0 udu0Var = this.b;
                switch (i2) {
                    case 0:
                        udu0Var.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        break;
                    default:
                        udu0Var.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        break;
                }
            }
        });
        ofInt.setDuration(50L);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(255, 0);
        this.b = ofInt2;
        final int i2 = 1;
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: tdu0
            public final /* synthetic */ udu0 b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i22 = i2;
                udu0 udu0Var = this.b;
                switch (i22) {
                    case 0:
                        udu0Var.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        break;
                    default:
                        udu0Var.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        break;
                }
            }
        });
        ofInt2.setDuration(500L);
    }

    public final void a(int i) {
        this.c = i;
        vbb vbbVar = this.d;
        qaz0 qaz0Var = ((i) vbbVar.a).B;
        qaz0Var.K.setAlpha(255 - i);
        qaz0Var.T.setAlpha(i);
        qaz0Var.a0 = i;
        ((RecyclerView) vbbVar.b).invalidate();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        m8t0 m8t0Var = this.e;
        Handler handler = this.f;
        if (i != 1) {
            if (i == 0) {
                handler.postDelayed(m8t0Var, 1000L);
                return;
            }
            return;
        }
        handler.removeCallbacks(m8t0Var);
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator.isRunning() || this.c == 255) {
            return;
        }
        ValueAnimator valueAnimator2 = this.b;
        if (valueAnimator2.isRunning()) {
            valueAnimator2.cancel();
            valueAnimator.setCurrentPlayTime((this.c * 50) / 255);
        }
        valueAnimator.start();
    }
}
