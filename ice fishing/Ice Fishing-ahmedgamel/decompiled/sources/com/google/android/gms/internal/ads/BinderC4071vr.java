package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;
import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.vr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4071vr extends AbstractBinderC3336i8 implements InterfaceC2755Rd {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f34746x = 0;

    /* renamed from: n, reason: collision with root package name */
    public final C3467kg f34747n;

    /* renamed from: u, reason: collision with root package name */
    public final JSONObject f34748u;

    /* renamed from: v, reason: collision with root package name */
    public final long f34749v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f34750w;

    public BinderC4071vr(String str, InterfaceC2721Pd interfaceC2721Pd, C3467kg c3467kg, long j6) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
        JSONObject jSONObject = new JSONObject();
        this.f34748u = jSONObject;
        this.f34750w = false;
        this.f34747n = c3467kg;
        this.f34749v = j6;
        try {
            jSONObject.put("adapter_version", interfaceC2721Pd.e().toString());
            jSONObject.put(com.anythink.expressad.foundation.g.a.bs, interfaceC2721Pd.h().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String readString = parcel.readString();
            AbstractC3388j8.f(parcel);
            synchronized (this) {
                if (!this.f34750w) {
                    if (readString == null) {
                        synchronized (this) {
                            U3(2, "Adapter returned null signals");
                        }
                    } else {
                        try {
                            JSONObject jSONObject = this.f34748u;
                            jSONObject.put("signals", readString);
                            C3301ha c3301ha = AbstractC3569ma.f32271i2;
                            q2.r rVar = q2.r.f40207e;
                            if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                                C4835j.f39733C.f39745k.getClass();
                                jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f34749v);
                            }
                            if (((Boolean) rVar.f40210c.a(AbstractC3569ma.f32262h2)).booleanValue()) {
                                jSONObject.put("signal_error_code", 0);
                            }
                        } catch (JSONException unused) {
                        }
                        this.f34747n.b(this.f34748u);
                        this.f34750w = true;
                    }
                }
            }
        } else if (i == 2) {
            String readString2 = parcel.readString();
            AbstractC3388j8.f(parcel);
            synchronized (this) {
                U3(2, readString2);
            }
        } else {
            if (i != 3) {
                return false;
            }
            C4920z0 c4920z0 = (C4920z0) AbstractC3388j8.b(parcel, C4920z0.CREATOR);
            AbstractC3388j8.f(parcel);
            synchronized (this) {
                U3(2, c4920z0.f40214u);
            }
        }
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void U3(int i, String str) {
        try {
            if (this.f34750w) {
                return;
            }
            try {
                JSONObject jSONObject = this.f34748u;
                jSONObject.put("signal_error", str);
                C3301ha c3301ha = AbstractC3569ma.f32271i2;
                q2.r rVar = q2.r.f40207e;
                if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                    C4835j.f39733C.f39745k.getClass();
                    jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f34749v);
                }
                if (((Boolean) rVar.f40210c.a(AbstractC3569ma.f32262h2)).booleanValue()) {
                    jSONObject.put("signal_error_code", i);
                }
            } catch (JSONException unused) {
            }
            this.f34747n.b(this.f34748u);
            this.f34750w = true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
