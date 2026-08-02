package app.cash.local.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalSearchViewEvent$SearchInput implements LocalBrandLocationMenuViewEvent, LocalAddBrandsViewEvent {
    public final String text;

    public LocalSearchViewEvent$SearchInput(String str) {
        str.getClass();
        this.text = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalSearchViewEvent$SearchInput) && Intrinsics.areEqual(this.text, ((LocalSearchViewEvent$SearchInput) obj).text);
    }

    public final int hashCode() {
        return this.text.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SearchInput(text=", this.text, ")");
    }
}
