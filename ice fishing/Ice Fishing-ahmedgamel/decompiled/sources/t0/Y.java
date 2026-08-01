package t0;

import android.os.Parcel;
import android.os.Parcelable;
import h3.C4566c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Y implements Parcelable {
    public static final Parcelable.Creator<Y> CREATOR = new C4566c(11);

    /* renamed from: A, reason: collision with root package name */
    public boolean f40626A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f40627B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f40628C;

    /* renamed from: n, reason: collision with root package name */
    public int f40629n;

    /* renamed from: u, reason: collision with root package name */
    public int f40630u;

    /* renamed from: v, reason: collision with root package name */
    public int f40631v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f40632w;

    /* renamed from: x, reason: collision with root package name */
    public int f40633x;

    /* renamed from: y, reason: collision with root package name */
    public int[] f40634y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f40635z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f40629n);
        parcel.writeInt(this.f40630u);
        parcel.writeInt(this.f40631v);
        if (this.f40631v > 0) {
            parcel.writeIntArray(this.f40632w);
        }
        parcel.writeInt(this.f40633x);
        if (this.f40633x > 0) {
            parcel.writeIntArray(this.f40634y);
        }
        parcel.writeInt(this.f40626A ? 1 : 0);
        parcel.writeInt(this.f40627B ? 1 : 0);
        parcel.writeInt(this.f40628C ? 1 : 0);
        parcel.writeList(this.f40635z);
    }
}
