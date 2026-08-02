package com.squareup.cash.payments.views.personalization;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Function;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class TransformableKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0 implements PointerInputEventHandler, FunctionAdapter {
    public final /* synthetic */ Function2 function;

    public TransformableKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(Function2 function2) {
        function2.getClass();
        this.function = function2;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PointerInputEventHandler) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        return this.function.invoke(pointerInputScope, continuation);
    }
}
