package defpackage;

import com.yandex.go.payments.data.model.response.AddPaymentMethodButton;
import com.yandex.go.payments.payment.AddButtonFlow;

/* loaded from: classes13.dex */
public abstract class u80 {
    public static final AddButtonFlow a(AddPaymentMethodButton.AddButtonFlow addButtonFlow) {
        AddButtonFlow.AddButtonFlowType addButtonFlowType;
        int i = t80.a[addButtonFlow.a.ordinal()];
        if (i == 1) {
            addButtonFlowType = AddButtonFlow.AddButtonFlowType.DEEPLINK;
        } else if (i == 2) {
            addButtonFlowType = AddButtonFlow.AddButtonFlowType.TRANSPORT_EXTERNAL;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            addButtonFlowType = AddButtonFlow.AddButtonFlowType.UNKNOWN;
        }
        return new AddButtonFlow(addButtonFlowType, addButtonFlow.b, addButtonFlow.c);
    }
}
