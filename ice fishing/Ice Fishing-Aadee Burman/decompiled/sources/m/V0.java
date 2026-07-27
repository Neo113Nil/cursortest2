package m;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class V0 extends V.b {
    public static final Parcelable.Creator<V0> CREATOR = new B.g(6);

    /* renamed from: v, reason: collision with root package name */
    public int f39076v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f39077w;

    public V0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f39076v = parcel.readInt();
        this.f39077w = parcel.readInt() != 0;
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f39076v);
        parcel.writeInt(this.f39077w ? 1 : 0);
    }
}
