package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes3.dex */
public final class id3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomAppBar b;

    public /* synthetic */ id3(BottomAppBar bottomAppBar, int i) {
        this.a = i;
        this.b = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.a;
        BottomAppBar bottomAppBar = this.b;
        switch (i) {
            case 1:
                int i2 = BottomAppBar.a1;
                bottomAppBar.F0 = null;
                break;
            case 2:
                int i3 = BottomAppBar.a1;
                bottomAppBar.S0 = false;
                bottomAppBar.G0 = null;
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        float fabTranslationX;
        int i = this.a;
        BottomAppBar bottomAppBar = this.b;
        switch (i) {
            case 0:
                if (!bottomAppBar.S0) {
                    bottomAppBar.G(bottomAppBar.H0, bottomAppBar.T0);
                    break;
                }
                break;
            case 1:
                int i2 = BottomAppBar.a1;
                break;
            case 2:
                int i3 = BottomAppBar.a1;
                break;
            default:
                bottomAppBar.Y0.onAnimationStart(animator);
                View C = bottomAppBar.C();
                FloatingActionButton floatingActionButton = C instanceof FloatingActionButton ? (FloatingActionButton) C : null;
                if (floatingActionButton != null) {
                    fabTranslationX = bottomAppBar.getFabTranslationX();
                    floatingActionButton.setTranslationX(fabTranslationX);
                    break;
                }
                break;
        }
    }
}
