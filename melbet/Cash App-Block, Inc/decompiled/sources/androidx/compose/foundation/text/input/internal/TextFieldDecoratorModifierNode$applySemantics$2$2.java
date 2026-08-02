package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.Updater;
import androidx.paging.compose.LazyPagingItems$collectLoadState$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class TextFieldDecoratorModifierNode$applySemantics$2$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldDecoratorModifierNode$applySemantics$2$2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = textFieldDecoratorModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
        switch (i) {
            case 0:
                return new TextFieldDecoratorModifierNode$applySemantics$2$2(textFieldDecoratorModifierNode, continuation, 0);
            case 1:
                return new TextFieldDecoratorModifierNode$applySemantics$2$2(textFieldDecoratorModifierNode, continuation, 1);
            case 2:
                return new TextFieldDecoratorModifierNode$applySemantics$2$2(textFieldDecoratorModifierNode, continuation, 2);
            default:
                return new TextFieldDecoratorModifierNode$applySemantics$2$2(textFieldDecoratorModifierNode, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((TextFieldDecoratorModifierNode$applySemantics$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object collect = FlowKt.take(FlowKt.drop(Updater.snapshotFlow(new TextFieldDecoratorModifierNode$$ExternalSyntheticLambda12(textFieldDecoratorModifierNode, 2)), 1), 1).collect(new LazyPagingItems$collectLoadState$2(textFieldDecoratorModifierNode, 5), this);
                    if (collect != coroutineSingletons) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons) {
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
                    TextFieldSelectionState textFieldSelectionState = textFieldDecoratorModifierNode.textFieldSelectionState;
                    this.label = 1;
                    if (textFieldSelectionState.copy(true, this) == coroutineSingletons2) {
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
                    TextFieldSelectionState textFieldSelectionState2 = textFieldDecoratorModifierNode.textFieldSelectionState;
                    this.label = 1;
                    if (textFieldSelectionState2.cut(this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TextFieldSelectionState textFieldSelectionState3 = textFieldDecoratorModifierNode.textFieldSelectionState;
                    this.label = 1;
                    if (textFieldSelectionState3.paste(this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
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
