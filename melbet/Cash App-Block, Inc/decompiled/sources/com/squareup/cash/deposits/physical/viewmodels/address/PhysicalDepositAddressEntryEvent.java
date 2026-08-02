package com.squareup.cash.deposits.physical.viewmodels.address;

import com.squareup.address.typeahead.backend.api.SearchLocation;

/* loaded from: classes6.dex */
public abstract class PhysicalDepositAddressEntryEvent {

    public final class AddressRecentClick extends PhysicalDepositAddressEntryEvent {
        public final AddressSearchViewModel address;

        public AddressRecentClick(AddressSearchViewModel addressSearchViewModel) {
            this.address = addressSearchViewModel;
        }
    }

    public final class AddressSearchResultClick extends PhysicalDepositAddressEntryEvent {
        public final SearchLocation location;

        public AddressSearchResultClick(SearchLocation searchLocation) {
            this.location = searchLocation;
        }
    }

    public final class ClearAllAddressRecentClick extends PhysicalDepositAddressEntryEvent {
        public static final ClearAllAddressRecentClick INSTANCE = new ClearAllAddressRecentClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClearAllAddressRecentClick);
        }

        public final int hashCode() {
            return -812827203;
        }

        public final String toString() {
            return "ClearAllAddressRecentClick";
        }
    }

    public final class Exit extends PhysicalDepositAddressEntryEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return 1045787726;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class SearchTextChange extends PhysicalDepositAddressEntryEvent {
        public final String text;

        public SearchTextChange(String str) {
            str.getClass();
            this.text = str;
        }
    }
}
