package defpackage;

import com.yandex.go.agreement.photoupload.experiments.PhotoUploadEulaExperiment;
import com.yandex.go.agreement.photoupload.experiments.b;
import com.yandex.go.business.impl.experiment.YangoBusinessExperiment;
import com.yandex.go.experiment.UserPhotoUploadingExperiment;
import com.yandex.go.payments.paymentlist.experiments.GPayAllowedCardNetworksExperiment;
import com.yandex.go.payments.paymentlist.experiments.MaasPaymentOptionExperiment;
import com.yandex.go.payments.promo.PaymentMethodsPromoBannerExperiment;
import com.yandex.go.profile.config.SuperAppConfigProfileExperiment;
import com.yandex.go.something_wrong_screen.experiment.SomethingWrongScreenExperiment;
import com.yandex.go.splash.data.dto.AnimatedSplashScreenExperiment;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes8.dex */
public final /* synthetic */ class zf2 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ rqo b;

    public /* synthetic */ zf2(rqo rqoVar, int i) {
        this.a = i;
        this.b = rqoVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        rqo rqoVar = this.b;
        switch (i) {
            case 0:
                return ((jbh) rqoVar).e(AnimatedSplashScreenExperiment.d);
            case 1:
                return ((jbh) rqoVar).c(GPayAllowedCardNetworksExperiment.e);
            case 2:
                return ((jbh) rqoVar).a(SimpleBooleanExperiment.INAPP_CALLS_DYNAMIC_FEATURE_PREFETCH);
            case 3:
                return ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.LAUNCH_AND_TOTW_METRICS);
            case 4:
                return ((jbh) rqoVar).a(SimpleBooleanExperiment.LAYERS_ANDROID_PERF);
            case 5:
                return ((jbh) rqoVar).c(MaasPaymentOptionExperiment.d);
            case 6:
                return ((jbh) rqoVar).a(SimpleBooleanExperiment.MAAS_SUBSCRIPTION);
            case 7:
                return ((jbh) rqoVar).a(SimpleBooleanExperiment.MULTICLASS_FILTER_TARIFF_REQUIREMENTS);
            case 8:
                return ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.ENABLE_NOTIFICATION_RATING_DECORATIONS);
            case 9:
                PaymentMethodsPromoBannerExperiment.Companion.getClass();
                return ((jbh) rqoVar).b(PaymentMethodsPromoBannerExperiment.f);
            case 10:
                PhotoUploadEulaExperiment.Companion.getClass();
                return ((jbh) rqoVar).b(b.a());
            case 11:
                return ((jbh) rqoVar).e(rtb0.m);
            case 12:
                return ((jbh) rqoVar).a(SimpleBooleanExperiment.MULTICLASS_FILTER_TARIFF_REQUIREMENTS);
            case 13:
                return ((jbh) rqoVar).a(SimpleBooleanExperiment.SAFETY_USER_VERIFICATION);
            case 14:
                return ((jbh) rqoVar).c(SomethingWrongScreenExperiment.j);
            case 15:
                return (SuperAppConfigProfileExperiment) ((jbh) rqoVar).e(SuperAppConfigProfileExperiment.d).c();
            case 16:
                lzx0.Companion.getClass();
                return ((jbh) rqoVar).c(lzx0.c);
            case 17:
                return ((jbh) rqoVar).b(soz0.j);
            case 18:
                return ((jbh) rqoVar).c(dc11.g);
            case 19:
                UserPhotoUploadingExperiment.Companion.getClass();
                return ((jbh) rqoVar).c(UserPhotoUploadingExperiment.h);
            case 20:
                return ((jbh) rqoVar).a(SimpleBooleanExperiment.YANDEX_PAY);
            default:
                YangoBusinessExperiment.Companion.getClass();
                return ((jbh) rqoVar).d(YangoBusinessExperiment.h);
        }
    }
}
