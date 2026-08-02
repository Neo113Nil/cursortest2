package defpackage;

import com.yandex.go.address.models.EditAction;
import com.yandex.go.drive.DriveSdkExperiment;
import com.yandex.go.drive.experiments.DriveLazyInitExperiment;
import com.yandex.go.drive.experiments.a;
import com.yandex.go.drive.sdkintegration.source.DriveStoredRideSession$$serializer;
import com.yandex.go.drive.sdkintegration.source.DriveStoredUserSession;
import com.yandex.go.drive.unifiedpolling.dto.DriveOrderDto$$serializer;
import com.yandex.go.drive.unifiedpolling.dto.DriveOrdersDto;
import com.yandex.go.drive.unifiedpolling.dto.b;
import com.yandex.go.eboks.objects.experiments.EboksObjectsParamsExperiment;
import com.yandex.go.eboks.objects.experiments.EboksObjectsParamsExperiment$Params$$serializer;
import com.yandex.go.eboks.objects.experiments.EboksObjectsParamsExperiment$RowanThinningItem$$serializer;
import com.yandex.go.order.external.unifiedpolling.dto.EatsOrderDto;
import com.yandex.go.order.external.unifiedpolling.dto.EatsOrderDto$Button$$serializer;
import com.yandex.go.order.external.unifiedpolling.dto.status.EatsOrderStatusDto;
import com.yandex.go.splash.data.dto.DynamicSplash;
import com.yandex.go.splash.data.dto.DynamicSplash$$serializer;
import com.yandex.go.splash.data.dto.DynamicSplashScreenResponse;
import com.yandex.go.splash.data.dto.SplashScreenType;
import com.yandex.go.splash.data.dto.c;
import com.yandex.go.splash.data.dto.f;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.persuggest.api.EditActionDto;

/* loaded from: classes9.dex */
public final /* synthetic */ class tvl implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ tvl(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new k8u(auu0.a, new oke(qoi0.a(kr.class), null, new KSerializer[0]), 1);
            case 1:
                return mw5.Companion.serializer();
            case 2:
                return (gwl) gwl.c.getValue();
            case 3:
                return new gwl();
            case 4:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 5:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 6:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 7:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 8:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 9:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 10:
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, new p53(auu0Var, 0), 1);
            case 11:
                a aVar = DriveLazyInitExperiment.Companion;
                return DriveLazyInitExperiment.InitType.Companion.serializer();
            case 12:
                return vez0.g("com.yandex.go.drive.experiments.DriveLazyInitExperiment.InitType", DriveLazyInitExperiment.InitType.values(), new String[]{null, "drive_flow_entered", "drive_final_suggest_availability"}, new Annotation[][]{null, null, null});
            case 13:
                b bVar = DriveOrdersDto.Companion;
                return new p53(DriveOrderDto$$serializer.INSTANCE, 0);
            case 14:
                com.yandex.go.drive.a aVar2 = DriveSdkExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 15:
                return bvf0.c(null);
            case 16:
                return vez0.g("ru.yandex.taxi.object.DriveState", DriveState.values(), new String[]{"preorder", "search", "scheduling", "scheduled", "check_in", "driving", "waiting", "transporting", "complete", "cancelled", "failed", "expired"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null});
            case 17:
                com.yandex.go.drive.sdkintegration.source.b bVar2 = DriveStoredUserSession.Companion;
                return new p53(DriveStoredRideSession$$serializer.INSTANCE, 0);
            case 18:
                i3y i3yVar = w3n.a;
                return 1000000L;
            case 19:
                c cVar = DynamicSplash.Companion;
                return SplashScreenType.Companion.serializer();
            case 20:
                c cVar2 = DynamicSplash.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 21:
                f fVar = DynamicSplashScreenResponse.Companion;
                return new p53(DynamicSplash$$serializer.INSTANCE, 0);
            case 22:
                rdn rdnVar = sdn.Companion;
                return new p53(auu0.a, 0);
            case 23:
                com.yandex.go.order.external.unifiedpolling.dto.c cVar3 = EatsOrderDto.Companion;
                return EatsOrderStatusDto.Companion.serializer();
            case 24:
                com.yandex.go.order.external.unifiedpolling.dto.c cVar4 = EatsOrderDto.Companion;
                return new p53(EatsOrderDto$Button$$serializer.INSTANCE, 0);
            case 25:
                com.yandex.go.eboks.objects.experiments.a aVar3 = EboksObjectsParamsExperiment.Companion;
                return new p53(EboksObjectsParamsExperiment$Params$$serializer.INSTANCE, 0);
            case 26:
                com.yandex.go.eboks.objects.experiments.b bVar3 = EboksObjectsParamsExperiment.Params.Companion;
                return new p53(EboksObjectsParamsExperiment$RowanThinningItem$$serializer.INSTANCE, 0);
            case 27:
                return vez0.g("com.yandex.go.address.models.EditAction", EditAction.values(), new String[]{"EDIT", "CLEAR"}, new Annotation[][]{null, null});
            case 28:
                return vez0.g("ru.yandex.taxi.persuggest.api.EditActionDto", EditActionDto.values(), new String[]{"edit", "clear"}, new Annotation[][]{null, null});
            default:
                return new o4o("ru.yandex.taxi.delivery.models.data.experiment.Effect.Unknown", wpn.INSTANCE, new Annotation[0]);
        }
    }
}
