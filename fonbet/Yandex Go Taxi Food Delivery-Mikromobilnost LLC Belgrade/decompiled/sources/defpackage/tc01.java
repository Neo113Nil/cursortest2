package defpackage;

import androidx.recyclerview.widget.h;
import com.yandex.go.masstransit.sdk.order.impl.orders.w;
import com.yandex.go.masstransit.sdk.trains.impl.search.TrainStationSuggestDto$$serializer;
import com.yandex.go.masstransit.sdk.trains.impl.search.TrainStationSuggestsResponseDto;
import com.yandex.go.masstransit.sdk.trains.impl.search.c;
import com.yandex.go.payments.data.model.TransportCardDto;
import com.yandex.go.payments.data.model.TransportCardDto$TransportCardPaymentAction$$serializer;
import com.yandex.go.payments.data.model.q0;
import com.yandex.go.taxi.order.chat.api.data.model.TranslationSettings;
import com.yandex.go.taxi.order.chat.api.data.model.k;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.TransportCubeIconBackgroundType;
import com.yandex.go.transfer_requirement.transferapi.TransferErrorDto;
import com.yandex.go.transfer_requirement.transferapi.TransferErrorDto$$serializer;
import com.yandex.go.transfer_requirement.transferapi.TransferParam;
import com.yandex.go.transfer_requirement.transferapi.b;
import com.yandex.go.transfer_requirement.transferapi.check.TransferCheckResponse;
import com.yandex.go.transfer_requirement.transferapi.check.e;
import com.yandex.go.transfer_requirement.transferapi.draft.TransferDraftResponse;
import com.yandex.go.transfer_requirement.transferapi.draft.d;
import com.yandex.go.transfer_requirement.transferapi.draft.f;
import com.ybsdk.feature.transfer.internal.screens.targets.presentation.TransferTargetsFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputFragment;
import flex.parser.transition.TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator;
import flex.parser.transition.TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.UUID;
import kotlin.collections.EmptySet;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.masstransit.experiment.ExperimentAction;
import ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment;

/* loaded from: classes3.dex */
public final /* synthetic */ class tc01 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ tc01(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        h itemAnimator_delegate$lambda$2;
        h itemAnimator_delegate$lambda$1;
        List list = null;
        int i = 0;
        switch (this.a) {
            case 0:
                c cVar = TrainStationSuggestsResponseDto.Companion;
                return new p53(TrainStationSuggestDto$$serializer.INSTANCE, 0);
            case 1:
                return new uf01(i);
            case 2:
                return new o4o("com.yandex.go.transfer_requirement.transferapi.check.TransferCheckDto.UnknownType", com.yandex.go.transfer_requirement.transferapi.check.c.INSTANCE, new Annotation[0]);
            case 3:
                e eVar = TransferCheckResponse.Companion;
                return new p53(TransferErrorDto$$serializer.INSTANCE, 0);
            case 4:
                return new o4o("com.yandex.go.transfer_requirement.transferapi.draft.TransferDraftDto.UnknownType", d.INSTANCE, new Annotation[0]);
            case 5:
                f fVar = TransferDraftResponse.Companion;
                return new p53(TransferErrorDto$$serializer.INSTANCE, 0);
            case 6:
                b bVar = TransferErrorDto.Companion;
                return TransferErrorDto.TransferDraftErrorCode.Companion.serializer();
            case 7:
                return vez0.g("com.yandex.go.transfer_requirement.transferapi.TransferErrorDto.TransferDraftErrorCode", TransferErrorDto.TransferDraftErrorCode.values(), new String[]{null, "BAD_REQUEST", "TRANSFER_NOT_FOUND", "TRIP_NOT_FOUND", "EXPLICIT_GREETING", "NOT_RETRYABLE_ERROR"}, new Annotation[][]{null, null, null, null, null, null});
            case 8:
                return new vk01(null, EmptySet.a);
            case 9:
                return UUID.randomUUID().toString();
            case 10:
                return new t8j0();
            case 11:
                return new t8j0();
            case 12:
                com.yandex.go.transfer_requirement.transferapi.d dVar = TransferParam.Companion;
                return TransferParam.TransferType.Companion.serializer();
            case 13:
                com.yandex.go.transfer_requirement.transferapi.d dVar2 = TransferParam.Companion;
                return new p53(auu0.a, 0);
            case 14:
                return vez0.g("com.yandex.go.transfer_requirement.transferapi.TransferParam.TransferType", TransferParam.TransferType.values(), new String[]{"avia", "train"}, new Annotation[][]{null, null});
            case 15:
                itemAnimator_delegate$lambda$2 = TransferPhoneInputFragment.itemAnimator_delegate$lambda$2();
                return itemAnimator_delegate$lambda$2;
            case 16:
                return new yn01(i);
            case 17:
                return new zq01(list, 15);
            case 18:
                itemAnimator_delegate$lambda$1 = TransferTargetsFragment.itemAnimator_delegate$lambda$1();
                return itemAnimator_delegate$lambda$1;
            case 19:
                return TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator.Companion.serializer();
            case 20:
                return TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition.Companion.serializer();
            case 21:
                return vez0.g("flex.parser.transition.TransitionSettingsParser.TransitionSettingsSurrogate.Option.Interpolator", TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator.values(), new String[]{"linear", "easeIn", "easeOut", "easeInOut"}, new Annotation[][]{null, null, null, null});
            case 22:
                return vez0.g("flex.parser.transition.TransitionSettingsParser.TransitionSettingsSurrogate.Option.Transition", TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition.values(), new String[]{"crossDissolve", "bottomSurfacing"}, new Annotation[][]{null, null});
            case 23:
                k kVar = TranslationSettings.Companion;
                return new p53(auu0.a, 0);
            case 24:
                q0 q0Var = TransportCardDto.Companion;
                return TransportCardDto.CardStatus.Companion.serializer();
            case 25:
                q0 q0Var2 = TransportCardDto.Companion;
                return new p53(TransportCardDto$TransportCardPaymentAction$$serializer.INSTANCE, 0);
            case 26:
                return vez0.g("com.yandex.go.payments.data.model.TransportCardDto.CardStatus", TransportCardDto.CardStatus.values(), new String[]{ClidProvider.APP_ACTIVE, "blocked"}, new Annotation[][]{null, null});
            case 27:
                return vez0.g("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.TransportCubeIconBackgroundType", TransportCubeIconBackgroundType.values(), new String[]{"square", "circle"}, new Annotation[][]{null, null});
            case 28:
                ru.yandex.taxi.masstransit.experiment.k kVar2 = TransportOnSummaryExperiment.b.Companion;
                return ExperimentAction.Companion.serializer();
            default:
                return new o4o("com.yandex.go.masstransit.sdk.order.impl.orders.TransportPassDto.Unsupported", w.INSTANCE, new Annotation[0]);
        }
    }
}
