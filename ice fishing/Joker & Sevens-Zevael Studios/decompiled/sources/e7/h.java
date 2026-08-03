package e7;

import android.os.Parcel;
import android.os.Parcelable;
import p6.q;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends q6.a {
    public static final Parcelable.Creator<h> CREATOR = new c(2);

    /* renamed from: g, reason: collision with root package name */
    public final int f2128g;

    /* renamed from: h, reason: collision with root package name */
    public final m6.b f2129h;

    /* renamed from: i, reason: collision with root package name */
    public final q f2130i;

    public h(int i10, m6.b bVar, q qVar) {
        this.f2128g = i10;
        this.f2129h = bVar;
        this.f2130i = qVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int g02 = x4.f.g0(parcel, 20293);
        x4.f.i0(parcel, 1, 4);
        parcel.writeInt(this.f2128g);
        x4.f.b0(parcel, 2, this.f2129h, i10);
        x4.f.b0(parcel, 3, this.f2130i, i10);
        x4.f.h0(parcel, g02);
    }
}
