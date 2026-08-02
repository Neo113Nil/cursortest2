package com.squareup.cash.payments.views.composer;

import com.squareup.cash.securitysignals.ui.TouchRecorder;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class ReviewPaymentKt$$ExternalSyntheticLambda20 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ TouchRecorder f$1;

    public /* synthetic */ ReviewPaymentKt$$ExternalSyntheticLambda20(Function1 function1, TouchRecorder touchRecorder, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = touchRecorder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invoke(CollectionsKt.toList(this.f$1.lastGesture));
                break;
            default:
                this.f$0.invoke(CollectionsKt.toList(this.f$1.lastGesture));
                break;
        }
        return Unit.INSTANCE;
    }
}
