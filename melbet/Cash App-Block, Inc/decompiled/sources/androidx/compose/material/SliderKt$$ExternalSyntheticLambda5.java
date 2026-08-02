package androidx.compose.material;

import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.SheetPosition;
import com.squareup.cash.sheet.UserDismissMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.ClosedFloatingPointRange;

/* loaded from: classes3.dex */
public final /* synthetic */ class SliderKt$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ float f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda5(boolean z, Object obj, float f, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$1 = obj;
        this.f$3 = f;
        this.f$4 = obj2;
        this.f$5 = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$5;
        Object obj3 = this.f$4;
        float f = this.f$3;
        Object obj4 = this.f$1;
        boolean z = this.f$0;
        switch (i) {
            case 0:
                ClosedFloatingPointRange closedFloatingPointRange = (ClosedFloatingPointRange) obj4;
                Function1 function1 = (Function1) obj3;
                Function0 function0 = (Function0) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                if (!z) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                semanticsPropertyReceiver.set(SemanticsActions.SetProgress, new AccessibilityAction(null, new SliderKt$$ExternalSyntheticLambda8(closedFloatingPointRange, f, function1, function0)));
                break;
            default:
                Float f2 = (Float) obj4;
                Float f3 = (Float) obj3;
                RealSheetState realSheetState = (RealSheetState) obj2;
                androidx.compose.foundation.gestures.DraggableAnchorsConfig draggableAnchorsConfig = (androidx.compose.foundation.gestures.DraggableAnchorsConfig) obj;
                draggableAnchorsConfig.getClass();
                draggableAnchorsConfig.at(SheetPosition.Expanded, RecyclerView.DECELERATION_RATE);
                if (!z && f2 != null && f2.floatValue() > RecyclerView.DECELERATION_RATE && f2.floatValue() < f) {
                    draggableAnchorsConfig.at(SheetPosition.Peeking, f2.floatValue());
                }
                if (f3 != null && f3.floatValue() > RecyclerView.DECELERATION_RATE && f3.floatValue() < f && (f2 == null || f3.floatValue() > f2.floatValue())) {
                    draggableAnchorsConfig.at(SheetPosition.Collapsed, f3.floatValue());
                }
                if (((UserDismissMode) realSheetState.userDismissMode$delegate.getValue()).dragDismiss) {
                    draggableAnchorsConfig.at(SheetPosition.Hidden, f);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
