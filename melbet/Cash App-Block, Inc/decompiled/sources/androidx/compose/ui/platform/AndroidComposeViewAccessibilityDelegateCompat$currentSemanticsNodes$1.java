package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1 extends Lambda implements Function1 {
    public static final AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1 INSTANCE;
    public static final AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1 INSTANCE$1;
    public static final AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1 INSTANCE$2;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 1;
        INSTANCE = new AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1(i, 0);
        INSTANCE$1 = new AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1(i, 1);
        INSTANCE$2 = new AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return Boolean.valueOf(SemanticsOwnerKt.isAccessibilityIgnoredLink((SemanticsNode) obj));
            case 1:
                SemanticsConfiguration semanticsConfiguration = ((LayoutNode) obj).getSemanticsConfiguration();
                boolean z = false;
                if (semanticsConfiguration != null && semanticsConfiguration.isMergingSemanticsOfDescendants) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(((LayoutNode) obj).nodes.m889hasH91voCI$ui(8));
        }
    }
}
