package com.squareup.cash.db2.activity;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.MerchantData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ActivityCustomer {
    public final BlockState blocked;
    public final boolean can_accept_payments;
    public final String customer_id;
    public final Long display_date;
    public final String display_name;
    public final String email;
    public final boolean has_loyalty_data;
    public final boolean isRegular;
    public final boolean is_business;
    public final boolean is_loyalty_only;
    public final String lookup_key;
    public final MerchantData merchant_data;
    public final Image photo;
    public final String sms;
    public final Color themed_accent_color;

    public ActivityCustomer(Image image, Color color, String str, boolean z, String str2, MerchantData merchantData, String str3, String str4, String str5, BlockState blockState, Long l, boolean z2, boolean z3, boolean z4, boolean z5) {
        str.getClass();
        str2.getClass();
        blockState.getClass();
        this.photo = image;
        this.themed_accent_color = color;
        this.customer_id = str;
        this.is_business = z;
        this.display_name = str2;
        this.merchant_data = merchantData;
        this.lookup_key = str3;
        this.email = str4;
        this.sms = str5;
        this.blocked = blockState;
        this.display_date = l;
        this.is_loyalty_only = z2;
        this.can_accept_payments = z3;
        this.has_loyalty_data = z4;
        this.isRegular = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityCustomer)) {
            return false;
        }
        ActivityCustomer activityCustomer = (ActivityCustomer) obj;
        return Intrinsics.areEqual(this.photo, activityCustomer.photo) && Intrinsics.areEqual(this.themed_accent_color, activityCustomer.themed_accent_color) && Intrinsics.areEqual(this.customer_id, activityCustomer.customer_id) && this.is_business == activityCustomer.is_business && Intrinsics.areEqual(this.display_name, activityCustomer.display_name) && Intrinsics.areEqual(this.merchant_data, activityCustomer.merchant_data) && Intrinsics.areEqual(this.lookup_key, activityCustomer.lookup_key) && Intrinsics.areEqual(this.email, activityCustomer.email) && Intrinsics.areEqual(this.sms, activityCustomer.sms) && this.blocked == activityCustomer.blocked && Intrinsics.areEqual(this.display_date, activityCustomer.display_date) && this.is_loyalty_only == activityCustomer.is_loyalty_only && this.can_accept_payments == activityCustomer.can_accept_payments && this.has_loyalty_data == activityCustomer.has_loyalty_data && this.isRegular == activityCustomer.isRegular;
    }

    public final int hashCode() {
        Image image = this.photo;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        Color color = this.themed_accent_color;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (color == null ? 0 : color.hashCode())) * 31, 31, this.customer_id), 31, this.is_business), 31, this.display_name);
        MerchantData merchantData = this.merchant_data;
        int hashCode2 = (m + (merchantData == null ? 0 : merchantData.hashCode())) * 31;
        String str = this.lookup_key;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sms;
        int hashCode5 = (this.blocked.hashCode() + ((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        Long l = this.display_date;
        return Boolean.hashCode(this.isRegular) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode5 + (l != null ? l.hashCode() : 0)) * 31, 31, this.is_loyalty_only), 31, this.can_accept_payments), 31, this.has_loyalty_data);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityCustomer(photo=");
        sb.append(this.photo);
        sb.append(", themed_accent_color=");
        sb.append(this.themed_accent_color);
        sb.append(", customer_id=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.customer_id, ", is_business=", this.is_business, ", display_name=");
        sb.append(this.display_name);
        sb.append(", merchant_data=");
        sb.append(this.merchant_data);
        sb.append(", lookup_key=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.lookup_key, ", email=", this.email, ", sms=");
        sb.append(this.sms);
        sb.append(", blocked=");
        sb.append(this.blocked);
        sb.append(", display_date=");
        sb.append(this.display_date);
        sb.append(", is_loyalty_only=");
        sb.append(this.is_loyalty_only);
        sb.append(", can_accept_payments=");
        re$$ExternalSyntheticOutline0.m(sb, this.can_accept_payments, ", has_loyalty_data=", this.has_loyalty_data, ", isRegular=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isRegular, ")");
    }
}
