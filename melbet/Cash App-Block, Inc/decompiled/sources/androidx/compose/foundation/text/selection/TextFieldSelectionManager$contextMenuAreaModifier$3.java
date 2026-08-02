package androidx.compose.foundation.text.selection;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class TextFieldSelectionManager$contextMenuAreaModifier$3 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldSelectionManager$contextMenuAreaModifier$3(TextFieldSelectionManager textFieldSelectionManager, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = textFieldSelectionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        switch (i) {
            case 0:
                return new TextFieldSelectionManager$contextMenuAreaModifier$3(textFieldSelectionManager, continuation, 0);
            case 1:
                return new TextFieldSelectionManager$contextMenuAreaModifier$3(textFieldSelectionManager, continuation, 1);
            case 2:
                return new TextFieldSelectionManager$contextMenuAreaModifier$3(textFieldSelectionManager, continuation, 2);
            default:
                return new TextFieldSelectionManager$contextMenuAreaModifier$3(textFieldSelectionManager, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((TextFieldSelectionManager$contextMenuAreaModifier$3) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        TextFieldSelectionManager textFieldSelectionManager = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                textFieldSelectionManager.textToolbarShownViaProvider = false;
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                textFieldSelectionManager.cut$foundation();
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                textFieldSelectionManager.copy$foundation(textFieldSelectionManager.textToolbarShownViaProvider);
                break;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                textFieldSelectionManager.paste$foundation();
                break;
        }
        return Unit.INSTANCE;
    }
}
