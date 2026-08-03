package e7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends q6.a {
    public static final Parcelable.Creator<b> CREATOR = new c(0);

    /* renamed from: g, reason: collision with root package name */
    public final int f2122g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2123h;

    /* renamed from: i, reason: collision with root package name */
    public final Intent f2124i;

    public b(int i10, int i11, Intent intent) {
        this.f2122g = i10;
        this.f2123h = i11;
        this.f2124i = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int g02 = x4.f.g0(parcel, 20293);
        x4.f.i0(parcel, 1, 4);
        parcel.writeInt(this.f2122g);
        x4.f.i0(parcel, 2, 4);
        parcel.writeInt(this.f2123h);
        x4.f.b0(parcel, 3, this.f2124i, i10);
        x4.f.h0(parcel, g02);
    }
}
