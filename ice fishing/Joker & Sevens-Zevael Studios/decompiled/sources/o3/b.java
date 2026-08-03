package o3;

import android.os.Parcel;
import android.os.Parcelable;
import w0.p;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: g, reason: collision with root package name */
    public final Parcelable f5182g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f5181h = new a();
    public static final Parcelable.Creator<b> CREATOR = new p(3);

    public b() {
        this.f5182g = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f5182g, i10);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f5182g = parcelable == f5181h ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f5182g = readParcelable == null ? f5181h : readParcelable;
    }
}
