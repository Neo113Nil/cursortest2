package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;

/* loaded from: classes.dex */
public final class z8e implements c9e {
    public IBinder a;

    @Override // defpackage.c9e
    public final void B0(u8e u8eVar, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.a.transact(3003, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void C(u8e u8eVar, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            this.a.transact(3026, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void D(u8e u8eVar, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.a.transact(3037, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void E(u8e u8eVar, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            this.a.transact(3005, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void F(u8e u8eVar, int i, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            this.a.transact(3013, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void F0(u8e u8eVar, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            this.a.transact(3046, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void G0(u8e u8eVar, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.a.transact(3017, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void H(u8e u8eVar, int i, Bundle bundle, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            j66.D(obtain, bundle);
            obtain.writeInt(1);
            this.a.transact(3009, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void I(u8e u8eVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            this.a.transact(3045, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void I0(u8e u8eVar, int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.a.transact(3022, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void J(u8e u8eVar, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            j66.D(obtain, bundle);
            this.a.transact(3027, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void J0(u8e u8eVar, int i, int i2, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            j66.D(obtain, bundle);
            this.a.transact(3055, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void K(u8e u8eVar, int i, Bundle bundle, Bundle bundle2) {
        Bundle bundle3 = Bundle.EMPTY;
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            j66.D(obtain, bundle);
            j66.D(obtain, bundle3);
            this.a.transact(3016, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void K0(u8e u8eVar, int i, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            this.a.transact(3018, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void L(u8e u8eVar, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            this.a.transact(3021, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void M(u8e u8eVar, int i, boolean z, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            obtain.writeInt(i2);
            this.a.transact(3054, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void N(u8e u8eVar, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            j66.D(obtain, bundle);
            this.a.transact(3033, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void O(u8e u8eVar, int i, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeInt(z ? 1 : 0);
            this.a.transact(3006, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void P(u8e u8eVar, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            this.a.transact(3034, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void Q(u8e u8eVar, int i, int i2, int i3, int i4) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeInt(i4);
            this.a.transact(3023, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void U(u8e u8eVar, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            j66.D(obtain, bundle);
            this.a.transact(3014, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void V(u8e u8eVar, int i, Bundle bundle, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            j66.D(obtain, bundle);
            obtain.writeInt(z ? 1 : 0);
            this.a.transact(3057, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void W(u8e u8eVar, int i, Bundle bundle, long j) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            j66.D(obtain, bundle);
            obtain.writeLong(j);
            this.a.transact(3008, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void Z(u8e u8eVar, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            this.a.transact(3024, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void a0(u8e u8eVar, int i, IBinder iBinder, int i2, long j) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeStrongBinder(iBinder);
            obtain.writeInt(i2);
            obtain.writeLong(j);
            this.a.transact(3012, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // defpackage.c9e
    public final void b0(u8e u8eVar, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            this.a.transact(3043, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void c0(u8e u8eVar, int i, float f) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeFloat(f);
            this.a.transact(3028, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void e(u8e u8eVar, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            this.a.transact(3025, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void g0(u8e u8eVar, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.a.transact(3052, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void i0(u8e u8eVar, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.a.transact(3053, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void j0(u8e u8eVar, int i, IBinder iBinder, boolean z) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeStrongBinder(iBinder);
            obtain.writeInt(1);
            this.a.transact(3011, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void k0(u8e u8eVar, int i, int i2, int i3, IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeStrongBinder(iBinder);
            this.a.transact(3056, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void m(u8e u8eVar, int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.a.transact(3051, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void m0(u8e u8eVar, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            this.a.transact(3047, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void n0(u8e u8eVar, int i, int i2, long j) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeLong(j);
            this.a.transact(3039, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void o(u8e u8eVar, int i, float f) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeFloat(f);
            this.a.transact(3002, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void o0(u8e u8eVar, int i, IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeStrongBinder(iBinder);
            this.a.transact(3031, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void p(u8e u8eVar, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            this.a.transact(3004, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void q(u8e u8eVar, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            j66.D(obtain, bundle);
            this.a.transact(3048, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void q0(u8e u8eVar, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            this.a.transact(3036, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void r(u8e u8eVar, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            this.a.transact(3041, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void r0(u8e u8eVar, int i, int i2, IBinder iBinder) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeStrongBinder(iBinder);
            this.a.transact(3032, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void s(u8e u8eVar, int i, int i2, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            j66.D(obtain, bundle);
            this.a.transact(3030, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void s0(u8e u8eVar, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            this.a.transact(3042, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void u(u8e u8eVar, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            this.a.transact(3040, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void u0(u8e u8eVar, int i, long j) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeLong(j);
            this.a.transact(3038, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void v(u8e u8eVar, int i, int i2, int i3) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            this.a.transact(3020, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void v0(u8e u8eVar, int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            this.a.transact(3035, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void w(u8e u8eVar, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.a.transact(3019, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void y0(u8e u8eVar, int i, Surface surface) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            j66.D(obtain, surface);
            this.a.transact(3044, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // defpackage.c9e
    public final void z0(u8e u8eVar, int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            obtain.writeStrongInterface(u8eVar);
            obtain.writeInt(i);
            j66.D(obtain, bundle);
            this.a.transact(3015, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
