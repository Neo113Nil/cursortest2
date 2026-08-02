package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.navigation.Navigation$$ExternalSyntheticLambda1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.compose.FullScreenKt$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public abstract class AccessibilityUtilKt {
    public static final Modifier IncreaseHorizontalSemanticsBounds;
    public static final Modifier IncreaseVerticalSemanticsBounds;

    static {
        FullScreenKt$$ExternalSyntheticLambda0 fullScreenKt$$ExternalSyntheticLambda0 = new FullScreenKt$$ExternalSyntheticLambda0(9);
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        IncreaseHorizontalSemanticsBounds = SpacerKt.m300paddingVpY3zN4$default(SemanticsModifierKt.semantics(ValueInsets.layout(companion, fullScreenKt$$ExternalSyntheticLambda0), true, new Navigation$$ExternalSyntheticLambda1(1)), 10.0f, RecyclerView.DECELERATION_RATE, 2);
        IncreaseVerticalSemanticsBounds = SpacerKt.m300paddingVpY3zN4$default(SemanticsModifierKt.semantics(ValueInsets.layout(companion, new FullScreenKt$$ExternalSyntheticLambda0(10)), true, new Navigation$$ExternalSyntheticLambda1(2)), RecyclerView.DECELERATION_RATE, 10.0f, 1);
    }
}
