package Z;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new F0.b(6);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1458a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1459b;

    /* renamed from: c, reason: collision with root package name */
    public C0054b[] f1460c;

    /* renamed from: d, reason: collision with root package name */
    public int f1461d;
    public String e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f1462f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1463g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f1464h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1458a);
        parcel.writeStringList(this.f1459b);
        parcel.writeTypedArray(this.f1460c, i);
        parcel.writeInt(this.f1461d);
        parcel.writeString(this.e);
        parcel.writeStringList(this.f1462f);
        parcel.writeTypedList(this.f1463g);
        parcel.writeTypedList(this.f1464h);
    }
}
