package app.cash.local.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.primitives.BrandToken;
import app.cash.local.viewmodels.sheet.MapDecisionSheetModel;
import app.cash.local.viewmodels.toasts.ToastData;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalText;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public abstract class LocalBrandProfileViewModel {

    public final class Content extends LocalBrandProfileViewModel {
        public final LocalBrandBannerModel banner;
        public final String brandToken;
        public final String cashtag;
        public final String description;
        public final Fulfillment fulfillment;
        public final FulfillmentOptionsMenuModel fulfillmentOptionsMenuModel;
        public final LocalImage heroImage;
        public final String invalidCouponToast;
        public final LocationStatus locationStatus;
        public final MapDecisionSheetModel mapDecisionSheet;
        public final List modals;
        public final MoreOptionsMenuModel moreOptionsMenuModel;
        public final String name;
        public final LocalColor overrideBackgroundColor;
        public final List sections;
        public final boolean showCheckedInSheet;
        public final boolean showOfferAppliedToast;
        public final ToastData showToastData;

        public Content(String str, LocalImage localImage, String str2, String str3, String str4, Fulfillment fulfillment, LocalBrandBannerModel localBrandBannerModel, LocationStatus locationStatus, List list, LocalColor localColor, MapDecisionSheetModel mapDecisionSheetModel, List list2, MoreOptionsMenuModel moreOptionsMenuModel, FulfillmentOptionsMenuModel fulfillmentOptionsMenuModel, ToastData toastData, boolean z, String str5, boolean z2, int i) {
            MapDecisionSheetModel mapDecisionSheetModel2 = (i & 1024) != 0 ? null : mapDecisionSheetModel;
            List list3 = (i & 2048) != 0 ? EmptyList.INSTANCE : list2;
            ToastData toastData2 = (i & 16384) != 0 ? null : toastData;
            boolean z3 = (32768 & i) != 0 ? false : z;
            String str6 = (65536 & i) == 0 ? str5 : null;
            boolean z4 = (i & PKIFailureInfo.unsupportedVersion) == 0 ? z2 : false;
            str.getClass();
            str2.getClass();
            list.getClass();
            list3.getClass();
            this.brandToken = str;
            this.heroImage = localImage;
            this.name = str2;
            this.cashtag = str3;
            this.description = str4;
            this.fulfillment = fulfillment;
            this.banner = localBrandBannerModel;
            this.locationStatus = locationStatus;
            this.sections = list;
            this.overrideBackgroundColor = localColor;
            this.mapDecisionSheet = mapDecisionSheetModel2;
            this.modals = list3;
            this.moreOptionsMenuModel = moreOptionsMenuModel;
            this.fulfillmentOptionsMenuModel = fulfillmentOptionsMenuModel;
            this.showToastData = toastData2;
            this.showOfferAppliedToast = z3;
            this.invalidCouponToast = str6;
            this.showCheckedInSheet = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.brandToken, content.brandToken) && Intrinsics.areEqual(this.heroImage, content.heroImage) && Intrinsics.areEqual(this.name, content.name) && Intrinsics.areEqual(this.cashtag, content.cashtag) && Intrinsics.areEqual(this.description, content.description) && Intrinsics.areEqual(this.fulfillment, content.fulfillment) && Intrinsics.areEqual(this.banner, content.banner) && this.locationStatus.equals(content.locationStatus) && Intrinsics.areEqual(this.sections, content.sections) && Intrinsics.areEqual(this.overrideBackgroundColor, content.overrideBackgroundColor) && Intrinsics.areEqual(this.mapDecisionSheet, content.mapDecisionSheet) && this.modals.equals(content.modals) && this.moreOptionsMenuModel.equals(content.moreOptionsMenuModel) && this.fulfillmentOptionsMenuModel.equals(content.fulfillmentOptionsMenuModel) && Intrinsics.areEqual(this.showToastData, content.showToastData) && this.showOfferAppliedToast == content.showOfferAppliedToast && Intrinsics.areEqual(this.invalidCouponToast, content.invalidCouponToast) && this.showCheckedInSheet == content.showCheckedInSheet;
        }

        public final int hashCode() {
            int hashCode = this.brandToken.hashCode() * 31;
            LocalImage localImage = this.heroImage;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (localImage == null ? 0 : localImage.hashCode())) * 31, 31, this.name);
            String str = this.cashtag;
            int hashCode2 = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Fulfillment fulfillment = this.fulfillment;
            int hashCode4 = (hashCode3 + (fulfillment == null ? 0 : fulfillment.hashCode())) * 31;
            LocalBrandBannerModel localBrandBannerModel = this.banner;
            int m2 = Recorder$$ExternalSyntheticOutline2.m((this.locationStatus.hashCode() + ((hashCode4 + (localBrandBannerModel == null ? 0 : localBrandBannerModel.hashCode())) * 31)) * 31, 31, this.sections);
            LocalColor localColor = this.overrideBackgroundColor;
            int hashCode5 = (m2 + (localColor == null ? 0 : localColor.hashCode())) * 31;
            MapDecisionSheetModel mapDecisionSheetModel = this.mapDecisionSheet;
            int hashCode6 = (this.fulfillmentOptionsMenuModel.hashCode() + ((this.moreOptionsMenuModel.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (mapDecisionSheetModel == null ? 0 : mapDecisionSheetModel.hashCode())) * 31, 31, this.modals)) * 31)) * 31;
            ToastData toastData = this.showToastData;
            int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode6 + (toastData == null ? 0 : toastData.hashCode())) * 31, 31, this.showOfferAppliedToast);
            String str3 = this.invalidCouponToast;
            return Boolean.hashCode(false) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.showCheckedInSheet), 31, false);
        }

        public final String toString() {
            String m1229toStringimpl = BrandToken.m1229toStringimpl(this.brandToken);
            StringBuilder sb = new StringBuilder("Content(brandToken=");
            sb.append(m1229toStringimpl);
            sb.append(", heroImage=");
            sb.append(this.heroImage);
            sb.append(", name=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.name, ", cashtag=", this.cashtag, ", description=");
            sb.append(this.description);
            sb.append(", fulfillment=");
            sb.append(this.fulfillment);
            sb.append(", banner=");
            sb.append(this.banner);
            sb.append(", locationStatus=");
            sb.append(this.locationStatus);
            sb.append(", sections=");
            sb.append(this.sections);
            sb.append(", overrideBackgroundColor=");
            sb.append(this.overrideBackgroundColor);
            sb.append(", mapDecisionSheet=");
            sb.append(this.mapDecisionSheet);
            sb.append(", modals=");
            sb.append(this.modals);
            sb.append(", moreOptionsMenuModel=");
            sb.append(this.moreOptionsMenuModel);
            sb.append(", fulfillmentOptionsMenuModel=");
            sb.append(this.fulfillmentOptionsMenuModel);
            sb.append(", showToastData=");
            sb.append(this.showToastData);
            sb.append(", showOfferAppliedToast=");
            sb.append(this.showOfferAppliedToast);
            sb.append(", invalidCouponToast=");
            return re$$ExternalSyntheticOutline0.m(sb, this.invalidCouponToast, ", showCheckedInSheet=", this.showCheckedInSheet, ", expandMoreOptionsByDefault=false, expandFulfillmentOptionsByDefault=false)");
        }
    }

    public interface Fulfillment {

        public interface Configured {
            String getAddress();

            LocalText getEstimatedCompletionTime();
        }

        public final class Delivery implements Fulfillment, Configured {
            public final String address;
            public final LocalText estimatedCompletionTime;
            public final String freeDeliveryThresholdLabel;

            public Delivery(LocalText localText, String str, String str2) {
                str.getClass();
                this.address = str;
                this.estimatedCompletionTime = localText;
                this.freeDeliveryThresholdLabel = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Delivery)) {
                    return false;
                }
                Delivery delivery = (Delivery) obj;
                return Intrinsics.areEqual(this.address, delivery.address) && Intrinsics.areEqual(this.estimatedCompletionTime, delivery.estimatedCompletionTime) && Intrinsics.areEqual(this.freeDeliveryThresholdLabel, delivery.freeDeliveryThresholdLabel);
            }

            @Override // app.cash.local.viewmodels.LocalBrandProfileViewModel.Fulfillment.Configured
            public final String getAddress() {
                return this.address;
            }

            @Override // app.cash.local.viewmodels.LocalBrandProfileViewModel.Fulfillment.Configured
            public final LocalText getEstimatedCompletionTime() {
                return this.estimatedCompletionTime;
            }

            public final int hashCode() {
                int hashCode = this.address.hashCode() * 31;
                LocalText localText = this.estimatedCompletionTime;
                int hashCode2 = (hashCode + (localText == null ? 0 : localText.hashCode())) * 31;
                String str = this.freeDeliveryThresholdLabel;
                return hashCode2 + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Delivery(address=");
                sb.append(this.address);
                sb.append(", estimatedCompletionTime=");
                sb.append(this.estimatedCompletionTime);
                sb.append(", freeDeliveryThresholdLabel=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.freeDeliveryThresholdLabel, ")");
            }
        }

        public final class InStore implements Fulfillment {
            public final Color customerProfileBackgroundColor;
            public final String customerProfileMonogram;
            public final String customerProfilePhotoUrl;
            public final String title;

            public InStore(String str, String str2, String str3, Color color) {
                this.title = str;
                this.customerProfilePhotoUrl = str2;
                this.customerProfileMonogram = str3;
                this.customerProfileBackgroundColor = color;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InStore)) {
                    return false;
                }
                InStore inStore = (InStore) obj;
                return this.title.equals(inStore.title) && Intrinsics.areEqual(this.customerProfilePhotoUrl, inStore.customerProfilePhotoUrl) && Intrinsics.areEqual(this.customerProfileMonogram, inStore.customerProfileMonogram) && Intrinsics.areEqual(this.customerProfileBackgroundColor, inStore.customerProfileBackgroundColor);
            }

            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.customerProfilePhotoUrl;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.customerProfileMonogram;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Color color = this.customerProfileBackgroundColor;
                return hashCode3 + (color != null ? color.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InStore(title=", this.title, ", customerProfilePhotoUrl=", this.customerProfilePhotoUrl, ", customerProfileMonogram=");
                m.append(this.customerProfileMonogram);
                m.append(", customerProfileBackgroundColor=");
                m.append(this.customerProfileBackgroundColor);
                m.append(")");
                return m.toString();
            }
        }

        public final class Pickup implements Fulfillment, Configured {
            public final String address;
            public final LocalText estimatedCompletionTime;

            public Pickup(String str, LocalText localText) {
                this.address = str;
                this.estimatedCompletionTime = localText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Pickup)) {
                    return false;
                }
                Pickup pickup = (Pickup) obj;
                return this.address.equals(pickup.address) && Intrinsics.areEqual(this.estimatedCompletionTime, pickup.estimatedCompletionTime);
            }

            @Override // app.cash.local.viewmodels.LocalBrandProfileViewModel.Fulfillment.Configured
            public final String getAddress() {
                return this.address;
            }

            @Override // app.cash.local.viewmodels.LocalBrandProfileViewModel.Fulfillment.Configured
            public final LocalText getEstimatedCompletionTime() {
                return this.estimatedCompletionTime;
            }

            public final int hashCode() {
                int hashCode = this.address.hashCode() * 31;
                LocalText localText = this.estimatedCompletionTime;
                return hashCode + (localText == null ? 0 : localText.hashCode());
            }

            public final String toString() {
                return "Pickup(address=" + this.address + ", estimatedCompletionTime=" + this.estimatedCompletionTime + ")";
            }
        }

        public final class Unspecified implements Fulfillment {
            public final String message;

            public Unspecified(String str) {
                str.getClass();
                this.message = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Unspecified) && Intrinsics.areEqual(this.message, ((Unspecified) obj).message);
            }

            public final int hashCode() {
                return this.message.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unspecified(message=", this.message, ")");
            }
        }
    }

    public final class FulfillmentOptionsMenuModel {
        public final boolean canChangeFulfillment;
        public final boolean canChangeTable;
        public final boolean canGetDirections;
        public final boolean canResetFulfillmentToAsap;
        public final boolean canScheduleOrder;
        public final String changeFulfillmentLabel;
        public final String resetFulfillmentToAsapLabel;

        public FulfillmentOptionsMenuModel(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2) {
            str.getClass();
            str2.getClass();
            this.changeFulfillmentLabel = str;
            this.canGetDirections = z;
            this.canChangeFulfillment = z2;
            this.canChangeTable = z3;
            this.canScheduleOrder = z4;
            this.canResetFulfillmentToAsap = z5;
            this.resetFulfillmentToAsapLabel = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FulfillmentOptionsMenuModel)) {
                return false;
            }
            FulfillmentOptionsMenuModel fulfillmentOptionsMenuModel = (FulfillmentOptionsMenuModel) obj;
            return Intrinsics.areEqual(this.changeFulfillmentLabel, fulfillmentOptionsMenuModel.changeFulfillmentLabel) && this.canGetDirections == fulfillmentOptionsMenuModel.canGetDirections && this.canChangeFulfillment == fulfillmentOptionsMenuModel.canChangeFulfillment && this.canChangeTable == fulfillmentOptionsMenuModel.canChangeTable && this.canScheduleOrder == fulfillmentOptionsMenuModel.canScheduleOrder && this.canResetFulfillmentToAsap == fulfillmentOptionsMenuModel.canResetFulfillmentToAsap && Intrinsics.areEqual(this.resetFulfillmentToAsapLabel, fulfillmentOptionsMenuModel.resetFulfillmentToAsapLabel);
        }

        public final int hashCode() {
            return this.resetFulfillmentToAsapLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.changeFulfillmentLabel.hashCode() * 31, 31, this.canGetDirections), 31, this.canChangeFulfillment), 31, this.canChangeTable), 31, this.canScheduleOrder), 31, this.canResetFulfillmentToAsap);
        }

        public final String toString() {
            StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("FulfillmentOptionsMenuModel(changeFulfillmentLabel=", this.changeFulfillmentLabel, ", canGetDirections=", ", canChangeFulfillment=", this.canGetDirections);
            re$$ExternalSyntheticOutline0.m(m1540m, this.canChangeFulfillment, ", canChangeTable=", this.canChangeTable, ", canScheduleOrder=");
            re$$ExternalSyntheticOutline0.m(m1540m, this.canScheduleOrder, ", canResetFulfillmentToAsap=", this.canResetFulfillmentToAsap, ", resetFulfillmentToAsapLabel=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m1540m, this.resetFulfillmentToAsapLabel, ")");
        }
    }

    public final class Loading extends LocalBrandProfileViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1969990867;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class LoyaltyModel implements LocalBrandProfileSectionContent {
        public final String currentPoints;
        public final ArrayList tiers;
        public final String title;

        public final class Tier {
            public final String label;
            public final Float percentComplete;
            public final String pointsNeeded;

            public Tier(String str, String str2, Float f) {
                this.label = str;
                this.pointsNeeded = str2;
                this.percentComplete = f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Tier)) {
                    return false;
                }
                Tier tier = (Tier) obj;
                return this.label.equals(tier.label) && this.pointsNeeded.equals(tier.pointsNeeded) && Intrinsics.areEqual((Object) this.percentComplete, (Object) tier.percentComplete);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 31, this.pointsNeeded);
                Float f = this.percentComplete;
                return m + (f == null ? 0 : f.hashCode());
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Tier(label=", this.label, ", pointsNeeded=", this.pointsNeeded, ", percentComplete=");
                m.append(this.percentComplete);
                m.append(")");
                return m.toString();
            }
        }

        public LoyaltyModel(String str, String str2, ArrayList arrayList) {
            str.getClass();
            this.title = str;
            this.currentPoints = str2;
            this.tiers = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoyaltyModel)) {
                return false;
            }
            LoyaltyModel loyaltyModel = (LoyaltyModel) obj;
            return Intrinsics.areEqual(this.title, loyaltyModel.title) && this.currentPoints.equals(loyaltyModel.currentPoints) && this.tiers.equals(loyaltyModel.tiers);
        }

        public final int hashCode() {
            return this.tiers.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.currentPoints);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline1.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LoyaltyModel(title=", this.title, ", currentPoints=", this.currentPoints, ", tiers="), this.tiers);
        }
    }

    public final class MoreOptionsMenuModel {
        public final BrandFollowViewModel addRemoveState;
        public final boolean showShareProfileOption;

        public MoreOptionsMenuModel(BrandFollowViewModel brandFollowViewModel, boolean z) {
            brandFollowViewModel.getClass();
            this.addRemoveState = brandFollowViewModel;
            this.showShareProfileOption = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoreOptionsMenuModel)) {
                return false;
            }
            MoreOptionsMenuModel moreOptionsMenuModel = (MoreOptionsMenuModel) obj;
            return Intrinsics.areEqual(this.addRemoveState, moreOptionsMenuModel.addRemoveState) && this.showShareProfileOption == moreOptionsMenuModel.showShareProfileOption;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showShareProfileOption) + (this.addRemoveState.hashCode() * 31);
        }

        public final String toString() {
            return "MoreOptionsMenuModel(addRemoveState=" + this.addRemoveState + ", showShareProfileOption=" + this.showShareProfileOption + ")";
        }
    }
}
