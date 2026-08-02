package defpackage;

import defpackage.l320;
import defpackage.ny61;
import defpackage.s320;
import defpackage.u8g;
import defpackage.yz10;
import kotlin.a;

/* loaded from: classes15.dex */
public final class yz10 {
    public final s320 a;
    public final u8g b;
    public final i3y c = a.a(new sls() { // from class: com.yandex.messaging.ui.onboarding.a
        @Override // defpackage.sls
        public final Object invoke() {
            yz10 yz10Var = yz10.this;
            s320 s320Var = yz10Var.a;
            MessagingOnboardingStatusProvider$onboardingProfileController$2$1 messagingOnboardingStatusProvider$onboardingProfileController$2$1 = new MessagingOnboardingStatusProvider$onboardingProfileController$2$1(0, yz10Var.b, u8g.class, "build", "build()Lcom/yandex/messaging/ui/onboarding/OnboardingProfileDependencies;", 0);
            s320Var.getClass();
            if (l320.a.c(messagingOnboardingStatusProvider$onboardingProfileController$2$1) == null) {
                return null;
            }
            ny61.u();
            return null;
        }
    });

    public yz10(s320 s320Var, u8g u8gVar, lqo lqoVar, rcy0 rcy0Var) {
        this.a = s320Var;
        this.b = u8gVar;
    }
}
