package L;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new A.l(3);

    /* renamed from: a, reason: collision with root package name */
    public int f574a;

    /* renamed from: b, reason: collision with root package name */
    public int f575b;

    /* renamed from: c, reason: collision with root package name */
    public int f576c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f577d;

    /* renamed from: e, reason: collision with root package name */
    public int f578e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f579f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f580g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f581h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f582i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f583j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f574a);
        parcel.writeInt(this.f575b);
        parcel.writeInt(this.f576c);
        if (this.f576c > 0) {
            parcel.writeIntArray(this.f577d);
        }
        parcel.writeInt(this.f578e);
        if (this.f578e > 0) {
            parcel.writeIntArray(this.f579f);
        }
        parcel.writeInt(this.f581h ? 1 : 0);
        parcel.writeInt(this.f582i ? 1 : 0);
        parcel.writeInt(this.f583j ? 1 : 0);
        parcel.writeList(this.f580g);
    }
}
