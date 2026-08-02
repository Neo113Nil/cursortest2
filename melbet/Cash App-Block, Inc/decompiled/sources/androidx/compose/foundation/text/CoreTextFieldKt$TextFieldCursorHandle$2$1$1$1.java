package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.internal.FileSystem$commonDeleteRecursively$sequence$1;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ TextDragObserver $observer;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PointerInputScope $this_pointerInput;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$this_pointerInput = pointerInputScope;
        this.$observer = textDragObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1(this.$this_pointerInput, this.$observer, continuation, 0);
            case 1:
                return new CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1(this.$this_pointerInput, this.$observer, continuation, 1);
            default:
                return new CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1(this.$this_pointerInput, this.$observer, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        PointerInputScope pointerInputScope = this.$this_pointerInput;
        final TextDragObserver textDragObserver = this.$observer;
        final int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (KeyMappingKt.detectDownAndDragGesturesWithObserver(pointerInputScope, textDragObserver, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object awaitEachGesture = Draggable2DKt.awaitEachGesture(pointerInputScope, new FileSystem$commonDeleteRecursively$sequence$1(textDragObserver, null, 4), this);
                    if (awaitEachGesture != obj2) {
                        awaitEachGesture = Unit.INSTANCE;
                    }
                    if (awaitEachGesture == obj2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    final int i6 = 0;
                    Object detectDragGestures = DragGestureDetectorKt.detectDragGestures(this.$this_pointerInput, new LongPressTextDragObserverKt$$ExternalSyntheticLambda0(textDragObserver, 0), new Function0() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i7 = i6;
                            TextDragObserver textDragObserver2 = textDragObserver;
                            switch (i7) {
                                case 0:
                                    textDragObserver2.onStop();
                                    break;
                                default:
                                    textDragObserver2.onCancel();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, new Function0() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i7 = i2;
                            TextDragObserver textDragObserver2 = textDragObserver;
                            switch (i7) {
                                case 0:
                                    textDragObserver2.onStop();
                                    break;
                                default:
                                    textDragObserver2.onCancel();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, new HintHandler$$ExternalSyntheticLambda0(textDragObserver, 5), this);
                    if (detectDragGestures != obj3) {
                        detectDragGestures = Unit.INSTANCE;
                    }
                    if (detectDragGestures == obj3) {
                        break;
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
