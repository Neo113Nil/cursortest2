package defpackage;

import com.ybsdk.feature.qr.payments.internal.screens.presentation.QrPaymentsMainFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class u8g0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ QrPaymentsMainFragment b;

    public /* synthetic */ u8g0(QrPaymentsMainFragment qrPaymentsMainFragment, int i) {
        this.a = i;
        this.b = qrPaymentsMainFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 renderAmountBlockWithAnimation$lambda$53;
        zy11 onViewCreated$lambda$17$lambda$16;
        e7n widgetsAdapterDelegate_delegate$lambda$2;
        zy11 onViewCreated$lambda$20;
        zy11 onViewCreated$lambda$21;
        zy11 renderTooltipManually$lambda$47$lambda$45$lambda$44;
        int i = this.a;
        QrPaymentsMainFragment qrPaymentsMainFragment = this.b;
        switch (i) {
            case 0:
                renderAmountBlockWithAnimation$lambda$53 = QrPaymentsMainFragment.renderAmountBlockWithAnimation$lambda$53(qrPaymentsMainFragment);
                return renderAmountBlockWithAnimation$lambda$53;
            case 1:
                onViewCreated$lambda$17$lambda$16 = QrPaymentsMainFragment.onViewCreated$lambda$17$lambda$16(qrPaymentsMainFragment);
                return onViewCreated$lambda$17$lambda$16;
            case 2:
                widgetsAdapterDelegate_delegate$lambda$2 = QrPaymentsMainFragment.widgetsAdapterDelegate_delegate$lambda$2(qrPaymentsMainFragment);
                return widgetsAdapterDelegate_delegate$lambda$2;
            case 3:
                onViewCreated$lambda$20 = QrPaymentsMainFragment.onViewCreated$lambda$20(qrPaymentsMainFragment);
                return onViewCreated$lambda$20;
            case 4:
                onViewCreated$lambda$21 = QrPaymentsMainFragment.onViewCreated$lambda$21(qrPaymentsMainFragment);
                return onViewCreated$lambda$21;
            default:
                renderTooltipManually$lambda$47$lambda$45$lambda$44 = QrPaymentsMainFragment.renderTooltipManually$lambda$47$lambda$45$lambda$44(qrPaymentsMainFragment);
                return renderTooltipManually$lambda$47$lambda$45$lambda$44;
        }
    }
}
