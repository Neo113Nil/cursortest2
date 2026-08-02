package com.squareup.cash.paymentpad.views;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import com.squareup.cash.arcade.components.ToastKt$Toast$12$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class LitePaymentPadKt$blockHiddenContentInput$1 implements PointerInputEventHandler {
    public static final LitePaymentPadKt$blockHiddenContentInput$1 INSTANCE = new LitePaymentPadKt$blockHiddenContentInput$1();

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        Object awaitPointerEventScope = ((SuspendingPointerInputModifierNodeImpl) pointerInputScope).awaitPointerEventScope(new ToastKt$Toast$12$1$1.AnonymousClass1(2, null, 1), continuation);
        return awaitPointerEventScope == CoroutineSingletons.COROUTINE_SUSPENDED ? awaitPointerEventScope : Unit.INSTANCE;
    }
}
