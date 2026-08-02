package defpackage;

import ru.yandex.taxi.banners.PromoBannerActivationStatus;
import ru.yandex.taxi.communications.benefitscenter.BenefitsCenterNotification;
import ru.yandex.taxi.communications.benefitscenter.b;

/* loaded from: classes.dex */
public final class zq4 {
    public final zuj0 a;
    public final b b;

    public zq4(zuj0 zuj0Var, b bVar) {
        this.a = zuj0Var;
        this.b = bVar;
    }

    public final void a(PromoBannerActivationStatus promoBannerActivationStatus) {
        int i = yq4.a[promoBannerActivationStatus.ordinal()];
        zuj0 zuj0Var = this.a;
        b bVar = this.b;
        if (i == 1) {
            String h = ((avj0) zuj0Var).h(kyh0.benefits_center_promo_add_success_notification);
            int i2 = y1h0.ic_success_activation;
            BenefitsCenterNotification a = bVar.a(h, null);
            bVar.d.e(a);
            a.setImage(i2);
            return;
        }
        if (i != 2) {
            w511.b();
            return;
        }
        String h2 = ((avj0) zuj0Var).h(kyh0.benefits_center_promo_add_error_notification);
        int i3 = y1h0.ic_error_activation;
        BenefitsCenterNotification a2 = bVar.a(h2, null);
        bVar.d.e(a2);
        a2.setImage(i3);
    }
}
