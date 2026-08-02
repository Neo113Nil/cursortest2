package com.squareup.cash.blockers.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class CancelHelpItem extends DisplayHelpItem {
    public final String text;

    public CancelHelpItem(String str) {
        this.text = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CancelHelpItem) && Intrinsics.areEqual(this.text, ((CancelHelpItem) obj).text);
    }

    @Override // com.squareup.cash.blockers.viewmodels.DisplayHelpItem
    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        String str = this.text;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CancelHelpItem(text=", this.text, ")");
    }
}
