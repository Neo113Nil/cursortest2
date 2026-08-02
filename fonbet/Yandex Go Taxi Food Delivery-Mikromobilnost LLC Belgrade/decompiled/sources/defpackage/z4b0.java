package defpackage;

import com.yandex.go.agreement.photoupload.experiments.PhotoUploadEulaExperiment;
import com.yandex.go.agreement.photoupload.experiments.b;
import com.yandex.go.payments.data.model.PersonalWalletDto;
import com.yandex.go.payments.data.model.PersonalWalletDto$Discount$$serializer;
import com.yandex.go.payments.data.model.PersonalWalletDto$Payment$$serializer;
import com.yandex.go.payments.data.model.PersonalWalletDto$PaymentOrder$$serializer;
import com.yandex.go.payments.data.model.d0;
import com.yandex.go.payments.data.model.f0;
import com.yandex.go.payments.data.model.g0;
import com.yandex.go.pickup_from_photo.data.model.PhotoCoordinates$$serializer;
import com.yandex.go.pickup_from_photo.data.model.PhotoRecognitionStatus;
import com.yandex.go.pickup_from_photo.data.model.PickupFromPhotoGetResultResponse;
import com.yandex.go.pickup_from_photo.experiment.PickupPhotoRecognitionExperiment;
import com.yandex.go.pickup_from_photo.experiment.PickupPhotoRecognitionExperiment$Step$$serializer;
import com.yandex.go.pickup_from_photo.experiment.d;
import com.yandex.go.pickup_from_photo.experiment.e;
import com.yandex.go.pickup_from_photo.presentation.PickupFromPhotoModalView;
import com.yandex.go.taxi.order.models.api.objects.a1;
import com.ybsdk.feature.pfm.internal.ui.widgets.PfmCategoriesView;
import com.ybsdk.feature.pfm.internal.ui.widgets.PfmExpandedCategoryHeaderView;
import com.ybsdk.feature.pfm.internal.ui.widgets.PfmFunFactView;
import defpackage.j7b0;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.payments.ListPaymentMethodDtoType;
import ru.yandex.taxi.scooters.data.model.PhotoType;

/* loaded from: classes13.dex */
public final /* synthetic */ class z4b0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ z4b0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        boolean isCategoriesItemAnimatorEnabled$lambda$0;
        boolean isCategoriesSizeAnimationEnabled$lambda$1;
        boolean isSecondLevelAnimationsEnabled$lambda$2;
        boolean animationEnabled$lambda$0;
        boolean animationEnabled$lambda$02;
        w8v imageCapture_delegate$lambda$0;
        zy11 zy11Var2;
        zy11 zy11Var3;
        zy11 zy11Var4;
        zy11 zy11Var5;
        zy11 zy11Var6;
        zy11 zy11Var7;
        switch (this.a) {
            case 0:
                zy11Var = zy11.a;
                return zy11Var;
            case 1:
                p7b0 p7b0Var = j7b0.d.Companion;
                return new p53(m7b0.a, 0);
            case 2:
                d0 d0Var = PersonalWalletDto.Companion;
                return new p53(PersonalWalletDto$Payment$$serializer.INSTANCE, 0);
            case 3:
                d0 d0Var2 = PersonalWalletDto.Companion;
                return new p53(PersonalWalletDto$Discount$$serializer.INSTANCE, 0);
            case 4:
                d0 d0Var3 = PersonalWalletDto.Companion;
                return new p53(PersonalWalletDto$PaymentOrder$$serializer.INSTANCE, 0);
            case 5:
                f0 f0Var = PersonalWalletDto.Payment.Companion;
                return ListPaymentMethodDtoType.Companion.serializer();
            case 6:
                g0 g0Var = PersonalWalletDto.PaymentOrder.Companion;
                return PersonalWalletDto.PaymentOrder.Status.Companion.serializer();
            case 7:
                return vez0.g("com.yandex.go.payments.data.model.PersonalWalletDto.PaymentOrder.Status", PersonalWalletDto.PaymentOrder.Status.values(), new String[]{"not_found", "expired", "processing", "failed", "succeeded"}, new Annotation[][]{null, null, null, null, null});
            case 8:
                isCategoriesItemAnimatorEnabled$lambda$0 = PfmCategoriesView.isCategoriesItemAnimatorEnabled$lambda$0();
                return Boolean.valueOf(isCategoriesItemAnimatorEnabled$lambda$0);
            case 9:
                isCategoriesSizeAnimationEnabled$lambda$1 = PfmCategoriesView.isCategoriesSizeAnimationEnabled$lambda$1();
                return Boolean.valueOf(isCategoriesSizeAnimationEnabled$lambda$1);
            case 10:
                isSecondLevelAnimationsEnabled$lambda$2 = PfmCategoriesView.isSecondLevelAnimationsEnabled$lambda$2();
                return Boolean.valueOf(isSecondLevelAnimationsEnabled$lambda$2);
            case 11:
                animationEnabled$lambda$0 = PfmExpandedCategoryHeaderView.animationEnabled$lambda$0();
                return Boolean.valueOf(animationEnabled$lambda$0);
            case 12:
                animationEnabled$lambda$02 = PfmFunFactView.animationEnabled$lambda$0();
                return Boolean.valueOf(animationEnabled$lambda$02);
            case 13:
                return vez0.g("com.yandex.go.pickup_from_photo.data.model.PhotoRecognitionStatus", PhotoRecognitionStatus.values(), new String[]{"done", "in_progress", "failed", null}, new Annotation[][]{null, null, null, null});
            case 14:
                return vez0.g("ru.yandex.taxi.scooters.data.model.PhotoType", PhotoType.values(), new String[]{"completion", "feedback"}, new Annotation[][]{null, null});
            case 15:
                b bVar = PhotoUploadEulaExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 16:
                return new ajb0(255);
            case 17:
                com.yandex.go.pickup_from_photo.data.model.b bVar2 = PickupFromPhotoGetResultResponse.Companion;
                return PhotoRecognitionStatus.Companion.serializer();
            case 18:
                com.yandex.go.pickup_from_photo.data.model.b bVar3 = PickupFromPhotoGetResultResponse.Companion;
                return new p53(qke.n(PhotoCoordinates$$serializer.INSTANCE), 0);
            case 19:
                imageCapture_delegate$lambda$0 = PickupFromPhotoModalView.imageCapture_delegate$lambda$0();
                return imageCapture_delegate$lambda$0;
            case 20:
                e eVar = PickupPhotoRecognitionExperiment.Companion;
                return new p53(auu0.a, 0);
            case 21:
                e eVar2 = PickupPhotoRecognitionExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 22:
                d dVar = PickupPhotoRecognitionExperiment.CameraScreen.Companion;
                return new p53(PickupPhotoRecognitionExperiment$Step$$serializer.INSTANCE, 0);
            case 23:
                return new o4o("com.yandex.go.taxi.order.models.api.objects.PickupPointPinNotification.UnknownAction", a1.INSTANCE, new Annotation[0]);
            case 24:
                zy11Var2 = zy11.a;
                return zy11Var2;
            case 25:
                zy11Var3 = zy11.a;
                return zy11Var3;
            case 26:
                zy11Var4 = zy11.a;
                return zy11Var4;
            case 27:
                zy11Var5 = zy11.a;
                return zy11Var5;
            case 28:
                zy11Var6 = zy11.a;
                return zy11Var6;
            default:
                zy11Var7 = zy11.a;
                return zy11Var7;
        }
    }
}
