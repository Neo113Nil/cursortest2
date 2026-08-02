package com.squareup.cash.blockers.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class GenericHelpItem extends DisplayHelpItem {
    public final String text;

    public GenericHelpItem(String str) {
        this.text = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericHelpItem) && Intrinsics.areEqual(this.text, ((GenericHelpItem) obj).text);
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
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GenericHelpItem(text=", this.text, ")");
    }
}
