package com.squareup.cash.arcade.components.input;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class InputDropdownScope implements ColumnScope {
    public final /* synthetic */ ColumnScope $$delegate_0;
    public final DropdownState state;

    public InputDropdownScope(ColumnScope columnScope, DropdownState dropdownState) {
        columnScope.getClass();
        dropdownState.getClass();
        this.$$delegate_0 = columnScope;
        this.state = dropdownState;
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier align(Modifier modifier, Alignment.Horizontal horizontal) {
        modifier.getClass();
        horizontal.getClass();
        return this.$$delegate_0.align(modifier, horizontal);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier weight(float f, Modifier modifier, boolean z) {
        modifier.getClass();
        return this.$$delegate_0.weight(f, modifier, true);
    }
}
