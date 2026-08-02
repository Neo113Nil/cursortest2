package com.squareup.cash.billssubscriptions.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BillsSubscriptionsMerchantListViewEvent {

    public final class BackClicked implements BillsSubscriptionsMerchantListViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return -462287190;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class CategoryToggled implements BillsSubscriptionsMerchantListViewEvent {
        public final String token;

        public CategoryToggled(String str) {
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CategoryToggled) && this.token.equals(((CategoryToggled) obj).token);
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CategoryToggled(token=", this.token, ")");
        }
    }

    public final class DoneClicked implements BillsSubscriptionsMerchantListViewEvent {
        public static final DoneClicked INSTANCE = new DoneClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DoneClicked);
        }

        public final int hashCode() {
            return 1508465583;
        }

        public final String toString() {
            return "DoneClicked";
        }
    }

    public final class MerchantTapped implements BillsSubscriptionsMerchantListViewEvent {
        public final String merchantName;

        public MerchantTapped(String str) {
            this.merchantName = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MerchantTapped) && this.merchantName.equals(((MerchantTapped) obj).merchantName);
        }

        public final int hashCode() {
            return this.merchantName.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MerchantTapped(merchantName=", this.merchantName, ")");
        }
    }

    public final class SearchChanged implements BillsSubscriptionsMerchantListViewEvent {
        public final String query;

        public SearchChanged(String str) {
            str.getClass();
            this.query = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchChanged) && Intrinsics.areEqual(this.query, ((SearchChanged) obj).query);
        }

        public final int hashCode() {
            return this.query.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SearchChanged(query=", this.query, ")");
        }
    }

    public final class ToastDismissed implements BillsSubscriptionsMerchantListViewEvent {
        public static final ToastDismissed INSTANCE = new ToastDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToastDismissed);
        }

        public final int hashCode() {
            return -488051560;
        }

        public final String toString() {
            return "ToastDismissed";
        }
    }
}
