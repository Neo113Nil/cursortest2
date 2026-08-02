package com.squareup.cash.money.booklet;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class ListUnorderedCardSection implements MoneyTabBookletSection {
    public final ArrayList items;
    public final String title;

    public ListUnorderedCardSection(String str, ArrayList arrayList) {
        this.title = str;
        this.items = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListUnorderedCardSection)) {
            return false;
        }
        ListUnorderedCardSection listUnorderedCardSection = (ListUnorderedCardSection) obj;
        return this.title.equals(listUnorderedCardSection.title) && this.items.equals(listUnorderedCardSection.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(this.items, "ListUnorderedCardSection(title=", this.title, ", items=", ")");
    }
}
