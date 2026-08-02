package com.squareup.cash.formview.components;

import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class FormView$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FormView f$0;

    public /* synthetic */ FormView$$ExternalSyntheticLambda2(FormView formView, int i) {
        this.$r8$classId = i;
        this.f$0 = formView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        FormView formView = this.f$0;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                StateFlowKt.emitOrThrow(formView.viewEvents, new FormViewEvent.FormUrlClicked(str));
                break;
            default:
                formView.getButtons().setEnabled(!((Boolean) obj).booleanValue());
                break;
        }
        return Unit.INSTANCE;
    }
}
