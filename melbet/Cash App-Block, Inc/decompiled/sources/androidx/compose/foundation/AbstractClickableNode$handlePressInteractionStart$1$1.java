package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.interaction.PressInteraction;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class AbstractClickableNode$handlePressInteractionStart$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableInteractionSourceImpl $interactionSource;
    public final /* synthetic */ PressInteraction.Press $press;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractClickableNode$handlePressInteractionStart$1$1(MutableInteractionSourceImpl mutableInteractionSourceImpl, PressInteraction.Press press, AbstractClickableNode abstractClickableNode, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$interactionSource = mutableInteractionSourceImpl;
        this.$press = press;
        this.this$0 = abstractClickableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new AbstractClickableNode$handlePressInteractionStart$1$1(this.$interactionSource, this.$press, this.this$0, continuation, 0);
            default:
                return new AbstractClickableNode$handlePressInteractionStart$1$1(this.$interactionSource, this.$press, this.this$0, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AbstractClickableNode$handlePressInteractionStart$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r2.emit(r7, r9) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r3, r9) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r2.emit(r7, r9) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r3, r9) == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        AbstractClickableNode abstractClickableNode = this.this$0;
        MutableInteractionSourceImpl mutableInteractionSourceImpl = this.$interactionSource;
        PressInteraction.Press press = this.$press;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j = Clickable_androidKt.TapIndicationDelay;
                    this.label = 1;
                    break;
                } else if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i2 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    abstractClickableNode.indirectPointerPressInteraction = press;
                    break;
                }
                this.label = 2;
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j2 = Clickable_androidKt.TapIndicationDelay;
                    this.label = 1;
                    break;
                } else if (i3 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i3 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    abstractClickableNode.pressInteraction = press;
                    break;
                }
                this.label = 2;
                break;
        }
        return Unit.INSTANCE;
    }
}
