package L0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends T.b {
    public static final Parcelable.Creator<a> CREATOR = new B.h(3);

    /* renamed from: c, reason: collision with root package name */
    public boolean f440c;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f440c = parcel.readInt() == 1;
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f440c ? 1 : 0);
    }
}
