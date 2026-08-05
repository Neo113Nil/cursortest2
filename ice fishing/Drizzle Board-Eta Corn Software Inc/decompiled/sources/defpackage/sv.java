package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class sv extends VgvYg0wo {
    public static final Parcelable.Creator<sv> CREATOR = new wxUZMvaN(2);
    public Bundle wxUZMvaN;

    public sv(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.wxUZMvaN = parcel.readBundle(classLoader == null ? sv.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.VgvYg0wo, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.wxUZMvaN);
    }
}
