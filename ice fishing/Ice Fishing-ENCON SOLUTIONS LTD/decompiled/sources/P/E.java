package P;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class E extends E.c {
    public static final Parcelable.Creator<E> CREATOR = new E.b(1);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f1259c;

    public E(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1259c = parcel.readParcelable(classLoader == null ? w.class.getClassLoader() : classLoader);
    }

    @Override // E.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f1259c, 0);
    }
}
