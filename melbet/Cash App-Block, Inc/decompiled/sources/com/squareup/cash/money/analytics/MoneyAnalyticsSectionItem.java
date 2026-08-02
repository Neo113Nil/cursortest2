package com.squareup.cash.money.analytics;

import com.squareup.cash.money.core.ids.ItemId;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneyAnalyticsSectionItem {
    public final ItemId id;
    public final boolean isPromoted;

    public MoneyAnalyticsSectionItem(ItemId itemId, boolean z) {
        this.id = itemId;
        this.isPromoted = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyAnalyticsSectionItem)) {
            return false;
        }
        MoneyAnalyticsSectionItem moneyAnalyticsSectionItem = (MoneyAnalyticsSectionItem) obj;
        return Intrinsics.areEqual(this.id, moneyAnalyticsSectionItem.id) && this.isPromoted == moneyAnalyticsSectionItem.isPromoted;
    }

    public final int hashCode() {
        ItemId itemId = this.id;
        return Boolean.hashCode(this.isPromoted) + ((itemId == null ? 0 : itemId.hashCode()) * 31);
    }

    public final String toString() {
        return "MoneyAnalyticsSectionItem(id=" + this.id + ", isPromoted=" + this.isPromoted + ")";
    }
}
