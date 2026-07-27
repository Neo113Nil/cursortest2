package G0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j extends V.b {
    public static final Parcelable.Creator<j> CREATOR = new B.g(2);

    /* renamed from: v, reason: collision with root package name */
    public int f1047v;

    /* renamed from: w, reason: collision with root package name */
    public Parcelable f1048w;

    public j(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? j.class.getClassLoader() : classLoader;
        this.f1047v = parcel.readInt();
        this.f1048w = parcel.readParcelable(classLoader);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return u1.h.e(this.f1047v, "}", sb);
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1047v);
        parcel.writeParcelable(this.f1048w, i);
    }
}
