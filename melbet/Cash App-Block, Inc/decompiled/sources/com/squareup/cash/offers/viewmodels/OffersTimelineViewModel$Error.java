package com.squareup.cash.offers.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersTimelineViewModel$Error implements ArcadeOffersTimelineViewModels {
    public final String title;

    public OffersTimelineViewModel$Error(String str) {
        str.getClass();
        this.title = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OffersTimelineViewModel$Error) && Intrinsics.areEqual(this.title, ((OffersTimelineViewModel$Error) obj).title);
    }

    public final int hashCode() {
        return this.title.hashCode() * 31;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(title=", this.title, ", message=null)");
    }
}
