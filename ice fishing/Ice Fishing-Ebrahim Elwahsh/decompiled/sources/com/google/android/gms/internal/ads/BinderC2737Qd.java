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
import k2.C4637h;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4907p;
import q2.C4927z0;
import w2.C5158f;
import w2.C5159g;
import w2.C5161i;
import y2.C5249a;

/* renamed from: com.google.android.gms.internal.ads.Qd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2737Qd extends AbstractBinderC3186f8 implements InterfaceC2669Md {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f27178u = 0;

    /* renamed from: n, reason: collision with root package name */
    public final RtbAdapter f27179n;

    public BinderC2737Qd(RtbAdapter rtbAdapter) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        this.f27179n = rtbAdapter;
    }

    public static final void H3(String str) {
        u2.i.f("Server parameters: ".concat(String.valueOf(str)));
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
        } catch (JSONException e6) {
            u2.i.d("", e6);
            throw new RemoteException();
        }
    }

    public static final void I3(q2.d1 d1Var) {
        if (d1Var.f40034y) {
            return;
        }
        u2.d dVar = C4907p.f40108g.f40109a;
        u2.d.r();
    }

    public static final void J3(String str, q2.d1 d1Var) {
        String str2 = d1Var.f40020N;
        try {
            new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2669Md
    public final void D3(String str, String str2, q2.d1 d1Var, V2.a aVar, InterfaceC2567Gd interfaceC2567Gd, InterfaceC3693od interfaceC3693od) {
        try {
            Vx vx = new Vx(this, interfaceC2567Gd);
            RtbAdapter rtbAdapter = this.f27179n;
            H3(str2);
            G3(d1Var);
            I3(d1Var);
            J3(str2, d1Var);
            rtbAdapter.loadRtbInterstitialAd(new w2.j(), vx);
        } catch (Throwable th) {
            u2.i.d("Adapter failed to render interstitial ad.", th);
            PA.l(aVar, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2669Md
    public final boolean F2(V2.b bVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC2703Od c2686Nd;
        InterfaceC2567Gd c2550Fd;
        InterfaceC2499Cd c2482Bd;
        InterfaceC2703Od interfaceC2703Od = null;
        InterfaceC2499Cd interfaceC2499Cd = null;
        InterfaceC2601Id c2584Hd = null;
        InterfaceC2533Ed c2516Dd = null;
        InterfaceC2635Kd c2618Jd = null;
        InterfaceC2601Id c2584Hd2 = null;
        InterfaceC2635Kd c2618Jd2 = null;
        InterfaceC2567Gd interfaceC2567Gd = null;
        InterfaceC2533Ed c2516Dd2 = null;
        if (i == 1) {
            V2.a u02 = V2.b.u0(parcel.readStrongBinder());
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) AbstractC3241g8.b(parcel, creator);
            Bundle bundle2 = (Bundle) AbstractC3241g8.b(parcel, creator);
            q2.g1 g1Var = (q2.g1) AbstractC3241g8.b(parcel, q2.g1.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (!(queryLocalInterface instanceof InterfaceC2703Od)) {
                    c2686Nd = new C2686Nd(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback", 2);
                    AbstractC3241g8.f(parcel);
                    y3(u02, readString, bundle, bundle2, g1Var, c2686Nd);
                    parcel2.writeNoException();
                    return true;
                }
                interfaceC2703Od = (InterfaceC2703Od) queryLocalInterface;
            }
            c2686Nd = interfaceC2703Od;
            AbstractC3241g8.f(parcel);
            y3(u02, readString, bundle, bundle2, g1Var, c2686Nd);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            C2754Rd f6 = f();
            parcel2.writeNoException();
            AbstractC3241g8.d(parcel2, f6);
            return true;
        }
        if (i == 3) {
            C2754Rd e6 = e();
            parcel2.writeNoException();
            AbstractC3241g8.d(parcel2, e6);
            return true;
        }
        if (i == 5) {
            q2.A0 g9 = g();
            parcel2.writeNoException();
            AbstractC3241g8.e(parcel2, g9);
            return true;
        }
        if (i == 10) {
            V2.b.u0(parcel.readStrongBinder());
            AbstractC3241g8.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i == 11) {
            parcel.createStringArray();
            AbstractC3241g8.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        switch (i) {
            case 13:
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                q2.d1 d1Var = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                V2.a u03 = V2.b.u0(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    c2516Dd2 = queryLocalInterface2 instanceof InterfaceC2533Ed ? (InterfaceC2533Ed) queryLocalInterface2 : new C2516Dd(readStrongBinder2);
                }
                InterfaceC2533Ed interfaceC2533Ed = c2516Dd2;
                InterfaceC3693od G32 = AbstractBinderC3639nd.G3(parcel.readStrongBinder());
                q2.g1 g1Var2 = (q2.g1) AbstractC3241g8.b(parcel, q2.g1.CREATOR);
                AbstractC3241g8.f(parcel);
                l3(readString2, readString3, d1Var, u03, interfaceC2533Ed, G32, g1Var2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                q2.d1 d1Var2 = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                V2.a u04 = V2.b.u0(parcel.readStrongBinder());
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    if (!(queryLocalInterface3 instanceof InterfaceC2567Gd)) {
                        c2550Fd = new C2550Fd(readStrongBinder3, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback", 2);
                        InterfaceC3693od G33 = AbstractBinderC3639nd.G3(parcel.readStrongBinder());
                        AbstractC3241g8.f(parcel);
                        D3(readString4, readString5, d1Var2, u04, c2550Fd, G33);
                        parcel2.writeNoException();
                        return true;
                    }
                    interfaceC2567Gd = (InterfaceC2567Gd) queryLocalInterface3;
                }
                c2550Fd = interfaceC2567Gd;
                InterfaceC3693od G332 = AbstractBinderC3639nd.G3(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                D3(readString4, readString5, d1Var2, u04, c2550Fd, G332);
                parcel2.writeNoException();
                return true;
            case 15:
                V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 16:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                q2.d1 d1Var3 = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                V2.a u05 = V2.b.u0(parcel.readStrongBinder());
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    c2618Jd2 = queryLocalInterface4 instanceof InterfaceC2635Kd ? (InterfaceC2635Kd) queryLocalInterface4 : new C2618Jd(readStrongBinder4);
                }
                InterfaceC2635Kd interfaceC2635Kd = c2618Jd2;
                InterfaceC3693od G34 = AbstractBinderC3639nd.G3(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                i1(readString6, readString7, d1Var3, u05, interfaceC2635Kd, G34);
                parcel2.writeNoException();
                return true;
            case 17:
                V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 18:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                q2.d1 d1Var4 = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                V2.a u06 = V2.b.u0(parcel.readStrongBinder());
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    c2584Hd2 = queryLocalInterface5 instanceof InterfaceC2601Id ? (InterfaceC2601Id) queryLocalInterface5 : new C2584Hd(readStrongBinder5);
                }
                InterfaceC2601Id interfaceC2601Id = c2584Hd2;
                InterfaceC3693od G35 = AbstractBinderC3639nd.G3(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                w3(readString8, readString9, d1Var4, u06, interfaceC2601Id, G35, null);
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.readString();
                AbstractC3241g8.f(parcel);
                parcel2.writeNoException();
                return true;
            case 20:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                q2.d1 d1Var5 = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                V2.a u07 = V2.b.u0(parcel.readStrongBinder());
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    c2618Jd = queryLocalInterface6 instanceof InterfaceC2635Kd ? (InterfaceC2635Kd) queryLocalInterface6 : new C2618Jd(readStrongBinder6);
                }
                InterfaceC2635Kd interfaceC2635Kd2 = c2618Jd;
                InterfaceC3693od G36 = AbstractBinderC3639nd.G3(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                e2(readString10, readString11, d1Var5, u07, interfaceC2635Kd2, G36);
                parcel2.writeNoException();
                return true;
            case 21:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                q2.d1 d1Var6 = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                V2.a u08 = V2.b.u0(parcel.readStrongBinder());
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    c2516Dd = queryLocalInterface7 instanceof InterfaceC2533Ed ? (InterfaceC2533Ed) queryLocalInterface7 : new C2516Dd(readStrongBinder7);
                }
                InterfaceC2533Ed interfaceC2533Ed2 = c2516Dd;
                InterfaceC3693od G37 = AbstractBinderC3639nd.G3(parcel.readStrongBinder());
                q2.g1 g1Var3 = (q2.g1) AbstractC3241g8.b(parcel, q2.g1.CREATOR);
                AbstractC3241g8.f(parcel);
                x3(readString12, readString13, d1Var6, u08, interfaceC2533Ed2, G37, g1Var3);
                parcel2.writeNoException();
                return true;
            case 22:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                q2.d1 d1Var7 = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                V2.a u09 = V2.b.u0(parcel.readStrongBinder());
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    c2584Hd = queryLocalInterface8 instanceof InterfaceC2601Id ? (InterfaceC2601Id) queryLocalInterface8 : new C2584Hd(readStrongBinder8);
                }
                InterfaceC2601Id interfaceC2601Id2 = c2584Hd;
                InterfaceC3693od G38 = AbstractBinderC3639nd.G3(parcel.readStrongBinder());
                C3261gb c3261gb = (C3261gb) AbstractC3241g8.b(parcel, C3261gb.CREATOR);
                AbstractC3241g8.f(parcel);
                w3(readString14, readString15, d1Var7, u09, interfaceC2601Id2, G38, c3261gb);
                parcel2.writeNoException();
                return true;
            case 23:
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                q2.d1 d1Var8 = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                V2.a u010 = V2.b.u0(parcel.readStrongBinder());
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                    if (!(queryLocalInterface9 instanceof InterfaceC2499Cd)) {
                        c2482Bd = new C2482Bd(readStrongBinder9, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback", 2);
                        InterfaceC3693od G39 = AbstractBinderC3639nd.G3(parcel.readStrongBinder());
                        AbstractC3241g8.f(parcel);
                        j1(readString16, readString17, d1Var8, u010, c2482Bd, G39);
                        parcel2.writeNoException();
                        return true;
                    }
                    interfaceC2499Cd = (InterfaceC2499Cd) queryLocalInterface9;
                }
                c2482Bd = interfaceC2499Cd;
                InterfaceC3693od G392 = AbstractBinderC3639nd.G3(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                j1(readString16, readString17, d1Var8, u010, c2482Bd, G392);
                parcel2.writeNoException();
                return true;
            case 24:
                V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            default:
                return false;
        }
    }

    public final void G3(q2.d1 d1Var) {
        Bundle bundle = d1Var.f40013F;
        if (bundle == null || bundle.getBundle(this.f27179n.getClass().getName()) == null) {
            new Bundle();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2669Md
    public final boolean R1(V2.b bVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2669Md
    public final void U0(String str, String str2, q2.d1 d1Var, V2.b bVar, BinderC2767Rq binderC2767Rq, InterfaceC3693od interfaceC3693od) {
        w3(str, str2, d1Var, bVar, binderC2767Rq, interfaceC3693od, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2669Md
    public final boolean V2(V2.a aVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2669Md
    public final C2754Rd e() {
        k2.t sDKVersionInfo = this.f27179n.getSDKVersionInfo();
        return new C2754Rd(sDKVersionInfo.f38733a, sDKVersionInfo.f38734b, sDKVersionInfo.f38735c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2669Md
    public final void e2(String str, String str2, q2.d1 d1Var, V2.a aVar, InterfaceC2635Kd interfaceC2635Kd, InterfaceC3693od interfaceC3693od) {
        try {
            Vx vx = new Vx(this, interfaceC2635Kd);
            RtbAdapter rtbAdapter = this.f27179n;
            H3(str2);
            G3(d1Var);
            I3(d1Var);
            J3(str2, d1Var);
            rtbAdapter.loadRtbRewardedInterstitialAd(new w2.n(), vx);
        } catch (Throwable th) {
            u2.i.d("Adapter failed to render rewarded interstitial ad.", th);
            PA.l(aVar, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2669Md
    public final C2754Rd f() {
        k2.t versionInfo = this.f27179n.getVersionInfo();
        return new C2754Rd(versionInfo.f38733a, versionInfo.f38734b, versionInfo.f38735c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2669Md
    public final q2.A0 g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2669Md
    public final void i1(String str, String str2, q2.d1 d1Var, V2.a aVar, InterfaceC2635Kd interfaceC2635Kd, InterfaceC3693od interfaceC3693od) {
        try {
            Vx vx = new Vx(this, interfaceC2635Kd);
            RtbAdapter rtbAdapter = this.f27179n;
            H3(str2);
            G3(d1Var);
            I3(d1Var);
            J3(str2, d1Var);
            rtbAdapter.loadRtbRewardedAd(new w2.n(), vx);
        } catch (Throwable th) {
            u2.i.d("Adapter failed to render rewarded ad.", th);
            PA.l(aVar, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2669Md
    public final void j1(String str, String str2, q2.d1 d1Var, V2.a aVar, InterfaceC2499Cd interfaceC2499Cd, InterfaceC3693od interfaceC3693od) {
        try {
            Rx rx = new Rx(this, interfaceC2499Cd);
            RtbAdapter rtbAdapter = this.f27179n;
            H3(str2);
            G3(d1Var);
            I3(d1Var);
            J3(str2, d1Var);
            rtbAdapter.loadRtbAppOpenAd(new C5158f(), rx);
        } catch (Throwable th) {
            u2.i.d("Adapter failed to render app open ad.", th);
            PA.l(aVar, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2669Md
    public final void l3(String str, String str2, q2.d1 d1Var, V2.a aVar, InterfaceC2533Ed interfaceC2533Ed, InterfaceC3693od interfaceC3693od, q2.g1 g1Var) {
        try {
            Rx rx = new Rx(this, interfaceC2533Ed);
            RtbAdapter rtbAdapter = this.f27179n;
            H3(str2);
            G3(d1Var);
            I3(d1Var);
            J3(str2, d1Var);
            new C4637h(g1Var.f40060x, g1Var.f40057u, g1Var.f40056n);
            rtbAdapter.loadRtbBannerAd(new C5159g(), rx);
        } catch (Throwable th) {
            u2.i.d("Adapter failed to render banner ad.", th);
            PA.l(aVar, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2669Md
    public final void w3(String str, String str2, q2.d1 d1Var, V2.a aVar, InterfaceC2601Id interfaceC2601Id, InterfaceC3693od interfaceC3693od, C3261gb c3261gb) {
        RtbAdapter rtbAdapter = this.f27179n;
        try {
            C3562m7 c3562m7 = new C3562m7(this, interfaceC2601Id);
            H3(str2);
            G3(d1Var);
            I3(d1Var);
            J3(str2, d1Var);
            rtbAdapter.loadRtbNativeAdMapper(new w2.l(), c3562m7);
        } catch (Throwable th) {
            u2.i.d("Adapter failed to render native ad.", th);
            PA.l(aVar, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                C3761pr c3761pr = new C3761pr(this, interfaceC2601Id);
                H3(str2);
                G3(d1Var);
                I3(d1Var);
                J3(str2, d1Var);
                rtbAdapter.loadRtbNativeAd(new w2.l(), c3761pr);
            } catch (Throwable th2) {
                u2.i.d("Adapter failed to render native ad.", th2);
                PA.l(aVar, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2669Md
    public final void x2(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2669Md
    public final void x3(String str, String str2, q2.d1 d1Var, V2.a aVar, InterfaceC2533Ed interfaceC2533Ed, InterfaceC3693od interfaceC3693od, q2.g1 g1Var) {
        try {
            RtbAdapter rtbAdapter = this.f27179n;
            H3(str2);
            G3(d1Var);
            I3(d1Var);
            J3(str2, d1Var);
            new C4637h(g1Var.f40060x, g1Var.f40057u, g1Var.f40056n);
            try {
                interfaceC2533Ed.a(new C4927z0(7, rtbAdapter.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null, null));
            } catch (RemoteException e6) {
                u2.i.d("", e6);
            }
        } catch (Throwable th) {
            u2.i.d("Adapter failed to render interscroller ad.", th);
            PA.l(aVar, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC2669Md
    public final void y3(V2.a aVar, String str, Bundle bundle, Bundle bundle2, q2.g1 g1Var, InterfaceC2703Od interfaceC2703Od) {
        char c4;
        try {
            C2837Wb c2837Wb = new C2837Wb(12);
            RtbAdapter rtbAdapter = this.f27179n;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals(com.anythink.expressad.foundation.g.a.f.f19281e)) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1052618729:
                    if (str.equals(com.anythink.expressad.foundation.g.a.f.f19277a)) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 604727084:
                    if (str.equals(com.anythink.expressad.foundation.g.a.f.f19280d)) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1167692200:
                    if (str.equals("app_open")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    new ArrayList().add(new C5161i());
                    new C4637h(g1Var.f40060x, g1Var.f40057u, g1Var.f40056n);
                    rtbAdapter.collectSignals(new C5249a(), c2837Wb);
                    return;
                case 6:
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.nd)).booleanValue()) {
                        new ArrayList().add(new C5161i());
                        new C4637h(g1Var.f40060x, g1Var.f40057u, g1Var.f40056n);
                        rtbAdapter.collectSignals(new C5249a(), c2837Wb);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
        } catch (Throwable th) {
            u2.i.d("Error generating signals for RTB", th);
            PA.l(aVar, th, "adapter.collectSignals");
            throw new RemoteException();
        }
    }
}
