package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c3.AbstractC0549a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractBinderC2777Rf;
import com.google.android.gms.internal.ads.AbstractBinderC3329hf;
import com.google.android.gms.internal.ads.AbstractBinderC3542le;
import com.google.android.gms.internal.ads.AbstractBinderC4024ub;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import com.google.android.gms.internal.ads.BinderC2903Yp;
import com.google.android.gms.internal.ads.C2760Qf;
import com.google.android.gms.internal.ads.C3220fe;
import com.google.android.gms.internal.ads.C3275gf;
import com.google.android.gms.internal.ads.C3488ke;
import com.google.android.gms.internal.ads.C3970tb;
import com.google.android.gms.internal.ads.InterfaceC2794Sf;
import com.google.android.gms.internal.ads.InterfaceC3274ge;
import com.google.android.gms.internal.ads.InterfaceC3435jf;
import com.google.android.gms.internal.ads.InterfaceC3595md;
import com.google.android.gms.internal.ads.InterfaceC3596me;
import com.google.android.gms.internal.ads.InterfaceC4078vb;

/* loaded from: classes.dex */
public final class W extends AbstractC0549a implements X {
    @Override // s2.X
    public final K C2(Y2.a aVar, f1 f1Var, String str, InterfaceC3595md interfaceC3595md, int i) {
        K i4;
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.c(F02, f1Var);
        F02.writeString(str);
        AbstractC3411j8.e(F02, interfaceC3595md);
        F02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel K02 = K0(F02, 1);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            i4 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            i4 = queryLocalInterface instanceof K ? (K) queryLocalInterface : new I(readStrongBinder);
        }
        K02.recycle();
        return i4;
    }

    @Override // s2.X
    public final G D1(Y2.a aVar, String str, InterfaceC3595md interfaceC3595md, int i) {
        G e9;
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        F02.writeString(str);
        AbstractC3411j8.e(F02, interfaceC3595md);
        F02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel K02 = K0(F02, 3);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            e9 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            e9 = queryLocalInterface instanceof G ? (G) queryLocalInterface : new E(readStrongBinder);
        }
        K02.recycle();
        return e9;
    }

    @Override // s2.X
    public final InterfaceC3435jf G2(Y2.a aVar, String str, InterfaceC3595md interfaceC3595md, int i) {
        InterfaceC3435jf c3275gf;
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        F02.writeString(str);
        AbstractC3411j8.e(F02, interfaceC3595md);
        F02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel K02 = K0(F02, 12);
        IBinder readStrongBinder = K02.readStrongBinder();
        int i4 = AbstractBinderC3329hf.f31584n;
        if (readStrongBinder == null) {
            c3275gf = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            c3275gf = queryLocalInterface instanceof InterfaceC3435jf ? (InterfaceC3435jf) queryLocalInterface : new C3275gf(readStrongBinder);
        }
        K02.recycle();
        return c3275gf;
    }

    @Override // s2.X
    public final InterfaceC2794Sf K2(Y2.a aVar, InterfaceC3595md interfaceC3595md, int i) {
        InterfaceC2794Sf c2760Qf;
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.e(F02, interfaceC3595md);
        F02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel K02 = K0(F02, 14);
        IBinder readStrongBinder = K02.readStrongBinder();
        int i4 = AbstractBinderC2777Rf.f27988n;
        if (readStrongBinder == null) {
            c2760Qf = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            c2760Qf = queryLocalInterface instanceof InterfaceC2794Sf ? (InterfaceC2794Sf) queryLocalInterface : new C2760Qf(readStrongBinder);
        }
        K02.recycle();
        return c2760Qf;
    }

    @Override // s2.X
    public final K L0(Y2.a aVar, f1 f1Var, String str, InterfaceC3595md interfaceC3595md, int i) {
        K i4;
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.c(F02, f1Var);
        F02.writeString(str);
        AbstractC3411j8.e(F02, interfaceC3595md);
        F02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel K02 = K0(F02, 13);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            i4 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            i4 = queryLocalInterface instanceof K ? (K) queryLocalInterface : new I(readStrongBinder);
        }
        K02.recycle();
        return i4;
    }

    @Override // s2.X
    public final InterfaceC4932g0 Q3(Y2.a aVar, int i) {
        InterfaceC4932g0 c4928e0;
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        F02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel K02 = K0(F02, 9);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            c4928e0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            c4928e0 = queryLocalInterface instanceof InterfaceC4932g0 ? (InterfaceC4932g0) queryLocalInterface : new C4928e0(readStrongBinder);
        }
        K02.recycle();
        return c4928e0;
    }

    @Override // s2.X
    public final S U1(Y2.a aVar, InterfaceC3595md interfaceC3595md, int i) {
        S q8;
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.e(F02, interfaceC3595md);
        F02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel K02 = K0(F02, 18);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            q8 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            q8 = queryLocalInterface instanceof S ? (S) queryLocalInterface : new Q(readStrongBinder);
        }
        K02.recycle();
        return q8;
    }

    @Override // s2.X
    public final InterfaceC4078vb W0(Y2.a aVar, Y2.a aVar2) {
        InterfaceC4078vb c3970tb;
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.e(F02, aVar2);
        Parcel K02 = K0(F02, 5);
        IBinder readStrongBinder = K02.readStrongBinder();
        int i = AbstractBinderC4024ub.f35318n;
        if (readStrongBinder == null) {
            c3970tb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            c3970tb = queryLocalInterface instanceof InterfaceC4078vb ? (InterfaceC4078vb) queryLocalInterface : new C3970tb(readStrongBinder);
        }
        K02.recycle();
        return c3970tb;
    }

    @Override // s2.X
    public final InterfaceC3274ge f2(Y2.a aVar, InterfaceC3595md interfaceC3595md, int i) {
        InterfaceC3274ge c3220fe;
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.e(F02, interfaceC3595md);
        F02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel K02 = K0(F02, 15);
        IBinder readStrongBinder = K02.readStrongBinder();
        int i4 = BinderC2903Yp.f29521A;
        if (readStrongBinder == null) {
            c3220fe = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c3220fe = queryLocalInterface instanceof InterfaceC3274ge ? (InterfaceC3274ge) queryLocalInterface : new C3220fe(readStrongBinder);
        }
        K02.recycle();
        return c3220fe;
    }

    @Override // s2.X
    public final InterfaceC4957t0 i1(Y2.a aVar, InterfaceC3595md interfaceC3595md, int i) {
        InterfaceC4957t0 c4955s0;
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.e(F02, interfaceC3595md);
        F02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel K02 = K0(F02, 17);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            c4955s0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c4955s0 = queryLocalInterface instanceof InterfaceC4957t0 ? (InterfaceC4957t0) queryLocalInterface : new C4955s0(readStrongBinder);
        }
        K02.recycle();
        return c4955s0;
    }

    @Override // s2.X
    public final K j1(Y2.a aVar, f1 f1Var, String str, InterfaceC3595md interfaceC3595md, int i) {
        K i4;
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        AbstractC3411j8.c(F02, f1Var);
        F02.writeString(str);
        AbstractC3411j8.e(F02, interfaceC3595md);
        F02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel K02 = K0(F02, 2);
        IBinder readStrongBinder = K02.readStrongBinder();
        if (readStrongBinder == null) {
            i4 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            i4 = queryLocalInterface instanceof K ? (K) queryLocalInterface : new I(readStrongBinder);
        }
        K02.recycle();
        return i4;
    }

    @Override // s2.X
    public final InterfaceC3596me zzf(Y2.a aVar) {
        InterfaceC3596me c3488ke;
        Parcel F02 = F0();
        AbstractC3411j8.e(F02, aVar);
        Parcel K02 = K0(F02, 8);
        IBinder readStrongBinder = K02.readStrongBinder();
        int i = AbstractBinderC3542le.f32551n;
        if (readStrongBinder == null) {
            c3488ke = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            c3488ke = queryLocalInterface instanceof InterfaceC3596me ? (InterfaceC3596me) queryLocalInterface : new C3488ke(readStrongBinder);
        }
        K02.recycle();
        return c3488ke;
    }
}
