package defpackage;

import com.yandex.payment.sdk.ui.payment.select.SelectFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class wbq0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectFragment b;

    public /* synthetic */ wbq0(SelectFragment selectFragment, int i) {
        this.a = i;
        this.b = selectFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onViewCreated$lambda$0;
        zy11 onViewCreated$lambda$2;
        zy11 onViewCreated$lambda$3;
        rwo eventReporter_delegate$lambda$0;
        int i = this.a;
        SelectFragment selectFragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$0 = SelectFragment.onViewCreated$lambda$0(selectFragment);
                return onViewCreated$lambda$0;
            case 1:
                onViewCreated$lambda$2 = SelectFragment.onViewCreated$lambda$2(selectFragment);
                return onViewCreated$lambda$2;
            case 2:
                onViewCreated$lambda$3 = SelectFragment.onViewCreated$lambda$3(selectFragment);
                return onViewCreated$lambda$3;
            default:
                eventReporter_delegate$lambda$0 = SelectFragment.eventReporter_delegate$lambda$0(selectFragment);
                return eventReporter_delegate$lambda$0;
        }
    }
}
