package com.squareup.cash.money.analytics;

import com.squareup.cash.money.core.ids.SectionId;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class MoneyAnalyticsSection {
    public final SectionId id;
    public final ArrayList items;

    public MoneyAnalyticsSection(SectionId sectionId, ArrayList arrayList) {
        sectionId.getClass();
        this.id = sectionId;
        this.items = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyAnalyticsSection)) {
            return false;
        }
        MoneyAnalyticsSection moneyAnalyticsSection = (MoneyAnalyticsSection) obj;
        return this.id == moneyAnalyticsSection.id && this.items.equals(moneyAnalyticsSection.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (this.id.hashCode() * 31);
    }

    public final String toString() {
        return "MoneyAnalyticsSection(id=" + this.id + ", items=" + this.items + ")";
    }
}
