package defpackage;

import com.yandex.go.beginners.flow.PreGeoAuthOnboardingModalView;

/* loaded from: classes12.dex */
public final class uge0 implements xge0 {
    public final /* synthetic */ PreGeoAuthOnboardingModalView a;

    public uge0(PreGeoAuthOnboardingModalView preGeoAuthOnboardingModalView) {
        this.a = preGeoAuthOnboardingModalView;
    }

    @Override // defpackage.xge0
    public final void E1() {
        tge0 tge0Var;
        tge0 tge0Var2;
        PreGeoAuthOnboardingModalView preGeoAuthOnboardingModalView = this.a;
        if (preGeoAuthOnboardingModalView.isAttachedToWindow()) {
            tge0Var = preGeoAuthOnboardingModalView.entranceAnimations;
            tge0Var.g = true;
            tge0Var2 = preGeoAuthOnboardingModalView.entranceAnimations;
            tge0Var2.e = true;
            tge0Var2.e();
        }
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        ahe0 ahe0Var = (ahe0) obj;
        PreGeoAuthOnboardingModalView preGeoAuthOnboardingModalView = this.a;
        preGeoAuthOnboardingModalView.setupLogo();
        preGeoAuthOnboardingModalView.setupTitles(ahe0Var);
        preGeoAuthOnboardingModalView.setupRideIconHorizontalFlip();
        preGeoAuthOnboardingModalView.setupButton(ahe0Var);
        preGeoAuthOnboardingModalView.setupAgreementBlock(ahe0Var);
    }
}
