package com.squareup.cash.buynowpaylater.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ActionButton {
    public final String actionUrl;
    public final TextModel text;

    public ActionButton(TextModel textModel, String str) {
        str.getClass();
        this.text = textModel;
        this.actionUrl = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionButton)) {
            return false;
        }
        ActionButton actionButton = (ActionButton) obj;
        return this.text.equals(actionButton.text) && Intrinsics.areEqual(this.actionUrl, actionButton.actionUrl);
    }

    public final int hashCode() {
        return this.actionUrl.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return "ActionButton(text=" + this.text + ", actionUrl=" + this.actionUrl + ")";
    }
}
