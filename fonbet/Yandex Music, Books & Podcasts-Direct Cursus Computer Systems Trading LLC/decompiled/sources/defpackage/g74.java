package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class g74 extends l9 {
    public final String a;
    public final String b;
    public final d3x c;
    public final mfj d;
    public final boolean e;
    public final boolean f;
    public static final msg g = new msg("CastMediaOptions", null);

    @NonNull
    public static final Parcelable.Creator<g74> CREATOR = new vzw(2);

    public g74(String str, String str2, IBinder iBinder, mfj mfjVar, boolean z, boolean z2) {
        d3x d3xVar;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            d3xVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            d3xVar = queryLocalInterface instanceof d3x ? (d3x) queryLocalInterface : new d3x(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 2);
        }
        this.c = d3xVar;
        this.d = mfjVar;
        this.e = z;
        this.f = z2;
    }

    public final void d() {
        d3x d3xVar = this.c;
        if (d3xVar != null) {
            try {
                Parcel N0 = d3xVar.N0(d3xVar.M0(), 2);
                l9e S0 = zhj.S0(N0.readStrongBinder());
                N0.recycle();
                if (zhj.T0(S0) == null) {
                } else {
                    throw new ClassCastException();
                }
            } catch (RemoteException e) {
                g.a(e, "Unable to call %s on %s.", "getWrappedClientObject", d3x.class.getSimpleName());
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 2, this.a);
        o8g.j0(parcel, 3, this.b);
        d3x d3xVar = this.c;
        o8g.d0(parcel, 4, d3xVar == null ? null : d3xVar.h);
        o8g.i0(parcel, 5, this.d, i);
        o8g.q0(6, 4, parcel);
        parcel.writeInt(this.e ? 1 : 0);
        o8g.q0(7, 4, parcel);
        parcel.writeInt(this.f ? 1 : 0);
        o8g.p0(parcel, o0);
    }
}
