package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.vr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4094vr extends AbstractBinderC3359i8 implements InterfaceC2775Rd {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f35515x = 0;

    /* renamed from: n, reason: collision with root package name */
    public final C3490kg f35516n;

    /* renamed from: u, reason: collision with root package name */
    public final JSONObject f35517u;

    /* renamed from: v, reason: collision with root package name */
    public final long f35518v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f35519w;

    public BinderC4094vr(String str, InterfaceC2741Pd interfaceC2741Pd, C3490kg c3490kg, long j6) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
        JSONObject jSONObject = new JSONObject();
        this.f35517u = jSONObject;
        this.f35519w = false;
        this.f35516n = c3490kg;
        this.f35518v = j6;
        try {
            jSONObject.put("adapter_version", interfaceC2741Pd.e().toString());
            jSONObject.put(com.anythink.expressad.foundation.g.a.bs, interfaceC2741Pd.h().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String readString = parcel.readString();
            AbstractC3411j8.f(parcel);
            synchronized (this) {
                if (!this.f35519w) {
                    if (readString == null) {
                        synchronized (this) {
                            U3(2, "Adapter returned null signals");
                        }
                    } else {
                        try {
                            JSONObject jSONObject = this.f35517u;
                            jSONObject.put("signals", readString);
                            C3324ha c3324ha = AbstractC3592ma.f33051i2;
                            s2.r rVar = s2.r.f40506e;
                            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                                C4906k.f40186C.f40198k.getClass();
                                jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f35518v);
                            }
                            if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33043h2)).booleanValue()) {
                                jSONObject.put("signal_error_code", 0);
                            }
                        } catch (JSONException unused) {
                        }
                        this.f35516n.b(this.f35517u);
                        this.f35519w = true;
                    }
                }
            }
        } else if (i == 2) {
            String readString2 = parcel.readString();
            AbstractC3411j8.f(parcel);
            synchronized (this) {
                U3(2, readString2);
            }
        } else {
            if (i != 3) {
                return false;
            }
            C4969z0 c4969z0 = (C4969z0) AbstractC3411j8.b(parcel, C4969z0.CREATOR);
            AbstractC3411j8.f(parcel);
            synchronized (this) {
                U3(2, c4969z0.f40513u);
            }
        }
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void U3(int i, String str) {
        try {
            if (this.f35519w) {
                return;
            }
            try {
                JSONObject jSONObject = this.f35517u;
                jSONObject.put("signal_error", str);
                C3324ha c3324ha = AbstractC3592ma.f33051i2;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    C4906k.f40186C.f40198k.getClass();
                    jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f35518v);
                }
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33043h2)).booleanValue()) {
                    jSONObject.put("signal_error_code", i);
                }
            } catch (JSONException unused) {
            }
            this.f35516n.b(this.f35517u);
            this.f35519w = true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
