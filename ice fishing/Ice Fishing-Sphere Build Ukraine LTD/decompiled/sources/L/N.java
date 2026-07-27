package L;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new A.l(3);

    /* renamed from: a, reason: collision with root package name */
    public int f496a;

    /* renamed from: b, reason: collision with root package name */
    public int f497b;

    /* renamed from: c, reason: collision with root package name */
    public int f498c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f499d;

    /* renamed from: e, reason: collision with root package name */
    public int f500e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f501f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f502g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f503h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f504i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f505j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f496a);
        parcel.writeInt(this.f497b);
        parcel.writeInt(this.f498c);
        if (this.f498c > 0) {
            parcel.writeIntArray(this.f499d);
        }
        parcel.writeInt(this.f500e);
        if (this.f500e > 0) {
            parcel.writeIntArray(this.f501f);
        }
        parcel.writeInt(this.f503h ? 1 : 0);
        parcel.writeInt(this.f504i ? 1 : 0);
        parcel.writeInt(this.f505j ? 1 : 0);
        parcel.writeList(this.f502g);
    }
}
