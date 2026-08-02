package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.QrPaymentsMainFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class x8g0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ QrPaymentsMainFragment b;

    public /* synthetic */ x8g0(QrPaymentsMainFragment qrPaymentsMainFragment, int i) {
        this.a = i;
        this.b = qrPaymentsMainFragment;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        boolean widgetsAdapterDelegate_delegate$lambda$2$lambda$0;
        zy11 onCreate$lambda$14;
        zy11 onCreate$lambda$15;
        int i = this.a;
        QrPaymentsMainFragment qrPaymentsMainFragment = this.b;
        switch (i) {
            case 0:
                widgetsAdapterDelegate_delegate$lambda$2$lambda$0 = QrPaymentsMainFragment.widgetsAdapterDelegate_delegate$lambda$2$lambda$0(qrPaymentsMainFragment, (Uri) obj, (spl) obj2);
                return Boolean.valueOf(widgetsAdapterDelegate_delegate$lambda$2$lambda$0);
            case 1:
                onCreate$lambda$14 = QrPaymentsMainFragment.onCreate$lambda$14(qrPaymentsMainFragment, (String) obj, (Bundle) obj2);
                return onCreate$lambda$14;
            default:
                onCreate$lambda$15 = QrPaymentsMainFragment.onCreate$lambda$15(qrPaymentsMainFragment, (String) obj, (Bundle) obj2);
                return onCreate$lambda$15;
        }
    }
}
