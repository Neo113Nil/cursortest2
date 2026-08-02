package com.squareup.cash.money.views;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ MutableState f$1;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda7(Function0 function0, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.f$0 = function0;
        this.f$1 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$1;
        Function0 function0 = this.f$0;
        switch (i) {
            case 0:
                if (function0 != null) {
                    function0.invoke();
                }
                mutableState.setValue(Boolean.TRUE);
                break;
            case 1:
                function0.invoke();
                Function0 function02 = (Function0) mutableState.getValue();
                if (function02 != null) {
                    function02.invoke();
                }
                break;
            case 2:
                function0.invoke();
                mutableState.setValue(Boolean.TRUE);
                break;
            case 3:
                mutableState.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 4:
                mutableState.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 5:
                mutableState.setValue(Boolean.TRUE);
                function0.invoke();
                break;
            default:
                mutableState.setValue(Boolean.TRUE);
                function0.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
