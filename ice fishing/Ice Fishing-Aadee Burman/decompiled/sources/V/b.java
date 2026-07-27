package V;

import B.g;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: n, reason: collision with root package name */
    public final Parcelable f3267n;

    /* renamed from: u, reason: collision with root package name */
    public static final a f3266u = new a();
    public static final Parcelable.Creator<b> CREATOR = new g(4);

    public b() {
        this.f3267n = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3267n, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f3267n = parcelable == f3266u ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f3267n = readParcelable == null ? f3266u : readParcelable;
    }
}
