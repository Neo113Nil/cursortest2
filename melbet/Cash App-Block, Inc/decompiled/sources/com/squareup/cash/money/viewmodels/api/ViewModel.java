package com.squareup.cash.money.viewmodels.api;

import com.squareup.cash.money.core.ids.SectionId;
import com.squareup.cash.money.viewmodels.api.Section;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class ViewModel {

    public final class HeaderModel extends ViewModel {
        public final Section.Header header;
        public final SectionId id;

        public HeaderModel(Section.Header header, SectionId sectionId) {
            sectionId.getClass();
            this.header = header;
            this.id = sectionId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeaderModel)) {
                return false;
            }
            HeaderModel headerModel = (HeaderModel) obj;
            return this.header.equals(headerModel.header) && this.id == headerModel.id;
        }

        @Override // com.squareup.cash.money.viewmodels.api.ViewModel
        public final SectionId getId() {
            return this.id;
        }

        public final int hashCode() {
            return this.id.hashCode() + (this.header.hashCode() * 31);
        }

        public final String toString() {
            return "HeaderModel(header=" + this.header + ", id=" + this.id + ")";
        }
    }

    public final class ItemList extends ViewModel {
        public final SectionId id;
        public final List items;
        public final Section.Layout layout;

        public ItemList(List list, Section.Layout layout, SectionId sectionId) {
            list.getClass();
            layout.getClass();
            sectionId.getClass();
            this.items = list;
            this.layout = layout;
            this.id = sectionId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemList)) {
                return false;
            }
            ItemList itemList = (ItemList) obj;
            return Intrinsics.areEqual(this.items, itemList.items) && Intrinsics.areEqual(this.layout, itemList.layout) && this.id == itemList.id;
        }

        @Override // com.squareup.cash.money.viewmodels.api.ViewModel
        public final SectionId getId() {
            return this.id;
        }

        public final int hashCode() {
            return this.id.hashCode() + ((this.layout.hashCode() + (this.items.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "ItemList(items=" + this.items + ", layout=" + this.layout + ", id=" + this.id + ")";
        }
    }

    public abstract SectionId getId();
}
