package com.squareup.cash.arcade.components;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class ScrollingScaffoldContentScope implements ColumnScope, ScreenScaffoldContentScope {
    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier align(Modifier modifier, Alignment.Horizontal horizontal) {
        modifier.getClass();
        horizontal.getClass();
        return modifier.then(new HorizontalAlignElement(horizontal));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier weight(float f, Modifier modifier, boolean z) {
        modifier.getClass();
        if (f <= 0.0d) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return modifier.then(new LayoutWeightElement(f, true));
    }
}
