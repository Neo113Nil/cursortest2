package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class P implements Parcelable {
    public static final Parcelable.Creator<P> CREATOR = new F0.a(21);

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f4987A;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f4988n;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f4989u;

    /* renamed from: v, reason: collision with root package name */
    public C0469b[] f4990v;

    /* renamed from: w, reason: collision with root package name */
    public int f4991w;

    /* renamed from: x, reason: collision with root package name */
    public String f4992x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f4993y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f4994z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f4988n);
        parcel.writeStringList(this.f4989u);
        parcel.writeTypedArray(this.f4990v, i);
        parcel.writeInt(this.f4991w);
        parcel.writeString(this.f4992x);
        parcel.writeStringList(this.f4993y);
        parcel.writeTypedList(this.f4994z);
        parcel.writeTypedList(this.f4987A);
    }
}
