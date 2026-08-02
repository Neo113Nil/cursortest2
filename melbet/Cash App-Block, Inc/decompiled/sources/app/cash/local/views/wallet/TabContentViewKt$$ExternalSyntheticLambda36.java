package app.cash.local.views.wallet;

import app.cash.local.viewmodels.wallet.LocalHomeViewEvent;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class TabContentViewKt$$ExternalSyntheticLambda36 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder f$1;

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda36(Function1 function1, LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder activeOrder, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = activeOrder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        LocalHomeViewModel.TabContent.Widget.ActiveOrders.ActiveOrder activeOrder = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(new LocalHomeViewEvent.ActiveOrderClicked(activeOrder.token));
                break;
            case 1:
                function1.invoke(new LocalHomeViewEvent.ActiveOrderClicked(activeOrder.token));
                break;
            default:
                function1.invoke(new LocalHomeViewEvent.ActiveOrderClicked(activeOrder.token));
                break;
        }
        return Unit.INSTANCE;
    }
}
