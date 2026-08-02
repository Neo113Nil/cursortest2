package com.squareup.cash.clipboard;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ClipboardItem {
    public final String text;

    public ClipboardItem(String str) {
        str.getClass();
        this.text = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClipboardItem) && Intrinsics.areEqual(this.text, ((ClipboardItem) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClipboardItem(text=", this.text, ")");
    }
}
