package com.squareup.cash.db2.activity;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.MerchantData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ActivityRecipient {
    public final Boolean already_invited;
    public final BlockState blocked;
    public final boolean can_accept_payments;
    public final String cashtag;
    public final String category;
    public final String contact_display_name;
    public final long credit_card_fee;
    public final String customer_display_name;
    public final String customer_id;
    public final String email;
    public final String email_addresses;
    public final Boolean has_multiple_customers;
    public final String investment_entity_token;
    public final boolean is_business;
    public final boolean is_cash_customer;
    public final boolean is_square;
    public final boolean is_verified;
    public final String lookup_key;
    public final MerchantData merchant_data;
    public final Image photo;
    public final Region region;
    public final String render_data;
    public final String sms;
    public final String sms_numbers;
    public final Color themed_accent_color;
    public final String threaded_customer_id;

    public ActivityRecipient(String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, String str6, String str7, Image image, String str8, String str9, String str10, boolean z4, boolean z5, long j, BlockState blockState, MerchantData merchantData, Color color, Region region, String str11, String str12, String str13) {
        this.contact_display_name = str;
        this.lookup_key = str2;
        this.already_invited = bool;
        this.has_multiple_customers = bool2;
        this.customer_id = str3;
        this.threaded_customer_id = str4;
        this.cashtag = str5;
        this.is_cash_customer = z;
        this.is_verified = z2;
        this.is_business = z3;
        this.email = str6;
        this.sms = str7;
        this.photo = image;
        this.customer_display_name = str8;
        this.email_addresses = str9;
        this.sms_numbers = str10;
        this.can_accept_payments = z4;
        this.is_square = z5;
        this.credit_card_fee = j;
        this.blocked = blockState;
        this.merchant_data = merchantData;
        this.themed_accent_color = color;
        this.region = region;
        this.category = str11;
        this.investment_entity_token = str12;
        this.render_data = str13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityRecipient)) {
            return false;
        }
        ActivityRecipient activityRecipient = (ActivityRecipient) obj;
        return Intrinsics.areEqual(this.contact_display_name, activityRecipient.contact_display_name) && Intrinsics.areEqual(this.lookup_key, activityRecipient.lookup_key) && Intrinsics.areEqual(this.already_invited, activityRecipient.already_invited) && Intrinsics.areEqual(this.has_multiple_customers, activityRecipient.has_multiple_customers) && this.customer_id.equals(activityRecipient.customer_id) && Intrinsics.areEqual(this.threaded_customer_id, activityRecipient.threaded_customer_id) && Intrinsics.areEqual(this.cashtag, activityRecipient.cashtag) && this.is_cash_customer == activityRecipient.is_cash_customer && this.is_verified == activityRecipient.is_verified && this.is_business == activityRecipient.is_business && Intrinsics.areEqual(this.email, activityRecipient.email) && Intrinsics.areEqual(this.sms, activityRecipient.sms) && Intrinsics.areEqual(this.photo, activityRecipient.photo) && Intrinsics.areEqual(this.customer_display_name, activityRecipient.customer_display_name) && Intrinsics.areEqual(this.email_addresses, activityRecipient.email_addresses) && Intrinsics.areEqual(this.sms_numbers, activityRecipient.sms_numbers) && this.can_accept_payments == activityRecipient.can_accept_payments && this.is_square == activityRecipient.is_square && this.credit_card_fee == activityRecipient.credit_card_fee && this.blocked == activityRecipient.blocked && Intrinsics.areEqual(this.merchant_data, activityRecipient.merchant_data) && Intrinsics.areEqual(this.themed_accent_color, activityRecipient.themed_accent_color) && this.region == activityRecipient.region && Intrinsics.areEqual(this.category, activityRecipient.category) && Intrinsics.areEqual(this.investment_entity_token, activityRecipient.investment_entity_token) && Intrinsics.areEqual(this.render_data, activityRecipient.render_data);
    }

    public final int hashCode() {
        String str = this.contact_display_name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lookup_key;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.already_invited;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.has_multiple_customers;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.customer_id);
        String str3 = this.threaded_customer_id;
        int hashCode4 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cashtag;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.is_cash_customer), 31, this.is_verified), 31, this.is_business);
        String str5 = this.email;
        int hashCode5 = (m2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sms;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Image image = this.photo;
        int hashCode7 = (hashCode6 + (image == null ? 0 : image.hashCode())) * 31;
        String str7 = this.customer_display_name;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.email_addresses;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.sms_numbers;
        int hashCode10 = (this.blocked.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.can_accept_payments), 31, this.is_square), 31, this.credit_card_fee)) * 31;
        MerchantData merchantData = this.merchant_data;
        int hashCode11 = (hashCode10 + (merchantData == null ? 0 : merchantData.hashCode())) * 31;
        Color color = this.themed_accent_color;
        int hashCode12 = (hashCode11 + (color == null ? 0 : color.hashCode())) * 31;
        Region region = this.region;
        int hashCode13 = (hashCode12 + (region == null ? 0 : region.hashCode())) * 31;
        String str10 = this.category;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.investment_entity_token;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.render_data;
        return hashCode15 + (str12 != null ? str12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActivityRecipient(contact_display_name=", this.contact_display_name, ", lookup_key=", this.lookup_key, ", already_invited=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.already_invited, ", has_multiple_customers=", this.has_multiple_customers, ", customer_id=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.customer_id, ", threaded_customer_id=", this.threaded_customer_id, ", cashtag=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.cashtag, ", is_cash_customer=", this.is_cash_customer, ", is_verified=");
        re$$ExternalSyntheticOutline0.m(m, this.is_verified, ", is_business=", this.is_business, ", email=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.email, ", sms=", this.sms, ", photo=");
        m.append(this.photo);
        m.append(", customer_display_name=");
        m.append(this.customer_display_name);
        m.append(", email_addresses=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.email_addresses, ", sms_numbers=", this.sms_numbers, ", can_accept_payments=");
        re$$ExternalSyntheticOutline0.m(m, this.can_accept_payments, ", is_square=", this.is_square, ", credit_card_fee=");
        m.append(this.credit_card_fee);
        m.append(", blocked=");
        m.append(this.blocked);
        m.append(", merchant_data=");
        m.append(this.merchant_data);
        m.append(", themed_accent_color=");
        m.append(this.themed_accent_color);
        m.append(", region=");
        m.append(this.region);
        m.append(", category=");
        m.append(this.category);
        Boxes$$ExternalSyntheticOutline1.m(m, ", investment_entity_token=", this.investment_entity_token, ", render_data=", this.render_data);
        m.append(")");
        return m.toString();
    }
}
