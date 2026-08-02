package androidx.compose.material;

import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import bo.app.y0$$ExternalSyntheticLambda0;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class ModalBottomSheetKt$$ExternalSyntheticLambda6 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ ModalBottomSheetKt$$ExternalSyntheticLambda6(Function0 function0, String str) {
        this.$r8$classId = 1;
        this.f$1 = function0;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function0 function0 = this.f$1;
        String str = this.f$0;
        switch (i) {
            case 0:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, null, new y0$$ExternalSyntheticLambda0(2, function0));
                break;
            case 1:
                RealCellActivityAccessoryScope realCellActivityAccessoryScope = (RealCellActivityAccessoryScope) obj;
                realCellActivityAccessoryScope.getClass();
                realCellActivityAccessoryScope.button(function0, new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(str, 12));
                break;
            case 2:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, str);
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver2, 0);
                SemanticsPropertiesKt.onClick(semanticsPropertyReceiver2, null, new ComposeDialogKt$$ExternalSyntheticLambda10(11, function0));
                break;
            case 3:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.onClick(semanticsPropertyReceiver3, str, new ToViewKt$$ExternalSyntheticLambda2(12, function0));
                break;
            default:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver4.getClass();
                SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver4, CollectionsKt__CollectionsJVMKt.listOf(new CustomAccessibilityAction(str, new AlertBannerKt$$ExternalSyntheticLambda2(18, function0))));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ModalBottomSheetKt$$ExternalSyntheticLambda6(String str, Function0 function0, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = function0;
    }
}
