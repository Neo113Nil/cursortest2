package com.squareup.cash.activity.views;

import com.squareup.cash.activity.viewmodels.AppMessageEvent;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class ActivityTabViewKt$$ExternalSyntheticLambda14 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ CardAppMessageViewModel.Ready f$1;

    public /* synthetic */ ActivityTabViewKt$$ExternalSyntheticLambda14(Function1 function1, CardAppMessageViewModel.Ready ready, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = ready;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        CardAppMessageViewModel.Ready ready = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(new AppMessageEvent(new AppMessageViewEvent.AppMessageActionTaken(ready.messageToken, null, true, null, 8)));
                break;
            case 1:
                function1.invoke(new AppMessageEvent(new AppMessageViewEvent.AppMessageUndoDismiss(ready.messageToken)));
                break;
            default:
                function1.invoke(new AppMessageViewEvent.AppMessageActionTaken(ready.messageToken, null, true, null, 8));
                break;
        }
        return Unit.INSTANCE;
    }
}
