package q2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3186f8;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import com.google.android.gms.internal.ads.C2823Ve;
import com.google.android.gms.internal.ads.C3744pa;
import com.google.android.gms.internal.ads.InterfaceC3694oe;
import com.google.android.gms.internal.ads.InterfaceC3748pe;
import com.google.android.gms.internal.ads.L8;
import com.google.android.gms.internal.ads.M8;

/* loaded from: classes.dex */
public abstract class J extends AbstractBinderC3186f8 implements K {
    public J() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC4922x interfaceC4922x = null;
        InterfaceC4878a0 interfaceC4878a0 = null;
        InterfaceC4873A interfaceC4873A = null;
        InterfaceC4911r0 interfaceC4911r0 = null;
        M8 m8 = null;
        C2823Ve c2823Ve = null;
        Y y6 = null;
        InterfaceC4916u interfaceC4916u = null;
        C3744pa c3744pa = null;
        V v6 = null;
        switch (i) {
            case 1:
                V2.a d2 = d();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, d2);
                return true;
            case 2:
                x();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean o9 = o();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3241g8.f30958a;
                parcel2.writeInt(o9 ? 1 : 0);
                return true;
            case 4:
                d1 d1Var = (d1) AbstractC3241g8.b(parcel, d1.CREATOR);
                AbstractC3241g8.f(parcel);
                boolean f02 = f0(d1Var);
                parcel2.writeNoException();
                parcel2.writeInt(f02 ? 1 : 0);
                return true;
            case 5:
                f();
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
                    interfaceC4922x = queryLocalInterface instanceof InterfaceC4922x ? (InterfaceC4922x) queryLocalInterface : new C4918v(readStrongBinder);
                }
                AbstractC3241g8.f(parcel);
                r0(interfaceC4922x);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    v6 = queryLocalInterface2 instanceof V ? (V) queryLocalInterface2 : new U(readStrongBinder2);
                }
                AbstractC3241g8.f(parcel);
                w1(v6);
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
                m();
                parcel2.writeNoException();
                return true;
            case 12:
                g1 p6 = p();
                parcel2.writeNoException();
                AbstractC3241g8.d(parcel2, p6);
                return true;
            case 13:
                g1 g1Var = (g1) AbstractC3241g8.b(parcel, g1.CREATOR);
                AbstractC3241g8.f(parcel);
                D1(g1Var);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    boolean z8 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener") instanceof InterfaceC3694oe;
                }
                AbstractC3241g8.f(parcel);
                r();
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    boolean z9 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener") instanceof InterfaceC3748pe;
                }
                parcel.readString();
                AbstractC3241g8.f(parcel);
                n();
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String t9 = t();
                parcel2.writeNoException();
                parcel2.writeString(t9);
                return true;
            case 19:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    c3744pa = queryLocalInterface3 instanceof C3744pa ? (C3744pa) queryLocalInterface3 : new C3744pa(readStrongBinder5, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener", 2);
                }
                AbstractC3241g8.f(parcel);
                I1(c3744pa);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    interfaceC4916u = queryLocalInterface4 instanceof InterfaceC4916u ? (InterfaceC4916u) queryLocalInterface4 : new C4914t(readStrongBinder6, "com.google.android.gms.ads.internal.client.IAdClickListener", 2);
                }
                AbstractC3241g8.f(parcel);
                X2(interfaceC4916u);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    y6 = queryLocalInterface5 instanceof Y ? (Y) queryLocalInterface5 : new Y(readStrongBinder7);
                }
                AbstractC3241g8.f(parcel);
                D2(y6);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean a9 = AbstractC3241g8.a(parcel);
                AbstractC3241g8.f(parcel);
                u2(a9);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean H6 = H();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3241g8.f30958a;
                parcel2.writeInt(H6 ? 1 : 0);
                return true;
            case 24:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    c2823Ve = queryLocalInterface6 instanceof C2823Ve ? (C2823Ve) queryLocalInterface6 : new C2823Ve(readStrongBinder8);
                }
                AbstractC3241g8.f(parcel);
                x1(c2823Ve);
                parcel2.writeNoException();
                return true;
            case 25:
                String readString = parcel.readString();
                AbstractC3241g8.f(parcel);
                I2(readString);
                parcel2.writeNoException();
                return true;
            case 26:
                A0 B8 = B();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, B8);
                return true;
            case 29:
                a1 a1Var = (a1) AbstractC3241g8.b(parcel, a1.CREATOR);
                AbstractC3241g8.f(parcel);
                x0(a1Var);
                parcel2.writeNoException();
                return true;
            case 30:
                AbstractC3241g8.f(parcel);
                K();
                parcel2.writeNoException();
                return true;
            case 31:
                String u7 = u();
                parcel2.writeNoException();
                parcel2.writeString(u7);
                return true;
            case 32:
                V v9 = v();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, v9);
                return true;
            case 33:
                InterfaceC4922x X8 = X();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, X8);
                return true;
            case 34:
                boolean a10 = AbstractC3241g8.a(parcel);
                AbstractC3241g8.f(parcel);
                Q0(a10);
                parcel2.writeNoException();
                return true;
            case 35:
                String w9 = w();
                parcel2.writeNoException();
                parcel2.writeString(w9);
                return true;
            case 36:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    boolean z10 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener") instanceof M;
                }
                AbstractC3241g8.f(parcel);
                s1();
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle j9 = j();
                parcel2.writeNoException();
                AbstractC3241g8.d(parcel2, j9);
                return true;
            case com.anythink.basead.b.b.j.f5963M /* 38 */:
                parcel.readString();
                AbstractC3241g8.f(parcel);
                b0();
                parcel2.writeNoException();
                return true;
            case 39:
                j1 j1Var = (j1) AbstractC3241g8.b(parcel, j1.CREATOR);
                AbstractC3241g8.f(parcel);
                t2(j1Var);
                parcel2.writeNoException();
                return true;
            case com.anythink.basead.b.b.j.f5965O /* 40 */:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    m8 = queryLocalInterface7 instanceof M8 ? (M8) queryLocalInterface7 : new L8(readStrongBinder10, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback", 2);
                }
                AbstractC3241g8.f(parcel);
                W1(m8);
                parcel2.writeNoException();
                return true;
            case 41:
                InterfaceC4921w0 M8 = M();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, M8);
                return true;
            case 42:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    interfaceC4911r0 = queryLocalInterface8 instanceof InterfaceC4911r0 ? (InterfaceC4911r0) queryLocalInterface8 : new C4910q0(readStrongBinder11);
                }
                AbstractC3241g8.f(parcel);
                p3(interfaceC4911r0);
                parcel2.writeNoException();
                return true;
            case com.anythink.basead.b.b.j.f5968R /* 43 */:
                d1 d1Var2 = (d1) AbstractC3241g8.b(parcel, d1.CREATOR);
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    interfaceC4873A = queryLocalInterface9 instanceof InterfaceC4873A ? (InterfaceC4873A) queryLocalInterface9 : new C4924y(readStrongBinder12, "com.google.android.gms.ads.internal.client.IAdLoadCallback", 2);
                }
                AbstractC3241g8.f(parcel);
                C2(d1Var2, interfaceC4873A);
                parcel2.writeNoException();
                return true;
            case com.anythink.basead.b.b.j.f5969S /* 44 */:
                V2.a u02 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                T2(u02);
                parcel2.writeNoException();
                return true;
            case com.anythink.basead.b.b.j.f5970T /* 45 */:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    interfaceC4878a0 = queryLocalInterface10 instanceof InterfaceC4878a0 ? (InterfaceC4878a0) queryLocalInterface10 : new Z(readStrongBinder13, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback", 2);
                }
                AbstractC3241g8.f(parcel);
                B0(interfaceC4878a0);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean L8 = L();
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC3241g8.f30958a;
                parcel2.writeInt(L8 ? 1 : 0);
                return true;
            case 47:
                long Z8 = Z();
                parcel2.writeNoException();
                parcel2.writeLong(Z8);
                return true;
            case com.anythink.basead.b.b.j.f5973W /* 48 */:
                long readLong = parcel.readLong();
                AbstractC3241g8.f(parcel);
                P0(readLong);
                parcel2.writeNoException();
                return true;
        }
    }
}
