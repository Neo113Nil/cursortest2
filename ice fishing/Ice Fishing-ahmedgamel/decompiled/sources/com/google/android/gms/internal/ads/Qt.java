package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p2.C4835j;

/* loaded from: classes2.dex */
public final class Qt extends AbstractBinderC3336i8 {

    /* renamed from: n, reason: collision with root package name */
    public final Mt f27123n;

    /* renamed from: u, reason: collision with root package name */
    public final Jt f27124u;

    /* renamed from: v, reason: collision with root package name */
    public final Zt f27125v;

    /* renamed from: w, reason: collision with root package name */
    public C2476An f27126w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f27127x;

    public Qt(Mt mt, Jt jt, Zt zt) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        this.f27127x = false;
        this.f27123n = mt;
        this.f27124u = jt;
        this.f27125v = zt;
    }

    public final synchronized void O1(W2.a aVar) {
        P2.w.d("resume must be called on the main UI thread.");
        if (this.f27126w != null) {
            Context context = aVar == null ? null : (Context) W2.b.F0(aVar);
            C2558Fk c2558Fk = this.f27126w.f24835c;
            c2558Fk.getClass();
            c2558Fk.M1(new C2552Fe(context, 1));
        }
    }

    public final synchronized void T1(W2.a aVar) {
        P2.w.d("destroy must be called on the main UI thread.");
        Context context = null;
        this.f27124u.f25781u.set(null);
        if (this.f27126w != null) {
            if (aVar != null) {
                context = (Context) W2.b.F0(aVar);
            }
            C2558Fk c2558Fk = this.f27126w.f24835c;
            c2558Fk.getClass();
            c2558Fk.M1(new C3193fa(context, false));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x021b, code lost:
    
        if (java.util.regex.Pattern.matches(r0, r7) != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0240, code lost:
    
        if (((java.lang.Boolean) q2.r.f40207e.f40210c.a(com.google.android.gms.internal.ads.AbstractC3569ma.f32394v6)).booleanValue() == false) goto L158;
     */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        String str;
        q2.M m4;
        Bundle bundle;
        InterfaceC4061vh interfaceC4061vh;
        C2476An c2476An;
        C2869Ye c2869Ye = null;
        r2 = null;
        BinderC3848rk binderC3848rk = null;
        C2853Xe c2853Xe = null;
        if (i == 1) {
            C2885Ze c2885Ze = (C2885Ze) AbstractC3388j8.b(parcel, C2885Ze.CREATOR);
            AbstractC3388j8.f(parcel);
            synchronized (this) {
                P2.w.d("loadAd must be called on the main UI thread.");
                String str2 = c2885Ze.f28912u;
                String str3 = (String) q2.r.f40207e.f40210c.a(AbstractC3569ma.t6);
                if (str3 != null && str2 != null) {
                    try {
                    } catch (RuntimeException e9) {
                        C4835j.f39733C.f39743h.d("NonagonUtil.isPatternMatched", e9);
                    }
                }
                if (U3()) {
                }
                Kt kt = new Kt(23);
                this.f27126w = null;
                Mt mt = this.f27123n;
                mt.f26369h.f29356o.f1974u = 1;
                mt.a(c2885Ze.f28911n, c2885Ze.f28912u, kt, new C4178xq(5, this));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            synchronized (this) {
                v3(null);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 3) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                c2869Ye = queryLocalInterface instanceof C2869Ye ? (C2869Ye) queryLocalInterface : new C2869Ye(readStrongBinder);
            }
            AbstractC3388j8.f(parcel);
            P2.w.d("setRewardedVideoAdListener can only be called from the UI thread.");
            this.f27124u.f25784x.set(c2869Ye);
            parcel2.writeNoException();
            return true;
        }
        if (i == 34) {
            boolean a9 = AbstractC3388j8.a(parcel);
            AbstractC3388j8.f(parcel);
            synchronized (this) {
                P2.w.d("setImmersiveMode must be called on the main UI thread.");
                this.f27127x = a9;
            }
            parcel2.writeNoException();
            return true;
        }
        int i6 = 0;
        switch (i) {
            case 5:
                P2.w.d("isLoaded must be called on the main UI thread.");
                boolean U3 = U3();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3388j8.f31199a;
                parcel2.writeInt(U3 ? 1 : 0);
                return true;
            case 6:
                Y(null);
                parcel2.writeNoException();
                return true;
            case 7:
                O1(null);
                parcel2.writeNoException();
                return true;
            case 8:
                T1(null);
                parcel2.writeNoException();
                return true;
            case 9:
                W2.a w02 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                Y(w02);
                parcel2.writeNoException();
                return true;
            case 10:
                W2.a w03 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                O1(w03);
                parcel2.writeNoException();
                return true;
            case 11:
                W2.a w04 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                T1(w04);
                parcel2.writeNoException();
                return true;
            case 12:
                synchronized (this) {
                    C2476An c2476An2 = this.f27126w;
                    str = c2476An2 != null ? c2476An2.f24838f.f33698n : null;
                }
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                String readString = parcel.readString();
                AbstractC3388j8.f(parcel);
                synchronized (this) {
                    P2.w.d("setUserId must be called on the main UI thread.");
                    this.f27125v.f28973a = readString;
                }
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    m4 = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    m4 = queryLocalInterface2 instanceof q2.M ? (q2.M) queryLocalInterface2 : new q2.M(readStrongBinder2, "com.google.android.gms.ads.internal.client.IAdMetadataListener", 2);
                }
                AbstractC3388j8.f(parcel);
                P2.w.d("setAdMetadataListener can only be called from the UI thread.");
                Jt jt = this.f27124u;
                if (m4 == null) {
                    jt.f25781u.set(null);
                } else {
                    jt.f25781u.set(new Nt(this, m4));
                }
                parcel2.writeNoException();
                return true;
            case 15:
                P2.w.d("getAdMetadata can only be called from the UI thread.");
                C2476An c2476An3 = this.f27126w;
                if (c2476An3 != null) {
                    C2694Nk c2694Nk = c2476An3.f23738q;
                    synchronized (c2694Nk) {
                        bundle = new Bundle(c2694Nk.f26521v);
                    }
                } else {
                    bundle = new Bundle();
                }
                parcel2.writeNoException();
                AbstractC3388j8.d(parcel2, bundle);
                return true;
            case 16:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                    c2853Xe = queryLocalInterface3 instanceof C2853Xe ? (C2853Xe) queryLocalInterface3 : new C2853Xe(readStrongBinder3, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener", 2);
                }
                AbstractC3388j8.f(parcel);
                P2.w.d("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
                this.f27124u.f25786z.set(c2853Xe);
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.readString();
                AbstractC3388j8.f(parcel);
                parcel2.writeNoException();
                return true;
            case 18:
                W2.a w05 = W2.b.w0(parcel.readStrongBinder());
                AbstractC3388j8.f(parcel);
                v3(w05);
                parcel2.writeNoException();
                return true;
            case 19:
                String readString2 = parcel.readString();
                AbstractC3388j8.f(parcel);
                synchronized (this) {
                    P2.w.d("#008 Must be called on the main UI thread.: setCustomData");
                    this.f27125v.f28974b = readString2;
                }
                parcel2.writeNoException();
                return true;
            case 20:
                C2476An c2476An4 = this.f27126w;
                if (c2476An4 != null && (interfaceC4061vh = (InterfaceC4061vh) c2476An4.f23734m.get()) != null && !interfaceC4061vh.V0()) {
                    i6 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3388j8.f31199a;
                parcel2.writeInt(i6);
                return true;
            case 21:
                synchronized (this) {
                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32021F7)).booleanValue() && (c2476An = this.f27126w) != null) {
                        binderC3848rk = c2476An.f24838f;
                    }
                }
                parcel2.writeNoException();
                AbstractC3388j8.e(parcel2, binderC3848rk);
                return true;
            default:
                return false;
        }
    }

    public final synchronized boolean U3() {
        C2476An c2476An = this.f27126w;
        if (c2476An != null) {
            if (!c2476An.f23739r.f26519u.get()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void Y(W2.a aVar) {
        P2.w.d("pause must be called on the main UI thread.");
        if (this.f27126w != null) {
            Context context = aVar == null ? null : (Context) W2.b.F0(aVar);
            C2558Fk c2558Fk = this.f27126w.f24835c;
            c2558Fk.getClass();
            c2558Fk.M1(new C3515la(context, 1));
        }
    }

    public final synchronized void v3(W2.a aVar) {
        try {
            P2.w.d("showAd must be called on the main UI thread.");
            if (this.f27126w != null) {
                Activity activity = null;
                if (aVar != null) {
                    Object F02 = W2.b.F0(aVar);
                    if (F02 instanceof Activity) {
                        activity = (Activity) F02;
                    }
                }
                this.f27126w.c(activity, this.f27127x);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
