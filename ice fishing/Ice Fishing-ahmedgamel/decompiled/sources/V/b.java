package V;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: n, reason: collision with root package name */
    public final Parcelable f3390n;

    /* renamed from: u, reason: collision with root package name */
    public static final a f3389u = new a();
    public static final Parcelable.Creator<b> CREATOR = new A3.b(5);

    public b() {
        this.f3390n = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3390n, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f3390n = parcelable == f3389u ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f3390n = readParcelable == null ? f3389u : readParcelable;
    }
}
