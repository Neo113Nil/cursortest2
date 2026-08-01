package C0;

import B.h;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b extends T.b {
    public static final Parcelable.Creator<b> CREATOR = new h(2);

    /* renamed from: c, reason: collision with root package name */
    public boolean f80c;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f80c = parcel.readInt() == 1;
    }

    @Override // T.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f80c ? 1 : 0);
    }
}
