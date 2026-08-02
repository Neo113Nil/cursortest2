package defpackage;

import com.yandex.go.benefits_center.activation.data.model.BenefitActivationParam;
import com.yandex.go.benefits_center.data.BenefitsCenterInternalApi;
import com.yandex.go.benefits_center.data.model.BenefitGeoState;
import com.yandex.go.benefits_center.data.model.BenefitPaymentInfo;
import kotlin.a;

/* loaded from: classes12.dex */
public final class ul5 {
    public final i3y a;

    public ul5(rqo rqoVar, int i) {
        switch (i) {
            case 2:
                this.a = a.a(new xn3(rqoVar, 13));
                break;
            default:
                this.a = a.a(new xn3(rqoVar, 5));
                break;
        }
    }

    public cmt a(BenefitGeoState benefitGeoState, BenefitPaymentInfo benefitPaymentInfo, String str) {
        return ((BenefitsCenterInternalApi) this.a.getValue()).b(new BenefitActivationParam(benefitGeoState, benefitPaymentInfo, str));
    }

    public ul5(on2 on2Var) {
        this.a = a.a(new zn1(on2Var, 3));
    }
}
