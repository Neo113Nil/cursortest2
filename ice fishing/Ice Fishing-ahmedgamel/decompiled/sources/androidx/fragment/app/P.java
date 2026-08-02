package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class P implements Parcelable {
    public static final Parcelable.Creator<P> CREATOR = new B8.d(23);

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f4843A;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f4844n;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f4845u;

    /* renamed from: v, reason: collision with root package name */
    public C0463b[] f4846v;

    /* renamed from: w, reason: collision with root package name */
    public int f4847w;

    /* renamed from: x, reason: collision with root package name */
    public String f4848x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f4849y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f4850z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f4844n);
        parcel.writeStringList(this.f4845u);
        parcel.writeTypedArray(this.f4846v, i);
        parcel.writeInt(this.f4847w);
        parcel.writeString(this.f4848x);
        parcel.writeStringList(this.f4849y);
        parcel.writeTypedList(this.f4850z);
        parcel.writeTypedList(this.f4843A);
    }
}
