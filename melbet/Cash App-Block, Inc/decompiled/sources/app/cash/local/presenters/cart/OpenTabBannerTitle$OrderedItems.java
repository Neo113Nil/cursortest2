package app.cash.local.presenters.cart;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class OpenTabBannerTitle$OrderedItems {
    public final int itemCount;

    public OpenTabBannerTitle$OrderedItems(int i) {
        this.itemCount = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenTabBannerTitle$OrderedItems) && this.itemCount == ((OpenTabBannerTitle$OrderedItems) obj).itemCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.itemCount);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.itemCount, "OrderedItems(itemCount=", ")");
    }
}
