package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.media3.common.FlagSet;
import app.cash.local.views.LocalViewFactory$createUi$view$3$1$1$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class TextFieldSelectionState$selectionHandleGestures$2$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean $isStartHandle;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
    public int label;
    public final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$selectionHandleGestures$2$2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = textFieldSelectionState;
        this.$this_selectionHandleGestures = pointerInputScope;
        this.$isStartHandle = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        boolean z = this.$isStartHandle;
        PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
        TextFieldSelectionState textFieldSelectionState = this.this$0;
        switch (i) {
            case 0:
                return new TextFieldSelectionState$selectionHandleGestures$2$2(pointerInputScope, textFieldSelectionState, z, continuation);
            default:
                return new TextFieldSelectionState$selectionHandleGestures$2$2(textFieldSelectionState, pointerInputScope, z, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((TextFieldSelectionState$selectionHandleGestures$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        boolean z = this.$isStartHandle;
        PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
        TextFieldSelectionState textFieldSelectionState = this.this$0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlagSet.Builder builder = new FlagSet.Builder(textFieldSelectionState, z, 3);
                    TextFieldSelectionState_androidKt$$ExternalSyntheticLambda2 textFieldSelectionState_androidKt$$ExternalSyntheticLambda2 = new TextFieldSelectionState_androidKt$$ExternalSyntheticLambda2(textFieldSelectionState, 1);
                    this.label = 1;
                    Object awaitEachGesture = Draggable2DKt.awaitEachGesture(pointerInputScope, new LocalViewFactory$createUi$view$3$1$1$1.AnonymousClass1(builder, textFieldSelectionState_androidKt$$ExternalSyntheticLambda2, continuation, 3), this);
                    if (awaitEachGesture != obj2) {
                        awaitEachGesture = Unit.INSTANCE;
                    }
                    if (awaitEachGesture == obj2) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (TextFieldSelectionState.access$detectSelectionHandleDragGestures(textFieldSelectionState, pointerInputScope, z, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
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
    public TextFieldSelectionState$selectionHandleGestures$2$2(PointerInputScope pointerInputScope, TextFieldSelectionState textFieldSelectionState, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$this_selectionHandleGestures = pointerInputScope;
        this.this$0 = textFieldSelectionState;
        this.$isStartHandle = z;
    }
}
