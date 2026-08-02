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
public final class AbstractClickableNode$onKeyEvent$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ PressInteraction.Press $press;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractClickableNode$onKeyEvent$1(AbstractClickableNode abstractClickableNode, PressInteraction.Press press, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = abstractClickableNode;
        this.$press = press;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        PressInteraction.Press press = this.$press;
        AbstractClickableNode abstractClickableNode = this.this$0;
        switch (i) {
            case 0:
                return new AbstractClickableNode$onKeyEvent$1(abstractClickableNode, press, continuation, 0);
            case 1:
                return new AbstractClickableNode$onKeyEvent$1(abstractClickableNode, press, continuation, 1);
            case 2:
                return new AbstractClickableNode$onKeyEvent$1(abstractClickableNode, press, continuation, 2);
            default:
                return new AbstractClickableNode$onKeyEvent$1(abstractClickableNode, press, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AbstractClickableNode$onKeyEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        PressInteraction.Press press = this.$press;
        AbstractClickableNode abstractClickableNode = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = abstractClickableNode.interactionSource;
                    if (mutableInteractionSourceImpl != null) {
                        this.label = 1;
                        if (mutableInteractionSourceImpl.emit(press, this) == coroutineSingletons) {
                            break;
                        }
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
                    MutableInteractionSourceImpl mutableInteractionSourceImpl2 = abstractClickableNode.interactionSource;
                    if (mutableInteractionSourceImpl2 != null) {
                        PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
                        this.label = 1;
                        if (mutableInteractionSourceImpl2.emit(cancel, this) == coroutineSingletons2) {
                            break;
                        }
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
                    MutableInteractionSourceImpl mutableInteractionSourceImpl3 = abstractClickableNode.interactionSource;
                    if (mutableInteractionSourceImpl3 != null) {
                        PressInteraction.Cancel cancel2 = new PressInteraction.Cancel(press);
                        this.label = 1;
                        if (mutableInteractionSourceImpl3.emit(cancel2, this) == coroutineSingletons3) {
                            break;
                        }
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
                    MutableInteractionSourceImpl mutableInteractionSourceImpl4 = abstractClickableNode.interactionSource;
                    if (mutableInteractionSourceImpl4 != null) {
                        PressInteraction.Release release = new PressInteraction.Release(press);
                        this.label = 1;
                        if (mutableInteractionSourceImpl4.emit(release, this) == coroutineSingletons4) {
                            break;
                        }
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
