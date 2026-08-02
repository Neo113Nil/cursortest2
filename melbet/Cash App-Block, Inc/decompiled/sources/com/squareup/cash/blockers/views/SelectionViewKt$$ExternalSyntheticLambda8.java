package com.squareup.cash.blockers.views;

import com.squareup.cash.blockers.viewmodels.SelectionViewEvent;
import com.squareup.protos.franklin.api.SelectionOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class SelectionViewKt$$ExternalSyntheticLambda8 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ SelectionOption f$1;

    public /* synthetic */ SelectionViewKt$$ExternalSyntheticLambda8(Function1 function1, SelectionOption selectionOption, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = selectionOption;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invoke(new SelectionViewEvent.SelectOption(this.f$1));
                break;
            case 1:
                this.f$0.invoke(new SelectionViewEvent.SelectOption(this.f$1));
                break;
            default:
                this.f$0.invoke(new SelectionViewEvent.SelectOption(this.f$1));
                break;
        }
        return Unit.INSTANCE;
    }
}
