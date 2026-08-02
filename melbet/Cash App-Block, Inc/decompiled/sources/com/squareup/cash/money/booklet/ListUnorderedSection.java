package com.squareup.cash.money.booklet;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class ListUnorderedSection implements MoneyTabBookletSection {
    public final ArrayList items;

    public final class ListUnorderedItem {
        public final String iconId;
        public final String label;

        public ListUnorderedItem(String str, String str2) {
            this.iconId = str;
            this.label = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListUnorderedItem)) {
                return false;
            }
            ListUnorderedItem listUnorderedItem = (ListUnorderedItem) obj;
            return this.iconId.equals(listUnorderedItem.iconId) && this.label.equals(listUnorderedItem.label);
        }

        public final int hashCode() {
            return this.label.hashCode() + (this.iconId.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("ListUnorderedItem(iconId=", this.iconId, ", label=", this.label, ")");
        }
    }

    public ListUnorderedSection(ArrayList arrayList) {
        this.items = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ListUnorderedSection) && this.items.equals(((ListUnorderedSection) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("ListUnorderedSection(items=", ")", this.items);
    }
}
