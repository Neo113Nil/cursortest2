package defpackage;

import android.os.SystemClock;
import com.squareup.wire.ReverseProtoWriter;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.details.v2.ui.view.item.feedback.comment.RideCardCommentItemView;
import com.yandex.go.taxi.order.experiments.RideCardComposeExperiment;
import com.yandex.go.taxi.order.experiments.d;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.response.RideCardInfoResponse;
import com.yandex.go.taxi.order.models.api.response.driver.RideCardDriverState;
import com.yandex.go.taxi.order.models.api.response.u3;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.ResetFilterAction;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.ResetFilterType;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.s1;
import com.yandex.payment.sdk.flex.api.dtotransport.RestMethod;
import com.yandex.plus.pay.data.mb.dto.RichTextDto$Item$Type;
import com.yandex.plus.pay.repository.api.model.offers.RichText;
import defpackage.oqj0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.ui.recycler.PlaceholderType;

/* loaded from: classes6.dex */
public final /* synthetic */ class zfj0 implements sls {
    public final /* synthetic */ int a;

    @Override // defpackage.sls
    public final Object invoke() {
        yp6 forwardBuffer_delegate$lambda$0;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _init_$_anonymous_;
        KSerializer _childSerializers$_anonymous_2;
        bdc titleColor_delegate$lambda$0;
        switch (this.a) {
            case 0:
                bgj0 bgj0Var = cgj0.Companion;
                return new p53(dgj0.a, 0);
            case 1:
                return new ArrayList();
            case 2:
                q3c0 q3c0Var = new q3c0(PlaceholderType.TITLE);
                q3c0 q3c0Var2 = new q3c0(PlaceholderType.SUBTITLE);
                PlaceholderType placeholderType = PlaceholderType.BLOCK;
                q3c0 q3c0Var3 = new q3c0(placeholderType);
                PlaceholderType placeholderType2 = PlaceholderType.CONDITION;
                return new q3c0[]{q3c0Var, q3c0Var2, q3c0Var3, new q3c0(placeholderType2), new q3c0(placeholderType2), new q3c0(placeholderType), new q3c0(placeholderType2), new q3c0(placeholderType2), new q3c0(placeholderType), new q3c0(placeholderType2)};
            case 3:
                vgj0 vgj0Var = xgj0.Companion;
                return new p53(h6w.a, 0);
            case 4:
                lqj0 lqj0Var = oqj0.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 5:
                lqj0 lqj0Var2 = oqj0.Companion;
                return new p53(pqj0.a, 0);
            case 6:
                qqj0 qqj0Var = oqj0.b.Companion;
                return new p53(mqj0.a, 0);
            case 7:
                s1 s1Var = ResetFilterAction.Companion;
                return ResetFilterType.Companion.serializer();
            case 8:
                return vez0.g("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.ResetFilterType", ResetFilterType.values(), new String[]{"drop_due", "drop_transport", null}, new Annotation[][]{null, null, null});
            case 9:
                return new kfd0();
            case 10:
                return new o4o("com.yandex.payment.sdk.flex.api.dtotransport.RestMethod", (Enum[]) RestMethod.values());
            case 11:
                return Long.valueOf(SystemClock.elapsedRealtime());
            case 12:
                forwardBuffer_delegate$lambda$0 = ReverseProtoWriter.forwardBuffer_delegate$lambda$0();
                return forwardBuffer_delegate$lambda$0;
            case 13:
                _childSerializers$_anonymous_ = RichText._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 14:
                _init_$_anonymous_ = RichText.Item._init_$_anonymous_();
                return _init_$_anonymous_;
            case 15:
                _childSerializers$_anonymous_2 = RichText.Item.TextColor._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
            case 16:
                return new p53(m3k0.a, 0);
            case 17:
                return RichTextDto$Item$Type.Companion.serializer();
            case 18:
                return vez0.g("com.yandex.plus.pay.data.mb.dto.RichTextDto.Item.Type", RichTextDto$Item$Type.values(), new String[]{"LINK", "HIGHLIGHT", "STRIKE"}, new Annotation[][]{null, null, null});
            case 19:
                k6k0 k6k0Var = h6k0.Companion;
                return new p53(auu0.a, 0);
            case 20:
                k6k0 k6k0Var2 = h6k0.Companion;
                return new p53(l6k0.a, 0);
            case 21:
                k6k0 k6k0Var3 = h6k0.Companion;
                return new p53(f6k0.a, 0);
            case 22:
                return Boolean.TRUE;
            case 23:
                return new a3y0(TaxiOrderLogGroup.RIDE_CARD.getTag(), "RideCardActionHandler");
            case 24:
                return "onLayoutChildren failure";
            case 25:
                titleColor_delegate$lambda$0 = RideCardCommentItemView.titleColor_delegate$lambda$0();
                return titleColor_delegate$lambda$0;
            case 26:
                d dVar = RideCardComposeExperiment.Companion;
                return new k8u(RideCardPresentationType.Companion.serializer(), new p53(auu0.a, 1), 1);
            case 27:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.driver.RideCardDriverState", RideCardDriverState.values(), new String[]{"searching", "waiting_response", "rejected", "assigned_driver"}, new Annotation[][]{null, null, null, null});
            case 28:
                return new a3y0(TaxiOrderLogGroup.RIDE_CARD.getTag(), "FallbackValueRepository");
            default:
                u3 u3Var = RideCardInfoResponse.Companion;
                return new p53(rjk0.e, 0);
        }
    }

    public /* synthetic */ zfj0(int i) {
        this.a = i;
    }
}
