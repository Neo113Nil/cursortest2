package com.squareup.cash.money.analytics;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.core.ids.SectionId;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneyAnalyticsContext$Item {
    public final int absoluteItemIndex;
    public final ItemId id;
    public final boolean isPromoted;
    public final int itemIndex;
    public final SectionId sectionId;
    public final int sectionIndex;
    public final int sectionTotal;

    public MoneyAnalyticsContext$Item(ItemId itemId, int i, int i2, SectionId sectionId, int i3, int i4, boolean z) {
        itemId.getClass();
        sectionId.getClass();
        this.id = itemId;
        this.absoluteItemIndex = i;
        this.itemIndex = i2;
        this.sectionId = sectionId;
        this.sectionIndex = i3;
        this.sectionTotal = i4;
        this.isPromoted = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyAnalyticsContext$Item)) {
            return false;
        }
        MoneyAnalyticsContext$Item moneyAnalyticsContext$Item = (MoneyAnalyticsContext$Item) obj;
        return Intrinsics.areEqual(this.id, moneyAnalyticsContext$Item.id) && this.absoluteItemIndex == moneyAnalyticsContext$Item.absoluteItemIndex && this.itemIndex == moneyAnalyticsContext$Item.itemIndex && this.sectionId == moneyAnalyticsContext$Item.sectionId && this.sectionIndex == moneyAnalyticsContext$Item.sectionIndex && this.sectionTotal == moneyAnalyticsContext$Item.sectionTotal && this.isPromoted == moneyAnalyticsContext$Item.isPromoted;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isPromoted) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sectionTotal, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sectionIndex, (this.sectionId.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.itemIndex, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.absoluteItemIndex, this.id.hashCode() * 31, 31), 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Item(id=");
        sb.append(this.id);
        sb.append(", absoluteItemIndex=");
        sb.append(this.absoluteItemIndex);
        sb.append(", itemIndex=");
        sb.append(this.itemIndex);
        sb.append(", sectionId=");
        sb.append(this.sectionId);
        sb.append(", sectionIndex=");
        Recorder$$ExternalSyntheticOutline1.m105m(this.sectionIndex, this.sectionTotal, ", sectionTotal=", ", isPromoted=", sb);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isPromoted, ")");
    }
}
