package com.squareup.cash.mooncake.compose_ui.components;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SplitButtonEntry {
    public final Function0 onClick;
    public final CharSequence text;

    public SplitButtonEntry(CharSequence charSequence, Function0 function0) {
        charSequence.getClass();
        function0.getClass();
        this.text = charSequence;
        this.onClick = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitButtonEntry)) {
            return false;
        }
        SplitButtonEntry splitButtonEntry = (SplitButtonEntry) obj;
        return Intrinsics.areEqual(this.text, splitButtonEntry.text) && Intrinsics.areEqual(this.onClick, splitButtonEntry.onClick);
    }

    public final int hashCode() {
        return this.onClick.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.text.hashCode() * 31, 923521, true);
    }

    public final String toString() {
        return "SplitButtonEntry(text=" + ((Object) this.text) + ", enabled=true, styleOverride=null, textColorOverride=null, backgroundColorOverride=null, onClick=" + this.onClick + ")";
    }
}
