package app.cash.local.primitives;

import com.squareup.protos.cash.local.client.v1.LocalEstimatedCompletionDuration;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalText;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes3.dex */
public abstract class EstimatedCompletionDurationKt {
    public static final EstimatedCompletionDuration toEstimatedCompletionDuration(LocalEstimatedCompletionDuration localEstimatedCompletionDuration) {
        String str;
        localEstimatedCompletionDuration.getClass();
        Duration.Companion companion = Duration.Companion;
        Long l = localEstimatedCompletionDuration.earliest_within_hours;
        if (l == null) {
            l = localEstimatedCompletionDuration.earliest;
            l.getClass();
        }
        long duration = DurationKt.toDuration(l.longValue(), DurationUnit.MILLISECONDS);
        LocalText localText = localEstimatedCompletionDuration.earliest_within_hours_friendly_fulfillment_time;
        if (localText == null || (str = localText.text) == null || StringsKt.isBlank(str)) {
            localText = null;
        }
        return new EstimatedCompletionDuration(duration, null, localText);
    }

    public static final EstimatedCompletionDuration toEstimatedCompletionDuration(LocalFulfillment.EstimatedCompletionDuration estimatedCompletionDuration) {
        estimatedCompletionDuration.getClass();
        Duration.Companion companion = Duration.Companion;
        Long l = estimatedCompletionDuration.earliest;
        l.getClass();
        long longValue = l.longValue();
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        long duration = DurationKt.toDuration(longValue, durationUnit);
        Long l2 = estimatedCompletionDuration.latest;
        return new EstimatedCompletionDuration(duration, l2 != null ? new Duration(DurationKt.toDuration(l2.longValue(), durationUnit)) : null, null);
    }
}
