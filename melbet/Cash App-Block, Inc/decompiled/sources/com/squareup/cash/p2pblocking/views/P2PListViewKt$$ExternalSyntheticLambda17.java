package com.squareup.cash.p2pblocking.views;

import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewEvent;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowTapButtonEvent;
import com.squareup.cash.p2pblocking.viewmodels.P2PListViewEvent;
import com.squareup.cash.p2pblocking.viewmodels.SelectCustomerViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class P2PListViewKt$$ExternalSyntheticLambda17 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ P2PListRowModel f$1;

    public /* synthetic */ P2PListViewKt$$ExternalSyntheticLambda17(P2PListRowModel p2PListRowModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$1 = p2PListRowModel;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        P2PListRowModel p2PListRowModel = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(new P2PListViewEvent.TapAvatar(p2PListRowModel.onTapAvatarEvent));
                break;
            case 1:
                P2PListRowTapButtonEvent p2PListRowTapButtonEvent = p2PListRowModel.onTapButtonEvent;
                if (p2PListRowTapButtonEvent != null) {
                    function1.invoke(new AllowlistSelectionViewEvent.TapCustomerButton(p2PListRowTapButtonEvent));
                }
                break;
            case 2:
                function1.invoke(new AllowlistSelectionViewEvent.TapCustomerAvatar(p2PListRowModel.onTapAvatarEvent));
                break;
            case 3:
                P2PListRowTapButtonEvent p2PListRowTapButtonEvent2 = p2PListRowModel.onTapButtonEvent;
                if (p2PListRowTapButtonEvent2 != null) {
                    function1.invoke(new SelectCustomerViewEvent.TapCustomerButton(p2PListRowTapButtonEvent2));
                }
                break;
            case 4:
                function1.invoke(new SelectCustomerViewEvent.TapCustomerAvatar(p2PListRowModel.onTapAvatarEvent));
                break;
            case 5:
                P2PListRowTapButtonEvent p2PListRowTapButtonEvent3 = p2PListRowModel.onTapButtonEvent;
                if (p2PListRowTapButtonEvent3 != null) {
                    function1.invoke(new SelectCustomerViewEvent.TapCustomerButton(p2PListRowTapButtonEvent3));
                }
                break;
            default:
                function1.invoke(new SelectCustomerViewEvent.TapCustomerAvatar(p2PListRowModel.onTapAvatarEvent));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ P2PListViewKt$$ExternalSyntheticLambda17(Function1 function1, P2PListRowModel p2PListRowModel, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = p2PListRowModel;
    }
}
