package com.squareup.cash.clientrouting.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.cdf.BlockerFlowReferrerType;
import com.squareup.cash.cdf.asset.Origin;
import com.squareup.cash.cdf.browser.EntityType;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.franklin.app.AppCreationActivity;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class AnalyticsParams implements Parcelable {

    public final class GenericTreeElementsParams extends AnalyticsParams {
        public static final Parcelable.Creator<GenericTreeElementsParams> CREATOR = new RoutingParams.Creator(5);
        public final String entityToken;
        public final String queryToken;
        public final String referrerFlowToken;

        public GenericTreeElementsParams(String str, String str2, String str3) {
            str.getClass();
            this.entityToken = str;
            this.referrerFlowToken = str2;
            this.queryToken = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenericTreeElementsParams)) {
                return false;
            }
            GenericTreeElementsParams genericTreeElementsParams = (GenericTreeElementsParams) obj;
            return Intrinsics.areEqual(this.entityToken, genericTreeElementsParams.entityToken) && Intrinsics.areEqual(this.referrerFlowToken, genericTreeElementsParams.referrerFlowToken) && Intrinsics.areEqual(this.queryToken, genericTreeElementsParams.queryToken);
        }

        public final int hashCode() {
            int hashCode = this.entityToken.hashCode() * 31;
            String str = this.referrerFlowToken;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.queryToken;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GenericTreeElementsParams(entityToken=", this.entityToken, ", referrerFlowToken=", this.referrerFlowToken, ", queryToken="), this.queryToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.entityToken);
            parcel.writeString(this.referrerFlowToken);
            parcel.writeString(this.queryToken);
        }
    }

    public final class GlobalSearchAnalyticsParams extends AnalyticsParams {
        public static final Parcelable.Creator<GlobalSearchAnalyticsParams> CREATOR = new RoutingParams.Creator(6);
        public final GetProfileDetailsContext currentFlow;
        public final UUID externalId;
        public final String queryToken;
        public final UUID searchToken;

        public GlobalSearchAnalyticsParams(UUID uuid, GetProfileDetailsContext getProfileDetailsContext, UUID uuid2, String str) {
            uuid.getClass();
            getProfileDetailsContext.getClass();
            uuid2.getClass();
            this.externalId = uuid;
            this.currentFlow = getProfileDetailsContext;
            this.searchToken = uuid2;
            this.queryToken = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GlobalSearchAnalyticsParams)) {
                return false;
            }
            GlobalSearchAnalyticsParams globalSearchAnalyticsParams = (GlobalSearchAnalyticsParams) obj;
            return Intrinsics.areEqual(this.externalId, globalSearchAnalyticsParams.externalId) && this.currentFlow == globalSearchAnalyticsParams.currentFlow && Intrinsics.areEqual(this.searchToken, globalSearchAnalyticsParams.searchToken) && Intrinsics.areEqual(this.queryToken, globalSearchAnalyticsParams.queryToken);
        }

        public final int hashCode() {
            int hashCode = (this.searchToken.hashCode() + ((this.currentFlow.hashCode() + (this.externalId.hashCode() * 31)) * 31)) * 31;
            String str = this.queryToken;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "GlobalSearchAnalyticsParams(externalId=" + this.externalId + ", currentFlow=" + this.currentFlow + ", searchToken=" + this.searchToken + ", queryToken=" + this.queryToken + ")";
        }

        public final RouteAnalyticsParams$ViewPayCashtagAnalyticsParams toViewPayCashtagAnalyticsParams() {
            AppCreationActivity appCreationActivity = AppCreationActivity.HOMESCREEN;
            Origin origin = Origin.CUSTOMER_PROFILE_FAVORITES;
            return new RouteAnalyticsParams$ViewPayCashtagAnalyticsParams(appCreationActivity, this.externalId);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.externalId);
            parcel.writeString(this.currentFlow.name());
            parcel.writeSerializable(this.searchToken);
            parcel.writeString(this.queryToken);
        }
    }

    public final class InAppNotificationParams extends AnalyticsParams {
        public static final Parcelable.Creator<InAppNotificationParams> CREATOR = new RoutingParams.Creator(7);
        public final String messageToken;

        public InAppNotificationParams(String str) {
            str.getClass();
            this.messageToken = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InAppNotificationParams) && Intrinsics.areEqual(this.messageToken, ((InAppNotificationParams) obj).messageToken);
        }

        public final int hashCode() {
            return this.messageToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InAppNotificationParams(messageToken=", this.messageToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.messageToken);
        }
    }

    public final class OffersSearchMode extends AnalyticsParams {
        public static final OffersSearchMode INSTANCE = new OffersSearchMode();
        public static final Parcelable.Creator<OffersSearchMode> CREATOR = new RoutingParams.Creator(8);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OffersSearchMode);
        }

        public final int hashCode() {
            return -419426127;
        }

        public final String toString() {
            return "OffersSearchMode";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public final class OffersTabAnalyticsParams extends AnalyticsParams {
        public static final Parcelable.Creator<OffersTabAnalyticsParams> CREATOR = new RoutingParams.Creator(9);
        public final String flowToken;
        public final boolean isSearchMode;

        public OffersTabAnalyticsParams(String str, boolean z) {
            str.getClass();
            this.flowToken = str;
            this.isSearchMode = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OffersTabAnalyticsParams)) {
                return false;
            }
            OffersTabAnalyticsParams offersTabAnalyticsParams = (OffersTabAnalyticsParams) obj;
            return Intrinsics.areEqual(this.flowToken, offersTabAnalyticsParams.flowToken) && this.isSearchMode == offersTabAnalyticsParams.isSearchMode;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isSearchMode) + (this.flowToken.hashCode() * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("OffersTabAnalyticsParams(flowToken=", this.flowToken, ", isSearchMode=", ")", this.isSearchMode);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.flowToken);
            parcel.writeInt(this.isSearchMode ? 1 : 0);
        }
    }

    public final class PaymentAnalyticsParams extends AnalyticsParams {
        public static final Parcelable.Creator<PaymentAnalyticsParams> CREATOR = new RoutingParams.Creator(10);
        public final String entityToken;

        public PaymentAnalyticsParams(String str) {
            str.getClass();
            this.entityToken = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentAnalyticsParams) && Intrinsics.areEqual(this.entityToken, ((PaymentAnalyticsParams) obj).entityToken);
        }

        public final int hashCode() {
            return this.entityToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PaymentAnalyticsParams(entityToken=", this.entityToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.entityToken);
        }
    }

    public final class ShopHubAnalyticsParams extends AnalyticsParams {
        public static final Parcelable.Creator<ShopHubAnalyticsParams> CREATOR = new RoutingParams.Creator(11);
        public final String businessName;
        public final String businessToken;
        public final String entityName;
        public final String entityToken;
        public final EntityType entityType;
        public final String referrerFlowToken;
        public final String shopFlowToken;

        public ShopHubAnalyticsParams(String str, String str2, String str3, String str4, EntityType entityType, String str5, String str6) {
            str.getClass();
            this.shopFlowToken = str;
            this.referrerFlowToken = str2;
            this.entityName = str3;
            this.entityToken = str4;
            this.entityType = entityType;
            this.businessName = str5;
            this.businessToken = str6;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShopHubAnalyticsParams)) {
                return false;
            }
            ShopHubAnalyticsParams shopHubAnalyticsParams = (ShopHubAnalyticsParams) obj;
            return Intrinsics.areEqual(this.shopFlowToken, shopHubAnalyticsParams.shopFlowToken) && Intrinsics.areEqual(this.referrerFlowToken, shopHubAnalyticsParams.referrerFlowToken) && Intrinsics.areEqual(this.entityName, shopHubAnalyticsParams.entityName) && Intrinsics.areEqual(this.entityToken, shopHubAnalyticsParams.entityToken) && this.entityType == shopHubAnalyticsParams.entityType && Intrinsics.areEqual(this.businessName, shopHubAnalyticsParams.businessName) && Intrinsics.areEqual(this.businessToken, shopHubAnalyticsParams.businessToken);
        }

        public final int hashCode() {
            int hashCode = this.shopFlowToken.hashCode() * 31;
            String str = this.referrerFlowToken;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.entityName;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.entityToken;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            EntityType entityType = this.entityType;
            int hashCode5 = (hashCode4 + (entityType == null ? 0 : entityType.hashCode())) * 31;
            String str4 = this.businessName;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.businessToken;
            return hashCode6 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShopHubAnalyticsParams(shopFlowToken=", this.shopFlowToken, ", referrerFlowToken=", this.referrerFlowToken, ", entityName=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.entityName, ", entityToken=", this.entityToken, ", entityType=");
            m.append(this.entityType);
            m.append(", businessName=");
            m.append(this.businessName);
            m.append(", businessToken=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.businessToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.shopFlowToken);
            parcel.writeString(this.referrerFlowToken);
            parcel.writeString(this.entityName);
            parcel.writeString(this.entityToken);
            EntityType entityType = this.entityType;
            if (entityType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(entityType.name());
            }
            parcel.writeString(this.businessName);
            parcel.writeString(this.businessToken);
        }
    }

    public final class SupportAnalyticsParams extends AnalyticsParams {
        public static final Parcelable.Creator<SupportAnalyticsParams> CREATOR = new RoutingParams.Creator(12);
        public final String flowToken;

        public SupportAnalyticsParams(String str) {
            this.flowToken = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SupportAnalyticsParams) && Intrinsics.areEqual(this.flowToken, ((SupportAnalyticsParams) obj).flowToken);
        }

        public final int hashCode() {
            String str = this.flowToken;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SupportAnalyticsParams(flowToken=", this.flowToken, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.flowToken);
        }
    }

    public final class GenericAnalyticsParams extends AnalyticsParams {
        public static final Parcelable.Creator<GenericAnalyticsParams> CREATOR = new RoutingParams.Creator(4);
        public final String fromScreen;
        public final String fromSection;
        public final String referrerFlowToken;
        public final BlockerFlowReferrerType referrerFlowType;

        public GenericAnalyticsParams(String str, BlockerFlowReferrerType blockerFlowReferrerType, String str2, String str3) {
            this.referrerFlowToken = str;
            this.referrerFlowType = blockerFlowReferrerType;
            this.fromScreen = str2;
            this.fromSection = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenericAnalyticsParams)) {
                return false;
            }
            GenericAnalyticsParams genericAnalyticsParams = (GenericAnalyticsParams) obj;
            return Intrinsics.areEqual(this.referrerFlowToken, genericAnalyticsParams.referrerFlowToken) && this.referrerFlowType == genericAnalyticsParams.referrerFlowType && Intrinsics.areEqual(this.fromScreen, genericAnalyticsParams.fromScreen) && Intrinsics.areEqual(this.fromSection, genericAnalyticsParams.fromSection);
        }

        public final int hashCode() {
            String str = this.referrerFlowToken;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            BlockerFlowReferrerType blockerFlowReferrerType = this.referrerFlowType;
            int hashCode2 = (hashCode + (blockerFlowReferrerType == null ? 0 : blockerFlowReferrerType.hashCode())) * 31;
            String str2 = this.fromScreen;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.fromSection;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GenericAnalyticsParams(referrerFlowToken=");
            sb.append(this.referrerFlowToken);
            sb.append(", referrerFlowType=");
            sb.append(this.referrerFlowType);
            sb.append(", fromScreen=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.fromScreen, ", fromSection=", this.fromSection, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.referrerFlowToken);
            BlockerFlowReferrerType blockerFlowReferrerType = this.referrerFlowType;
            if (blockerFlowReferrerType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(blockerFlowReferrerType.name());
            }
            parcel.writeString(this.fromScreen);
            parcel.writeString(this.fromSection);
        }

        public /* synthetic */ GenericAnalyticsParams(String str, String str2, String str3, int i) {
            this(str, (BlockerFlowReferrerType) null, str2, (i & 8) != 0 ? null : str3);
        }
    }
}
