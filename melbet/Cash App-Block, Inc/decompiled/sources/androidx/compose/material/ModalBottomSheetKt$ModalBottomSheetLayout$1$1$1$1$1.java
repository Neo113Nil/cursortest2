package androidx.compose.material;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ModalBottomSheetState $sheetState;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1(ModalBottomSheetState modalBottomSheetState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$sheetState = modalBottomSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
        switch (i) {
            case 0:
                return new ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1(modalBottomSheetState, continuation, 0);
            case 1:
                return new ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1(modalBottomSheetState, continuation, 1);
            case 2:
                return new ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1(modalBottomSheetState, continuation, 2);
            default:
                return new ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1(modalBottomSheetState, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object animateTo$material$default;
        Object animateTo$material$default2;
        int i = this.$r8$classId;
        ModalBottomSheetState modalBottomSheetState = this.$sheetState;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (modalBottomSheetState.hide(this) == coroutineSingletons) {
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
                    this.label = 1;
                    if (modalBottomSheetState.hide(this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    MapDraggableAnchors anchors = modalBottomSheetState.anchoredDraggableState.getAnchors();
                    ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Expanded;
                    if (anchors.anchors.containsKey(modalBottomSheetValue)) {
                        animateTo$material$default = ModalBottomSheetState.animateTo$material$default(modalBottomSheetState, modalBottomSheetValue, this);
                        if (animateTo$material$default != obj2) {
                            animateTo$material$default = Unit.INSTANCE;
                        }
                    } else {
                        animateTo$material$default = Unit.INSTANCE;
                    }
                    if (animateTo$material$default == obj2) {
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
                    MapDraggableAnchors anchors2 = modalBottomSheetState.anchoredDraggableState.getAnchors();
                    ModalBottomSheetValue modalBottomSheetValue2 = ModalBottomSheetValue.HalfExpanded;
                    if (anchors2.anchors.containsKey(modalBottomSheetValue2)) {
                        animateTo$material$default2 = ModalBottomSheetState.animateTo$material$default(modalBottomSheetState, modalBottomSheetValue2, this);
                        if (animateTo$material$default2 != obj3) {
                            animateTo$material$default2 = Unit.INSTANCE;
                        }
                    } else {
                        animateTo$material$default2 = Unit.INSTANCE;
                    }
                    if (animateTo$material$default2 == obj3) {
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
