package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.jm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3419jm extends AbstractBinderC3336i8 implements InterfaceC3732pb {

    /* renamed from: n, reason: collision with root package name */
    public final C4012um f31312n;

    /* renamed from: u, reason: collision with root package name */
    public W2.a f31313u;

    public BinderC3419jm(C4012um c4012um) {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
        this.f31312n = c4012um;
    }

    public static float U3(W2.a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) W2.b.F0(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        float f3;
        X2.b i02;
        int i6;
        int i9;
        C2634Kb c2634Kb;
        InterfaceC4061vh interfaceC4061vh;
        switch (i) {
            case 2:
                C4012um c4012um = this.f31312n;
                synchronized (c4012um) {
                    f3 = c4012um.f34586x;
                }
                if (f3 != 0.0f) {
                    synchronized (c4012um) {
                        r2 = c4012um.f34586x;
                    }
                } else if (c4012um.r() != null) {
                    try {
                        r2 = c4012um.r().q();
                    } catch (RemoteException e9) {
                        int i10 = u2.z.f41322b;
                        v2.i.d("Remote exception getting video controller aspect ratio.", e9);
                    }
                } else {
                    W2.a aVar = this.f31313u;
                    if (aVar != null) {
                        r2 = U3(aVar);
                    } else if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Od)).booleanValue() || c4012um.i() == null || (i02 = c4012um.i().i0()) == null || (i6 = i02.f3773c) < 0 || (i9 = i02.f3772b) <= 0) {
                        InterfaceC3839rb b9 = c4012um.b();
                        if (b9 != null) {
                            float o6 = (b9.o() == -1 || b9.d() == -1) ? 0.0f : b9.o() / b9.d();
                            r2 = o6 == 0.0f ? U3(b9.c()) : o6;
                        }
                    } else {
                        r2 = i6 / i9;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeFloat(r2);
                return true;
            case 3:
                W2.a w02 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                this.f31313u = w02;
                parcel2.writeNoException();
                return true;
            case 4:
                W2.a h9 = h();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, h9);
                return true;
            case 5:
                float g4 = g();
                parcel2.writeNoException();
                parcel2.writeFloat(g4);
                return true;
            case 6:
                C4012um c4012um2 = this.f31312n;
                r2 = c4012um2.r() != null ? c4012um2.r().k() : 0.0f;
                parcel2.writeNoException();
                parcel2.writeFloat(r2);
                return true;
            case 7:
                q2.A0 r9 = this.f31312n.r();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, r9);
                return true;
            case 8:
                boolean k9 = k();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3388j8.f31199a;
                parcel2.writeInt(k9 ? 1 : 0);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c2634Kb = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    c2634Kb = queryLocalInterface instanceof C2634Kb ? (C2634Kb) queryLocalInterface : new C2634Kb(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener", 2);
                }
                AbstractC3388j8.f(parcel);
                C4012um c4012um3 = this.f31312n;
                if (c4012um3.r() instanceof BinderC2606Ih) {
                    BinderC2606Ih binderC2606Ih = (BinderC2606Ih) c4012um3.r();
                    synchronized (binderC2606Ih.f25552u) {
                        binderC2606Ih.f25550G = c2634Kb;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 10:
                C4012um c4012um4 = this.f31312n;
                synchronized (c4012um4) {
                    interfaceC4061vh = c4012um4.f34572j;
                }
                int i11 = interfaceC4061vh != null ? 1 : 0;
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3388j8.f31199a;
                parcel2.writeInt(i11);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3732pb
    public final float g() {
        C4012um c4012um = this.f31312n;
        if (c4012um.r() != null) {
            return c4012um.r().j();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3732pb
    public final W2.a h() {
        W2.a aVar = this.f31313u;
        if (aVar != null) {
            return aVar;
        }
        InterfaceC3839rb b9 = this.f31312n.b();
        if (b9 == null) {
            return null;
        }
        return b9.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3732pb
    public final q2.A0 j() {
        return this.f31312n.r();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3732pb
    public final boolean k() {
        return this.f31312n.r() != null;
    }
}
