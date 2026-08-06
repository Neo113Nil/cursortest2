package P;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class M implements Parcelable {
    public static final Parcelable.Creator<M> CREATOR = new C.l(6);

    /* renamed from: a, reason: collision with root package name */
    public int f1278a;

    /* renamed from: b, reason: collision with root package name */
    public int f1279b;

    /* renamed from: c, reason: collision with root package name */
    public int f1280c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f1281d;

    /* renamed from: e, reason: collision with root package name */
    public int f1282e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f1283f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1284g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1285h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1286i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1287j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f1278a);
        parcel.writeInt(this.f1279b);
        parcel.writeInt(this.f1280c);
        if (this.f1280c > 0) {
            parcel.writeIntArray(this.f1281d);
        }
        parcel.writeInt(this.f1282e);
        if (this.f1282e > 0) {
            parcel.writeIntArray(this.f1283f);
        }
        parcel.writeInt(this.f1285h ? 1 : 0);
        parcel.writeInt(this.f1286i ? 1 : 0);
        parcel.writeInt(this.f1287j ? 1 : 0);
        parcel.writeList(this.f1284g);
    }
}
