package q2;

import a3.AbstractC0432a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractBinderC2757Rf;
import com.google.android.gms.internal.ads.AbstractBinderC3306hf;
import com.google.android.gms.internal.ads.AbstractBinderC3519le;
import com.google.android.gms.internal.ads.AbstractBinderC4001ub;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import com.google.android.gms.internal.ads.BinderC2880Yp;
import com.google.android.gms.internal.ads.C2740Qf;
import com.google.android.gms.internal.ads.C3197fe;
import com.google.android.gms.internal.ads.C3252gf;
import com.google.android.gms.internal.ads.C3465ke;
import com.google.android.gms.internal.ads.C3947tb;
import com.google.android.gms.internal.ads.InterfaceC2774Sf;
import com.google.android.gms.internal.ads.InterfaceC3251ge;
import com.google.android.gms.internal.ads.InterfaceC3412jf;
import com.google.android.gms.internal.ads.InterfaceC3572md;
import com.google.android.gms.internal.ads.InterfaceC3573me;
import com.google.android.gms.internal.ads.InterfaceC4055vb;

/* loaded from: classes.dex */
public final class W extends AbstractC0432a implements X {
    @Override // q2.X
    public final InterfaceC4908t0 A1(W2.a aVar, InterfaceC3572md interfaceC3572md, int i) {
        InterfaceC4908t0 c4906s0;
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.e(H02, interfaceC3572md);
        H02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel M02 = M0(H02, 17);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            c4906s0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            c4906s0 = queryLocalInterface instanceof InterfaceC4908t0 ? (InterfaceC4908t0) queryLocalInterface : new C4906s0(readStrongBinder);
        }
        M02.recycle();
        return c4906s0;
    }

    @Override // q2.X
    public final InterfaceC2774Sf C3(W2.a aVar, InterfaceC3572md interfaceC3572md, int i) {
        InterfaceC2774Sf c2740Qf;
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.e(H02, interfaceC3572md);
        H02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel M02 = M0(H02, 14);
        IBinder readStrongBinder = M02.readStrongBinder();
        int i6 = AbstractBinderC2757Rf.f27304n;
        if (readStrongBinder == null) {
            c2740Qf = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            c2740Qf = queryLocalInterface instanceof InterfaceC2774Sf ? (InterfaceC2774Sf) queryLocalInterface : new C2740Qf(readStrongBinder);
        }
        M02.recycle();
        return c2740Qf;
    }

    @Override // q2.X
    public final K F3(W2.a aVar, f1 f1Var, String str, InterfaceC3572md interfaceC3572md, int i) {
        K i6;
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.c(H02, f1Var);
        H02.writeString(str);
        AbstractC3388j8.e(H02, interfaceC3572md);
        H02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel M02 = M0(H02, 13);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            i6 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            i6 = queryLocalInterface instanceof K ? (K) queryLocalInterface : new I(readStrongBinder);
        }
        M02.recycle();
        return i6;
    }

    @Override // q2.X
    public final InterfaceC4055vb K3(W2.a aVar, W2.a aVar2) {
        InterfaceC4055vb c3947tb;
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.e(H02, aVar2);
        Parcel M02 = M0(H02, 5);
        IBinder readStrongBinder = M02.readStrongBinder();
        int i = AbstractBinderC4001ub.f34546n;
        if (readStrongBinder == null) {
            c3947tb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            c3947tb = queryLocalInterface instanceof InterfaceC4055vb ? (InterfaceC4055vb) queryLocalInterface : new C3947tb(readStrongBinder);
        }
        M02.recycle();
        return c3947tb;
    }

    @Override // q2.X
    public final G N2(W2.a aVar, String str, InterfaceC3572md interfaceC3572md, int i) {
        G e9;
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        H02.writeString(str);
        AbstractC3388j8.e(H02, interfaceC3572md);
        H02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel M02 = M0(H02, 3);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            e9 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            e9 = queryLocalInterface instanceof G ? (G) queryLocalInterface : new E(readStrongBinder);
        }
        M02.recycle();
        return e9;
    }

    @Override // q2.X
    public final K d1(W2.a aVar, f1 f1Var, String str, InterfaceC3572md interfaceC3572md, int i) {
        K i6;
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.c(H02, f1Var);
        H02.writeString(str);
        AbstractC3388j8.e(H02, interfaceC3572md);
        H02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel M02 = M0(H02, 2);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            i6 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            i6 = queryLocalInterface instanceof K ? (K) queryLocalInterface : new I(readStrongBinder);
        }
        M02.recycle();
        return i6;
    }

    @Override // q2.X
    public final InterfaceC3412jf e3(W2.a aVar, String str, InterfaceC3572md interfaceC3572md, int i) {
        InterfaceC3412jf c3252gf;
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        H02.writeString(str);
        AbstractC3388j8.e(H02, interfaceC3572md);
        H02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel M02 = M0(H02, 12);
        IBinder readStrongBinder = M02.readStrongBinder();
        int i6 = AbstractBinderC3306hf.f30823n;
        if (readStrongBinder == null) {
            c3252gf = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            c3252gf = queryLocalInterface instanceof InterfaceC3412jf ? (InterfaceC3412jf) queryLocalInterface : new C3252gf(readStrongBinder);
        }
        M02.recycle();
        return c3252gf;
    }

    @Override // q2.X
    public final InterfaceC3251ge u0(W2.a aVar, InterfaceC3572md interfaceC3572md, int i) {
        InterfaceC3251ge c3197fe;
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.e(H02, interfaceC3572md);
        H02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel M02 = M0(H02, 15);
        IBinder readStrongBinder = M02.readStrongBinder();
        int i6 = BinderC2880Yp.f28742A;
        if (readStrongBinder == null) {
            c3197fe = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c3197fe = queryLocalInterface instanceof InterfaceC3251ge ? (InterfaceC3251ge) queryLocalInterface : new C3197fe(readStrongBinder);
        }
        M02.recycle();
        return c3197fe;
    }

    @Override // q2.X
    public final InterfaceC4883g0 v2(W2.a aVar, int i) {
        InterfaceC4883g0 c4879e0;
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        H02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel M02 = M0(H02, 9);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            c4879e0 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            c4879e0 = queryLocalInterface instanceof InterfaceC4883g0 ? (InterfaceC4883g0) queryLocalInterface : new C4879e0(readStrongBinder);
        }
        M02.recycle();
        return c4879e0;
    }

    @Override // q2.X
    public final S y1(W2.a aVar, InterfaceC3572md interfaceC3572md, int i) {
        S q8;
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.e(H02, interfaceC3572md);
        H02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel M02 = M0(H02, 18);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            q8 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            q8 = queryLocalInterface instanceof S ? (S) queryLocalInterface : new Q(readStrongBinder);
        }
        M02.recycle();
        return q8;
    }

    @Override // q2.X
    public final K z1(W2.a aVar, f1 f1Var, String str, InterfaceC3572md interfaceC3572md, int i) {
        K i6;
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        AbstractC3388j8.c(H02, f1Var);
        H02.writeString(str);
        AbstractC3388j8.e(H02, interfaceC3572md);
        H02.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel M02 = M0(H02, 1);
        IBinder readStrongBinder = M02.readStrongBinder();
        if (readStrongBinder == null) {
            i6 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            i6 = queryLocalInterface instanceof K ? (K) queryLocalInterface : new I(readStrongBinder);
        }
        M02.recycle();
        return i6;
    }

    @Override // q2.X
    public final InterfaceC3573me zzf(W2.a aVar) {
        InterfaceC3573me c3465ke;
        Parcel H02 = H0();
        AbstractC3388j8.e(H02, aVar);
        Parcel M02 = M0(H02, 8);
        IBinder readStrongBinder = M02.readStrongBinder();
        int i = AbstractBinderC3519le.f31772n;
        if (readStrongBinder == null) {
            c3465ke = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            c3465ke = queryLocalInterface instanceof InterfaceC3573me ? (InterfaceC3573me) queryLocalInterface : new C3465ke(readStrongBinder);
        }
        M02.recycle();
        return c3465ke;
    }
}
