package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import org.json.JSONException;
import r2.C4906k;
import s2.C4961v0;
import s2.InterfaceC4963w0;

/* renamed from: com.google.android.gms.internal.ads.rk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3871rk extends AbstractBinderC3359i8 implements InterfaceC4963w0 {

    /* renamed from: A, reason: collision with root package name */
    public final C3608mq f34466A;

    /* renamed from: B, reason: collision with root package name */
    public final Bundle f34467B;

    /* renamed from: C, reason: collision with root package name */
    public final double f34468C;

    /* renamed from: D, reason: collision with root package name */
    public final int f34469D;

    /* renamed from: n, reason: collision with root package name */
    public final String f34470n;

    /* renamed from: u, reason: collision with root package name */
    public final String f34471u;

    /* renamed from: v, reason: collision with root package name */
    public final String f34472v;

    /* renamed from: w, reason: collision with root package name */
    public final String f34473w;

    /* renamed from: x, reason: collision with root package name */
    public final List f34474x;

    /* renamed from: y, reason: collision with root package name */
    public final long f34475y;

    /* renamed from: z, reason: collision with root package name */
    public final String f34476z;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ef, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BinderC3871rk(St st, String str, C3608mq c3608mq, Ut ut, String str2) {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
        Bundle bundle;
        String str3;
        String str4 = null;
        this.f34471u = st == null ? null : st.f28392b0;
        this.f34472v = str2;
        this.f34473w = ut == null ? null : ut.f28801b;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && st != null) {
            try {
                str4 = st.f28429v.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f34470n = str4 != null ? str4 : str;
        this.f34474x = c3608mq.f33369a;
        this.f34466A = c3608mq;
        this.f34468C = st == null ? 0.0d : st.f28438z0;
        this.f34469D = st == null ? 2 : st.f28373I0;
        C4906k.f40186C.f40198k.getClass();
        this.f34475y = System.currentTimeMillis() / 1000;
        C3324ha c3324ha = AbstractC3592ma.f33177w;
        s2.r rVar = s2.r.f40506e;
        boolean booleanValue = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        if (booleanValue) {
            Bundle bundle2 = new Bundle();
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32817H7)).booleanValue() && ut != null) {
                bundle2.putAll(ut.f28809k);
            }
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32826I7)).booleanValue() && st != null) {
                bundle2.putAll(st.f28367F0);
            }
            this.f34467B = bundle2;
        } else {
            if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32817H7)).booleanValue() || ut == null) {
                this.f34467B = new Bundle();
            } else {
                this.f34467B = ut.f28809k;
            }
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32826I7)).booleanValue() && st != null && (bundle = this.f34467B) != null) {
                bundle.putAll(st.f28367F0);
            }
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.Ba)).booleanValue() && ut != null) {
            str3 = ut.i;
        }
        str3 = "";
        this.f34476z = str3;
    }

    public static InterfaceC4963w0 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return queryLocalInterface instanceof InterfaceC4963w0 ? (InterfaceC4963w0) queryLocalInterface : new C4961v0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString(this.f34470n);
                return true;
            case 2:
                parcel2.writeNoException();
                parcel2.writeString(this.f34471u);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeTypedList(this.f34474x);
                return true;
            case 4:
                s2.h1 g9 = g();
                parcel2.writeNoException();
                AbstractC3411j8.d(parcel2, g9);
                return true;
            case 5:
                parcel2.writeNoException();
                AbstractC3411j8.d(parcel2, this.f34467B);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeString(this.f34472v);
                return true;
            default:
                return false;
        }
    }

    @Override // s2.InterfaceC4963w0
    public final String d() {
        return this.f34470n;
    }

    @Override // s2.InterfaceC4963w0
    public final String e() {
        return this.f34471u;
    }

    @Override // s2.InterfaceC4963w0
    public final s2.h1 g() {
        C3608mq c3608mq = this.f34466A;
        if (c3608mq != null) {
            return c3608mq.f33374f;
        }
        return null;
    }

    @Override // s2.InterfaceC4963w0
    public final List h() {
        return this.f34474x;
    }

    @Override // s2.InterfaceC4963w0
    public final String j() {
        return this.f34472v;
    }

    @Override // s2.InterfaceC4963w0
    public final Bundle n() {
        return this.f34467B;
    }
}
