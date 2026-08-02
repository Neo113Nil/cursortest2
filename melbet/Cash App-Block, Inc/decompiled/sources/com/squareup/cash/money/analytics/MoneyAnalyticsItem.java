package com.squareup.cash.money.analytics;

import com.squareup.cash.money.core.ids.ItemId;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneyAnalyticsItem {
    public final ItemId id;
    public final int index;
    public final boolean isPromoted;
    public final int sectionIndex;

    public MoneyAnalyticsItem(ItemId itemId, int i, int i2, boolean z) {
        itemId.getClass();
        this.id = itemId;
        this.index = i;
        this.sectionIndex = i2;
        this.isPromoted = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyAnalyticsItem)) {
            return false;
        }
        MoneyAnalyticsItem moneyAnalyticsItem = (MoneyAnalyticsItem) obj;
        return Intrinsics.areEqual(this.id, moneyAnalyticsItem.id) && this.index == moneyAnalyticsItem.index && this.sectionIndex == moneyAnalyticsItem.sectionIndex && this.isPromoted == moneyAnalyticsItem.isPromoted;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isPromoted) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sectionIndex, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.index, this.id.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "MoneyAnalyticsItem(id=" + this.id + ", index=" + this.index + ", sectionIndex=" + this.sectionIndex + ", isPromoted=" + this.isPromoted + ")";
    }
}
