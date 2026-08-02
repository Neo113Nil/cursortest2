package defpackage;

import androidx.recyclerview.widget.h;
import com.yandex.go.due.data.api.dto.AllowedTimeInfo$$serializer;
import com.yandex.go.due.data.api.dto.ScheduledOrderAvailabilityRequest;
import com.yandex.go.due.data.api.dto.ScheduledOrderAvailabilityResponse;
import com.yandex.go.due.data.api.dto.ScheduledOrderButton;
import com.yandex.go.due.data.api.dto.k;
import com.yandex.go.due.data.api.dto.m;
import com.yandex.go.due.data.api.dto.o;
import com.yandex.go.due.data.api.dto.r;
import com.yandex.go.due_timetable.data.api.dto.ScheduledOrderCalculationsRequest;
import com.yandex.go.due_timetable.data.api.dto.ScheduledOrderCalculationsResponse;
import com.yandex.go.due_timetable.data.api.dto.ScheduledOrderCalculationsResponse$CalculationDto$$serializer;
import com.yandex.go.due_timetable.data.api.dto.a;
import com.yandex.go.due_timetable.data.api.dto.b;
import com.yandex.go.payments.data.model.SbpTokenDto;
import com.yandex.go.payments.data.model.VerifyStrategy;
import com.yandex.go.payments.data.model.j0;
import com.yandex.go.payments.data.model.response.BankListSection$$serializer;
import com.yandex.go.payments.sbp.data.model.SbpTokenHomeResponse;
import com.yandex.go.payments.sbp.data.model.d;
import com.ybsdk.feature.main.internal.screens.sbpPartners.SbpPartnersFragment;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsDashboardStateV4$Status;
import java.lang.annotation.Annotation;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

/* loaded from: classes13.dex */
public final /* synthetic */ class v4m0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ v4m0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        h itemAnimator_delegate$lambda$1;
        switch (this.a) {
            case 0:
                return new t4m0(null, null);
            case 1:
                zy11Var = zy11.a;
                return zy11Var;
            case 2:
                return new fbm0(SavingsDashboardStateV4$Status.Loading, true, true, null, null);
            case 3:
                return 0;
            case 4:
                return bem0.a;
            case 5:
                itemAnimator_delegate$lambda$1 = SbpPartnersFragment.itemAnimator_delegate$lambda$1();
                return itemAnimator_delegate$lambda$1;
            case 6:
                return new vem0(new t8j0());
            case 7:
                j0 j0Var = SbpTokenDto.Companion;
                return VerifyStrategy.Companion.serializer();
            case 8:
                d dVar = SbpTokenHomeResponse.Companion;
                return new p53(BankListSection$$serializer.INSTANCE, 0);
            case 9:
                return new eez0();
            case 10:
                return new dtb(new ufl0());
            case 11:
                return new knd0();
            case 12:
                return new nnd0();
            case 13:
                k kVar = ScheduledOrderAvailabilityRequest.Companion;
                return new p53(b0t.a, 0);
            case 14:
                k kVar2 = ScheduledOrderAvailabilityRequest.Companion;
                return new p53(auu0.a, 0);
            case 15:
                k kVar3 = ScheduledOrderAvailabilityRequest.Companion;
                return ScheduledOrderAvailabilityRequest.OpenOrigin.Companion.serializer();
            case 16:
                k kVar4 = ScheduledOrderAvailabilityRequest.Companion;
                return new p53(imx0.a, 0);
            case 17:
                return vez0.g("com.yandex.go.due.data.api.dto.ScheduledOrderAvailabilityRequest.OpenOrigin", ScheduledOrderAvailabilityRequest.OpenOrigin.values(), new String[]{"summary", "intercity_main"}, new Annotation[][]{null, null});
            case 18:
                m mVar = ScheduledOrderAvailabilityRequest.ScheduledOrderView.Companion;
                return ScheduledOrderAvailabilityRequest.ScheduledOrderView.Type.Companion.serializer();
            case 19:
                return vez0.g("com.yandex.go.due.data.api.dto.ScheduledOrderAvailabilityRequest.ScheduledOrderView.Type", ScheduledOrderAvailabilityRequest.ScheduledOrderView.Type.values(), new String[]{"default", "timetable", "timetable_with_seats"}, new Annotation[][]{null, null, null});
            case 20:
                o oVar = ScheduledOrderAvailabilityResponse.Companion;
                return new p53(AllowedTimeInfo$$serializer.INSTANCE, 0);
            case 21:
                r rVar = ScheduledOrderButton.Companion;
                return ScheduledOrderButton.ButtonType.Companion.serializer();
            case 22:
                r rVar2 = ScheduledOrderButton.Companion;
                return ScheduledOrderButton.ButtonStyle.Companion.serializer();
            case 23:
                return vez0.g("com.yandex.go.due.data.api.dto.ScheduledOrderButton.ButtonStyle", ScheduledOrderButton.ButtonStyle.values(), new String[]{"minor", "main"}, new Annotation[][]{null, null});
            case 24:
                return vez0.g("com.yandex.go.due.data.api.dto.ScheduledOrderButton.ButtonType", ScheduledOrderButton.ButtonType.values(), new String[]{"ride_now", "confirm_preorder", "preorder_unavailable"}, new Annotation[][]{null, null, null});
            case 25:
                a aVar = ScheduledOrderCalculationsRequest.Companion;
                return new p53(vmt.a, 0);
            case 26:
                com.yandex.go.due_timetable.data.api.dto.d dVar2 = ScheduledOrderCalculationsResponse.Companion;
                return ScheduledOrderCalculationsResponse.CalculationsStatusDto.Companion.serializer();
            case 27:
                com.yandex.go.due_timetable.data.api.dto.d dVar3 = ScheduledOrderCalculationsResponse.Companion;
                return new p53(ScheduledOrderCalculationsResponse$CalculationDto$$serializer.INSTANCE, 0);
            case 28:
                b bVar = ScheduledOrderCalculationsResponse.CalculationDto.Companion;
                return ScheduledOrderCalculationsResponse.SlotType.Companion.serializer();
            default:
                return vez0.g("com.yandex.go.due_timetable.data.api.dto.ScheduledOrderCalculationsResponse.CalculationsStatusDto", ScheduledOrderCalculationsResponse.CalculationsStatusDto.values(), new String[]{"pending", UgcLiveVideoData.UgcLiveStatus.FINISHED}, new Annotation[][]{null, null});
        }
    }
}
