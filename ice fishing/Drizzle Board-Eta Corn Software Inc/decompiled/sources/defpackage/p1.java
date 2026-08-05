package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class p1 implements Parcelable {
    public static final Parcelable.Creator<p1> CREATOR = new SMax8wMR(4);
    public final ArrayList MdtA4re8;
    public final ArrayList NCTxEWno;

    public p1(Parcel parcel) {
        this.NCTxEWno = parcel.createStringArrayList();
        this.MdtA4re8 = parcel.createTypedArrayList(o1.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.NCTxEWno);
        parcel.writeTypedList(this.MdtA4re8);
    }

    public p1(ArrayList arrayList, ArrayList arrayList2) {
        this.NCTxEWno = arrayList;
        this.MdtA4re8 = arrayList2;
    }
}
