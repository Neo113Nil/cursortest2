package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import org.json.JSONException;
import q2.C4919v0;
import q2.InterfaceC4921w0;

/* renamed from: com.google.android.gms.internal.ads.pk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3754pk extends AbstractBinderC3186f8 implements InterfaceC4921w0 {

    /* renamed from: A, reason: collision with root package name */
    public final C3706oq f33480A;

    /* renamed from: B, reason: collision with root package name */
    public final Bundle f33481B;

    /* renamed from: C, reason: collision with root package name */
    public final double f33482C;

    /* renamed from: D, reason: collision with root package name */
    public final int f33483D;

    /* renamed from: n, reason: collision with root package name */
    public final String f33484n;

    /* renamed from: u, reason: collision with root package name */
    public final String f33485u;

    /* renamed from: v, reason: collision with root package name */
    public final String f33486v;

    /* renamed from: w, reason: collision with root package name */
    public final String f33487w;

    /* renamed from: x, reason: collision with root package name */
    public final List f33488x;

    /* renamed from: y, reason: collision with root package name */
    public final long f33489y;

    /* renamed from: z, reason: collision with root package name */
    public final String f33490z;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ef, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BinderC3754pk(Ut ut, String str, C3706oq c3706oq, Wt wt, String str2) {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
        Bundle bundle;
        String str3;
        String str4 = null;
        this.f33485u = ut == null ? null : ut.f28142b0;
        this.f33486v = str2;
        this.f33487w = wt == null ? null : wt.f28491b;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && ut != null) {
            try {
                str4 = ut.f28179v.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f33484n = str4 != null ? str4 : str;
        this.f33488x = c3706oq.f33221a;
        this.f33480A = c3706oq;
        this.f33482C = ut == null ? 0.0d : ut.f28188z0;
        this.f33483D = ut == null ? 2 : ut.f28123I0;
        p2.j.f39798C.f39810k.getClass();
        this.f33489y = System.currentTimeMillis() / 1000;
        C3151ea c3151ea = AbstractC3368ia.f31815w;
        q2.r rVar = q2.r.f40116e;
        boolean booleanValue = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        if (booleanValue) {
            Bundle bundle2 = new Bundle();
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31456H7)).booleanValue() && wt != null) {
                bundle2.putAll(wt.f28499k);
            }
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31464I7)).booleanValue() && ut != null) {
                bundle2.putAll(ut.f28117F0);
            }
            this.f33481B = bundle2;
        } else {
            if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31456H7)).booleanValue() || wt == null) {
                this.f33481B = new Bundle();
            } else {
                this.f33481B = wt.f28499k;
            }
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31464I7)).booleanValue() && ut != null && (bundle = this.f33481B) != null) {
                bundle.putAll(ut.f28117F0);
            }
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.Ba)).booleanValue() && wt != null) {
            str3 = wt.i;
        }
        str3 = "";
        this.f33490z = str3;
    }

    public static InterfaceC4921w0 G3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return queryLocalInterface instanceof InterfaceC4921w0 ? (InterfaceC4921w0) queryLocalInterface : new C4919v0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString(this.f33484n);
                return true;
            case 2:
                parcel2.writeNoException();
                parcel2.writeString(this.f33485u);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeTypedList(this.f33488x);
                return true;
            case 4:
                q2.i1 g9 = g();
                parcel2.writeNoException();
                AbstractC3241g8.d(parcel2, g9);
                return true;
            case 5:
                parcel2.writeNoException();
                AbstractC3241g8.d(parcel2, this.f33481B);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeString(this.f33486v);
                return true;
            default:
                return false;
        }
    }

    @Override // q2.InterfaceC4921w0
    public final String c() {
        return this.f33484n;
    }

    @Override // q2.InterfaceC4921w0
    public final List e() {
        return this.f33488x;
    }

    @Override // q2.InterfaceC4921w0
    public final String f() {
        return this.f33485u;
    }

    @Override // q2.InterfaceC4921w0
    public final q2.i1 g() {
        C3706oq c3706oq = this.f33480A;
        if (c3706oq != null) {
            return c3706oq.f33226f;
        }
        return null;
    }

    @Override // q2.InterfaceC4921w0
    public final String h() {
        return this.f33486v;
    }

    @Override // q2.InterfaceC4921w0
    public final Bundle l() {
        return this.f33481B;
    }
}
