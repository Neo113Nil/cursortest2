package com.squareup.cash.globalsearch.viewmodels;

import app.cash.inputfieldtext.composeui.TextFieldStateInputFieldText;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface GlobalSearchViewEvent {

    public final class BackEvent implements GlobalSearchViewEvent {
        public static final BackEvent INSTANCE = new BackEvent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackEvent);
        }

        public final int hashCode() {
            return -691968959;
        }

        public final String toString() {
            return "BackEvent";
        }
    }

    public final class LoadMore implements RowSectionEvent {
        public static final LoadMore INSTANCE = new LoadMore();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LoadMore);
        }

        public final int hashCode() {
            return 1919328589;
        }

        public final String toString() {
            return "LoadMore";
        }
    }

    public final class QueryUpdateEvent implements GlobalSearchViewEvent {
        public final TextFieldStateInputFieldText query;

        public QueryUpdateEvent(TextFieldStateInputFieldText textFieldStateInputFieldText) {
            this.query = textFieldStateInputFieldText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QueryUpdateEvent) && this.query.equals(((QueryUpdateEvent) obj).query);
        }

        public final int hashCode() {
            return this.query.textFieldState.hashCode();
        }

        public final String toString() {
            return "QueryUpdateEvent(query=" + this.query + ")";
        }
    }

    public final class Retry implements GlobalSearchViewEvent {
        public static final Retry INSTANCE = new Retry();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Retry);
        }

        public final int hashCode() {
            return -1561368586;
        }

        public final String toString() {
            return "Retry";
        }
    }

    public interface RowSectionEvent {

        public final class AccessoryClicked implements RowSectionEvent {
            public final String actionUrl;
            public final GlobalSearchViewModel.Item item;

            public AccessoryClicked(GlobalSearchViewModel.Item item, String str) {
                item.getClass();
                this.item = item;
                this.actionUrl = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AccessoryClicked)) {
                    return false;
                }
                AccessoryClicked accessoryClicked = (AccessoryClicked) obj;
                return Intrinsics.areEqual(this.item, accessoryClicked.item) && this.actionUrl.equals(accessoryClicked.actionUrl);
            }

            public final int hashCode() {
                return this.actionUrl.hashCode() + (this.item.hashCode() * 31);
            }

            public final String toString() {
                return "AccessoryClicked(item=" + this.item + ", actionUrl=" + this.actionUrl + ")";
            }
        }

        public final class RowClicked implements RowSectionEvent {
            public final String actionUrl;
            public final GlobalSearchViewModel.Item item;

            public RowClicked(GlobalSearchViewModel.Item item, String str) {
                item.getClass();
                str.getClass();
                this.item = item;
                this.actionUrl = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RowClicked)) {
                    return false;
                }
                RowClicked rowClicked = (RowClicked) obj;
                return Intrinsics.areEqual(this.item, rowClicked.item) && Intrinsics.areEqual(this.actionUrl, rowClicked.actionUrl);
            }

            public final int hashCode() {
                return this.actionUrl.hashCode() + (this.item.hashCode() * 31);
            }

            public final String toString() {
                return "RowClicked(item=" + this.item + ", actionUrl=" + this.actionUrl + ")";
            }
        }

        public final class RowViewed implements RowSectionEvent {
            public final GlobalSearchViewModel.Item item;

            public RowViewed(GlobalSearchViewModel.Item item) {
                item.getClass();
                this.item = item;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RowViewed) && Intrinsics.areEqual(this.item, ((RowViewed) obj).item);
            }

            public final int hashCode() {
                return this.item.hashCode();
            }

            public final String toString() {
                return "RowViewed(item=" + this.item + ")";
            }
        }
    }
}
