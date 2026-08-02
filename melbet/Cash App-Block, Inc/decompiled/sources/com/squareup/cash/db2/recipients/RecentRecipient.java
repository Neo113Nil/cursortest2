package com.squareup.cash.db2.recipients;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.MerchantData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RecentRecipient {
    public final boolean already_invited;
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
    public final boolean has_multiple_customers;
    public final boolean is_business;
    public final boolean is_cash_customer;
    public final boolean is_square;
    public final boolean is_verified;
    public final Long joined_on;
    public final String lookup_key;
    public final MerchantData merchant_data;
    public final Image photo;
    public final Region region;
    public final String reward_token;
    public final String sms;
    public final String sms_numbers;
    public final Color themed_accent_color;
    public final String threaded_customer_id;

    public RecentRecipient(String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, boolean z3, boolean z4, boolean z5, String str6, String str7, Image image, String str8, String str9, String str10, boolean z6, boolean z7, long j, BlockState blockState, MerchantData merchantData, Color color, Region region, String str11, Long l, String str12) {
        this.contact_display_name = str;
        this.lookup_key = str2;
        this.already_invited = z;
        this.has_multiple_customers = z2;
        this.customer_id = str3;
        this.threaded_customer_id = str4;
        this.cashtag = str5;
        this.is_cash_customer = z3;
        this.is_verified = z4;
        this.is_business = z5;
        this.email = str6;
        this.sms = str7;
        this.photo = image;
        this.customer_display_name = str8;
        this.email_addresses = str9;
        this.sms_numbers = str10;
        this.can_accept_payments = z6;
        this.is_square = z7;
        this.credit_card_fee = j;
        this.blocked = blockState;
        this.merchant_data = merchantData;
        this.themed_accent_color = color;
        this.region = region;
        this.category = str11;
        this.joined_on = l;
        this.reward_token = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentRecipient)) {
            return false;
        }
        RecentRecipient recentRecipient = (RecentRecipient) obj;
        return Intrinsics.areEqual(this.contact_display_name, recentRecipient.contact_display_name) && Intrinsics.areEqual(this.lookup_key, recentRecipient.lookup_key) && this.already_invited == recentRecipient.already_invited && this.has_multiple_customers == recentRecipient.has_multiple_customers && Intrinsics.areEqual(this.customer_id, recentRecipient.customer_id) && Intrinsics.areEqual(this.threaded_customer_id, recentRecipient.threaded_customer_id) && Intrinsics.areEqual(this.cashtag, recentRecipient.cashtag) && this.is_cash_customer == recentRecipient.is_cash_customer && this.is_verified == recentRecipient.is_verified && this.is_business == recentRecipient.is_business && Intrinsics.areEqual(this.email, recentRecipient.email) && Intrinsics.areEqual(this.sms, recentRecipient.sms) && Intrinsics.areEqual(this.photo, recentRecipient.photo) && Intrinsics.areEqual(this.customer_display_name, recentRecipient.customer_display_name) && Intrinsics.areEqual(this.email_addresses, recentRecipient.email_addresses) && Intrinsics.areEqual(this.sms_numbers, recentRecipient.sms_numbers) && this.can_accept_payments == recentRecipient.can_accept_payments && this.is_square == recentRecipient.is_square && this.credit_card_fee == recentRecipient.credit_card_fee && this.blocked == recentRecipient.blocked && Intrinsics.areEqual(this.merchant_data, recentRecipient.merchant_data) && Intrinsics.areEqual(this.themed_accent_color, recentRecipient.themed_accent_color) && this.region == recentRecipient.region && Intrinsics.areEqual(this.category, recentRecipient.category) && Intrinsics.areEqual(this.joined_on, recentRecipient.joined_on) && Intrinsics.areEqual(this.reward_token, recentRecipient.reward_token);
    }

    public final int hashCode() {
        String str = this.contact_display_name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lookup_key;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.already_invited), 31, this.has_multiple_customers);
        String str3 = this.customer_id;
        int hashCode2 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.threaded_customer_id;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cashtag;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.is_cash_customer), 31, this.is_verified), 31, this.is_business);
        String str6 = this.email;
        int hashCode4 = (m2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sms;
        int hashCode5 = (hashCode4 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Image image = this.photo;
        int hashCode6 = (hashCode5 + (image == null ? 0 : image.hashCode())) * 31;
        String str8 = this.customer_display_name;
        int hashCode7 = (hashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.email_addresses;
        int hashCode8 = (hashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.sms_numbers;
        int m3 = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31, 31, this.can_accept_payments), 31, this.is_square), 31, this.credit_card_fee);
        BlockState blockState = this.blocked;
        int hashCode9 = (m3 + (blockState == null ? 0 : blockState.hashCode())) * 31;
        MerchantData merchantData = this.merchant_data;
        int hashCode10 = (hashCode9 + (merchantData == null ? 0 : merchantData.hashCode())) * 31;
        Color color = this.themed_accent_color;
        int hashCode11 = (hashCode10 + (color == null ? 0 : color.hashCode())) * 31;
        Region region = this.region;
        int hashCode12 = (hashCode11 + (region == null ? 0 : region.hashCode())) * 31;
        String str11 = this.category;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Long l = this.joined_on;
        int hashCode14 = (hashCode13 + (l == null ? 0 : l.hashCode())) * 31;
        String str12 = this.reward_token;
        return hashCode14 + (str12 != null ? str12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RecentRecipient(contact_display_name=", this.contact_display_name, ", lookup_key=", this.lookup_key, ", already_invited=");
        re$$ExternalSyntheticOutline0.m(m, this.already_invited, ", has_multiple_customers=", this.has_multiple_customers, ", customer_id=");
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
        m.append(", joined_on=");
        m.append(this.joined_on);
        m.append(", reward_token=");
        m.append(this.reward_token);
        m.append(")");
        return m.toString();
    }
}
