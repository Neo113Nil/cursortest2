package defpackage;

import android.view.Choreographer;
import com.yandex.go.feed_video.actions.ListVideoPlayerUpdateItemsAction;
import com.yandex.go.feed_video.actions.d;
import com.yandex.go.feed_video.actions.models.MediaItemDto$$serializer;
import com.yandex.go.navigator.main_screen.experiement.ListButtonsDto;
import com.yandex.go.navigator.main_screen.experiement.a;
import com.yandex.go.navigator.models.ControlButtonDto$$serializer;
import com.yandex.go.payments.data.model.response.AddPaymentMethodButton$$serializer;
import com.yandex.go.payments.data.model.response.CoopAccountUiDto$$serializer;
import com.yandex.go.payments.data.model.response.ListPaymentMethodsUiDto;
import com.yandex.go.payments.data.model.response.PaymentsNotification$$serializer;
import com.yandex.go.payments.data.model.response.o0;
import com.yandex.go.shortcuts.dto.response.Layout;
import com.yandex.go.shortcuts.dto.response.t;
import com.yandex.go.shortcuts.models.LayoutType;
import defpackage.owx;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.common.startup.StartupRequest;
import ru.yandex.taxi.layers.experiments.LayersObjectsAnimationParamsExperiment;
import ru.yandex.taxi.layers.experiments.e;
import ru.yandex.taxi.location.dto.LbsResponse;

/* loaded from: classes9.dex */
public final /* synthetic */ class wwx implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ wwx(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ywx ywxVar = owx.e.Companion;
                return new p53(new p53(auu0.a, 0), 0);
            case 1:
                e eVar = LayersObjectsAnimationParamsExperiment.AnimationParams.Companion;
                return LayersObjectsAnimationParamsExperiment.AnimationParams.AnimationType.Companion.serializer();
            case 2:
                return vez0.g("ru.yandex.taxi.layers.experiments.LayersObjectsAnimationParamsExperiment.AnimationParams.AnimationType", LayersObjectsAnimationParamsExperiment.AnimationParams.AnimationType.values(), new String[]{null, "fade"}, new Annotation[][]{null, null});
            case 3:
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 4:
                return Choreographer.getInstance();
            case 5:
                t tVar = Layout.Companion;
                return LayoutType.Companion.serializer();
            case 6:
                return vez0.g("com.yandex.go.shortcuts.models.LayoutType", LayoutType.values(), new String[]{"linear_grid"}, new Annotation[][]{null});
            case 7:
                return new p53(y7y.a, 0);
            case 8:
                return new p53(b8y.a, 0);
            case 9:
                ru.yandex.taxi.location.dto.e eVar2 = LbsResponse.b.Companion;
                return LbsResponse.Type.Companion.serializer();
            case 10:
                return vez0.g("ru.yandex.taxi.location.dto.LbsResponse.Type", LbsResponse.Type.values(), new String[]{StartupRequest.PARAM_WIFI, "ip", "gsm"}, new Annotation[][]{null, null, null});
            case 11:
                return new p53(new oke(qoi0.a(kr.class), null, new KSerializer[0]), 0);
            case 12:
                a aVar = ListButtonsDto.Companion;
                return new p53(ControlButtonDto$$serializer.INSTANCE, 0);
            case 13:
                o0 o0Var = ListPaymentMethodsUiDto.Companion;
                return new p53(AddPaymentMethodButton$$serializer.INSTANCE, 0);
            case 14:
                o0 o0Var2 = ListPaymentMethodsUiDto.Companion;
                return new p53(CoopAccountUiDto$$serializer.INSTANCE, 0);
            case 15:
                o0 o0Var3 = ListPaymentMethodsUiDto.Companion;
                return new p53(PaymentsNotification$$serializer.INSTANCE, 0);
            case 16:
                d dVar = ListVideoPlayerUpdateItemsAction.Companion;
                return new p53(MediaItemDto$$serializer.INSTANCE, 0);
            case 17:
                return Integer.valueOf(jth0.list_yandex_div_player_view);
            case 18:
                ovy ovyVar = rvy.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 19:
                c0z c0zVar = f0z.Companion;
                return new p53(d0z.a, 0);
            case 20:
                c0z c0zVar2 = f0z.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 21:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 22:
                a7u0 a7u0Var = k4z.a;
                return x4c.N;
            case 23:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 24:
                return new p53(auu0.a, 1);
            case 25:
                return new p53(auu0.a, 1);
            case 26:
                return new p53(auu0.a, 1);
            case 27:
                return new p53(auu0.a, 1);
            case 28:
                throw new IllegalStateException("No ShimmerAnimationState provided");
            default:
                qwd qwdVar = f5z.a;
                return null;
        }
    }
}
