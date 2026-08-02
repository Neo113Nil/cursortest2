package com.squareup.cash.formview.components;

import app.cash.broadway.ui.Ui;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes6.dex */
public final /* synthetic */ class FormElementViewBuilder$toView$14 implements Ui.EventReceiver, FunctionAdapter {
    public final /* synthetic */ MutableSharedFlow $tmp0;

    public FormElementViewBuilder$toView$14(MutableSharedFlow mutableSharedFlow) {
        this.$tmp0 = mutableSharedFlow;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Ui.EventReceiver) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(1, 1, StateFlowKt.class, this.$tmp0, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // app.cash.broadway.ui.Ui.EventReceiver
    public final void sendEvent(Object obj) {
        FormViewEvent formViewEvent = (FormViewEvent) obj;
        formViewEvent.getClass();
        StateFlowKt.emitOrThrow(this.$tmp0, formViewEvent);
    }
}
