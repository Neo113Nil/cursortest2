package defpackage;

import android.view.View;
import com.ybsdk.feature.change.payment.method.internal.ui.ChangePaymentMethodFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class vc9 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChangePaymentMethodFragment b;

    public /* synthetic */ vc9(ChangePaymentMethodFragment changePaymentMethodFragment, int i) {
        this.a = i;
        this.b = changePaymentMethodFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onViewCreated$lambda$6$lambda$3$lambda$2;
        zy11 onViewCreated$lambda$1;
        zy11 onViewCreated$lambda$6$lambda$3;
        View renderBottomSheet$lambda$9;
        int i = this.a;
        ChangePaymentMethodFragment changePaymentMethodFragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$6$lambda$3$lambda$2 = ChangePaymentMethodFragment.onViewCreated$lambda$6$lambda$3$lambda$2(changePaymentMethodFragment);
                return onViewCreated$lambda$6$lambda$3$lambda$2;
            case 1:
                onViewCreated$lambda$1 = ChangePaymentMethodFragment.onViewCreated$lambda$1(changePaymentMethodFragment);
                return onViewCreated$lambda$1;
            case 2:
                onViewCreated$lambda$6$lambda$3 = ChangePaymentMethodFragment.onViewCreated$lambda$6$lambda$3(changePaymentMethodFragment);
                return onViewCreated$lambda$6$lambda$3;
            default:
                renderBottomSheet$lambda$9 = ChangePaymentMethodFragment.renderBottomSheet$lambda$9(changePaymentMethodFragment);
                return renderBottomSheet$lambda$9;
        }
    }
}
