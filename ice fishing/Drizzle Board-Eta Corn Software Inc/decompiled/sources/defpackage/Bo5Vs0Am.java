package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class Bo5Vs0Am implements Parcelable {
    public static final Parcelable.Creator<Bo5Vs0Am> CREATOR = new SMax8wMR(1);
    public final Intent MdtA4re8;
    public final int NCTxEWno;

    public Bo5Vs0Am(Parcel parcel) {
        this.NCTxEWno = parcel.readInt();
        this.MdtA4re8 = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.NCTxEWno;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.MdtA4re8);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.NCTxEWno);
        Intent intent = this.MdtA4re8;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public Bo5Vs0Am(int i, Intent intent) {
        this.NCTxEWno = i;
        this.MdtA4re8 = intent;
    }
}
