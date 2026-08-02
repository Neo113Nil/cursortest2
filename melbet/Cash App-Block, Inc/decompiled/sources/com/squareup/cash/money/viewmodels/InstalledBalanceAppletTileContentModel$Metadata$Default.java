package com.squareup.cash.money.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.savings.SavingsElement;

/* loaded from: classes6.dex */
public final class InstalledBalanceAppletTileContentModel$Metadata$Default extends SavingsElement.Element {
    public final String text;

    public InstalledBalanceAppletTileContentModel$Metadata$Default(String str) {
        str.getClass();
        this.text = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstalledBalanceAppletTileContentModel$Metadata$Default) && Intrinsics.areEqual(this.text, ((InstalledBalanceAppletTileContentModel$Metadata$Default) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Default(text=", this.text, ")");
    }
}
