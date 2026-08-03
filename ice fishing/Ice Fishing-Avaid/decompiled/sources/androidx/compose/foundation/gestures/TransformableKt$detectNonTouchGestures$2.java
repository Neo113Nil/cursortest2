package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;

/* compiled from: Transformable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt$detectNonTouchGestures$2", f = "Transformable.kt", i = {0, 1, 2, 3}, l = {288, 315, 331, 349}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0", "L$0", "L$0"}, v = 1)
/* loaded from: classes.dex */
final class TransformableKt$detectNonTouchGestures$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Channel<TransformEvent> $channel;
    final /* synthetic */ CoroutineContext $currentContext;
    final /* synthetic */ ScrollConfig $scrollConfig;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableKt$detectNonTouchGestures$2(CoroutineContext coroutineContext, ScrollConfig scrollConfig, Channel<TransformEvent> channel, Continuation<? super TransformableKt$detectNonTouchGestures$2> continuation) {
        super(2, continuation);
        this.$currentContext = coroutineContext;
        this.$scrollConfig = scrollConfig;
        this.$channel = channel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(PointerInputChange pointerInputChange) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$1(PointerInputChange pointerInputChange) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$3(PointerInputChange pointerInputChange) {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransformableKt$detectNonTouchGestures$2 transformableKt$detectNonTouchGestures$2 = new TransformableKt$detectNonTouchGestures$2(this.$currentContext, this.$scrollConfig, this.$channel, continuation);
        transformableKt$detectNonTouchGestures$2.L$0 = obj;
        return transformableKt$detectNonTouchGestures$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return ((TransformableKt$detectNonTouchGestures$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0164, code lost:
    
        if (r9 != r0) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[Catch: all -> 0x004b, TryCatch #0 {all -> 0x004b, blocks: (B:9:0x001c, B:11:0x0167, B:13:0x016f, B:14:0x0137, B:21:0x005d, B:24:0x006c, B:29:0x0084, B:30:0x008f, B:33:0x00d3, B:35:0x00dd, B:37:0x00e4, B:38:0x00f0, B:41:0x011a, B:43:0x0122, B:45:0x0129, B:46:0x017d, B:47:0x0188, B:54:0x002f, B:57:0x003a, B:60:0x0045), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd A[Catch: all -> 0x004b, TryCatch #0 {all -> 0x004b, blocks: (B:9:0x001c, B:11:0x0167, B:13:0x016f, B:14:0x0137, B:21:0x005d, B:24:0x006c, B:29:0x0084, B:30:0x008f, B:33:0x00d3, B:35:0x00dd, B:37:0x00e4, B:38:0x00f0, B:41:0x011a, B:43:0x0122, B:45:0x0129, B:46:0x017d, B:47:0x0188, B:54:0x002f, B:57:0x003a, B:60:0x0045), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0122 A[Catch: all -> 0x004b, TryCatch #0 {all -> 0x004b, blocks: (B:9:0x001c, B:11:0x0167, B:13:0x016f, B:14:0x0137, B:21:0x005d, B:24:0x006c, B:29:0x0084, B:30:0x008f, B:33:0x00d3, B:35:0x00dd, B:37:0x00e4, B:38:0x00f0, B:41:0x011a, B:43:0x0122, B:45:0x0129, B:46:0x017d, B:47:0x0188, B:54:0x002f, B:57:0x003a, B:60:0x0045), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0191  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0164 -> B:11:0x0167). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0080 -> B:21:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00db -> B:18:0x0174). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00dd -> B:30:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0120 -> B:18:0x0174). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0122 -> B:38:0x00f0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        Object obj2;
        PointerEvent pointerEvent;
        Offset consumePointerEventAsPanOrNull;
        Object obj3;
        Offset consumePointerEventAsCtrlScrollOrNull;
        Object obj4;
        Offset consumePointerEventAsCtrlScrollOrNull2;
        Offset consumePointerEventAsPanOrNull2;
        Float consumePointerEventAsScaleOrNull;
        float f;
        Float consumePointerEventAsScaleOrNull2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                if (!JobKt.isActive(this.$currentContext)) {
                }
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                obj4 = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, this, 1, null);
                if (obj4 == coroutine_suspended) {
                }
                pointerEvent = (PointerEvent) obj4;
                consumePointerEventAsCtrlScrollOrNull2 = TransformableKt.consumePointerEventAsCtrlScrollOrNull(awaitPointerEventScope, pointerEvent, this.$scrollConfig);
                consumePointerEventAsPanOrNull2 = TransformableKt.consumePointerEventAsPanOrNull(awaitPointerEventScope, pointerEvent);
                consumePointerEventAsScaleOrNull = TransformableKt.consumePointerEventAsScaleOrNull(awaitPointerEventScope, pointerEvent);
                if (consumePointerEventAsCtrlScrollOrNull2 == null) {
                }
                if (consumePointerEventAsCtrlScrollOrNull2 != null) {
                }
            } else if (i == 1) {
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj4 = obj;
                pointerEvent = (PointerEvent) obj4;
                consumePointerEventAsCtrlScrollOrNull2 = TransformableKt.consumePointerEventAsCtrlScrollOrNull(awaitPointerEventScope, pointerEvent, this.$scrollConfig);
                consumePointerEventAsPanOrNull2 = TransformableKt.consumePointerEventAsPanOrNull(awaitPointerEventScope, pointerEvent);
                consumePointerEventAsScaleOrNull = TransformableKt.consumePointerEventAsScaleOrNull(awaitPointerEventScope, pointerEvent);
                if (consumePointerEventAsCtrlScrollOrNull2 == null) {
                }
                if (consumePointerEventAsCtrlScrollOrNull2 != null) {
                }
            } else if (i == 2) {
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj3 = obj;
                pointerEvent = (PointerEvent) obj3;
                consumePointerEventAsCtrlScrollOrNull = TransformableKt.consumePointerEventAsCtrlScrollOrNull(awaitPointerEventScope, pointerEvent, this.$scrollConfig);
                if (consumePointerEventAsCtrlScrollOrNull != null) {
                }
                if (!JobKt.isActive(this.$currentContext)) {
                }
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                obj4 = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, this, 1, null);
                if (obj4 == coroutine_suspended) {
                }
                pointerEvent = (PointerEvent) obj4;
                consumePointerEventAsCtrlScrollOrNull2 = TransformableKt.consumePointerEventAsCtrlScrollOrNull(awaitPointerEventScope, pointerEvent, this.$scrollConfig);
                consumePointerEventAsPanOrNull2 = TransformableKt.consumePointerEventAsPanOrNull(awaitPointerEventScope, pointerEvent);
                consumePointerEventAsScaleOrNull = TransformableKt.consumePointerEventAsScaleOrNull(awaitPointerEventScope, pointerEvent);
                if (consumePointerEventAsCtrlScrollOrNull2 == null) {
                }
                if (consumePointerEventAsCtrlScrollOrNull2 != null) {
                }
            } else if (i == 3) {
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
                pointerEvent = (PointerEvent) obj2;
                consumePointerEventAsPanOrNull = TransformableKt.consumePointerEventAsPanOrNull(awaitPointerEventScope, pointerEvent);
                if (consumePointerEventAsPanOrNull != null) {
                }
                if (!JobKt.isActive(this.$currentContext)) {
                }
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                obj4 = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, this, 1, null);
                if (obj4 == coroutine_suspended) {
                }
                pointerEvent = (PointerEvent) obj4;
                consumePointerEventAsCtrlScrollOrNull2 = TransformableKt.consumePointerEventAsCtrlScrollOrNull(awaitPointerEventScope, pointerEvent, this.$scrollConfig);
                consumePointerEventAsPanOrNull2 = TransformableKt.consumePointerEventAsPanOrNull(awaitPointerEventScope, pointerEvent);
                consumePointerEventAsScaleOrNull = TransformableKt.consumePointerEventAsScaleOrNull(awaitPointerEventScope, pointerEvent);
                if (consumePointerEventAsCtrlScrollOrNull2 == null) {
                }
                if (consumePointerEventAsCtrlScrollOrNull2 != null) {
                }
            } else {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                Object awaitPointerEvent$default = obj;
                pointerEvent = (PointerEvent) awaitPointerEvent$default;
                consumePointerEventAsScaleOrNull2 = TransformableKt.consumePointerEventAsScaleOrNull(awaitPointerEventScope, pointerEvent);
                if (consumePointerEventAsScaleOrNull2 != null) {
                    f = consumePointerEventAsScaleOrNull2.floatValue();
                    this.$channel.mo11990trySendJP2dKIU(new TransformEvent.TransformDelta(TransformGestureDetectorKt.calculateCentroid$default(pointerEvent, false, new Function1() { // from class: androidx.compose.foundation.gestures.TransformableKt$detectNonTouchGestures$2$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            boolean invokeSuspend$lambda$3;
                            invokeSuspend$lambda$3 = TransformableKt$detectNonTouchGestures$2.invokeSuspend$lambda$3((PointerInputChange) obj5);
                            return Boolean.valueOf(invokeSuspend$lambda$3);
                        }
                    }, 1, null), f, Offset.INSTANCE.m6535getZeroF1C5BW0(), 0.0f, null));
                    this.L$0 = awaitPointerEventScope;
                    this.label = 4;
                    awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, this, 1, null);
                }
                if (!JobKt.isActive(this.$currentContext)) {
                    return Unit.INSTANCE;
                }
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                obj4 = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, this, 1, null);
                if (obj4 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pointerEvent = (PointerEvent) obj4;
                consumePointerEventAsCtrlScrollOrNull2 = TransformableKt.consumePointerEventAsCtrlScrollOrNull(awaitPointerEventScope, pointerEvent, this.$scrollConfig);
                consumePointerEventAsPanOrNull2 = TransformableKt.consumePointerEventAsPanOrNull(awaitPointerEventScope, pointerEvent);
                consumePointerEventAsScaleOrNull = TransformableKt.consumePointerEventAsScaleOrNull(awaitPointerEventScope, pointerEvent);
                if (consumePointerEventAsCtrlScrollOrNull2 == null || consumePointerEventAsPanOrNull2 != null || consumePointerEventAsScaleOrNull != null) {
                    if (consumePointerEventAsCtrlScrollOrNull2 != null) {
                        long m6529unboximpl = consumePointerEventAsCtrlScrollOrNull2.m6529unboximpl();
                        this.$channel.mo11990trySendJP2dKIU(TransformEvent.TransformStarted.INSTANCE);
                        this.$channel.mo11990trySendJP2dKIU(new TransformEvent.TransformDelta(TransformGestureDetectorKt.calculateCentroid$default(pointerEvent, false, new Function1() { // from class: androidx.compose.foundation.gestures.TransformableKt$detectNonTouchGestures$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                boolean invokeSuspend$lambda$0;
                                invokeSuspend$lambda$0 = TransformableKt$detectNonTouchGestures$2.invokeSuspend$lambda$0((PointerInputChange) obj5);
                                return Boolean.valueOf(invokeSuspend$lambda$0);
                            }
                        }, 1, null), (float) Math.pow(2.0f, Float.intBitsToFloat((int) (m6529unboximpl & 4294967295L)) / 545.0f), Offset.INSTANCE.m6535getZeroF1C5BW0(), 0.0f, null));
                        this.L$0 = awaitPointerEventScope;
                        this.label = 2;
                        obj3 = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, this, 1, null);
                        if (obj3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pointerEvent = (PointerEvent) obj3;
                        consumePointerEventAsCtrlScrollOrNull = TransformableKt.consumePointerEventAsCtrlScrollOrNull(awaitPointerEventScope, pointerEvent, this.$scrollConfig);
                        if (consumePointerEventAsCtrlScrollOrNull != null) {
                            m6529unboximpl = consumePointerEventAsCtrlScrollOrNull.m6529unboximpl();
                            this.$channel.mo11990trySendJP2dKIU(new TransformEvent.TransformDelta(TransformGestureDetectorKt.calculateCentroid$default(pointerEvent, false, new Function1() { // from class: androidx.compose.foundation.gestures.TransformableKt$detectNonTouchGestures$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    boolean invokeSuspend$lambda$0;
                                    invokeSuspend$lambda$0 = TransformableKt$detectNonTouchGestures$2.invokeSuspend$lambda$0((PointerInputChange) obj5);
                                    return Boolean.valueOf(invokeSuspend$lambda$0);
                                }
                            }, 1, null), (float) Math.pow(2.0f, Float.intBitsToFloat((int) (m6529unboximpl & 4294967295L)) / 545.0f), Offset.INSTANCE.m6535getZeroF1C5BW0(), 0.0f, null));
                            this.L$0 = awaitPointerEventScope;
                            this.label = 2;
                            obj3 = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, this, 1, null);
                            if (obj3 == coroutine_suspended) {
                            }
                            pointerEvent = (PointerEvent) obj3;
                            consumePointerEventAsCtrlScrollOrNull = TransformableKt.consumePointerEventAsCtrlScrollOrNull(awaitPointerEventScope, pointerEvent, this.$scrollConfig);
                            if (consumePointerEventAsCtrlScrollOrNull != null) {
                            }
                        }
                        if (!JobKt.isActive(this.$currentContext)) {
                        }
                    } else if (consumePointerEventAsPanOrNull2 != null) {
                        long m6529unboximpl2 = consumePointerEventAsPanOrNull2.m6529unboximpl();
                        this.$channel.mo11990trySendJP2dKIU(TransformEvent.TransformStarted.INSTANCE);
                        long m6529unboximpl3 = m6529unboximpl2;
                        this.$channel.mo11990trySendJP2dKIU(new TransformEvent.TransformDelta(TransformGestureDetectorKt.calculateCentroid$default(pointerEvent, false, new Function1() { // from class: androidx.compose.foundation.gestures.TransformableKt$detectNonTouchGestures$2$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                boolean invokeSuspend$lambda$1;
                                invokeSuspend$lambda$1 = TransformableKt$detectNonTouchGestures$2.invokeSuspend$lambda$1((PointerInputChange) obj5);
                                return Boolean.valueOf(invokeSuspend$lambda$1);
                            }
                        }, 1, null), 1.0f, m6529unboximpl3, 0.0f, null));
                        this.L$0 = awaitPointerEventScope;
                        this.label = 3;
                        obj2 = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, this, 1, null);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pointerEvent = (PointerEvent) obj2;
                        consumePointerEventAsPanOrNull = TransformableKt.consumePointerEventAsPanOrNull(awaitPointerEventScope, pointerEvent);
                        if (consumePointerEventAsPanOrNull != null) {
                            m6529unboximpl3 = consumePointerEventAsPanOrNull.m6529unboximpl();
                            this.$channel.mo11990trySendJP2dKIU(new TransformEvent.TransformDelta(TransformGestureDetectorKt.calculateCentroid$default(pointerEvent, false, new Function1() { // from class: androidx.compose.foundation.gestures.TransformableKt$detectNonTouchGestures$2$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    boolean invokeSuspend$lambda$1;
                                    invokeSuspend$lambda$1 = TransformableKt$detectNonTouchGestures$2.invokeSuspend$lambda$1((PointerInputChange) obj5);
                                    return Boolean.valueOf(invokeSuspend$lambda$1);
                                }
                            }, 1, null), 1.0f, m6529unboximpl3, 0.0f, null));
                            this.L$0 = awaitPointerEventScope;
                            this.label = 3;
                            obj2 = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, this, 1, null);
                            if (obj2 == coroutine_suspended) {
                            }
                            pointerEvent = (PointerEvent) obj2;
                            consumePointerEventAsPanOrNull = TransformableKt.consumePointerEventAsPanOrNull(awaitPointerEventScope, pointerEvent);
                            if (consumePointerEventAsPanOrNull != null) {
                            }
                        }
                        if (!JobKt.isActive(this.$currentContext)) {
                        }
                    } else {
                        if (consumePointerEventAsScaleOrNull == null) {
                            throw new IllegalStateException("One of zoomOffset, panOffset and scaleDelta must be non-null".toString());
                        }
                        float floatValue = consumePointerEventAsScaleOrNull.floatValue();
                        this.$channel.mo11990trySendJP2dKIU(TransformEvent.TransformStarted.INSTANCE);
                        f = floatValue;
                        this.$channel.mo11990trySendJP2dKIU(new TransformEvent.TransformDelta(TransformGestureDetectorKt.calculateCentroid$default(pointerEvent, false, new Function1() { // from class: androidx.compose.foundation.gestures.TransformableKt$detectNonTouchGestures$2$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                boolean invokeSuspend$lambda$3;
                                invokeSuspend$lambda$3 = TransformableKt$detectNonTouchGestures$2.invokeSuspend$lambda$3((PointerInputChange) obj5);
                                return Boolean.valueOf(invokeSuspend$lambda$3);
                            }
                        }, 1, null), f, Offset.INSTANCE.m6535getZeroF1C5BW0(), 0.0f, null));
                        this.L$0 = awaitPointerEventScope;
                        this.label = 4;
                        awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, this, 1, null);
                    }
                }
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                obj4 = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, this, 1, null);
                if (obj4 == coroutine_suspended) {
                }
                pointerEvent = (PointerEvent) obj4;
                consumePointerEventAsCtrlScrollOrNull2 = TransformableKt.consumePointerEventAsCtrlScrollOrNull(awaitPointerEventScope, pointerEvent, this.$scrollConfig);
                consumePointerEventAsPanOrNull2 = TransformableKt.consumePointerEventAsPanOrNull(awaitPointerEventScope, pointerEvent);
                consumePointerEventAsScaleOrNull = TransformableKt.consumePointerEventAsScaleOrNull(awaitPointerEventScope, pointerEvent);
                if (consumePointerEventAsCtrlScrollOrNull2 == null) {
                }
                if (consumePointerEventAsCtrlScrollOrNull2 != null) {
                }
            }
        } finally {
            this.$channel.mo11990trySendJP2dKIU(TransformEvent.TransformStopped.INSTANCE);
        }
    }
}
