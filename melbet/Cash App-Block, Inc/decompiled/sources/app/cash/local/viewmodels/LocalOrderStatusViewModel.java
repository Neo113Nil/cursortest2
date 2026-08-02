package app.cash.local.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.GpsCoordinates;
import app.cash.local.primitives.OrderStatus;
import app.cash.local.viewmodels.internal.CanWorkAsync;
import app.cash.local.viewmodels.sheet.MapDecisionSheetModel;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalText;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class LocalOrderStatusViewModel implements CanWorkAsync {

    public final class Error extends LocalOrderStatusViewModel {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -1752551237;
        }

        @Override // app.cash.local.viewmodels.internal.CanWorkAsync
        public final boolean isWorkingAsync() {
            return false;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Loaded extends LocalOrderStatusViewModel {
        public final boolean allowToolbarNavigation;
        public final DisplayMode displayMode;
        public final List extraLines;
        public final FulfillmentDetails fulfillmentDetails;
        public final String localCashEarningsLabel;
        public final String loyaltyEarningsLabel;
        public final MapDecisionSheetModel mapDecisionSheetModel;
        public final String orderDetails;
        public final String paymentSource;
        public final String receiptUrl;
        public final List selections;
        public final boolean showArrivalConfirmedToast;
        public final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class DisplayMode {
            public static final /* synthetic */ DisplayMode[] $VALUES;
            public static final DisplayMode InStoreOpenTabClosed;
            public static final DisplayMode Standard;

            static {
                DisplayMode displayMode = new DisplayMode("Standard", 0);
                Standard = displayMode;
                DisplayMode displayMode2 = new DisplayMode("InStoreOpenTabClosed", 1);
                InStoreOpenTabClosed = displayMode2;
                $VALUES = new DisplayMode[]{displayMode, displayMode2};
            }

            public static DisplayMode valueOf(String str) {
                return (DisplayMode) Enum.valueOf(DisplayMode.class, str);
            }

            public static DisplayMode[] values() {
                return (DisplayMode[]) $VALUES.clone();
            }
        }

        public interface FulfillmentDetails {

            public final class Delivery implements FulfillmentDetails {
                public final LocalImage brandImage;
                public final String brandName;
                public final GpsCoordinates brandSpotCoordinates;
                public final LocalFulfillment.DeliveryDetails.DeliveryCourierDriver courierDriver;
                public final String deliveryAddress;
                public final GpsCoordinates deliveryCoordinates;
                public final GpsCoordinates driverCoordinates;
                public final String dropoffProofUrl;
                public final LocalText estimatedCompletionLabel;
                public final boolean idVerificationRequired;
                public final String instructions;
                public final OrderStatus orderStatus;
                public final String orderSummary;
                public final boolean showBrandPhoneIcon;

                public Delivery(OrderStatus orderStatus, String str, String str2, LocalImage localImage, String str3, GpsCoordinates gpsCoordinates, GpsCoordinates gpsCoordinates2, GpsCoordinates gpsCoordinates3, String str4, boolean z, String str5, LocalFulfillment.DeliveryDetails.DeliveryCourierDriver deliveryCourierDriver, boolean z2, LocalText localText) {
                    str.getClass();
                    str2.getClass();
                    this.orderStatus = orderStatus;
                    this.brandName = str;
                    this.orderSummary = str2;
                    this.brandImage = localImage;
                    this.deliveryAddress = str3;
                    this.deliveryCoordinates = gpsCoordinates;
                    this.brandSpotCoordinates = gpsCoordinates2;
                    this.driverCoordinates = gpsCoordinates3;
                    this.dropoffProofUrl = str4;
                    this.showBrandPhoneIcon = z;
                    this.instructions = str5;
                    this.courierDriver = deliveryCourierDriver;
                    this.idVerificationRequired = z2;
                    this.estimatedCompletionLabel = localText;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Delivery)) {
                        return false;
                    }
                    Delivery delivery = (Delivery) obj;
                    return Intrinsics.areEqual(this.orderStatus, delivery.orderStatus) && Intrinsics.areEqual(this.brandName, delivery.brandName) && Intrinsics.areEqual(this.orderSummary, delivery.orderSummary) && Intrinsics.areEqual(this.brandImage, delivery.brandImage) && this.deliveryAddress.equals(delivery.deliveryAddress) && Intrinsics.areEqual(this.deliveryCoordinates, delivery.deliveryCoordinates) && Intrinsics.areEqual(this.brandSpotCoordinates, delivery.brandSpotCoordinates) && Intrinsics.areEqual(this.driverCoordinates, delivery.driverCoordinates) && Intrinsics.areEqual(this.dropoffProofUrl, delivery.dropoffProofUrl) && this.showBrandPhoneIcon == delivery.showBrandPhoneIcon && Intrinsics.areEqual(this.instructions, delivery.instructions) && Intrinsics.areEqual(this.courierDriver, delivery.courierDriver) && this.idVerificationRequired == delivery.idVerificationRequired && Intrinsics.areEqual(this.estimatedCompletionLabel, delivery.estimatedCompletionLabel);
                }

                @Override // app.cash.local.viewmodels.LocalOrderStatusViewModel.Loaded.FulfillmentDetails
                public final LocalImage getBrandImage() {
                    return this.brandImage;
                }

                @Override // app.cash.local.viewmodels.LocalOrderStatusViewModel.Loaded.FulfillmentDetails
                public final String getBrandName() {
                    return this.brandName;
                }

                @Override // app.cash.local.viewmodels.LocalOrderStatusViewModel.Loaded.FulfillmentDetails
                public final LocalText getEstimatedCompletionLabel() {
                    return this.estimatedCompletionLabel;
                }

                @Override // app.cash.local.viewmodels.LocalOrderStatusViewModel.Loaded.FulfillmentDetails
                public final boolean getIdVerificationRequired() {
                    return this.idVerificationRequired;
                }

                @Override // app.cash.local.viewmodels.LocalOrderStatusViewModel.Loaded.FulfillmentDetails
                public final String getInstructions() {
                    return this.instructions;
                }

                @Override // app.cash.local.viewmodels.LocalOrderStatusViewModel.Loaded.FulfillmentDetails
                public final OrderStatus getOrderStatus() {
                    return this.orderStatus;
                }

                @Override // app.cash.local.viewmodels.LocalOrderStatusViewModel.Loaded.FulfillmentDetails
                public final String getOrderSummary() {
                    return this.orderSummary;
                }

                @Override // app.cash.local.viewmodels.LocalOrderStatusViewModel.Loaded.FulfillmentDetails
                public final boolean getShowBrandPhoneIcon() {
                    return this.showBrandPhoneIcon;
                }

                public final int hashCode() {
                    OrderStatus orderStatus = this.orderStatus;
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((orderStatus == null ? 0 : orderStatus.hashCode()) * 31, 31, this.brandName), 31, this.orderSummary);
                    LocalImage localImage = this.brandImage;
                    int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (localImage == null ? 0 : localImage.hashCode())) * 31, 31, this.deliveryAddress);
                    GpsCoordinates gpsCoordinates = this.deliveryCoordinates;
                    int hashCode = (m2 + (gpsCoordinates == null ? 0 : gpsCoordinates.hashCode())) * 31;
                    GpsCoordinates gpsCoordinates2 = this.brandSpotCoordinates;
                    int hashCode2 = (hashCode + (gpsCoordinates2 == null ? 0 : gpsCoordinates2.hashCode())) * 31;
                    GpsCoordinates gpsCoordinates3 = this.driverCoordinates;
                    int hashCode3 = (hashCode2 + (gpsCoordinates3 == null ? 0 : gpsCoordinates3.hashCode())) * 31;
                    String str = this.dropoffProofUrl;
                    int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.showBrandPhoneIcon);
                    String str2 = this.instructions;
                    int hashCode4 = (m3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    LocalFulfillment.DeliveryDetails.DeliveryCourierDriver deliveryCourierDriver = this.courierDriver;
                    int m4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (deliveryCourierDriver == null ? 0 : deliveryCourierDriver.hashCode())) * 31, 31, this.idVerificationRequired);
                    LocalText localText = this.estimatedCompletionLabel;
                    return m4 + (localText != null ? localText.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Delivery(orderStatus=");
                    sb.append(this.orderStatus);
                    sb.append(", brandName=");
                    sb.append(this.brandName);
                    sb.append(", orderSummary=");
                    sb.append(this.orderSummary);
                    sb.append(", brandImage=");
                    sb.append(this.brandImage);
                    sb.append(", deliveryAddress=");
                    sb.append(this.deliveryAddress);
                    sb.append(", deliveryCoordinates=");
                    sb.append(this.deliveryCoordinates);
                    sb.append(", brandSpotCoordinates=");
                    sb.append(this.brandSpotCoordinates);
                    sb.append(", driverCoordinates=");
                    sb.append(this.driverCoordinates);
                    sb.append(", dropoffProofUrl=");
                    NavAction$$ExternalSyntheticOutline0.m(sb, this.dropoffProofUrl, ", showBrandPhoneIcon=", this.showBrandPhoneIcon, ", instructions=");
                    sb.append(this.instructions);
                    sb.append(", courierDriver=");
                    sb.append(this.courierDriver);
                    sb.append(", idVerificationRequired=");
                    sb.append(this.idVerificationRequired);
                    sb.append(", estimatedCompletionLabel=");
                    sb.append(this.estimatedCompletionLabel);
                    sb.append(")");
                    return sb.toString();
                }
            }

            public final class Pickup implements FulfillmentDetails {
                public final LocalImage brandImage;
                public final String brandName;
                public final CurbsideArrivalAction curbsideArrivalAction;
                public final LocalText estimatedCompletionLabel;
                public final boolean idVerificationRequired;
                public final String instructions;
                public final OrderStatus orderStatus;
                public final String orderSummary;
                public final String pickupAddress;
                public final GpsCoordinates pickupCoordinates;
                public final boolean showBrandPhoneIcon;
                public final String vehicleDescription;

                public interface CurbsideArrivalAction {

                    public final class ArrivalConfirmed implements CurbsideArrivalAction {
                        public static final ArrivalConfirmed INSTANCE = new ArrivalConfirmed();

                        public final boolean equals(Object obj) {
                            return this == obj || (obj instanceof ArrivalConfirmed);
                        }

                        public final int hashCode() {
                            return 670732674;
                        }

                        public final String toString() {
                            return "ArrivalConfirmed";
                        }
                    }

                    public final class Call implements CurbsideArrivalAction {
                        public static final Call INSTANCE = new Call();

                        public final boolean equals(Object obj) {
                            return this == obj || (obj instanceof Call);
                        }

                        public final int hashCode() {
                            return -1180930438;
                        }

                        public final String toString() {
                            return "Call";
                        }
                    }

                    public final class ImHere implements CurbsideArrivalAction {
                        public static final ImHere INSTANCE = new ImHere();

                        public final boolean equals(Object obj) {
                            return this == obj || (obj instanceof ImHere);
                        }

                        public final int hashCode() {
                            return -821003184;
                        }

                        public final String toString() {
                            return "ImHere";
                        }
                    }

                    public final class Loading implements CurbsideArrivalAction {
                        public static final Loading INSTANCE = new Loading();

                        public final boolean equals(Object obj) {
                            return this == obj || (obj instanceof Loading);
                        }

                        public final int hashCode() {
                            return -1233442912;
                        }

                        public final String toString() {
                            return "Loading";
                        }
                    }
                }

                public Pickup(OrderStatus orderStatus, String str, String str2, LocalImage localImage, String str3, GpsCoordinates gpsCoordinates, boolean z, String str4, boolean z2, LocalText localText, CurbsideArrivalAction curbsideArrivalAction, String str5) {
                    str.getClass();
                    str2.getClass();
                    this.orderStatus = orderStatus;
                    this.brandName = str;
                    this.orderSummary = str2;
                    this.brandImage = localImage;
                    this.pickupAddress = str3;
                    this.pickupCoordinates = gpsCoordinates;
                    this.showBrandPhoneIcon = z;
                    this.instructions = str4;
                    this.idVerificationRequired = z2;
                    this.estimatedCompletionLabel = localText;
                    this.curbsideArrivalAction = curbsideArrivalAction;
                    this.vehicleDescription = str5;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Pickup)) {
                        return false;
                    }
                    Pickup pickup = (Pickup) obj;
                    return Intrinsics.areEqual(this.orderStatus, pickup.orderStatus) && Intrinsics.areEqual(this.brandName, pickup.brandName) && Intrinsics.areEqual(this.orderSummary, pickup.orderSummary) && Intrinsics.areEqual(this.brandImage, pickup.brandImage) && this.pickupAddress.equals(pickup.pickupAddress) && Intrinsics.areEqual(this.pickupCoordinates, pickup.pickupCoordinates) && this.showBrandPhoneIcon == pickup.showBrandPhoneIcon && Intrinsics.areEqual(this.instructions, pickup.instructions) && this.idVerificationRequired == pickup.idVerificationRequired && Intrinsics.areEqual(this.estimatedCompletionLabel, pickup.estimatedCompletionLabel) && Intrinsics.areEqual(this.curbsideArrivalAction, pickup.curbsideArrivalAction) && Intrinsics.areEqual(this.vehicleDescription, pickup.vehicleDescription);
                }

                @Override // app.cash.local.viewmodels.LocalOrderStatusViewModel.Loaded.FulfillmentDetails
                public final LocalImage getBrandImage() {
                    return this.brandImage;
                }

                @Override // app.cash.local.viewmodels.LocalOrderStatusViewModel.Loaded.FulfillmentDetails
                public final String getBrandName() {
                    return this.brandName;
                }

                @Override // app.cash.local.viewmodels.LocalOrderStatusViewModel.Loaded.FulfillmentDetails
                public final LocalText getEstimatedCompletionLabel() {
                    return this.estimatedCompletionLabel;
                }

                @Override // app.cash.local.viewmodels.LocalOrderStatusViewModel.Loaded.FulfillmentDetails
                public final boolean getIdVerificationRequired() {
                    return this.idVerificationRequired;
                }

                @Override // app.cash.local.viewmodels.LocalOrderStatusViewModel.Loaded.FulfillmentDetails
                public final String getInstructions() {
                    return this.instructions;
                }

                @Override // app.cash.local.viewmodels.LocalOrderStatusViewModel.Loaded.FulfillmentDetails
                public final OrderStatus getOrderStatus() {
                    return this.orderStatus;
                }

                @Override // app.cash.local.viewmodels.LocalOrderStatusViewModel.Loaded.FulfillmentDetails
                public final String getOrderSummary() {
                    return this.orderSummary;
                }

                @Override // app.cash.local.viewmodels.LocalOrderStatusViewModel.Loaded.FulfillmentDetails
                public final boolean getShowBrandPhoneIcon() {
                    return this.showBrandPhoneIcon;
                }

                public final int hashCode() {
                    OrderStatus orderStatus = this.orderStatus;
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((orderStatus == null ? 0 : orderStatus.hashCode()) * 31, 31, this.brandName), 31, this.orderSummary);
                    LocalImage localImage = this.brandImage;
                    int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (localImage == null ? 0 : localImage.hashCode())) * 31, 31, this.pickupAddress);
                    GpsCoordinates gpsCoordinates = this.pickupCoordinates;
                    int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (gpsCoordinates == null ? 0 : gpsCoordinates.hashCode())) * 31, 31, this.showBrandPhoneIcon);
                    String str = this.instructions;
                    int m4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.idVerificationRequired);
                    LocalText localText = this.estimatedCompletionLabel;
                    int hashCode = (m4 + (localText == null ? 0 : localText.hashCode())) * 31;
                    CurbsideArrivalAction curbsideArrivalAction = this.curbsideArrivalAction;
                    int hashCode2 = (hashCode + (curbsideArrivalAction == null ? 0 : curbsideArrivalAction.hashCode())) * 31;
                    String str2 = this.vehicleDescription;
                    return hashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Pickup(orderStatus=");
                    sb.append(this.orderStatus);
                    sb.append(", brandName=");
                    sb.append(this.brandName);
                    sb.append(", orderSummary=");
                    sb.append(this.orderSummary);
                    sb.append(", brandImage=");
                    sb.append(this.brandImage);
                    sb.append(", pickupAddress=");
                    sb.append(this.pickupAddress);
                    sb.append(", pickupCoordinates=");
                    sb.append(this.pickupCoordinates);
                    sb.append(", showBrandPhoneIcon=");
                    NavAction$$ExternalSyntheticOutline0.m(sb, this.showBrandPhoneIcon, ", instructions=", this.instructions, ", idVerificationRequired=");
                    sb.append(this.idVerificationRequired);
                    sb.append(", estimatedCompletionLabel=");
                    sb.append(this.estimatedCompletionLabel);
                    sb.append(", curbsideArrivalAction=");
                    sb.append(this.curbsideArrivalAction);
                    sb.append(", vehicleDescription=");
                    sb.append(this.vehicleDescription);
                    sb.append(")");
                    return sb.toString();
                }
            }

            LocalImage getBrandImage();

            String getBrandName();

            LocalText getEstimatedCompletionLabel();

            boolean getIdVerificationRequired();

            String getInstructions();

            OrderStatus getOrderStatus();

            String getOrderSummary();

            boolean getShowBrandPhoneIcon();
        }

        public final class Selection {
            public final String information;
            public final String label;
            public final int quantity;
            public final ArrayList slots;
            public final String totalPriceFormatted;

            public Selection(String str, String str2, String str3, int i, ArrayList arrayList) {
                this.label = str;
                this.information = str2;
                this.totalPriceFormatted = str3;
                this.quantity = i;
                this.slots = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Selection)) {
                    return false;
                }
                Selection selection = (Selection) obj;
                return this.label.equals(selection.label) && Intrinsics.areEqual(this.information, selection.information) && this.totalPriceFormatted.equals(selection.totalPriceFormatted) && this.quantity == selection.quantity && this.slots.equals(selection.slots);
            }

            public final int hashCode() {
                int hashCode = this.label.hashCode() * 31;
                String str = this.information;
                return this.slots.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.quantity, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.totalPriceFormatted), 31);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Selection(label=", this.label, ", information=", this.information, ", totalPriceFormatted=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.totalPriceFormatted, ", quantity=", this.quantity, ", slots=");
                return Recorder$$ExternalSyntheticOutline1.m(")", m, this.slots);
            }
        }

        public Loaded(String str, String str2, String str3, String str4, boolean z, FulfillmentDetails fulfillmentDetails, List list, ListBuilder listBuilder, String str5, String str6, MapDecisionSheetModel mapDecisionSheetModel, boolean z2, DisplayMode displayMode) {
            str.getClass();
            list.getClass();
            listBuilder.getClass();
            this.title = str;
            this.localCashEarningsLabel = str2;
            this.loyaltyEarningsLabel = str3;
            this.receiptUrl = str4;
            this.allowToolbarNavigation = z;
            this.fulfillmentDetails = fulfillmentDetails;
            this.selections = list;
            this.extraLines = listBuilder;
            this.orderDetails = str5;
            this.paymentSource = str6;
            this.mapDecisionSheetModel = mapDecisionSheetModel;
            this.showArrivalConfirmedToast = z2;
            this.displayMode = displayMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.localCashEarningsLabel, loaded.localCashEarningsLabel) && Intrinsics.areEqual(this.loyaltyEarningsLabel, loaded.loyaltyEarningsLabel) && Intrinsics.areEqual(this.receiptUrl, loaded.receiptUrl) && this.allowToolbarNavigation == loaded.allowToolbarNavigation && this.fulfillmentDetails.equals(loaded.fulfillmentDetails) && Intrinsics.areEqual(this.selections, loaded.selections) && Intrinsics.areEqual(this.extraLines, loaded.extraLines) && this.orderDetails.equals(loaded.orderDetails) && Intrinsics.areEqual(this.paymentSource, loaded.paymentSource) && Intrinsics.areEqual(this.mapDecisionSheetModel, loaded.mapDecisionSheetModel) && this.showArrivalConfirmedToast == loaded.showArrivalConfirmedToast && this.displayMode == loaded.displayMode;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.localCashEarningsLabel;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.loyaltyEarningsLabel;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.receiptUrl;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((this.fulfillmentDetails.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.allowToolbarNavigation)) * 31, 31, this.selections), 31, this.extraLines), 31, this.orderDetails);
            String str4 = this.paymentSource;
            int hashCode4 = (m + (str4 == null ? 0 : str4.hashCode())) * 31;
            MapDecisionSheetModel mapDecisionSheetModel = this.mapDecisionSheetModel;
            return this.displayMode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (mapDecisionSheetModel != null ? mapDecisionSheetModel.hashCode() : 0)) * 31, 31, this.showArrivalConfirmedToast);
        }

        @Override // app.cash.local.viewmodels.internal.CanWorkAsync
        public final boolean isWorkingAsync() {
            return false;
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(title=", this.title, ", localCashEarningsLabel=", this.localCashEarningsLabel, ", loyaltyEarningsLabel=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.loyaltyEarningsLabel, ", receiptUrl=", this.receiptUrl, ", allowToolbarNavigation=");
            m.append(this.allowToolbarNavigation);
            m.append(", fulfillmentDetails=");
            m.append(this.fulfillmentDetails);
            m.append(", selections=");
            Request$Priority$EnumUnboxingLocalUtility.m(m, this.selections, ", extraLines=", this.extraLines, ", orderDetails=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.orderDetails, ", paymentSource=", this.paymentSource, ", mapDecisionSheetModel=");
            m.append(this.mapDecisionSheetModel);
            m.append(", showArrivalConfirmedToast=");
            m.append(this.showArrivalConfirmedToast);
            m.append(", displayMode=");
            m.append(this.displayMode);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading extends LocalOrderStatusViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1241079599;
        }

        @Override // app.cash.local.viewmodels.internal.CanWorkAsync
        public final boolean isWorkingAsync() {
            return true;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
