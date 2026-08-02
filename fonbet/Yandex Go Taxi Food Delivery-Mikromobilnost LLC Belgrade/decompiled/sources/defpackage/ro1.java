package defpackage;

import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationResponse;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationState;
import com.yandex.go.ai_widget.data.model.f;
import com.yandex.go.ai_widget.data.model.g;
import com.yandex.go.due.data.api.dto.AllowedTimeInfo;
import com.yandex.go.due.data.api.dto.a;
import com.yandex.go.preorder.source.altpins.Alternatives;
import com.yandex.go.preorder.source.altpins.Alternatives$PinIconAnnotationDto$TopLeadingAnnotation;
import com.yandex.go.preorder.source.altpins.Alternatives$PinIconAnnotationDto$Unsupported;
import com.yandex.go.preorder.source.altpins.Alternatives$PinIconStateDto$PinIconDto;
import com.yandex.go.preorder.source.altpins.Alternatives$PinStateDto$$serializer;
import com.yandex.go.preorder.source.altpins.Alternatives$RoutePartItemDto$MultimodalBikeRoutePart;
import com.yandex.go.preorder.source.altpins.Alternatives$RoutePartItemDto$MultimodalElectroBikeRoutePart;
import com.yandex.go.preorder.source.altpins.a1;
import com.yandex.go.preorder.source.altpins.h0;
import com.yandex.go.preorder.source.altpins.j0;
import com.yandex.go.preorder.source.altpins.k0;
import com.yandex.go.preorder.source.altpins.m;
import com.yandex.go.preorder.source.altpins.o0;
import com.yandex.go.preorder.source.altpins.p;
import com.yandex.go.preorder.source.altpins.z0;
import com.yandex.go.taxi.order.models.api.response.AllowedChange;
import com.yandex.go.taxi.order.models.api.response.e;

/* loaded from: classes13.dex */
public final /* synthetic */ class ro1 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ ro1(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        zy11 zy11Var2;
        switch (this.a) {
            case 0:
                f fVar = AiWidgetEvaluationResponse.Companion;
                break;
            case 1:
                g gVar = AiWidgetEvaluationState.Companion;
                break;
            case 2:
                break;
            case 3:
                l690 l690Var = cr1.a;
                break;
            case 4:
                zy11Var = zy11.a;
                break;
            case 5:
                zy11Var2 = zy11.a;
                break;
            case 6:
                gt1 gt1Var = ht1.Companion;
                break;
            case 7:
                gt1 gt1Var2 = ht1.Companion;
                break;
            case 8:
                break;
            case 9:
                e eVar = AllowedChange.Companion;
                break;
            case 10:
                e eVar2 = AllowedChange.Companion;
                break;
            case 11:
                a aVar = AllowedTimeInfo.Companion;
                break;
            case 12:
                bw1 bw1Var = cw1.Companion;
                break;
            case 13:
                break;
            case 14:
                m mVar = Alternatives.ConfirmationScreen.Action.Companion;
                break;
            case 15:
                break;
            case 16:
                p pVar = Alternatives.ConfirmationScreen.Buttons.Companion;
                break;
            case 17:
                p pVar2 = Alternatives.ConfirmationScreen.Buttons.Companion;
                break;
            case 18:
                break;
            case 19:
                h0 h0Var = Alternatives.PinIconActionDto.Companion;
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                j0 j0Var = Alternatives$PinIconAnnotationDto$TopLeadingAnnotation.Companion;
                break;
            case 24:
                k0 k0Var = Alternatives$PinIconAnnotationDto$Unsupported.Companion;
                break;
            case 25:
                break;
            case 26:
                o0 o0Var = Alternatives$PinIconStateDto$PinIconDto.Companion;
                break;
            case 27:
                break;
            case 28:
                z0 z0Var = Alternatives$RoutePartItemDto$MultimodalBikeRoutePart.Companion;
                break;
            default:
                a1 a1Var = Alternatives$RoutePartItemDto$MultimodalElectroBikeRoutePart.Companion;
                break;
        }
        return new p53(Alternatives$PinStateDto$$serializer.INSTANCE, 0);
    }
}
