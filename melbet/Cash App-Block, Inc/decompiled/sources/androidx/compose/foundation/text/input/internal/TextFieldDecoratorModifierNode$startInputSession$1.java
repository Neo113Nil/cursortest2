package androidx.compose.foundation.text.input.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import app.cash.molecule.GatedFrameClock;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode$startInputSession$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldDecoratorModifierNode$startInputSession$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, Continuation continuation, int i) {
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
                return new TextFieldDecoratorModifierNode$startInputSession$1(textFieldDecoratorModifierNode, continuation, 0);
            default:
                return new TextFieldDecoratorModifierNode$startInputSession$1(textFieldDecoratorModifierNode, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
            case 0:
                ((TextFieldDecoratorModifierNode$startInputSession$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            default:
                return ((TextFieldDecoratorModifierNode$startInputSession$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                GatedFrameClock.AnonymousClass1 anonymousClass1 = new GatedFrameClock.AnonymousClass1(textFieldDecoratorModifierNode, (Continuation) null, 5);
                this.label = 1;
                PlatformTextInputModifierNodeKt.establishTextInputSession(textFieldDecoratorModifierNode, anonymousClass1, this);
                return coroutineSingletons;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TextFieldSelectionState textFieldSelectionState = textFieldDecoratorModifierNode.textFieldSelectionState;
                    this.label = 1;
                    if (textFieldSelectionState.startToolbarAndHandlesVisibilityObserver(this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
