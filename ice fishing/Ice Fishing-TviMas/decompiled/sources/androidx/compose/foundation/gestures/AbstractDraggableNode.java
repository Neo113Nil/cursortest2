package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.pointer.util.VelocityTracker;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.unit.Velocity;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B½\u0001\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u0012<\u0010\r\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017\u0012<\u0010\u0018\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0002\u0010\u001cJ\u0006\u0010H\u001a\u00020\u0015J7\u0010I\u001a\u00020\u00152'\u0010J\u001a#\b\u0001\u0012\u0004\u0012\u00020L\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160K¢\u0006\u0002\b\u0017H¦@¢\u0006\u0002\u0010MJ\b\u0010N\u001a\u00020\u0015H\u0016J\b\u0010O\u001a\u00020\u0015H\u0016J*\u0010P\u001a\u00020\u00152\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020VH\u0016ø\u0001\u0000¢\u0006\u0004\bW\u0010XJ\b\u0010Y\u001a\u00020\u0015H\u0002J\u001a\u0010Z\u001a\u00020\u0015*\u00020L2\u0006\u0010[\u001a\u00020\\H¦@¢\u0006\u0002\u0010]J\u0012\u0010^\u001a\u00020\u0015*\u00020\u000fH\u0082@¢\u0006\u0002\u0010_J\u001a\u0010`\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010a\u001a\u00020bH\u0082@¢\u0006\u0002\u0010cJ\u001a\u0010d\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010a\u001a\u00020eH\u0082@¢\u0006\u0002\u0010fR\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u000e\u00100\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000RR\u0010\r\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b1\u00102\"\u0004\b3\u00104RR\u0010\u0018\u001a8\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e¢\u0006\u0002\b\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b6\u00102\"\u0004\b7\u00104R\u0012\u00108\u001a\u000209X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010<\u001a\u00020=¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u001a\u0010\u001b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010)\"\u0004\bA\u0010+R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u000e\u0010F\u001a\u00020GX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006g"}, d2 = {"Landroidx/compose/foundation/gestures/AbstractDraggableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "canDrag", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "startDragImmediately", "Lkotlin/Function0;", "onDragStarted", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "onDragStopped", "Landroidx/compose/ui/unit/Velocity;", "velocity", "reverseDirection", "(Lkotlin/jvm/functions/Function1;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)V", "_canDrag", "_startDragImmediately", "getCanDrag", "()Lkotlin/jvm/functions/Function1;", "setCanDrag", "(Lkotlin/jvm/functions/Function1;)V", AppsFlyerProperties.CHANNEL, "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/DragEvent;", "dragInteraction", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "getEnabled", "()Z", "setEnabled", "(Z)V", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "setInteractionSource", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "isListeningForEvents", "getOnDragStarted", "()Lkotlin/jvm/functions/Function3;", "setOnDragStarted", "(Lkotlin/jvm/functions/Function3;)V", "Lkotlin/jvm/functions/Function3;", "getOnDragStopped", "setOnDragStopped", "pointerDirectionConfig", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "getPointerDirectionConfig", "()Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "getPointerInputNode", "()Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "getReverseDirection", "setReverseDirection", "getStartDragImmediately", "()Lkotlin/jvm/functions/Function0;", "setStartDragImmediately", "(Lkotlin/jvm/functions/Function0;)V", "velocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "disposeInteractionSource", "drag", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/AbstractDragScope;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCancelPointerInput", "onDetach", "onPointerEvent", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "bounds", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "startListeningForEvents", "draggingBy", "dragDelta", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "(Landroidx/compose/foundation/gestures/AbstractDragScope;Landroidx/compose/foundation/gestures/DragEvent$DragDelta;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragCancel", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragStart", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/DragEvent$DragStarted;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDragStop", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/DragEvent$DragStopped;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AbstractDraggableNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private Function1<? super PointerInputChange, Boolean> canDrag;
    private DragInteraction.Start dragInteraction;
    private boolean enabled;
    private MutableInteractionSource interactionSource;
    private boolean isListeningForEvents;
    private Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted;
    private Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> onDragStopped;
    private boolean reverseDirection;
    private Function0<Boolean> startDragImmediately;
    private final Function1<PointerInputChange, Boolean> _canDrag = new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.AbstractDraggableNode$_canDrag$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return AbstractDraggableNode.this.getCanDrag().invoke(pointerInputChange);
        }
    };
    private final Function0<Boolean> _startDragImmediately = new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.AbstractDraggableNode$_startDragImmediately$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AbstractDraggableNode.this.getStartDragImmediately().invoke();
        }
    };
    private final VelocityTracker velocityTracker = new VelocityTracker();
    private final SuspendingPointerInputModifierNode pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new AbstractDraggableNode$pointerInputNode$1(this, null)));
    private final Channel<DragEvent> channel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);

    public abstract Object drag(Function2<? super AbstractDragScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation);

    public abstract Object draggingBy(AbstractDragScope abstractDragScope, DragEvent.DragDelta dragDelta, Continuation<? super Unit> continuation);

    public abstract PointerDirectionConfig getPointerDirectionConfig();

    public final Function1<PointerInputChange, Boolean> getCanDrag() {
        return this.canDrag;
    }

    public final void setCanDrag(Function1<? super PointerInputChange, Boolean> function1) {
        this.canDrag = function1;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final void setInteractionSource(MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    public final Function0<Boolean> getStartDragImmediately() {
        return this.startDragImmediately;
    }

    public final void setStartDragImmediately(Function0<Boolean> function0) {
        this.startDragImmediately = function0;
    }

    public final Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> getOnDragStarted() {
        return this.onDragStarted;
    }

    public final void setOnDragStarted(Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3) {
        this.onDragStarted = function3;
    }

    public final Function3<CoroutineScope, Velocity, Continuation<? super Unit>, Object> getOnDragStopped() {
        return this.onDragStopped;
    }

    public final void setOnDragStopped(Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function3) {
        this.onDragStopped = function3;
    }

    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    public final void setReverseDirection(boolean z) {
        this.reverseDirection = z;
    }

    public AbstractDraggableNode(Function1<? super PointerInputChange, Boolean> function1, boolean z, MutableInteractionSource mutableInteractionSource, Function0<Boolean> function0, Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function32, boolean z2) {
        this.canDrag = function1;
        this.enabled = z;
        this.interactionSource = mutableInteractionSource;
        this.startDragImmediately = function0;
        this.onDragStarted = function3;
        this.onDragStopped = function32;
        this.reverseDirection = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startListeningForEvents() {
        this.isListeningForEvents = true;
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AbstractDraggableNode$startListeningForEvents$1(this, null), 3, null);
    }

    public final SuspendingPointerInputModifierNode getPointerInputNode() {
        return this.pointerInputNode;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.isListeningForEvents = false;
        disposeInteractionSource();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo179onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        this.pointerInputNode.mo179onPointerEventH0pRuoY(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragStart(CoroutineScope coroutineScope, DragEvent.DragStarted dragStarted, Continuation<? super Unit> continuation) {
        AbstractDraggableNode$processDragStart$1 abstractDraggableNode$processDragStart$1;
        Object coroutine_suspended;
        int i;
        AbstractDraggableNode abstractDraggableNode;
        MutableInteractionSource mutableInteractionSource;
        DragInteraction.Start start;
        MutableInteractionSource mutableInteractionSource2;
        AbstractDraggableNode abstractDraggableNode2;
        CoroutineScope coroutineScope2;
        DragInteraction.Start start2;
        Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3;
        Offset m3155boximpl;
        if (continuation instanceof AbstractDraggableNode$processDragStart$1) {
            abstractDraggableNode$processDragStart$1 = (AbstractDraggableNode$processDragStart$1) continuation;
            if ((abstractDraggableNode$processDragStart$1.label & Integer.MIN_VALUE) != 0) {
                abstractDraggableNode$processDragStart$1.label -= Integer.MIN_VALUE;
                Object obj = abstractDraggableNode$processDragStart$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = abstractDraggableNode$processDragStart$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DragInteraction.Start start3 = this.dragInteraction;
                    if (start3 != null && (mutableInteractionSource = this.interactionSource) != null) {
                        DragInteraction.Cancel cancel = new DragInteraction.Cancel(start3);
                        abstractDraggableNode$processDragStart$1.L$0 = this;
                        abstractDraggableNode$processDragStart$1.L$1 = coroutineScope;
                        abstractDraggableNode$processDragStart$1.L$2 = dragStarted;
                        abstractDraggableNode$processDragStart$1.label = 1;
                        if (mutableInteractionSource.emit(cancel, abstractDraggableNode$processDragStart$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    abstractDraggableNode = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        start2 = (DragInteraction.Start) abstractDraggableNode$processDragStart$1.L$3;
                        dragStarted = (DragEvent.DragStarted) abstractDraggableNode$processDragStart$1.L$2;
                        coroutineScope2 = (CoroutineScope) abstractDraggableNode$processDragStart$1.L$1;
                        abstractDraggableNode2 = (AbstractDraggableNode) abstractDraggableNode$processDragStart$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        start = start2;
                        coroutineScope = coroutineScope2;
                        abstractDraggableNode = abstractDraggableNode2;
                        abstractDraggableNode.dragInteraction = start;
                        function3 = abstractDraggableNode.onDragStarted;
                        m3155boximpl = Offset.m3155boximpl(dragStarted.getStartPoint());
                        abstractDraggableNode$processDragStart$1.L$0 = null;
                        abstractDraggableNode$processDragStart$1.L$1 = null;
                        abstractDraggableNode$processDragStart$1.L$2 = null;
                        abstractDraggableNode$processDragStart$1.L$3 = null;
                        abstractDraggableNode$processDragStart$1.label = 3;
                        if (function3.invoke(coroutineScope, m3155boximpl, abstractDraggableNode$processDragStart$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    DragEvent.DragStarted dragStarted2 = (DragEvent.DragStarted) abstractDraggableNode$processDragStart$1.L$2;
                    CoroutineScope coroutineScope3 = (CoroutineScope) abstractDraggableNode$processDragStart$1.L$1;
                    abstractDraggableNode = (AbstractDraggableNode) abstractDraggableNode$processDragStart$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    dragStarted = dragStarted2;
                    coroutineScope = coroutineScope3;
                }
                start = new DragInteraction.Start();
                mutableInteractionSource2 = abstractDraggableNode.interactionSource;
                if (mutableInteractionSource2 != null) {
                    abstractDraggableNode$processDragStart$1.L$0 = abstractDraggableNode;
                    abstractDraggableNode$processDragStart$1.L$1 = coroutineScope;
                    abstractDraggableNode$processDragStart$1.L$2 = dragStarted;
                    abstractDraggableNode$processDragStart$1.L$3 = start;
                    abstractDraggableNode$processDragStart$1.label = 2;
                    if (mutableInteractionSource2.emit(start, abstractDraggableNode$processDragStart$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    abstractDraggableNode2 = abstractDraggableNode;
                    coroutineScope2 = coroutineScope;
                    start2 = start;
                    start = start2;
                    coroutineScope = coroutineScope2;
                    abstractDraggableNode = abstractDraggableNode2;
                }
                abstractDraggableNode.dragInteraction = start;
                function3 = abstractDraggableNode.onDragStarted;
                m3155boximpl = Offset.m3155boximpl(dragStarted.getStartPoint());
                abstractDraggableNode$processDragStart$1.L$0 = null;
                abstractDraggableNode$processDragStart$1.L$1 = null;
                abstractDraggableNode$processDragStart$1.L$2 = null;
                abstractDraggableNode$processDragStart$1.L$3 = null;
                abstractDraggableNode$processDragStart$1.label = 3;
                if (function3.invoke(coroutineScope, m3155boximpl, abstractDraggableNode$processDragStart$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        abstractDraggableNode$processDragStart$1 = new AbstractDraggableNode$processDragStart$1(this, continuation);
        Object obj2 = abstractDraggableNode$processDragStart$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = abstractDraggableNode$processDragStart$1.label;
        if (i != 0) {
        }
        start = new DragInteraction.Start();
        mutableInteractionSource2 = abstractDraggableNode.interactionSource;
        if (mutableInteractionSource2 != null) {
        }
        abstractDraggableNode.dragInteraction = start;
        function3 = abstractDraggableNode.onDragStarted;
        m3155boximpl = Offset.m3155boximpl(dragStarted.getStartPoint());
        abstractDraggableNode$processDragStart$1.L$0 = null;
        abstractDraggableNode$processDragStart$1.L$1 = null;
        abstractDraggableNode$processDragStart$1.L$2 = null;
        abstractDraggableNode$processDragStart$1.L$3 = null;
        abstractDraggableNode$processDragStart$1.label = 3;
        if (function3.invoke(coroutineScope, m3155boximpl, abstractDraggableNode$processDragStart$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragStop(CoroutineScope coroutineScope, DragEvent.DragStopped dragStopped, Continuation<? super Unit> continuation) {
        AbstractDraggableNode$processDragStop$1 abstractDraggableNode$processDragStop$1;
        Object coroutine_suspended;
        int i;
        AbstractDraggableNode abstractDraggableNode;
        Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function3;
        Velocity m5960boximpl;
        if (continuation instanceof AbstractDraggableNode$processDragStop$1) {
            abstractDraggableNode$processDragStop$1 = (AbstractDraggableNode$processDragStop$1) continuation;
            if ((abstractDraggableNode$processDragStop$1.label & Integer.MIN_VALUE) != 0) {
                abstractDraggableNode$processDragStop$1.label -= Integer.MIN_VALUE;
                Object obj = abstractDraggableNode$processDragStop$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = abstractDraggableNode$processDragStop$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DragInteraction.Start start = this.dragInteraction;
                    if (start != null) {
                        MutableInteractionSource mutableInteractionSource = this.interactionSource;
                        if (mutableInteractionSource != null) {
                            DragInteraction.Stop stop = new DragInteraction.Stop(start);
                            abstractDraggableNode$processDragStop$1.L$0 = this;
                            abstractDraggableNode$processDragStop$1.L$1 = coroutineScope;
                            abstractDraggableNode$processDragStop$1.L$2 = dragStopped;
                            abstractDraggableNode$processDragStop$1.label = 1;
                            if (mutableInteractionSource.emit(stop, abstractDraggableNode$processDragStop$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        abstractDraggableNode = this;
                    } else {
                        abstractDraggableNode = this;
                        function3 = abstractDraggableNode.onDragStopped;
                        m5960boximpl = Velocity.m5960boximpl(dragStopped.getVelocity());
                        abstractDraggableNode$processDragStop$1.L$0 = null;
                        abstractDraggableNode$processDragStop$1.L$1 = null;
                        abstractDraggableNode$processDragStop$1.L$2 = null;
                        abstractDraggableNode$processDragStop$1.label = 2;
                        if (function3.invoke(coroutineScope, m5960boximpl, abstractDraggableNode$processDragStop$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    DragEvent.DragStopped dragStopped2 = (DragEvent.DragStopped) abstractDraggableNode$processDragStop$1.L$2;
                    CoroutineScope coroutineScope2 = (CoroutineScope) abstractDraggableNode$processDragStop$1.L$1;
                    abstractDraggableNode = (AbstractDraggableNode) abstractDraggableNode$processDragStop$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    dragStopped = dragStopped2;
                    coroutineScope = coroutineScope2;
                }
                abstractDraggableNode.dragInteraction = null;
                function3 = abstractDraggableNode.onDragStopped;
                m5960boximpl = Velocity.m5960boximpl(dragStopped.getVelocity());
                abstractDraggableNode$processDragStop$1.L$0 = null;
                abstractDraggableNode$processDragStop$1.L$1 = null;
                abstractDraggableNode$processDragStop$1.L$2 = null;
                abstractDraggableNode$processDragStop$1.label = 2;
                if (function3.invoke(coroutineScope, m5960boximpl, abstractDraggableNode$processDragStop$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        abstractDraggableNode$processDragStop$1 = new AbstractDraggableNode$processDragStop$1(this, continuation);
        Object obj2 = abstractDraggableNode$processDragStop$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = abstractDraggableNode$processDragStop$1.label;
        if (i != 0) {
        }
        abstractDraggableNode.dragInteraction = null;
        function3 = abstractDraggableNode.onDragStopped;
        m5960boximpl = Velocity.m5960boximpl(dragStopped.getVelocity());
        abstractDraggableNode$processDragStop$1.L$0 = null;
        abstractDraggableNode$processDragStop$1.L$1 = null;
        abstractDraggableNode$processDragStop$1.L$2 = null;
        abstractDraggableNode$processDragStop$1.label = 2;
        if (function3.invoke(coroutineScope, m5960boximpl, abstractDraggableNode$processDragStop$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object processDragCancel(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        AbstractDraggableNode$processDragCancel$1 abstractDraggableNode$processDragCancel$1;
        Object coroutine_suspended;
        int i;
        AbstractDraggableNode abstractDraggableNode;
        Function3<? super CoroutineScope, ? super Velocity, ? super Continuation<? super Unit>, ? extends Object> function3;
        Velocity m5960boximpl;
        if (continuation instanceof AbstractDraggableNode$processDragCancel$1) {
            abstractDraggableNode$processDragCancel$1 = (AbstractDraggableNode$processDragCancel$1) continuation;
            if ((abstractDraggableNode$processDragCancel$1.label & Integer.MIN_VALUE) != 0) {
                abstractDraggableNode$processDragCancel$1.label -= Integer.MIN_VALUE;
                Object obj = abstractDraggableNode$processDragCancel$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = abstractDraggableNode$processDragCancel$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DragInteraction.Start start = this.dragInteraction;
                    if (start != null) {
                        MutableInteractionSource mutableInteractionSource = this.interactionSource;
                        if (mutableInteractionSource != null) {
                            DragInteraction.Cancel cancel = new DragInteraction.Cancel(start);
                            abstractDraggableNode$processDragCancel$1.L$0 = this;
                            abstractDraggableNode$processDragCancel$1.L$1 = coroutineScope;
                            abstractDraggableNode$processDragCancel$1.label = 1;
                            if (mutableInteractionSource.emit(cancel, abstractDraggableNode$processDragCancel$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        abstractDraggableNode = this;
                    } else {
                        abstractDraggableNode = this;
                        function3 = abstractDraggableNode.onDragStopped;
                        m5960boximpl = Velocity.m5960boximpl(Velocity.INSTANCE.m5980getZero9UxMQ8M());
                        abstractDraggableNode$processDragCancel$1.L$0 = null;
                        abstractDraggableNode$processDragCancel$1.L$1 = null;
                        abstractDraggableNode$processDragCancel$1.label = 2;
                        if (function3.invoke(coroutineScope, m5960boximpl, abstractDraggableNode$processDragCancel$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    coroutineScope = (CoroutineScope) abstractDraggableNode$processDragCancel$1.L$1;
                    abstractDraggableNode = (AbstractDraggableNode) abstractDraggableNode$processDragCancel$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                abstractDraggableNode.dragInteraction = null;
                function3 = abstractDraggableNode.onDragStopped;
                m5960boximpl = Velocity.m5960boximpl(Velocity.INSTANCE.m5980getZero9UxMQ8M());
                abstractDraggableNode$processDragCancel$1.L$0 = null;
                abstractDraggableNode$processDragCancel$1.L$1 = null;
                abstractDraggableNode$processDragCancel$1.label = 2;
                if (function3.invoke(coroutineScope, m5960boximpl, abstractDraggableNode$processDragCancel$1) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        }
        abstractDraggableNode$processDragCancel$1 = new AbstractDraggableNode$processDragCancel$1(this, continuation);
        Object obj2 = abstractDraggableNode$processDragCancel$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = abstractDraggableNode$processDragCancel$1.label;
        if (i != 0) {
        }
        abstractDraggableNode.dragInteraction = null;
        function3 = abstractDraggableNode.onDragStopped;
        m5960boximpl = Velocity.m5960boximpl(Velocity.INSTANCE.m5980getZero9UxMQ8M());
        abstractDraggableNode$processDragCancel$1.L$0 = null;
        abstractDraggableNode$processDragCancel$1.L$1 = null;
        abstractDraggableNode$processDragCancel$1.label = 2;
        if (function3.invoke(coroutineScope, m5960boximpl, abstractDraggableNode$processDragCancel$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    public final void disposeInteractionSource() {
        DragInteraction.Start start = this.dragInteraction;
        if (start != null) {
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.tryEmit(new DragInteraction.Cancel(start));
            }
            this.dragInteraction = null;
        }
    }
}
