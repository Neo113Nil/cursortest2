package com.squareup.cash.blockers.views;

import com.squareup.cash.blockers.viewmodels.SelectionViewEvent;
import com.squareup.cash.blockers.viewmodels.VerifyHelpViewEvent;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.HelpItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class SelectionViewKt$$ExternalSyntheticLambda14 implements Function0 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ HelpItem f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ SelectionViewKt$$ExternalSyntheticLambda14(HelpItem helpItem, Function1 function1) {
        this.f$0 = helpItem;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        HelpItem helpItem = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                BlockerAction blockerAction = helpItem.blocker_action;
                if (blockerAction != null) {
                    function1.invoke(new SelectionViewEvent.BlockerActionClick(blockerAction));
                } else {
                    function1.invoke(new SelectionViewEvent.HelpItemClick(helpItem));
                }
                break;
            default:
                function1.invoke(new VerifyHelpViewEvent.HelpItemSelected(helpItem));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SelectionViewKt$$ExternalSyntheticLambda14(Function1 function1, HelpItem helpItem) {
        this.f$1 = function1;
        this.f$0 = helpItem;
    }
}
