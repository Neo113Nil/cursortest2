package s3;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: s3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4971b extends V.b {
    public static final Parcelable.Creator<C4971b> CREATOR = new A3.b(9);

    /* renamed from: v, reason: collision with root package name */
    public boolean f40517v;

    public C4971b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C4971b.class.getClassLoader();
        }
        this.f40517v = parcel.readInt() == 1;
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f40517v ? 1 : 0);
    }
}
