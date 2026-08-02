package defpackage;

import com.yandex.go.scooters.data.model.AcceptItem$$serializer;
import com.yandex.go.scooters.data.model.AgreementPoint$$serializer;
import com.yandex.go.scooters.data.model.AgreementRules$$serializer;
import com.yandex.go.scooters.data.model.ScootersOnboardingAgreement;
import com.yandex.go.scooters.driver_license.data.model.ScootersDriverLicenseVerificationStatusDto;
import com.yandex.go.scooters.driver_license.data.model.ScootersDriverLicenseVerificationStatusResponse;
import com.yandex.go.scooters.driver_license.data.model.ScootersDriverLicenseVerifyFlowDto;
import com.yandex.go.scooters.driver_license.data.model.ScootersDriverLicenseVerifyParams;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionParams;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionParams$Beacon$$serializer;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionResponse;
import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionResponse$Beacon$$serializer;
import com.yandex.go.scooters.ignition.data.model.v;
import com.yandex.go.scooters.ignition.data.model.x;
import com.yandex.go.scooters.passes.data.model.actions.ScootersBroadcastAction;
import com.yandex.go.scooters.passes.data.model.actions.ScootersBuyPassAction;
import com.yandex.go.scooters.passes.data.model.actions.ScootersChangeAutorenewPaymentMethod;
import com.yandex.go.scooters.passes.data.model.actions.ScootersDisableAutorenewAction;
import com.yandex.go.scooters.passes.data.model.actions.ScootersEnableAutorenewAction;
import com.yandex.go.scooters.passes.data.model.actions.ScootersFreezePassAction;
import com.yandex.go.scooters.passes.data.model.actions.b;
import com.yandex.go.scooters.passes.data.model.actions.c;
import com.yandex.go.scooters.passes.data.model.actions.e;
import com.yandex.go.scooters.passes.data.model.actions.f;
import com.yandex.go.scooters.passes.data.model.actions.g;
import com.yandex.go.scooters.passes.data.model.actions.h;
import com.yandex.go.scooters.payments.api.data.ScootersPaymentMethod$$serializer;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.data.model.ScootersCard;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;
import ru.yandex.taxi.scooters.experiments.c0;
import ru.yandex.taxi.scooters.experiments.d0;
import ru.yandex.taxi.scooters.experiments.f0;

/* loaded from: classes13.dex */
public final /* synthetic */ class s3n0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ s3n0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        zy11 zy11Var2;
        zy11 zy11Var3;
        zy11 zy11Var4;
        switch (this.a) {
            case 0:
                b bVar = ScootersBroadcastAction.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 1:
                c cVar = ScootersBuyPassAction.Companion;
                return ScootersBuyPassAction.PassPurchaseType.Companion.serializer();
            case 2:
                c cVar2 = ScootersBuyPassAction.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 3:
                return vez0.g("com.yandex.go.scooters.passes.data.model.actions.ScootersBuyPassAction.PassPurchaseType", ScootersBuyPassAction.PassPurchaseType.values(), new String[]{"package", "superpass"}, new Annotation[][]{null, null});
            case 4:
                return vez0.g("ru.yandex.taxi.scooters.data.model.ScootersCard", ScootersCard.values(), new String[]{"v2"}, new Annotation[][]{null});
            case 5:
                e eVar = ScootersChangeAutorenewPaymentMethod.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 6:
                e eVar2 = ScootersChangeAutorenewPaymentMethod.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 7:
                c0 c0Var = ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Companion;
                return new p53(new p53(d0.a, 0), 0);
            case 8:
                f0 f0Var = ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item.Companion;
                return ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item.Action.Companion.serializer();
            case 9:
                return vez0.g("ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item.Action", ScootersClientInsuranceNewExperiment.FullInsuranceSuggestion.UpsaleWindow.Item.Action.values(), new String[]{null, "details", "provider_info"}, new Annotation[][]{null, null, null});
            case 10:
                zy11Var = zy11.a;
                return zy11Var;
            case 11:
                f fVar = ScootersDisableAutorenewAction.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 12:
                f fVar2 = ScootersDisableAutorenewAction.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 13:
                return vez0.g("com.yandex.go.scooters.driver_license.data.model.ScootersDriverLicenseVerificationStatusDto", ScootersDriverLicenseVerificationStatusDto.values(), new String[]{"VERIFIED", "FAILED", "PENDING", "UNKNOWN"}, new Annotation[][]{null, null, null, null});
            case 14:
                com.yandex.go.scooters.driver_license.data.model.b bVar2 = ScootersDriverLicenseVerificationStatusResponse.Companion;
                return ScootersDriverLicenseVerificationStatusDto.Companion.serializer();
            case 15:
                return vez0.g("com.yandex.go.scooters.driver_license.data.model.ScootersDriverLicenseVerifyFlowDto", ScootersDriverLicenseVerifyFlowDto.values(), new String[]{"edocument", "no_iin"}, new Annotation[][]{null, null});
            case 16:
                com.yandex.go.scooters.driver_license.data.model.c cVar3 = ScootersDriverLicenseVerifyParams.Companion;
                return ScootersDriverLicenseVerifyFlowDto.Companion.serializer();
            case 17:
                g gVar = ScootersEnableAutorenewAction.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 18:
                g gVar2 = ScootersEnableAutorenewAction.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 19:
                zy11Var2 = zy11.a;
                return zy11Var2;
            case 20:
                zy11Var3 = zy11.a;
                return zy11Var3;
            case 21:
                zy11Var4 = zy11.a;
                return zy11Var4;
            case 22:
                h hVar = ScootersFreezePassAction.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 23:
                h hVar2 = ScootersFreezePassAction.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 24:
                v vVar = ScootersIgnitionParams.Companion;
                return new p53(ScootersPaymentMethod$$serializer.INSTANCE, 0);
            case 25:
                v vVar2 = ScootersIgnitionParams.Companion;
                return new p53(ScootersIgnitionParams$Beacon$$serializer.INSTANCE, 0);
            case 26:
                x xVar = ScootersIgnitionResponse.Companion;
                return new p53(ScootersIgnitionResponse$Beacon$$serializer.INSTANCE, 0);
            case 27:
                com.yandex.go.scooters.data.model.v vVar3 = ScootersOnboardingAgreement.Companion;
                return new p53(AgreementPoint$$serializer.INSTANCE, 0);
            case 28:
                com.yandex.go.scooters.data.model.v vVar4 = ScootersOnboardingAgreement.Companion;
                return new p53(AgreementRules$$serializer.INSTANCE, 0);
            default:
                com.yandex.go.scooters.data.model.v vVar5 = ScootersOnboardingAgreement.Companion;
                return new p53(AcceptItem$$serializer.INSTANCE, 0);
        }
    }
}
