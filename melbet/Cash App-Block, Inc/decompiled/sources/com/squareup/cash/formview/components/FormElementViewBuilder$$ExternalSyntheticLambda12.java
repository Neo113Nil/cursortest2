package com.squareup.cash.formview.components;

import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class FormElementViewBuilder$$ExternalSyntheticLambda12 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FormElementViewBuilder f$0;

    public /* synthetic */ FormElementViewBuilder$$ExternalSyntheticLambda12(FormElementViewBuilder formElementViewBuilder, int i) {
        this.$r8$classId = i;
        this.f$0 = formElementViewBuilder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        FormElementViewBuilder formElementViewBuilder = this.f$0;
        switch (i) {
            case 0:
                String str = formElementViewBuilder.submitActionId;
                if (str != null) {
                    StateFlowKt.emitOrThrow(formElementViewBuilder.viewEvents, new FormViewEvent.SubmitTextInputKeyPressed(str));
                }
                break;
            default:
                String str2 = formElementViewBuilder.submitActionId;
                if (str2 != null) {
                    StateFlowKt.emitOrThrow(formElementViewBuilder.viewEvents, new FormViewEvent.SubmitTextInputKeyPressed(str2));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
