package com.squareup.cash.shopping.viewmodels;

import app.cash.directoryui.viewmodels.DirectoryAnalyticsData;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.directoryui.viewmodels.MissingMetadata;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class SearchResultsViewEvent implements ProductSearchViewEvent, BrandsSearchViewEvent {

    public final class FooterItemClick extends SearchResultsViewEvent {
        public final String actionUrl;

        public FooterItemClick(String str) {
            str.getClass();
            this.actionUrl = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FooterItemClick) && Intrinsics.areEqual(this.actionUrl, ((FooterItemClick) obj).actionUrl);
        }

        public final int hashCode() {
            return this.actionUrl.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FooterItemClick(actionUrl=", this.actionUrl, ")");
        }
    }

    public final class HeaderItemClick extends SearchResultsViewEvent {
        public final String actionUrl;
        public final DirectoryAnalyticsData data;

        public HeaderItemClick(String str, DirectoryAnalyticsData directoryAnalyticsData) {
            this.actionUrl = str;
            this.data = directoryAnalyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeaderItemClick)) {
                return false;
            }
            HeaderItemClick headerItemClick = (HeaderItemClick) obj;
            return Intrinsics.areEqual(this.actionUrl, headerItemClick.actionUrl) && Intrinsics.areEqual(this.data, headerItemClick.data);
        }

        public final int hashCode() {
            String str = this.actionUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            DirectoryAnalyticsData directoryAnalyticsData = this.data;
            return hashCode + (directoryAnalyticsData != null ? directoryAnalyticsData.hashCode() : 0);
        }

        public final String toString() {
            return "HeaderItemClick(actionUrl=" + this.actionUrl + ", data=" + this.data + ")";
        }
    }

    public final class ItemClick extends SearchResultsViewEvent {
        public final String actionUrl;
        public final DirectoryAnalyticsData data;
        public final DirectoryListItem.ItemViewModel item;

        public ItemClick(String str, DirectoryAnalyticsData directoryAnalyticsData, DirectoryListItem.ItemViewModel itemViewModel) {
            str.getClass();
            directoryAnalyticsData.getClass();
            this.actionUrl = str;
            this.data = directoryAnalyticsData;
            this.item = itemViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemClick)) {
                return false;
            }
            ItemClick itemClick = (ItemClick) obj;
            return Intrinsics.areEqual(this.actionUrl, itemClick.actionUrl) && Intrinsics.areEqual(this.data, itemClick.data) && Intrinsics.areEqual(this.item, itemClick.item);
        }

        public final int hashCode() {
            int hashCode = (this.data.hashCode() + (this.actionUrl.hashCode() * 31)) * 31;
            DirectoryListItem.ItemViewModel itemViewModel = this.item;
            return hashCode + (itemViewModel == null ? 0 : itemViewModel.hashCode());
        }

        public final String toString() {
            return "ItemClick(actionUrl=" + this.actionUrl + ", data=" + this.data + ", item=" + this.item + ")";
        }
    }

    public final class MissingMetadataEvent extends SearchResultsViewEvent {
        public final MissingMetadata metadata;

        public MissingMetadataEvent(MissingMetadata missingMetadata) {
            this.metadata = missingMetadata;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MissingMetadataEvent) && this.metadata.equals(((MissingMetadataEvent) obj).metadata);
        }

        public final int hashCode() {
            return this.metadata.hashCode();
        }

        public final String toString() {
            return "MissingMetadataEvent(metadata=" + this.metadata + ")";
        }
    }

    public final class TextRowClick extends SearchResultsViewEvent {
        public final DirectoryAnalyticsData data;
        public final boolean isAutocomplete;
        public final String text;

        public TextRowClick(String str, boolean z, DirectoryAnalyticsData directoryAnalyticsData) {
            str.getClass();
            this.text = str;
            this.isAutocomplete = z;
            this.data = directoryAnalyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextRowClick)) {
                return false;
            }
            TextRowClick textRowClick = (TextRowClick) obj;
            return Intrinsics.areEqual(this.text, textRowClick.text) && this.isAutocomplete == textRowClick.isAutocomplete && this.data.equals(textRowClick.data);
        }

        public final int hashCode() {
            return this.data.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.text.hashCode() * 31, 31, this.isAutocomplete);
        }

        public final String toString() {
            StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("TextRowClick(text=", this.text, ", isAutocomplete=", ", data=", this.isAutocomplete);
            m1540m.append(this.data);
            m1540m.append(")");
            return m1540m.toString();
        }
    }

    public final class ViewItem extends SearchResultsViewEvent {
        public final DirectoryAnalyticsData data;

        public ViewItem(DirectoryAnalyticsData directoryAnalyticsData) {
            this.data = directoryAnalyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewItem) && this.data.equals(((ViewItem) obj).data);
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final String toString() {
            return "ViewItem(data=" + this.data + ")";
        }
    }

    public final class ViewQuery extends SearchResultsViewEvent {
        public final DirectoryAnalyticsData data;

        public ViewQuery(DirectoryAnalyticsData directoryAnalyticsData) {
            this.data = directoryAnalyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewQuery) && this.data.equals(((ViewQuery) obj).data);
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final String toString() {
            return "ViewQuery(data=" + this.data + ")";
        }
    }

    public final class ViewSection extends SearchResultsViewEvent {
        public final DirectoryAnalyticsData data;

        public ViewSection(DirectoryAnalyticsData directoryAnalyticsData) {
            directoryAnalyticsData.getClass();
            this.data = directoryAnalyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewSection) && Intrinsics.areEqual(this.data, ((ViewSection) obj).data);
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final String toString() {
            return "ViewSection(data=" + this.data + ")";
        }
    }
}
