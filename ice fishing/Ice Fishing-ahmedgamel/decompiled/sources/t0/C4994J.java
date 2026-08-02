package t0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: t0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4994J extends V.b {
    public static final Parcelable.Creator<C4994J> CREATOR = new A3.b(10);

    /* renamed from: v, reason: collision with root package name */
    public Parcelable f40614v;

    public C4994J(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f40614v = parcel.readParcelable(classLoader == null ? AbstractC4987C.class.getClassLoader() : classLoader);
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f40614v, 0);
    }
}
