package androidx.compose.material;

import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class SnackbarHostKt$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ SnackbarHostKt$$ExternalSyntheticLambda5(String str, boolean z) {
        this.$r8$classId = 2;
        this.f$1 = str;
        this.f$0 = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        boolean z = this.f$0;
        String str = this.f$1;
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        switch (i) {
            case 0:
                if (z) {
                    SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver, 0);
                }
                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
                semanticsPropertyReceiver.set(SemanticsActions.Dismiss, new AccessibilityAction(null, new TextKt$$ExternalSyntheticLambda0(6)));
                break;
            case 1:
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z);
                if (str != null) {
                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                }
                break;
            default:
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver, 0);
                SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, z);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SnackbarHostKt$$ExternalSyntheticLambda5(String str, int i, boolean z) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$1 = str;
    }
}
