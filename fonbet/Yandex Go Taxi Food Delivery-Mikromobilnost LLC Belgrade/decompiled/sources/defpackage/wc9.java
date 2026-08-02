package defpackage;

import android.net.Uri;
import com.ybsdk.feature.change.payment.method.internal.ui.ChangePaymentMethodFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class wc9 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChangePaymentMethodFragment b;

    public /* synthetic */ wc9(ChangePaymentMethodFragment changePaymentMethodFragment, int i) {
        this.a = i;
        this.b = changePaymentMethodFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean renderBottomSheet$lambda$12$lambda$11$lambda$10;
        zy11 onViewCreated$lambda$6$lambda$4;
        int i = this.a;
        ChangePaymentMethodFragment changePaymentMethodFragment = this.b;
        switch (i) {
            case 0:
                renderBottomSheet$lambda$12$lambda$11$lambda$10 = ChangePaymentMethodFragment.renderBottomSheet$lambda$12$lambda$11$lambda$10(changePaymentMethodFragment, (Uri) obj);
                return Boolean.valueOf(renderBottomSheet$lambda$12$lambda$11$lambda$10);
            default:
                onViewCreated$lambda$6$lambda$4 = ChangePaymentMethodFragment.onViewCreated$lambda$6$lambda$4(changePaymentMethodFragment, (Throwable) obj);
                return onViewCreated$lambda$6$lambda$4;
        }
    }
}
