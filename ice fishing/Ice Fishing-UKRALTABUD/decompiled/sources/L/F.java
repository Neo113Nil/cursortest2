package L;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class F extends C.c {
    public static final Parcelable.Creator<F> CREATOR = new C.b(1);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f555c;

    public F(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f555c = parcel.readParcelable(classLoader == null ? x.class.getClassLoader() : classLoader);
    }

    @Override // C.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.f555c, 0);
    }
}
