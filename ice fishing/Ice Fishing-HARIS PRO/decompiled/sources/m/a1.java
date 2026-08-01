package m;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a1 extends T.b {
    public static final Parcelable.Creator<a1> CREATOR = new B.h(10);

    /* renamed from: c, reason: collision with root package name */
    public int f3910c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3911d;

    public a1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3910c = parcel.readInt();
        this.f3911d = parcel.readInt() != 0;
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f3910c);
        parcel.writeInt(this.f3911d ? 1 : 0);
    }
}
