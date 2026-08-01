package N0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k extends T.b {
    public static final Parcelable.Creator<k> CREATOR = new B.h(5);

    /* renamed from: c, reason: collision with root package name */
    public Bundle f705c;

    public k(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f705c = parcel.readBundle(classLoader == null ? k.class.getClassLoader() : classLoader);
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.f705c);
    }
}
