package defpackage;

import com.yandex.payment.sdk.ui.payment.sbp.SbpFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class qgm0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SbpFragment b;

    public /* synthetic */ qgm0(SbpFragment sbpFragment, int i) {
        this.a = i;
        this.b = sbpFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        rwo eventReporter_delegate$lambda$0;
        zy11 initHeader$lambda$0$0;
        int i = this.a;
        SbpFragment sbpFragment = this.b;
        switch (i) {
            case 0:
                eventReporter_delegate$lambda$0 = SbpFragment.eventReporter_delegate$lambda$0(sbpFragment);
                return eventReporter_delegate$lambda$0;
            default:
                initHeader$lambda$0$0 = SbpFragment.initHeader$lambda$0$0(sbpFragment);
                return initHeader$lambda$0$0;
        }
    }
}
