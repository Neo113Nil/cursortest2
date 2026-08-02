package app.cash.local.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.viewmodels.internal.Amount;
import app.cash.local.viewmodels.internal.CanWorkAsync;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalText;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalBrandLocationCartViewModel implements CanWorkAsync {
    public final AppliedCouponBanner appliedCoupon;
    public final List availableFulfillmentTypes;
    public final LocalBrandBannerModel banner;
    public final ArrayList errors;
    public final FreeDeliveryMeter freeDeliveryMeter;
    public final Fulfillment fulfillment;
    public final boolean isCheckoutEnabled;
    public final boolean isLoading;
    public final Mode mode;
    public final OpenTabBanner openTabBanner;
    public final int openTabItemCount;
    public final OrderLimitBanner orderLimitBanner;
    public final List placeOrderErrors;
    public final List selections;
    public final Amount subtotalAmount;
    public final Amount subtotalBeforeDiscountAmount;
    public final String summaryLabel;
    public final String title;

    public interface Fulfillment {

        public final class Delivery implements Fulfillment {
            public final String address;
            public final boolean canFulfillAsap;
            public final LocalText estimatedCompletionAsap;
            public final LocalText estimatedCompletionScheduled;
            public final boolean isExpanded;
            public final LocalFulfillment.SchedulingDetails.SchedulingMode selectedSchedulingMode;

            public Delivery(String str, LocalText localText, LocalText localText2, boolean z, LocalFulfillment.SchedulingDetails.SchedulingMode schedulingMode, boolean z2) {
                str.getClass();
                schedulingMode.getClass();
                this.address = str;
                this.estimatedCompletionAsap = localText;
                this.estimatedCompletionScheduled = localText2;
                this.canFulfillAsap = z;
                this.selectedSchedulingMode = schedulingMode;
                this.isExpanded = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Delivery)) {
                    return false;
                }
                Delivery delivery = (Delivery) obj;
                return Intrinsics.areEqual(this.address, delivery.address) && Intrinsics.areEqual(this.estimatedCompletionAsap, delivery.estimatedCompletionAsap) && Intrinsics.areEqual(this.estimatedCompletionScheduled, delivery.estimatedCompletionScheduled) && this.canFulfillAsap == delivery.canFulfillAsap && this.selectedSchedulingMode == delivery.selectedSchedulingMode && this.isExpanded == delivery.isExpanded;
            }

            @Override // app.cash.local.viewmodels.LocalBrandLocationCartViewModel.Fulfillment
            public final boolean getCanFulfillAsap() {
                return this.canFulfillAsap;
            }

            @Override // app.cash.local.viewmodels.LocalBrandLocationCartViewModel.Fulfillment
            public final LocalText getEstimatedCompletionAsap() {
                return this.estimatedCompletionAsap;
            }

            @Override // app.cash.local.viewmodels.LocalBrandLocationCartViewModel.Fulfillment
            public final LocalText getEstimatedCompletionScheduled() {
                return this.estimatedCompletionScheduled;
            }

            @Override // app.cash.local.viewmodels.LocalBrandLocationCartViewModel.Fulfillment
            public final LocalFulfillment.SchedulingDetails.SchedulingMode getSelectedSchedulingMode() {
                return this.selectedSchedulingMode;
            }

            public final int hashCode() {
                int hashCode = this.address.hashCode() * 31;
                LocalText localText = this.estimatedCompletionAsap;
                int hashCode2 = (hashCode + (localText == null ? 0 : localText.hashCode())) * 31;
                LocalText localText2 = this.estimatedCompletionScheduled;
                return Boolean.hashCode(this.isExpanded) + ((this.selectedSchedulingMode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (localText2 != null ? localText2.hashCode() : 0)) * 31, 31, this.canFulfillAsap)) * 31);
            }

            @Override // app.cash.local.viewmodels.LocalBrandLocationCartViewModel.Fulfillment
            public final boolean isExpanded() {
                return this.isExpanded;
            }

            public final String toString() {
                return "Delivery(address=" + this.address + ", estimatedCompletionAsap=" + this.estimatedCompletionAsap + ", estimatedCompletionScheduled=" + this.estimatedCompletionScheduled + ", canFulfillAsap=" + this.canFulfillAsap + ", selectedSchedulingMode=" + this.selectedSchedulingMode + ", isExpanded=" + this.isExpanded + ")";
            }
        }

        public final class Pickup implements Fulfillment {
            public final String address;
            public final boolean canFulfillAsap;
            public final LocalText estimatedCompletionAsap;
            public final LocalText estimatedCompletionScheduled;
            public final boolean isExpanded;
            public final LocalFulfillment.SchedulingDetails.SchedulingMode selectedSchedulingMode;

            public Pickup(String str, LocalText localText, LocalText localText2, boolean z, LocalFulfillment.SchedulingDetails.SchedulingMode schedulingMode, boolean z2) {
                schedulingMode.getClass();
                this.address = str;
                this.estimatedCompletionAsap = localText;
                this.estimatedCompletionScheduled = localText2;
                this.canFulfillAsap = z;
                this.selectedSchedulingMode = schedulingMode;
                this.isExpanded = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Pickup)) {
                    return false;
                }
                Pickup pickup = (Pickup) obj;
                return this.address.equals(pickup.address) && Intrinsics.areEqual(this.estimatedCompletionAsap, pickup.estimatedCompletionAsap) && Intrinsics.areEqual(this.estimatedCompletionScheduled, pickup.estimatedCompletionScheduled) && this.canFulfillAsap == pickup.canFulfillAsap && this.selectedSchedulingMode == pickup.selectedSchedulingMode && this.isExpanded == pickup.isExpanded;
            }

            @Override // app.cash.local.viewmodels.LocalBrandLocationCartViewModel.Fulfillment
            public final boolean getCanFulfillAsap() {
                return this.canFulfillAsap;
            }

            @Override // app.cash.local.viewmodels.LocalBrandLocationCartViewModel.Fulfillment
            public final LocalText getEstimatedCompletionAsap() {
                return this.estimatedCompletionAsap;
            }

            @Override // app.cash.local.viewmodels.LocalBrandLocationCartViewModel.Fulfillment
            public final LocalText getEstimatedCompletionScheduled() {
                return this.estimatedCompletionScheduled;
            }

            @Override // app.cash.local.viewmodels.LocalBrandLocationCartViewModel.Fulfillment
            public final LocalFulfillment.SchedulingDetails.SchedulingMode getSelectedSchedulingMode() {
                return this.selectedSchedulingMode;
            }

            public final int hashCode() {
                int hashCode = this.address.hashCode() * 31;
                LocalText localText = this.estimatedCompletionAsap;
                int hashCode2 = (hashCode + (localText == null ? 0 : localText.hashCode())) * 31;
                LocalText localText2 = this.estimatedCompletionScheduled;
                return Boolean.hashCode(this.isExpanded) + ((this.selectedSchedulingMode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (localText2 != null ? localText2.hashCode() : 0)) * 31, 31, this.canFulfillAsap)) * 31);
            }

            @Override // app.cash.local.viewmodels.LocalBrandLocationCartViewModel.Fulfillment
            public final boolean isExpanded() {
                return this.isExpanded;
            }

            public final String toString() {
                return "Pickup(address=" + this.address + ", estimatedCompletionAsap=" + this.estimatedCompletionAsap + ", estimatedCompletionScheduled=" + this.estimatedCompletionScheduled + ", canFulfillAsap=" + this.canFulfillAsap + ", selectedSchedulingMode=" + this.selectedSchedulingMode + ", isExpanded=" + this.isExpanded + ")";
            }
        }

        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LocalFulfillment.SchedulingDetails.SchedulingMode.values().length];
                try {
                    iArr[LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_ASAP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_SCHEDULED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        boolean getCanFulfillAsap();

        LocalText getEstimatedCompletionAsap();

        LocalText getEstimatedCompletionScheduled();

        default LocalText getSelectedEstimatedCompletion() {
            int i = WhenMappings.$EnumSwitchMapping$0[getSelectedSchedulingMode().ordinal()];
            if (i == 1 || i == 2) {
                return getEstimatedCompletionAsap();
            }
            if (i == 3) {
                return getEstimatedCompletionScheduled();
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }

        LocalFulfillment.SchedulingDetails.SchedulingMode getSelectedSchedulingMode();

        boolean isExpanded();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Mode {
        public static final /* synthetic */ Mode[] $VALUES;
        public static final Mode ADD_TO_OPEN_TAB;
        public static final Mode CART;

        static {
            Mode mode = new Mode("CART", 0);
            CART = mode;
            Mode mode2 = new Mode("ADD_TO_OPEN_TAB", 1);
            ADD_TO_OPEN_TAB = mode2;
            $VALUES = new Mode[]{mode, mode2};
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    public final class OpenTabBanner {
        public final String body;
        public final List images;
        public final boolean isClickable;
        public final String title;
        public final TrailingIcon trailingIcon;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class TrailingIcon {
            public static final /* synthetic */ TrailingIcon[] $VALUES;
            public static final TrailingIcon CHECK_FILL;
            public static final TrailingIcon ERROR;
            public static final TrailingIcon PUSH;

            static {
                TrailingIcon trailingIcon = new TrailingIcon("CHECK_FILL", 0);
                CHECK_FILL = trailingIcon;
                TrailingIcon trailingIcon2 = new TrailingIcon("ERROR", 1);
                ERROR = trailingIcon2;
                TrailingIcon trailingIcon3 = new TrailingIcon("PUSH", 2);
                PUSH = trailingIcon3;
                $VALUES = new TrailingIcon[]{trailingIcon, trailingIcon2, trailingIcon3};
            }

            public static TrailingIcon valueOf(String str) {
                return (TrailingIcon) Enum.valueOf(TrailingIcon.class, str);
            }

            public static TrailingIcon[] values() {
                return (TrailingIcon[]) $VALUES.clone();
            }
        }

        public OpenTabBanner(String str, String str2, TrailingIcon trailingIcon, List list, boolean z) {
            Request$Priority$EnumUnboxingLocalUtility.m(str, str2, list);
            this.title = str;
            this.body = str2;
            this.trailingIcon = trailingIcon;
            this.images = list;
            this.isClickable = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenTabBanner)) {
                return false;
            }
            OpenTabBanner openTabBanner = (OpenTabBanner) obj;
            return Intrinsics.areEqual(this.title, openTabBanner.title) && Intrinsics.areEqual(this.body, openTabBanner.body) && this.trailingIcon == openTabBanner.trailingIcon && Intrinsics.areEqual(this.images, openTabBanner.images) && this.isClickable == openTabBanner.isClickable;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
            TrailingIcon trailingIcon = this.trailingIcon;
            return Boolean.hashCode(this.isClickable) + Recorder$$ExternalSyntheticOutline2.m((m + (trailingIcon == null ? 0 : trailingIcon.hashCode())) * 31, 31, this.images);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenTabBanner(title=", this.title, ", body=", this.body, ", trailingIcon=");
            m.append(this.trailingIcon);
            m.append(", images=");
            m.append(this.images);
            m.append(", isClickable=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isClickable, ")");
        }
    }

    public final class Selection {
        public final CartItemCounterViewModel counterModel;
        public final String discountText;
        public final ArrayList errors;
        public final LocalImage image;
        public final int index;
        public final String information;
        public final String label;
        public final ArrayList slots;
        public final Amount totalPriceAmount;
        public final Amount totalPriceBeforeDiscountAmount;

        public Selection(int i, String str, String str2, String str3, Amount amount, Amount amount2, LocalImage localImage, CartItemCounterViewModel cartItemCounterViewModel, ArrayList arrayList, ArrayList arrayList2) {
            str.getClass();
            this.index = i;
            this.label = str;
            this.information = str2;
            this.discountText = str3;
            this.totalPriceAmount = amount;
            this.totalPriceBeforeDiscountAmount = amount2;
            this.image = localImage;
            this.counterModel = cartItemCounterViewModel;
            this.slots = arrayList;
            this.errors = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Selection)) {
                return false;
            }
            Selection selection = (Selection) obj;
            return this.index == selection.index && Intrinsics.areEqual(this.label, selection.label) && Intrinsics.areEqual(this.information, selection.information) && Intrinsics.areEqual(this.discountText, selection.discountText) && this.totalPriceAmount.equals(selection.totalPriceAmount) && Intrinsics.areEqual(this.totalPriceBeforeDiscountAmount, selection.totalPriceBeforeDiscountAmount) && Intrinsics.areEqual(this.image, selection.image) && this.counterModel.equals(selection.counterModel) && this.slots.equals(selection.slots) && this.errors.equals(selection.errors);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Integer.hashCode(this.index) * 31, 31, this.label);
            String str = this.information;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.discountText;
            int hashCode2 = (this.totalPriceAmount.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Amount amount = this.totalPriceBeforeDiscountAmount;
            int hashCode3 = (hashCode2 + (amount == null ? 0 : amount.hashCode())) * 31;
            LocalImage localImage = this.image;
            return this.errors.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.slots, (this.counterModel.hashCode() + ((hashCode3 + (localImage != null ? localImage.hashCode() : 0)) * 31)) * 31, 31);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("Selection(index=", this.index, ", label=", this.label, ", information=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.information, ", discountText=", this.discountText, ", totalPriceAmount=");
            m.append(this.totalPriceAmount);
            m.append(", totalPriceBeforeDiscountAmount=");
            m.append(this.totalPriceBeforeDiscountAmount);
            m.append(", image=");
            m.append(this.image);
            m.append(", counterModel=");
            m.append(this.counterModel);
            m.append(", slots=");
            m.append(this.slots);
            m.append(", errors=");
            m.append(this.errors);
            m.append(")");
            return m.toString();
        }
    }

    public LocalBrandLocationCartViewModel(String str, String str2, Mode mode, LocalBrandBannerModel localBrandBannerModel, OpenTabBanner openTabBanner, int i, List list, Fulfillment fulfillment, List list2, Amount amount, Amount amount2, boolean z, boolean z2, AppliedCouponBanner appliedCouponBanner, FreeDeliveryMeter freeDeliveryMeter, OrderLimitBanner orderLimitBanner, List list3, ArrayList arrayList) {
        str2.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.title = str;
        this.summaryLabel = str2;
        this.mode = mode;
        this.banner = localBrandBannerModel;
        this.openTabBanner = openTabBanner;
        this.openTabItemCount = i;
        this.selections = list;
        this.fulfillment = fulfillment;
        this.availableFulfillmentTypes = list2;
        this.subtotalAmount = amount;
        this.subtotalBeforeDiscountAmount = amount2;
        this.isLoading = z;
        this.isCheckoutEnabled = z2;
        this.appliedCoupon = appliedCouponBanner;
        this.freeDeliveryMeter = freeDeliveryMeter;
        this.orderLimitBanner = orderLimitBanner;
        this.placeOrderErrors = list3;
        this.errors = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalBrandLocationCartViewModel)) {
            return false;
        }
        LocalBrandLocationCartViewModel localBrandLocationCartViewModel = (LocalBrandLocationCartViewModel) obj;
        return this.title.equals(localBrandLocationCartViewModel.title) && Intrinsics.areEqual(this.summaryLabel, localBrandLocationCartViewModel.summaryLabel) && this.mode == localBrandLocationCartViewModel.mode && Intrinsics.areEqual(this.banner, localBrandLocationCartViewModel.banner) && Intrinsics.areEqual(this.openTabBanner, localBrandLocationCartViewModel.openTabBanner) && this.openTabItemCount == localBrandLocationCartViewModel.openTabItemCount && Intrinsics.areEqual(this.selections, localBrandLocationCartViewModel.selections) && Intrinsics.areEqual(this.fulfillment, localBrandLocationCartViewModel.fulfillment) && Intrinsics.areEqual(this.availableFulfillmentTypes, localBrandLocationCartViewModel.availableFulfillmentTypes) && this.subtotalAmount.equals(localBrandLocationCartViewModel.subtotalAmount) && Intrinsics.areEqual(this.subtotalBeforeDiscountAmount, localBrandLocationCartViewModel.subtotalBeforeDiscountAmount) && this.isLoading == localBrandLocationCartViewModel.isLoading && this.isCheckoutEnabled == localBrandLocationCartViewModel.isCheckoutEnabled && Intrinsics.areEqual(this.appliedCoupon, localBrandLocationCartViewModel.appliedCoupon) && Intrinsics.areEqual(this.freeDeliveryMeter, localBrandLocationCartViewModel.freeDeliveryMeter) && Intrinsics.areEqual(this.orderLimitBanner, localBrandLocationCartViewModel.orderLimitBanner) && Intrinsics.areEqual(this.placeOrderErrors, localBrandLocationCartViewModel.placeOrderErrors) && this.errors.equals(localBrandLocationCartViewModel.errors);
    }

    public final int hashCode() {
        int hashCode = (this.mode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.summaryLabel)) * 31;
        LocalBrandBannerModel localBrandBannerModel = this.banner;
        int hashCode2 = (hashCode + (localBrandBannerModel == null ? 0 : localBrandBannerModel.hashCode())) * 31;
        OpenTabBanner openTabBanner = this.openTabBanner;
        int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.openTabItemCount, (hashCode2 + (openTabBanner == null ? 0 : openTabBanner.hashCode())) * 31, 31), 31, this.selections);
        Fulfillment fulfillment = this.fulfillment;
        int hashCode3 = (this.subtotalAmount.hashCode() + Recorder$$ExternalSyntheticOutline2.m((m + (fulfillment == null ? 0 : fulfillment.hashCode())) * 31, 31, this.availableFulfillmentTypes)) * 31;
        Amount amount = this.subtotalBeforeDiscountAmount;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (amount == null ? 0 : amount.hashCode())) * 31, 31, this.isLoading), 31, this.isCheckoutEnabled);
        AppliedCouponBanner appliedCouponBanner = this.appliedCoupon;
        int hashCode4 = (m2 + (appliedCouponBanner == null ? 0 : appliedCouponBanner.hashCode())) * 31;
        FreeDeliveryMeter freeDeliveryMeter = this.freeDeliveryMeter;
        int hashCode5 = (hashCode4 + (freeDeliveryMeter == null ? 0 : freeDeliveryMeter.hashCode())) * 31;
        OrderLimitBanner orderLimitBanner = this.orderLimitBanner;
        return this.errors.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (orderLimitBanner != null ? orderLimitBanner.hashCode() : 0)) * 31, 31, this.placeOrderErrors);
    }

    @Override // app.cash.local.viewmodels.internal.CanWorkAsync
    public final boolean isWorkingAsync() {
        return this.isLoading;
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalBrandLocationCartViewModel(title=", this.title, ", summaryLabel=", this.summaryLabel, ", mode=");
        m.append(this.mode);
        m.append(", banner=");
        m.append(this.banner);
        m.append(", openTabBanner=");
        m.append(this.openTabBanner);
        m.append(", openTabItemCount=");
        m.append(this.openTabItemCount);
        m.append(", selections=");
        m.append(this.selections);
        m.append(", fulfillment=");
        m.append(this.fulfillment);
        m.append(", availableFulfillmentTypes=");
        m.append(this.availableFulfillmentTypes);
        m.append(", subtotalAmount=");
        m.append(this.subtotalAmount);
        m.append(", subtotalBeforeDiscountAmount=");
        m.append(this.subtotalBeforeDiscountAmount);
        m.append(", isLoading=");
        m.append(this.isLoading);
        m.append(", isCheckoutEnabled=");
        m.append(this.isCheckoutEnabled);
        m.append(", appliedCoupon=");
        m.append(this.appliedCoupon);
        m.append(", freeDeliveryMeter=");
        m.append(this.freeDeliveryMeter);
        m.append(", orderLimitBanner=");
        m.append(this.orderLimitBanner);
        m.append(", placeOrderErrors=");
        m.append(this.placeOrderErrors);
        m.append(", errors=");
        m.append(this.errors);
        m.append(")");
        return m.toString();
    }
}
