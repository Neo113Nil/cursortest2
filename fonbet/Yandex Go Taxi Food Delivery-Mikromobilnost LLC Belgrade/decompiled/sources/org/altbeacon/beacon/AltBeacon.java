package org.altbeacon.beacon;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class AltBeacon extends Beacon {
    public static final Parcelable.Creator<AltBeacon> CREATOR = new Parcelable.Creator<AltBeacon>() { // from class: org.altbeacon.beacon.AltBeacon.1
        @Override // android.os.Parcelable.Creator
        public AltBeacon createFromParcel(Parcel parcel) {
            return new AltBeacon(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public AltBeacon[] newArray(int i) {
            return new AltBeacon[i];
        }
    };
    private static final String TAG = "AltBeacon";

    public AltBeacon(Beacon beacon) {
        super(beacon);
    }

    @Override // org.altbeacon.beacon.Beacon, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getMfgReserved() {
        return this.mDataFields.get(0).intValue();
    }

    @Override // org.altbeacon.beacon.Beacon, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    public AltBeacon() {
    }

    public AltBeacon(Parcel parcel) {
        super(parcel);
    }
}
