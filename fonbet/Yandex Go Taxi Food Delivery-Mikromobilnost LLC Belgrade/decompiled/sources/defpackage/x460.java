package defpackage;

import com.yandex.payment.sdk.ui.newbind.NewBindFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class x460 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ NewBindFragment b;

    public /* synthetic */ x460(NewBindFragment newBindFragment, int i) {
        this.a = i;
        this.b = newBindFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onViewCreated$lambda$0;
        qu5 mediator_delegate$lambda$0;
        rwo eventReporter_delegate$lambda$0;
        hs31 viewModel_delegate$lambda$0;
        int i = this.a;
        NewBindFragment newBindFragment = this.b;
        switch (i) {
            case 0:
                onViewCreated$lambda$0 = NewBindFragment.onViewCreated$lambda$0(newBindFragment);
                return onViewCreated$lambda$0;
            case 1:
                mediator_delegate$lambda$0 = NewBindFragment.mediator_delegate$lambda$0(newBindFragment);
                return mediator_delegate$lambda$0;
            case 2:
                eventReporter_delegate$lambda$0 = NewBindFragment.eventReporter_delegate$lambda$0(newBindFragment);
                return eventReporter_delegate$lambda$0;
            default:
                viewModel_delegate$lambda$0 = NewBindFragment.viewModel_delegate$lambda$0(newBindFragment);
                return viewModel_delegate$lambda$0;
        }
    }
}
