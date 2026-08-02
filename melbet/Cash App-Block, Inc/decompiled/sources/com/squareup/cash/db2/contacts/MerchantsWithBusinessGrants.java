package com.squareup.cash.db2.contacts;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.SyncBusinessGrant;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.MerchantData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MerchantsWithBusinessGrants {
    public final String account_reference_id;
    public final SyncBusinessGrant.ActionType action_type;
    public final BlockState blocked;
    public final String business_grant_id;
    public final boolean can_accept_payments;
    public final String cashtag;
    public final String category;
    public final String client_id;
    public final Long credit_card_fee;
    public final String customer_display_name;
    public final String customer_id;
    public final String investment_entity_token;
    public final boolean is_business;
    public final boolean is_cash_customer;
    public final boolean is_special_customer;
    public final boolean is_square;
    public final boolean is_verified;
    public final Long joined_on;
    public final MerchantData merchant_data;
    public final Image photo;
    public final Region region;
    public final String render_data;
    public final SyncBusinessGrant.RenderingBehavior rendering_behavior;
    public final Color themed_accent_color;
    public final String threaded_customer_id;

    public MerchantsWithBusinessGrants(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Long l, String str4, BlockState blockState, String str5, MerchantData merchantData, String str6, String str7, Region region, Long l2, Image image, Color color, boolean z6, String str8, String str9, SyncBusinessGrant.ActionType actionType, String str10, SyncBusinessGrant.RenderingBehavior renderingBehavior) {
        this.customer_id = str;
        this.cashtag = str2;
        this.customer_display_name = str3;
        this.can_accept_payments = z;
        this.is_square = z2;
        this.is_cash_customer = z3;
        this.is_business = z4;
        this.is_verified = z5;
        this.credit_card_fee = l;
        this.render_data = str4;
        this.blocked = blockState;
        this.threaded_customer_id = str5;
        this.merchant_data = merchantData;
        this.category = str6;
        this.investment_entity_token = str7;
        this.region = region;
        this.joined_on = l2;
        this.photo = image;
        this.themed_accent_color = color;
        this.is_special_customer = z6;
        this.business_grant_id = str8;
        this.client_id = str9;
        this.action_type = actionType;
        this.account_reference_id = str10;
        this.rendering_behavior = renderingBehavior;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantsWithBusinessGrants)) {
            return false;
        }
        MerchantsWithBusinessGrants merchantsWithBusinessGrants = (MerchantsWithBusinessGrants) obj;
        return this.customer_id.equals(merchantsWithBusinessGrants.customer_id) && Intrinsics.areEqual(this.cashtag, merchantsWithBusinessGrants.cashtag) && Intrinsics.areEqual(this.customer_display_name, merchantsWithBusinessGrants.customer_display_name) && this.can_accept_payments == merchantsWithBusinessGrants.can_accept_payments && this.is_square == merchantsWithBusinessGrants.is_square && this.is_cash_customer == merchantsWithBusinessGrants.is_cash_customer && this.is_business == merchantsWithBusinessGrants.is_business && this.is_verified == merchantsWithBusinessGrants.is_verified && Intrinsics.areEqual(this.credit_card_fee, merchantsWithBusinessGrants.credit_card_fee) && Intrinsics.areEqual(this.render_data, merchantsWithBusinessGrants.render_data) && this.blocked == merchantsWithBusinessGrants.blocked && Intrinsics.areEqual(this.threaded_customer_id, merchantsWithBusinessGrants.threaded_customer_id) && Intrinsics.areEqual(this.merchant_data, merchantsWithBusinessGrants.merchant_data) && Intrinsics.areEqual(this.category, merchantsWithBusinessGrants.category) && Intrinsics.areEqual(this.investment_entity_token, merchantsWithBusinessGrants.investment_entity_token) && this.region == merchantsWithBusinessGrants.region && Intrinsics.areEqual(this.joined_on, merchantsWithBusinessGrants.joined_on) && Intrinsics.areEqual(this.photo, merchantsWithBusinessGrants.photo) && Intrinsics.areEqual(this.themed_accent_color, merchantsWithBusinessGrants.themed_accent_color) && this.is_special_customer == merchantsWithBusinessGrants.is_special_customer && this.business_grant_id.equals(merchantsWithBusinessGrants.business_grant_id) && Intrinsics.areEqual(this.client_id, merchantsWithBusinessGrants.client_id) && this.action_type == merchantsWithBusinessGrants.action_type && Intrinsics.areEqual(this.account_reference_id, merchantsWithBusinessGrants.account_reference_id) && this.rendering_behavior == merchantsWithBusinessGrants.rendering_behavior;
    }

    public final int hashCode() {
        int hashCode = this.customer_id.hashCode() * 31;
        String str = this.cashtag;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.customer_display_name;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.can_accept_payments), 31, this.is_square), 31, this.is_cash_customer), 31, this.is_business), 31, this.is_verified);
        Long l = this.credit_card_fee;
        int hashCode3 = (m + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.render_data;
        int hashCode4 = (this.blocked.hashCode() + ((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.threaded_customer_id;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MerchantData merchantData = this.merchant_data;
        int hashCode6 = (hashCode5 + (merchantData == null ? 0 : merchantData.hashCode())) * 31;
        String str5 = this.category;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.investment_entity_token;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Region region = this.region;
        int hashCode9 = (hashCode8 + (region == null ? 0 : region.hashCode())) * 31;
        Long l2 = this.joined_on;
        int hashCode10 = (hashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Image image = this.photo;
        int hashCode11 = (hashCode10 + (image == null ? 0 : image.hashCode())) * 31;
        Color color = this.themed_accent_color;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode11 + (color == null ? 0 : color.hashCode())) * 31, 31, this.is_special_customer), 31, this.business_grant_id);
        String str7 = this.client_id;
        int hashCode12 = (m2 + (str7 == null ? 0 : str7.hashCode())) * 31;
        SyncBusinessGrant.ActionType actionType = this.action_type;
        int hashCode13 = (hashCode12 + (actionType == null ? 0 : actionType.hashCode())) * 31;
        String str8 = this.account_reference_id;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        SyncBusinessGrant.RenderingBehavior renderingBehavior = this.rendering_behavior;
        return hashCode14 + (renderingBehavior != null ? renderingBehavior.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MerchantsWithBusinessGrants(customer_id=", this.customer_id, ", cashtag=", this.cashtag, ", customer_display_name=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.customer_display_name, ", can_accept_payments=", this.can_accept_payments, ", is_square=");
        re$$ExternalSyntheticOutline0.m(m, this.is_square, ", is_cash_customer=", this.is_cash_customer, ", is_business=");
        re$$ExternalSyntheticOutline0.m(m, this.is_business, ", is_verified=", this.is_verified, ", credit_card_fee=");
        ViewEvent$State$EnumUnboxingLocalUtility.m(this.credit_card_fee, ", render_data=", this.render_data, ", blocked=", m);
        m.append(this.blocked);
        m.append(", threaded_customer_id=");
        m.append(this.threaded_customer_id);
        m.append(", merchant_data=");
        m.append(this.merchant_data);
        m.append(", category=");
        m.append(this.category);
        m.append(", investment_entity_token=");
        m.append(this.investment_entity_token);
        m.append(", region=");
        m.append(this.region);
        m.append(", joined_on=");
        m.append(this.joined_on);
        m.append(", photo=");
        m.append(this.photo);
        m.append(", themed_accent_color=");
        m.append(this.themed_accent_color);
        m.append(", is_special_customer=");
        m.append(this.is_special_customer);
        m.append(", business_grant_id=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.business_grant_id, ", client_id=", this.client_id, ", action_type=");
        m.append(this.action_type);
        m.append(", account_reference_id=");
        m.append(this.account_reference_id);
        m.append(", rendering_behavior=");
        m.append(this.rendering_behavior);
        m.append(")");
        return m.toString();
    }
}
