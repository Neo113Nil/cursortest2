package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3$$ExternalSyntheticLambda0;
import androidx.compose.ui.input.pointer.PointerInputScope;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
    public final /* synthetic */ TextFieldSelectionState $this_with;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1(PointerInputScope pointerInputScope, TextFieldSelectionState textFieldSelectionState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 3;
        this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
        this.$this_with = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
        TextFieldSelectionState textFieldSelectionState = this.$this_with;
        switch (i) {
            case 0:
                return new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1(textFieldSelectionState, pointerInputScope, continuation, 0);
            case 1:
                return new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1(textFieldSelectionState, pointerInputScope, continuation, 1);
            case 2:
                return new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1(textFieldSelectionState, pointerInputScope, continuation, 2);
            case 3:
                return new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1(pointerInputScope, textFieldSelectionState, continuation);
            default:
                return new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1(textFieldSelectionState, pointerInputScope, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
        TextFieldSelectionState textFieldSelectionState = this.$this_with;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (textFieldSelectionState.detectTouchMode(pointerInputScope, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (textFieldSelectionState.detectTouchMode(pointerInputScope, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (TextFieldSelectionState.access$detectCursorHandleDragGestures(textFieldSelectionState, pointerInputScope, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TextFieldSelectionState$cursorHandleGestures$2$3$$ExternalSyntheticLambda0 textFieldSelectionState$cursorHandleGestures$2$3$$ExternalSyntheticLambda0 = new TextFieldSelectionState$cursorHandleGestures$2$3$$ExternalSyntheticLambda0(textFieldSelectionState, 0);
                    this.label = 1;
                    if (TapGestureDetectorKt.detectTapGestures$default(this.$this_SuspendingPointerInputModifierNode, null, null, textFieldSelectionState$cursorHandleGestures$2$3$$ExternalSyntheticLambda0, this, 7) == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (textFieldSelectionState.detectTouchMode(pointerInputScope, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$this_with = textFieldSelectionState;
        this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
    }
}
