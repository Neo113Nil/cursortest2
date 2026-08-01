package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class K implements Parcelable {
    public static final Parcelable.Creator<K> CREATOR = new B8.d(22);

    /* renamed from: n, reason: collision with root package name */
    public String f4834n;

    /* renamed from: u, reason: collision with root package name */
    public int f4835u;

    public K(String str, int i) {
        this.f4834n = str;
        this.f4835u = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4834n);
        parcel.writeInt(this.f4835u);
    }
}
