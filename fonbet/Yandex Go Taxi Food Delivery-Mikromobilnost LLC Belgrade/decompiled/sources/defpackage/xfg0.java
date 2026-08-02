package defpackage;

import com.ybsdk.feature.qr.payments.internal.screens.list.presentation.QrSubscriptionsListFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class xfg0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ QrSubscriptionsListFragment b;

    public /* synthetic */ xfg0(QrSubscriptionsListFragment qrSubscriptionsListFragment, int i) {
        this.a = i;
        this.b = qrSubscriptionsListFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        qa3 adapter_delegate$lambda$0;
        zy11 viewBinding$lambda$4$lambda$2;
        int i = this.a;
        QrSubscriptionsListFragment qrSubscriptionsListFragment = this.b;
        switch (i) {
            case 0:
                adapter_delegate$lambda$0 = QrSubscriptionsListFragment.adapter_delegate$lambda$0(qrSubscriptionsListFragment);
                return adapter_delegate$lambda$0;
            default:
                viewBinding$lambda$4$lambda$2 = QrSubscriptionsListFragment.getViewBinding$lambda$4$lambda$2(qrSubscriptionsListFragment);
                return viewBinding$lambda$4$lambda$2;
        }
    }
}
