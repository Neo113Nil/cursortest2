package app.cash.local.primitives;

import app.cash.local.primitives.FulfillmentConfiguration;
import com.squareup.protos.cash.local.client.v1.InStoreOrderingFulfillmentConfiguration;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalLocationDetail;
import com.squareup.protos.cash.local.client.v1.LocalLocationSummary;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import okio.ByteString;

/* loaded from: classes3.dex */
public abstract class FulfillmentConfigurationKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocalFulfillmentType.values().length];
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DINE_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_SHIPPING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final FulfillmentConfiguration.Delivery getAsDelivery(FulfillmentConfiguration fulfillmentConfiguration) {
        fulfillmentConfiguration.getClass();
        if (fulfillmentConfiguration instanceof FulfillmentConfiguration.Delivery) {
            return (FulfillmentConfiguration.Delivery) fulfillmentConfiguration;
        }
        return null;
    }

    public static final FulfillmentConfiguration.InStore getAsInStore(FulfillmentConfiguration fulfillmentConfiguration) {
        fulfillmentConfiguration.getClass();
        if (fulfillmentConfiguration instanceof FulfillmentConfiguration.InStore) {
            return (FulfillmentConfiguration.InStore) fulfillmentConfiguration;
        }
        return null;
    }

    public static final LocalFulfillment.SchedulingDetails.SchedulingMode getSchedulingMode(FulfillmentConfiguration fulfillmentConfiguration) {
        LocalFulfillment.SchedulingDetails schedulingDetails;
        LocalFulfillment.SchedulingDetails.SchedulingMode schedulingMode;
        return (fulfillmentConfiguration == null || (schedulingDetails = fulfillmentConfiguration.getSchedulingDetails()) == null || (schedulingMode = schedulingDetails.scheduling_mode) == null) ? LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_ASAP : schedulingMode;
    }

    public static final LocalFulfillmentType getType(FulfillmentConfiguration fulfillmentConfiguration) {
        if (fulfillmentConfiguration instanceof FulfillmentConfiguration.Delivery) {
            return LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY;
        }
        if (fulfillmentConfiguration instanceof FulfillmentConfiguration.InStore) {
            return LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE;
        }
        if (fulfillmentConfiguration instanceof FulfillmentConfiguration.Pickup) {
            return LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP;
        }
        if (fulfillmentConfiguration == null || (fulfillmentConfiguration instanceof FulfillmentConfiguration.Unspecified)) {
            return LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final FulfillmentConfiguration inStoreFulfillmentConfiguration(LocalBrand localBrand, String str) {
        LocalLocationDetail localLocationDetail;
        LocalLocationSummary localLocationSummary;
        String str2;
        InStoreOrderingFulfillmentConfiguration inStoreOrderingFulfillmentConfiguration;
        LocalFulfillment localFulfillment;
        if (str == null || localBrand == null || (localLocationDetail = localBrand.selected_location) == null || (localLocationSummary = localLocationDetail.summary) == null || (str2 = localLocationSummary.token) == null || (inStoreOrderingFulfillmentConfiguration = localLocationSummary.in_store_ordering_configuration) == null || (localFulfillment = inStoreOrderingFulfillmentConfiguration.cart_fulfillment) == null || localFulfillment.type != LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE) {
            return null;
        }
        LocalFulfillment.InStoreDetails inStoreDetails = localFulfillment.in_store_details;
        if (Intrinsics.areEqual(inStoreDetails != null ? inStoreDetails.ordering_token : null, str)) {
            return m1240toFulfillmentConfiguration6UYloQk(FulfillmentKt.toFulfillment(localFulfillment), str2, null);
        }
        return null;
    }

    public static final FulfillmentConfiguration normalizedForCalculateLineItemsRequest(FulfillmentConfiguration fulfillmentConfiguration) {
        fulfillmentConfiguration.getClass();
        if (fulfillmentConfiguration instanceof FulfillmentConfiguration.Delivery) {
            FulfillmentConfiguration.Delivery delivery = (FulfillmentConfiguration.Delivery) fulfillmentConfiguration;
            LocalFulfillment.SchedulingDetails schedulingDetails = delivery.schedulingDetails;
            return new FulfillmentConfiguration.Delivery(delivery.locationToken, null, null, schedulingDetails != null ? LocalFulfillment.SchedulingDetails.copy$default(schedulingDetails, null, null, null, null, 11, null) : null, delivery.deliveryDetails, delivery.deliveryFee);
        }
        if (fulfillmentConfiguration instanceof FulfillmentConfiguration.Pickup) {
            FulfillmentConfiguration.Pickup pickup = (FulfillmentConfiguration.Pickup) fulfillmentConfiguration;
            LocalFulfillment.SchedulingDetails schedulingDetails2 = pickup.schedulingDetails;
            return FulfillmentConfiguration.Pickup.m1239copyhYjS5Xw$default(pickup, null, schedulingDetails2 != null ? LocalFulfillment.SchedulingDetails.copy$default(schedulingDetails2, null, null, null, null, 11, null) : null, 1);
        }
        if ((fulfillmentConfiguration instanceof FulfillmentConfiguration.InStore) || fulfillmentConfiguration.equals(FulfillmentConfiguration.Unspecified.INSTANCE)) {
            return fulfillmentConfiguration;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /* renamed from: toFulfillmentConfiguration-6UYloQk, reason: not valid java name */
    public static final FulfillmentConfiguration m1240toFulfillmentConfiguration6UYloQk(Fulfillment fulfillment, String str, LocalMoney localMoney) {
        fulfillment.getClass();
        str.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[fulfillment.f911type.ordinal()]) {
            case 1:
                return new FulfillmentConfiguration.Pickup(str, fulfillment.estimatedCompletionTime, fulfillment.estimatedCompletionDuration, fulfillment.schedulingDetails);
            case 2:
                return new FulfillmentConfiguration.Delivery(str, fulfillment.estimatedCompletionTime, fulfillment.estimatedCompletionDuration, fulfillment.schedulingDetails, fulfillment.deliveryDetails, localMoney);
            case 3:
                LocalFulfillment.InStoreDetails inStoreDetails = fulfillment.inStoreDetails;
                if (inStoreDetails == null) {
                    inStoreDetails = new LocalFulfillment.InStoreDetails(null, null, null, 7, null);
                }
                return new FulfillmentConfiguration.InStore(str, inStoreDetails);
            case 4:
            case 5:
            case 6:
                return FulfillmentConfiguration.Unspecified.INSTANCE;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    public static final LocalFulfillment toProtoFulfillment(FulfillmentConfiguration fulfillmentConfiguration) {
        LocalFulfillment.EstimatedCompletionDuration estimatedCompletionDuration;
        fulfillmentConfiguration.getClass();
        LocalFulfillmentType type2 = getType(fulfillmentConfiguration);
        EstimatedCompletionTime estimatedCompletionTime = fulfillmentConfiguration.getEstimatedCompletionTime();
        LocalFulfillment.EstimatedCompletionTime estimatedCompletionTime2 = estimatedCompletionTime != null ? new LocalFulfillment.EstimatedCompletionTime(Long.valueOf(estimatedCompletionTime.earliest.toEpochMilli()), Long.valueOf(estimatedCompletionTime.latest.toEpochMilli()), null, 4, null) : null;
        EstimatedCompletionDuration estimatedCompletionDuration2 = fulfillmentConfiguration.getEstimatedCompletionDuration();
        if (estimatedCompletionDuration2 != null) {
            Long valueOf = Long.valueOf(Duration.m4167getInWholeMillisecondsimpl(estimatedCompletionDuration2.earliest));
            Duration duration = estimatedCompletionDuration2.latest;
            estimatedCompletionDuration = new LocalFulfillment.EstimatedCompletionDuration(valueOf, duration != null ? Long.valueOf(Duration.m4167getInWholeMillisecondsimpl(duration.rawValue)) : null, null, 4, null);
        } else {
            estimatedCompletionDuration = null;
        }
        FulfillmentConfiguration.Delivery asDelivery = getAsDelivery(fulfillmentConfiguration);
        LocalFulfillment.DeliveryDetails deliveryDetails = asDelivery != null ? asDelivery.deliveryDetails : null;
        LocalFulfillment.SchedulingDetails schedulingDetails = fulfillmentConfiguration.getSchedulingDetails();
        FulfillmentConfiguration.InStore asInStore = getAsInStore(fulfillmentConfiguration);
        return new LocalFulfillment(type2, null, estimatedCompletionTime2, estimatedCompletionDuration, deliveryDetails, schedulingDetails, asInStore != null ? asInStore.inStoreDetails : null, null, null, ByteString.EMPTY);
    }
}
