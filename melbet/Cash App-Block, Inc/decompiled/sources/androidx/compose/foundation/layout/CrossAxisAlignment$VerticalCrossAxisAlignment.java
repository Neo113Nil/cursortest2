package androidx.compose.foundation.layout;

import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CrossAxisAlignment$VerticalCrossAxisAlignment extends SpacerKt {
    public final BiasAlignment.Vertical vertical;

    public CrossAxisAlignment$VerticalCrossAxisAlignment(BiasAlignment.Vertical vertical) {
        this.vertical = vertical;
    }

    @Override // androidx.compose.foundation.layout.SpacerKt
    public final int align$foundation_layout(int i, int i2, LayoutDirection layoutDirection, Placeable placeable, int i3) {
        return this.vertical.align(i2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CrossAxisAlignment$VerticalCrossAxisAlignment) && Intrinsics.areEqual(this.vertical, ((CrossAxisAlignment$VerticalCrossAxisAlignment) obj).vertical);
    }

    public final int hashCode() {
        return Float.hashCode(this.vertical.bias);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.vertical + ')';
    }
}
