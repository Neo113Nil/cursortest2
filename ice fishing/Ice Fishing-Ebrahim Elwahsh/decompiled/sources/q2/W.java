package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC2705Of;
import com.google.android.gms.internal.ads.AbstractBinderC3156ef;
import com.google.android.gms.internal.ads.AbstractBinderC3372ie;
import com.google.android.gms.internal.ads.AbstractBinderC3799qb;
import com.google.android.gms.internal.ads.AbstractC3241g8;
import com.google.android.gms.internal.ads.BinderC2949aq;
import com.google.android.gms.internal.ads.C2688Nf;
import com.google.android.gms.internal.ads.C3046ce;
import com.google.android.gms.internal.ads.C3102df;
import com.google.android.gms.internal.ads.C3318he;
import com.google.android.gms.internal.ads.C3745pb;
import com.google.android.gms.internal.ads.InterfaceC2722Pf;
import com.google.android.gms.internal.ads.InterfaceC3101de;
import com.google.android.gms.internal.ads.InterfaceC3211ff;
import com.google.android.gms.internal.ads.InterfaceC3423jd;
import com.google.android.gms.internal.ads.InterfaceC3424je;
import com.google.android.gms.internal.ads.InterfaceC3852rb;

/* loaded from: classes.dex */
public final class W extends Z2.a implements X {
    @Override // q2.X
    public final G J1(V2.a aVar, String str, InterfaceC3423jd interfaceC3423jd, int i) {
        G e6;
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        A02.writeString(str);
        AbstractC3241g8.e(A02, interfaceC3423jd);
        A02.writeInt(261710000);
        Parcel D02 = D0(A02, 3);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            e6 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            e6 = queryLocalInterface instanceof G ? (G) queryLocalInterface : new E(readStrongBinder);
        }
        D02.recycle();
        return e6;
    }

    @Override // q2.X
    public final K M2(V2.a aVar, g1 g1Var, String str, InterfaceC3423jd interfaceC3423jd, int i) {
        K i4;
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.c(A02, g1Var);
        A02.writeString(str);
        AbstractC3241g8.e(A02, interfaceC3423jd);
        A02.writeInt(261710000);
        Parcel D02 = D0(A02, 2);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            i4 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            i4 = queryLocalInterface instanceof K ? (K) queryLocalInterface : new I(readStrongBinder);
        }
        D02.recycle();
        return i4;
    }

    @Override // q2.X
    public final InterfaceC4915t0 U1(V2.a aVar, InterfaceC3423jd interfaceC3423jd, int i) {
        InterfaceC4915t0 c4913s0;
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.e(A02, interfaceC3423jd);
        A02.writeInt(261710000);
        Parcel D02 = D0(A02, 17);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c4913s0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c4913s0 = queryLocalInterface instanceof InterfaceC4915t0 ? (InterfaceC4915t0) queryLocalInterface : new C4913s0(readStrongBinder);
        }
        D02.recycle();
        return c4913s0;
    }

    @Override // q2.X
    public final InterfaceC3424je V(V2.a aVar) {
        InterfaceC3424je c3318he;
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        Parcel D02 = D0(A02, 8);
        IBinder readStrongBinder = D02.readStrongBinder();
        int i = AbstractBinderC3372ie.f31860n;
        if (readStrongBinder == null) {
            c3318he = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            c3318he = queryLocalInterface instanceof InterfaceC3424je ? (InterfaceC3424je) queryLocalInterface : new C3318he(readStrongBinder);
        }
        D02.recycle();
        return c3318he;
    }

    @Override // q2.X
    public final InterfaceC3101de W0(V2.a aVar, InterfaceC3423jd interfaceC3423jd, int i) {
        InterfaceC3101de c3046ce;
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.e(A02, interfaceC3423jd);
        A02.writeInt(261710000);
        Parcel D02 = D0(A02, 15);
        IBinder readStrongBinder = D02.readStrongBinder();
        int i4 = BinderC2949aq.f29329A;
        if (readStrongBinder == null) {
            c3046ce = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c3046ce = queryLocalInterface instanceof InterfaceC3101de ? (InterfaceC3101de) queryLocalInterface : new C3046ce(readStrongBinder);
        }
        D02.recycle();
        return c3046ce;
    }

    @Override // q2.X
    public final K W2(V2.a aVar, g1 g1Var, String str, InterfaceC3423jd interfaceC3423jd, int i) {
        K i4;
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.c(A02, g1Var);
        A02.writeString(str);
        AbstractC3241g8.e(A02, interfaceC3423jd);
        A02.writeInt(261710000);
        Parcel D02 = D0(A02, 13);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            i4 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            i4 = queryLocalInterface instanceof K ? (K) queryLocalInterface : new I(readStrongBinder);
        }
        D02.recycle();
        return i4;
    }

    @Override // q2.X
    public final InterfaceC4890g0 Y0(V2.a aVar, int i) {
        InterfaceC4890g0 c4886e0;
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        A02.writeInt(261710000);
        Parcel D02 = D0(A02, 9);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c4886e0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            c4886e0 = queryLocalInterface instanceof InterfaceC4890g0 ? (InterfaceC4890g0) queryLocalInterface : new C4886e0(readStrongBinder);
        }
        D02.recycle();
        return c4886e0;
    }

    @Override // q2.X
    public final InterfaceC2722Pf f3(V2.a aVar, InterfaceC3423jd interfaceC3423jd, int i) {
        InterfaceC2722Pf c2688Nf;
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.e(A02, interfaceC3423jd);
        A02.writeInt(261710000);
        Parcel D02 = D0(A02, 14);
        IBinder readStrongBinder = D02.readStrongBinder();
        int i4 = AbstractBinderC2705Of.f26718n;
        if (readStrongBinder == null) {
            c2688Nf = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            c2688Nf = queryLocalInterface instanceof InterfaceC2722Pf ? (InterfaceC2722Pf) queryLocalInterface : new C2688Nf(readStrongBinder);
        }
        D02.recycle();
        return c2688Nf;
    }

    @Override // q2.X
    public final K p2(V2.a aVar, g1 g1Var, String str, InterfaceC3423jd interfaceC3423jd, int i) {
        K i4;
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.c(A02, g1Var);
        A02.writeString(str);
        AbstractC3241g8.e(A02, interfaceC3423jd);
        A02.writeInt(261710000);
        Parcel D02 = D0(A02, 1);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            i4 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            i4 = queryLocalInterface instanceof K ? (K) queryLocalInterface : new I(readStrongBinder);
        }
        D02.recycle();
        return i4;
    }

    @Override // q2.X
    public final S s0(V2.a aVar, InterfaceC3423jd interfaceC3423jd, int i) {
        S q6;
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.e(A02, interfaceC3423jd);
        A02.writeInt(261710000);
        Parcel D02 = D0(A02, 18);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            q6 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            q6 = queryLocalInterface instanceof S ? (S) queryLocalInterface : new Q(readStrongBinder);
        }
        D02.recycle();
        return q6;
    }

    @Override // q2.X
    public final InterfaceC3852rb v0(V2.a aVar, V2.a aVar2) {
        InterfaceC3852rb c3745pb;
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        AbstractC3241g8.e(A02, aVar2);
        Parcel D02 = D0(A02, 5);
        IBinder readStrongBinder = D02.readStrongBinder();
        int i = AbstractBinderC3799qb.f33733n;
        if (readStrongBinder == null) {
            c3745pb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            c3745pb = queryLocalInterface instanceof InterfaceC3852rb ? (InterfaceC3852rb) queryLocalInterface : new C3745pb(readStrongBinder);
        }
        D02.recycle();
        return c3745pb;
    }

    @Override // q2.X
    public final InterfaceC3211ff z1(V2.a aVar, String str, InterfaceC3423jd interfaceC3423jd, int i) {
        InterfaceC3211ff c3102df;
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, aVar);
        A02.writeString(str);
        AbstractC3241g8.e(A02, interfaceC3423jd);
        A02.writeInt(261710000);
        Parcel D02 = D0(A02, 12);
        IBinder readStrongBinder = D02.readStrongBinder();
        int i4 = AbstractBinderC3156ef.f30447n;
        if (readStrongBinder == null) {
            c3102df = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            c3102df = queryLocalInterface instanceof InterfaceC3211ff ? (InterfaceC3211ff) queryLocalInterface : new C3102df(readStrongBinder);
        }
        D02.recycle();
        return c3102df;
    }
}
