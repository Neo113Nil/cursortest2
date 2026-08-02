package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import m2.C4741a;
import org.json.JSONException;
import org.json.JSONObject;
import s2.C4949p;
import w.AbstractC5128c;
import z2.AbstractC5224a;
import z2.C5229f;
import z2.C5230g;
import z2.InterfaceC5228e;

/* renamed from: com.google.android.gms.internal.ads.Ad, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2486Ad extends AbstractBinderC3359i8 implements InterfaceC3703od {

    /* renamed from: n, reason: collision with root package name */
    public final Object f24464n;

    /* renamed from: u, reason: collision with root package name */
    public C4297ze f24465u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC3060cf f24466v;

    /* renamed from: w, reason: collision with root package name */
    public Y2.a f24467w;

    public BinderC2486Ad() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public static final boolean W3(s2.c1 c1Var) {
        if (c1Var.f40422y) {
            return true;
        }
        x2.d dVar = C4949p.f40498g.f40499a;
        return x2.d.s();
    }

    public static final String X3(String str, s2.c1 c1Var) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return c1Var.f40408N;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void G0(Y2.a aVar, InterfaceC3060cf interfaceC3060cf, List list) {
        x2.i.f("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final boolean H() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void I() {
        Object obj = this.f24464n;
        if (obj instanceof AbstractC5224a) {
            x2.i.c("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = AbstractC5224a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        x2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void I1(Y2.a aVar, s2.c1 c1Var, String str, String str2, InterfaceC3864rd interfaceC3864rd) {
        Object obj = this.f24464n;
        boolean z6 = obj instanceof MediationInterstitialAdapter;
        if (!z6 && !(obj instanceof AbstractC5224a)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC5224a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            AbstractC5128c.h(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            x2.i.f(sb.toString());
            throw new RemoteException();
        }
        x2.i.a("Requesting interstitial ad from adapter.");
        if (!z6) {
            if (obj instanceof AbstractC5224a) {
                try {
                    S0.s sVar = new S0.s(this, interfaceC3864rd);
                    U3(str, c1Var, str2);
                    V3(c1Var);
                    W3(c1Var);
                    X3(str, c1Var);
                    ((AbstractC5224a) obj).loadInterstitialAd(new z2.i(), sVar);
                    return;
                } catch (Throwable th) {
                    x2.i.d("", th);
                    AbstractC2792Sd.h(aVar, th, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
            List list = c1Var.f40421x;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j6 = c1Var.f40418u;
            if (j6 != -1) {
                new Date(j6);
            }
            boolean W3 = W3(c1Var);
            int i = c1Var.f40423z;
            boolean z9 = c1Var.f40405K;
            X3(str, c1Var);
            C4242yd c4242yd = new C4242yd(hashSet, W3, i, z9);
            Bundle bundle = c1Var.f40401F;
            mediationInterstitialAdapter.requestInterstitialAd((Context) Y2.b.D0(aVar), new C4297ze(7, interfaceC3864rd), U3(str, c1Var, str2), c4242yd, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            x2.i.d("", th2);
            AbstractC2792Sd.h(aVar, th2, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final InterfaceC4134wd J() {
        com.google.ads.mediation.a aVar;
        Object obj = this.f24464n;
        if (!(obj instanceof MediationNativeAdapter)) {
            boolean z6 = obj instanceof AbstractC5224a;
            return null;
        }
        C4297ze c4297ze = this.f24465u;
        if (c4297ze == null || (aVar = (com.google.ads.mediation.a) c4297ze.f36134v) == null) {
            return null;
        }
        return new BinderC2537Dd(aVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void J3(Y2.a aVar) {
        Object obj = this.f24464n;
        if ((obj instanceof AbstractC5224a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                g();
                return;
            } else {
                x2.i.a("Show interstitial ad from adapter.");
                x2.i.c("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = AbstractC5224a.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        AbstractC5128c.h(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb.append(canonicalName3);
        x2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void P0(Y2.a aVar, s2.c1 c1Var, String str, String str2, InterfaceC3864rd interfaceC3864rd, C3485kb c3485kb, ArrayList arrayList) {
        Object obj = this.f24464n;
        boolean z6 = obj instanceof MediationNativeAdapter;
        if (!z6 && !(obj instanceof AbstractC5224a)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC5224a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            AbstractC5128c.h(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            x2.i.f(sb.toString());
            throw new RemoteException();
        }
        x2.i.a("Requesting native ad from adapter.");
        if (z6) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                List list = c1Var.f40421x;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j6 = c1Var.f40418u;
                if (j6 != -1) {
                    new Date(j6);
                }
                boolean W3 = W3(c1Var);
                int i = c1Var.f40423z;
                boolean z9 = c1Var.f40405K;
                X3(str, c1Var);
                C2520Cd c2520Cd = new C2520Cd(hashSet, W3, i, c3485kb, arrayList, z9);
                Bundle bundle = c1Var.f40401F;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f24465u = new C4297ze(7, interfaceC3864rd);
                mediationNativeAdapter.requestNativeAd((Context) Y2.b.D0(aVar), this.f24465u, U3(str, c1Var, str2), c2520Cd, bundle2);
                return;
            } catch (Throwable th) {
                x2.i.d("", th);
                AbstractC2792Sd.h(aVar, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        if (obj instanceof AbstractC5224a) {
            try {
                S0.c cVar = new S0.c(this, interfaceC3864rd);
                U3(str, c1Var, str2);
                V3(c1Var);
                W3(c1Var);
                X3(str, c1Var);
                ((AbstractC5224a) obj).loadNativeAdMapper(new z2.k(), cVar);
            } catch (Throwable th2) {
                x2.i.d("", th2);
                AbstractC2792Sd.h(aVar, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    C3067cm c3067cm = new C3067cm(this, interfaceC3864rd);
                    U3(str, c1Var, str2);
                    V3(c1Var);
                    W3(c1Var);
                    X3(str, c1Var);
                    ((AbstractC5224a) obj).loadNativeAd(new z2.k(), c3067cm);
                } catch (Throwable th3) {
                    x2.i.d("", th3);
                    AbstractC2792Sd.h(aVar, th3, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void P1(boolean z6) {
        Object obj = this.f24464n;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                ((AbstractAdViewAdapter) obj).onImmersiveModeUpdated(z6);
                return;
            } catch (Throwable th) {
                x2.i.d("", th);
                return;
            }
        }
        String canonicalName = AbstractAdViewAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        x2.i.a(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final C3972td R() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void R2(Y2.a aVar) {
        Object obj = this.f24464n;
        if (obj instanceof AbstractC5224a) {
            x2.i.a("Show app open ad from adapter.");
            x2.i.c("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        String canonicalName = AbstractC5224a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        x2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void S2() {
        Object obj = this.f24464n;
        if (obj instanceof InterfaceC5228e) {
            try {
                ((InterfaceC5228e) obj).onResume();
            } catch (Throwable th) {
                x2.i.d("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC3864rd c3757pd;
        InterfaceC3864rd c3757pd2;
        InterfaceC3864rd c3757pd3;
        InterfaceC3864rd c3757pd4;
        InterfaceC3060cf c2953af;
        InterfaceC3864rd c3757pd5;
        InterfaceC3060cf interfaceC3060cf;
        Qx qx;
        InterfaceC3864rd c3757pd6;
        InterfaceC2502Bc c2485Ac;
        InterfaceC3864rd c3757pd7;
        InterfaceC3864rd c3757pd8;
        InterfaceC3864rd interfaceC3864rd = null;
        switch (i) {
            case 1:
                Y2.a t02 = Y2.b.t0(parcel.readStrongBinder());
                s2.f1 f1Var = (s2.f1) AbstractC3411j8.b(parcel, s2.f1.CREATOR);
                s2.c1 c1Var = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    c3757pd = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3757pd = queryLocalInterface instanceof InterfaceC3864rd ? (InterfaceC3864rd) queryLocalInterface : new C3757pd(readStrongBinder);
                }
                AbstractC3411j8.f(parcel);
                e2(t02, f1Var, c1Var, readString, null, c3757pd);
                parcel2.writeNoException();
                return true;
            case 2:
                Y2.a e9 = e();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, e9);
                return true;
            case 3:
                Y2.a t03 = Y2.b.t0(parcel.readStrongBinder());
                s2.c1 c1Var2 = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    c3757pd2 = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3757pd2 = queryLocalInterface2 instanceof InterfaceC3864rd ? (InterfaceC3864rd) queryLocalInterface2 : new C3757pd(readStrongBinder2);
                }
                AbstractC3411j8.f(parcel);
                I1(t03, c1Var2, readString2, null, c3757pd2);
                parcel2.writeNoException();
                return true;
            case 4:
                g();
                parcel2.writeNoException();
                return true;
            case 5:
                n();
                parcel2.writeNoException();
                return true;
            case 6:
                Y2.a t04 = Y2.b.t0(parcel.readStrongBinder());
                s2.f1 f1Var2 = (s2.f1) AbstractC3411j8.b(parcel, s2.f1.CREATOR);
                s2.c1 c1Var3 = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    c3757pd3 = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3757pd3 = queryLocalInterface3 instanceof InterfaceC3864rd ? (InterfaceC3864rd) queryLocalInterface3 : new C3757pd(readStrongBinder3);
                }
                AbstractC3411j8.f(parcel);
                e2(t04, f1Var2, c1Var3, readString3, readString4, c3757pd3);
                parcel2.writeNoException();
                return true;
            case 7:
                Y2.a t05 = Y2.b.t0(parcel.readStrongBinder());
                s2.c1 c1Var4 = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    c3757pd4 = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3757pd4 = queryLocalInterface4 instanceof InterfaceC3864rd ? (InterfaceC3864rd) queryLocalInterface4 : new C3757pd(readStrongBinder4);
                }
                AbstractC3411j8.f(parcel);
                I1(t05, c1Var4, readString5, readString6, c3757pd4);
                parcel2.writeNoException();
                return true;
            case 8:
                l();
                parcel2.writeNoException();
                return true;
            case 9:
                S2();
                parcel2.writeNoException();
                return true;
            case 10:
                Y2.a t06 = Y2.b.t0(parcel.readStrongBinder());
                s2.c1 c1Var5 = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 == null) {
                    c2953af = null;
                } else {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    c2953af = queryLocalInterface5 instanceof InterfaceC3060cf ? (InterfaceC3060cf) queryLocalInterface5 : new C2953af(readStrongBinder5, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 1);
                }
                String readString7 = parcel.readString();
                AbstractC3411j8.f(parcel);
                x3(t06, c1Var5, c2953af, readString7);
                parcel2.writeNoException();
                return true;
            case 11:
                s2.c1 c1Var6 = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                String readString8 = parcel.readString();
                AbstractC3411j8.f(parcel);
                Y3(readString8, c1Var6);
                parcel2.writeNoException();
                return true;
            case 12:
                I();
                throw null;
            case 13:
                boolean m9 = m();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3411j8.f31986a;
                parcel2.writeInt(m9 ? 1 : 0);
                return true;
            case 14:
                Y2.a t07 = Y2.b.t0(parcel.readStrongBinder());
                s2.c1 c1Var7 = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 == null) {
                    c3757pd5 = null;
                } else {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3757pd5 = queryLocalInterface6 instanceof InterfaceC3864rd ? (InterfaceC3864rd) queryLocalInterface6 : new C3757pd(readStrongBinder6);
                }
                C3485kb c3485kb = (C3485kb) AbstractC3411j8.b(parcel, C3485kb.CREATOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                AbstractC3411j8.f(parcel);
                P0(t07, c1Var7, readString9, readString10, c3757pd5, c3485kb, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3411j8.f31986a;
                parcel2.writeStrongBinder(null);
                return true;
            case 16:
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC3411j8.f31986a;
                parcel2.writeStrongBinder(null);
                return true;
            case 17:
                Bundle bundle = new Bundle();
                parcel2.writeNoException();
                AbstractC3411j8.d(parcel2, bundle);
                return true;
            case 18:
                Bundle bundle2 = new Bundle();
                parcel2.writeNoException();
                AbstractC3411j8.d(parcel2, bundle2);
                return true;
            case 19:
                Bundle bundle3 = new Bundle();
                parcel2.writeNoException();
                AbstractC3411j8.d(parcel2, bundle3);
                return true;
            case 20:
                s2.c1 c1Var8 = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                String readString11 = parcel.readString();
                parcel.readString();
                AbstractC3411j8.f(parcel);
                Y3(readString11, c1Var8);
                parcel2.writeNoException();
                return true;
            case 21:
                Y2.a t08 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                Y(t08);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader4 = AbstractC3411j8.f31986a;
                parcel2.writeInt(0);
                return true;
            case 23:
                Y2.a t09 = Y2.b.t0(parcel.readStrongBinder());
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    interfaceC3060cf = queryLocalInterface7 instanceof InterfaceC3060cf ? (InterfaceC3060cf) queryLocalInterface7 : new C2953af(readStrongBinder7, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 1);
                } else {
                    interfaceC3060cf = null;
                }
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                AbstractC3411j8.f(parcel);
                G0(t09, interfaceC3060cf, createStringArrayList2);
                throw null;
            case 24:
                C4297ze c4297ze = this.f24465u;
                InterfaceC2535Db interfaceC2535Db = (c4297ze == null || (qx = (Qx) c4297ze.f36135w) == null) ? null : (InterfaceC2535Db) qx.f27895u;
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, interfaceC2535Db);
                return true;
            case 25:
                boolean a9 = AbstractC3411j8.a(parcel);
                AbstractC3411j8.f(parcel);
                P1(a9);
                parcel2.writeNoException();
                return true;
            case 26:
                s2.A0 c02 = c0();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, c02);
                return true;
            case 27:
                InterfaceC4134wd J = J();
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, J);
                return true;
            case 28:
                Y2.a t010 = Y2.b.t0(parcel.readStrongBinder());
                s2.c1 c1Var9 = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                String readString12 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 == null) {
                    c3757pd6 = null;
                } else {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3757pd6 = queryLocalInterface8 instanceof InterfaceC3864rd ? (InterfaceC3864rd) queryLocalInterface8 : new C3757pd(readStrongBinder8);
                }
                AbstractC3411j8.f(parcel);
                j2(t010, c1Var9, readString12, c3757pd6);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                Y2.a t011 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                v2(t011);
                throw null;
            case 31:
                Y2.a t012 = Y2.b.t0(parcel.readStrongBinder());
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 == null) {
                    c2485Ac = null;
                } else {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    c2485Ac = queryLocalInterface9 instanceof InterfaceC2502Bc ? (InterfaceC2502Bc) queryLocalInterface9 : new C2485Ac(readStrongBinder9, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback", 1);
                }
                ArrayList createTypedArrayList = parcel.createTypedArrayList(C2553Ec.CREATOR);
                AbstractC3411j8.f(parcel);
                l1(t012, c2485Ac, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                Y2.a t013 = Y2.b.t0(parcel.readStrongBinder());
                s2.c1 c1Var10 = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                String readString13 = parcel.readString();
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 == null) {
                    c3757pd7 = null;
                } else {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3757pd7 = queryLocalInterface10 instanceof InterfaceC3864rd ? (InterfaceC3864rd) queryLocalInterface10 : new C3757pd(readStrongBinder10);
                }
                AbstractC3411j8.f(parcel);
                w3(t013, c1Var10, readString13, c3757pd7);
                parcel2.writeNoException();
                return true;
            case 33:
                C2826Ud i02 = i0();
                parcel2.writeNoException();
                AbstractC3411j8.d(parcel2, i02);
                return true;
            case 34:
                C2826Ud k02 = k0();
                parcel2.writeNoException();
                AbstractC3411j8.d(parcel2, k02);
                return true;
            case 35:
                Y2.a t014 = Y2.b.t0(parcel.readStrongBinder());
                s2.f1 f1Var3 = (s2.f1) AbstractC3411j8.b(parcel, s2.f1.CREATOR);
                s2.c1 c1Var11 = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 == null) {
                    c3757pd8 = null;
                } else {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3757pd8 = queryLocalInterface11 instanceof InterfaceC3864rd ? (InterfaceC3864rd) queryLocalInterface11 : new C3757pd(readStrongBinder11);
                }
                AbstractC3411j8.f(parcel);
                b3(t014, f1Var3, c1Var11, readString14, readString15, c3757pd8);
                parcel2.writeNoException();
                return true;
            case 36:
                parcel2.writeNoException();
                ClassLoader classLoader5 = AbstractC3411j8.f31986a;
                parcel2.writeStrongBinder(null);
                return true;
            case 37:
                Y2.a t015 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                J3(t015);
                parcel2.writeNoException();
                return true;
            case com.anythink.basead.b.b.j.f6592M /* 38 */:
                Y2.a t016 = Y2.b.t0(parcel.readStrongBinder());
                s2.c1 c1Var12 = (s2.c1) AbstractC3411j8.b(parcel, s2.c1.CREATOR);
                String readString16 = parcel.readString();
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC3864rd = queryLocalInterface12 instanceof InterfaceC3864rd ? (InterfaceC3864rd) queryLocalInterface12 : new C3757pd(readStrongBinder12);
                }
                AbstractC3411j8.f(parcel);
                X2(t016, c1Var12, readString16, interfaceC3864rd);
                parcel2.writeNoException();
                return true;
            case 39:
                Y2.a t017 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                R2(t017);
                throw null;
        }
    }

    public final Bundle U3(String str, s2.c1 c1Var, String str2) {
        x2.i.a("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f24464n instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (c1Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", c1Var.f40423z);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            x2.i.d("", th);
            throw new RemoteException();
        }
    }

    public final void V3(s2.c1 c1Var) {
        Bundle bundle = c1Var.f40401F;
        if (bundle == null || bundle.getBundle(this.f24464n.getClass().getName()) == null) {
            new Bundle();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void X2(Y2.a aVar, s2.c1 c1Var, String str, InterfaceC3864rd interfaceC3864rd) {
        Object obj = this.f24464n;
        if (!(obj instanceof AbstractC5224a)) {
            String canonicalName = AbstractC5224a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            x2.i.f(sb.toString());
            throw new RemoteException();
        }
        x2.i.a("Requesting app open ad from adapter.");
        try {
            C4296zd c4296zd = new C4296zd(this, interfaceC3864rd, 1);
            U3(str, c1Var, null);
            V3(c1Var);
            W3(c1Var);
            X3(str, c1Var);
            ((AbstractC5224a) obj).loadAppOpenAd(new C5229f(), c4296zd);
        } catch (Exception e9) {
            x2.i.d("", e9);
            AbstractC2792Sd.h(aVar, e9, "adapter.loadAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void Y(Y2.a aVar) {
    }

    public final void Y3(String str, s2.c1 c1Var) {
        Object obj = this.f24464n;
        if (obj instanceof AbstractC5224a) {
            j2(this.f24467w, c1Var, str, new BinderC2503Bd((AbstractC5224a) obj, this.f24466v));
            return;
        }
        String canonicalName = AbstractC5224a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        x2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void b3(Y2.a aVar, s2.f1 f1Var, s2.c1 c1Var, String str, String str2, InterfaceC3864rd interfaceC3864rd) {
        Object obj = this.f24464n;
        if (!(obj instanceof AbstractC5224a)) {
            String canonicalName = AbstractC5224a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            x2.i.f(sb.toString());
            throw new RemoteException();
        }
        x2.i.a("Requesting interscroller ad from adapter.");
        try {
            AbstractC5224a abstractC5224a = (AbstractC5224a) obj;
            S0.e eVar = new S0.e(this, interfaceC3864rd, abstractC5224a);
            U3(str, c1Var, str2);
            V3(c1Var);
            W3(c1Var);
            X3(str, c1Var);
            int i = f1Var.f40445x;
            int i4 = f1Var.f40442u;
            m2.h hVar = new m2.h(i, i4);
            hVar.f39386g = true;
            hVar.f39387h = i4;
            eVar.h(new C4741a(7, abstractC5224a.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null));
        } catch (Exception e9) {
            x2.i.d("", e9);
            AbstractC2792Sd.h(aVar, e9, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final s2.A0 c0() {
        Object obj = this.f24464n;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                return ((AbstractAdViewAdapter) obj).getVideoController();
            } catch (Throwable th) {
                x2.i.d("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final C3918sd d0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final Y2.a e() {
        Object obj = this.f24464n;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return new Y2.b(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                x2.i.d("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof AbstractC5224a) {
            return new Y2.b(null);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = AbstractC5224a.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        AbstractC5128c.h(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb.append(canonicalName3);
        x2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void e2(Y2.a aVar, s2.f1 f1Var, s2.c1 c1Var, String str, String str2, InterfaceC3864rd interfaceC3864rd) {
        m2.h hVar;
        Object obj = this.f24464n;
        boolean z6 = obj instanceof MediationBannerAdapter;
        if (!z6 && !(obj instanceof AbstractC5224a)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC5224a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            AbstractC5128c.h(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            x2.i.f(sb.toString());
            throw new RemoteException();
        }
        x2.i.a("Requesting banner ad from adapter.");
        boolean z9 = f1Var.f40438G;
        int i = f1Var.f40442u;
        int i4 = f1Var.f40445x;
        if (z9) {
            m2.h hVar2 = new m2.h(i4, i);
            hVar2.f39384e = true;
            hVar2.f39385f = i;
            hVar = hVar2;
        } else {
            hVar = new m2.h(i4, i, f1Var.f40441n);
        }
        if (!z6) {
            if (obj instanceof AbstractC5224a) {
                try {
                    C4296zd c4296zd = new C4296zd(this, interfaceC3864rd, 0);
                    U3(str, c1Var, str2);
                    V3(c1Var);
                    W3(c1Var);
                    X3(str, c1Var);
                    ((AbstractC5224a) obj).loadBannerAd(new C5230g(), c4296zd);
                    return;
                } catch (Throwable th) {
                    x2.i.d("", th);
                    AbstractC2792Sd.h(aVar, th, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj;
            List list = c1Var.f40421x;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j6 = c1Var.f40418u;
            if (j6 != -1) {
                new Date(j6);
            }
            boolean W3 = W3(c1Var);
            int i6 = c1Var.f40423z;
            boolean z10 = c1Var.f40405K;
            X3(str, c1Var);
            C4242yd c4242yd = new C4242yd(hashSet, W3, i6, z10);
            Bundle bundle = c1Var.f40401F;
            mediationBannerAdapter.requestBannerAd((Context) Y2.b.D0(aVar), new C4297ze(7, interfaceC3864rd), U3(str, c1Var, str2), hVar, c4242yd, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            x2.i.d("", th2);
            AbstractC2792Sd.h(aVar, th2, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void g() {
        Object obj = this.f24464n;
        if (obj instanceof MediationInterstitialAdapter) {
            x2.i.a("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th) {
                x2.i.d("", th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        x2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final C4026ud h0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final C2826Ud i0() {
        Object obj = this.f24464n;
        if (!(obj instanceof AbstractC5224a)) {
            return null;
        }
        m2.t versionInfo = ((AbstractC5224a) obj).getVersionInfo();
        return new C2826Ud(versionInfo.f39402a, versionInfo.f39403b, versionInfo.f39404c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void j2(Y2.a aVar, s2.c1 c1Var, String str, InterfaceC3864rd interfaceC3864rd) {
        Object obj = this.f24464n;
        if (!(obj instanceof AbstractC5224a)) {
            String canonicalName = AbstractC5224a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            x2.i.f(sb.toString());
            throw new RemoteException();
        }
        x2.i.a("Requesting rewarded ad from adapter.");
        try {
            S0.e eVar = new S0.e(this, interfaceC3864rd);
            U3(str, c1Var, null);
            V3(c1Var);
            W3(c1Var);
            X3(str, c1Var);
            ((AbstractC5224a) obj).loadRewardedAd(new z2.m(), eVar);
        } catch (Exception e9) {
            x2.i.d("", e9);
            AbstractC2792Sd.h(aVar, e9, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final C2826Ud k0() {
        Object obj = this.f24464n;
        if (!(obj instanceof AbstractC5224a)) {
            return null;
        }
        m2.t sDKVersionInfo = ((AbstractC5224a) obj).getSDKVersionInfo();
        return new C2826Ud(sDKVersionInfo.f39402a, sDKVersionInfo.f39403b, sDKVersionInfo.f39404c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void l() {
        Object obj = this.f24464n;
        if (obj instanceof InterfaceC5228e) {
            try {
                ((InterfaceC5228e) obj).onPause();
            } catch (Throwable th) {
                x2.i.d("", th);
                throw new RemoteException();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void l1(Y2.a aVar, InterfaceC2502Bc interfaceC2502Bc, ArrayList arrayList) {
        char c9;
        Object obj = this.f24464n;
        if (!(obj instanceof AbstractC5224a)) {
            throw new RemoteException();
        }
        try {
            C2889Yb c2889Yb = new C2889Yb(11);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = ((C2553Ec) it.next()).f25384n;
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
                m2.b bVar = m2.b.APP_OPEN_AD;
                switch (c9) {
                    case 0:
                        bVar = m2.b.BANNER;
                        break;
                    case 1:
                        bVar = m2.b.INTERSTITIAL;
                        break;
                    case 2:
                        bVar = m2.b.REWARDED;
                        break;
                    case 3:
                        bVar = m2.b.REWARDED_INTERSTITIAL;
                        break;
                    case 4:
                        bVar = m2.b.NATIVE;
                        break;
                    case 5:
                        break;
                    case 6:
                        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.nd)).booleanValue()) {
                            break;
                        }
                    default:
                        bVar = null;
                        break;
                }
                if (bVar != null) {
                    arrayList2.add(new x1.g());
                }
            }
            ((AbstractC5224a) obj).initialize((Context) Y2.b.D0(aVar), c2889Yb, arrayList2);
        } catch (Throwable th) {
            AbstractC2792Sd.h(aVar, th, "adapter.initialize");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final boolean m() {
        Object obj = this.f24464n;
        if ((obj instanceof AbstractC5224a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.f24466v != null;
        }
        String canonicalName = AbstractC5224a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        x2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void m3(String str, s2.c1 c1Var) {
        Y3(str, c1Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void n() {
        Object obj = this.f24464n;
        if (obj instanceof InterfaceC5228e) {
            try {
                ((InterfaceC5228e) obj).onDestroy();
            } catch (Throwable th) {
                x2.i.d("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void v2(Y2.a aVar) {
        Object obj = this.f24464n;
        if (obj instanceof AbstractC5224a) {
            x2.i.a("Show rewarded ad from adapter.");
            x2.i.c("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = AbstractC5224a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        x2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void w3(Y2.a aVar, s2.c1 c1Var, String str, InterfaceC3864rd interfaceC3864rd) {
        Object obj = this.f24464n;
        if (!(obj instanceof AbstractC5224a)) {
            String canonicalName = AbstractC5224a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            x2.i.f(sb.toString());
            throw new RemoteException();
        }
        x2.i.a("Requesting rewarded interstitial ad from adapter.");
        try {
            S0.e eVar = new S0.e(this, interfaceC3864rd);
            U3(str, c1Var, null);
            V3(c1Var);
            W3(c1Var);
            X3(str, c1Var);
            ((AbstractC5224a) obj).loadRewardedInterstitialAd(new z2.m(), eVar);
        } catch (Exception e9) {
            AbstractC2792Sd.h(aVar, e9, "adapter.loadRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3703od
    public final void x3(Y2.a aVar, s2.c1 c1Var, InterfaceC3060cf interfaceC3060cf, String str) {
        Object obj = this.f24464n;
        if ((obj instanceof AbstractC5224a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.f24467w = aVar;
            this.f24466v = interfaceC3060cf;
            interfaceC3060cf.s3(new Y2.b(obj));
            return;
        }
        String canonicalName = AbstractC5224a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        x2.i.f(sb.toString());
        throw new RemoteException();
    }

    public BinderC2486Ad(AbstractC5224a abstractC5224a) {
        this();
        this.f24464n = abstractC5224a;
    }

    public BinderC2486Ad(InterfaceC5228e interfaceC5228e) {
        this();
        this.f24464n = interfaceC5228e;
    }
}
