package com.squareup.cash.db2.loyalty;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.loyalty.LoyaltyUnit;
import com.squareup.protos.franklin.loyalty.ProgramRewards;
import com.squareup.protos.franklin.ui.MerchantData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LoyaltyMerchant {
    public final String account_id;
    public final String account_status_url;
    public final String cash_merchant_token;
    public final String customer_phone_number;
    public final String display_name;
    public final String loyalty_program_id;
    public final LoyaltyUnit loyalty_unit;
    public final MerchantData merchant_data;
    public final Image photo;
    public final long points_earned;
    public final String program_details;
    public final ProgramRewards program_rewards;
    public final Color themed_accent_color;

    public LoyaltyMerchant(String str, String str2, String str3, long j, LoyaltyUnit loyaltyUnit, ProgramRewards programRewards, Color color, Image image, String str4, MerchantData merchantData, String str5, String str6, String str7) {
        str2.getClass();
        loyaltyUnit.getClass();
        programRewards.getClass();
        str4.getClass();
        str6.getClass();
        str7.getClass();
        this.cash_merchant_token = str;
        this.customer_phone_number = str2;
        this.account_status_url = str3;
        this.points_earned = j;
        this.loyalty_unit = loyaltyUnit;
        this.program_rewards = programRewards;
        this.themed_accent_color = color;
        this.photo = image;
        this.display_name = str4;
        this.merchant_data = merchantData;
        this.program_details = str5;
        this.loyalty_program_id = str6;
        this.account_id = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyMerchant)) {
            return false;
        }
        LoyaltyMerchant loyaltyMerchant = (LoyaltyMerchant) obj;
        return this.cash_merchant_token.equals(loyaltyMerchant.cash_merchant_token) && Intrinsics.areEqual(this.customer_phone_number, loyaltyMerchant.customer_phone_number) && Intrinsics.areEqual(this.account_status_url, loyaltyMerchant.account_status_url) && this.points_earned == loyaltyMerchant.points_earned && Intrinsics.areEqual(this.loyalty_unit, loyaltyMerchant.loyalty_unit) && Intrinsics.areEqual(this.program_rewards, loyaltyMerchant.program_rewards) && Intrinsics.areEqual(this.themed_accent_color, loyaltyMerchant.themed_accent_color) && Intrinsics.areEqual(this.photo, loyaltyMerchant.photo) && Intrinsics.areEqual(this.display_name, loyaltyMerchant.display_name) && Intrinsics.areEqual(this.merchant_data, loyaltyMerchant.merchant_data) && Intrinsics.areEqual(this.program_details, loyaltyMerchant.program_details) && Intrinsics.areEqual(this.loyalty_program_id, loyaltyMerchant.loyalty_program_id) && Intrinsics.areEqual(this.account_id, loyaltyMerchant.account_id);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.cash_merchant_token.hashCode() * 31, 31, this.customer_phone_number);
        String str = this.account_status_url;
        int hashCode = (this.program_rewards.hashCode() + ((this.loyalty_unit.hashCode() + Recorder$$ExternalSyntheticOutline2.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.points_earned)) * 31)) * 31;
        Color color = this.themed_accent_color;
        int hashCode2 = (hashCode + (color == null ? 0 : color.hashCode())) * 31;
        Image image = this.photo;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.display_name);
        MerchantData merchantData = this.merchant_data;
        int hashCode3 = (m2 + (merchantData == null ? 0 : merchantData.hashCode())) * 31;
        String str2 = this.program_details;
        return this.account_id.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.loyalty_program_id);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LoyaltyMerchant(cash_merchant_token=", this.cash_merchant_token, ", customer_phone_number=", this.customer_phone_number, ", account_status_url=");
        m.append(this.account_status_url);
        m.append(", points_earned=");
        m.append(this.points_earned);
        m.append(", loyalty_unit=");
        m.append(this.loyalty_unit);
        m.append(", program_rewards=");
        m.append(this.program_rewards);
        m.append(", themed_accent_color=");
        m.append(this.themed_accent_color);
        m.append(", photo=");
        m.append(this.photo);
        m.append(", display_name=");
        m.append(this.display_name);
        m.append(", merchant_data=");
        m.append(this.merchant_data);
        Boxes$$ExternalSyntheticOutline1.m(m, ", program_details=", this.program_details, ", loyalty_program_id=", this.loyalty_program_id);
        return Recorder$$ExternalSyntheticOutline2.m(m, ", account_id=", this.account_id, ")");
    }
}
