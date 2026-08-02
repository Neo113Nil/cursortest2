package com.squareup.cash.shopping.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RestrictedItemWarningSheetViewModel {
    public final String name;

    public RestrictedItemWarningSheetViewModel(String str) {
        str.getClass();
        this.name = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RestrictedItemWarningSheetViewModel) && Intrinsics.areEqual(this.name, ((RestrictedItemWarningSheetViewModel) obj).name);
    }

    public final int hashCode() {
        return this.name.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RestrictedItemWarningSheetViewModel(name=", this.name, ")");
    }
}
