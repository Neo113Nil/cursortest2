package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.local.primitives.Line;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class EstimatedCompletionTime implements Parcelable {
    public static final Parcelable.Creator<EstimatedCompletionTime> CREATOR = new Line.Creator(10);
    public final Instant earliest;
    public final Instant latest;

    public EstimatedCompletionTime(Instant instant, Instant instant2) {
        instant.getClass();
        instant2.getClass();
        this.earliest = instant;
        this.latest = instant2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EstimatedCompletionTime)) {
            return false;
        }
        EstimatedCompletionTime estimatedCompletionTime = (EstimatedCompletionTime) obj;
        return Intrinsics.areEqual(this.earliest, estimatedCompletionTime.earliest) && Intrinsics.areEqual(this.latest, estimatedCompletionTime.latest);
    }

    public final int hashCode() {
        return this.latest.hashCode() + (this.earliest.hashCode() * 31);
    }

    public final String toString() {
        return "EstimatedCompletionTime(earliest=" + this.earliest + ", latest=" + this.latest + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.earliest);
        parcel.writeSerializable(this.latest);
    }
}
