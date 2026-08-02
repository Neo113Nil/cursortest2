package defpackage;

import com.ybsdk.api.entities.YBCheckPaymentInfo$Condition;
import com.ybsdk.network.dto.CheckPaymentResponse;

/* loaded from: classes2.dex */
public abstract class sgb {
    public static final lf51 a(CheckPaymentResponse checkPaymentResponse) {
        mq91 mq91Var;
        YBCheckPaymentInfo$Condition yBCheckPaymentInfo$Condition;
        int i = rgb.b[checkPaymentResponse.getResolution().ordinal()];
        if (i == 1) {
            mq91Var = jf51.b;
        } else if (i == 2) {
            mq91Var = if51.b;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            CheckPaymentResponse.PaymentConditions conditions = checkPaymentResponse.getConditions();
            int i2 = conditions == null ? -1 : rgb.a[conditions.ordinal()];
            if (i2 == -1) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Resolution.CONDTIONS cant be used with empty conditions field");
                x4c.g("check_payment inconsistent answer", illegalArgumentException, null, null, 12);
                throw illegalArgumentException;
            }
            if (i2 == 1) {
                yBCheckPaymentInfo$Condition = YBCheckPaymentInfo$Condition.TOPUP;
            } else if (i2 == 2) {
                yBCheckPaymentInfo$Condition = YBCheckPaymentInfo$Condition.IDENTIFICATION;
            } else {
                if (i2 != 3) {
                    w511.b();
                    return null;
                }
                yBCheckPaymentInfo$Condition = YBCheckPaymentInfo$Condition.IDENTIFICATION;
            }
            mq91Var = new kf51(yBCheckPaymentInfo$Condition);
        }
        return new lf51(mq91Var);
    }
}
