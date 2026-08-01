package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import org.json.JSONException;
import p2.C4835j;
import q2.C4912v0;
import q2.InterfaceC4914w0;

/* renamed from: com.google.android.gms.internal.ads.rk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3848rk extends AbstractBinderC3336i8 implements InterfaceC4914w0 {

    /* renamed from: A, reason: collision with root package name */
    public final C3585mq f33694A;

    /* renamed from: B, reason: collision with root package name */
    public final Bundle f33695B;

    /* renamed from: C, reason: collision with root package name */
    public final double f33696C;

    /* renamed from: D, reason: collision with root package name */
    public final int f33697D;

    /* renamed from: n, reason: collision with root package name */
    public final String f33698n;

    /* renamed from: u, reason: collision with root package name */
    public final String f33699u;

    /* renamed from: v, reason: collision with root package name */
    public final String f33700v;

    /* renamed from: w, reason: collision with root package name */
    public final String f33701w;

    /* renamed from: x, reason: collision with root package name */
    public final List f33702x;

    /* renamed from: y, reason: collision with root package name */
    public final long f33703y;

    /* renamed from: z, reason: collision with root package name */
    public final String f33704z;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ef, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BinderC3848rk(St st, String str, C3585mq c3585mq, Ut ut, String str2) {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
        Bundle bundle;
        String str3;
        String str4 = null;
        this.f33699u = st == null ? null : st.f27609b0;
        this.f33700v = str2;
        this.f33701w = ut == null ? null : ut.f28004b;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && st != null) {
            try {
                str4 = st.f27646v.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f33698n = str4 != null ? str4 : str;
        this.f33702x = c3585mq.f32591a;
        this.f33694A = c3585mq;
        this.f33696C = st == null ? 0.0d : st.f27655z0;
        this.f33697D = st == null ? 2 : st.f27590I0;
        C4835j.f39733C.f39745k.getClass();
        this.f33703y = System.currentTimeMillis() / 1000;
        C3301ha c3301ha = AbstractC3569ma.f32397w;
        q2.r rVar = q2.r.f40207e;
        boolean booleanValue = ((Boolean) rVar.f40210c.a(c3301ha)).booleanValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
        if (booleanValue) {
            Bundle bundle2 = new Bundle();
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32037H7)).booleanValue() && ut != null) {
                bundle2.putAll(ut.f28012k);
            }
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32046I7)).booleanValue() && st != null) {
                bundle2.putAll(st.f27584F0);
            }
            this.f33695B = bundle2;
        } else {
            if (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32037H7)).booleanValue() || ut == null) {
                this.f33695B = new Bundle();
            } else {
                this.f33695B = ut.f28012k;
            }
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32046I7)).booleanValue() && st != null && (bundle = this.f33695B) != null) {
                bundle.putAll(st.f27584F0);
            }
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.Ba)).booleanValue() && ut != null) {
            str3 = ut.i;
        }
        str3 = "";
        this.f33704z = str3;
    }

    public static InterfaceC4914w0 U3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return queryLocalInterface instanceof InterfaceC4914w0 ? (InterfaceC4914w0) queryLocalInterface : new C4912v0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString(this.f33698n);
                return true;
            case 2:
                parcel2.writeNoException();
                parcel2.writeString(this.f33699u);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeTypedList(this.f33702x);
                return true;
            case 4:
                q2.h1 g4 = g();
                parcel2.writeNoException();
                AbstractC3388j8.d(parcel2, g4);
                return true;
            case 5:
                parcel2.writeNoException();
                AbstractC3388j8.d(parcel2, this.f33695B);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeString(this.f33700v);
                return true;
            default:
                return false;
        }
    }

    @Override // q2.InterfaceC4914w0
    public final String d() {
        return this.f33698n;
    }

    @Override // q2.InterfaceC4914w0
    public final String e() {
        return this.f33699u;
    }

    @Override // q2.InterfaceC4914w0
    public final q2.h1 g() {
        C3585mq c3585mq = this.f33694A;
        if (c3585mq != null) {
            return c3585mq.f32596f;
        }
        return null;
    }

    @Override // q2.InterfaceC4914w0
    public final List h() {
        return this.f33702x;
    }

    @Override // q2.InterfaceC4914w0
    public final String j() {
        return this.f33700v;
    }

    @Override // q2.InterfaceC4914w0
    public final Bundle n() {
        return this.f33695B;
    }
}
