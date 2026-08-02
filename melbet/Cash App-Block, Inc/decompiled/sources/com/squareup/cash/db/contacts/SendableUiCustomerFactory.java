package com.squareup.cash.db.contacts;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.ContactsStatus;
import com.squareup.protos.franklin.ui.InvestmentEntityData;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.protos.franklin.ui.UiCustomer;
import kotlin.text.StringsKt;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class SendableUiCustomerFactory {
    public static UiCustomer create(String str, Region region, Image image, String str2, String str3, String str4, String str5, String str6, MerchantData merchantData, Boolean bool, String str7, ContactsStatus contactsStatus) {
        boolean z;
        UiCustomer uiCustomer = new UiCustomer(null, str, str7, region, image, contactsStatus, -1094778889);
        UiCustomer copy$default = (str6 == null || StringsKt.isBlank(str6)) ? uiCustomer : UiCustomer.copy$default(uiCustomer, null, null, null, null, null, null, null, new InvestmentEntityData(str6, ByteString.EMPTY), null, null, null, -2097153);
        boolean z2 = true;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z = false;
        } else {
            copy$default = UiCustomer.copy$default(copy$default, null, str2, null, null, null, null, null, null, null, null, null, -5);
            z = true;
        }
        UiCustomer uiCustomer2 = copy$default;
        if (str3 != null && !StringsKt.isBlank(str3)) {
            uiCustomer2 = UiCustomer.copy$default(uiCustomer2, null, null, str3, null, null, null, null, null, null, null, null, -17);
            z = true;
        }
        if (str4 != null && !StringsKt.isBlank(str4)) {
            uiCustomer2 = UiCustomer.copy$default(uiCustomer2, null, null, null, null, str4, null, null, null, null, null, null, -513);
            z = true;
        }
        if (str5 == null || StringsKt.isBlank(str5)) {
            z2 = z;
        } else {
            uiCustomer2 = UiCustomer.copy$default(uiCustomer2, str5, null, null, null, null, null, null, null, null, null, null, -2);
        }
        UiCustomer uiCustomer3 = uiCustomer2;
        if (merchantData != null) {
            uiCustomer3 = UiCustomer.copy$default(uiCustomer3, null, null, null, null, null, null, merchantData, null, null, null, null, -262145);
        }
        UiCustomer copy$default2 = UiCustomer.copy$default(uiCustomer3, null, null, null, bool, null, null, null, null, null, null, null, -65);
        if (z2) {
            return copy$default2;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Invalid customer, has no valid alias (email/sms/cashtag/id)");
        return null;
    }
}
