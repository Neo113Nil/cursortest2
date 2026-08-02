package app.cash.local.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalBrandDescriptionViewModel implements LocalBrandProfileSectionContent {
    public final String description;

    public LocalBrandDescriptionViewModel(String str) {
        str.getClass();
        this.description = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalBrandDescriptionViewModel) && Intrinsics.areEqual(this.description, ((LocalBrandDescriptionViewModel) obj).description);
    }

    public final int hashCode() {
        return this.description.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalBrandDescriptionViewModel(description=", this.description, ")");
    }
}
