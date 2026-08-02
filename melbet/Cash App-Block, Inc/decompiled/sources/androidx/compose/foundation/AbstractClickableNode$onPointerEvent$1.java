package androidx.compose.foundation;

import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.compose.foundation.interaction.HoverInteraction$Enter;
import androidx.compose.foundation.interaction.HoverInteraction$Exit;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class AbstractClickableNode$onPointerEvent$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractClickableNode$onPointerEvent$1(AbstractClickableNode abstractClickableNode, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = abstractClickableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        AbstractClickableNode abstractClickableNode = this.this$0;
        switch (i) {
            case 0:
                return new AbstractClickableNode$onPointerEvent$1(abstractClickableNode, continuation, 0);
            default:
                return new AbstractClickableNode$onPointerEvent$1(abstractClickableNode, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AbstractClickableNode$onPointerEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Continuation continuation = null;
        AbstractClickableNode abstractClickableNode = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (abstractClickableNode.hoverInteraction == null) {
                    HoverInteraction$Enter hoverInteraction$Enter = new HoverInteraction$Enter();
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = abstractClickableNode.interactionSource;
                    if (mutableInteractionSourceImpl != null) {
                        JobKt.launch$default(abstractClickableNode.getCoroutineScope(), null, null, new VirtualCameraState$connect$2$1(mutableInteractionSourceImpl, hoverInteraction$Enter, continuation, 15), 3);
                    }
                    abstractClickableNode.hoverInteraction = hoverInteraction$Enter;
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                HoverInteraction$Enter hoverInteraction$Enter2 = abstractClickableNode.hoverInteraction;
                if (hoverInteraction$Enter2 != null) {
                    HoverInteraction$Exit hoverInteraction$Exit = new HoverInteraction$Exit(hoverInteraction$Enter2);
                    MutableInteractionSourceImpl mutableInteractionSourceImpl2 = abstractClickableNode.interactionSource;
                    if (mutableInteractionSourceImpl2 != null) {
                        JobKt.launch$default(abstractClickableNode.getCoroutineScope(), null, null, new VirtualCameraState$connect$2$1(mutableInteractionSourceImpl2, hoverInteraction$Exit, continuation, 16), 3);
                    }
                    abstractClickableNode.hoverInteraction = null;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
