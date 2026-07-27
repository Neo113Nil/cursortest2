package C;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class c implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f55a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f54b = new a();
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    public c() {
        this.f55a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f55a, i2);
    }

    public c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f55a = parcelable == f54b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f55a = readParcelable == null ? f54b : readParcelable;
    }
}
