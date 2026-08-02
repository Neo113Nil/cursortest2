package androidx.compose.foundation.text.input.internal.selection;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldSelectionState $this_with;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1(TextFieldSelectionState textFieldSelectionState, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.$this_with = textFieldSelectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1(this.$this_with, continuation, 0);
            case 1:
                return new TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1(this.$this_with, continuation, 1);
            default:
                return new TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1(this.$this_with, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        TextFieldSelectionState textFieldSelectionState = this.$this_with;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (textFieldSelectionState.cut(this) == coroutineSingletons) {
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
                    boolean booleanValue = ((Boolean) textFieldSelectionState.textToolbarShown$delegate.getValue()).booleanValue();
                    this.label = 1;
                    if (textFieldSelectionState.copy(booleanValue, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (textFieldSelectionState.paste(this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
