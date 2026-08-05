package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ad0 extends VgvYg0wo {
    public static final Parcelable.Creator<ad0> CREATOR = new wxUZMvaN(5);
    public boolean VgvYg0wo;
    public int wxUZMvaN;

    public ad0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.wxUZMvaN = parcel.readInt();
        this.VgvYg0wo = parcel.readInt() != 0;
    }

    @Override // defpackage.VgvYg0wo, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.wxUZMvaN);
        parcel.writeInt(this.VgvYg0wo ? 1 : 0);
    }
}
