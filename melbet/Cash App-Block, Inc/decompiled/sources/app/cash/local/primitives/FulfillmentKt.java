package app.cash.local.primitives;

import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;

/* loaded from: classes3.dex */
public abstract class FulfillmentKt {
    public static final Fulfillment toFulfillment(LocalFulfillment localFulfillment) {
        localFulfillment.getClass();
        LocalFulfillmentType localFulfillmentType = localFulfillment.type;
        if (localFulfillmentType == null) {
            localFulfillmentType = LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED;
        }
        LocalFulfillment.EstimatedCompletionTime estimatedCompletionTime = localFulfillment.estimated_completion_time;
        EstimatedCompletionTime estimatedCompletionTime2 = estimatedCompletionTime != null ? EstimatedCompletionTimeKt.toEstimatedCompletionTime(estimatedCompletionTime) : null;
        LocalFulfillment.EstimatedCompletionDuration estimatedCompletionDuration = localFulfillment.estimated_completion_duration;
        return new Fulfillment(localFulfillmentType, estimatedCompletionTime2, estimatedCompletionDuration != null ? EstimatedCompletionDurationKt.toEstimatedCompletionDuration(estimatedCompletionDuration) : null, localFulfillment.delivery_details, localFulfillment.scheduling_details, localFulfillment.in_store_details);
    }
}
