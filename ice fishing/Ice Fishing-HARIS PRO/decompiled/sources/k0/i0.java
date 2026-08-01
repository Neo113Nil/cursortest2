package k0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i0 implements Parcelable {
    public static final Parcelable.Creator<i0> CREATOR = new F0.b(16);

    /* renamed from: a, reason: collision with root package name */
    public int f3507a;

    /* renamed from: b, reason: collision with root package name */
    public int f3508b;

    /* renamed from: c, reason: collision with root package name */
    public int f3509c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f3510d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f3511f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f3512g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3513h;
    public boolean i;
    public boolean j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3507a);
        parcel.writeInt(this.f3508b);
        parcel.writeInt(this.f3509c);
        if (this.f3509c > 0) {
            parcel.writeIntArray(this.f3510d);
        }
        parcel.writeInt(this.e);
        if (this.e > 0) {
            parcel.writeIntArray(this.f3511f);
        }
        parcel.writeInt(this.f3513h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeList(this.f3512g);
    }
}
