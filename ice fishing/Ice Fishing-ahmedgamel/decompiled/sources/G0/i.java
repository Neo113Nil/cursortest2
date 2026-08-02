package G0;

import android.os.Parcel;
import android.os.Parcelable;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class i extends V.b {
    public static final Parcelable.Creator<i> CREATOR = new A3.b(2);

    /* renamed from: v, reason: collision with root package name */
    public int f1071v;

    /* renamed from: w, reason: collision with root package name */
    public Parcelable f1072w;

    public i(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? i.class.getClassLoader() : classLoader;
        this.f1071v = parcel.readInt();
        this.f1072w = parcel.readParcelable(classLoader);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return AbstractC5128c.e(this.f1071v, "}", sb);
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1071v);
        parcel.writeParcelable(this.f1072w, i);
    }
}
