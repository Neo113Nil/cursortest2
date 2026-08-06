package P;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: P.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066o implements Parcelable {
    public static final Parcelable.Creator<C0066o> CREATOR = new C.l(4);

    /* renamed from: a, reason: collision with root package name */
    public int f1362a;

    /* renamed from: b, reason: collision with root package name */
    public int f1363b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1364c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f1362a);
        parcel.writeInt(this.f1363b);
        parcel.writeInt(this.f1364c ? 1 : 0);
    }
}
