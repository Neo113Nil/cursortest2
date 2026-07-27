package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC3336i8;
import com.google.android.gms.internal.ads.AbstractC3388j8;
import com.google.android.gms.internal.ads.C2532Eb;
import com.google.android.gms.internal.ads.C2549Fb;
import com.google.android.gms.internal.ads.C2550Fc;
import com.google.android.gms.internal.ads.C2566Gb;
import com.google.android.gms.internal.ads.C2600Ib;
import com.google.android.gms.internal.ads.C2618Jc;
import com.google.android.gms.internal.ads.C2651Lb;
import com.google.android.gms.internal.ads.C2668Mb;
import com.google.android.gms.internal.ads.C3462kb;
import com.google.android.gms.internal.ads.InterfaceC2583Hb;
import com.google.android.gms.internal.ads.InterfaceC2617Jb;
import com.google.android.gms.internal.ads.InterfaceC2685Nb;
import n2.C4750a;
import n2.C4753d;

/* loaded from: classes.dex */
public abstract class F extends AbstractBinderC3336i8 implements G {
    public F() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC2617Jb c2600Ib;
        InterfaceC4915x interfaceC4915x = null;
        C2618Jc c2618Jc = null;
        InterfaceC2685Nb interfaceC2685Nb = null;
        C2651Lb c2651Lb = null;
        Y y7 = null;
        InterfaceC2583Hb interfaceC2583Hb = null;
        C2549Fb c2549Fb = null;
        C2532Eb c2532Eb = null;
        switch (i) {
            case 1:
                D d2 = d();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, d2);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    interfaceC4915x = queryLocalInterface instanceof InterfaceC4915x ? (InterfaceC4915x) queryLocalInterface : new C4911v(readStrongBinder);
                }
                AbstractC3388j8.f(parcel);
                G2(interfaceC4915x);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    c2532Eb = queryLocalInterface2 instanceof C2532Eb ? (C2532Eb) queryLocalInterface2 : new C2532Eb(readStrongBinder2, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener", 2);
                }
                AbstractC3388j8.f(parcel);
                Y0(c2532Eb);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    c2549Fb = queryLocalInterface3 instanceof C2549Fb ? (C2549Fb) queryLocalInterface3 : new C2549Fb(readStrongBinder3, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener", 2);
                }
                AbstractC3388j8.f(parcel);
                a3(c2549Fb);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    c2600Ib = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    c2600Ib = queryLocalInterface4 instanceof InterfaceC2617Jb ? (InterfaceC2617Jb) queryLocalInterface4 : new C2600Ib(readStrongBinder4, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener", 2);
                }
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    interfaceC2583Hb = queryLocalInterface5 instanceof InterfaceC2583Hb ? (InterfaceC2583Hb) queryLocalInterface5 : new C2566Gb(readStrongBinder5, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener", 2);
                }
                AbstractC3388j8.f(parcel);
                N1(readString, c2600Ib, interfaceC2583Hb);
                parcel2.writeNoException();
                return true;
            case 6:
                C3462kb c3462kb = (C3462kb) AbstractC3388j8.b(parcel, C3462kb.CREATOR);
                AbstractC3388j8.f(parcel);
                J3(c3462kb);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    y7 = queryLocalInterface6 instanceof Y ? (Y) queryLocalInterface6 : new Y(readStrongBinder6);
                }
                AbstractC3388j8.f(parcel);
                L3(y7);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    c2651Lb = queryLocalInterface7 instanceof C2651Lb ? (C2651Lb) queryLocalInterface7 : new C2651Lb(readStrongBinder7, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener", 2);
                }
                f1 f1Var = (f1) AbstractC3388j8.b(parcel, f1.CREATOR);
                AbstractC3388j8.f(parcel);
                g2(c2651Lb, f1Var);
                parcel2.writeNoException();
                return true;
            case 9:
                C4753d c4753d = (C4753d) AbstractC3388j8.b(parcel, C4753d.CREATOR);
                AbstractC3388j8.f(parcel);
                x2(c4753d);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    interfaceC2685Nb = queryLocalInterface8 instanceof InterfaceC2685Nb ? (InterfaceC2685Nb) queryLocalInterface8 : new C2668Mb(readStrongBinder8, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener", 2);
                }
                AbstractC3388j8.f(parcel);
                J2(interfaceC2685Nb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                C2550Fc c2550Fc = (C2550Fc) AbstractC3388j8.b(parcel, C2550Fc.CREATOR);
                AbstractC3388j8.f(parcel);
                w2(c2550Fc);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    c2618Jc = queryLocalInterface9 instanceof C2618Jc ? (C2618Jc) queryLocalInterface9 : new C2618Jc(readStrongBinder9, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback", 2);
                }
                AbstractC3388j8.f(parcel);
                G0(c2618Jc);
                parcel2.writeNoException();
                return true;
            case 15:
                C4750a c4750a = (C4750a) AbstractC3388j8.b(parcel, C4750a.CREATOR);
                AbstractC3388j8.f(parcel);
                Z0(c4750a);
                parcel2.writeNoException();
                return true;
        }
    }
}
