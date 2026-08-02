package com.squareup.cash.arcade.bindings.component;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import squareup.cash.ui.arcade.elements.ButtonDefault;

/* loaded from: classes5.dex */
public final /* synthetic */ class ArcadeComponentButtonProtoBindingKt$$ExternalSyntheticLambda11 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ ButtonDefault f$1;

    public /* synthetic */ ArcadeComponentButtonProtoBindingKt$$ExternalSyntheticLambda11(Function1 function1, ButtonDefault buttonDefault, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = buttonDefault;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ButtonDefault buttonDefault = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(ArcadeComponentButtonProtoBindingKt.clickEvent$default(buttonDefault.tap_client_route));
                break;
            default:
                function1.invoke(ArcadeComponentButtonProtoBindingKt.clickEvent$default(buttonDefault.tap_client_route));
                break;
        }
        return Unit.INSTANCE;
    }
}
