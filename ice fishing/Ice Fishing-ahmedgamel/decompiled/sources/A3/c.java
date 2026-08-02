package A3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class c extends V.b {
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    /* renamed from: v, reason: collision with root package name */
    public boolean f97v;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f97v = parcel.readInt() == 1;
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f97v ? 1 : 0);
    }
}
