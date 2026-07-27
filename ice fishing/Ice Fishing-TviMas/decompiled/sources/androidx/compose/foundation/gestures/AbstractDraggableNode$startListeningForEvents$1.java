package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;

/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {431, 433, 435, 442, 444, 447}, m = "invokeSuspend", n = {"$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
final class AbstractDraggableNode$startListeningForEvents$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AbstractDraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractDraggableNode$startListeningForEvents$1(AbstractDraggableNode abstractDraggableNode, Continuation<? super AbstractDraggableNode$startListeningForEvents$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractDraggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AbstractDraggableNode$startListeningForEvents$1 abstractDraggableNode$startListeningForEvents$1 = new AbstractDraggableNode$startListeningForEvents$1(this.this$0, continuation);
        abstractDraggableNode$startListeningForEvents$1.L$0 = obj;
        return abstractDraggableNode$startListeningForEvents$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AbstractDraggableNode$startListeningForEvents$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:19|20|(1:39)|22|23|24|(2:29|(2:31|(1:33)))(2:26|(1:28))|8|(2:43|44)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0100, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0113, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca A[Catch: CancellationException -> 0x0100, TryCatch #0 {CancellationException -> 0x0100, blocks: (B:24:0x00c4, B:26:0x00ca, B:29:0x00e7, B:31:0x00ed), top: B:23:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7 A[Catch: CancellationException -> 0x0100, TryCatch #0 {CancellationException -> 0x0100, blocks: (B:24:0x00c4, B:26:0x00ca, B:29:0x00e7, B:31:0x00ed), top: B:23:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0117  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00e4 -> B:8:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00eb -> B:8:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00fd -> B:8:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0111 -> B:7:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0114 -> B:8:0x005e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        CoroutineScope coroutineScope2;
        Ref.ObjectRef objectRef3;
        CoroutineScope coroutineScope3;
        CoroutineScope coroutineScope4;
        Object processDragCancel;
        Object processDragCancel2;
        Object processDragStop;
        T t;
        Object processDragStart;
        Channel channel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                    objectRef = new Ref.ObjectRef();
                    channel = this.this$0.channel;
                    this.L$0 = coroutineScope;
                    this.L$1 = objectRef;
                    this.L$2 = objectRef;
                    this.label = 1;
                    Object receive = channel.receive(this);
                    if (receive == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope2 = coroutineScope;
                    t = receive;
                    objectRef2 = objectRef;
                    objectRef.element = t;
                    if (!(objectRef2.element instanceof DragEvent.DragStarted)) {
                        this.L$0 = coroutineScope2;
                        this.L$1 = objectRef2;
                        this.L$2 = null;
                        this.label = 2;
                        processDragStart = this.this$0.processDragStart(coroutineScope2, (DragEvent.DragStarted) objectRef2.element, this);
                        if (processDragStart == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef3 = objectRef2;
                        coroutineScope3 = coroutineScope2;
                        this.L$0 = coroutineScope3;
                        this.L$1 = objectRef3;
                        this.label = 3;
                        if (this.this$0.drag(new AnonymousClass1(objectRef3, this.this$0, null), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineScope = coroutineScope3;
                        if (objectRef3.element instanceof DragEvent.DragStopped) {
                            AbstractDraggableNode abstractDraggableNode = this.this$0;
                            T t2 = objectRef3.element;
                            Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped");
                            this.L$0 = coroutineScope;
                            this.L$1 = null;
                            this.label = 4;
                            processDragStop = abstractDraggableNode.processDragStop(coroutineScope, (DragEvent.DragStopped) t2, this);
                            if (processDragStop == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (objectRef3.element instanceof DragEvent.DragCancelled) {
                            this.L$0 = coroutineScope;
                            this.L$1 = null;
                            this.label = 5;
                            processDragCancel2 = this.this$0.processDragCancel(coroutineScope, this);
                            if (processDragCancel2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        if (CoroutineScopeKt.isActive(coroutineScope)) {
                            return Unit.INSTANCE;
                        }
                    } else {
                        coroutineScope = coroutineScope2;
                        if (CoroutineScopeKt.isActive(coroutineScope)) {
                        }
                    }
                }
            case 1:
                objectRef = (Ref.ObjectRef) this.L$2;
                objectRef2 = (Ref.ObjectRef) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                t = obj;
                objectRef.element = t;
                if (!(objectRef2.element instanceof DragEvent.DragStarted)) {
                }
                break;
            case 2:
                objectRef3 = (Ref.ObjectRef) this.L$1;
                coroutineScope3 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = coroutineScope3;
                this.L$1 = objectRef3;
                this.label = 3;
                if (this.this$0.drag(new AnonymousClass1(objectRef3, this.this$0, null), this) == coroutine_suspended) {
                }
                coroutineScope = coroutineScope3;
                if (objectRef3.element instanceof DragEvent.DragStopped) {
                }
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                }
                break;
            case 3:
                objectRef3 = (Ref.ObjectRef) this.L$1;
                coroutineScope3 = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (CancellationException unused) {
                    coroutineScope4 = coroutineScope3;
                    this.L$0 = coroutineScope4;
                    this.L$1 = null;
                    this.label = 6;
                    processDragCancel = this.this$0.processDragCancel(coroutineScope4, this);
                    if (processDragCancel == coroutine_suspended) {
                    }
                    coroutineScope = coroutineScope4;
                    if (CoroutineScopeKt.isActive(coroutineScope)) {
                    }
                }
                coroutineScope = coroutineScope3;
                if (objectRef3.element instanceof DragEvent.DragStopped) {
                }
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                }
                break;
            case 4:
                coroutineScope4 = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (CancellationException unused2) {
                    this.L$0 = coroutineScope4;
                    this.L$1 = null;
                    this.label = 6;
                    processDragCancel = this.this$0.processDragCancel(coroutineScope4, this);
                    if (processDragCancel == coroutine_suspended) {
                    }
                    coroutineScope = coroutineScope4;
                    if (CoroutineScopeKt.isActive(coroutineScope)) {
                    }
                }
                coroutineScope = coroutineScope4;
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                }
                break;
            case 5:
                coroutineScope4 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope4;
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                }
                break;
            case 6:
                coroutineScope4 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope4;
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/AbstractDragScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1$1", f = "Draggable.kt", i = {0, 1}, l = {437, 438}, m = "invokeSuspend", n = {"$this$drag", "$this$drag"}, s = {"L$0", "L$0"})
    /* renamed from: androidx.compose.foundation.gestures.AbstractDraggableNode$startListeningForEvents$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractDragScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<DragEvent> $event;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AbstractDraggableNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.ObjectRef<DragEvent> objectRef, AbstractDraggableNode abstractDraggableNode, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$event = objectRef;
            this.this$0 = abstractDraggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$event, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AbstractDragScope abstractDragScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(abstractDragScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0083 -> B:6:0x0086). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AbstractDragScope abstractDragScope;
            AbstractDragScope abstractDragScope2;
            Ref.ObjectRef<DragEvent> objectRef;
            Channel channel;
            Object receive;
            T t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                abstractDragScope = (AbstractDragScope) this.L$0;
                if (this.$event.element instanceof DragEvent.DragStopped) {
                }
                return Unit.INSTANCE;
            }
            if (i == 1) {
                abstractDragScope = (AbstractDragScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                abstractDragScope2 = abstractDragScope;
                objectRef = this.$event;
                channel = this.this$0.channel;
                this.L$0 = abstractDragScope2;
                this.L$1 = objectRef;
                this.label = 2;
                receive = channel.receive(this);
                t = receive;
                if (receive == coroutine_suspended) {
                }
                objectRef.element = t;
                abstractDragScope = abstractDragScope2;
                if (this.$event.element instanceof DragEvent.DragStopped) {
                }
                return Unit.INSTANCE;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$1;
            abstractDragScope2 = (AbstractDragScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            t = obj;
            objectRef.element = t;
            abstractDragScope = abstractDragScope2;
            if ((this.$event.element instanceof DragEvent.DragStopped) && !(this.$event.element instanceof DragEvent.DragCancelled)) {
                DragEvent dragEvent = this.$event.element;
                if ((dragEvent instanceof DragEvent.DragDelta ? (DragEvent.DragDelta) dragEvent : null) != null) {
                    AbstractDraggableNode abstractDraggableNode = this.this$0;
                    DragEvent dragEvent2 = this.$event.element;
                    Intrinsics.checkNotNull(dragEvent2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragDelta");
                    this.L$0 = abstractDragScope;
                    this.L$1 = null;
                    this.label = 1;
                    if (abstractDraggableNode.draggingBy(abstractDragScope, (DragEvent.DragDelta) dragEvent2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                abstractDragScope2 = abstractDragScope;
                objectRef = this.$event;
                channel = this.this$0.channel;
                this.L$0 = abstractDragScope2;
                this.L$1 = objectRef;
                this.label = 2;
                receive = channel.receive(this);
                t = receive;
                if (receive == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef.element = t;
                abstractDragScope = abstractDragScope2;
                if (this.$event.element instanceof DragEvent.DragStopped) {
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }
}
