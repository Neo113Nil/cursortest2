package kotlin.text;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class CatchingFishGlideMockkFAB extends AnimatorListenerAdapter {
    public final /* synthetic */ int CatchingFishCoroutine;
    public final /* synthetic */ CatchingFishPicassoEspresso CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ TextView CatchingFishReduxKtor;
    public final /* synthetic */ TextView CatchingFishSnackbar;

    public CatchingFishGlideMockkFAB(CatchingFishPicassoEspresso catchingFishPicassoEspresso, int i, TextView textView, int i2, TextView textView2) {
        this.CatchingFishDaggerWebsocket = catchingFishPicassoEspresso;
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = textView;
        this.CatchingFishCoroutine = i2;
        this.CatchingFishReduxKtor = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        CatchingFishDataStoreBundle catchingFishDataStoreBundle;
        int i = this.CatchingFishParcelableFAB;
        CatchingFishPicassoEspresso catchingFishPicassoEspresso = this.CatchingFishDaggerWebsocket;
        catchingFishPicassoEspresso.CatchingFishUnitTesting = i;
        catchingFishPicassoEspresso.CatchingFishEspressoTesting = null;
        TextView textView = this.CatchingFishSnackbar;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.CatchingFishCoroutine == 1 && (catchingFishDataStoreBundle = catchingFishPicassoEspresso.CatchingFishNavigation) != null) {
                catchingFishDataStoreBundle.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.CatchingFishReduxKtor;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.CatchingFishReduxKtor;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
