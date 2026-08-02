package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$rotateDragFlow$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ScrollableNode$onKeyEvent$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long $scrollAmount;
    public int label;
    public final /* synthetic */ ScrollableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScrollableNode$onKeyEvent$1(ScrollableNode scrollableNode, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = scrollableNode;
        this.$scrollAmount = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new ScrollableNode$onKeyEvent$1(this.this$0, this.$scrollAmount, continuation, 0);
            case 1:
                return new ScrollableNode$onKeyEvent$1(this.this$0, this.$scrollAmount, continuation, 1);
            default:
                return new ScrollableNode$onKeyEvent$1(this.this$0, this.$scrollAmount, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ScrollableNode$onKeyEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        long j = this.$scrollAmount;
        ScrollableNode scrollableNode = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ScrollingLogic scrollingLogic = scrollableNode.scrollingLogic;
                    MutatePriority mutatePriority = MutatePriority.UserInput;
                    Hero3DCardViewKt$rotateDragFlow$2 hero3DCardViewKt$rotateDragFlow$2 = new Hero3DCardViewKt$rotateDragFlow$2(j, null);
                    this.label = 1;
                    if (scrollingLogic.scroll(mutatePriority, hero3DCardViewKt$rotateDragFlow$2, this) == coroutineSingletons) {
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
                    ScrollingLogic scrollingLogic2 = scrollableNode.scrollingLogic;
                    this.label = 1;
                    if (scrollingLogic2.m244onScrollStoppedBMRW4eQ(j, false, this) == coroutineSingletons2) {
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
                    ScrollingLogic scrollingLogic3 = scrollableNode.scrollingLogic;
                    this.label = 1;
                    if (scrollingLogic3.m244onScrollStoppedBMRW4eQ(j, true, this) == coroutineSingletons3) {
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
