package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class c20 extends VgvYg0wo {
    public static final Parcelable.Creator<c20> CREATOR = new wxUZMvaN(4);
    public Parcelable wxUZMvaN;

    public c20(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.wxUZMvaN = parcel.readParcelable(classLoader == null ? t10.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.VgvYg0wo, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.wxUZMvaN, 0);
    }
}
