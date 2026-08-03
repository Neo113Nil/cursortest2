package m;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f1 extends o3.b {
    public static final Parcelable.Creator<f1> CREATOR = new w0.p(1);

    /* renamed from: i, reason: collision with root package name */
    public boolean f4296i;

    public f1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4296i = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f4296i + "}";
    }

    @Override // o3.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeValue(Boolean.valueOf(this.f4296i));
    }
}
