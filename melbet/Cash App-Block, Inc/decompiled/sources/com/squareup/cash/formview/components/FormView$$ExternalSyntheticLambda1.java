package com.squareup.cash.formview.components;

import android.view.ViewGroup;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class FormView$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FormView f$0;

    public /* synthetic */ FormView$$ExternalSyntheticLambda1(FormView formView, int i) {
        this.$r8$classId = i;
        this.f$0 = formView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        FormView formView = this.f$0;
        switch (i) {
            case 0:
                StateFlowKt.emitOrThrow(formView.viewEvents, FormViewEvent.Close.INSTANCE);
                return Unit.INSTANCE;
            case 1:
                StateFlowKt.emitOrThrow(formView.viewEvents, FormViewEvent.HelpActionSelected.INSTANCE);
                return Unit.INSTANCE;
            case 2:
                StateFlowKt.emitOrThrow(formView.viewEvents, FormViewEvent.Retreat.INSTANCE);
                return Unit.INSTANCE;
            case 3:
                FormViewCtaButtons formViewCtaButtons = new FormViewCtaButtons(formView.context, null);
                ((ViewGroup) formView.buttonContainer$delegate.getValue(formView, FormView.$$delegatedProperties[5])).addView(formViewCtaButtons, -1, -2);
                return formViewCtaButtons;
            case 4:
                return formView.getButtons().secondary;
            case 5:
                return formView.getButtons().primary;
            default:
                return formView.getButtons().disclaimer;
        }
    }
}
