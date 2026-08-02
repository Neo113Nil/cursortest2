package com.squareup.cash.profile.components;

import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.squareup.cash.arcade.components.ToastKt$Toast$12$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class ProfilePhotoKt$ProfilePhoto$1$1 implements PointerInputEventHandler {
    public static final ProfilePhotoKt$ProfilePhoto$1$1 INSTANCE = new ProfilePhotoKt$ProfilePhoto$1$1();

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        Object awaitEachGesture = Draggable2DKt.awaitEachGesture(pointerInputScope, new ToastKt$Toast$12$1$1.AnonymousClass1(2, null, 2), continuation);
        return awaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? awaitEachGesture : Unit.INSTANCE;
    }
}
