package app.cash.local.presenters.cart;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class OpenTabBannerTitle$OrderedMoreItems {
    public final int itemCount;

    public OpenTabBannerTitle$OrderedMoreItems(int i) {
        this.itemCount = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenTabBannerTitle$OrderedMoreItems) && this.itemCount == ((OpenTabBannerTitle$OrderedMoreItems) obj).itemCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.itemCount);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.itemCount, "OrderedMoreItems(itemCount=", ")");
    }
}
