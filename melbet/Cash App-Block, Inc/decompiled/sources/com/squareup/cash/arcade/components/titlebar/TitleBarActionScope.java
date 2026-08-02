package com.squareup.cash.arcade.components.titlebar;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class TitleBarActionScope implements RowScope {
    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier align(Modifier modifier, BiasAlignment.Vertical vertical) {
        modifier.getClass();
        return modifier.then(new VerticalAlignElement(vertical));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public final Modifier weight(float f, Modifier modifier, boolean z) {
        modifier.getClass();
        if (!(((double) f) > 0.0d)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return modifier.then(new LayoutWeightElement(f, z));
    }
}
