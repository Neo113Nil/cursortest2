package q2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3336i8;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import com.google.android.gms.internal.ads.C2869Ye;
import com.google.android.gms.internal.ads.C3892sa;
import com.google.android.gms.internal.ads.InterfaceC3950te;
import com.google.android.gms.internal.ads.InterfaceC4004ue;
import com.google.android.gms.internal.ads.O8;
import com.google.android.gms.internal.ads.P8;

/* loaded from: classes.dex */
public abstract class J extends AbstractBinderC3336i8 implements K {
    public J() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC4915x interfaceC4915x = null;
        InterfaceC4871a0 interfaceC4871a0 = null;
        InterfaceC4868A interfaceC4868A = null;
        InterfaceC4904r0 interfaceC4904r0 = null;
        P8 p82 = null;
        C2869Ye c2869Ye = null;
        Y y7 = null;
        InterfaceC4909u interfaceC4909u = null;
        C3892sa c3892sa = null;
        V v9 = null;
        switch (i) {
            case 1:
                W2.a c9 = c();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, c9);
                return true;
            case 2:
                A();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean i6 = i();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3388j8.f31199a;
                parcel2.writeInt(i6 ? 1 : 0);
                return true;
            case 4:
                c1 c1Var = (c1) AbstractC3388j8.b(parcel, c1.CREATOR);
                AbstractC3388j8.f(parcel);
                boolean d32 = d3(c1Var);
                parcel2.writeNoException();
                parcel2.writeInt(d32 ? 1 : 0);
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
                    interfaceC4915x = queryLocalInterface instanceof InterfaceC4915x ? (InterfaceC4915x) queryLocalInterface : new C4911v(readStrongBinder);
                }
                AbstractC3388j8.f(parcel);
                Z2(interfaceC4915x);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    v9 = queryLocalInterface2 instanceof V ? (V) queryLocalInterface2 : new U(readStrongBinder2);
                }
                AbstractC3388j8.f(parcel);
                x1(v9);
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
                AbstractC3388j8.d(parcel2, q8);
                return true;
            case 13:
                f1 f1Var = (f1) AbstractC3388j8.b(parcel, f1.CREATOR);
                AbstractC3388j8.f(parcel);
                U1(f1Var);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    boolean z3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener") instanceof InterfaceC3950te;
                }
                AbstractC3388j8.f(parcel);
                s();
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    boolean z6 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener") instanceof InterfaceC4004ue;
                }
                parcel.readString();
                AbstractC3388j8.f(parcel);
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
                String m4 = m();
                parcel2.writeNoException();
                parcel2.writeString(m4);
                return true;
            case 19:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    c3892sa = queryLocalInterface3 instanceof C3892sa ? (C3892sa) queryLocalInterface3 : new C3892sa(readStrongBinder5, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener", 2);
                }
                AbstractC3388j8.f(parcel);
                r2(c3892sa);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    interfaceC4909u = queryLocalInterface4 instanceof InterfaceC4909u ? (InterfaceC4909u) queryLocalInterface4 : new C4907t(readStrongBinder6, "com.google.android.gms.ads.internal.client.IAdClickListener", 2);
                }
                AbstractC3388j8.f(parcel);
                B3(interfaceC4909u);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    y7 = queryLocalInterface5 instanceof Y ? (Y) queryLocalInterface5 : new Y(readStrongBinder7);
                }
                AbstractC3388j8.f(parcel);
                r3(y7);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean a9 = AbstractC3388j8.a(parcel);
                AbstractC3388j8.f(parcel);
                f2(a9);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean M8 = M();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3388j8.f31199a;
                parcel2.writeInt(M8 ? 1 : 0);
                return true;
            case 24:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    c2869Ye = queryLocalInterface6 instanceof C2869Ye ? (C2869Ye) queryLocalInterface6 : new C2869Ye(readStrongBinder8);
                }
                AbstractC3388j8.f(parcel);
                E0(c2869Ye);
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.readString();
                AbstractC3388j8.f(parcel);
                K();
                parcel2.writeNoException();
                return true;
            case 26:
                A0 V8 = V();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, V8);
                return true;
            case 29:
                Z0 z02 = (Z0) AbstractC3388j8.b(parcel, Z0.CREATOR);
                AbstractC3388j8.f(parcel);
                U0(z02);
                parcel2.writeNoException();
                return true;
            case 30:
                AbstractC3388j8.f(parcel);
                e1();
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
                AbstractC3388j8.e(parcel2, y9);
                return true;
            case 33:
                InterfaceC4915x B9 = B();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, B9);
                return true;
            case 34:
                boolean a10 = AbstractC3388j8.a(parcel);
                AbstractC3388j8.f(parcel);
                o0(a10);
                parcel2.writeNoException();
                return true;
            case 35:
                String w6 = w();
                parcel2.writeNoException();
                parcel2.writeString(w6);
                return true;
            case 36:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    boolean z9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener") instanceof M;
                }
                AbstractC3388j8.f(parcel);
                k2();
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle j6 = j();
                parcel2.writeNoException();
                AbstractC3388j8.d(parcel2, j6);
                return true;
            case com.anythink.basead.b.b.j.f5806M /* 38 */:
                String readString = parcel.readString();
                AbstractC3388j8.f(parcel);
                O2(readString);
                parcel2.writeNoException();
                return true;
            case 39:
                i1 i1Var = (i1) AbstractC3388j8.b(parcel, i1.CREATOR);
                AbstractC3388j8.f(parcel);
                Y2(i1Var);
                parcel2.writeNoException();
                return true;
            case com.anythink.basead.b.b.j.f5808O /* 40 */:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    p82 = queryLocalInterface7 instanceof P8 ? (P8) queryLocalInterface7 : new O8(readStrongBinder10, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback", 2);
                }
                AbstractC3388j8.f(parcel);
                P3(p82);
                parcel2.writeNoException();
                return true;
            case 41:
                InterfaceC4914w0 C8 = C();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, C8);
                return true;
            case 42:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    interfaceC4904r0 = queryLocalInterface8 instanceof InterfaceC4904r0 ? (InterfaceC4904r0) queryLocalInterface8 : new C4903q0(readStrongBinder11);
                }
                AbstractC3388j8.f(parcel);
                s0(interfaceC4904r0);
                parcel2.writeNoException();
                return true;
            case com.anythink.basead.b.b.j.f5811R /* 43 */:
                c1 c1Var2 = (c1) AbstractC3388j8.b(parcel, c1.CREATOR);
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    interfaceC4868A = queryLocalInterface9 instanceof InterfaceC4868A ? (InterfaceC4868A) queryLocalInterface9 : new C4917y(readStrongBinder12, "com.google.android.gms.ads.internal.client.IAdLoadCallback", 2);
                }
                AbstractC3388j8.f(parcel);
                m2(c1Var2, interfaceC4868A);
                parcel2.writeNoException();
                return true;
            case com.anythink.basead.b.b.j.f5812S /* 44 */:
                W2.a w02 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                C1(w02);
                parcel2.writeNoException();
                return true;
            case com.anythink.basead.b.b.j.f5813T /* 45 */:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    interfaceC4871a0 = queryLocalInterface10 instanceof InterfaceC4871a0 ? (InterfaceC4871a0) queryLocalInterface10 : new Z(readStrongBinder13, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback", 2);
                }
                AbstractC3388j8.f(parcel);
                X0(interfaceC4871a0);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean u3 = u();
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC3388j8.f31199a;
                parcel2.writeInt(u3 ? 1 : 0);
                return true;
            case 47:
                long f02 = f0();
                parcel2.writeNoException();
                parcel2.writeLong(f02);
                return true;
            case com.anythink.basead.b.b.j.f5816W /* 48 */:
                long readLong = parcel.readLong();
                AbstractC3388j8.f(parcel);
                A0(readLong);
                parcel2.writeNoException();
                return true;
        }
    }
}
