package com.squareup.cash.autofillweb.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.mlkit.vision.text.zzd;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class AutofillWebInfo {
    public final String addressLine1;
    public final String addressLine2;
    public final String administrativeArea;
    public final String cardNumber;
    public final String cvv;
    public final String email;
    public final String expiryMonth;
    public final String expiryYear;
    public final String familyName;
    public final String firstName;
    public final String nameOnCard;
    public final String phone;
    public final String postalCode;
    public final String sms;
    public final String suburb;

    public /* synthetic */ AutofillWebInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & PKIFailureInfo.certRevoked) != 0 ? null : str14, (i & 16384) != 0 ? null : str15);
    }

    public static AutofillWebInfo copy$default(AutofillWebInfo autofillWebInfo, String str, String str2, String str3, String str4) {
        return new AutofillWebInfo(str, str2, str3, str4, autofillWebInfo.sms, autofillWebInfo.email, autofillWebInfo.nameOnCard, autofillWebInfo.firstName, autofillWebInfo.familyName, autofillWebInfo.phone, autofillWebInfo.addressLine1, autofillWebInfo.addressLine2, autofillWebInfo.postalCode, autofillWebInfo.suburb, autofillWebInfo.administrativeArea);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutofillWebInfo)) {
            return false;
        }
        AutofillWebInfo autofillWebInfo = (AutofillWebInfo) obj;
        return Intrinsics.areEqual(this.cardNumber, autofillWebInfo.cardNumber) && Intrinsics.areEqual(this.expiryMonth, autofillWebInfo.expiryMonth) && Intrinsics.areEqual(this.expiryYear, autofillWebInfo.expiryYear) && Intrinsics.areEqual(this.cvv, autofillWebInfo.cvv) && Intrinsics.areEqual(this.sms, autofillWebInfo.sms) && Intrinsics.areEqual(this.email, autofillWebInfo.email) && Intrinsics.areEqual(this.nameOnCard, autofillWebInfo.nameOnCard) && Intrinsics.areEqual(this.firstName, autofillWebInfo.firstName) && Intrinsics.areEqual(this.familyName, autofillWebInfo.familyName) && Intrinsics.areEqual(this.phone, autofillWebInfo.phone) && Intrinsics.areEqual(this.addressLine1, autofillWebInfo.addressLine1) && Intrinsics.areEqual(this.addressLine2, autofillWebInfo.addressLine2) && Intrinsics.areEqual(this.postalCode, autofillWebInfo.postalCode) && Intrinsics.areEqual(this.suburb, autofillWebInfo.suburb) && Intrinsics.areEqual(this.administrativeArea, autofillWebInfo.administrativeArea);
    }

    public final int hashCode() {
        String str = this.cardNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.expiryMonth;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expiryYear;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cvv;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sms;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.email;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.nameOnCard;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.firstName;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.familyName;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.phone;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.addressLine1;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.addressLine2;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.postalCode;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.suburb;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.administrativeArea;
        return hashCode14 + (str15 != null ? str15.hashCode() : 0);
    }

    public final LinkedHashMap toDataMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.cardNumber;
        if (str != null) {
            zzd zzdVar = AutofillWebField.Companion;
            linkedHashMap.put("CreditCards.CreditCard.Number", str);
        }
        String str2 = this.expiryMonth;
        if (str2 != null) {
            zzd zzdVar2 = AutofillWebField.Companion;
            linkedHashMap.put("CreditCards.CreditCard.Expiry.Month", str2);
        }
        String str3 = this.expiryYear;
        if (str3 != null) {
            zzd zzdVar3 = AutofillWebField.Companion;
            linkedHashMap.put("CreditCards.CreditCard.Expiry.Year", str3);
        }
        String str4 = this.cvv;
        if (str4 != null) {
            zzd zzdVar4 = AutofillWebField.Companion;
            linkedHashMap.put("CreditCards.CreditCard.CCV", str4);
        }
        if (str2 != null && str3 != null) {
            zzd zzdVar5 = AutofillWebField.Companion;
            linkedHashMap.put("CreditCards.CreditCard.Expiry", str2 + "-" + str3);
        }
        String str5 = this.sms;
        if (str5 != null) {
            zzd zzdVar6 = AutofillWebField.Companion;
            linkedHashMap.put("ContactDetails.CellPhones.CellPhone.Number", str5);
        }
        String str6 = this.email;
        if (str6 != null) {
            zzd zzdVar7 = AutofillWebField.Companion;
            linkedHashMap.put("ContactDetails.Emails.Email.Address", str6);
        }
        String str7 = this.nameOnCard;
        if (str7 != null) {
            zzd zzdVar8 = AutofillWebField.Companion;
            linkedHashMap.put("CreditCards.CreditCard.NameOnCard", str7);
        }
        String str8 = this.firstName;
        if (str8 != null) {
            zzd zzdVar9 = AutofillWebField.Companion;
            linkedHashMap.put("PersonalDetails.FirstName", str8);
        }
        String str9 = this.familyName;
        if (str9 != null) {
            zzd zzdVar10 = AutofillWebField.Companion;
            linkedHashMap.put("PersonalDetails.LastName", str9);
        }
        String str10 = this.phone;
        if (str10 != null) {
            zzd zzdVar11 = AutofillWebField.Companion;
            linkedHashMap.put("ContactDetails.CellPhones.CellPhone.Number", str10);
        }
        String str11 = this.addressLine1;
        if (str11 != null) {
            zzd zzdVar12 = AutofillWebField.Companion;
            linkedHashMap.put("AddressDetails.PostalAddress.AddressLine1", str11);
            linkedHashMap.put("AddressDetails.BillingAddress.AddressLine1", str11);
        }
        String str12 = this.addressLine2;
        if (str12 != null) {
            zzd zzdVar13 = AutofillWebField.Companion;
            linkedHashMap.put("AddressDetails.PostalAddress.AddressLine2", str12);
            linkedHashMap.put("AddressDetails.BillingAddress.AddressLine2", str12);
        }
        String str13 = this.suburb;
        if (str13 != null) {
            zzd zzdVar14 = AutofillWebField.Companion;
            linkedHashMap.put("AddressDetails.PostalAddress.Suburb", str13);
            linkedHashMap.put("AddressDetails.BillingAddress.Suburb", str13);
        }
        String str14 = this.administrativeArea;
        if (str14 != null) {
            zzd zzdVar15 = AutofillWebField.Companion;
            linkedHashMap.put("AddressDetails.PostalAddress.AdministrativeArea", str14);
        }
        String str15 = this.postalCode;
        if (str15 != null) {
            zzd zzdVar16 = AutofillWebField.Companion;
            linkedHashMap.put("AddressDetails.PostalAddress.PostalCode", str15);
            linkedHashMap.put("AddressDetails.BillingAddress.PostalCode", str15);
        }
        zzd zzdVar17 = AutofillWebField.Companion;
        linkedHashMap.put("CreditCards.CreditCard.Type", "VISA");
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AutofillWebInfo(cardNumber=", this.cardNumber, ", expiryMonth=", this.expiryMonth, ", expiryYear=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.expiryYear, ", cvv=", this.cvv, ", sms=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.sms, ", email=", this.email, ", nameOnCard=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.nameOnCard, ", firstName=", this.firstName, ", familyName=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.familyName, ", phone=", this.phone, ", addressLine1=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.addressLine1, ", addressLine2=", this.addressLine2, ", postalCode=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.postalCode, ", suburb=", this.suburb, ", administrativeArea=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.administrativeArea, ")");
    }

    public AutofillWebInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.cardNumber = str;
        this.expiryMonth = str2;
        this.expiryYear = str3;
        this.cvv = str4;
        this.sms = str5;
        this.email = str6;
        this.nameOnCard = str7;
        this.firstName = str8;
        this.familyName = str9;
        this.phone = str10;
        this.addressLine1 = str11;
        this.addressLine2 = str12;
        this.postalCode = str13;
        this.suburb = str14;
        this.administrativeArea = str15;
    }
}
