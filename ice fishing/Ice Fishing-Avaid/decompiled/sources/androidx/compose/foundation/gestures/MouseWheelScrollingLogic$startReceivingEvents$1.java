package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;

/* compiled from: MouseWheelScrollingLogic.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingEvents$1", f = "MouseWheelScrollingLogic.kt", i = {0, 1}, l = {109, 112}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes.dex */
final class MouseWheelScrollingLogic$startReceivingEvents$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MouseWheelScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MouseWheelScrollingLogic$startReceivingEvents$1(MouseWheelScrollingLogic mouseWheelScrollingLogic, Continuation<? super MouseWheelScrollingLogic$startReceivingEvents$1> continuation) {
        super(2, continuation);
        this.this$0 = mouseWheelScrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MouseWheelScrollingLogic$startReceivingEvents$1 mouseWheelScrollingLogic$startReceivingEvents$1 = new MouseWheelScrollingLogic$startReceivingEvents$1(this.this$0, continuation);
        mouseWheelScrollingLogic$startReceivingEvents$1.L$0 = obj;
        return mouseWheelScrollingLogic$startReceivingEvents$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MouseWheelScrollingLogic$startReceivingEvents$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        if (r13 != r0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:7:0x0013, B:9:0x0032, B:11:0x003c, B:17:0x0053, B:25:0x0024), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0083 -> B:8:0x0016). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        float f;
        float f2;
        Object dispatchMouseWheelScroll;
        Channel channel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                if (!JobKt.isActive(coroutineScope.getCoroutineContext())) {
                }
            } else if (i == 1) {
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                MouseWheelScrollingLogic.MouseWheelScrollDelta mouseWheelScrollDelta = (MouseWheelScrollingLogic.MouseWheelScrollDelta) obj;
                Density density = this.this$0.getDensity();
                f = MouseWheelScrollingLogicKt.AnimationThreshold;
                float mo528toPx0680j_4 = density.mo528toPx0680j_4(f);
                Density density2 = this.this$0.getDensity();
                f2 = MouseWheelScrollingLogicKt.AnimationSpeed;
                float mo528toPx0680j_42 = density2.mo528toPx0680j_4(f2);
                MouseWheelScrollingLogic mouseWheelScrollingLogic = this.this$0;
                this.L$0 = coroutineScope2;
                this.label = 2;
                dispatchMouseWheelScroll = mouseWheelScrollingLogic.dispatchMouseWheelScroll(mouseWheelScrollingLogic.getScrollingLogic(), mouseWheelScrollDelta, mo528toPx0680j_4, mo528toPx0680j_42, this);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope2;
                if (!JobKt.isActive(coroutineScope.getCoroutineContext())) {
                    channel = this.this$0.channel;
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    Object receive = channel.receive(this);
                    if (receive == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope2 = coroutineScope;
                    obj = receive;
                    MouseWheelScrollingLogic.MouseWheelScrollDelta mouseWheelScrollDelta2 = (MouseWheelScrollingLogic.MouseWheelScrollDelta) obj;
                    Density density3 = this.this$0.getDensity();
                    f = MouseWheelScrollingLogicKt.AnimationThreshold;
                    float mo528toPx0680j_43 = density3.mo528toPx0680j_4(f);
                    Density density22 = this.this$0.getDensity();
                    f2 = MouseWheelScrollingLogicKt.AnimationSpeed;
                    float mo528toPx0680j_422 = density22.mo528toPx0680j_4(f2);
                    MouseWheelScrollingLogic mouseWheelScrollingLogic2 = this.this$0;
                    this.L$0 = coroutineScope2;
                    this.label = 2;
                    dispatchMouseWheelScroll = mouseWheelScrollingLogic2.dispatchMouseWheelScroll(mouseWheelScrollingLogic2.getScrollingLogic(), mouseWheelScrollDelta2, mo528toPx0680j_43, mo528toPx0680j_422, this);
                } else {
                    this.this$0.receivingMouseWheelEventsJob = null;
                    return Unit.INSTANCE;
                }
            }
        } catch (Throwable th) {
            this.this$0.receivingMouseWheelEventsJob = null;
            throw th;
        }
    }
}
