package k0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class U extends T.b {
    public static final Parcelable.Creator<U> CREATOR = new B.h(9);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f3415c;

    public U(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3415c = parcel.readParcelable(classLoader == null ? K.class.getClassLoader() : classLoader);
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f3415c, 0);
    }
}
