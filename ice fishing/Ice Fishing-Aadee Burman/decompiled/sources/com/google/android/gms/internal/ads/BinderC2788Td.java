package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4900p;
import q2.C4920z0;
import x2.C5192f;
import x2.C5193g;
import x2.C5195i;
import z2.C5258a;

/* renamed from: com.google.android.gms.internal.ads.Td, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2788Td extends AbstractBinderC3336i8 implements InterfaceC2721Pd {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f27744u = 0;

    /* renamed from: n, reason: collision with root package name */
    public final RtbAdapter f27745n;

    public BinderC2788Td(RtbAdapter rtbAdapter) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        this.f27745n = rtbAdapter;
    }

    public static final void V3(String str) {
        v2.i.f("Server parameters: ".concat(String.valueOf(str)));
        try {
            new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle.putString(next, jSONObject.getString(next));
                }
            }
        } catch (JSONException e9) {
            v2.i.d("", e9);
            throw new RemoteException();
        }
    }

    public static final void W3(q2.c1 c1Var) {
        if (c1Var.f40120y) {
            return;
        }
        v2.d dVar = C4900p.f40196g.f40197a;
        v2.d.s();
    }

    public static final void X3(String str, q2.c1 c1Var) {
        String str2 = c1Var.f40106N;
        try {
            new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2721Pd
    public final void B2(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2721Pd
    public final void E3(String str, String str2, q2.c1 c1Var, W2.a aVar, InterfaceC2585Hd interfaceC2585Hd, InterfaceC3841rd interfaceC3841rd, q2.f1 f1Var) {
        try {
            RtbAdapter rtbAdapter = this.f27745n;
            V3(str2);
            U3(c1Var);
            W3(c1Var);
            X3(str2, c1Var);
            new k2.h(f1Var.f40143x, f1Var.f40140u, f1Var.f40139n);
            try {
                interfaceC2585Hd.a(new C4920z0(7, rtbAdapter.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null, null));
            } catch (RemoteException e9) {
                v2.i.d("", e9);
            }
        } catch (Throwable th) {
            v2.i.d("Adapter failed to render interscroller ad.", th);
            AbstractC2772Sd.h(aVar, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC2721Pd
    public final void J0(W2.a aVar, String str, Bundle bundle, Bundle bundle2, q2.f1 f1Var, InterfaceC2755Rd interfaceC2755Rd) {
        char c9;
        try {
            C2866Yb c2866Yb = new C2866Yb(12);
            RtbAdapter rtbAdapter = this.f27745n;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals(com.anythink.expressad.foundation.g.a.f.f19123e)) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -1052618729:
                    if (str.equals(com.anythink.expressad.foundation.g.a.f.f19119a)) {
                        c9 = 4;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 604727084:
                    if (str.equals(com.anythink.expressad.foundation.g.a.f.f19122d)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1167692200:
                    if (str.equals("app_open")) {
                        c9 = 5;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        c9 = 6;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            switch (c9) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    new ArrayList().add(new C5195i());
                    new k2.h(f1Var.f40143x, f1Var.f40140u, f1Var.f40139n);
                    rtbAdapter.collectSignals(new C5258a(), c2866Yb);
                    return;
                case 6:
                    if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.nd)).booleanValue()) {
                        new ArrayList().add(new C5195i());
                        new k2.h(f1Var.f40143x, f1Var.f40140u, f1Var.f40139n);
                        rtbAdapter.collectSignals(new C5258a(), c2866Yb);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
        } catch (Throwable th) {
            v2.i.d("Error generating signals for RTB", th);
            AbstractC2772Sd.h(aVar, th, "adapter.collectSignals");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2721Pd
    public final void N3(String str, String str2, q2.c1 c1Var, W2.a aVar, InterfaceC2585Hd interfaceC2585Hd, InterfaceC3841rd interfaceC3841rd, q2.f1 f1Var) {
        try {
            Qx qx = new Qx(this, interfaceC2585Hd);
            RtbAdapter rtbAdapter = this.f27745n;
            V3(str2);
            U3(c1Var);
            W3(c1Var);
            X3(str2, c1Var);
            new k2.h(f1Var.f40143x, f1Var.f40140u, f1Var.f40139n);
            rtbAdapter.loadRtbBannerAd(new C5193g(), qx);
        } catch (Throwable th) {
            v2.i.d("Adapter failed to render banner ad.", th);
            AbstractC2772Sd.h(aVar, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2721Pd
    public final boolean Q0(W2.a aVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2721Pd
    public final void R3(String str, String str2, q2.c1 c1Var, W2.b bVar, BinderC2717Oq binderC2717Oq, InterfaceC3841rd interfaceC3841rd) {
        j1(str, str2, c1Var, bVar, binderC2717Oq, interfaceC3841rd, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC2755Rd c2738Qd;
        InterfaceC2619Jd c2602Id;
        InterfaceC2551Fd c2534Ed;
        InterfaceC2755Rd interfaceC2755Rd = null;
        InterfaceC2551Fd interfaceC2551Fd = null;
        InterfaceC2653Ld c2636Kd = null;
        InterfaceC2585Hd c2568Gd = null;
        InterfaceC2687Nd c2670Md = null;
        InterfaceC2653Ld c2636Kd2 = null;
        InterfaceC2687Nd c2670Md2 = null;
        InterfaceC2619Jd interfaceC2619Jd = null;
        InterfaceC2585Hd c2568Gd2 = null;
        if (i == 1) {
            W2.a w02 = W2.b.w0(parcel.readStrongBinder());
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) AbstractC3388j8.b(parcel, creator);
            Bundle bundle2 = (Bundle) AbstractC3388j8.b(parcel, creator);
            q2.f1 f1Var = (q2.f1) AbstractC3388j8.b(parcel, q2.f1.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (!(queryLocalInterface instanceof InterfaceC2755Rd)) {
                    c2738Qd = new C2738Qd(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback", 2);
                    AbstractC3388j8.f(parcel);
                    J0(w02, readString, bundle, bundle2, f1Var, c2738Qd);
                    parcel2.writeNoException();
                    return true;
                }
                interfaceC2755Rd = (InterfaceC2755Rd) queryLocalInterface;
            }
            c2738Qd = interfaceC2755Rd;
            AbstractC3388j8.f(parcel);
            J0(w02, readString, bundle, bundle2, f1Var, c2738Qd);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            C2804Ud e9 = e();
            parcel2.writeNoException();
            AbstractC3388j8.d(parcel2, e9);
            return true;
        }
        if (i == 3) {
            C2804Ud h9 = h();
            parcel2.writeNoException();
            AbstractC3388j8.d(parcel2, h9);
            return true;
        }
        if (i == 5) {
            q2.A0 g4 = g();
            parcel2.writeNoException();
            AbstractC3388j8.e(parcel2, g4);
            return true;
        }
        if (i == 10) {
            W2.b.w0(parcel.readStrongBinder());
            AbstractC3388j8.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i == 11) {
            parcel.createStringArray();
            AbstractC3388j8.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        switch (i) {
            case 13:
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                q2.c1 c1Var = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                W2.a w03 = W2.b.w0(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    c2568Gd2 = queryLocalInterface2 instanceof InterfaceC2585Hd ? (InterfaceC2585Hd) queryLocalInterface2 : new C2568Gd(readStrongBinder2);
                }
                InterfaceC2585Hd interfaceC2585Hd = c2568Gd2;
                InterfaceC3841rd U3 = AbstractBinderC3788qd.U3(parcel.readStrongBinder());
                q2.f1 f1Var2 = (q2.f1) AbstractC3388j8.b(parcel, q2.f1.CREATOR);
                AbstractC3388j8.f(parcel);
                N3(readString2, readString3, c1Var, w03, interfaceC2585Hd, U3, f1Var2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                q2.c1 c1Var2 = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                W2.a w04 = W2.b.w0(parcel.readStrongBinder());
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    if (!(queryLocalInterface3 instanceof InterfaceC2619Jd)) {
                        c2602Id = new C2602Id(readStrongBinder3, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback", 2);
                        InterfaceC3841rd U32 = AbstractBinderC3788qd.U3(parcel.readStrongBinder());
                        AbstractC3388j8.f(parcel);
                        t3(readString4, readString5, c1Var2, w04, c2602Id, U32);
                        parcel2.writeNoException();
                        return true;
                    }
                    interfaceC2619Jd = (InterfaceC2619Jd) queryLocalInterface3;
                }
                c2602Id = interfaceC2619Jd;
                InterfaceC3841rd U322 = AbstractBinderC3788qd.U3(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                t3(readString4, readString5, c1Var2, w04, c2602Id, U322);
                parcel2.writeNoException();
                return true;
            case 15:
                W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 16:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                q2.c1 c1Var3 = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                W2.a w05 = W2.b.w0(parcel.readStrongBinder());
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    c2670Md2 = queryLocalInterface4 instanceof InterfaceC2687Nd ? (InterfaceC2687Nd) queryLocalInterface4 : new C2670Md(readStrongBinder4);
                }
                InterfaceC2687Nd interfaceC2687Nd = c2670Md2;
                InterfaceC3841rd U33 = AbstractBinderC3788qd.U3(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                k3(readString6, readString7, c1Var3, w05, interfaceC2687Nd, U33);
                parcel2.writeNoException();
                return true;
            case 17:
                W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 18:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                q2.c1 c1Var4 = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                W2.a w06 = W2.b.w0(parcel.readStrongBinder());
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    c2636Kd2 = queryLocalInterface5 instanceof InterfaceC2653Ld ? (InterfaceC2653Ld) queryLocalInterface5 : new C2636Kd(readStrongBinder5);
                }
                InterfaceC2653Ld interfaceC2653Ld = c2636Kd2;
                InterfaceC3841rd U34 = AbstractBinderC3788qd.U3(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                j1(readString8, readString9, c1Var4, w06, interfaceC2653Ld, U34, null);
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.readString();
                AbstractC3388j8.f(parcel);
                parcel2.writeNoException();
                return true;
            case 20:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                q2.c1 c1Var5 = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                W2.a w07 = W2.b.w0(parcel.readStrongBinder());
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    c2670Md = queryLocalInterface6 instanceof InterfaceC2687Nd ? (InterfaceC2687Nd) queryLocalInterface6 : new C2670Md(readStrongBinder6);
                }
                InterfaceC2687Nd interfaceC2687Nd2 = c2670Md;
                InterfaceC3841rd U35 = AbstractBinderC3788qd.U3(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                w1(readString10, readString11, c1Var5, w07, interfaceC2687Nd2, U35);
                parcel2.writeNoException();
                return true;
            case 21:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                q2.c1 c1Var6 = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                W2.a w08 = W2.b.w0(parcel.readStrongBinder());
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    c2568Gd = queryLocalInterface7 instanceof InterfaceC2585Hd ? (InterfaceC2585Hd) queryLocalInterface7 : new C2568Gd(readStrongBinder7);
                }
                InterfaceC2585Hd interfaceC2585Hd2 = c2568Gd;
                InterfaceC3841rd U36 = AbstractBinderC3788qd.U3(parcel.readStrongBinder());
                q2.f1 f1Var3 = (q2.f1) AbstractC3388j8.b(parcel, q2.f1.CREATOR);
                AbstractC3388j8.f(parcel);
                E3(readString12, readString13, c1Var6, w08, interfaceC2585Hd2, U36, f1Var3);
                parcel2.writeNoException();
                return true;
            case 22:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                q2.c1 c1Var7 = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                W2.a w09 = W2.b.w0(parcel.readStrongBinder());
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    c2636Kd = queryLocalInterface8 instanceof InterfaceC2653Ld ? (InterfaceC2653Ld) queryLocalInterface8 : new C2636Kd(readStrongBinder8);
                }
                InterfaceC2653Ld interfaceC2653Ld2 = c2636Kd;
                InterfaceC3841rd U37 = AbstractBinderC3788qd.U3(parcel.readStrongBinder());
                C3462kb c3462kb = (C3462kb) AbstractC3388j8.b(parcel, C3462kb.CREATOR);
                AbstractC3388j8.f(parcel);
                j1(readString14, readString15, c1Var7, w09, interfaceC2653Ld2, U37, c3462kb);
                parcel2.writeNoException();
                return true;
            case 23:
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                q2.c1 c1Var8 = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                W2.a w010 = W2.b.w0(parcel.readStrongBinder());
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                    if (!(queryLocalInterface9 instanceof InterfaceC2551Fd)) {
                        c2534Ed = new C2534Ed(readStrongBinder9, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback", 2);
                        InterfaceC3841rd U38 = AbstractBinderC3788qd.U3(parcel.readStrongBinder());
                        AbstractC3388j8.f(parcel);
                        z2(readString16, readString17, c1Var8, w010, c2534Ed, U38);
                        parcel2.writeNoException();
                        return true;
                    }
                    interfaceC2551Fd = (InterfaceC2551Fd) queryLocalInterface9;
                }
                c2534Ed = interfaceC2551Fd;
                InterfaceC3841rd U382 = AbstractBinderC3788qd.U3(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                z2(readString16, readString17, c1Var8, w010, c2534Ed, U382);
                parcel2.writeNoException();
                return true;
            case 24:
                W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            default:
                return false;
        }
    }

    public final void U3(q2.c1 c1Var) {
        Bundle bundle = c1Var.f40099F;
        if (bundle == null || bundle.getBundle(this.f27745n.getClass().getName()) == null) {
            new Bundle();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2721Pd
    public final C2804Ud e() {
        k2.t versionInfo = this.f27745n.getVersionInfo();
        return new C2804Ud(versionInfo.f38613a, versionInfo.f38614b, versionInfo.f38615c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2721Pd
    public final boolean f3(W2.b bVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2721Pd
    public final q2.A0 g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2721Pd
    public final C2804Ud h() {
        k2.t sDKVersionInfo = this.f27745n.getSDKVersionInfo();
        return new C2804Ud(sDKVersionInfo.f38613a, sDKVersionInfo.f38614b, sDKVersionInfo.f38615c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2721Pd
    public final void j1(String str, String str2, q2.c1 c1Var, W2.a aVar, InterfaceC2653Ld interfaceC2653Ld, InterfaceC3841rd interfaceC3841rd, C3462kb c3462kb) {
        RtbAdapter rtbAdapter = this.f27745n;
        try {
            C3657o7 c3657o7 = new C3657o7(this, interfaceC2653Ld);
            V3(str2);
            U3(c1Var);
            W3(c1Var);
            X3(str2, c1Var);
            rtbAdapter.loadRtbNativeAdMapper(new x2.l(), c3657o7);
        } catch (Throwable th) {
            v2.i.d("Adapter failed to render native ad.", th);
            AbstractC2772Sd.h(aVar, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                C3694or c3694or = new C3694or(this, interfaceC2653Ld);
                V3(str2);
                U3(c1Var);
                W3(c1Var);
                X3(str2, c1Var);
                rtbAdapter.loadRtbNativeAd(new x2.l(), c3694or);
            } catch (Throwable th2) {
                v2.i.d("Adapter failed to render native ad.", th2);
                AbstractC2772Sd.h(aVar, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2721Pd
    public final boolean j2(W2.b bVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2721Pd
    public final void k3(String str, String str2, q2.c1 c1Var, W2.a aVar, InterfaceC2687Nd interfaceC2687Nd, InterfaceC3841rd interfaceC3841rd) {
        try {
            Ux ux = new Ux(this, interfaceC2687Nd);
            RtbAdapter rtbAdapter = this.f27745n;
            V3(str2);
            U3(c1Var);
            W3(c1Var);
            X3(str2, c1Var);
            rtbAdapter.loadRtbRewardedAd(new x2.n(), ux);
        } catch (Throwable th) {
            v2.i.d("Adapter failed to render rewarded ad.", th);
            AbstractC2772Sd.h(aVar, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2721Pd
    public final void t3(String str, String str2, q2.c1 c1Var, W2.a aVar, InterfaceC2619Jd interfaceC2619Jd, InterfaceC3841rd interfaceC3841rd) {
        try {
            Ux ux = new Ux(this, interfaceC2619Jd);
            RtbAdapter rtbAdapter = this.f27745n;
            V3(str2);
            U3(c1Var);
            W3(c1Var);
            X3(str2, c1Var);
            rtbAdapter.loadRtbInterstitialAd(new x2.j(), ux);
        } catch (Throwable th) {
            v2.i.d("Adapter failed to render interstitial ad.", th);
            AbstractC2772Sd.h(aVar, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2721Pd
    public final void w1(String str, String str2, q2.c1 c1Var, W2.a aVar, InterfaceC2687Nd interfaceC2687Nd, InterfaceC3841rd interfaceC3841rd) {
        try {
            Ux ux = new Ux(this, interfaceC2687Nd);
            RtbAdapter rtbAdapter = this.f27745n;
            V3(str2);
            U3(c1Var);
            W3(c1Var);
            X3(str2, c1Var);
            rtbAdapter.loadRtbRewardedInterstitialAd(new x2.n(), ux);
        } catch (Throwable th) {
            v2.i.d("Adapter failed to render rewarded interstitial ad.", th);
            AbstractC2772Sd.h(aVar, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2721Pd
    public final void z2(String str, String str2, q2.c1 c1Var, W2.a aVar, InterfaceC2551Fd interfaceC2551Fd, InterfaceC3841rd interfaceC3841rd) {
        try {
            Qx qx = new Qx(this, interfaceC2551Fd);
            RtbAdapter rtbAdapter = this.f27745n;
            V3(str2);
            U3(c1Var);
            W3(c1Var);
            X3(str2, c1Var);
            rtbAdapter.loadRtbAppOpenAd(new C5192f(), qx);
        } catch (Throwable th) {
            v2.i.d("Adapter failed to render app open ad.", th);
            AbstractC2772Sd.h(aVar, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }
}
