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
import s2.C4949p;
import s2.C4969z0;
import z2.C5229f;
import z2.C5230g;

/* renamed from: com.google.android.gms.internal.ads.Td, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2809Td extends AbstractBinderC3359i8 implements InterfaceC2741Pd {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f28531u = 0;

    /* renamed from: n, reason: collision with root package name */
    public final RtbAdapter f28532n;

    public BinderC2809Td(RtbAdapter rtbAdapter) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        this.f28532n = rtbAdapter;
    }

    public static final void V3(String str) {
        x2.i.f("Server parameters: ".concat(String.valueOf(str)));
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
            x2.i.d("", e9);
            throw new RemoteException();
        }
    }

    public static final void W3(s2.c1 c1Var) {
        if (c1Var.f40422y) {
            return;
        }
        x2.d dVar = C4949p.f40498g.f40499a;
        x2.d.s();
    }

    public static final void X3(String str, s2.c1 c1Var) {
        String str2 = c1Var.f40408N;
        try {
            new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2741Pd
    public final void K3(String str, String str2, s2.c1 c1Var, Y2.a aVar, InterfaceC2571Fd interfaceC2571Fd, InterfaceC3864rd interfaceC3864rd) {
        try {
            Qx qx = new Qx(this, interfaceC2571Fd);
            RtbAdapter rtbAdapter = this.f28532n;
            V3(str2);
            U3(c1Var);
            W3(c1Var);
            X3(str2, c1Var);
            rtbAdapter.loadRtbAppOpenAd(new C5229f(), qx);
        } catch (Throwable th) {
            x2.i.d("Adapter failed to render app open ad.", th);
            AbstractC2792Sd.h(aVar, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2741Pd
    public final boolean L2(Y2.b bVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2741Pd
    public final void O2(String str, String str2, s2.c1 c1Var, Y2.a aVar, InterfaceC2639Jd interfaceC2639Jd, InterfaceC3864rd interfaceC3864rd) {
        try {
            Ux ux = new Ux(this, interfaceC2639Jd);
            RtbAdapter rtbAdapter = this.f28532n;
            V3(str2);
            U3(c1Var);
            W3(c1Var);
            X3(str2, c1Var);
            rtbAdapter.loadRtbInterstitialAd(new z2.i(), ux);
        } catch (Throwable th) {
            x2.i.d("Adapter failed to render interstitial ad.", th);
            AbstractC2792Sd.h(aVar, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2741Pd
    public final boolean Q0(Y2.a aVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2741Pd
    public final void T0(String str, String str2, s2.c1 c1Var, Y2.a aVar, InterfaceC2673Ld interfaceC2673Ld, InterfaceC3864rd interfaceC3864rd, C3485kb c3485kb) {
        RtbAdapter rtbAdapter = this.f28532n;
        try {
            C3680o7 c3680o7 = new C3680o7(this, interfaceC2673Ld);
            V3(str2);
            U3(c1Var);
            W3(c1Var);
            X3(str2, c1Var);
            rtbAdapter.loadRtbNativeAdMapper(new z2.k(), c3680o7);
        } catch (Throwable th) {
            x2.i.d("Adapter failed to render native ad.", th);
            AbstractC2792Sd.h(aVar, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                C3717or c3717or = new C3717or(this, interfaceC2673Ld);
                V3(str2);
                U3(c1Var);
                W3(c1Var);
                X3(str2, c1Var);
                rtbAdapter.loadRtbNativeAd(new z2.k(), c3717or);
            } catch (Throwable th2) {
                x2.i.d("Adapter failed to render native ad.", th2);
                AbstractC2792Sd.h(aVar, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC2775Rd c2758Qd;
        InterfaceC2639Jd c2622Id;
        InterfaceC2571Fd c2554Ed;
        InterfaceC2775Rd interfaceC2775Rd = null;
        InterfaceC2571Fd interfaceC2571Fd = null;
        InterfaceC2673Ld c2656Kd = null;
        InterfaceC2605Hd c2588Gd = null;
        InterfaceC2707Nd c2690Md = null;
        InterfaceC2673Ld c2656Kd2 = null;
        InterfaceC2707Nd c2690Md2 = null;
        InterfaceC2639Jd interfaceC2639Jd = null;
        InterfaceC2605Hd c2588Gd2 = null;
        if (i == 1) {
            Y2.a t02 = Y2.b.t0(parcel.readStrongBinder());
            String readString = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) AbstractC3411j8.b(parcel, creator);
            Bundle bundle2 = (Bundle) AbstractC3411j8.b(parcel, creator);
            s2.f1 f1Var = (s2.f1) AbstractC3411j8.b(parcel, s2.f1.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (!(queryLocalInterface instanceof InterfaceC2775Rd)) {
                    c2758Qd = new C2758Qd(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback", 1);
                    AbstractC3411j8.f(parcel);
                    k1(t02, readString, bundle, bundle2, f1Var, c2758Qd);
                    parcel2.writeNoException();
                    return true;
                }
                interfaceC2775Rd = (InterfaceC2775Rd) queryLocalInterface;
            }
            c2758Qd = interfaceC2775Rd;
            AbstractC3411j8.f(parcel);
            k1(t02, readString, bundle, bundle2, f1Var, c2758Qd);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            C2826Ud e9 = e();
            parcel2.writeNoException();
            AbstractC3411j8.d(parcel2, e9);
            return true;
        }
        if (i == 3) {
            C2826Ud h3 = h();
            parcel2.writeNoException();
            AbstractC3411j8.d(parcel2, h3);
            return true;
        }
        if (i == 5) {
            s2.A0 g9 = g();
            parcel2.writeNoException();
            AbstractC3411j8.e(parcel2, g9);
            return true;
        }
        if (i == 10) {
            Y2.b.t0(parcel.readStrongBinder());
            AbstractC3411j8.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        if (i == 11) {
            parcel.createStringArray();
            AbstractC3411j8.f(parcel);
            parcel2.writeNoException();
            return true;
        }
        switch (i) {
            case 13:
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                s2.c1 c1Var = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                Y2.a t03 = Y2.b.t0(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    c2588Gd2 = queryLocalInterface2 instanceof InterfaceC2605Hd ? (InterfaceC2605Hd) queryLocalInterface2 : new C2588Gd(readStrongBinder2);
                }
                InterfaceC2605Hd interfaceC2605Hd = c2588Gd2;
                InterfaceC3864rd U32 = AbstractBinderC3811qd.U3(parcel.readStrongBinder());
                s2.f1 f1Var2 = (s2.f1) AbstractC3411j8.b(parcel, s2.f1.CREATOR);
                AbstractC3411j8.f(parcel);
                b1(readString2, readString3, c1Var, t03, interfaceC2605Hd, U32, f1Var2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                s2.c1 c1Var2 = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                Y2.a t04 = Y2.b.t0(parcel.readStrongBinder());
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    if (!(queryLocalInterface3 instanceof InterfaceC2639Jd)) {
                        c2622Id = new C2622Id(readStrongBinder3, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback", 1);
                        InterfaceC3864rd U33 = AbstractBinderC3811qd.U3(parcel.readStrongBinder());
                        AbstractC3411j8.f(parcel);
                        O2(readString4, readString5, c1Var2, t04, c2622Id, U33);
                        parcel2.writeNoException();
                        return true;
                    }
                    interfaceC2639Jd = (InterfaceC2639Jd) queryLocalInterface3;
                }
                c2622Id = interfaceC2639Jd;
                InterfaceC3864rd U332 = AbstractBinderC3811qd.U3(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                O2(readString4, readString5, c1Var2, t04, c2622Id, U332);
                parcel2.writeNoException();
                return true;
            case 15:
                Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 16:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                s2.c1 c1Var3 = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                Y2.a t05 = Y2.b.t0(parcel.readStrongBinder());
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    c2690Md2 = queryLocalInterface4 instanceof InterfaceC2707Nd ? (InterfaceC2707Nd) queryLocalInterface4 : new C2690Md(readStrongBinder4);
                }
                InterfaceC2707Nd interfaceC2707Nd = c2690Md2;
                InterfaceC3864rd U34 = AbstractBinderC3811qd.U3(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                z2(readString6, readString7, c1Var3, t05, interfaceC2707Nd, U34);
                parcel2.writeNoException();
                return true;
            case 17:
                Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 18:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                s2.c1 c1Var4 = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                Y2.a t06 = Y2.b.t0(parcel.readStrongBinder());
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    c2656Kd2 = queryLocalInterface5 instanceof InterfaceC2673Ld ? (InterfaceC2673Ld) queryLocalInterface5 : new C2656Kd(readStrongBinder5);
                }
                InterfaceC2673Ld interfaceC2673Ld = c2656Kd2;
                InterfaceC3864rd U35 = AbstractBinderC3811qd.U3(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                T0(readString8, readString9, c1Var4, t06, interfaceC2673Ld, U35, null);
                parcel2.writeNoException();
                return true;
            case 19:
                parcel.readString();
                AbstractC3411j8.f(parcel);
                parcel2.writeNoException();
                return true;
            case 20:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                s2.c1 c1Var5 = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                Y2.a t07 = Y2.b.t0(parcel.readStrongBinder());
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    c2690Md = queryLocalInterface6 instanceof InterfaceC2707Nd ? (InterfaceC2707Nd) queryLocalInterface6 : new C2690Md(readStrongBinder6);
                }
                InterfaceC2707Nd interfaceC2707Nd2 = c2690Md;
                InterfaceC3864rd U36 = AbstractBinderC3811qd.U3(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                e1(readString10, readString11, c1Var5, t07, interfaceC2707Nd2, U36);
                parcel2.writeNoException();
                return true;
            case 21:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                s2.c1 c1Var6 = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                Y2.a t08 = Y2.b.t0(parcel.readStrongBinder());
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    c2588Gd = queryLocalInterface7 instanceof InterfaceC2605Hd ? (InterfaceC2605Hd) queryLocalInterface7 : new C2588Gd(readStrongBinder7);
                }
                InterfaceC2605Hd interfaceC2605Hd2 = c2588Gd;
                InterfaceC3864rd U37 = AbstractBinderC3811qd.U3(parcel.readStrongBinder());
                s2.f1 f1Var3 = (s2.f1) AbstractC3411j8.b(parcel, s2.f1.CREATOR);
                AbstractC3411j8.f(parcel);
                q0(readString12, readString13, c1Var6, t08, interfaceC2605Hd2, U37, f1Var3);
                parcel2.writeNoException();
                return true;
            case 22:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                s2.c1 c1Var7 = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                Y2.a t09 = Y2.b.t0(parcel.readStrongBinder());
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    c2656Kd = queryLocalInterface8 instanceof InterfaceC2673Ld ? (InterfaceC2673Ld) queryLocalInterface8 : new C2656Kd(readStrongBinder8);
                }
                InterfaceC2673Ld interfaceC2673Ld2 = c2656Kd;
                InterfaceC3864rd U38 = AbstractBinderC3811qd.U3(parcel.readStrongBinder());
                C3485kb c3485kb = (C3485kb) AbstractC3411j8.b(parcel, C3485kb.CREATOR);
                AbstractC3411j8.f(parcel);
                T0(readString14, readString15, c1Var7, t09, interfaceC2673Ld2, U38, c3485kb);
                parcel2.writeNoException();
                return true;
            case 23:
                String readString16 = parcel.readString();
                String readString17 = parcel.readString();
                s2.c1 c1Var8 = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                Y2.a t010 = Y2.b.t0(parcel.readStrongBinder());
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                    if (!(queryLocalInterface9 instanceof InterfaceC2571Fd)) {
                        c2554Ed = new C2554Ed(readStrongBinder9, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback", 1);
                        InterfaceC3864rd U39 = AbstractBinderC3811qd.U3(parcel.readStrongBinder());
                        AbstractC3411j8.f(parcel);
                        K3(readString16, readString17, c1Var8, t010, c2554Ed, U39);
                        parcel2.writeNoException();
                        return true;
                    }
                    interfaceC2571Fd = (InterfaceC2571Fd) queryLocalInterface9;
                }
                c2554Ed = interfaceC2571Fd;
                InterfaceC3864rd U392 = AbstractBinderC3811qd.U3(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                K3(readString16, readString17, c1Var8, t010, c2554Ed, U392);
                parcel2.writeNoException();
                return true;
            case 24:
                Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            default:
                return false;
        }
    }

    public final void U3(s2.c1 c1Var) {
        Bundle bundle = c1Var.f40401F;
        if (bundle == null || bundle.getBundle(this.f28532n.getClass().getName()) == null) {
            new Bundle();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2741Pd
    public final void b1(String str, String str2, s2.c1 c1Var, Y2.a aVar, InterfaceC2605Hd interfaceC2605Hd, InterfaceC3864rd interfaceC3864rd, s2.f1 f1Var) {
        try {
            Qx qx = new Qx(this, interfaceC2605Hd);
            RtbAdapter rtbAdapter = this.f28532n;
            V3(str2);
            U3(c1Var);
            W3(c1Var);
            X3(str2, c1Var);
            new m2.h(f1Var.f40445x, f1Var.f40442u, f1Var.f40441n);
            rtbAdapter.loadRtbBannerAd(new C5230g(), qx);
        } catch (Throwable th) {
            x2.i.d("Adapter failed to render banner ad.", th);
            AbstractC2792Sd.h(aVar, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2741Pd
    public final C2826Ud e() {
        m2.t versionInfo = this.f28532n.getVersionInfo();
        return new C2826Ud(versionInfo.f39402a, versionInfo.f39403b, versionInfo.f39404c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2741Pd
    public final void e1(String str, String str2, s2.c1 c1Var, Y2.a aVar, InterfaceC2707Nd interfaceC2707Nd, InterfaceC3864rd interfaceC3864rd) {
        try {
            Ux ux = new Ux(this, interfaceC2707Nd);
            RtbAdapter rtbAdapter = this.f28532n;
            V3(str2);
            U3(c1Var);
            W3(c1Var);
            X3(str2, c1Var);
            rtbAdapter.loadRtbRewardedInterstitialAd(new z2.m(), ux);
        } catch (Throwable th) {
            x2.i.d("Adapter failed to render rewarded interstitial ad.", th);
            AbstractC2792Sd.h(aVar, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2741Pd
    public final s2.A0 g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2741Pd
    public final C2826Ud h() {
        m2.t sDKVersionInfo = this.f28532n.getSDKVersionInfo();
        return new C2826Ud(sDKVersionInfo.f39402a, sDKVersionInfo.f39403b, sDKVersionInfo.f39404c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC2741Pd
    public final void k1(Y2.a aVar, String str, Bundle bundle, Bundle bundle2, s2.f1 f1Var, InterfaceC2775Rd interfaceC2775Rd) {
        char c9;
        try {
            C2889Yb c2889Yb = new C2889Yb(12);
            RtbAdapter rtbAdapter = this.f28532n;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals(com.anythink.expressad.foundation.g.a.f.f19910e)) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -1052618729:
                    if (str.equals(com.anythink.expressad.foundation.g.a.f.f19906a)) {
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
                    if (str.equals(com.anythink.expressad.foundation.g.a.f.f19909d)) {
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
                    new ArrayList().add(new x1.g());
                    new m2.h(f1Var.f40445x, f1Var.f40442u, f1Var.f40441n);
                    rtbAdapter.collectSignals(new B2.a(), c2889Yb);
                    return;
                case 6:
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.nd)).booleanValue()) {
                        new ArrayList().add(new x1.g());
                        new m2.h(f1Var.f40445x, f1Var.f40442u, f1Var.f40441n);
                        rtbAdapter.collectSignals(new B2.a(), c2889Yb);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
        } catch (Throwable th) {
            x2.i.d("Error generating signals for RTB", th);
            AbstractC2792Sd.h(aVar, th, "adapter.collectSignals");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2741Pd
    public final void q0(String str, String str2, s2.c1 c1Var, Y2.a aVar, InterfaceC2605Hd interfaceC2605Hd, InterfaceC3864rd interfaceC3864rd, s2.f1 f1Var) {
        try {
            RtbAdapter rtbAdapter = this.f28532n;
            V3(str2);
            U3(c1Var);
            W3(c1Var);
            X3(str2, c1Var);
            new m2.h(f1Var.f40445x, f1Var.f40442u, f1Var.f40441n);
            try {
                interfaceC2605Hd.a(new C4969z0(7, rtbAdapter.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null, null));
            } catch (RemoteException e9) {
                x2.i.d("", e9);
            }
        } catch (Throwable th) {
            x2.i.d("Adapter failed to render interscroller ad.", th);
            AbstractC2792Sd.h(aVar, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2741Pd
    public final void s2(String str, String str2, s2.c1 c1Var, Y2.b bVar, BinderC2737Oq binderC2737Oq, InterfaceC3864rd interfaceC3864rd) {
        T0(str, str2, c1Var, bVar, binderC2737Oq, interfaceC3864rd, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2741Pd
    public final boolean u3(Y2.b bVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2741Pd
    public final void x2(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2741Pd
    public final void z2(String str, String str2, s2.c1 c1Var, Y2.a aVar, InterfaceC2707Nd interfaceC2707Nd, InterfaceC3864rd interfaceC3864rd) {
        try {
            Ux ux = new Ux(this, interfaceC2707Nd);
            RtbAdapter rtbAdapter = this.f28532n;
            V3(str2);
            U3(c1Var);
            W3(c1Var);
            X3(str2, c1Var);
            rtbAdapter.loadRtbRewardedAd(new z2.m(), ux);
        } catch (Throwable th) {
            x2.i.d("Adapter failed to render rewarded ad.", th);
            AbstractC2792Sd.h(aVar, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }
}
