package defpackage;

import android.text.Editable;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation.InternetPaymentFormInputFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class zsw implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ InternetPaymentFormInputFragment b;

    public /* synthetic */ zsw(InternetPaymentFormInputFragment internetPaymentFormInputFragment, int i) {
        this.a = i;
        this.b = internetPaymentFormInputFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onCreate$lambda$8;
        zy11 inputWatcher$lambda$0;
        int i = this.a;
        InternetPaymentFormInputFragment internetPaymentFormInputFragment = this.b;
        switch (i) {
            case 0:
                onCreate$lambda$8 = InternetPaymentFormInputFragment.onCreate$lambda$8(internetPaymentFormInputFragment, (String) obj);
                return onCreate$lambda$8;
            default:
                inputWatcher$lambda$0 = InternetPaymentFormInputFragment.inputWatcher$lambda$0(internetPaymentFormInputFragment, (Editable) obj);
                return inputWatcher$lambda$0;
        }
    }
}
