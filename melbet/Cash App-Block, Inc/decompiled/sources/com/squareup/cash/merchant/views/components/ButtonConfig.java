package com.squareup.cash.merchant.views.components;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ButtonConfig {
    public final Function0 onClick;
    public final String text;

    public ButtonConfig(String str, Function0 function0) {
        str.getClass();
        function0.getClass();
        this.text = str;
        this.onClick = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonConfig)) {
            return false;
        }
        ButtonConfig buttonConfig = (ButtonConfig) obj;
        return Intrinsics.areEqual(this.text, buttonConfig.text) && Intrinsics.areEqual(this.onClick, buttonConfig.onClick);
    }

    public final int hashCode() {
        return this.onClick.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return "ButtonConfig(text=" + this.text + ", onClick=" + this.onClick + ")";
    }
}
