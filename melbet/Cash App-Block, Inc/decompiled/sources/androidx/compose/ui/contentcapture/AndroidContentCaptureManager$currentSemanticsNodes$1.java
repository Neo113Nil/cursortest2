package androidx.compose.ui.contentcapture;

import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class AndroidContentCaptureManager$currentSemanticsNodes$1 extends Lambda implements Function1 {
    public static final AndroidContentCaptureManager$currentSemanticsNodes$1 INSTANCE = new AndroidContentCaptureManager$currentSemanticsNodes$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(SemanticsOwnerKt.isAccessibilityIgnoredLink((SemanticsNode) obj));
    }
}
