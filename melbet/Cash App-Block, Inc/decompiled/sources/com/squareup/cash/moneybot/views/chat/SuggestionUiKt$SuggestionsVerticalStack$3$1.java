package com.squareup.cash.moneybot.views.chat;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.moneybot.widgets.KeyboardState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class SuggestionUiKt$SuggestionsVerticalStack$3$1 implements PointerInputEventHandler {
    public final /* synthetic */ FocusOwnerImpl $focusManager;
    public final /* synthetic */ DelegatingSoftwareKeyboardController $keyboardController;
    public final /* synthetic */ KeyboardState $keyboardState;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SuggestionUiKt$SuggestionsVerticalStack$3$1(KeyboardState keyboardState, FocusOwnerImpl focusOwnerImpl, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, int i) {
        this.$r8$classId = i;
        this.$keyboardState = keyboardState;
        this.$focusManager = focusOwnerImpl;
        this.$keyboardController = delegatingSoftwareKeyboardController;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
        int i = this.$r8$classId;
        final DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = this.$keyboardController;
        final FocusOwnerImpl focusOwnerImpl = this.$focusManager;
        final KeyboardState keyboardState = this.$keyboardState;
        switch (i) {
            case 0:
                final int i2 = 0;
                Object detectVerticalDragGestures$default = DragGestureDetectorKt.detectVerticalDragGestures$default(pointerInputScope, new Function2() { // from class: com.squareup.cash.moneybot.views.chat.SuggestionUiKt$SuggestionsVerticalStack$3$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i3 = i2;
                        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = delegatingSoftwareKeyboardController;
                        FocusOwnerImpl focusOwnerImpl2 = focusOwnerImpl;
                        KeyboardState keyboardState2 = keyboardState;
                        float floatValue = ((Float) obj2).floatValue();
                        ((PointerInputChange) obj).getClass();
                        switch (i3) {
                            case 0:
                                if (keyboardState2 == KeyboardState.Open && floatValue > RecyclerView.DECELERATION_RATE) {
                                    focusOwnerImpl2.clearFocus(false);
                                    if (delegatingSoftwareKeyboardController2 != null) {
                                        delegatingSoftwareKeyboardController2.hide();
                                    }
                                }
                                break;
                            default:
                                if (keyboardState2 == KeyboardState.Open && floatValue > RecyclerView.DECELERATION_RATE) {
                                    focusOwnerImpl2.clearFocus(false);
                                    if (delegatingSoftwareKeyboardController2 != null) {
                                        delegatingSoftwareKeyboardController2.hide();
                                    }
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, continuation);
                if (detectVerticalDragGestures$default != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                final int i3 = 1;
                Object detectVerticalDragGestures$default2 = DragGestureDetectorKt.detectVerticalDragGestures$default(pointerInputScope, new Function2() { // from class: com.squareup.cash.moneybot.views.chat.SuggestionUiKt$SuggestionsVerticalStack$3$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i32 = i3;
                        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = delegatingSoftwareKeyboardController;
                        FocusOwnerImpl focusOwnerImpl2 = focusOwnerImpl;
                        KeyboardState keyboardState2 = keyboardState;
                        float floatValue = ((Float) obj2).floatValue();
                        ((PointerInputChange) obj).getClass();
                        switch (i32) {
                            case 0:
                                if (keyboardState2 == KeyboardState.Open && floatValue > RecyclerView.DECELERATION_RATE) {
                                    focusOwnerImpl2.clearFocus(false);
                                    if (delegatingSoftwareKeyboardController2 != null) {
                                        delegatingSoftwareKeyboardController2.hide();
                                    }
                                }
                                break;
                            default:
                                if (keyboardState2 == KeyboardState.Open && floatValue > RecyclerView.DECELERATION_RATE) {
                                    focusOwnerImpl2.clearFocus(false);
                                    if (delegatingSoftwareKeyboardController2 != null) {
                                        delegatingSoftwareKeyboardController2.hide();
                                    }
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, continuation);
                if (detectVerticalDragGestures$default2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
