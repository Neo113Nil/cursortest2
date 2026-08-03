package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import e7.c;
import n4.b;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new c(9);

    /* renamed from: g, reason: collision with root package name */
    public final n4.c f741g;

    public ParcelImpl(Parcel parcel) {
        this.f741g = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        new b(parcel).i(this.f741g);
    }
}
