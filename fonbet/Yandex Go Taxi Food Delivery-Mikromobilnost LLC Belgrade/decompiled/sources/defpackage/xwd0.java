package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes15.dex */
public final class xwd0 extends RecyclerView.g {
    public final /* synthetic */ ywd0 a;

    public xwd0(ywd0 ywd0Var) {
        this.a = ywd0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            ywd0 ywd0Var = this.a;
            if (ywd0Var.x) {
                ywd0Var.w = false;
                View view = ywd0Var.B;
                view.animate().cancel();
                if (view.getVisibility() != 0) {
                    view.setAlpha(0.0f);
                    view.setTranslationY(view.getHeight() / 2.0f);
                    view.setVisibility(0);
                }
                view.animate().alpha(1.0f).translationY(0.0f).setInterpolator(new FastOutSlowInInterpolator()).setListener(null).start();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ywd0 ywd0Var = this.a;
        final View view = ywd0Var.B;
        if (Math.abs(i2) <= 0 || ywd0Var.w || !view.isShown()) {
            return;
        }
        ywd0Var.w = true;
        view.animate().cancel();
        if (view.getVisibility() != 0) {
            return;
        }
        view.animate().alpha(0.0f).translationY(view.getHeight() / 2.0f).setInterpolator(new FastOutSlowInInterpolator()).setListener(new AnimatorListenerAdapter() { // from class: com.yandex.messaging.extension.view.ViewExtensionsKt$hideWithSlide$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                view.setVisibility(8);
                view.setAlpha(1.0f);
                view.setTranslationY(0.0f);
            }
        }).start();
    }
}
