package com.squareup.cash.merchant.backend.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsResponse;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MerchantProfileData {
    public final Color brandColor;
    public final String category;
    public final List genericTreeElements;
    public final Image headerImageUrl;
    public final GetProfileDetailsResponse.MerchantData.MerchantProfileImage logo;
    public final String merchantToken;
    public final String name;
    public final Action passiveAction;
    public final boolean shouldColorizeAvatar;
    public final boolean shouldFillBackground;
    public final AnalyticsEvent viewEvent;

    public MerchantProfileData(String str, String str2, GetProfileDetailsResponse.MerchantData.MerchantProfileImage merchantProfileImage, Color color, boolean z, boolean z2, String str3, AnalyticsEvent analyticsEvent, Action action, Image image, ArrayList arrayList) {
        str.getClass();
        this.name = str;
        this.category = str2;
        this.logo = merchantProfileImage;
        this.brandColor = color;
        this.shouldColorizeAvatar = z;
        this.shouldFillBackground = z2;
        this.merchantToken = str3;
        this.viewEvent = analyticsEvent;
        this.passiveAction = action;
        this.headerImageUrl = image;
        this.genericTreeElements = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantProfileData)) {
            return false;
        }
        MerchantProfileData merchantProfileData = (MerchantProfileData) obj;
        return Intrinsics.areEqual(this.name, merchantProfileData.name) && Intrinsics.areEqual(this.category, merchantProfileData.category) && Intrinsics.areEqual(this.logo, merchantProfileData.logo) && Intrinsics.areEqual(this.brandColor, merchantProfileData.brandColor) && this.shouldColorizeAvatar == merchantProfileData.shouldColorizeAvatar && this.shouldFillBackground == merchantProfileData.shouldFillBackground && Intrinsics.areEqual(this.merchantToken, merchantProfileData.merchantToken) && Intrinsics.areEqual(this.viewEvent, merchantProfileData.viewEvent) && Intrinsics.areEqual(this.passiveAction, merchantProfileData.passiveAction) && Intrinsics.areEqual(this.headerImageUrl, merchantProfileData.headerImageUrl) && Intrinsics.areEqual(this.genericTreeElements, merchantProfileData.genericTreeElements);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.category;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        GetProfileDetailsResponse.MerchantData.MerchantProfileImage merchantProfileImage = this.logo;
        int hashCode3 = (hashCode2 + (merchantProfileImage == null ? 0 : merchantProfileImage.hashCode())) * 31;
        Color color = this.brandColor;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (color == null ? 0 : color.hashCode())) * 31, 31, this.shouldColorizeAvatar), 31, this.shouldFillBackground);
        String str2 = this.merchantToken;
        int hashCode4 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        AnalyticsEvent analyticsEvent = this.viewEvent;
        int hashCode5 = (hashCode4 + (analyticsEvent == null ? 0 : analyticsEvent.hashCode())) * 31;
        Action action = this.passiveAction;
        int hashCode6 = (hashCode5 + (action == null ? 0 : action.hashCode())) * 31;
        Image image = this.headerImageUrl;
        int hashCode7 = (hashCode6 + (image == null ? 0 : image.hashCode())) * 31;
        List list = this.genericTreeElements;
        return hashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MerchantProfileData(name=", this.name, ", category=", this.category, ", logo=");
        m.append(this.logo);
        m.append(", brandColor=");
        m.append(this.brandColor);
        m.append(", shouldColorizeAvatar=");
        re$$ExternalSyntheticOutline0.m(m, this.shouldColorizeAvatar, ", shouldFillBackground=", this.shouldFillBackground, ", merchantToken=");
        m.append(this.merchantToken);
        m.append(", viewEvent=");
        m.append(this.viewEvent);
        m.append(", passiveAction=");
        m.append(this.passiveAction);
        m.append(", headerImageUrl=");
        m.append(this.headerImageUrl);
        m.append(", genericTreeElements=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(m, this.genericTreeElements, ")");
    }
}
