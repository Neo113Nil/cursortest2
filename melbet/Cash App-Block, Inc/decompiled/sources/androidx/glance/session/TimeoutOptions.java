package androidx.glance.session;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes3.dex */
public final class TimeoutOptions {
    public final long additionalTime;
    public final long idleTimeout;
    public final long initialTimeout;
    public final DifferentialMotionFlingController$$ExternalSyntheticLambda0 timeSource;

    public TimeoutOptions() {
        Duration.Companion companion = Duration.Companion;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        long duration = DurationKt.toDuration(45, durationUnit);
        long duration2 = DurationKt.toDuration(5, durationUnit);
        long duration3 = DurationKt.toDuration(5, durationUnit);
        this.initialTimeout = duration;
        this.additionalTime = duration2;
        this.idleTimeout = duration3;
        this.timeSource = TimeSource$Companion.Monotonic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeoutOptions)) {
            return false;
        }
        TimeoutOptions timeoutOptions = (TimeoutOptions) obj;
        return Duration.m4166equalsimpl0(this.initialTimeout, timeoutOptions.initialTimeout) && Duration.m4166equalsimpl0(this.additionalTime, timeoutOptions.additionalTime) && Duration.m4166equalsimpl0(this.idleTimeout, timeoutOptions.idleTimeout) && Intrinsics.areEqual(this.timeSource, timeoutOptions.timeSource);
    }

    public final int hashCode() {
        Duration.Companion companion = Duration.Companion;
        return this.timeSource.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.initialTimeout) * 31, 31, this.additionalTime), 31, this.idleTimeout);
    }

    public final String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) Duration.m4177toStringimpl(this.initialTimeout)) + ", additionalTime=" + ((Object) Duration.m4177toStringimpl(this.additionalTime)) + ", idleTimeout=" + ((Object) Duration.m4177toStringimpl(this.idleTimeout)) + ", timeSource=" + this.timeSource + ')';
    }
}
