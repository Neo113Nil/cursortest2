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
import k2.C4630a;
import k2.C4637h;
import k2.EnumC4631b;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4907p;
import t0.AbstractC5051n;
import w2.AbstractC5153a;
import w2.C5158f;
import w2.C5159g;
import w2.C5161i;
import w2.InterfaceC5157e;

/* renamed from: com.google.android.gms.internal.ads.xd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4178xd extends AbstractBinderC3186f8 implements InterfaceC3531ld {

    /* renamed from: n, reason: collision with root package name */
    public final Object f35188n;

    /* renamed from: u, reason: collision with root package name */
    public C4017ue f35189u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC2891Ze f35190v;

    /* renamed from: w, reason: collision with root package name */
    public V2.a f35191w;

    public BinderC4178xd() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public static final boolean I3(q2.d1 d1Var) {
        if (d1Var.f40034y) {
            return true;
        }
        u2.d dVar = C4907p.f40108g.f40109a;
        return u2.d.r();
    }

    public static final String J3(String str, q2.d1 d1Var) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return d1Var.f40020N;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void E2(V2.a aVar, q2.d1 d1Var, String str, String str2, InterfaceC3693od interfaceC3693od, C3261gb c3261gb, ArrayList arrayList) {
        Object obj = this.f35188n;
        boolean z8 = obj instanceof MediationNativeAdapter;
        if (!z8 && !(obj instanceof AbstractC5153a)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC5153a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            AbstractC5051n.j(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            u2.i.f(sb.toString());
            throw new RemoteException();
        }
        u2.i.a("Requesting native ad from adapter.");
        if (z8) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                List list = d1Var.f40033x;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j9 = d1Var.f40030u;
                if (j9 != -1) {
                    new Date(j9);
                }
                boolean I32 = I3(d1Var);
                int i = d1Var.f40035z;
                boolean z9 = d1Var.f40017K;
                J3(str, d1Var);
                C4286zd c4286zd = new C4286zd(hashSet, I32, i, c3261gb, arrayList, z9);
                Bundle bundle = d1Var.f40013F;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f35189u = new C4017ue(7, interfaceC3693od);
                mediationNativeAdapter.requestNativeAd((Context) V2.b.A0(aVar), this.f35189u, G3(str, d1Var, str2), c4286zd, bundle2);
                return;
            } catch (Throwable th) {
                u2.i.d("", th);
                PA.l(aVar, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        if (obj instanceof AbstractC5153a) {
            try {
                C4124wd c4124wd = new C4124wd(this, interfaceC3693od, 3);
                G3(str, d1Var, str2);
                H3(d1Var);
                I3(d1Var);
                J3(str, d1Var);
                ((AbstractC5153a) obj).loadNativeAdMapper(new w2.l(), c4124wd);
            } catch (Throwable th2) {
                u2.i.d("", th2);
                PA.l(aVar, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    C4124wd c4124wd2 = new C4124wd(this, interfaceC3693od, 2);
                    G3(str, d1Var, str2);
                    H3(d1Var);
                    I3(d1Var);
                    J3(str, d1Var);
                    ((AbstractC5153a) obj).loadNativeAd(new w2.l(), c4124wd2);
                } catch (Throwable th3) {
                    u2.i.d("", th3);
                    PA.l(aVar, th3, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC2891Ze interfaceC2891Ze;
        Rx rx;
        InterfaceC3693od interfaceC3693od = null;
        InterfaceC3693od interfaceC3693od2 = null;
        InterfaceC3693od interfaceC3693od3 = null;
        InterfaceC3693od interfaceC3693od4 = null;
        InterfaceC4123wc interfaceC4123wc = null;
        InterfaceC3693od interfaceC3693od5 = null;
        r6 = null;
        InterfaceC4284zb interfaceC4284zb = null;
        InterfaceC3693od c3585md = null;
        InterfaceC2891Ze interfaceC2891Ze2 = null;
        InterfaceC3693od c3585md2 = null;
        InterfaceC3693od interfaceC3693od6 = null;
        InterfaceC3693od c3585md3 = null;
        switch (i) {
            case 1:
                V2.a u02 = V2.b.u0(parcel.readStrongBinder());
                q2.g1 g1Var = (q2.g1) AbstractC3241g8.b(parcel, q2.g1.CREATOR);
                q2.d1 d1Var = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC3693od = queryLocalInterface instanceof InterfaceC3693od ? (InterfaceC3693od) queryLocalInterface : new C3585md(readStrongBinder);
                }
                AbstractC3241g8.f(parcel);
                K0(u02, g1Var, d1Var, readString, null, interfaceC3693od);
                parcel2.writeNoException();
                return true;
            case 2:
                V2.a f6 = f();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, f6);
                return true;
            case 3:
                V2.a u03 = V2.b.u0(parcel.readStrongBinder());
                q2.d1 d1Var2 = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3585md3 = queryLocalInterface2 instanceof InterfaceC3693od ? (InterfaceC3693od) queryLocalInterface2 : new C3585md(readStrongBinder2);
                }
                InterfaceC3693od interfaceC3693od7 = c3585md3;
                AbstractC3241g8.f(parcel);
                j2(u03, d1Var2, readString2, null, interfaceC3693od7);
                parcel2.writeNoException();
                return true;
            case 4:
                g();
                parcel2.writeNoException();
                return true;
            case 5:
                l();
                parcel2.writeNoException();
                return true;
            case 6:
                V2.a u04 = V2.b.u0(parcel.readStrongBinder());
                q2.g1 g1Var2 = (q2.g1) AbstractC3241g8.b(parcel, q2.g1.CREATOR);
                q2.d1 d1Var3 = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC3693od6 = queryLocalInterface3 instanceof InterfaceC3693od ? (InterfaceC3693od) queryLocalInterface3 : new C3585md(readStrongBinder3);
                }
                AbstractC3241g8.f(parcel);
                K0(u04, g1Var2, d1Var3, readString3, readString4, interfaceC3693od6);
                parcel2.writeNoException();
                return true;
            case 7:
                V2.a u05 = V2.b.u0(parcel.readStrongBinder());
                q2.d1 d1Var4 = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3585md2 = queryLocalInterface4 instanceof InterfaceC3693od ? (InterfaceC3693od) queryLocalInterface4 : new C3585md(readStrongBinder4);
                }
                InterfaceC3693od interfaceC3693od8 = c3585md2;
                AbstractC3241g8.f(parcel);
                j2(u05, d1Var4, readString5, readString6, interfaceC3693od8);
                parcel2.writeNoException();
                return true;
            case 8:
                k();
                parcel2.writeNoException();
                return true;
            case 9:
                m();
                parcel2.writeNoException();
                return true;
            case 10:
                V2.a u06 = V2.b.u0(parcel.readStrongBinder());
                q2.d1 d1Var5 = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    interfaceC2891Ze2 = queryLocalInterface5 instanceof InterfaceC2891Ze ? (InterfaceC2891Ze) queryLocalInterface5 : new C2857Xe(readStrongBinder5, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 2);
                }
                String readString7 = parcel.readString();
                AbstractC3241g8.f(parcel);
                Z1(u06, d1Var5, interfaceC2891Ze2, readString7);
                parcel2.writeNoException();
                return true;
            case 11:
                q2.d1 d1Var6 = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                String readString8 = parcel.readString();
                AbstractC3241g8.f(parcel);
                K3(readString8, d1Var6);
                parcel2.writeNoException();
                return true;
            case 12:
                I();
                throw null;
            case 13:
                boolean n9 = n();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3241g8.f30958a;
                parcel2.writeInt(n9 ? 1 : 0);
                return true;
            case 14:
                V2.a u07 = V2.b.u0(parcel.readStrongBinder());
                q2.d1 d1Var7 = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3585md = queryLocalInterface6 instanceof InterfaceC3693od ? (InterfaceC3693od) queryLocalInterface6 : new C3585md(readStrongBinder6);
                }
                InterfaceC3693od interfaceC3693od9 = c3585md;
                C3261gb c3261gb = (C3261gb) AbstractC3241g8.b(parcel, C3261gb.CREATOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                AbstractC3241g8.f(parcel);
                E2(u07, d1Var7, readString9, readString10, interfaceC3693od9, c3261gb, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3241g8.f30958a;
                parcel2.writeStrongBinder(null);
                return true;
            case 16:
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC3241g8.f30958a;
                parcel2.writeStrongBinder(null);
                return true;
            case 17:
                Bundle bundle = new Bundle();
                parcel2.writeNoException();
                AbstractC3241g8.d(parcel2, bundle);
                return true;
            case 18:
                Bundle bundle2 = new Bundle();
                parcel2.writeNoException();
                AbstractC3241g8.d(parcel2, bundle2);
                return true;
            case 19:
                Bundle bundle3 = new Bundle();
                parcel2.writeNoException();
                AbstractC3241g8.d(parcel2, bundle3);
                return true;
            case 20:
                q2.d1 d1Var8 = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                String readString11 = parcel.readString();
                parcel.readString();
                AbstractC3241g8.f(parcel);
                K3(readString11, d1Var8);
                parcel2.writeNoException();
                return true;
            case 21:
                V2.a u08 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                a0(u08);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader4 = AbstractC3241g8.f30958a;
                parcel2.writeInt(0);
                return true;
            case 23:
                V2.a u09 = V2.b.u0(parcel.readStrongBinder());
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    interfaceC2891Ze = queryLocalInterface7 instanceof InterfaceC2891Ze ? (InterfaceC2891Ze) queryLocalInterface7 : new C2857Xe(readStrongBinder7, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 2);
                } else {
                    interfaceC2891Ze = null;
                }
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                AbstractC3241g8.f(parcel);
                N1(u09, interfaceC2891Ze, createStringArrayList2);
                throw null;
            case 24:
                C4017ue c4017ue = this.f35189u;
                if (c4017ue != null && (rx = (Rx) c4017ue.f34632w) != null) {
                    interfaceC4284zb = (InterfaceC4284zb) rx.f27448u;
                }
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, interfaceC4284zb);
                return true;
            case 25:
                boolean a9 = AbstractC3241g8.a(parcel);
                AbstractC3241g8.f(parcel);
                S1(a9);
                parcel2.writeNoException();
                return true;
            case 26:
                q2.A0 H6 = H();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, H6);
                return true;
            case 27:
                InterfaceC3962td J = J();
                parcel2.writeNoException();
                AbstractC3241g8.e(parcel2, J);
                return true;
            case 28:
                V2.a u010 = V2.b.u0(parcel.readStrongBinder());
                q2.d1 d1Var9 = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                String readString12 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC3693od5 = queryLocalInterface8 instanceof InterfaceC3693od ? (InterfaceC3693od) queryLocalInterface8 : new C3585md(readStrongBinder8);
                }
                AbstractC3241g8.f(parcel);
                M0(u010, d1Var9, readString12, interfaceC3693od5);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                V2.a u011 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                r1(u011);
                throw null;
            case 31:
                V2.a u012 = V2.b.u0(parcel.readStrongBinder());
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    interfaceC4123wc = queryLocalInterface9 instanceof InterfaceC4123wc ? (InterfaceC4123wc) queryLocalInterface9 : new C4069vc(readStrongBinder9, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback", 2);
                }
                ArrayList createTypedArrayList = parcel.createTypedArrayList(C4285zc.CREATOR);
                AbstractC3241g8.f(parcel);
                X1(u012, interfaceC4123wc, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                V2.a u013 = V2.b.u0(parcel.readStrongBinder());
                q2.d1 d1Var10 = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                String readString13 = parcel.readString();
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC3693od4 = queryLocalInterface10 instanceof InterfaceC3693od ? (InterfaceC3693od) queryLocalInterface10 : new C3585md(readStrongBinder10);
                }
                AbstractC3241g8.f(parcel);
                N2(u013, d1Var10, readString13, interfaceC3693od4);
                parcel2.writeNoException();
                return true;
            case 33:
                C2754Rd K8 = K();
                parcel2.writeNoException();
                AbstractC3241g8.d(parcel2, K8);
                return true;
            case 34:
                C2754Rd n02 = n0();
                parcel2.writeNoException();
                AbstractC3241g8.d(parcel2, n02);
                return true;
            case 35:
                V2.a u014 = V2.b.u0(parcel.readStrongBinder());
                q2.g1 g1Var3 = (q2.g1) AbstractC3241g8.b(parcel, q2.g1.CREATOR);
                q2.d1 d1Var11 = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC3693od3 = queryLocalInterface11 instanceof InterfaceC3693od ? (InterfaceC3693od) queryLocalInterface11 : new C3585md(readStrongBinder11);
                }
                AbstractC3241g8.f(parcel);
                g3(u014, g1Var3, d1Var11, readString14, readString15, interfaceC3693od3);
                parcel2.writeNoException();
                return true;
            case 36:
                parcel2.writeNoException();
                ClassLoader classLoader5 = AbstractC3241g8.f30958a;
                parcel2.writeStrongBinder(null);
                return true;
            case 37:
                V2.a u015 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                T1(u015);
                parcel2.writeNoException();
                return true;
            case com.anythink.basead.b.b.j.f5963M /* 38 */:
                V2.a u016 = V2.b.u0(parcel.readStrongBinder());
                q2.d1 d1Var12 = (q2.d1) AbstractC3241g8.b(parcel, q2.d1.CREATOR);
                String readString16 = parcel.readString();
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC3693od2 = queryLocalInterface12 instanceof InterfaceC3693od ? (InterfaceC3693od) queryLocalInterface12 : new C3585md(readStrongBinder12);
                }
                AbstractC3241g8.f(parcel);
                y0(u016, d1Var12, readString16, interfaceC3693od2);
                parcel2.writeNoException();
                return true;
            case 39:
                V2.a u017 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                a1(u017);
                throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final boolean G() {
        return false;
    }

    public final Bundle G3(String str, q2.d1 d1Var, String str2) {
        u2.i.a("Server parameters: ".concat(String.valueOf(str)));
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
            if (this.f35188n instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (d1Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", d1Var.f40035z);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            u2.i.d("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final q2.A0 H() {
        Object obj = this.f35188n;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                return ((AbstractAdViewAdapter) obj).getVideoController();
            } catch (Throwable th) {
                u2.i.d("", th);
            }
        }
        return null;
    }

    public final void H3(q2.d1 d1Var) {
        Bundle bundle = d1Var.f40013F;
        if (bundle == null || bundle.getBundle(this.f35188n.getClass().getName()) == null) {
            new Bundle();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void I() {
        Object obj = this.f35188n;
        if (obj instanceof AbstractC5153a) {
            u2.i.c("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = AbstractC5153a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        u2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final InterfaceC3962td J() {
        com.google.ads.mediation.a aVar;
        Object obj = this.f35188n;
        if (!(obj instanceof MediationNativeAdapter)) {
            boolean z8 = obj instanceof AbstractC5153a;
            return null;
        }
        C4017ue c4017ue = this.f35189u;
        if (c4017ue == null || (aVar = (com.google.ads.mediation.a) c4017ue.f34631v) == null) {
            return null;
        }
        return new BinderC2465Ad(aVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void J2(String str, q2.d1 d1Var) {
        K3(str, d1Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final C2754Rd K() {
        Object obj = this.f35188n;
        if (!(obj instanceof AbstractC5153a)) {
            return null;
        }
        k2.t versionInfo = ((AbstractC5153a) obj).getVersionInfo();
        return new C2754Rd(versionInfo.f38733a, versionInfo.f38734b, versionInfo.f38735c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void K0(V2.a aVar, q2.g1 g1Var, q2.d1 d1Var, String str, String str2, InterfaceC3693od interfaceC3693od) {
        C4637h c4637h;
        Object obj = this.f35188n;
        boolean z8 = obj instanceof MediationBannerAdapter;
        if (!z8 && !(obj instanceof AbstractC5153a)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC5153a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            AbstractC5051n.j(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            u2.i.f(sb.toString());
            throw new RemoteException();
        }
        u2.i.a("Requesting banner ad from adapter.");
        boolean z9 = g1Var.f40053G;
        int i = g1Var.f40057u;
        int i4 = g1Var.f40060x;
        if (z9) {
            C4637h c4637h2 = new C4637h(i4, i);
            c4637h2.f38715e = true;
            c4637h2.f38716f = i;
            c4637h = c4637h2;
        } else {
            c4637h = new C4637h(i4, i, g1Var.f40056n);
        }
        if (!z8) {
            if (obj instanceof AbstractC5153a) {
                try {
                    C4124wd c4124wd = new C4124wd(this, interfaceC3693od, 0);
                    G3(str, d1Var, str2);
                    H3(d1Var);
                    I3(d1Var);
                    J3(str, d1Var);
                    ((AbstractC5153a) obj).loadBannerAd(new C5159g(), c4124wd);
                    return;
                } catch (Throwable th) {
                    u2.i.d("", th);
                    PA.l(aVar, th, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj;
            List list = d1Var.f40033x;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j9 = d1Var.f40030u;
            if (j9 != -1) {
                new Date(j9);
            }
            boolean I32 = I3(d1Var);
            int i9 = d1Var.f40035z;
            boolean z10 = d1Var.f40017K;
            J3(str, d1Var);
            C4070vd c4070vd = new C4070vd(hashSet, I32, i9, z10);
            Bundle bundle = d1Var.f40013F;
            mediationBannerAdapter.requestBannerAd((Context) V2.b.A0(aVar), new C4017ue(7, interfaceC3693od), G3(str, d1Var, str2), c4637h, c4070vd, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            u2.i.d("", th2);
            PA.l(aVar, th2, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    public final void K3(String str, q2.d1 d1Var) {
        Object obj = this.f35188n;
        if (obj instanceof AbstractC5153a) {
            M0(this.f35191w, d1Var, str, new BinderC4232yd((AbstractC5153a) obj, this.f35190v));
            return;
        }
        String canonicalName = AbstractC5153a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        u2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void M0(V2.a aVar, q2.d1 d1Var, String str, InterfaceC3693od interfaceC3693od) {
        Object obj = this.f35188n;
        if (!(obj instanceof AbstractC5153a)) {
            String canonicalName = AbstractC5153a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            u2.i.f(sb.toString());
            throw new RemoteException();
        }
        u2.i.a("Requesting rewarded ad from adapter.");
        try {
            C4124wd c4124wd = new C4124wd(this, interfaceC3693od, 4);
            G3(str, d1Var, null);
            H3(d1Var);
            I3(d1Var);
            J3(str, d1Var);
            ((AbstractC5153a) obj).loadRewardedAd(new w2.n(), c4124wd);
        } catch (Exception e6) {
            u2.i.d("", e6);
            PA.l(aVar, e6, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void N1(V2.a aVar, InterfaceC2891Ze interfaceC2891Ze, List list) {
        u2.i.f("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void N2(V2.a aVar, q2.d1 d1Var, String str, InterfaceC3693od interfaceC3693od) {
        Object obj = this.f35188n;
        if (!(obj instanceof AbstractC5153a)) {
            String canonicalName = AbstractC5153a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            u2.i.f(sb.toString());
            throw new RemoteException();
        }
        u2.i.a("Requesting rewarded interstitial ad from adapter.");
        try {
            C4124wd c4124wd = new C4124wd(this, interfaceC3693od, 4);
            G3(str, d1Var, null);
            H3(d1Var);
            I3(d1Var);
            J3(str, d1Var);
            ((AbstractC5153a) obj).loadRewardedInterstitialAd(new w2.n(), c4124wd);
        } catch (Exception e6) {
            PA.l(aVar, e6, "adapter.loadRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final C3801qd P() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void S1(boolean z8) {
        Object obj = this.f35188n;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                ((AbstractAdViewAdapter) obj).onImmersiveModeUpdated(z8);
                return;
            } catch (Throwable th) {
                u2.i.d("", th);
                return;
            }
        }
        String canonicalName = AbstractAdViewAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        u2.i.a(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void T1(V2.a aVar) {
        Object obj = this.f35188n;
        if ((obj instanceof AbstractC5153a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                g();
                return;
            } else {
                u2.i.a("Show interstitial ad from adapter.");
                u2.i.c("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = AbstractC5153a.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        AbstractC5051n.j(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb.append(canonicalName3);
        u2.i.f(sb.toString());
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void X1(V2.a aVar, InterfaceC4123wc interfaceC4123wc, ArrayList arrayList) {
        char c4;
        Object obj = this.f35188n;
        if (!(obj instanceof AbstractC5153a)) {
            throw new RemoteException();
        }
        try {
            C2837Wb c2837Wb = new C2837Wb(11);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = ((C4285zc) it.next()).f35554n;
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
                EnumC4631b enumC4631b = EnumC4631b.APP_OPEN_AD;
                switch (c4) {
                    case 0:
                        enumC4631b = EnumC4631b.BANNER;
                        break;
                    case 1:
                        enumC4631b = EnumC4631b.INTERSTITIAL;
                        break;
                    case 2:
                        enumC4631b = EnumC4631b.REWARDED;
                        break;
                    case 3:
                        enumC4631b = EnumC4631b.REWARDED_INTERSTITIAL;
                        break;
                    case 4:
                        enumC4631b = EnumC4631b.NATIVE;
                        break;
                    case 5:
                        break;
                    case 6:
                        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.nd)).booleanValue()) {
                            break;
                        }
                    default:
                        enumC4631b = null;
                        break;
                }
                if (enumC4631b != null) {
                    arrayList2.add(new C5161i());
                }
            }
            ((AbstractC5153a) obj).initialize((Context) V2.b.A0(aVar), c2837Wb, arrayList2);
        } catch (Throwable th) {
            PA.l(aVar, th, "adapter.initialize");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void Z1(V2.a aVar, q2.d1 d1Var, InterfaceC2891Ze interfaceC2891Ze, String str) {
        Object obj = this.f35188n;
        if ((obj instanceof AbstractC5153a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.f35191w = aVar;
            this.f35190v = interfaceC2891Ze;
            interfaceC2891Ze.h2(new V2.b(obj));
            return;
        }
        String canonicalName = AbstractC5153a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        u2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void a0(V2.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void a1(V2.a aVar) {
        Object obj = this.f35188n;
        if (obj instanceof AbstractC5153a) {
            u2.i.a("Show app open ad from adapter.");
            u2.i.c("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        String canonicalName = AbstractC5153a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        u2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final V2.a f() {
        Object obj = this.f35188n;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return new V2.b(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                u2.i.d("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof AbstractC5153a) {
            return new V2.b(null);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = AbstractC5153a.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        AbstractC5051n.j(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb.append(canonicalName3);
        u2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void g() {
        Object obj = this.f35188n;
        if (obj instanceof MediationInterstitialAdapter) {
            u2.i.a("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th) {
                u2.i.d("", th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        u2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final C3747pd g0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void g3(V2.a aVar, q2.g1 g1Var, q2.d1 d1Var, String str, String str2, InterfaceC3693od interfaceC3693od) {
        Object obj = this.f35188n;
        if (!(obj instanceof AbstractC5153a)) {
            String canonicalName = AbstractC5153a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            u2.i.f(sb.toString());
            throw new RemoteException();
        }
        u2.i.a("Requesting interscroller ad from adapter.");
        try {
            AbstractC5153a abstractC5153a = (AbstractC5153a) obj;
            C2881Yl c2881Yl = new C2881Yl(this, interfaceC3693od, abstractC5153a);
            G3(str, d1Var, str2);
            H3(d1Var);
            I3(d1Var);
            J3(str, d1Var);
            int i = g1Var.f40060x;
            int i4 = g1Var.f40057u;
            C4637h c4637h = new C4637h(i, i4);
            c4637h.f38717g = true;
            c4637h.f38718h = i4;
            c2881Yl.f(new C4630a(7, abstractC5153a.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null));
        } catch (Exception e6) {
            u2.i.d("", e6);
            PA.l(aVar, e6, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final C3854rd j0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void j2(V2.a aVar, q2.d1 d1Var, String str, String str2, InterfaceC3693od interfaceC3693od) {
        Object obj = this.f35188n;
        boolean z8 = obj instanceof MediationInterstitialAdapter;
        if (!z8 && !(obj instanceof AbstractC5153a)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC5153a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            AbstractC5051n.j(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            u2.i.f(sb.toString());
            throw new RemoteException();
        }
        u2.i.a("Requesting interstitial ad from adapter.");
        if (!z8) {
            if (obj instanceof AbstractC5153a) {
                try {
                    C4124wd c4124wd = new C4124wd(this, interfaceC3693od, 1);
                    G3(str, d1Var, str2);
                    H3(d1Var);
                    I3(d1Var);
                    J3(str, d1Var);
                    ((AbstractC5153a) obj).loadInterstitialAd(new w2.j(), c4124wd);
                    return;
                } catch (Throwable th) {
                    u2.i.d("", th);
                    PA.l(aVar, th, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
            List list = d1Var.f40033x;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j9 = d1Var.f40030u;
            if (j9 != -1) {
                new Date(j9);
            }
            boolean I32 = I3(d1Var);
            int i = d1Var.f40035z;
            boolean z9 = d1Var.f40017K;
            J3(str, d1Var);
            C4070vd c4070vd = new C4070vd(hashSet, I32, i, z9);
            Bundle bundle = d1Var.f40013F;
            mediationInterstitialAdapter.requestInterstitialAd((Context) V2.b.A0(aVar), new C4017ue(7, interfaceC3693od), G3(str, d1Var, str2), c4070vd, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            u2.i.d("", th2);
            PA.l(aVar, th2, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void k() {
        Object obj = this.f35188n;
        if (obj instanceof InterfaceC5157e) {
            try {
                ((InterfaceC5157e) obj).onPause();
            } catch (Throwable th) {
                u2.i.d("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void l() {
        Object obj = this.f35188n;
        if (obj instanceof InterfaceC5157e) {
            try {
                ((InterfaceC5157e) obj).onDestroy();
            } catch (Throwable th) {
                u2.i.d("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void m() {
        Object obj = this.f35188n;
        if (obj instanceof InterfaceC5157e) {
            try {
                ((InterfaceC5157e) obj).onResume();
            } catch (Throwable th) {
                u2.i.d("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final boolean n() {
        Object obj = this.f35188n;
        if ((obj instanceof AbstractC5153a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.f35190v != null;
        }
        String canonicalName = AbstractC5153a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        u2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final C2754Rd n0() {
        Object obj = this.f35188n;
        if (!(obj instanceof AbstractC5153a)) {
            return null;
        }
        k2.t sDKVersionInfo = ((AbstractC5153a) obj).getSDKVersionInfo();
        return new C2754Rd(sDKVersionInfo.f38733a, sDKVersionInfo.f38734b, sDKVersionInfo.f38735c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void r1(V2.a aVar) {
        Object obj = this.f35188n;
        if (obj instanceof AbstractC5153a) {
            u2.i.a("Show rewarded ad from adapter.");
            u2.i.c("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = AbstractC5153a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        u2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3531ld
    public final void y0(V2.a aVar, q2.d1 d1Var, String str, InterfaceC3693od interfaceC3693od) {
        Object obj = this.f35188n;
        if (!(obj instanceof AbstractC5153a)) {
            String canonicalName = AbstractC5153a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            u2.i.f(sb.toString());
            throw new RemoteException();
        }
        u2.i.a("Requesting app open ad from adapter.");
        try {
            C4124wd c4124wd = new C4124wd(this, interfaceC3693od, 5);
            G3(str, d1Var, null);
            H3(d1Var);
            I3(d1Var);
            J3(str, d1Var);
            ((AbstractC5153a) obj).loadAppOpenAd(new C5158f(), c4124wd);
        } catch (Exception e6) {
            u2.i.d("", e6);
            PA.l(aVar, e6, "adapter.loadAppOpenAd");
            throw new RemoteException();
        }
    }

    public BinderC4178xd(AbstractC5153a abstractC5153a) {
        this();
        this.f35188n = abstractC5153a;
    }

    public BinderC4178xd(InterfaceC5157e interfaceC5157e) {
        this();
        this.f35188n = interfaceC5157e;
    }
}
