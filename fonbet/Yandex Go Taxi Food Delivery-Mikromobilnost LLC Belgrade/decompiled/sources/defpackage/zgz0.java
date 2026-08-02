package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.agreement.trackable.mvp.TrackableAcceptanceModalView;
import com.yandex.go.superapp.orders.card.actions.TrackingCardButtonView;
import com.yandex.go.superapp.orders.card.header.leads.TrackingCardImageWithOverlayImageView;
import com.yandex.go.superapp.orders.card.header.trails.TrackingCardTextWithIconView;
import com.yandex.go.superapp.orders.card.timeline.TrackingCardCircleTimelineView;
import com.yandex.go.taxi.order.tipssuggest.mvp.TipsSuggestModalView;
import com.yandex.go.tips.ui.tips_set.TipsSetModalView;
import com.yandex.go.transfer_requirement.analytics.TransferCardAnalytics$DismissType;
import com.yandex.go.transfer_requirement.mvp.TransferRequirementModalView;
import com.yandex.mapkit.traffic.TrafficLevel;
import com.yandex.messaging.ui.toolbar.a;
import com.yandex.messaging.views.CounterTextView;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.transfer.utils.domain.entities.ResultImage;
import com.ybsdk.core.transfer.utils.domain.entities.TransferStatus;
import com.ybsdk.core.utils.NumberFormatUtils$Currencies;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import com.ybsdk.feature.transfer.api.TransferResultScreenParams;
import com.ybsdk.feature.transfer.api.TransferYbScreenArguments;
import com.ybsdk.feature.transfer.internal.screens.result.presentation.TransferResultFragment;
import com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams;
import com.ybsdk.feature.transfer.version2.internal.entities.ResultStatus;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.PhoneSelectionScenario;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.c;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.receivername.TransferReceiverNameFragment;
import com.ybsdk.screens.notice.presentation.TopupNoticeDeprecatedFragment;
import com.ybsdk.screens.notice.presentation.TopupNoticeFragment;
import com.ybsdk.widgets.tooltip.util.TooltipPopupWindow;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.k;
import ru.yandex.taxi.logistics.sdk.tracking.preparer.TrackingPreparerRepositoryImpl$trackingStateFlow_delegate$lambda$0$$inlined$flatMapLatest$1;
import ru.yandex.taxi.masstransit.trains.search.TrainsStationSearchApi;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.widget.ToolbarModalView;
import ru.yandex.taxi.widget.text.method.LinkMovementMethod;

/* loaded from: classes3.dex */
public final /* synthetic */ class zgz0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zgz0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [rbv] */
    /* JADX WARN: Type inference failed for: r20v2 */
    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onAttachedToWindow$lambda$1;
        View insetsType$lambda$0;
        View view;
        View viewBinding$lambda$5$lambda$4$lambda$1;
        View initBottomSheet$lambda$1;
        LinkMovementMethod linkMovementMethod_delegate$lambda$0;
        zy11 render$lambda$1;
        zy11 render$lambda$12;
        zy11 render$lambda$13;
        zy11 render$lambda$0$1;
        zy11 viewBinding$lambda$4$lambda$0;
        zy11 signInputOnFocusChange$lambda$0$1;
        zy11 onViewCreated$lambda$2;
        rbv nbvVar;
        b bVar;
        int i;
        ?? r20;
        int i2 = this.a;
        int i3 = 3;
        Object obj = this.b;
        switch (i2) {
            case 0:
                onAttachedToWindow$lambda$1 = TipsSetModalView.onAttachedToWindow$lambda$1((TipsSetModalView) obj);
                return onAttachedToWindow$lambda$1;
            case 1:
                insetsType$lambda$0 = TipsSuggestModalView.insetsType$lambda$0((TipsSuggestModalView) obj);
                return insetsType$lambda$0;
            case 2:
                RecyclerView recyclerView = (RecyclerView) obj;
                return Integer.valueOf((recyclerView.getWidth() - recyclerView.getPaddingStart()) - recyclerView.getPaddingEnd());
            case 3:
                ((glz0) obj).T.invoke(Boolean.valueOf(!r0.S));
                return zy11.a;
            case 4:
                return (CounterTextView) ((a) obj).getView().findViewById(e9h0.unread_counter);
            case 5:
                view = ((ToolbarModalView) obj).content;
                return view;
            case 6:
                return Integer.valueOf(((zpv0) obj).e.getIntValue());
            case 7:
                Iterator it = ((Map) obj).values().iterator();
                if (it.hasNext()) {
                    r6 = it.next();
                    if (it.hasNext()) {
                        int intValue = ((Number) r6).intValue();
                        do {
                            Object next = it.next();
                            int intValue2 = ((Number) next).intValue();
                            if (intValue < intValue2) {
                                r6 = next;
                                intValue = intValue2;
                            }
                        } while (it.hasNext());
                    }
                }
                Integer num = (Integer) r6;
                return Integer.valueOf(num != null ? num.intValue() : 0);
            case 8:
                TooltipPopupWindow tooltipPopupWindow = ((com.ybsdk.widgets.tooltip.a) obj).u;
                if (tooltipPopupWindow != null) {
                    tooltipPopupWindow.dismiss();
                }
                return zy11.a;
            case 9:
                viewBinding$lambda$5$lambda$4$lambda$1 = TopupNoticeDeprecatedFragment.getViewBinding$lambda$5$lambda$4$lambda$1((TopupNoticeDeprecatedFragment) obj);
                return viewBinding$lambda$5$lambda$4$lambda$1;
            case 10:
                initBottomSheet$lambda$1 = TopupNoticeFragment.initBottomSheet$lambda$1((TopupNoticeFragment) obj);
                return initBottomSheet$lambda$1;
            case 11:
                linkMovementMethod_delegate$lambda$0 = TrackableAcceptanceModalView.linkMovementMethod_delegate$lambda$0((TrackableAcceptanceModalView) obj);
                return linkMovementMethod_delegate$lambda$0;
            case 12:
                render$lambda$1 = TrackingCardButtonView.render$lambda$1((TrackingCardButtonView) obj);
                return render$lambda$1;
            case 13:
                render$lambda$12 = TrackingCardCircleTimelineView.render$lambda$1((TrackingCardCircleTimelineView) obj);
                return render$lambda$12;
            case 14:
                render$lambda$13 = TrackingCardImageWithOverlayImageView.render$lambda$1((TrackingCardImageWithOverlayImageView) obj);
                return render$lambda$13;
            case 15:
                render$lambda$0$1 = TrackingCardTextWithIconView.render$lambda$0$1((TrackingCardTextWithIconView) obj);
                return render$lambda$0$1;
            case 16:
                ru.yandex.taxi.logistics.sdk.tracking.preparer.a aVar = (ru.yandex.taxi.logistics.sdk.tracking.preparer.a) obj;
                c701 c701Var = aVar.a;
                if (c701Var instanceof z601) {
                    return e.R(e.X(aVar.c.a(((z601) c701Var).a), new TrackingPreparerRepositoryImpl$trackingStateFlow_delegate$lambda$0$$inlined$flatMapLatest$1(null, aVar)), aVar.d, wsr0.a(xsr0.a, 3), w701.a);
                }
                if (c701Var instanceof b701) {
                    return aVar.b.a(((b701) c701Var).a).b().e;
                }
                if (jl40.l(c701Var, a701.a)) {
                    return bvf0.c(v701.a);
                }
                w511.b();
                return null;
            case 17:
                k kVar = (k) obj;
                kVar.A.c(kVar.b, "close_by_back");
                return zy11.a;
            case 18:
                TrafficLevel trafficLevel = (TrafficLevel) obj;
                LinkedHashMap l = kotlin.collections.b.l(new Pair("type", "changed"));
                if (trafficLevel != null) {
                    l.put("traffic_level", kotlin.collections.b.i(new Pair("level", Integer.valueOf(trafficLevel.getLevel())), new Pair("color", trafficLevel.getColor().name().toLowerCase(Locale.ROOT))));
                }
                return l;
            case 19:
                on2 on2Var = ((lc01) obj).b;
                on2Var.getClass();
                return (TrainsStationSearchApi) on2Var.a(GoApiName.TaxiV4, TrainsStationSearchApi.class);
            case 20:
                psg psgVar = (psg) obj;
                int E = psgVar.E();
                if (E != -1) {
                    hex0 hex0Var = (hex0) psgVar.T;
                    Integer valueOf = Integer.valueOf(E);
                    wh01 wh01Var = (wh01) psgVar.W;
                    hex0Var.invoke(valueOf, wh01Var != null ? wh01Var : null);
                }
                return zy11.a;
            case 21:
                TransferMainResultScreenParams transferMainResultScreenParams = (TransferMainResultScreenParams) obj;
                return new kk01(transferMainResultScreenParams.getResultPage(), transferMainResultScreenParams, ResultStatus.PROCESSING, null, null, null, null, null, EmptyList.a, null, null, null);
            case 22:
                TransferPhoneInputFragment.Arguments arguments = (TransferPhoneInputFragment.Arguments) obj;
                TransferScenario scenario = arguments.getScenario();
                return new in01((scenario != null ? mn01.a[scenario.ordinal()] : -1) == 1 ? PhoneSelectionScenario.CROSS_BORDER : PhoneSelectionScenario.REGULAR, arguments.getTitle(), arguments.getCrossBorderScenario(), 1023);
            case 23:
                return ((me1) ((c) obj).E).b;
            case 24:
                viewBinding$lambda$4$lambda$0 = TransferReceiverNameFragment.getViewBinding$lambda$4$lambda$0((TransferReceiverNameFragment) obj);
                return viewBinding$lambda$4$lambda$0;
            case 25:
                signInputOnFocusChange$lambda$0$1 = TransferRequirementModalView.signInputOnFocusChange$lambda$0$1((kp01) obj);
                return signInputOnFocusChange$lambda$0$1;
            case 26:
                op01 op01Var = (op01) obj;
                op01Var.x.u(op01Var.A.c(), TransferCardAnalytics$DismissType.CloseAfterSaveTransfer);
                op01Var.E = true;
                ((ep01) op01Var.Dg()).close();
                return zy11.a;
            case 27:
                onViewCreated$lambda$2 = TransferResultFragment.onViewCreated$lambda$2((TransferResultFragment) obj);
                return onViewCreated$lambda$2;
            case 28:
                TransferResultScreenParams transferResultScreenParams = (TransferResultScreenParams) obj;
                String title = transferResultScreenParams.getPartnerEntity().getTitle();
                ThemedImageUrlEntity themedImage = transferResultScreenParams.getPartnerEntity().getThemedImage();
                int i4 = 2;
                if (themedImage == null || (nbvVar = job1.f(themedImage, new zp01(i4))) == null) {
                    nbvVar = new nbv(txg0.ybsdk_ic_yb_placeholder, null);
                }
                rbv rbvVar = nbvVar;
                String receiverName = transferResultScreenParams.getReceiverName();
                String str = receiverName == null ? "" : receiverName;
                String phoneNumber = transferResultScreenParams.getPhoneNumber();
                String str2 = phoneNumber == null ? "" : phoneNumber;
                BigDecimal transferringAmount = transferResultScreenParams.getTransferringAmount();
                String comment = transferResultScreenParams.getComment();
                String str3 = comment == null ? "" : comment;
                int i5 = os01.a[transferResultScreenParams.getTransferType().ordinal()];
                if (i5 == 1) {
                    bVar = Text.Companion;
                    i = dzh0.ybsdk_transfer_transfer_title;
                } else {
                    if (i5 != 2) {
                        w511.b();
                        return null;
                    }
                    bVar = Text.Companion;
                    i = dzh0.ybsdk_deposit_deposit_from_title;
                }
                Text.Resource h = unr0.h(bVar, i);
                Text title2 = transferResultScreenParams.getResultScreenHeader().getTitle();
                ResultImage image = transferResultScreenParams.getResultScreenHeader().getImage();
                if (image instanceof ResultImage.Resource) {
                    r20 = new nbv(((ResultImage.Resource) image).getDrawableres(), null);
                } else {
                    if (image instanceof ResultImage.Url) {
                        r6 = job1.f(((ResultImage.Url) image).getUrl(), new zp01(i3));
                    } else if (image != null) {
                        w511.b();
                        return null;
                    }
                    r20 = r6;
                }
                return new ns01(title, rbvVar, str, str2, transferringAmount, NumberFormatUtils$Currencies.RUB.getIso(), TransferStatus.PROCESSING, "", "", str3, h, title2, r20, transferResultScreenParams.getTransferType(), null, false);
            default:
                return new pt01(new t8j0(), "", ((TransferYbScreenArguments) obj).getBackVisible(), null);
        }
    }
}
