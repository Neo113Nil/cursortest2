package q3;

import B.g;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: q3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4922b extends V.b {
    public static final Parcelable.Creator<C4922b> CREATOR = new g(8);

    /* renamed from: v, reason: collision with root package name */
    public boolean f40218v;

    public C4922b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C4922b.class.getClassLoader();
        }
        this.f40218v = parcel.readInt() == 1;
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f40218v ? 1 : 0);
    }
}
