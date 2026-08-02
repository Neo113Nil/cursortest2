package defpackage;

import com.yandex.payment.sdk.ui.preselect.select.PreselectFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class vue0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PreselectFragment b;

    public /* synthetic */ vue0(PreselectFragment preselectFragment, int i) {
        this.a = i;
        this.b = preselectFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        rwo eventReporter_delegate$lambda$0;
        zy11 state$lambda$0;
        zy11 state$lambda$1;
        zy11 state$lambda$2;
        zy11 onViewCreated$lambda$0;
        int i = this.a;
        PreselectFragment preselectFragment = this.b;
        switch (i) {
            case 0:
                eventReporter_delegate$lambda$0 = PreselectFragment.eventReporter_delegate$lambda$0(preselectFragment);
                return eventReporter_delegate$lambda$0;
            case 1:
                state$lambda$0 = PreselectFragment.setState$lambda$0(preselectFragment);
                return state$lambda$0;
            case 2:
                state$lambda$1 = PreselectFragment.setState$lambda$1(preselectFragment);
                return state$lambda$1;
            case 3:
                state$lambda$2 = PreselectFragment.setState$lambda$2(preselectFragment);
                return state$lambda$2;
            default:
                onViewCreated$lambda$0 = PreselectFragment.onViewCreated$lambda$0(preselectFragment);
                return onViewCreated$lambda$0;
        }
    }
}
