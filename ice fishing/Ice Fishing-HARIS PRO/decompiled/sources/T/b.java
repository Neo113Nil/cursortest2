package T;

import B.h;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f1147a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f1146b = new a();
    public static final Parcelable.Creator<b> CREATOR = new h(6);

    public b() {
        this.f1147a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1147a, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f1147a = parcelable == f1146b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f1147a = readParcelable == null ? f1146b : readParcelable;
    }
}
