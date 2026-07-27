package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;

/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1", f = "Draggable.kt", i = {}, l = {456}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class AbstractDraggableNode$pointerInputNode$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractDraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractDraggableNode$pointerInputNode$1(AbstractDraggableNode abstractDraggableNode, Continuation<? super AbstractDraggableNode$pointerInputNode$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractDraggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AbstractDraggableNode$pointerInputNode$1 abstractDraggableNode$pointerInputNode$1 = new AbstractDraggableNode$pointerInputNode$1(this.this$0, continuation);
        abstractDraggableNode$pointerInputNode$1.L$0 = obj;
        return abstractDraggableNode$pointerInputNode$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((AbstractDraggableNode$pointerInputNode$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            if (!this.this$0.getEnabled()) {
                return Unit.INSTANCE;
            }
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(new AnonymousClass1(pointerInputScope, this.this$0, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1", f = "Draggable.kt", i = {0}, l = {FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED}, m = "invokeSuspend", n = {"$this$coroutineScope"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PointerInputScope $$this$SuspendingPointerInputModifierNode;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractDraggableNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PointerInputScope pointerInputScope, AbstractDraggableNode abstractDraggableNode, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$$this$SuspendingPointerInputModifierNode = pointerInputScope;
            this.this$0 = abstractDraggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$SuspendingPointerInputModifierNode, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            CancellationException e;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                try {
                    this.L$0 = coroutineScope2;
                    this.label = 1;
                    if (this.$$this$SuspendingPointerInputModifierNode.awaitPointerEventScope(new C00101(coroutineScope2, this.this$0, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (CancellationException e2) {
                    coroutineScope = coroutineScope2;
                    e = e2;
                    if (!CoroutineScopeKt.isActive(coroutineScope)) {
                        throw e;
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (CancellationException e3) {
                    e = e3;
                    if (!CoroutineScopeKt.isActive(coroutineScope)) {
                    }
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: Draggable.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1", f = "Draggable.kt", i = {0, 1, 1}, l = {460, 475}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "isDragSuccessful"}, s = {"L$0", "L$0", "I$0"})
        /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00101 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            int I$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ AbstractDraggableNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00101(CoroutineScope coroutineScope, AbstractDraggableNode abstractDraggableNode, Continuation<? super C00101> continuation) {
                super(2, continuation);
                this.$$this$coroutineScope = coroutineScope;
                this.this$0 = abstractDraggableNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00101 c00101 = new C00101(this.$$this$coroutineScope, this.this$0, continuation);
                c00101.L$0 = obj;
                return c00101;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((C00101) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Can't wrap try/catch for region: R(8:26|(1:28)|29|30|31|32|33|(1:35)(9:37|9|10|11|(0)(0)|17|18|19|(2:66|67)(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x0146, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x0159, code lost:
            
                r4 = r16;
                r2 = r19;
                r3 = r20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x0144, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x014c, code lost:
            
                r3 = r20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x014f, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x0150, code lost:
            
                r19 = r5;
                r20 = r6;
                r16 = r7;
                r12 = r8;
                r18 = r9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x0148, code lost:
            
                r0 = th;
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x0149, code lost:
            
                r20 = r6;
                r12 = r8;
             */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0109  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x0165  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0188 A[Catch: all -> 0x0189, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0189, blocks: (B:42:0x015f, B:45:0x0188), top: B:41:0x015f }] */
            /* JADX WARN: Removed duplicated region for block: B:50:0x019f  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x01c6  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x01d3  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x01d9  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0132  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e7 -> B:9:0x00ee). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0165 -> B:18:0x0182). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01d3 -> B:19:0x0055). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AwaitPointerEventScope awaitPointerEventScope;
                DefaultConstructorMarker defaultConstructorMarker;
                Throwable th;
                DragEvent dragEvent;
                Channel channel;
                VelocityTracker velocityTracker;
                VelocityTracker velocityTracker2;
                int i;
                CancellationException e;
                Channel channel2;
                Object obj2;
                Pair pair;
                boolean z;
                VelocityTracker velocityTracker3;
                Channel channel3;
                Object m366awaitDragSu4bsnU;
                Function1 function1;
                Function0 function0;
                VelocityTracker velocityTracker4;
                DragEvent dragEvent2;
                Channel channel4;
                VelocityTracker velocityTracker5;
                VelocityTracker velocityTracker6;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                int i3 = 0;
                int i4 = 1;
                DefaultConstructorMarker defaultConstructorMarker2 = null;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    if (CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                    }
                } else if (i2 == 1) {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    obj2 = obj;
                    AwaitPointerEventScope awaitPointerEventScope2 = awaitPointerEventScope;
                    pair = (Pair) obj2;
                    if (pair == null) {
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = this.I$0;
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$2;
                    AbstractDraggableNode abstractDraggableNode = (AbstractDraggableNode) this.L$1;
                    AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        m366awaitDragSu4bsnU = obj;
                        defaultConstructorMarker = null;
                        i = 1;
                    } catch (CancellationException e2) {
                        e = e2;
                        defaultConstructorMarker = null;
                        i = 1;
                        try {
                            if (!CoroutineScopeKt.isActive(coroutineScope)) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            float maximumFlingVelocity = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractDraggableNode, CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                            if (i3 == 0) {
                                velocityTracker = abstractDraggableNode.velocityTracker;
                                long m4652calculateVelocityAH228Gc = velocityTracker.m4652calculateVelocityAH228Gc(VelocityKt.Velocity(maximumFlingVelocity, maximumFlingVelocity));
                                velocityTracker2 = abstractDraggableNode.velocityTracker;
                                velocityTracker2.resetTracking();
                                dragEvent = new DragEvent.DragStopped(Velocity.m5975timesadjELrA(m4652calculateVelocityAH228Gc, abstractDraggableNode.getReverseDirection() ? -1.0f : 1.0f), defaultConstructorMarker);
                            } else {
                                dragEvent = DragEvent.DragCancelled.INSTANCE;
                            }
                            channel = abstractDraggableNode.channel;
                            channel.mo7744trySendJP2dKIU(dragEvent);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i3 = i5;
                        defaultConstructorMarker = null;
                        float maximumFlingVelocity2 = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractDraggableNode, CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                        if (i3 == 0) {
                        }
                        channel = abstractDraggableNode.channel;
                        channel.mo7744trySendJP2dKIU(dragEvent);
                        throw th;
                    }
                    try {
                    } catch (CancellationException e3) {
                        e = e3;
                        if (!CoroutineScopeKt.isActive(coroutineScope)) {
                            throw e;
                        }
                        ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractDraggableNode, CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                        DragEvent.DragCancelled dragCancelled = DragEvent.DragCancelled.INSTANCE;
                        channel2 = abstractDraggableNode.channel;
                        channel2.mo7744trySendJP2dKIU(dragCancelled);
                        awaitPointerEventScope = awaitPointerEventScope3;
                        defaultConstructorMarker2 = defaultConstructorMarker;
                        i4 = i;
                        if (CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        i3 = i5;
                        float maximumFlingVelocity22 = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractDraggableNode, CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                        if (i3 == 0) {
                        }
                        channel = abstractDraggableNode.channel;
                        channel.mo7744trySendJP2dKIU(dragEvent);
                        throw th;
                    }
                    boolean booleanValue = ((Boolean) m366awaitDragSu4bsnU).booleanValue();
                    float maximumFlingVelocity3 = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractDraggableNode, CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                    if (booleanValue) {
                        dragEvent2 = DragEvent.DragCancelled.INSTANCE;
                    } else {
                        velocityTracker5 = abstractDraggableNode.velocityTracker;
                        long m4652calculateVelocityAH228Gc2 = velocityTracker5.m4652calculateVelocityAH228Gc(VelocityKt.Velocity(maximumFlingVelocity3, maximumFlingVelocity3));
                        velocityTracker6 = abstractDraggableNode.velocityTracker;
                        velocityTracker6.resetTracking();
                        dragEvent2 = new DragEvent.DragStopped(Velocity.m5975timesadjELrA(m4652calculateVelocityAH228Gc2, abstractDraggableNode.getReverseDirection() ? -1.0f : 1.0f), defaultConstructorMarker);
                    }
                    channel4 = abstractDraggableNode.channel;
                    channel4.mo7744trySendJP2dKIU(dragEvent2);
                    awaitPointerEventScope = awaitPointerEventScope3;
                    defaultConstructorMarker2 = defaultConstructorMarker;
                    i4 = i;
                    if (CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                        function1 = this.this$0._canDrag;
                        function0 = this.this$0._startDragImmediately;
                        velocityTracker4 = this.this$0.velocityTracker;
                        this.L$0 = awaitPointerEventScope;
                        this.L$1 = defaultConstructorMarker2;
                        this.L$2 = defaultConstructorMarker2;
                        this.label = i4;
                        obj2 = DraggableKt.awaitDownAndSlop(awaitPointerEventScope, function1, function0, velocityTracker4, this.this$0.getPointerDirectionConfig(), this);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        AwaitPointerEventScope awaitPointerEventScope22 = awaitPointerEventScope;
                        pair = (Pair) obj2;
                        if (pair == null) {
                            final AbstractDraggableNode abstractDraggableNode2 = this.this$0;
                            CoroutineScope coroutineScope2 = this.$$this$coroutineScope;
                            z = abstractDraggableNode2.isListeningForEvents;
                            if (!z) {
                                abstractDraggableNode2.startListeningForEvents();
                            }
                            PointerInputChange pointerInputChange = (PointerInputChange) pair.getFirst();
                            long packedValue = ((Offset) pair.getSecond()).getPackedValue();
                            velocityTracker3 = abstractDraggableNode2.velocityTracker;
                            channel3 = abstractDraggableNode2.channel;
                            Channel channel5 = channel3;
                            boolean reverseDirection = abstractDraggableNode2.getReverseDirection();
                            Function1<PointerInputChange, Boolean> function12 = new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.AbstractDraggableNode$pointerInputNode$1$1$1$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Boolean invoke(PointerInputChange pointerInputChange2) {
                                    return Boolean.valueOf(!(AbstractDraggableNode.this.getPointerDirectionConfig().mo353calculateDeltaChangek4lQ0M(PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange2)) == 0.0f));
                                }
                            };
                            this.L$0 = awaitPointerEventScope22;
                            this.L$1 = abstractDraggableNode2;
                            this.L$2 = coroutineScope2;
                            this.I$0 = 0;
                            this.label = 2;
                            CoroutineScope coroutineScope3 = coroutineScope2;
                            AbstractDraggableNode abstractDraggableNode3 = abstractDraggableNode2;
                            AwaitPointerEventScope awaitPointerEventScope4 = awaitPointerEventScope22;
                            defaultConstructorMarker = defaultConstructorMarker2;
                            i = i4;
                            m366awaitDragSu4bsnU = DraggableKt.m366awaitDragSu4bsnU(awaitPointerEventScope22, pointerInputChange, packedValue, velocityTracker3, channel5, reverseDirection, function12, this);
                            if (m366awaitDragSu4bsnU == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i5 = 0;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                            coroutineScope = coroutineScope3;
                            abstractDraggableNode = abstractDraggableNode3;
                            boolean booleanValue2 = ((Boolean) m366awaitDragSu4bsnU).booleanValue();
                            float maximumFlingVelocity32 = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractDraggableNode, CompositionLocalsKt.getLocalViewConfiguration())).getMaximumFlingVelocity();
                            if (booleanValue2) {
                            }
                            channel4 = abstractDraggableNode.channel;
                            channel4.mo7744trySendJP2dKIU(dragEvent2);
                            awaitPointerEventScope = awaitPointerEventScope3;
                            defaultConstructorMarker2 = defaultConstructorMarker;
                            i4 = i;
                            if (CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                                return Unit.INSTANCE;
                            }
                        } else {
                            awaitPointerEventScope = awaitPointerEventScope22;
                            if (CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                            }
                        }
                    }
                }
            }
        }
    }
}
