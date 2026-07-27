package y3;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: y3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5233a extends V.b {
    public static final Parcelable.Creator<C5233a> CREATOR = new B.g(10);

    /* renamed from: v, reason: collision with root package name */
    public boolean f41843v;

    public C5233a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f41843v = parcel.readInt() == 1;
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f41843v ? 1 : 0);
    }
}
