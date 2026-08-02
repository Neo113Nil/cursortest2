package com.squareup.cash.moneybot.views.menu;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class ExpandableContentKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ ExpandableContentKt$$ExternalSyntheticLambda4(Function0 function0, Function0 function02, int i) {
        this.$r8$classId = i;
        this.f$0 = function0;
        this.f$1 = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function0 function0 = this.f$1;
        Function0 function02 = this.f$0;
        switch (i) {
            case 0:
                function02.invoke();
                function0.invoke();
                break;
            default:
                function02.invoke();
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
