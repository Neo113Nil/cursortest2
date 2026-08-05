package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class fr extends VgvYg0wo {
    public static final Parcelable.Creator<fr> CREATOR = new wxUZMvaN(1);
    public boolean wxUZMvaN;

    public fr(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            fr.class.getClassLoader();
        }
        this.wxUZMvaN = parcel.readInt() == 1;
    }

    @Override // defpackage.VgvYg0wo, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.wxUZMvaN ? 1 : 0);
    }
}
