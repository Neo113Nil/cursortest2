package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.Line;
import com.squareup.protos.cash.local.client.v1.LocalText;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* loaded from: classes3.dex */
public final class EstimatedCompletionDuration implements Parcelable {
    public static final Parcelable.Creator<EstimatedCompletionDuration> CREATOR = new Line.Creator(9);
    public final long earliest;
    public final LocalText friendlyFulfillmentTime;
    public final Duration latest;

    public EstimatedCompletionDuration(long j, Duration duration, LocalText localText) {
        this.earliest = j;
        this.latest = duration;
        this.friendlyFulfillmentTime = localText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EstimatedCompletionDuration)) {
            return false;
        }
        EstimatedCompletionDuration estimatedCompletionDuration = (EstimatedCompletionDuration) obj;
        return Duration.m4166equalsimpl0(this.earliest, estimatedCompletionDuration.earliest) && Intrinsics.areEqual(this.latest, estimatedCompletionDuration.latest) && Intrinsics.areEqual(this.friendlyFulfillmentTime, estimatedCompletionDuration.friendlyFulfillmentTime);
    }

    public final int hashCode() {
        Duration.Companion companion = Duration.Companion;
        int hashCode = Long.hashCode(this.earliest) * 31;
        Duration duration = this.latest;
        int hashCode2 = (hashCode + (duration == null ? 0 : Long.hashCode(duration.rawValue))) * 31;
        LocalText localText = this.friendlyFulfillmentTime;
        return hashCode2 + (localText != null ? localText.hashCode() : 0);
    }

    public final String toString() {
        return "EstimatedCompletionDuration(earliest=" + Duration.m4177toStringimpl(this.earliest) + ", latest=" + this.latest + ", friendlyFulfillmentTime=" + this.friendlyFulfillmentTime + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.earliest);
        Duration duration = this.latest;
        if (duration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(duration.rawValue);
        }
        parcel.writeParcelable(this.friendlyFulfillmentTime, i);
    }
}
