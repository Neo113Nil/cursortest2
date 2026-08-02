package com.squareup.cash.arcade.components;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class ToastActionScope$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ ToastActionScope f$1;

    public /* synthetic */ ToastActionScope$$ExternalSyntheticLambda0(Function0 function0, ToastActionScope toastActionScope, int i) {
        this.$r8$classId = i;
        this.f$0 = function0;
        this.f$1 = toastActionScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ToastActionScope toastActionScope = this.f$1;
        Function0 function0 = this.f$0;
        switch (i) {
            case 0:
                function0.invoke();
                toastActionScope.onDismiss.invoke();
                break;
            default:
                function0.invoke();
                toastActionScope.onDismiss.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
