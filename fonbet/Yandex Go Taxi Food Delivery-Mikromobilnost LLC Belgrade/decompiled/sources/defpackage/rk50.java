package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.action.NestedActionImpl;
import com.yandex.go.payments.data.model.NequiTokenDto;
import com.yandex.go.payments.data.model.VerifyStrategy;
import com.yandex.go.payments.data.model.response.Card;
import com.yandex.go.payments.data.model.response.NequiToken;
import com.yandex.go.payments.data.model.response.q0;
import com.yandex.go.payments.data.model.z;
import com.yandex.go.shortcuts.dto.response.nestedbutton.NestedButton;
import com.yandex.go.shortcuts.dto.response.nestedbutton.NestedButtonTypes;
import com.yandex.go.shortcuts.dto.response.nestedbutton.a;
import com.yandex.plus.home.datasource.openapi.models.NetworkBalanceModel$Currency;
import com.yandex.plus.home.datasource.openapi.models.NetworkComparePredicateModel$CompareType;
import com.yandex.plus.home.datasource.openapi.models.NetworkDisplayRulesModel$HorizontalGravity;
import com.yandex.plus.home.datasource.openapi.models.NetworkDisplayRulesModel$VerticalGravity;
import com.yandex.plus.home.datasource.openapi.models.NetworkNotificationModel$Position;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final /* synthetic */ class rk50 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ rk50(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        KSerializer _childSerializers$_anonymous_;
        switch (this.a) {
            case 0:
                tk50 tk50Var = uk50.Companion;
                return new p53(inm.a, 0);
            case 1:
                tk50 tk50Var2 = uk50.Companion;
                return new p53(ygy.a, 0);
            case 2:
                return new p53(auu0.a, 1);
            case 3:
                return new o4o("com.yandex.go.masstransit.sdk.order.impl.orders.NeedActivationActionDto.ActivationWithOnboardingActionDto", nl50.INSTANCE, new Annotation[0]);
            case 4:
                return new o4o("com.yandex.go.masstransit.sdk.order.impl.orders.NeedActivationActionDto.Unsupported", pl50.INSTANCE, new Annotation[0]);
            case 5:
                q0 q0Var = NequiToken.Companion;
                return Card.VerifyStrategy.Companion.serializer();
            case 6:
                z zVar = NequiTokenDto.Companion;
                return VerifyStrategy.Companion.serializer();
            case 7:
                _childSerializers$_anonymous_ = NestedActionImpl._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 8:
                a aVar = NestedButton.Companion;
                return NestedButtonTypes.Companion.serializer();
            case 9:
                return vez0.g("com.yandex.go.shortcuts.dto.response.nestedbutton.NestedButtonTypes", NestedButtonTypes.values(), new String[]{"trail_button", "lead_button"}, new Annotation[][]{null, null});
            case 10:
                return new p53(h6w.a, 0);
            case 11:
                return new p53(h6w.a, 0);
            case 12:
                return new o4o("com.yandex.plus.home.datasource.openapi.models.NetworkBalanceModel.Currency", (Enum[]) NetworkBalanceModel$Currency.values());
            case 13:
                return new p53(auu0.a, 0);
            case 14:
                return new p53(auu0.a, 0);
            case 15:
                return new p53(n160.Companion.serializer(), 0);
            case 16:
                return new p53(auu0.a, 0);
            case 17:
                return new o4o("com.yandex.plus.home.datasource.openapi.models.NetworkComparePredicateModel.CompareType", (Enum[]) NetworkComparePredicateModel$CompareType.values());
            case 18:
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 19:
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 20:
                return new o4o("com.yandex.plus.home.datasource.openapi.models.NetworkNotificationModel.Position", (Enum[]) NetworkNotificationModel$Position.values());
            case 21:
                return new p53(mo50.Companion.serializer(), 0);
            case 22:
                return new o4o("com.yandex.plus.home.datasource.openapi.models.NetworkDisplayRulesModel.HorizontalGravity", (Enum[]) NetworkDisplayRulesModel$HorizontalGravity.values());
            case 23:
                return new o4o("com.yandex.plus.home.datasource.openapi.models.NetworkDisplayRulesModel.VerticalGravity", (Enum[]) NetworkDisplayRulesModel$VerticalGravity.values());
            case 24:
                return new p53(auu0.a, 0);
            case 25:
                return qc7.a;
            case 26:
                return fxd.a;
            case 27:
                return new o4o("com.yandex.plus.home.datasource.openapi.models.NetworkNotificationModel.Position", (Enum[]) NetworkNotificationModel$Position.values());
            case 28:
                return new p53(auu0.a, 0);
            default:
                return new p53(xy50.Companion.serializer(), 0);
        }
    }
}
