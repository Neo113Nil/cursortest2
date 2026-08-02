package p2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.BinderC4166x8;
import j3.C4614c;
import s2.U;
import s2.V;

/* renamed from: p2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4833d extends S2.a {
    public static final Parcelable.Creator<C4833d> CREATOR = new C4614c(5);

    /* renamed from: n, reason: collision with root package name */
    public final boolean f39808n;

    /* renamed from: u, reason: collision with root package name */
    public final V f39809u;

    /* renamed from: v, reason: collision with root package name */
    public final IBinder f39810v;

    public C4833d(boolean z6, IBinder iBinder, IBinder iBinder2) {
        V v9;
        this.f39808n = z6;
        if (iBinder != null) {
            int i = BinderC4166x8.f35741u;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            v9 = queryLocalInterface instanceof V ? (V) queryLocalInterface : new U(iBinder);
        } else {
            v9 = null;
        }
        this.f39809u = v9;
        this.f39810v = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = com.bumptech.glide.e.x(parcel, 20293);
        com.bumptech.glide.e.w(parcel, 1, 4);
        parcel.writeInt(this.f39808n ? 1 : 0);
        V v9 = this.f39809u;
        com.bumptech.glide.e.p(parcel, 2, v9 == null ? null : v9.asBinder());
        com.bumptech.glide.e.p(parcel, 3, this.f39810v);
        com.bumptech.glide.e.z(parcel, x9);
    }
}
