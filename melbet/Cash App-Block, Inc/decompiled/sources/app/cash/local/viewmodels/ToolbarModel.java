package app.cash.local.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ToolbarModel {
    public final String title;

    public ToolbarModel(String str) {
        str.getClass();
        this.title = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ToolbarModel) && Intrinsics.areEqual(this.title, ((ToolbarModel) obj).title);
    }

    public final int hashCode() {
        return this.title.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ToolbarModel(title=", this.title, ")");
    }
}
