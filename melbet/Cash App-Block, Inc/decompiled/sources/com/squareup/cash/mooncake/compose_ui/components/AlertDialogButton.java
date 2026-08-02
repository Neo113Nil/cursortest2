package com.squareup.cash.mooncake.compose_ui.components;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AlertDialogButton {
    public final Function0 onClick;
    public final String text;

    public AlertDialogButton(String str, Function0 function0) {
        str.getClass();
        function0.getClass();
        this.text = str;
        this.onClick = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertDialogButton)) {
            return false;
        }
        AlertDialogButton alertDialogButton = (AlertDialogButton) obj;
        return Intrinsics.areEqual(this.text, alertDialogButton.text) && Intrinsics.areEqual(this.onClick, alertDialogButton.onClick);
    }

    public final int hashCode() {
        return this.onClick.hashCode() + (this.text.hashCode() * 961);
    }

    public final String toString() {
        return "AlertDialogButton(text=" + this.text + ", colors=null, onClick=" + this.onClick + ")";
    }
}
