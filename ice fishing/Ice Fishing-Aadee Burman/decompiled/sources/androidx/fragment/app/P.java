package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class P implements Parcelable {
    public static final Parcelable.Creator<P> CREATOR = new B8.d(23);

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f4875A;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f4876n;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f4877u;

    /* renamed from: v, reason: collision with root package name */
    public C0459b[] f4878v;

    /* renamed from: w, reason: collision with root package name */
    public int f4879w;

    /* renamed from: x, reason: collision with root package name */
    public String f4880x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f4881y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f4882z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f4876n);
        parcel.writeStringList(this.f4877u);
        parcel.writeTypedArray(this.f4878v, i);
        parcel.writeInt(this.f4879w);
        parcel.writeString(this.f4880x);
        parcel.writeStringList(this.f4881y);
        parcel.writeTypedList(this.f4882z);
        parcel.writeTypedList(this.f4875A);
    }
}
