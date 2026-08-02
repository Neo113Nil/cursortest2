package defpackage;

import android.animation.ValueAnimator;
import com.ybsdk.screens.upgrade.presentation.main.UpgradeFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class qa21 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ UpgradeFragment b;

    public /* synthetic */ qa21(UpgradeFragment upgradeFragment, int i) {
        this.a = i;
        this.b = upgradeFragment;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        UpgradeFragment upgradeFragment = this.b;
        switch (i) {
            case 0:
                UpgradeFragment.showInitialLoading$lambda$15$lambda$12(upgradeFragment, valueAnimator);
                break;
            case 1:
                UpgradeFragment.animateToForm$lambda$20$lambda$19(upgradeFragment, valueAnimator);
                break;
            default:
                UpgradeFragment.animateToForm$lambda$22$lambda$21(upgradeFragment, valueAnimator);
                break;
        }
    }
}
