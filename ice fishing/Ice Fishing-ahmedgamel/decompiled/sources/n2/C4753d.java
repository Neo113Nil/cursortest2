package n2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.BinderC4143x8;
import h3.C4566c;
import q2.U;
import q2.V;

/* renamed from: n2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4753d extends Q2.a {
    public static final Parcelable.Creator<C4753d> CREATOR = new C4566c(5);

    /* renamed from: n, reason: collision with root package name */
    public final boolean f39468n;

    /* renamed from: u, reason: collision with root package name */
    public final V f39469u;

    /* renamed from: v, reason: collision with root package name */
    public final IBinder f39470v;

    public C4753d(boolean z3, IBinder iBinder, IBinder iBinder2) {
        V v9;
        this.f39468n = z3;
        if (iBinder != null) {
            int i = BinderC4143x8.f34960u;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            v9 = queryLocalInterface instanceof V ? (V) queryLocalInterface : new U(iBinder);
        } else {
            v9 = null;
        }
        this.f39469u = v9;
        this.f39470v = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.F(parcel, 1, 4);
        parcel.writeInt(this.f39468n ? 1 : 0);
        V v9 = this.f39469u;
        A8.b.x(parcel, 2, v9 == null ? null : v9.asBinder());
        A8.b.x(parcel, 3, this.f39470v);
        A8.b.I(parcel, G7);
    }
}
