package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o2.AbstractC4801a;
import s2.C4969z0;

/* loaded from: classes2.dex */
public final class J8 extends AbstractBinderC3359i8 implements P8 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26403n;

    /* renamed from: u, reason: collision with root package name */
    public String f26404u;

    /* renamed from: v, reason: collision with root package name */
    public Object f26405v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J8() {
        this((byte) 0);
        this.f26403n = 1;
    }

    @Override // com.google.android.gms.internal.ads.P8
    public final void M(C4969z0 c4969z0) {
        switch (this.f26403n) {
            case 0:
                AbstractC4801a abstractC4801a = (AbstractC4801a) this.f26405v;
                if (abstractC4801a != null) {
                    abstractC4801a.onAdFailedToLoad(c4969z0.b());
                    break;
                }
                break;
            default:
                S0.l lVar = (S0.l) this.f26405v;
                if (lVar != null) {
                    String nVar = c4969z0.b().toString();
                    String str = this.f26404u;
                    StringBuilder sb = new StringBuilder(nVar.length() + 60 + String.valueOf(str).length());
                    sb.append("Failed to load app open ad with error parcel: ");
                    sb.append(nVar);
                    sb.append(" for ad unit: ");
                    sb.append(str);
                    x2.i.f(sb.toString());
                    ((Fv) lVar.f2927v).c(c4969z0);
                    this.f26405v = null;
                    this.f26404u = null;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.P8
    public final void N0(N8 n82) {
        switch (this.f26403n) {
            case 0:
                AbstractC4801a abstractC4801a = (AbstractC4801a) this.f26405v;
                if (abstractC4801a != null) {
                    abstractC4801a.onAdLoaded(new K8(n82, this.f26404u));
                    break;
                }
                break;
            default:
                S0.l lVar = (S0.l) this.f26405v;
                if (lVar != null) {
                    ((XD) lVar.f2926u).d(n82);
                    this.f26405v = null;
                    this.f26404u = null;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        N8 m82;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                m82 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                m82 = queryLocalInterface instanceof N8 ? (N8) queryLocalInterface : new M8(readStrongBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd", 1);
            }
            AbstractC3411j8.f(parcel);
            N0(m82);
        } else if (i == 2) {
            int readInt = parcel.readInt();
            AbstractC3411j8.f(parcel);
            x(readInt);
        } else {
            if (i != 3) {
                return false;
            }
            C4969z0 c4969z0 = (C4969z0) AbstractC3411j8.b(parcel, C4969z0.CREATOR);
            AbstractC3411j8.f(parcel);
            M(c4969z0);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.P8
    public final void x(int i) {
        switch (this.f26403n) {
            case 0:
                break;
            default:
                this.f26405v = null;
                this.f26404u = null;
                break;
        }
    }

    public J8(byte b9) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public J8(AbstractC4801a abstractC4801a, String str) {
        this((byte) 0);
        this.f26403n = 0;
        this.f26405v = abstractC4801a;
        this.f26404u = str;
    }

    private final void U3(int i) {
    }
}
