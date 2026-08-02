package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.due.data.api.dto.UserInfo;
import com.yandex.go.due.data.api.dto.w;
import com.yandex.go.navigator.user_placemark.UserArrowToggleExperiment;
import com.yandex.go.navigator.user_placemark.a;
import com.yandex.go.payments.cards.data.model.UserCardProfileResponse;
import com.yandex.go.payments.cards.data.model.l;
import com.yandex.go.payments.data.model.UserCardProfileDto;
import com.yandex.go.payments.data.model.w0;
import com.yandex.go.taxi.order.jobs.UpdateOrderStatusJob;
import com.yandex.go.taxi.order.models.api.experiments.UseFeedbackProposalExperiment;
import com.yandex.go.taxi.order.models.api.experiments.i;
import com.yandex.go.taxi.order.models.api.objects.UserActions;
import com.yandex.go.taxi.order.models.api.objects.s1;
import com.yandex.go.zone.dto.objects.ScheduledOrderDescriptionItem$$serializer;
import com.ybsdk.screens.upgrade.presentation.main.UpgradeFragment;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.video.m3.list_player_manager.model.StreamType;

/* loaded from: classes13.dex */
public final /* synthetic */ class z121 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ z121(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        qa3 shimmerAdapter_delegate$lambda$1;
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                int i = UpdateOrderStatusJob.f;
                break;
            case 8:
                break;
            case 9:
                shimmerAdapter_delegate$lambda$1 = UpgradeFragment.shimmerAdapter_delegate$lambda$1();
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                int offset = TimeZone.getDefault().getOffset(System.currentTimeMillis());
                int i2 = offset / Constants.ONE_HOUR;
                break;
            case 19:
                break;
            case 20:
                MapBuilder mapBuilder = new MapBuilder();
                for (StreamType streamType : yf21.a) {
                    String name = streamType.name();
                    Locale locale = Locale.ROOT;
                    mapBuilder.put(name.toUpperCase(locale), streamType);
                    mapBuilder.put(streamType.name().toLowerCase(locale), streamType);
                }
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                i iVar = UseFeedbackProposalExperiment.Companion;
                break;
            case 24:
                s1 s1Var = UserActions.Companion;
                break;
            case 25:
                a aVar = UserArrowToggleExperiment.Companion;
                auu0 auu0Var = auu0.a;
                break;
            case 26:
                w0 w0Var = UserCardProfileDto.Companion;
                break;
            case 27:
                l lVar = UserCardProfileResponse.UserCardProfile.Companion;
                break;
            case 28:
                w wVar = UserInfo.Companion;
                break;
            default:
                w wVar2 = UserInfo.Companion;
                break;
        }
        return new p53(ScheduledOrderDescriptionItem$$serializer.INSTANCE, 0);
    }
}
