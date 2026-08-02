package com.squareup.cash.deposits.physical.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.db.contacts.Recipient;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PhysicalCashDepositAddressEntryScreen implements BlockersScreens.ChildBlockersScreens, Screen {
    public static final Parcelable.Creator<PhysicalCashDepositAddressEntryScreen> CREATOR = new Recipient.Creator(23);
    public final AddressSearchType addressSearchType;
    public final BlockersData blockersData;
    public final AskedQuestion question;
    public final SearchScreen searchScreen;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class AddressSearchType {
        public static final /* synthetic */ AddressSearchType[] $VALUES;
        public static final AddressSearchType ATM_WITHDRAWAL;
        public static final AddressSearchType BITCOIN_MAP;
        public static final AddressSearchType PHYSICAL_DEPOSIT;

        static {
            AddressSearchType addressSearchType = new AddressSearchType("PHYSICAL_DEPOSIT", 0);
            PHYSICAL_DEPOSIT = addressSearchType;
            AddressSearchType addressSearchType2 = new AddressSearchType("ATM_WITHDRAWAL", 1);
            ATM_WITHDRAWAL = addressSearchType2;
            AddressSearchType addressSearchType3 = new AddressSearchType("BITCOIN_MAP", 2);
            BITCOIN_MAP = addressSearchType3;
            $VALUES = new AddressSearchType[]{addressSearchType, addressSearchType2, addressSearchType3};
        }

        public static AddressSearchType valueOf(String str) {
            return (AddressSearchType) Enum.valueOf(AddressSearchType.class, str);
        }

        public static AddressSearchType[] values() {
            return (AddressSearchType[]) $VALUES.clone();
        }
    }

    /* loaded from: classes6.dex */
    public final class SearchScreen implements Parcelable {
        public static final Parcelable.Creator<SearchScreen> CREATOR = new Recipient.Creator(24);
        public final String explanationDetailText;
        public final String explanationTitleText;
        public final String recentSectionHeaderText;
        public final String resultSectionHeaderText;
        public final String searchBarPlaceholder;

        public SearchScreen(String str, String str2, String str3, String str4, String str5) {
            str.getClass();
            str2.getClass();
            this.searchBarPlaceholder = str;
            this.explanationTitleText = str2;
            this.explanationDetailText = str3;
            this.recentSectionHeaderText = str4;
            this.resultSectionHeaderText = str5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchScreen)) {
                return false;
            }
            SearchScreen searchScreen = (SearchScreen) obj;
            return Intrinsics.areEqual(this.searchBarPlaceholder, searchScreen.searchBarPlaceholder) && Intrinsics.areEqual(this.explanationTitleText, searchScreen.explanationTitleText) && Intrinsics.areEqual(this.explanationDetailText, searchScreen.explanationDetailText) && Intrinsics.areEqual(this.recentSectionHeaderText, searchScreen.recentSectionHeaderText) && Intrinsics.areEqual(this.resultSectionHeaderText, searchScreen.resultSectionHeaderText);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.searchBarPlaceholder.hashCode() * 31, 31, this.explanationTitleText);
            String str = this.explanationDetailText;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.recentSectionHeaderText;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.resultSectionHeaderText;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SearchScreen(searchBarPlaceholder=", this.searchBarPlaceholder, ", explanationTitleText=", this.explanationTitleText, ", explanationDetailText=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.explanationDetailText, ", recentSectionHeaderText=", this.recentSectionHeaderText, ", resultSectionHeaderText=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.resultSectionHeaderText, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.searchBarPlaceholder);
            parcel.writeString(this.explanationTitleText);
            parcel.writeString(this.explanationDetailText);
            parcel.writeString(this.recentSectionHeaderText);
            parcel.writeString(this.resultSectionHeaderText);
        }
    }

    public PhysicalCashDepositAddressEntryScreen(SearchScreen searchScreen, AddressSearchType addressSearchType, BlockersData blockersData, AskedQuestion askedQuestion) {
        searchScreen.getClass();
        addressSearchType.getClass();
        blockersData.getClass();
        askedQuestion.getClass();
        this.searchScreen = searchScreen;
        this.addressSearchType = addressSearchType;
        this.blockersData = blockersData;
        this.question = askedQuestion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhysicalCashDepositAddressEntryScreen)) {
            return false;
        }
        PhysicalCashDepositAddressEntryScreen physicalCashDepositAddressEntryScreen = (PhysicalCashDepositAddressEntryScreen) obj;
        return Intrinsics.areEqual(this.searchScreen, physicalCashDepositAddressEntryScreen.searchScreen) && this.addressSearchType == physicalCashDepositAddressEntryScreen.addressSearchType && Intrinsics.areEqual(this.blockersData, physicalCashDepositAddressEntryScreen.blockersData) && Intrinsics.areEqual(this.question, physicalCashDepositAddressEntryScreen.question);
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    public final int hashCode() {
        return this.question.hashCode() + ((this.blockersData.hashCode() + ((this.addressSearchType.hashCode() + (this.searchScreen.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PhysicalCashDepositAddressEntryScreen(searchScreen=" + this.searchScreen + ", addressSearchType=" + this.addressSearchType + ", blockersData=" + this.blockersData + ", question=" + this.question + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.searchScreen.writeToParcel(parcel, i);
        parcel.writeString(this.addressSearchType.name());
        parcel.writeParcelable(this.blockersData, i);
        parcel.writeParcelable(this.question, i);
    }
}
