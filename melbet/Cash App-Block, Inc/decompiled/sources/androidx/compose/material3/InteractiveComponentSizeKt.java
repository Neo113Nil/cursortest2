package androidx.compose.material3;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.VerticalAlignmentLine;

/* loaded from: classes3.dex */
public abstract class InteractiveComponentSizeKt {
    public static final StaticProvidableCompositionLocal LocalMinimumInteractiveComponentSize;
    public static final HorizontalAlignmentLine MinimumInteractiveTopAlignmentLine = new HorizontalAlignmentLine(InteractiveComponentSizeKt$MinimumInteractiveTopAlignmentLine$1.INSTANCE);
    public static final VerticalAlignmentLine MinimumInteractiveLeftAlignmentLine = new VerticalAlignmentLine(InteractiveComponentSizeKt$MinimumInteractiveLeftAlignmentLine$1.INSTANCE);

    static {
        Updater.staticCompositionLocalOf(new androidx.compose.material.TextKt$$ExternalSyntheticLambda0(14));
        LocalMinimumInteractiveComponentSize = new StaticProvidableCompositionLocal(new androidx.compose.material.TextKt$$ExternalSyntheticLambda0(15));
    }
}
