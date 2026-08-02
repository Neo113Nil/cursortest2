package com.squareup.cash.activity.views.receipts;

import com.squareup.protos.franklin.ui.Timeline;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class ReceiptTimelineKt$$ExternalSyntheticLambda11 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ Timeline.Event f$1;

    public /* synthetic */ ReceiptTimelineKt$$ExternalSyntheticLambda11(Function1 function1, Timeline.Event event, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = event;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Timeline.Event event = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(event);
                break;
            default:
                function1.invoke(event);
                break;
        }
        return Unit.INSTANCE;
    }
}
