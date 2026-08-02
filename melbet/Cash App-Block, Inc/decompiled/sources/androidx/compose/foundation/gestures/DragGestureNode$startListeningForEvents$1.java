package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class DragGestureNode$startListeningForEvents$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public /* synthetic */ Object L$0;
    public Ref$ObjectRef L$1;
    public Ref$ObjectRef L$2;
    public int label;
    public final /* synthetic */ DragGestureNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$startListeningForEvents$1(Ref$ObjectRef ref$ObjectRef, DragGestureNode dragGestureNode, Continuation continuation) {
        super(2, continuation);
        this.L$2 = ref$ObjectRef;
        this.this$0 = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        DragGestureNode dragGestureNode = this.this$0;
        switch (i) {
            case 0:
                DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1 = new DragGestureNode$startListeningForEvents$1(dragGestureNode, continuation);
                dragGestureNode$startListeningForEvents$1.L$0 = obj;
                return dragGestureNode$startListeningForEvents$1;
            default:
                DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$12 = new DragGestureNode$startListeningForEvents$1(this.L$2, dragGestureNode, continuation);
                dragGestureNode$startListeningForEvents$12.L$0 = obj;
                return dragGestureNode$startListeningForEvents$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((DragGestureNode$startListeningForEvents$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((DragGestureNode$startListeningForEvents$1) create((Function1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0101, code lost:
    
        if (r1.drag(r8, r7) != r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012b, code lost:
    
        if (androidx.compose.foundation.gestures.DragGestureNode.access$processDragCancel(r1, r7) == r0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0139, code lost:
    
        if (androidx.compose.foundation.gestures.DragGestureNode.access$processDragCancel(r1, r7) != r0) goto L39;
     */
    /* JADX WARN: Path cross not found for [B:61:0x011c, B:58:0x010a], limit reached: 88 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0054 -> B:7:0x0055). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0058 -> B:8:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00db -> B:37:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0117 -> B:37:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x011e -> B:37:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x012b -> B:37:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0139 -> B:36:0x0081). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        CoroutineScope coroutineScope2;
        CoroutineScope coroutineScope3;
        DragEvent dragEvent;
        Object obj2;
        Function1 function1;
        Object obj3;
        int i = this.$r8$classId;
        DragGestureNode dragGestureNode = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (this.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        coroutineScope = (CoroutineScope) this.L$0;
                        if (JobKt.isActive(coroutineScope)) {
                            ref$ObjectRef = new Ref$ObjectRef();
                            BufferedChannel bufferedChannel = dragGestureNode.channel;
                            if (bufferedChannel != null) {
                                this.L$0 = coroutineScope;
                                this.L$1 = ref$ObjectRef;
                                this.L$2 = ref$ObjectRef;
                                this.label = 1;
                                obj = BufferedChannel.receive$suspendImpl(bufferedChannel, this);
                                if (obj != coroutineSingletons) {
                                    ref$ObjectRef2 = ref$ObjectRef;
                                    dragEvent = (DragEvent) obj;
                                    ref$ObjectRef.element = dragEvent;
                                    obj2 = ref$ObjectRef2.element;
                                    if (obj2 instanceof DragEvent.DragStarted) {
                                        this.L$0 = coroutineScope;
                                        this.L$1 = ref$ObjectRef2;
                                        this.L$2 = null;
                                        this.label = 2;
                                        if (DragGestureNode.access$processDragStart(dragGestureNode, (DragEvent.DragStarted) obj2, this) != coroutineSingletons) {
                                            ref$ObjectRef3 = ref$ObjectRef2;
                                            coroutineScope2 = coroutineScope;
                                            DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1 = new DragGestureNode$startListeningForEvents$1(ref$ObjectRef3, dragGestureNode, null);
                                            this.L$0 = coroutineScope2;
                                            this.L$1 = ref$ObjectRef3;
                                            this.label = 3;
                                            break;
                                        }
                                    }
                                    if (JobKt.isActive(coroutineScope)) {
                                        break;
                                    }
                                }
                                break;
                            } else {
                                ref$ObjectRef2 = ref$ObjectRef;
                                dragEvent = null;
                                ref$ObjectRef.element = dragEvent;
                                obj2 = ref$ObjectRef2.element;
                                if (obj2 instanceof DragEvent.DragStarted) {
                                }
                                if (JobKt.isActive(coroutineScope)) {
                                }
                            }
                        }
                    case 1:
                        ref$ObjectRef = this.L$2;
                        ref$ObjectRef2 = this.L$1;
                        coroutineScope = (CoroutineScope) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        dragEvent = (DragEvent) obj;
                        ref$ObjectRef.element = dragEvent;
                        obj2 = ref$ObjectRef2.element;
                        if (obj2 instanceof DragEvent.DragStarted) {
                        }
                        if (JobKt.isActive(coroutineScope)) {
                        }
                        break;
                    case 2:
                        ref$ObjectRef3 = this.L$1;
                        coroutineScope2 = (CoroutineScope) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$12 = new DragGestureNode$startListeningForEvents$1(ref$ObjectRef3, dragGestureNode, null);
                        this.L$0 = coroutineScope2;
                        this.L$1 = ref$ObjectRef3;
                        this.label = 3;
                        break;
                    case 3:
                        ref$ObjectRef3 = this.L$1;
                        coroutineScope2 = (CoroutineScope) this.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                        } catch (CancellationException unused) {
                            coroutineScope3 = coroutineScope2;
                            this.L$0 = coroutineScope3;
                            this.L$1 = null;
                            this.label = 6;
                            break;
                        }
                        coroutineScope = coroutineScope2;
                        try {
                        } catch (CancellationException unused2) {
                            coroutineScope3 = coroutineScope;
                            this.L$0 = coroutineScope3;
                            this.L$1 = null;
                            this.label = 6;
                        }
                        Object obj4 = ref$ObjectRef3.element;
                        if (obj4 instanceof DragEvent.DragStopped) {
                            this.L$0 = coroutineScope;
                            this.L$1 = null;
                            this.label = 4;
                            if (DragGestureNode.access$processDragStop(dragGestureNode, (DragEvent.DragStopped) obj4, this) == coroutineSingletons) {
                                break;
                            }
                            if (JobKt.isActive(coroutineScope)) {
                            }
                        } else {
                            if (obj4 instanceof DragEvent.DragCancelled) {
                                this.L$0 = coroutineScope;
                                this.L$1 = null;
                                this.label = 5;
                                break;
                            }
                            if (JobKt.isActive(coroutineScope)) {
                            }
                        }
                        break;
                    case 4:
                        coroutineScope3 = (CoroutineScope) this.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                        } catch (CancellationException unused3) {
                            this.L$0 = coroutineScope3;
                            this.L$1 = null;
                            this.label = 6;
                            break;
                        }
                        coroutineScope = coroutineScope3;
                        if (JobKt.isActive(coroutineScope)) {
                        }
                        break;
                    case 5:
                        coroutineScope3 = (CoroutineScope) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        coroutineScope = coroutineScope3;
                        if (JobKt.isActive(coroutineScope)) {
                        }
                        break;
                    case 6:
                        coroutineScope3 = (CoroutineScope) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        coroutineScope = coroutineScope3;
                        if (JobKt.isActive(coroutineScope)) {
                        }
                        break;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
            default:
                Ref$ObjectRef ref$ObjectRef4 = this.L$2;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    function1 = (Function1) this.L$0;
                    obj3 = ref$ObjectRef4.element;
                    if (obj3 instanceof DragEvent.DragStopped) {
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    Ref$ObjectRef ref$ObjectRef5 = this.L$1;
                    function1 = (Function1) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    DragEvent dragEvent2 = (DragEvent) obj;
                    ref$ObjectRef5.element = dragEvent2;
                    obj3 = ref$ObjectRef4.element;
                    if (!(obj3 instanceof DragEvent.DragStopped) || (obj3 instanceof DragEvent.DragCancelled)) {
                        break;
                    } else {
                        DragEvent.DragDelta dragDelta = obj3 instanceof DragEvent.DragDelta ? (DragEvent.DragDelta) obj3 : null;
                        if (dragDelta != null) {
                            function1.invoke(dragDelta);
                        }
                        BufferedChannel bufferedChannel2 = dragGestureNode.channel;
                        if (bufferedChannel2 != null) {
                            this.L$0 = function1;
                            this.L$1 = ref$ObjectRef4;
                            this.label = 1;
                            obj = BufferedChannel.receive$suspendImpl(bufferedChannel2, this);
                            if (obj == coroutineSingletons2) {
                                break;
                            } else {
                                ref$ObjectRef5 = ref$ObjectRef4;
                                DragEvent dragEvent22 = (DragEvent) obj;
                                ref$ObjectRef5.element = dragEvent22;
                                obj3 = ref$ObjectRef4.element;
                                if (obj3 instanceof DragEvent.DragStopped) {
                                }
                            }
                        } else {
                            ref$ObjectRef5 = ref$ObjectRef4;
                            dragEvent22 = null;
                            ref$ObjectRef5.element = dragEvent22;
                            obj3 = ref$ObjectRef4.element;
                            if (obj3 instanceof DragEvent.DragStopped) {
                            }
                        }
                    }
                }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$startListeningForEvents$1(DragGestureNode dragGestureNode, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dragGestureNode;
    }
}
