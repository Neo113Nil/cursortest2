package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class n90 implements Parcelable {
    public static final Parcelable.Creator<n90> CREATOR = new SMax8wMR(14);
    public int MdtA4re8;
    public int NCTxEWno;
    public boolean VgvYg0wo;
    public int[] wxUZMvaN;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.NCTxEWno + ", mGapDir=" + this.MdtA4re8 + ", mHasUnwantedGapAfter=" + this.VgvYg0wo + ", mGapPerSpan=" + Arrays.toString(this.wxUZMvaN) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.NCTxEWno);
        parcel.writeInt(this.MdtA4re8);
        parcel.writeInt(this.VgvYg0wo ? 1 : 0);
        int[] iArr = this.wxUZMvaN;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.wxUZMvaN);
        }
    }
}
