package com.squareup.cash.shopping.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.shopping.screens.IabMetadata;
import com.squareup.cash.shopping.settings.screens.ErrorScreen;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class ShoppingWebScreen implements Screen {

    /* loaded from: classes7.dex */
    public final class AffiliateShoppingScreen extends ShoppingWebScreen {
        public static final Parcelable.Creator<AffiliateShoppingScreen> CREATOR = new ErrorScreen.Creator(2);
        public final String discountText;
        public final String merchantToken;
        public final String rewardToken;
        public final ShoppingScreenContext screenContext;
        public final String url;
        public final String userAgent;

        public AffiliateShoppingScreen(String str, ShoppingScreenContext shoppingScreenContext, String str2, String str3, String str4, String str5) {
            str2.getClass();
            str3.getClass();
            this.url = str;
            this.screenContext = shoppingScreenContext;
            this.discountText = str2;
            this.rewardToken = str3;
            this.merchantToken = str4;
            this.userAgent = str5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AffiliateShoppingScreen)) {
                return false;
            }
            AffiliateShoppingScreen affiliateShoppingScreen = (AffiliateShoppingScreen) obj;
            return Intrinsics.areEqual(this.url, affiliateShoppingScreen.url) && Intrinsics.areEqual(this.screenContext, affiliateShoppingScreen.screenContext) && Intrinsics.areEqual(this.discountText, affiliateShoppingScreen.discountText) && Intrinsics.areEqual(this.rewardToken, affiliateShoppingScreen.rewardToken) && Intrinsics.areEqual(this.merchantToken, affiliateShoppingScreen.merchantToken) && Intrinsics.areEqual(this.userAgent, affiliateShoppingScreen.userAgent);
        }

        @Override // com.squareup.cash.shopping.screens.ShoppingWebScreen
        public final ShoppingScreenContext getScreenContext() {
            return this.screenContext;
        }

        @Override // com.squareup.cash.shopping.screens.ShoppingWebScreen
        public final String getUrl() {
            return this.url;
        }

        @Override // com.squareup.cash.shopping.screens.ShoppingWebScreen
        public final String getUserAgent() {
            return this.userAgent;
        }

        public final int hashCode() {
            String str = this.url;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            ShoppingScreenContext shoppingScreenContext = this.screenContext;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (shoppingScreenContext == null ? 0 : shoppingScreenContext.hashCode())) * 31, 31, this.discountText), 31, this.rewardToken);
            String str2 = this.merchantToken;
            int hashCode2 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.userAgent;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AffiliateShoppingScreen(url=");
            sb.append(this.url);
            sb.append(", screenContext=");
            sb.append(this.screenContext);
            sb.append(", discountText=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.discountText, ", rewardToken=", this.rewardToken, ", merchantToken=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.merchantToken, ", userAgent=", this.userAgent, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.url);
            parcel.writeParcelable(this.screenContext, i);
            parcel.writeString(this.discountText);
            parcel.writeString(this.rewardToken);
            parcel.writeString(this.merchantToken);
            parcel.writeString(this.userAgent);
        }
    }

    /* loaded from: classes7.dex */
    public final class AfterPayShoppingScreen extends ShoppingWebScreen {
        public static final Parcelable.Creator<AfterPayShoppingScreen> CREATOR = new ErrorScreen.Creator(3);
        public final ShoppingScreenContext screenContext;
        public final String url;
        public final String userAgent;

        public AfterPayShoppingScreen(String str, ShoppingScreenContext shoppingScreenContext, String str2) {
            this.url = str;
            this.screenContext = shoppingScreenContext;
            this.userAgent = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AfterPayShoppingScreen)) {
                return false;
            }
            AfterPayShoppingScreen afterPayShoppingScreen = (AfterPayShoppingScreen) obj;
            return Intrinsics.areEqual(this.url, afterPayShoppingScreen.url) && Intrinsics.areEqual(this.screenContext, afterPayShoppingScreen.screenContext) && Intrinsics.areEqual(this.userAgent, afterPayShoppingScreen.userAgent);
        }

        @Override // com.squareup.cash.shopping.screens.ShoppingWebScreen
        public final ShoppingScreenContext getScreenContext() {
            return this.screenContext;
        }

        @Override // com.squareup.cash.shopping.screens.ShoppingWebScreen
        public final String getUrl() {
            return this.url;
        }

        @Override // com.squareup.cash.shopping.screens.ShoppingWebScreen
        public final String getUserAgent() {
            return this.userAgent;
        }

        public final int hashCode() {
            String str = this.url;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            ShoppingScreenContext shoppingScreenContext = this.screenContext;
            int hashCode2 = (hashCode + (shoppingScreenContext == null ? 0 : shoppingScreenContext.hashCode())) * 31;
            String str2 = this.userAgent;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AfterPayShoppingScreen(url=");
            sb.append(this.url);
            sb.append(", screenContext=");
            sb.append(this.screenContext);
            sb.append(", userAgent=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.userAgent, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.url);
            parcel.writeParcelable(this.screenContext, i);
            parcel.writeString(this.userAgent);
        }
    }

    /* loaded from: classes7.dex */
    public final class IncentiveShoppingScreen extends ShoppingWebScreen {
        public static final Parcelable.Creator<IncentiveShoppingScreen> CREATOR = new ErrorScreen.Creator(4);
        public final String cashAppPayButtonSelector;
        public final String checkoutUrl;
        public final float discountAmount;
        public final String merchantToken;
        public final String offerToken;
        public final ShoppingScreenContext screenContext;
        public final String url;
        public final String userAgent;

        public IncentiveShoppingScreen(String str, ShoppingScreenContext shoppingScreenContext, String str2, float f, String str3, String str4, String str5, String str6) {
            this.url = str;
            this.screenContext = shoppingScreenContext;
            this.userAgent = str2;
            this.discountAmount = f;
            this.checkoutUrl = str3;
            this.cashAppPayButtonSelector = str4;
            this.merchantToken = str5;
            this.offerToken = str6;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IncentiveShoppingScreen)) {
                return false;
            }
            IncentiveShoppingScreen incentiveShoppingScreen = (IncentiveShoppingScreen) obj;
            return Intrinsics.areEqual(this.url, incentiveShoppingScreen.url) && Intrinsics.areEqual(this.screenContext, incentiveShoppingScreen.screenContext) && Intrinsics.areEqual(this.userAgent, incentiveShoppingScreen.userAgent) && Float.compare(this.discountAmount, incentiveShoppingScreen.discountAmount) == 0 && Intrinsics.areEqual(this.checkoutUrl, incentiveShoppingScreen.checkoutUrl) && Intrinsics.areEqual(this.cashAppPayButtonSelector, incentiveShoppingScreen.cashAppPayButtonSelector) && Intrinsics.areEqual(this.merchantToken, incentiveShoppingScreen.merchantToken) && Intrinsics.areEqual(this.offerToken, incentiveShoppingScreen.offerToken);
        }

        @Override // com.squareup.cash.shopping.screens.ShoppingWebScreen
        public final ShoppingScreenContext getScreenContext() {
            return this.screenContext;
        }

        @Override // com.squareup.cash.shopping.screens.ShoppingWebScreen
        public final String getUrl() {
            return this.url;
        }

        @Override // com.squareup.cash.shopping.screens.ShoppingWebScreen
        public final String getUserAgent() {
            return this.userAgent;
        }

        public final int hashCode() {
            String str = this.url;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            ShoppingScreenContext shoppingScreenContext = this.screenContext;
            int hashCode2 = (hashCode + (shoppingScreenContext == null ? 0 : shoppingScreenContext.hashCode())) * 31;
            String str2 = this.userAgent;
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.discountAmount, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
            String str3 = this.checkoutUrl;
            int hashCode3 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cashAppPayButtonSelector;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.merchantToken;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.offerToken;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IncentiveShoppingScreen(url=");
            sb.append(this.url);
            sb.append(", screenContext=");
            sb.append(this.screenContext);
            sb.append(", userAgent=");
            sb.append(this.userAgent);
            sb.append(", discountAmount=");
            sb.append(this.discountAmount);
            sb.append(", checkoutUrl=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.checkoutUrl, ", cashAppPayButtonSelector=", this.cashAppPayButtonSelector, ", merchantToken=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.merchantToken, ", offerToken=", this.offerToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.url);
            parcel.writeParcelable(this.screenContext, i);
            parcel.writeString(this.userAgent);
            parcel.writeFloat(this.discountAmount);
            parcel.writeString(this.checkoutUrl);
            parcel.writeString(this.cashAppPayButtonSelector);
            parcel.writeString(this.merchantToken);
            parcel.writeString(this.offerToken);
        }
    }

    /* loaded from: classes7.dex */
    public final class ShoppingWebScreenV2 extends ShoppingWebScreen {
        public static final Parcelable.Creator<ShoppingWebScreenV2> CREATOR = new ErrorScreen.Creator(5);
        public final InAppBrowserMetadata.EntityInformation entityInformation;
        public final IabMetadata metadata;
        public final ShoppingScreenContext screenContext;
        public final String url;
        public final String userAgent;

        public ShoppingWebScreenV2(String str, String str2, ShoppingScreenContext shoppingScreenContext, InAppBrowserMetadata.EntityInformation entityInformation, IabMetadata iabMetadata) {
            str.getClass();
            entityInformation.getClass();
            iabMetadata.getClass();
            this.url = str;
            this.userAgent = str2;
            this.screenContext = shoppingScreenContext;
            this.entityInformation = entityInformation;
            this.metadata = iabMetadata;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v2, types: [com.squareup.cash.shopping.screens.IabMetadata] */
        public static ShoppingWebScreenV2 copy$default(ShoppingWebScreenV2 shoppingWebScreenV2, String str, IabMetadata.SUPMetadata sUPMetadata, int i) {
            if ((i & 1) != 0) {
                str = shoppingWebScreenV2.url;
            }
            String str2 = str;
            String str3 = shoppingWebScreenV2.userAgent;
            ShoppingScreenContext shoppingScreenContext = shoppingWebScreenV2.screenContext;
            InAppBrowserMetadata.EntityInformation entityInformation = shoppingWebScreenV2.entityInformation;
            IabMetadata.SUPMetadata sUPMetadata2 = sUPMetadata;
            if ((i & 16) != 0) {
                sUPMetadata2 = shoppingWebScreenV2.metadata;
            }
            IabMetadata.SUPMetadata sUPMetadata3 = sUPMetadata2;
            shoppingWebScreenV2.getClass();
            str2.getClass();
            entityInformation.getClass();
            sUPMetadata3.getClass();
            return new ShoppingWebScreenV2(str2, str3, shoppingScreenContext, entityInformation, sUPMetadata3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShoppingWebScreenV2)) {
                return false;
            }
            ShoppingWebScreenV2 shoppingWebScreenV2 = (ShoppingWebScreenV2) obj;
            return Intrinsics.areEqual(this.url, shoppingWebScreenV2.url) && Intrinsics.areEqual(this.userAgent, shoppingWebScreenV2.userAgent) && Intrinsics.areEqual(this.screenContext, shoppingWebScreenV2.screenContext) && Intrinsics.areEqual(this.entityInformation, shoppingWebScreenV2.entityInformation) && Intrinsics.areEqual(this.metadata, shoppingWebScreenV2.metadata);
        }

        public final InAppBrowserMetadata.EntityInformation getEntityInformation() {
            return this.entityInformation;
        }

        @Override // com.squareup.cash.shopping.screens.ShoppingWebScreen
        public final ShoppingScreenContext getScreenContext() {
            return this.screenContext;
        }

        @Override // com.squareup.cash.shopping.screens.ShoppingWebScreen
        public final String getUrl() {
            return this.url;
        }

        @Override // com.squareup.cash.shopping.screens.ShoppingWebScreen
        public final String getUserAgent() {
            return this.userAgent;
        }

        public final int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            String str = this.userAgent;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            ShoppingScreenContext shoppingScreenContext = this.screenContext;
            return this.metadata.hashCode() + ((this.entityInformation.hashCode() + ((hashCode2 + (shoppingScreenContext != null ? shoppingScreenContext.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShoppingWebScreenV2(url=", this.url, ", userAgent=", this.userAgent, ", screenContext=");
            m.append(this.screenContext);
            m.append(", entityInformation=");
            m.append(this.entityInformation);
            m.append(", metadata=");
            m.append(this.metadata);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.url);
            parcel.writeString(this.userAgent);
            parcel.writeParcelable(this.screenContext, i);
            parcel.writeParcelable(this.entityInformation, i);
            parcel.writeParcelable(this.metadata, i);
        }
    }

    /* loaded from: classes7.dex */
    public final class SingleUsePaymentShoppingScreen extends ShoppingWebScreen {
        public static final Parcelable.Creator<SingleUsePaymentShoppingScreen> CREATOR = new ErrorScreen.Creator(6);
        public final String checkoutFlowEndResultData;
        public final String merchantId;
        public final String merchantName;
        public final ShoppingScreenContext screenContext;
        public final String url;
        public final String userAgent;

        public SingleUsePaymentShoppingScreen(String str, ShoppingScreenContext shoppingScreenContext, String str2, String str3, String str4, String str5) {
            str2.getClass();
            str3.getClass();
            this.url = str;
            this.screenContext = shoppingScreenContext;
            this.merchantId = str2;
            this.merchantName = str3;
            this.checkoutFlowEndResultData = str4;
            this.userAgent = str5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SingleUsePaymentShoppingScreen)) {
                return false;
            }
            SingleUsePaymentShoppingScreen singleUsePaymentShoppingScreen = (SingleUsePaymentShoppingScreen) obj;
            return Intrinsics.areEqual(this.url, singleUsePaymentShoppingScreen.url) && Intrinsics.areEqual(this.screenContext, singleUsePaymentShoppingScreen.screenContext) && Intrinsics.areEqual(this.merchantId, singleUsePaymentShoppingScreen.merchantId) && Intrinsics.areEqual(this.merchantName, singleUsePaymentShoppingScreen.merchantName) && Intrinsics.areEqual(this.checkoutFlowEndResultData, singleUsePaymentShoppingScreen.checkoutFlowEndResultData) && Intrinsics.areEqual(this.userAgent, singleUsePaymentShoppingScreen.userAgent);
        }

        @Override // com.squareup.cash.shopping.screens.ShoppingWebScreen
        public final ShoppingScreenContext getScreenContext() {
            return this.screenContext;
        }

        @Override // com.squareup.cash.shopping.screens.ShoppingWebScreen
        public final String getUrl() {
            return this.url;
        }

        @Override // com.squareup.cash.shopping.screens.ShoppingWebScreen
        public final String getUserAgent() {
            return this.userAgent;
        }

        public final int hashCode() {
            String str = this.url;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            ShoppingScreenContext shoppingScreenContext = this.screenContext;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (shoppingScreenContext == null ? 0 : shoppingScreenContext.hashCode())) * 31, 31, this.merchantId), 31, this.merchantName);
            String str2 = this.checkoutFlowEndResultData;
            int hashCode2 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.userAgent;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SingleUsePaymentShoppingScreen(url=");
            sb.append(this.url);
            sb.append(", screenContext=");
            sb.append(this.screenContext);
            sb.append(", merchantId=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.merchantId, ", merchantName=", this.merchantName, ", checkoutFlowEndResultData=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.checkoutFlowEndResultData, ", userAgent=", this.userAgent, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.url);
            parcel.writeParcelable(this.screenContext, i);
            parcel.writeString(this.merchantId);
            parcel.writeString(this.merchantName);
            parcel.writeString(this.checkoutFlowEndResultData);
            parcel.writeString(this.userAgent);
        }
    }

    public abstract ShoppingScreenContext getScreenContext();

    public abstract String getUrl();

    public abstract String getUserAgent();
}
