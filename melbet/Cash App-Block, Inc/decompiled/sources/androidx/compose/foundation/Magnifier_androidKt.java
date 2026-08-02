package androidx.compose.foundation;

import androidx.compose.foundation.FocusableNode;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class Magnifier_androidKt {
    public static final SemanticsPropertyKey MagnifierPositionInRoot = new SemanticsPropertyKey("MagnifierPositionInRoot");

    /* renamed from: magnifier-jPUL71Q$default, reason: not valid java name */
    public static Modifier m189magnifierjPUL71Q$default(Function1 function1, Function1 function12) {
        return new MagnifierElement(function1, function12, FocusableNode.TraverseKey.INSTANCE);
    }
}
