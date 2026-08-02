package com.squareup.cash.favorites.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ToolbarViewModel {
    public final String title;

    public ToolbarViewModel(String str) {
        str.getClass();
        this.title = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ToolbarViewModel) && Intrinsics.areEqual(this.title, ((ToolbarViewModel) obj).title);
    }

    public final int hashCode() {
        return this.title.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ToolbarViewModel(title=", this.title, ")");
    }
}
