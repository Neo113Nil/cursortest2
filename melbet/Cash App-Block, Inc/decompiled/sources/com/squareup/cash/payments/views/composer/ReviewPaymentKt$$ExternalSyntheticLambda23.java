package com.squareup.cash.payments.views.composer;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class ReviewPaymentKt$$ExternalSyntheticLambda23 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ Function0 f$2;

    public /* synthetic */ ReviewPaymentKt$$ExternalSyntheticLambda23(int i, Function0 function0, Function0 function02, boolean z) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$1 = function0;
        this.f$2 = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                if (this.f$0) {
                    this.f$1.invoke();
                } else {
                    this.f$2.invoke();
                }
                break;
            default:
                (this.f$0 ? this.f$1 : this.f$2).invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
