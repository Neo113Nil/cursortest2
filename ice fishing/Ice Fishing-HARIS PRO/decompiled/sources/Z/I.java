package Z;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class I implements Parcelable {
    public static final Parcelable.Creator<I> CREATOR = new F0.b(5);

    /* renamed from: a, reason: collision with root package name */
    public String f1414a;

    /* renamed from: b, reason: collision with root package name */
    public int f1415b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1414a);
        parcel.writeInt(this.f1415b);
    }
}
