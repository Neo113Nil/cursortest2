package h;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a0 extends E.c {
    public static final Parcelable.Creator<a0> CREATOR = new E.b(2);

    /* renamed from: c, reason: collision with root package name */
    public boolean f3209c;

    public a0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3209c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f3209c + "}";
    }

    @Override // E.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeValue(Boolean.valueOf(this.f3209c));
    }
}
