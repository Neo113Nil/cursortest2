package s2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3359i8;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import com.google.android.gms.internal.ads.C2892Ye;
import com.google.android.gms.internal.ads.C3915sa;
import com.google.android.gms.internal.ads.InterfaceC3973te;
import com.google.android.gms.internal.ads.InterfaceC4027ue;
import com.google.android.gms.internal.ads.O8;
import com.google.android.gms.internal.ads.P8;

/* loaded from: classes.dex */
public abstract class J extends AbstractBinderC3359i8 implements K {
    public J() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC4964x interfaceC4964x = null;
        InterfaceC4920a0 interfaceC4920a0 = null;
        InterfaceC4917A interfaceC4917A = null;
        InterfaceC4953r0 interfaceC4953r0 = null;
        P8 p82 = null;
        C2892Ye c2892Ye = null;
        Y y7 = null;
        InterfaceC4958u interfaceC4958u = null;
        C3915sa c3915sa = null;
        V v9 = null;
        switch (i) {
            case 1:
                Y2.a c9 = c();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, c9);
                return true;
            case 2:
                A();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean i4 = i();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3411j8.f31986a;
                parcel2.writeInt(i4 ? 1 : 0);
                return true;
            case 4:
                c1 c1Var = (c1) AbstractC3411j8.b(parcel, c1.CREATOR);
                AbstractC3411j8.f(parcel);
                boolean D32 = D3(c1Var);
                parcel2.writeNoException();
                parcel2.writeInt(D32 ? 1 : 0);
                return true;
            case 5:
                d();
                parcel2.writeNoException();
                return true;
            case 6:
                e();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    interfaceC4964x = queryLocalInterface instanceof InterfaceC4964x ? (InterfaceC4964x) queryLocalInterface : new C4960v(readStrongBinder);
                }
                AbstractC3411j8.f(parcel);
                H1(interfaceC4964x);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    v9 = queryLocalInterface2 instanceof V ? (V) queryLocalInterface2 : new U(readStrongBinder2);
                }
                AbstractC3411j8.f(parcel);
                o0(v9);
                parcel2.writeNoException();
                return true;
            case 9:
                k();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                l();
                parcel2.writeNoException();
                return true;
            case 12:
                f1 q8 = q();
                parcel2.writeNoException();
                AbstractC3411j8.d(parcel2, q8);
                return true;
            case 13:
                f1 f1Var = (f1) AbstractC3411j8.b(parcel, f1.CREATOR);
                AbstractC3411j8.f(parcel);
                F2(f1Var);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    boolean z6 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener") instanceof InterfaceC3973te;
                }
                AbstractC3411j8.f(parcel);
                s();
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    boolean z9 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener") instanceof InterfaceC4027ue;
                }
                parcel.readString();
                AbstractC3411j8.f(parcel);
                r();
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String m9 = m();
                parcel2.writeNoException();
                parcel2.writeString(m9);
                return true;
            case 19:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    c3915sa = queryLocalInterface3 instanceof C3915sa ? (C3915sa) queryLocalInterface3 : new C3915sa(readStrongBinder5, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener", 1);
                }
                AbstractC3411j8.f(parcel);
                m2(c3915sa);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    interfaceC4958u = queryLocalInterface4 instanceof InterfaceC4958u ? (InterfaceC4958u) queryLocalInterface4 : new C4956t(readStrongBinder6, "com.google.android.gms.ads.internal.client.IAdClickListener", 1);
                }
                AbstractC3411j8.f(parcel);
                p3(interfaceC4958u);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    y7 = queryLocalInterface5 instanceof Y ? (Y) queryLocalInterface5 : new Y(readStrongBinder7);
                }
                AbstractC3411j8.f(parcel);
                B0(y7);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean a9 = AbstractC3411j8.a(parcel);
                AbstractC3411j8.f(parcel);
                c2(a9);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean L2 = L();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3411j8.f31986a;
                parcel2.writeInt(L2 ? 1 : 0);
                return true;
            case 24:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    c2892Ye = queryLocalInterface6 instanceof C2892Ye ? (C2892Ye) queryLocalInterface6 : new C2892Ye(readStrongBinder8);
                }
                AbstractC3411j8.f(parcel);
                C0(c2892Ye);
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.readString();
                AbstractC3411j8.f(parcel);
                J();
                parcel2.writeNoException();
                return true;
            case 26:
                A0 V8 = V();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, V8);
                return true;
            case 29:
                Z0 z02 = (Z0) AbstractC3411j8.b(parcel, Z0.CREATOR);
                AbstractC3411j8.f(parcel);
                o2(z02);
                parcel2.writeNoException();
                return true;
            case 30:
                AbstractC3411j8.f(parcel);
                c1();
                parcel2.writeNoException();
                return true;
            case 31:
                String N8 = N();
                parcel2.writeNoException();
                parcel2.writeString(N8);
                return true;
            case 32:
                V y9 = y();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, y9);
                return true;
            case 33:
                InterfaceC4964x B3 = B();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, B3);
                return true;
            case 34:
                boolean a10 = AbstractC3411j8.a(parcel);
                AbstractC3411j8.f(parcel);
                n0(a10);
                parcel2.writeNoException();
                return true;
            case 35:
                String w3 = w();
                parcel2.writeNoException();
                parcel2.writeString(w3);
                return true;
            case 36:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    boolean z10 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener") instanceof M;
                }
                AbstractC3411j8.f(parcel);
                d2();
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle j6 = j();
                parcel2.writeNoException();
                AbstractC3411j8.d(parcel2, j6);
                return true;
            case com.anythink.basead.b.b.j.f6592M /* 38 */:
                String readString = parcel.readString();
                AbstractC3411j8.f(parcel);
                M2(readString);
                parcel2.writeNoException();
                return true;
            case 39:
                i1 i1Var = (i1) AbstractC3411j8.b(parcel, i1.CREATOR);
                AbstractC3411j8.f(parcel);
                F3(i1Var);
                parcel2.writeNoException();
                return true;
            case com.anythink.basead.b.b.j.f6594O /* 40 */:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    p82 = queryLocalInterface7 instanceof P8 ? (P8) queryLocalInterface7 : new O8(readStrongBinder10, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback", 1);
                }
                AbstractC3411j8.f(parcel);
                P3(p82);
                parcel2.writeNoException();
                return true;
            case 41:
                InterfaceC4963w0 C8 = C();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, C8);
                return true;
            case 42:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    interfaceC4953r0 = queryLocalInterface8 instanceof InterfaceC4953r0 ? (InterfaceC4953r0) queryLocalInterface8 : new C4952q0(readStrongBinder11);
                }
                AbstractC3411j8.f(parcel);
                M3(interfaceC4953r0);
                parcel2.writeNoException();
                return true;
            case com.anythink.basead.b.b.j.f6597R /* 43 */:
                c1 c1Var2 = (c1) AbstractC3411j8.b(parcel, c1.CREATOR);
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    interfaceC4917A = queryLocalInterface9 instanceof InterfaceC4917A ? (InterfaceC4917A) queryLocalInterface9 : new C4966y(readStrongBinder12, "com.google.android.gms.ads.internal.client.IAdLoadCallback", 1);
                }
                AbstractC3411j8.f(parcel);
                I3(c1Var2, interfaceC4917A);
                parcel2.writeNoException();
                return true;
            case com.anythink.basead.b.b.j.f6598S /* 44 */:
                Y2.a t02 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                x0(t02);
                parcel2.writeNoException();
                return true;
            case com.anythink.basead.b.b.j.f6599T /* 45 */:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    interfaceC4920a0 = queryLocalInterface10 instanceof InterfaceC4920a0 ? (InterfaceC4920a0) queryLocalInterface10 : new Z(readStrongBinder13, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback", 1);
                }
                AbstractC3411j8.f(parcel);
                E3(interfaceC4920a0);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean u6 = u();
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC3411j8.f31986a;
                parcel2.writeInt(u6 ? 1 : 0);
                return true;
            case 47:
                long g02 = g0();
                parcel2.writeNoException();
                parcel2.writeLong(g02);
                return true;
            case com.anythink.basead.b.b.j.f6602W /* 48 */:
                long readLong = parcel.readLong();
                AbstractC3411j8.f(parcel);
                w0(readLong);
                parcel2.writeNoException();
                return true;
        }
    }
}
