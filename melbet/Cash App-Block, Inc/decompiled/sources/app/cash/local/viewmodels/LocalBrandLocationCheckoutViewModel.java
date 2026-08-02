package app.cash.local.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.GpsCoordinates;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import app.cash.local.viewmodels.OrderBuilderModel;
import app.cash.local.viewmodels.internal.CanWorkAsync;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalText;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class LocalBrandLocationCheckoutViewModel implements CanWorkAsync {
    public final String address;
    public final GpsCoordinates addressCoordinates;
    public final List availableFulfillmentTypes;
    public final List banners;
    public final LocalImage brandImage;
    public final String brandName;
    public final OrderBuilderModel.BuyerInfo.UiReady buyerInfo;
    public final CouponSection couponSection;
    public final CurbsidePickupSection curbsidePickupSection;
    public final boolean detailsExpanded;
    public final LocalText estimatedCompletionTime;
    public final String estimatedCompletionTitle;
    public final List extraLines;
    public final LocalBrandLocationCartViewModel.Fulfillment fulfillment;
    public final LocalCheckoutGiftCardSectionViewModel giftCardSection;
    public final boolean isWorkingAsync;
    public final LocalBottomModalViewModel modal;
    public final LocalCheckoutSpecialInstructionsViewModel notes;
    public final LocalCheckoutOrderSummaryViewModel orderSummary;
    public final OrderBuilderModel.OrderType orderType;
    public final LocalCheckoutPaymentSectionViewModel paymentSection;
    public final String policies;
    public final ReviewMode reviewMode;
    public final List selections;
    public final String summaryItemCount;
    public final LocalCheckoutTipSectionViewModel tipSection;

    public final class CurbsidePickupSection {
        public final boolean isSelected;
        public final String vehicleDescription;

        public CurbsidePickupSection(boolean z, String str) {
            this.isSelected = z;
            this.vehicleDescription = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurbsidePickupSection)) {
                return false;
            }
            CurbsidePickupSection curbsidePickupSection = (CurbsidePickupSection) obj;
            return this.isSelected == curbsidePickupSection.isSelected && Intrinsics.areEqual(this.vehicleDescription, curbsidePickupSection.vehicleDescription);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.isSelected) * 31;
            String str = this.vehicleDescription;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "CurbsidePickupSection(isSelected=" + this.isSelected + ", vehicleDescription=" + this.vehicleDescription + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ReviewMode {
        public static final /* synthetic */ ReviewMode[] $VALUES;
        public static final ReviewMode IN_STORE_OPEN_TAB;
        public static final ReviewMode STANDARD;

        static {
            ReviewMode reviewMode = new ReviewMode("STANDARD", 0);
            STANDARD = reviewMode;
            ReviewMode reviewMode2 = new ReviewMode("IN_STORE_OPEN_TAB", 1);
            IN_STORE_OPEN_TAB = reviewMode2;
            $VALUES = new ReviewMode[]{reviewMode, reviewMode2};
        }

        public static ReviewMode valueOf(String str) {
            return (ReviewMode) Enum.valueOf(ReviewMode.class, str);
        }

        public static ReviewMode[] values() {
            return (ReviewMode[]) $VALUES.clone();
        }
    }

    public LocalBrandLocationCheckoutViewModel(List list, String str, LocalText localText, LocalBrandLocationCartViewModel.Fulfillment fulfillment, List list2, OrderBuilderModel.BuyerInfo.UiReady uiReady, String str2, LocalImage localImage, String str3, GpsCoordinates gpsCoordinates, String str4, List list3, List list4, LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel, LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel, LocalCheckoutGiftCardSectionViewModel localCheckoutGiftCardSectionViewModel, LocalCheckoutTipSectionViewModel localCheckoutTipSectionViewModel, OrderBuilderModel.OrderType orderType, ReviewMode reviewMode, CurbsidePickupSection curbsidePickupSection, LocalBottomModalViewModel localBottomModalViewModel, LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel, String str5, CouponSection couponSection, boolean z, int i) {
        fulfillment = (i & 8) != 0 ? null : fulfillment;
        List list5 = (i & 16) != 0 ? EmptyList.INSTANCE : list2;
        LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel2 = (i & PKIFailureInfo.certRevoked) != 0 ? null : localCheckoutOrderSummaryViewModel;
        LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel2 = (i & 16384) != 0 ? null : localCheckoutPaymentSectionViewModel;
        LocalCheckoutGiftCardSectionViewModel localCheckoutGiftCardSectionViewModel2 = (32768 & i) != 0 ? null : localCheckoutGiftCardSectionViewModel;
        LocalCheckoutTipSectionViewModel localCheckoutTipSectionViewModel2 = (65536 & i) != 0 ? null : localCheckoutTipSectionViewModel;
        ReviewMode reviewMode2 = (262144 & i) != 0 ? ReviewMode.STANDARD : reviewMode;
        String str6 = (4194304 & i) != 0 ? null : str5;
        CouponSection couponSection2 = (i & 8388608) == 0 ? couponSection : null;
        list.getClass();
        list5.getClass();
        list3.getClass();
        list4.getClass();
        orderType.getClass();
        this.banners = list;
        this.estimatedCompletionTitle = str;
        this.estimatedCompletionTime = localText;
        this.fulfillment = fulfillment;
        this.availableFulfillmentTypes = list5;
        this.buyerInfo = uiReady;
        this.brandName = str2;
        this.brandImage = localImage;
        this.address = str3;
        this.addressCoordinates = gpsCoordinates;
        this.summaryItemCount = str4;
        this.selections = list3;
        this.extraLines = list4;
        this.orderSummary = localCheckoutOrderSummaryViewModel2;
        this.paymentSection = localCheckoutPaymentSectionViewModel2;
        this.giftCardSection = localCheckoutGiftCardSectionViewModel2;
        this.tipSection = localCheckoutTipSectionViewModel2;
        this.orderType = orderType;
        this.reviewMode = reviewMode2;
        this.curbsidePickupSection = curbsidePickupSection;
        this.modal = localBottomModalViewModel;
        this.notes = localCheckoutSpecialInstructionsViewModel;
        this.policies = str6;
        this.couponSection = couponSection2;
        this.detailsExpanded = true;
        this.isWorkingAsync = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalBrandLocationCheckoutViewModel)) {
            return false;
        }
        LocalBrandLocationCheckoutViewModel localBrandLocationCheckoutViewModel = (LocalBrandLocationCheckoutViewModel) obj;
        return Intrinsics.areEqual(this.banners, localBrandLocationCheckoutViewModel.banners) && Intrinsics.areEqual(this.estimatedCompletionTitle, localBrandLocationCheckoutViewModel.estimatedCompletionTitle) && Intrinsics.areEqual(this.estimatedCompletionTime, localBrandLocationCheckoutViewModel.estimatedCompletionTime) && Intrinsics.areEqual(this.fulfillment, localBrandLocationCheckoutViewModel.fulfillment) && Intrinsics.areEqual(this.availableFulfillmentTypes, localBrandLocationCheckoutViewModel.availableFulfillmentTypes) && Intrinsics.areEqual(this.buyerInfo, localBrandLocationCheckoutViewModel.buyerInfo) && Intrinsics.areEqual(this.brandName, localBrandLocationCheckoutViewModel.brandName) && Intrinsics.areEqual(this.brandImage, localBrandLocationCheckoutViewModel.brandImage) && Intrinsics.areEqual(this.address, localBrandLocationCheckoutViewModel.address) && Intrinsics.areEqual(this.addressCoordinates, localBrandLocationCheckoutViewModel.addressCoordinates) && Intrinsics.areEqual(this.summaryItemCount, localBrandLocationCheckoutViewModel.summaryItemCount) && Intrinsics.areEqual(this.selections, localBrandLocationCheckoutViewModel.selections) && Intrinsics.areEqual(this.extraLines, localBrandLocationCheckoutViewModel.extraLines) && Intrinsics.areEqual(this.orderSummary, localBrandLocationCheckoutViewModel.orderSummary) && Intrinsics.areEqual(this.paymentSection, localBrandLocationCheckoutViewModel.paymentSection) && Intrinsics.areEqual(this.giftCardSection, localBrandLocationCheckoutViewModel.giftCardSection) && Intrinsics.areEqual(this.tipSection, localBrandLocationCheckoutViewModel.tipSection) && Intrinsics.areEqual(this.orderType, localBrandLocationCheckoutViewModel.orderType) && this.reviewMode == localBrandLocationCheckoutViewModel.reviewMode && Intrinsics.areEqual(this.curbsidePickupSection, localBrandLocationCheckoutViewModel.curbsidePickupSection) && Intrinsics.areEqual(this.modal, localBrandLocationCheckoutViewModel.modal) && Intrinsics.areEqual(this.notes, localBrandLocationCheckoutViewModel.notes) && Intrinsics.areEqual(this.policies, localBrandLocationCheckoutViewModel.policies) && Intrinsics.areEqual(this.couponSection, localBrandLocationCheckoutViewModel.couponSection) && this.detailsExpanded == localBrandLocationCheckoutViewModel.detailsExpanded && this.isWorkingAsync == localBrandLocationCheckoutViewModel.isWorkingAsync;
    }

    public final int hashCode() {
        int hashCode = this.banners.hashCode() * 31;
        String str = this.estimatedCompletionTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        LocalText localText = this.estimatedCompletionTime;
        int hashCode3 = (hashCode2 + (localText == null ? 0 : localText.hashCode())) * 31;
        LocalBrandLocationCartViewModel.Fulfillment fulfillment = this.fulfillment;
        int hashCode4 = (this.buyerInfo.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (fulfillment == null ? 0 : fulfillment.hashCode())) * 31, 31, this.availableFulfillmentTypes)) * 31;
        String str2 = this.brandName;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalImage localImage = this.brandImage;
        int hashCode6 = (hashCode5 + (localImage == null ? 0 : localImage.hashCode())) * 31;
        String str3 = this.address;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        GpsCoordinates gpsCoordinates = this.addressCoordinates;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode7 + (gpsCoordinates == null ? 0 : gpsCoordinates.hashCode())) * 31, 31, this.summaryItemCount), 31, this.selections), 31, this.extraLines);
        LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel = this.orderSummary;
        int hashCode8 = (m + (localCheckoutOrderSummaryViewModel == null ? 0 : localCheckoutOrderSummaryViewModel.hashCode())) * 31;
        LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel = this.paymentSection;
        int hashCode9 = (hashCode8 + (localCheckoutPaymentSectionViewModel == null ? 0 : localCheckoutPaymentSectionViewModel.hashCode())) * 31;
        LocalCheckoutGiftCardSectionViewModel localCheckoutGiftCardSectionViewModel = this.giftCardSection;
        int hashCode10 = (hashCode9 + (localCheckoutGiftCardSectionViewModel == null ? 0 : localCheckoutGiftCardSectionViewModel.hashCode())) * 31;
        LocalCheckoutTipSectionViewModel localCheckoutTipSectionViewModel = this.tipSection;
        int hashCode11 = (this.reviewMode.hashCode() + ((this.orderType.hashCode() + ((hashCode10 + (localCheckoutTipSectionViewModel == null ? 0 : localCheckoutTipSectionViewModel.hashCode())) * 31)) * 31)) * 31;
        CurbsidePickupSection curbsidePickupSection = this.curbsidePickupSection;
        int hashCode12 = (hashCode11 + (curbsidePickupSection == null ? 0 : curbsidePickupSection.hashCode())) * 31;
        LocalBottomModalViewModel localBottomModalViewModel = this.modal;
        int hashCode13 = (hashCode12 + (localBottomModalViewModel == null ? 0 : localBottomModalViewModel.hashCode())) * 31;
        LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel = this.notes;
        int hashCode14 = (hashCode13 + (localCheckoutSpecialInstructionsViewModel == null ? 0 : localCheckoutSpecialInstructionsViewModel.hashCode())) * 31;
        String str4 = this.policies;
        int hashCode15 = (hashCode14 + (str4 == null ? 0 : str4.hashCode())) * 31;
        CouponSection couponSection = this.couponSection;
        return Boolean.hashCode(this.isWorkingAsync) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode15 + (couponSection == null ? 0 : couponSection.hashCode())) * 31, 31, this.detailsExpanded), 31, false);
    }

    @Override // app.cash.local.viewmodels.internal.CanWorkAsync
    public final boolean isWorkingAsync() {
        return this.isWorkingAsync;
    }

    public final String toString() {
        StringBuilder m = Request$Priority$EnumUnboxingLocalUtility.m("LocalBrandLocationCheckoutViewModel(banners=", ", estimatedCompletionTitle=", this.estimatedCompletionTitle, ", estimatedCompletionTime=", this.banners);
        m.append(this.estimatedCompletionTime);
        m.append(", fulfillment=");
        m.append(this.fulfillment);
        m.append(", availableFulfillmentTypes=");
        m.append(this.availableFulfillmentTypes);
        m.append(", buyerInfo=");
        m.append(this.buyerInfo);
        m.append(", brandName=");
        m.append(this.brandName);
        m.append(", brandImage=");
        m.append(this.brandImage);
        m.append(", address=");
        m.append(this.address);
        m.append(", addressCoordinates=");
        m.append(this.addressCoordinates);
        m.append(", summaryItemCount=");
        NavAction$$ExternalSyntheticOutline0.m(this.summaryItemCount, ", selections=", ", extraLines=", m, this.selections);
        m.append(this.extraLines);
        m.append(", orderSummary=");
        m.append(this.orderSummary);
        m.append(", paymentSection=");
        m.append(this.paymentSection);
        m.append(", giftCardSection=");
        m.append(this.giftCardSection);
        m.append(", tipSection=");
        m.append(this.tipSection);
        m.append(", orderType=");
        m.append(this.orderType);
        m.append(", reviewMode=");
        m.append(this.reviewMode);
        m.append(", curbsidePickupSection=");
        m.append(this.curbsidePickupSection);
        m.append(", modal=");
        m.append(this.modal);
        m.append(", notes=");
        m.append(this.notes);
        m.append(", policies=");
        m.append(this.policies);
        m.append(", couponSection=");
        m.append(this.couponSection);
        m.append(", detailsExpanded=");
        return Request$Priority$EnumUnboxingLocalUtility.m(m, this.detailsExpanded, ", policiesExpanded=false, isWorkingAsync=", this.isWorkingAsync, ")");
    }
}
