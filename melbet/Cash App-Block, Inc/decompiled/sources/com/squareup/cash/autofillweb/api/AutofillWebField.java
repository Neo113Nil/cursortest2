package com.squareup.cash.autofillweb.api;

import com.google.mlkit.vision.text.zzd;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda0;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class AutofillWebField {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ AutofillWebField[] $VALUES;
    public static final AutofillWebField ADDRESS_LINE_1;
    public static final AutofillWebField ADDRESS_LINE_2;
    public static final AutofillWebField ADMINISTRATIVE_AREA;
    public static final AutofillWebField BILLING_ADDRESS_LINE_1;
    public static final AutofillWebField BILLING_ADDRESS_LINE_2;
    public static final AutofillWebField BILLING_ADMINISTRATIVE_AREA;
    public static final AutofillWebField BILLING_POSTCODE;
    public static final AutofillWebField BILLING_SUBURB;
    public static final zzd Companion;
    public static final AutofillWebField EMAIL;
    public static final AutofillWebField FIRST_NAME;
    public static final AutofillWebField LAST_NAME;
    public static final AutofillWebField PHONE_NUMBER;
    public static final AutofillWebField POSTCODE;
    public static final AutofillWebField SUBURB;
    public static final Set address1Fields;
    public static final Lazy addressFieldValues$delegate;
    public static final Set addressFields;
    public static final Lazy cardFieldValues$delegate;
    public static final Set cardFields;
    public static final Set infoFields;
    public final String value;

    static {
        AutofillWebField autofillWebField = new AutofillWebField("PHONE_COUNTRY_CODE", 0, "ContactDetails.CellPhones.CellPhone.CountryCode");
        AutofillWebField autofillWebField2 = new AutofillWebField("PHONE_NUMBER", 1, "ContactDetails.CellPhones.CellPhone.Number");
        PHONE_NUMBER = autofillWebField2;
        AutofillWebField autofillWebField3 = new AutofillWebField("EMAIL", 2, "ContactDetails.Emails.Email.Address");
        EMAIL = autofillWebField3;
        AutofillWebField autofillWebField4 = new AutofillWebField("FIRST_NAME", 3, "PersonalDetails.FirstName");
        FIRST_NAME = autofillWebField4;
        AutofillWebField autofillWebField5 = new AutofillWebField("LAST_NAME", 4, "PersonalDetails.LastName");
        LAST_NAME = autofillWebField5;
        AutofillWebField autofillWebField6 = new AutofillWebField("ADDRESS_LINE_1", 5, "AddressDetails.PostalAddress.AddressLine1");
        ADDRESS_LINE_1 = autofillWebField6;
        AutofillWebField autofillWebField7 = new AutofillWebField("ADDRESS_LINE_2", 6, "AddressDetails.PostalAddress.AddressLine2");
        ADDRESS_LINE_2 = autofillWebField7;
        AutofillWebField autofillWebField8 = new AutofillWebField("STREET_NUMBER", 7, "AddressDetails.PostalAddress.StreetNumber");
        AutofillWebField autofillWebField9 = new AutofillWebField("STREET_NAME", 8, "AddressDetails.PostalAddress.StreetName");
        AutofillWebField autofillWebField10 = new AutofillWebField("STREET_TYPE", 9, "AddressDetails.PostalAddress.StreetType");
        AutofillWebField autofillWebField11 = new AutofillWebField("POSTCODE", 10, "AddressDetails.PostalAddress.PostalCode");
        POSTCODE = autofillWebField11;
        AutofillWebField autofillWebField12 = new AutofillWebField("SUBURB", 11, "AddressDetails.PostalAddress.Suburb");
        SUBURB = autofillWebField12;
        AutofillWebField autofillWebField13 = new AutofillWebField("ADMINISTRATIVE_AREA", 12, "AddressDetails.PostalAddress.AdministrativeArea");
        ADMINISTRATIVE_AREA = autofillWebField13;
        AutofillWebField autofillWebField14 = new AutofillWebField("BILLING_ADDRESS_LINE_1", 13, "AddressDetails.BillingAddress.AddressLine1");
        BILLING_ADDRESS_LINE_1 = autofillWebField14;
        AutofillWebField autofillWebField15 = new AutofillWebField("BILLING_ADDRESS_LINE_2", 14, "AddressDetails.BillingAddress.AddressLine2");
        BILLING_ADDRESS_LINE_2 = autofillWebField15;
        AutofillWebField autofillWebField16 = new AutofillWebField("BILLING_POSTCODE", 15, "AddressDetails.BillingAddress.PostalCode");
        BILLING_POSTCODE = autofillWebField16;
        AutofillWebField autofillWebField17 = new AutofillWebField("BILLING_SUBURB", 16, "AddressDetails.BillingAddress.Suburb");
        BILLING_SUBURB = autofillWebField17;
        AutofillWebField autofillWebField18 = new AutofillWebField("BILLING_ADMINISTRATIVE_AREA", 17, "AddressDetails.BillingAddress.AdministrativeArea");
        BILLING_ADMINISTRATIVE_AREA = autofillWebField18;
        AutofillWebField autofillWebField19 = new AutofillWebField("CARD_NUMBER_KEY", 18, "CreditCards.CreditCard.Number");
        AutofillWebField autofillWebField20 = new AutofillWebField("CARD_TYPE_KEY", 19, "CreditCards.CreditCard.Type");
        AutofillWebField autofillWebField21 = new AutofillWebField("CARD_EXPIRY_KEY", 20, "CreditCards.CreditCard.Expiry");
        AutofillWebField autofillWebField22 = new AutofillWebField("CARD_EXPIRY_MONTH_KEY", 21, "CreditCards.CreditCard.Expiry.Month");
        AutofillWebField autofillWebField23 = new AutofillWebField("CARD_EXPIRY_YEAR_KEY", 22, "CreditCards.CreditCard.Expiry.Year");
        AutofillWebField autofillWebField24 = new AutofillWebField("CARD_CVV_KEY", 23, "CreditCards.CreditCard.CCV");
        AutofillWebField autofillWebField25 = new AutofillWebField("NAME_ON_CARD_KEY", 24, "CreditCards.CreditCard.NameOnCard");
        AutofillWebField[] autofillWebFieldArr = {autofillWebField, autofillWebField2, autofillWebField3, autofillWebField4, autofillWebField5, autofillWebField6, autofillWebField7, autofillWebField8, autofillWebField9, autofillWebField10, autofillWebField11, autofillWebField12, autofillWebField13, autofillWebField14, autofillWebField15, autofillWebField16, autofillWebField17, autofillWebField18, autofillWebField19, autofillWebField20, autofillWebField21, autofillWebField22, autofillWebField23, autofillWebField24, autofillWebField25};
        $VALUES = autofillWebFieldArr;
        $ENTRIES = new EnumEntriesList(autofillWebFieldArr);
        Companion = new zzd(16);
        cardFields = ArraysKt___ArraysKt.toSet(new AutofillWebField[]{autofillWebField19, autofillWebField21, autofillWebField22, autofillWebField23, autofillWebField24, autofillWebField20, autofillWebField25});
        cardFieldValues$delegate = LazyKt.lazy(new SsnViewKt$$ExternalSyntheticLambda0(3));
        addressFields = ArraysKt___ArraysKt.toSet(new AutofillWebField[]{autofillWebField, autofillWebField2, autofillWebField3, autofillWebField4, autofillWebField5, autofillWebField6, autofillWebField7, autofillWebField12, autofillWebField13, autofillWebField11, autofillWebField14, autofillWebField15, autofillWebField17, autofillWebField18, autofillWebField16});
        addressFieldValues$delegate = LazyKt.lazy(new SsnViewKt$$ExternalSyntheticLambda0(4));
        address1Fields = ArraysKt___ArraysKt.toSet(new AutofillWebField[]{autofillWebField6, autofillWebField14});
        infoFields = ArraysKt___ArraysKt.toSet(new AutofillWebField[]{autofillWebField2, autofillWebField3});
    }

    public AutofillWebField(String str, int i, String str2) {
        this.value = str2;
    }

    public static AutofillWebField valueOf(String str) {
        return (AutofillWebField) Enum.valueOf(AutofillWebField.class, str);
    }

    public static AutofillWebField[] values() {
        return (AutofillWebField[]) $VALUES.clone();
    }
}
