package defpackage;

import android.view.View;
import com.yandex.go.beginners.presentation.BeginnersOnboardingModalView;
import com.yandex.go.beginners.presentation.services_info.animation.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class vk5 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ BeginnersOnboardingModalView b;

    public /* synthetic */ vk5(BeginnersOnboardingModalView beginnersOnboardingModalView, int i) {
        this.a = i;
        this.b = beginnersOnboardingModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        View insetsType$lambda$0;
        a servicesAnimationManager_delegate$lambda$0;
        int i = this.a;
        BeginnersOnboardingModalView beginnersOnboardingModalView = this.b;
        switch (i) {
            case 0:
                insetsType$lambda$0 = BeginnersOnboardingModalView.insetsType$lambda$0(beginnersOnboardingModalView);
                return insetsType$lambda$0;
            default:
                servicesAnimationManager_delegate$lambda$0 = BeginnersOnboardingModalView.servicesAnimationManager_delegate$lambda$0(beginnersOnboardingModalView);
                return servicesAnimationManager_delegate$lambda$0;
        }
    }
}
