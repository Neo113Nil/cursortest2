package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.hm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3326hm extends AbstractBinderC3186f8 implements InterfaceC3529lb {

    /* renamed from: n, reason: collision with root package name */
    public final C3917sm f31254n;

    /* renamed from: u, reason: collision with root package name */
    public V2.a f31255u;

    public BinderC3326hm(C3917sm c3917sm) {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
        this.f31254n = c3917sm;
    }

    public static float G3(V2.a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) V2.b.A0(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        float f6;
        W2.b e02;
        int i4;
        int i9;
        C2565Gb c2565Gb;
        InterfaceC3858rh interfaceC3858rh;
        switch (i) {
            case 2:
                C3917sm c3917sm = this.f31254n;
                synchronized (c3917sm) {
                    f6 = c3917sm.f34297x;
                }
                if (f6 != 0.0f) {
                    synchronized (c3917sm) {
                        r2 = c3917sm.f34297x;
                    }
                } else if (c3917sm.r() != null) {
                    try {
                        r2 = c3917sm.r().m();
                    } catch (RemoteException e6) {
                        int i10 = t2.C.f40822b;
                        u2.i.d("Remote exception getting video controller aspect ratio.", e6);
                    }
                } else {
                    V2.a aVar = this.f31255u;
                    if (aVar != null) {
                        r2 = G3(aVar);
                    } else if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Od)).booleanValue() || c3917sm.i() == null || (e02 = c3917sm.i().e0()) == null || (i4 = e02.f3425c) < 0 || (i9 = e02.f3424b) <= 0) {
                        InterfaceC3637nb b9 = c3917sm.b();
                        if (b9 != null) {
                            float c4 = (b9.c() == -1 || b9.f() == -1) ? 0.0f : b9.c() / b9.f();
                            r2 = c4 == 0.0f ? G3(b9.d()) : c4;
                        }
                    } else {
                        r2 = i4 / i9;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeFloat(r2);
                return true;
            case 3:
                V2.a u02 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                this.f31255u = u02;
                parcel2.writeNoException();
                return true;
            case 4:
                V2.a e9 = e();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, e9);
                return true;
            case 5:
                float g9 = g();
                parcel2.writeNoException();
                parcel2.writeFloat(g9);
                return true;
            case 6:
                C3917sm c3917sm2 = this.f31254n;
                r2 = c3917sm2.r() != null ? c3917sm2.r().j() : 0.0f;
                parcel2.writeNoException();
                parcel2.writeFloat(r2);
                return true;
            case 7:
                q2.A0 r9 = this.f31254n.r();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, r9);
                return true;
            case 8:
                boolean j9 = j();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3241g8.f30958a;
                parcel2.writeInt(j9 ? 1 : 0);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c2565Gb = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    c2565Gb = queryLocalInterface instanceof C2565Gb ? (C2565Gb) queryLocalInterface : new C2565Gb(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener", 2);
                }
                AbstractC3241g8.f(parcel);
                C3917sm c3917sm3 = this.f31254n;
                if (c3917sm3.r() instanceof BinderC2554Fh) {
                    BinderC2554Fh binderC2554Fh = (BinderC2554Fh) c3917sm3.r();
                    synchronized (binderC2554Fh.f25000u) {
                        binderC2554Fh.f24998G = c2565Gb;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 10:
                C3917sm c3917sm4 = this.f31254n;
                synchronized (c3917sm4) {
                    interfaceC3858rh = c3917sm4.f34283j;
                }
                int i11 = interfaceC3858rh != null ? 1 : 0;
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3241g8.f30958a;
                parcel2.writeInt(i11);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3529lb
    public final V2.a e() {
        V2.a aVar = this.f31255u;
        if (aVar != null) {
            return aVar;
        }
        InterfaceC3637nb b9 = this.f31254n.b();
        if (b9 == null) {
            return null;
        }
        return b9.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3529lb
    public final float g() {
        C3917sm c3917sm = this.f31254n;
        if (c3917sm.r() != null) {
            return c3917sm.r().h();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3529lb
    public final q2.A0 h() {
        return this.f31254n.r();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3529lb
    public final boolean j() {
        return this.f31254n.r() != null;
    }
}
