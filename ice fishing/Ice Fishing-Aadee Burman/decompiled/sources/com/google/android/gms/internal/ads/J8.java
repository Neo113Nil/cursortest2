package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import m2.AbstractC4730a;
import q2.C4920z0;

/* loaded from: classes2.dex */
public final class J8 extends AbstractBinderC3336i8 implements P8 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25650n;

    /* renamed from: u, reason: collision with root package name */
    public String f25651u;

    /* renamed from: v, reason: collision with root package name */
    public Object f25652v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J8() {
        this((byte) 0);
        this.f25650n = 1;
    }

    @Override // com.google.android.gms.internal.ads.P8
    public final void G(C4920z0 c4920z0) {
        switch (this.f25650n) {
            case 0:
                AbstractC4730a abstractC4730a = (AbstractC4730a) this.f25652v;
                if (abstractC4730a != null) {
                    abstractC4730a.onAdFailedToLoad(c4920z0.b());
                    break;
                }
                break;
            default:
                S0.l lVar = (S0.l) this.f25652v;
                if (lVar != null) {
                    String nVar = c4920z0.b().toString();
                    String str = this.f25651u;
                    StringBuilder sb = new StringBuilder(nVar.length() + 60 + String.valueOf(str).length());
                    sb.append("Failed to load app open ad with error parcel: ");
                    sb.append(nVar);
                    sb.append(" for ad unit: ");
                    sb.append(str);
                    v2.i.f(sb.toString());
                    ((Fv) lVar.f2798v).c(c4920z0);
                    this.f25652v = null;
                    this.f25651u = null;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.P8
    public final void O0(N8 n82) {
        switch (this.f25650n) {
            case 0:
                AbstractC4730a abstractC4730a = (AbstractC4730a) this.f25652v;
                if (abstractC4730a != null) {
                    abstractC4730a.onAdLoaded(new K8(n82, this.f25651u));
                    break;
                }
                break;
            default:
                S0.l lVar = (S0.l) this.f25652v;
                if (lVar != null) {
                    ((XD) lVar.f2797u).d(n82);
                    this.f25652v = null;
                    this.f25651u = null;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        N8 m82;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                m82 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                m82 = queryLocalInterface instanceof N8 ? (N8) queryLocalInterface : new M8(readStrongBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd", 2);
            }
            AbstractC3388j8.f(parcel);
            O0(m82);
        } else if (i == 2) {
            int readInt = parcel.readInt();
            AbstractC3388j8.f(parcel);
            x(readInt);
        } else {
            if (i != 3) {
                return false;
            }
            C4920z0 c4920z0 = (C4920z0) AbstractC3388j8.b(parcel, C4920z0.CREATOR);
            AbstractC3388j8.f(parcel);
            G(c4920z0);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.P8
    public final void x(int i) {
        switch (this.f25650n) {
            case 0:
                break;
            default:
                this.f25652v = null;
                this.f25651u = null;
                break;
        }
    }

    public J8(byte b9) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public J8(AbstractC4730a abstractC4730a, String str) {
        this((byte) 0);
        this.f25650n = 0;
        this.f25652v = abstractC4730a;
        this.f25651u = str;
    }

    private final void U3(int i) {
    }
}
