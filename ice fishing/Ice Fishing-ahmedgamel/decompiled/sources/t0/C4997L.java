package t0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: t0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4997L extends V.b {
    public static final Parcelable.Creator<C4997L> CREATOR = new B.g(9);

    /* renamed from: v, reason: collision with root package name */
    public Parcelable f40564v;

    public C4997L(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f40564v = parcel.readParcelable(classLoader == null ? AbstractC4990E.class.getClassLoader() : classLoader);
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f40564v, 0);
    }
}
