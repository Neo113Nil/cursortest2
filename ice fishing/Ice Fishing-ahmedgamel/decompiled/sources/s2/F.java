package s2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3359i8;
import com.google.android.gms.internal.ads.AbstractC3411j8;
import com.google.android.gms.internal.ads.C2552Eb;
import com.google.android.gms.internal.ads.C2569Fb;
import com.google.android.gms.internal.ads.C2570Fc;
import com.google.android.gms.internal.ads.C2586Gb;
import com.google.android.gms.internal.ads.C2620Ib;
import com.google.android.gms.internal.ads.C2638Jc;
import com.google.android.gms.internal.ads.C2671Lb;
import com.google.android.gms.internal.ads.C2688Mb;
import com.google.android.gms.internal.ads.C3485kb;
import com.google.android.gms.internal.ads.InterfaceC2603Hb;
import com.google.android.gms.internal.ads.InterfaceC2637Jb;
import com.google.android.gms.internal.ads.InterfaceC2705Nb;
import p2.C4830a;
import p2.C4833d;

/* loaded from: classes.dex */
public abstract class F extends AbstractBinderC3359i8 implements G {
    public F() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC2637Jb c2620Ib;
        InterfaceC4964x interfaceC4964x = null;
        C2638Jc c2638Jc = null;
        InterfaceC2705Nb interfaceC2705Nb = null;
        C2671Lb c2671Lb = null;
        Y y7 = null;
        InterfaceC2603Hb interfaceC2603Hb = null;
        C2569Fb c2569Fb = null;
        C2552Eb c2552Eb = null;
        switch (i) {
            case 1:
                D d9 = d();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, d9);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    interfaceC4964x = queryLocalInterface instanceof InterfaceC4964x ? (InterfaceC4964x) queryLocalInterface : new C4960v(readStrongBinder);
                }
                AbstractC3411j8.f(parcel);
                M0(interfaceC4964x);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    c2552Eb = queryLocalInterface2 instanceof C2552Eb ? (C2552Eb) queryLocalInterface2 : new C2552Eb(readStrongBinder2, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener", 1);
                }
                AbstractC3411j8.f(parcel);
                Z0(c2552Eb);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    c2569Fb = queryLocalInterface3 instanceof C2569Fb ? (C2569Fb) queryLocalInterface3 : new C2569Fb(readStrongBinder3, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener", 1);
                }
                AbstractC3411j8.f(parcel);
                T2(c2569Fb);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    c2620Ib = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    c2620Ib = queryLocalInterface4 instanceof InterfaceC2637Jb ? (InterfaceC2637Jb) queryLocalInterface4 : new C2620Ib(readStrongBinder4, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener", 1);
                }
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    interfaceC2603Hb = queryLocalInterface5 instanceof InterfaceC2603Hb ? (InterfaceC2603Hb) queryLocalInterface5 : new C2586Gb(readStrongBinder5, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener", 1);
                }
                AbstractC3411j8.f(parcel);
                J1(readString, c2620Ib, interfaceC2603Hb);
                parcel2.writeNoException();
                return true;
            case 6:
                C3485kb c3485kb = (C3485kb) AbstractC3411j8.b(parcel, C3485kb.CREATOR);
                AbstractC3411j8.f(parcel);
                H3(c3485kb);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    y7 = queryLocalInterface6 instanceof Y ? (Y) queryLocalInterface6 : new Y(readStrongBinder6);
                }
                AbstractC3411j8.f(parcel);
                R0(y7);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    c2671Lb = queryLocalInterface7 instanceof C2671Lb ? (C2671Lb) queryLocalInterface7 : new C2671Lb(readStrongBinder7, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener", 1);
                }
                f1 f1Var = (f1) AbstractC3411j8.b(parcel, f1.CREATOR);
                AbstractC3411j8.f(parcel);
                f1(c2671Lb, f1Var);
                parcel2.writeNoException();
                return true;
            case 9:
                C4833d c4833d = (C4833d) AbstractC3411j8.b(parcel, C4833d.CREATOR);
                AbstractC3411j8.f(parcel);
                O1(c4833d);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    interfaceC2705Nb = queryLocalInterface8 instanceof InterfaceC2705Nb ? (InterfaceC2705Nb) queryLocalInterface8 : new C2688Mb(readStrongBinder8, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener", 1);
                }
                AbstractC3411j8.f(parcel);
                H2(interfaceC2705Nb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                C2570Fc c2570Fc = (C2570Fc) AbstractC3411j8.b(parcel, C2570Fc.CREATOR);
                AbstractC3411j8.f(parcel);
                t2(c2570Fc);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    c2638Jc = queryLocalInterface9 instanceof C2638Jc ? (C2638Jc) queryLocalInterface9 : new C2638Jc(readStrongBinder9, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback", 1);
                }
                AbstractC3411j8.f(parcel);
                E0(c2638Jc);
                parcel2.writeNoException();
                return true;
            case 15:
                C4830a c4830a = (C4830a) AbstractC3411j8.b(parcel, C4830a.CREATOR);
                AbstractC3411j8.f(parcel);
                u2(c4830a);
                parcel2.writeNoException();
                return true;
        }
    }
}
