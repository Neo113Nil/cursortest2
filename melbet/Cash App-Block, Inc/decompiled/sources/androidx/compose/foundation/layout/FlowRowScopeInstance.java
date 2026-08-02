package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes3.dex */
public final class FlowRowScopeInstance implements RowScope, FlowRowScope {
    public static final FlowRowScopeInstance INSTANCE = new FlowRowScopeInstance();

    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier align(Modifier modifier, BiasAlignment.Vertical vertical) {
        return modifier.then(new VerticalAlignElement(vertical));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier weight(float f, Modifier modifier, boolean z) {
        if (f <= 0.0d) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return modifier.then(new LayoutWeightElement(f, z));
    }
}
