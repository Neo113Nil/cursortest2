package defpackage;

import android.net.Uri;
import android.text.Editable;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.QrPaymentsMainFragment;

/* loaded from: classes13.dex */
public final /* synthetic */ class v8g0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ QrPaymentsMainFragment b;

    public /* synthetic */ v8g0(QrPaymentsMainFragment qrPaymentsMainFragment, int i) {
        this.a = i;
        this.b = qrPaymentsMainFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 viewBinding$lambda$13$lambda$5$lambda$3;
        boolean viewBinding$lambda$13$lambda$9;
        boolean viewBinding$lambda$13$lambda$10;
        zy11 widgetsAdapterDelegate_delegate$lambda$2$lambda$1;
        int i = this.a;
        QrPaymentsMainFragment qrPaymentsMainFragment = this.b;
        switch (i) {
            case 0:
                viewBinding$lambda$13$lambda$5$lambda$3 = QrPaymentsMainFragment.getViewBinding$lambda$13$lambda$5$lambda$3(qrPaymentsMainFragment, (Editable) obj);
                return viewBinding$lambda$13$lambda$5$lambda$3;
            case 1:
                viewBinding$lambda$13$lambda$9 = QrPaymentsMainFragment.getViewBinding$lambda$13$lambda$9(qrPaymentsMainFragment, (Uri) obj);
                return Boolean.valueOf(viewBinding$lambda$13$lambda$9);
            case 2:
                viewBinding$lambda$13$lambda$10 = QrPaymentsMainFragment.getViewBinding$lambda$13$lambda$10(qrPaymentsMainFragment, (Uri) obj);
                return Boolean.valueOf(viewBinding$lambda$13$lambda$10);
            default:
                widgetsAdapterDelegate_delegate$lambda$2$lambda$1 = QrPaymentsMainFragment.widgetsAdapterDelegate_delegate$lambda$2$lambda$1(qrPaymentsMainFragment, ((Boolean) obj).booleanValue());
                return widgetsAdapterDelegate_delegate$lambda$2$lambda$1;
        }
    }
}
