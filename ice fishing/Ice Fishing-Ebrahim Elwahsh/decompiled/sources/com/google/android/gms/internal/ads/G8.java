package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import m2.AbstractC4777a;
import q2.C4927z0;

/* loaded from: classes2.dex */
public final class G8 extends AbstractBinderC3186f8 implements M8 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25103n;

    /* renamed from: u, reason: collision with root package name */
    public String f25104u;

    /* renamed from: v, reason: collision with root package name */
    public Object f25105v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G8() {
        this((byte) 0);
        this.f25103n = 1;
    }

    @Override // com.google.android.gms.internal.ads.M8
    public final void D(int i) {
        switch (this.f25103n) {
            case 0:
                break;
            default:
                this.f25105v = null;
                this.f25104u = null;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        K8 j82;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                j82 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                j82 = queryLocalInterface instanceof K8 ? (K8) queryLocalInterface : new J8(readStrongBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd", 2);
            }
            AbstractC3241g8.f(parcel);
            t3(j82);
        } else if (i == 2) {
            int readInt = parcel.readInt();
            AbstractC3241g8.f(parcel);
            D(readInt);
        } else {
            if (i != 3) {
                return false;
            }
            C4927z0 c4927z0 = (C4927z0) AbstractC3241g8.b(parcel, C4927z0.CREATOR);
            AbstractC3241g8.f(parcel);
            h0(c4927z0);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.M8
    public final void h0(C4927z0 c4927z0) {
        switch (this.f25103n) {
            case 0:
                AbstractC4777a abstractC4777a = (AbstractC4777a) this.f25105v;
                if (abstractC4777a != null) {
                    abstractC4777a.onAdFailedToLoad(c4927z0.b());
                    break;
                }
                break;
            default:
                C2593Hm c2593Hm = (C2593Hm) this.f25105v;
                if (c2593Hm != null) {
                    String c4643n = c4927z0.b().toString();
                    String str = this.f25104u;
                    StringBuilder sb = new StringBuilder(c4643n.length() + 60 + String.valueOf(str).length());
                    sb.append("Failed to load app open ad with error parcel: ");
                    sb.append(c4643n);
                    sb.append(" for ad unit: ");
                    sb.append(str);
                    u2.i.f(sb.toString());
                    ((Hv) c2593Hm.f25416u).c(c4927z0);
                    this.f25105v = null;
                    this.f25104u = null;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.M8
    public final void t3(K8 k82) {
        switch (this.f25103n) {
            case 0:
                AbstractC4777a abstractC4777a = (AbstractC4777a) this.f25105v;
                if (abstractC4777a != null) {
                    abstractC4777a.onAdLoaded(new H8(k82, this.f25104u));
                    break;
                }
                break;
            default:
                C2593Hm c2593Hm = (C2593Hm) this.f25105v;
                if (c2593Hm != null) {
                    ((ZD) c2593Hm.f25417v).d(k82);
                    this.f25105v = null;
                    this.f25104u = null;
                    break;
                }
                break;
        }
    }

    public G8(byte b9) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public G8(AbstractC4777a abstractC4777a, String str) {
        this((byte) 0);
        this.f25103n = 0;
        this.f25105v = abstractC4777a;
        this.f25104u = str;
    }

    private final void G3(int i) {
    }
}
