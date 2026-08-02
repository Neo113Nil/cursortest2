package com.squareup.cash.account.settings.viewmodels.business;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BusinessInfoViewEvent {

    public final class BackClicked implements BusinessInfoViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return 1379144754;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class BusinessAddressClicked implements BusinessInfoViewEvent {
        public final String address;

        public BusinessAddressClicked(String str) {
            str.getClass();
            this.address = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BusinessAddressClicked) && Intrinsics.areEqual(this.address, ((BusinessAddressClicked) obj).address);
        }

        public final int hashCode() {
            return this.address.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BusinessAddressClicked(address=", this.address, ")");
        }
    }

    public final class DismissBottomSheet implements BusinessInfoViewEvent {
        public static final DismissBottomSheet INSTANCE = new DismissBottomSheet();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissBottomSheet);
        }

        public final int hashCode() {
            return 500664792;
        }

        public final String toString() {
            return "DismissBottomSheet";
        }
    }

    public final class DowngradeToPersonalProfile implements BusinessInfoViewEvent {
        public static final DowngradeToPersonalProfile INSTANCE = new DowngradeToPersonalProfile();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DowngradeToPersonalProfile);
        }

        public final int hashCode() {
            return -161551833;
        }

        public final String toString() {
            return "DowngradeToPersonalProfile";
        }
    }

    public final class UpdateBusinessAddress implements BusinessInfoViewEvent {
        public final String address;

        public UpdateBusinessAddress(String str) {
            str.getClass();
            this.address = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateBusinessAddress) && Intrinsics.areEqual(this.address, ((UpdateBusinessAddress) obj).address);
        }

        public final int hashCode() {
            return this.address.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UpdateBusinessAddress(address=", this.address, ")");
        }
    }

    public final class ViewBusinessTaxInfo implements BusinessInfoViewEvent {
        public static final ViewBusinessTaxInfo INSTANCE = new ViewBusinessTaxInfo();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewBusinessTaxInfo);
        }

        public final int hashCode() {
            return -853112154;
        }

        public final String toString() {
            return "ViewBusinessTaxInfo";
        }
    }
}
