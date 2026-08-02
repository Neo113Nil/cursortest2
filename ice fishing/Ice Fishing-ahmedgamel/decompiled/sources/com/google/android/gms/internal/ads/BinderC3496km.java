package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.km, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3496km extends AbstractBinderC3359i8 implements InterfaceC3755pb {

    /* renamed from: n, reason: collision with root package name */
    public final C4089vm f32402n;

    /* renamed from: u, reason: collision with root package name */
    public Y2.a f32403u;

    public BinderC3496km(C4089vm c4089vm) {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
        this.f32402n = c4089vm;
    }

    public static float U3(Y2.a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) Y2.b.D0(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        float f2;
        A3.r j02;
        int i4;
        int i6;
        C2654Kb c2654Kb;
        InterfaceC4084vh interfaceC4084vh;
        switch (i) {
            case 2:
                C4089vm c4089vm = this.f32402n;
                synchronized (c4089vm) {
                    f2 = c4089vm.f35507x;
                }
                if (f2 != 0.0f) {
                    synchronized (c4089vm) {
                        r2 = c4089vm.f35507x;
                    }
                } else if (c4089vm.r() != null) {
                    try {
                        r2 = c4089vm.r().q();
                    } catch (RemoteException e9) {
                        int i9 = w2.z.f41712b;
                        x2.i.d("Remote exception getting video controller aspect ratio.", e9);
                    }
                } else {
                    Y2.a aVar = this.f32403u;
                    if (aVar != null) {
                        r2 = U3(aVar);
                    } else if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Od)).booleanValue() || c4089vm.i() == null || (j02 = c4089vm.i().j0()) == null || (i4 = j02.f186c) < 0 || (i6 = j02.f185b) <= 0) {
                        InterfaceC3862rb b9 = c4089vm.b();
                        if (b9 != null) {
                            float o4 = (b9.o() == -1 || b9.d() == -1) ? 0.0f : b9.o() / b9.d();
                            r2 = o4 == 0.0f ? U3(b9.c()) : o4;
                        }
                    } else {
                        r2 = i4 / i6;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeFloat(r2);
                return true;
            case 3:
                Y2.a t02 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                this.f32403u = t02;
                parcel2.writeNoException();
                return true;
            case 4:
                Y2.a h3 = h();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, h3);
                return true;
            case 5:
                float g9 = g();
                parcel2.writeNoException();
                parcel2.writeFloat(g9);
                return true;
            case 6:
                C4089vm c4089vm2 = this.f32402n;
                r2 = c4089vm2.r() != null ? c4089vm2.r().k() : 0.0f;
                parcel2.writeNoException();
                parcel2.writeFloat(r2);
                return true;
            case 7:
                s2.A0 r9 = this.f32402n.r();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, r9);
                return true;
            case 8:
                boolean k9 = k();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3411j8.f31986a;
                parcel2.writeInt(k9 ? 1 : 0);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c2654Kb = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    c2654Kb = queryLocalInterface instanceof C2654Kb ? (C2654Kb) queryLocalInterface : new C2654Kb(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener", 1);
                }
                AbstractC3411j8.f(parcel);
                C4089vm c4089vm3 = this.f32402n;
                if (c4089vm3.r() instanceof BinderC2626Ih) {
                    BinderC2626Ih binderC2626Ih = (BinderC2626Ih) c4089vm3.r();
                    synchronized (binderC2626Ih.f26301u) {
                        binderC2626Ih.f26299G = c2654Kb;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 10:
                C4089vm c4089vm4 = this.f32402n;
                synchronized (c4089vm4) {
                    interfaceC4084vh = c4089vm4.f35493j;
                }
                int i10 = interfaceC4084vh != null ? 1 : 0;
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3411j8.f31986a;
                parcel2.writeInt(i10);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3755pb
    public final float g() {
        C4089vm c4089vm = this.f32402n;
        if (c4089vm.r() != null) {
            return c4089vm.r().j();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3755pb
    public final Y2.a h() {
        Y2.a aVar = this.f32403u;
        if (aVar != null) {
            return aVar;
        }
        InterfaceC3862rb b9 = this.f32402n.b();
        if (b9 == null) {
            return null;
        }
        return b9.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3755pb
    public final s2.A0 j() {
        return this.f32402n.r();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3755pb
    public final boolean k() {
        return this.f32402n.r() != null;
    }
}
