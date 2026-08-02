package app.cash.local.primitives;

import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import java.time.Instant;

/* loaded from: classes3.dex */
public abstract class EstimatedCompletionTimeKt {
    public static final EstimatedCompletionTime toEstimatedCompletionTime(LocalFulfillment.EstimatedCompletionTime estimatedCompletionTime) {
        long longValue;
        estimatedCompletionTime.getClass();
        Long l = estimatedCompletionTime.earliest;
        l.getClass();
        Instant ofEpochMilli = Instant.ofEpochMilli(l.longValue());
        ofEpochMilli.getClass();
        Long l2 = estimatedCompletionTime.latest;
        if (l2 != null) {
            longValue = l2.longValue();
        } else {
            Long l3 = estimatedCompletionTime.earliest;
            l3.getClass();
            longValue = l3.longValue();
        }
        Instant ofEpochMilli2 = Instant.ofEpochMilli(longValue);
        ofEpochMilli2.getClass();
        return new EstimatedCompletionTime(ofEpochMilli, ofEpochMilli2);
    }
}
