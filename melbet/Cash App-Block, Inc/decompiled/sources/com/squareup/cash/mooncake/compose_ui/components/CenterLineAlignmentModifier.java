package com.squareup.cash.mooncake.compose_ui.components;

import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Density;

/* loaded from: classes6.dex */
public final class CenterLineAlignmentModifier extends TestTagKt implements ParentDataModifier {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CenterLineAlignmentModifier ? (CenterLineAlignmentModifier) obj : null) == null) {
            return false;
        }
        Line$First line$First = Line$First.INSTANCE;
        return line$First.equals(line$First);
    }

    public final int hashCode() {
        return 1143638180;
    }

    @Override // androidx.compose.ui.layout.ParentDataModifier
    public final Object modifyParentData(Density density, Object obj) {
        density.getClass();
        return this;
    }

    public final String toString() {
        return "CenterLineAlignmentModifier(alignmentLine=" + Line$First.INSTANCE + ")";
    }
}
