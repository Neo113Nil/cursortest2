package t0;

import android.os.Parcel;
import android.os.Parcelable;
import h3.C4566c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Y implements Parcelable {
    public static final Parcelable.Creator<Y> CREATOR = new C4566c(11);

    /* renamed from: A, reason: collision with root package name */
    public boolean f40623A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f40624B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f40625C;

    /* renamed from: n, reason: collision with root package name */
    public int f40626n;

    /* renamed from: u, reason: collision with root package name */
    public int f40627u;

    /* renamed from: v, reason: collision with root package name */
    public int f40628v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f40629w;

    /* renamed from: x, reason: collision with root package name */
    public int f40630x;

    /* renamed from: y, reason: collision with root package name */
    public int[] f40631y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f40632z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f40626n);
        parcel.writeInt(this.f40627u);
        parcel.writeInt(this.f40628v);
        if (this.f40628v > 0) {
            parcel.writeIntArray(this.f40629w);
        }
        parcel.writeInt(this.f40630x);
        if (this.f40630x > 0) {
            parcel.writeIntArray(this.f40631y);
        }
        parcel.writeInt(this.f40623A ? 1 : 0);
        parcel.writeInt(this.f40624B ? 1 : 0);
        parcel.writeInt(this.f40625C ? 1 : 0);
        parcel.writeList(this.f40632z);
    }
}
