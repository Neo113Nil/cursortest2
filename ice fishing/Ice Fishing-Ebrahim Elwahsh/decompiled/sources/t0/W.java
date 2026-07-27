package t0;

import android.os.Parcel;
import android.os.Parcelable;
import f3.C4509h;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class W implements Parcelable {
    public static final Parcelable.Creator<W> CREATOR = new C4509h(11);

    /* renamed from: A, reason: collision with root package name */
    public boolean f40648A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f40649B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f40650C;

    /* renamed from: n, reason: collision with root package name */
    public int f40651n;

    /* renamed from: u, reason: collision with root package name */
    public int f40652u;

    /* renamed from: v, reason: collision with root package name */
    public int f40653v;

    /* renamed from: w, reason: collision with root package name */
    public int[] f40654w;

    /* renamed from: x, reason: collision with root package name */
    public int f40655x;

    /* renamed from: y, reason: collision with root package name */
    public int[] f40656y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f40657z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f40651n);
        parcel.writeInt(this.f40652u);
        parcel.writeInt(this.f40653v);
        if (this.f40653v > 0) {
            parcel.writeIntArray(this.f40654w);
        }
        parcel.writeInt(this.f40655x);
        if (this.f40655x > 0) {
            parcel.writeIntArray(this.f40656y);
        }
        parcel.writeInt(this.f40648A ? 1 : 0);
        parcel.writeInt(this.f40649B ? 1 : 0);
        parcel.writeInt(this.f40650C ? 1 : 0);
        parcel.writeList(this.f40657z);
    }
}
