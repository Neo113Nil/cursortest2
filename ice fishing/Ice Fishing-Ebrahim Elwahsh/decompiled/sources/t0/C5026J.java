package t0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: t0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5026J extends V.b {
    public static final Parcelable.Creator<C5026J> CREATOR = new B.g(9);

    /* renamed from: v, reason: collision with root package name */
    public Parcelable f40586v;

    public C5026J(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f40586v = parcel.readParcelable(classLoader == null ? AbstractC5019C.class.getClassLoader() : classLoader);
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f40586v, 0);
    }
}
