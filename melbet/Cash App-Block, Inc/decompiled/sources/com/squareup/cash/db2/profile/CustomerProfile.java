package com.squareup.cash.db2.profile;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.MerchantData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CustomerProfile {
    public final BlockState blocked;
    public final boolean can_accept_payments;
    public final String cashtag;
    public final String contact_display_name;
    public final Long credit_card_fee;
    public final String customer_display_name;
    public final String customer_id;
    public final String email;
    public final boolean is_business;
    public final boolean is_cash_customer;
    public final boolean is_verified;
    public final String lookup_key;
    public final MerchantData merchant_data;
    public final Image photo;
    public final Region region;
    public final String sms;
    public final Color themed_accent_color;

    public CustomerProfile(String str, String str2, String str3, String str4, Image image, Color color, String str5, String str6, String str7, boolean z, boolean z2, Region region, Long l, BlockState blockState, boolean z3, MerchantData merchantData, boolean z4) {
        blockState.getClass();
        this.customer_id = str;
        this.lookup_key = str2;
        this.contact_display_name = str3;
        this.customer_display_name = str4;
        this.photo = image;
        this.themed_accent_color = color;
        this.email = str5;
        this.sms = str6;
        this.cashtag = str7;
        this.is_business = z;
        this.is_verified = z2;
        this.region = region;
        this.credit_card_fee = l;
        this.blocked = blockState;
        this.is_cash_customer = z3;
        this.merchant_data = merchantData;
        this.can_accept_payments = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerProfile)) {
            return false;
        }
        CustomerProfile customerProfile = (CustomerProfile) obj;
        return this.customer_id.equals(customerProfile.customer_id) && Intrinsics.areEqual(this.lookup_key, customerProfile.lookup_key) && Intrinsics.areEqual(this.contact_display_name, customerProfile.contact_display_name) && Intrinsics.areEqual(this.customer_display_name, customerProfile.customer_display_name) && Intrinsics.areEqual(this.photo, customerProfile.photo) && Intrinsics.areEqual(this.themed_accent_color, customerProfile.themed_accent_color) && Intrinsics.areEqual(this.email, customerProfile.email) && Intrinsics.areEqual(this.sms, customerProfile.sms) && Intrinsics.areEqual(this.cashtag, customerProfile.cashtag) && this.is_business == customerProfile.is_business && this.is_verified == customerProfile.is_verified && this.region == customerProfile.region && Intrinsics.areEqual(this.credit_card_fee, customerProfile.credit_card_fee) && this.blocked == customerProfile.blocked && this.is_cash_customer == customerProfile.is_cash_customer && Intrinsics.areEqual(this.merchant_data, customerProfile.merchant_data) && this.can_accept_payments == customerProfile.can_accept_payments;
    }

    public final int hashCode() {
        int hashCode = this.customer_id.hashCode() * 31;
        String str = this.lookup_key;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.contact_display_name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customer_display_name;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Image image = this.photo;
        int hashCode5 = (hashCode4 + (image == null ? 0 : image.hashCode())) * 31;
        Color color = this.themed_accent_color;
        int hashCode6 = (hashCode5 + (color == null ? 0 : color.hashCode())) * 31;
        String str4 = this.email;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sms;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cashtag;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.is_business), 31, this.is_verified);
        Region region = this.region;
        int hashCode9 = (m + (region == null ? 0 : region.hashCode())) * 31;
        Long l = this.credit_card_fee;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.blocked.hashCode() + ((hashCode9 + (l == null ? 0 : l.hashCode())) * 31)) * 31, 31, this.is_cash_customer);
        MerchantData merchantData = this.merchant_data;
        return Boolean.hashCode(this.can_accept_payments) + ((m2 + (merchantData != null ? merchantData.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CustomerProfile(customer_id=", this.customer_id, ", lookup_key=", this.lookup_key, ", contact_display_name=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.contact_display_name, ", customer_display_name=", this.customer_display_name, ", photo=");
        m.append(this.photo);
        m.append(", themed_accent_color=");
        m.append(this.themed_accent_color);
        m.append(", email=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.email, ", sms=", this.sms, ", cashtag=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.cashtag, ", is_business=", this.is_business, ", is_verified=");
        m.append(this.is_verified);
        m.append(", region=");
        m.append(this.region);
        m.append(", credit_card_fee=");
        m.append(this.credit_card_fee);
        m.append(", blocked=");
        m.append(this.blocked);
        m.append(", is_cash_customer=");
        m.append(this.is_cash_customer);
        m.append(", merchant_data=");
        m.append(this.merchant_data);
        m.append(", can_accept_payments=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.can_accept_payments, ")");
    }
}
