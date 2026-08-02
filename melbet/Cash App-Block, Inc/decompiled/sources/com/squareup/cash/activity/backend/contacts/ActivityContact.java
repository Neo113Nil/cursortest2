package com.squareup.cash.activity.backend.contacts;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.MerchantData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ActivityContact {
    public final BlockState blocked;
    public final boolean canAcceptPayments;
    public final String customerId;
    public final Long displayDate;
    public final String displayName;
    public final String email;
    public final boolean hasLoyaltyData;
    public final boolean isBusiness;
    public final boolean isLoyaltyOnly;
    public final boolean isRegular;
    public final String lookupKey;
    public final MerchantData merchantData;
    public final Image photo;
    public final String sms;
    public final Color themedAccentColor;

    public ActivityContact(Image image, Color color, String str, boolean z, String str2, MerchantData merchantData, String str3, String str4, String str5, BlockState blockState, Long l, boolean z2, boolean z3, boolean z4, boolean z5) {
        str.getClass();
        str2.getClass();
        blockState.getClass();
        this.photo = image;
        this.themedAccentColor = color;
        this.customerId = str;
        this.isBusiness = z;
        this.displayName = str2;
        this.merchantData = merchantData;
        this.lookupKey = str3;
        this.email = str4;
        this.sms = str5;
        this.blocked = blockState;
        this.displayDate = l;
        this.isLoyaltyOnly = z2;
        this.canAcceptPayments = z3;
        this.hasLoyaltyData = z4;
        this.isRegular = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityContact)) {
            return false;
        }
        ActivityContact activityContact = (ActivityContact) obj;
        return Intrinsics.areEqual(this.photo, activityContact.photo) && Intrinsics.areEqual(this.themedAccentColor, activityContact.themedAccentColor) && Intrinsics.areEqual(this.customerId, activityContact.customerId) && this.isBusiness == activityContact.isBusiness && Intrinsics.areEqual(this.displayName, activityContact.displayName) && Intrinsics.areEqual(this.merchantData, activityContact.merchantData) && Intrinsics.areEqual(this.lookupKey, activityContact.lookupKey) && Intrinsics.areEqual(this.email, activityContact.email) && Intrinsics.areEqual(this.sms, activityContact.sms) && this.blocked == activityContact.blocked && Intrinsics.areEqual(this.displayDate, activityContact.displayDate) && this.isLoyaltyOnly == activityContact.isLoyaltyOnly && this.canAcceptPayments == activityContact.canAcceptPayments && this.hasLoyaltyData == activityContact.hasLoyaltyData && this.isRegular == activityContact.isRegular;
    }

    public final int hashCode() {
        Image image = this.photo;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        Color color = this.themedAccentColor;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (color == null ? 0 : color.hashCode())) * 31, 31, this.customerId), 31, this.isBusiness), 31, this.displayName);
        MerchantData merchantData = this.merchantData;
        int hashCode2 = (m + (merchantData == null ? 0 : merchantData.hashCode())) * 31;
        String str = this.lookupKey;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sms;
        int hashCode5 = (this.blocked.hashCode() + ((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        Long l = this.displayDate;
        return Boolean.hashCode(this.isRegular) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode5 + (l != null ? l.hashCode() : 0)) * 31, 31, this.isLoyaltyOnly), 31, this.canAcceptPayments), 31, this.hasLoyaltyData);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityContact(photo=");
        sb.append(this.photo);
        sb.append(", themedAccentColor=");
        sb.append(this.themedAccentColor);
        sb.append(", customerId=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.customerId, ", isBusiness=", this.isBusiness, ", displayName=");
        sb.append(this.displayName);
        sb.append(", merchantData=");
        sb.append(this.merchantData);
        sb.append(", lookupKey=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.lookupKey, ", email=", this.email, ", sms=");
        sb.append(this.sms);
        sb.append(", blocked=");
        sb.append(this.blocked);
        sb.append(", displayDate=");
        sb.append(this.displayDate);
        sb.append(", isLoyaltyOnly=");
        sb.append(this.isLoyaltyOnly);
        sb.append(", canAcceptPayments=");
        re$$ExternalSyntheticOutline0.m(sb, this.canAcceptPayments, ", hasLoyaltyData=", this.hasLoyaltyData, ", isRegular=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isRegular, ")");
    }
}
