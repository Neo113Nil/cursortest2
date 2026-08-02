package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class ModalBottomSheetKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ModalBottomSheetState f$0;
    public final /* synthetic */ CoroutineScope f$1;

    public /* synthetic */ ModalBottomSheetKt$$ExternalSyntheticLambda2(ModalBottomSheetState modalBottomSheetState, CoroutineScope coroutineScope, int i) {
        this.$r8$classId = i;
        this.f$0 = modalBottomSheetState;
        this.f$1 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        CoroutineScope coroutineScope = this.f$1;
        ModalBottomSheetState modalBottomSheetState = this.f$0;
        switch (i) {
            case 0:
                if (((Boolean) ((Function1) modalBottomSheetState.anchoredDraggableState.confirmValueChange).invoke(ModalBottomSheetValue.Hidden)).booleanValue()) {
                    JobKt.launch$default(coroutineScope, null, null, new ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1(modalBottomSheetState, null, 0), 3);
                }
                break;
            case 1:
                if (((Boolean) ((Function1) modalBottomSheetState.anchoredDraggableState.confirmValueChange).invoke(ModalBottomSheetValue.Hidden)).booleanValue()) {
                    JobKt.launch$default(coroutineScope, null, null, new ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1(modalBottomSheetState, null, 1), 3);
                }
                break;
            case 2:
                if (((Boolean) ((Function1) modalBottomSheetState.anchoredDraggableState.confirmValueChange).invoke(ModalBottomSheetValue.Expanded)).booleanValue()) {
                    JobKt.launch$default(coroutineScope, null, null, new ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1(modalBottomSheetState, null, 2), 3);
                }
                break;
            default:
                if (((Boolean) ((Function1) modalBottomSheetState.anchoredDraggableState.confirmValueChange).invoke(ModalBottomSheetValue.HalfExpanded)).booleanValue()) {
                    JobKt.launch$default(coroutineScope, null, null, new ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1(modalBottomSheetState, null, 3), 3);
                }
                break;
        }
        return Boolean.TRUE;
    }
}
