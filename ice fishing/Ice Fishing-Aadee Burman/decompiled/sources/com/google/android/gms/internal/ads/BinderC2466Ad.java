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
import k2.C4631a;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4900p;
import x2.AbstractC5187a;
import x2.C5192f;
import x2.C5193g;
import x2.C5195i;
import x2.InterfaceC5191e;

/* renamed from: com.google.android.gms.internal.ads.Ad, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2466Ad extends AbstractBinderC3336i8 implements InterfaceC3680od {

    /* renamed from: n, reason: collision with root package name */
    public final Object f23682n;

    /* renamed from: u, reason: collision with root package name */
    public C4274ze f23683u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC3037cf f23684v;

    /* renamed from: w, reason: collision with root package name */
    public W2.a f23685w;

    public BinderC2466Ad() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public static final boolean W3(q2.c1 c1Var) {
        if (c1Var.f40120y) {
            return true;
        }
        v2.d dVar = C4900p.f40196g.f40197a;
        return v2.d.s();
    }

    public static final String X3(String str, q2.c1 c1Var) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return c1Var.f40106N;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void D2(W2.a aVar) {
        Object obj = this.f23682n;
        if (obj instanceof AbstractC5187a) {
            v2.i.a("Show rewarded ad from adapter.");
            v2.i.c("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = AbstractC5187a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        v2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final boolean I() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void I3(W2.a aVar) {
        Object obj = this.f23682n;
        if ((obj instanceof AbstractC5187a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                g();
                return;
            } else {
                v2.i.a("Show interstitial ad from adapter.");
                v2.i.c("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = AbstractC5187a.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        u1.h.i(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb.append(canonicalName3);
        v2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void J() {
        Object obj = this.f23682n;
        if (obj instanceof AbstractC5187a) {
            v2.i.c("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = AbstractC5187a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        v2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final InterfaceC4111wd K() {
        com.google.ads.mediation.a aVar;
        Object obj = this.f23682n;
        if (!(obj instanceof MediationNativeAdapter)) {
            boolean z3 = obj instanceof AbstractC5187a;
            return null;
        }
        C4274ze c4274ze = this.f23683u;
        if (c4274ze == null || (aVar = (com.google.ads.mediation.a) c4274ze.f35361v) == null) {
            return null;
        }
        return new BinderC2517Dd(aVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void M1(W2.a aVar, InterfaceC3037cf interfaceC3037cf, List list) {
        v2.i.f("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void P2(String str, q2.c1 c1Var) {
        Y3(str, c1Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void Q1(boolean z3) {
        Object obj = this.f23682n;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                ((AbstractAdViewAdapter) obj).onImmersiveModeUpdated(z3);
                return;
            } catch (Throwable th) {
                v2.i.d("", th);
                return;
            }
        }
        String canonicalName = AbstractAdViewAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        v2.i.a(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final C3949td R() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC3037cf interfaceC3037cf;
        Qx qx;
        InterfaceC3841rd interfaceC3841rd = null;
        InterfaceC3841rd interfaceC3841rd2 = null;
        InterfaceC3841rd interfaceC3841rd3 = null;
        InterfaceC3841rd interfaceC3841rd4 = null;
        InterfaceC2482Bc interfaceC2482Bc = null;
        InterfaceC3841rd interfaceC3841rd5 = null;
        r6 = null;
        InterfaceC2515Db interfaceC2515Db = null;
        InterfaceC3841rd c3734pd = null;
        InterfaceC3037cf interfaceC3037cf2 = null;
        InterfaceC3841rd c3734pd2 = null;
        InterfaceC3841rd interfaceC3841rd6 = null;
        InterfaceC3841rd c3734pd3 = null;
        switch (i) {
            case 1:
                W2.a w02 = W2.b.w0(parcel.readStrongBinder());
                q2.f1 f1Var = (q2.f1) AbstractC3388j8.b(parcel, q2.f1.CREATOR);
                q2.c1 c1Var = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC3841rd = queryLocalInterface instanceof InterfaceC3841rd ? (InterfaceC3841rd) queryLocalInterface : new C3734pd(readStrongBinder);
                }
                AbstractC3388j8.f(parcel);
                t2(w02, f1Var, c1Var, readString, null, interfaceC3841rd);
                parcel2.writeNoException();
                return true;
            case 2:
                W2.a e9 = e();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, e9);
                return true;
            case 3:
                W2.a w03 = W2.b.w0(parcel.readStrongBinder());
                q2.c1 c1Var2 = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3734pd3 = queryLocalInterface2 instanceof InterfaceC3841rd ? (InterfaceC3841rd) queryLocalInterface2 : new C3734pd(readStrongBinder2);
                }
                InterfaceC3841rd interfaceC3841rd7 = c3734pd3;
                AbstractC3388j8.f(parcel);
                q3(w03, c1Var2, readString2, null, interfaceC3841rd7);
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
                W2.a w04 = W2.b.w0(parcel.readStrongBinder());
                q2.f1 f1Var2 = (q2.f1) AbstractC3388j8.b(parcel, q2.f1.CREATOR);
                q2.c1 c1Var3 = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC3841rd6 = queryLocalInterface3 instanceof InterfaceC3841rd ? (InterfaceC3841rd) queryLocalInterface3 : new C3734pd(readStrongBinder3);
                }
                AbstractC3388j8.f(parcel);
                t2(w04, f1Var2, c1Var3, readString3, readString4, interfaceC3841rd6);
                parcel2.writeNoException();
                return true;
            case 7:
                W2.a w05 = W2.b.w0(parcel.readStrongBinder());
                q2.c1 c1Var4 = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3734pd2 = queryLocalInterface4 instanceof InterfaceC3841rd ? (InterfaceC3841rd) queryLocalInterface4 : new C3734pd(readStrongBinder4);
                }
                InterfaceC3841rd interfaceC3841rd8 = c3734pd2;
                AbstractC3388j8.f(parcel);
                q3(w05, c1Var4, readString5, readString6, interfaceC3841rd8);
                parcel2.writeNoException();
                return true;
            case 8:
                l();
                parcel2.writeNoException();
                return true;
            case 9:
                W2();
                parcel2.writeNoException();
                return true;
            case 10:
                W2.a w06 = W2.b.w0(parcel.readStrongBinder());
                q2.c1 c1Var5 = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    interfaceC3037cf2 = queryLocalInterface5 instanceof InterfaceC3037cf ? (InterfaceC3037cf) queryLocalInterface5 : new C2930af(readStrongBinder5, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 2);
                }
                String readString7 = parcel.readString();
                AbstractC3388j8.f(parcel);
                b2(w06, c1Var5, interfaceC3037cf2, readString7);
                parcel2.writeNoException();
                return true;
            case 11:
                q2.c1 c1Var6 = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                String readString8 = parcel.readString();
                AbstractC3388j8.f(parcel);
                Y3(readString8, c1Var6);
                parcel2.writeNoException();
                return true;
            case 12:
                J();
                throw null;
            case 13:
                boolean m4 = m();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3388j8.f31199a;
                parcel2.writeInt(m4 ? 1 : 0);
                return true;
            case 14:
                W2.a w07 = W2.b.w0(parcel.readStrongBinder());
                q2.c1 c1Var7 = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3734pd = queryLocalInterface6 instanceof InterfaceC3841rd ? (InterfaceC3841rd) queryLocalInterface6 : new C3734pd(readStrongBinder6);
                }
                InterfaceC3841rd interfaceC3841rd9 = c3734pd;
                C3462kb c3462kb = (C3462kb) AbstractC3388j8.b(parcel, C3462kb.CREATOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                AbstractC3388j8.f(parcel);
                Y1(w07, c1Var7, readString9, readString10, interfaceC3841rd9, c3462kb, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3388j8.f31199a;
                parcel2.writeStrongBinder(null);
                return true;
            case 16:
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC3388j8.f31199a;
                parcel2.writeStrongBinder(null);
                return true;
            case 17:
                Bundle bundle = new Bundle();
                parcel2.writeNoException();
                AbstractC3388j8.d(parcel2, bundle);
                return true;
            case 18:
                Bundle bundle2 = new Bundle();
                parcel2.writeNoException();
                AbstractC3388j8.d(parcel2, bundle2);
                return true;
            case 19:
                Bundle bundle3 = new Bundle();
                parcel2.writeNoException();
                AbstractC3388j8.d(parcel2, bundle3);
                return true;
            case 20:
                q2.c1 c1Var8 = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                String readString11 = parcel.readString();
                parcel.readString();
                AbstractC3388j8.f(parcel);
                Y3(readString11, c1Var8);
                parcel2.writeNoException();
                return true;
            case 21:
                W2.a w08 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                h0(w08);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader4 = AbstractC3388j8.f31199a;
                parcel2.writeInt(0);
                return true;
            case 23:
                W2.a w09 = W2.b.w0(parcel.readStrongBinder());
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    interfaceC3037cf = queryLocalInterface7 instanceof InterfaceC3037cf ? (InterfaceC3037cf) queryLocalInterface7 : new C2930af(readStrongBinder7, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 2);
                } else {
                    interfaceC3037cf = null;
                }
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                AbstractC3388j8.f(parcel);
                M1(w09, interfaceC3037cf, createStringArrayList2);
                throw null;
            case 24:
                C4274ze c4274ze = this.f23683u;
                if (c4274ze != null && (qx = (Qx) c4274ze.f35362w) != null) {
                    interfaceC2515Db = (InterfaceC2515Db) qx.f27139u;
                }
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, interfaceC2515Db);
                return true;
            case 25:
                boolean a9 = AbstractC3388j8.a(parcel);
                AbstractC3388j8.f(parcel);
                Q1(a9);
                parcel2.writeNoException();
                return true;
            case 26:
                q2.A0 c02 = c0();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, c02);
                return true;
            case 27:
                InterfaceC4111wd K7 = K();
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, K7);
                return true;
            case 28:
                W2.a w010 = W2.b.w0(parcel.readStrongBinder());
                q2.c1 c1Var9 = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                String readString12 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC3841rd5 = queryLocalInterface8 instanceof InterfaceC3841rd ? (InterfaceC3841rd) queryLocalInterface8 : new C3734pd(readStrongBinder8);
                }
                AbstractC3388j8.f(parcel);
                V2(w010, c1Var9, readString12, interfaceC3841rd5);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                W2.a w011 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                D2(w011);
                throw null;
            case 31:
                W2.a w012 = W2.b.w0(parcel.readStrongBinder());
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    interfaceC2482Bc = queryLocalInterface9 instanceof InterfaceC2482Bc ? (InterfaceC2482Bc) queryLocalInterface9 : new C2465Ac(readStrongBinder9, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback", 2);
                }
                ArrayList createTypedArrayList = parcel.createTypedArrayList(C2533Ec.CREATOR);
                AbstractC3388j8.f(parcel);
                l1(w012, interfaceC2482Bc, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                W2.a w013 = W2.b.w0(parcel.readStrongBinder());
                q2.c1 c1Var10 = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                String readString13 = parcel.readString();
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC3841rd4 = queryLocalInterface10 instanceof InterfaceC3841rd ? (InterfaceC3841rd) queryLocalInterface10 : new C3734pd(readStrongBinder10);
                }
                AbstractC3388j8.f(parcel);
                s1(w013, c1Var10, readString13, interfaceC3841rd4);
                parcel2.writeNoException();
                return true;
            case 33:
                C2804Ud i02 = i0();
                parcel2.writeNoException();
                AbstractC3388j8.d(parcel2, i02);
                return true;
            case 34:
                C2804Ud k02 = k0();
                parcel2.writeNoException();
                AbstractC3388j8.d(parcel2, k02);
                return true;
            case 35:
                W2.a w014 = W2.b.w0(parcel.readStrongBinder());
                q2.f1 f1Var3 = (q2.f1) AbstractC3388j8.b(parcel, q2.f1.CREATOR);
                q2.c1 c1Var11 = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC3841rd3 = queryLocalInterface11 instanceof InterfaceC3841rd ? (InterfaceC3841rd) queryLocalInterface11 : new C3734pd(readStrongBinder11);
                }
                AbstractC3388j8.f(parcel);
                j3(w014, f1Var3, c1Var11, readString14, readString15, interfaceC3841rd3);
                parcel2.writeNoException();
                return true;
            case 36:
                parcel2.writeNoException();
                ClassLoader classLoader5 = AbstractC3388j8.f31199a;
                parcel2.writeStrongBinder(null);
                return true;
            case 37:
                W2.a w015 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                I3(w015);
                parcel2.writeNoException();
                return true;
            case com.anythink.basead.b.b.j.f5806M /* 38 */:
                W2.a w016 = W2.b.w0(parcel.readStrongBinder());
                q2.c1 c1Var12 = (q2.c1) AbstractC3388j8.b(parcel, q2.c1.CREATOR);
                String readString16 = parcel.readString();
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    interfaceC3841rd2 = queryLocalInterface12 instanceof InterfaceC3841rd ? (InterfaceC3841rd) queryLocalInterface12 : new C3734pd(readStrongBinder12);
                }
                AbstractC3388j8.f(parcel);
                h2(w016, c1Var12, readString16, interfaceC3841rd2);
                parcel2.writeNoException();
                return true;
            case 39:
                W2.a w017 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                c3(w017);
                throw null;
        }
    }

    public final Bundle U3(String str, q2.c1 c1Var, String str2) {
        v2.i.a("Server parameters: ".concat(String.valueOf(str)));
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
            if (this.f23682n instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (c1Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", c1Var.f40121z);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            v2.i.d("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void V2(W2.a aVar, q2.c1 c1Var, String str, InterfaceC3841rd interfaceC3841rd) {
        Object obj = this.f23682n;
        if (!(obj instanceof AbstractC5187a)) {
            String canonicalName = AbstractC5187a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            v2.i.f(sb.toString());
            throw new RemoteException();
        }
        v2.i.a("Requesting rewarded ad from adapter.");
        try {
            S0.e eVar = new S0.e(this, interfaceC3841rd);
            U3(str, c1Var, null);
            V3(c1Var);
            W3(c1Var);
            X3(str, c1Var);
            ((AbstractC5187a) obj).loadRewardedAd(new x2.n(), eVar);
        } catch (Exception e9) {
            v2.i.d("", e9);
            AbstractC2772Sd.h(aVar, e9, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    public final void V3(q2.c1 c1Var) {
        Bundle bundle = c1Var.f40099F;
        if (bundle == null || bundle.getBundle(this.f23682n.getClass().getName()) == null) {
            new Bundle();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void W2() {
        Object obj = this.f23682n;
        if (obj instanceof InterfaceC5191e) {
            try {
                ((InterfaceC5191e) obj).onResume();
            } catch (Throwable th) {
                v2.i.d("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void Y1(W2.a aVar, q2.c1 c1Var, String str, String str2, InterfaceC3841rd interfaceC3841rd, C3462kb c3462kb, ArrayList arrayList) {
        Object obj = this.f23682n;
        boolean z3 = obj instanceof MediationNativeAdapter;
        if (!z3 && !(obj instanceof AbstractC5187a)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC5187a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            u1.h.i(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            v2.i.f(sb.toString());
            throw new RemoteException();
        }
        v2.i.a("Requesting native ad from adapter.");
        if (z3) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                List list = c1Var.f40119x;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j6 = c1Var.f40116u;
                if (j6 != -1) {
                    new Date(j6);
                }
                boolean W32 = W3(c1Var);
                int i = c1Var.f40121z;
                boolean z6 = c1Var.f40103K;
                X3(str, c1Var);
                C2500Cd c2500Cd = new C2500Cd(hashSet, W32, i, c3462kb, arrayList, z6);
                Bundle bundle = c1Var.f40099F;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f23683u = new C4274ze(7, interfaceC3841rd);
                mediationNativeAdapter.requestNativeAd((Context) W2.b.F0(aVar), this.f23683u, U3(str, c1Var, str2), c2500Cd, bundle2);
                return;
            } catch (Throwable th) {
                v2.i.d("", th);
                AbstractC2772Sd.h(aVar, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        if (obj instanceof AbstractC5187a) {
            try {
                S0.c cVar = new S0.c(this, interfaceC3841rd);
                U3(str, c1Var, str2);
                V3(c1Var);
                W3(c1Var);
                X3(str, c1Var);
                ((AbstractC5187a) obj).loadNativeAdMapper(new x2.l(), cVar);
            } catch (Throwable th2) {
                v2.i.d("", th2);
                AbstractC2772Sd.h(aVar, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    C2991bm c2991bm = new C2991bm(this, interfaceC3841rd);
                    U3(str, c1Var, str2);
                    V3(c1Var);
                    W3(c1Var);
                    X3(str, c1Var);
                    ((AbstractC5187a) obj).loadNativeAd(new x2.l(), c2991bm);
                } catch (Throwable th3) {
                    v2.i.d("", th3);
                    AbstractC2772Sd.h(aVar, th3, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    public final void Y3(String str, q2.c1 c1Var) {
        Object obj = this.f23682n;
        if (obj instanceof AbstractC5187a) {
            V2(this.f23685w, c1Var, str, new BinderC2483Bd((AbstractC5187a) obj, this.f23684v));
            return;
        }
        String canonicalName = AbstractC5187a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        v2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void b2(W2.a aVar, q2.c1 c1Var, InterfaceC3037cf interfaceC3037cf, String str) {
        Object obj = this.f23682n;
        if ((obj instanceof AbstractC5187a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.f23685w = aVar;
            this.f23684v = interfaceC3037cf;
            interfaceC3037cf.z3(new W2.b(obj));
            return;
        }
        String canonicalName = AbstractC5187a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        v2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final q2.A0 c0() {
        Object obj = this.f23682n;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                return ((AbstractAdViewAdapter) obj).getVideoController();
            } catch (Throwable th) {
                v2.i.d("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void c3(W2.a aVar) {
        Object obj = this.f23682n;
        if (obj instanceof AbstractC5187a) {
            v2.i.a("Show app open ad from adapter.");
            v2.i.c("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        String canonicalName = AbstractC5187a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        v2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final C3895sd d0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final W2.a e() {
        Object obj = this.f23682n;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return new W2.b(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                v2.i.d("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof AbstractC5187a) {
            return new W2.b(null);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = AbstractC5187a.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        u1.h.i(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb.append(canonicalName3);
        v2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void g() {
        Object obj = this.f23682n;
        if (obj instanceof MediationInterstitialAdapter) {
            v2.i.a("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th) {
                v2.i.d("", th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        v2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final C4003ud g0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void h0(W2.a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void h2(W2.a aVar, q2.c1 c1Var, String str, InterfaceC3841rd interfaceC3841rd) {
        Object obj = this.f23682n;
        if (!(obj instanceof AbstractC5187a)) {
            String canonicalName = AbstractC5187a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            v2.i.f(sb.toString());
            throw new RemoteException();
        }
        v2.i.a("Requesting app open ad from adapter.");
        try {
            C4273zd c4273zd = new C4273zd(this, interfaceC3841rd, 1);
            U3(str, c1Var, null);
            V3(c1Var);
            W3(c1Var);
            X3(str, c1Var);
            ((AbstractC5187a) obj).loadAppOpenAd(new C5192f(), c4273zd);
        } catch (Exception e9) {
            v2.i.d("", e9);
            AbstractC2772Sd.h(aVar, e9, "adapter.loadAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final C2804Ud i0() {
        Object obj = this.f23682n;
        if (!(obj instanceof AbstractC5187a)) {
            return null;
        }
        k2.t versionInfo = ((AbstractC5187a) obj).getVersionInfo();
        return new C2804Ud(versionInfo.f38613a, versionInfo.f38614b, versionInfo.f38615c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void j3(W2.a aVar, q2.f1 f1Var, q2.c1 c1Var, String str, String str2, InterfaceC3841rd interfaceC3841rd) {
        Object obj = this.f23682n;
        if (!(obj instanceof AbstractC5187a)) {
            String canonicalName = AbstractC5187a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            v2.i.f(sb.toString());
            throw new RemoteException();
        }
        v2.i.a("Requesting interscroller ad from adapter.");
        try {
            AbstractC5187a abstractC5187a = (AbstractC5187a) obj;
            S0.e eVar = new S0.e(this, interfaceC3841rd, abstractC5187a);
            U3(str, c1Var, str2);
            V3(c1Var);
            W3(c1Var);
            X3(str, c1Var);
            int i = f1Var.f40143x;
            int i6 = f1Var.f40140u;
            k2.h hVar = new k2.h(i, i6);
            hVar.f38597g = true;
            hVar.f38598h = i6;
            eVar.x(new C4631a(7, abstractC5187a.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null));
        } catch (Exception e9) {
            v2.i.d("", e9);
            AbstractC2772Sd.h(aVar, e9, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final C2804Ud k0() {
        Object obj = this.f23682n;
        if (!(obj instanceof AbstractC5187a)) {
            return null;
        }
        k2.t sDKVersionInfo = ((AbstractC5187a) obj).getSDKVersionInfo();
        return new C2804Ud(sDKVersionInfo.f38613a, sDKVersionInfo.f38614b, sDKVersionInfo.f38615c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void l() {
        Object obj = this.f23682n;
        if (obj instanceof InterfaceC5191e) {
            try {
                ((InterfaceC5191e) obj).onPause();
            } catch (Throwable th) {
                v2.i.d("", th);
                throw new RemoteException();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void l1(W2.a aVar, InterfaceC2482Bc interfaceC2482Bc, ArrayList arrayList) {
        char c9;
        Object obj = this.f23682n;
        if (!(obj instanceof AbstractC5187a)) {
            throw new RemoteException();
        }
        try {
            C2866Yb c2866Yb = new C2866Yb(11);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = ((C2533Ec) it.next()).f24631n;
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
                k2.b bVar = k2.b.APP_OPEN_AD;
                switch (c9) {
                    case 0:
                        bVar = k2.b.BANNER;
                        break;
                    case 1:
                        bVar = k2.b.INTERSTITIAL;
                        break;
                    case 2:
                        bVar = k2.b.REWARDED;
                        break;
                    case 3:
                        bVar = k2.b.REWARDED_INTERSTITIAL;
                        break;
                    case 4:
                        bVar = k2.b.NATIVE;
                        break;
                    case 5:
                        break;
                    case 6:
                        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.nd)).booleanValue()) {
                            break;
                        }
                    default:
                        bVar = null;
                        break;
                }
                if (bVar != null) {
                    arrayList2.add(new C5195i());
                }
            }
            ((AbstractC5187a) obj).initialize((Context) W2.b.F0(aVar), c2866Yb, arrayList2);
        } catch (Throwable th) {
            AbstractC2772Sd.h(aVar, th, "adapter.initialize");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final boolean m() {
        Object obj = this.f23682n;
        if ((obj instanceof AbstractC5187a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.f23684v != null;
        }
        String canonicalName = AbstractC5187a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        v2.i.f(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void n() {
        Object obj = this.f23682n;
        if (obj instanceof InterfaceC5191e) {
            try {
                ((InterfaceC5191e) obj).onDestroy();
            } catch (Throwable th) {
                v2.i.d("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void q3(W2.a aVar, q2.c1 c1Var, String str, String str2, InterfaceC3841rd interfaceC3841rd) {
        Object obj = this.f23682n;
        boolean z3 = obj instanceof MediationInterstitialAdapter;
        if (!z3 && !(obj instanceof AbstractC5187a)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC5187a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            u1.h.i(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            v2.i.f(sb.toString());
            throw new RemoteException();
        }
        v2.i.a("Requesting interstitial ad from adapter.");
        if (!z3) {
            if (obj instanceof AbstractC5187a) {
                try {
                    S0.s sVar = new S0.s(this, interfaceC3841rd);
                    U3(str, c1Var, str2);
                    V3(c1Var);
                    W3(c1Var);
                    X3(str, c1Var);
                    ((AbstractC5187a) obj).loadInterstitialAd(new x2.j(), sVar);
                    return;
                } catch (Throwable th) {
                    v2.i.d("", th);
                    AbstractC2772Sd.h(aVar, th, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
            List list = c1Var.f40119x;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j6 = c1Var.f40116u;
            if (j6 != -1) {
                new Date(j6);
            }
            boolean W32 = W3(c1Var);
            int i = c1Var.f40121z;
            boolean z6 = c1Var.f40103K;
            X3(str, c1Var);
            C4219yd c4219yd = new C4219yd(hashSet, W32, i, z6);
            Bundle bundle = c1Var.f40099F;
            mediationInterstitialAdapter.requestInterstitialAd((Context) W2.b.F0(aVar), new C4274ze(7, interfaceC3841rd), U3(str, c1Var, str2), c4219yd, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            v2.i.d("", th2);
            AbstractC2772Sd.h(aVar, th2, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void s1(W2.a aVar, q2.c1 c1Var, String str, InterfaceC3841rd interfaceC3841rd) {
        Object obj = this.f23682n;
        if (!(obj instanceof AbstractC5187a)) {
            String canonicalName = AbstractC5187a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            v2.i.f(sb.toString());
            throw new RemoteException();
        }
        v2.i.a("Requesting rewarded interstitial ad from adapter.");
        try {
            S0.e eVar = new S0.e(this, interfaceC3841rd);
            U3(str, c1Var, null);
            V3(c1Var);
            W3(c1Var);
            X3(str, c1Var);
            ((AbstractC5187a) obj).loadRewardedInterstitialAd(new x2.n(), eVar);
        } catch (Exception e9) {
            AbstractC2772Sd.h(aVar, e9, "adapter.loadRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3680od
    public final void t2(W2.a aVar, q2.f1 f1Var, q2.c1 c1Var, String str, String str2, InterfaceC3841rd interfaceC3841rd) {
        k2.h hVar;
        Object obj = this.f23682n;
        boolean z3 = obj instanceof MediationBannerAdapter;
        if (!z3 && !(obj instanceof AbstractC5187a)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC5187a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            u1.h.i(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            v2.i.f(sb.toString());
            throw new RemoteException();
        }
        v2.i.a("Requesting banner ad from adapter.");
        boolean z6 = f1Var.f40136G;
        int i = f1Var.f40140u;
        int i6 = f1Var.f40143x;
        if (z6) {
            k2.h hVar2 = new k2.h(i6, i);
            hVar2.f38595e = true;
            hVar2.f38596f = i;
            hVar = hVar2;
        } else {
            hVar = new k2.h(i6, i, f1Var.f40139n);
        }
        if (!z3) {
            if (obj instanceof AbstractC5187a) {
                try {
                    C4273zd c4273zd = new C4273zd(this, interfaceC3841rd, 0);
                    U3(str, c1Var, str2);
                    V3(c1Var);
                    W3(c1Var);
                    X3(str, c1Var);
                    ((AbstractC5187a) obj).loadBannerAd(new C5193g(), c4273zd);
                    return;
                } catch (Throwable th) {
                    v2.i.d("", th);
                    AbstractC2772Sd.h(aVar, th, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj;
            List list = c1Var.f40119x;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j6 = c1Var.f40116u;
            if (j6 != -1) {
                new Date(j6);
            }
            boolean W32 = W3(c1Var);
            int i9 = c1Var.f40121z;
            boolean z9 = c1Var.f40103K;
            X3(str, c1Var);
            C4219yd c4219yd = new C4219yd(hashSet, W32, i9, z9);
            Bundle bundle = c1Var.f40099F;
            mediationBannerAdapter.requestBannerAd((Context) W2.b.F0(aVar), new C4274ze(7, interfaceC3841rd), U3(str, c1Var, str2), hVar, c4219yd, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            v2.i.d("", th2);
            AbstractC2772Sd.h(aVar, th2, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    public BinderC2466Ad(AbstractC5187a abstractC5187a) {
        this();
        this.f23682n = abstractC5187a;
    }

    public BinderC2466Ad(InterfaceC5191e interfaceC5191e) {
        this();
        this.f23682n = interfaceC5191e;
    }
}
