package com.squareup.cash.formview.components;

import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes6.dex */
public final /* synthetic */ class FormElementViewBuilder$toView$24 extends FunctionReferenceImpl implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FormViewEvent formViewEvent = (FormViewEvent) obj;
        formViewEvent.getClass();
        StateFlowKt.emitOrThrow((MutableSharedFlow) this.receiver, formViewEvent);
        return Unit.INSTANCE;
    }
}
