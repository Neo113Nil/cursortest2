package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import r2.C4906k;

/* loaded from: classes2.dex */
public final class Qt extends AbstractBinderC3359i8 {

    /* renamed from: n, reason: collision with root package name */
    public final Mt f27879n;

    /* renamed from: u, reason: collision with root package name */
    public final Jt f27880u;

    /* renamed from: v, reason: collision with root package name */
    public final Zt f27881v;

    /* renamed from: w, reason: collision with root package name */
    public C2513Bn f27882w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f27883x;

    public Qt(Mt mt, Jt jt, Zt zt) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        this.f27883x = false;
        this.f27879n = mt;
        this.f27880u = jt;
        this.f27881v = zt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x021a, code lost:
    
        if (java.util.regex.Pattern.matches(r2, r7) != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x023f, code lost:
    
        if (((java.lang.Boolean) s2.r.f40506e.f40509c.a(com.google.android.gms.internal.ads.AbstractC3592ma.f33174v6)).booleanValue() == false) goto L159;
     */
    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        String str;
        s2.M m9;
        Bundle bundle;
        InterfaceC4084vh interfaceC4084vh;
        C2513Bn c2513Bn;
        C2892Ye c2892Ye = null;
        r1 = null;
        BinderC3871rk binderC3871rk = null;
        C2876Xe c2876Xe = null;
        if (i == 1) {
            C2908Ze c2908Ze = (C2908Ze) AbstractC3411j8.b(parcel, C2908Ze.CREATOR);
            AbstractC3411j8.f(parcel);
            synchronized (this) {
                R2.w.d("loadAd must be called on the main UI thread.");
                String str2 = c2908Ze.f29689u;
                String str3 = (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.t6);
                if (str3 != null && str2 != null) {
                    try {
                    } catch (RuntimeException e9) {
                        C4906k.f40186C.f40196h.d("NonagonUtil.isPatternMatched", e9);
                    }
                }
                if (U3()) {
                }
                Kt kt = new Kt(23);
                this.f27882w = null;
                Mt mt = this.f27879n;
                mt.f27154h.f30144o.f2062u = 1;
                mt.a(c2908Ze.f29688n, c2908Ze.f29689u, kt, new C4201xq(5, this));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            synchronized (this) {
                p2(null);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 3) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                c2892Ye = queryLocalInterface instanceof C2892Ye ? (C2892Ye) queryLocalInterface : new C2892Ye(readStrongBinder);
            }
            AbstractC3411j8.f(parcel);
            R2.w.d("setRewardedVideoAdListener can only be called from the UI thread.");
            this.f27880u.f26536x.set(c2892Ye);
            parcel2.writeNoException();
            return true;
        }
        if (i == 34) {
            boolean a9 = AbstractC3411j8.a(parcel);
            AbstractC3411j8.f(parcel);
            synchronized (this) {
                R2.w.d("setImmersiveMode must be called on the main UI thread.");
                this.f27883x = a9;
            }
            parcel2.writeNoException();
            return true;
        }
        int i4 = 0;
        switch (i) {
            case 5:
                R2.w.d("isLoaded must be called on the main UI thread.");
                boolean U32 = U3();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3411j8.f31986a;
                parcel2.writeInt(U32 ? 1 : 0);
                return true;
            case 6:
                f0(null);
                parcel2.writeNoException();
                return true;
            case 7:
                t1(null);
                parcel2.writeNoException();
                return true;
            case 8:
                Z1(null);
                parcel2.writeNoException();
                return true;
            case 9:
                Y2.a t02 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                f0(t02);
                parcel2.writeNoException();
                return true;
            case 10:
                Y2.a t03 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                t1(t03);
                parcel2.writeNoException();
                return true;
            case 11:
                Y2.a t04 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                Z1(t04);
                parcel2.writeNoException();
                return true;
            case 12:
                synchronized (this) {
                    C2513Bn c2513Bn2 = this.f27882w;
                    str = c2513Bn2 != null ? c2513Bn2.f25627f.f34470n : null;
                }
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                String readString = parcel.readString();
                AbstractC3411j8.f(parcel);
                synchronized (this) {
                    R2.w.d("setUserId must be called on the main UI thread.");
                    this.f27881v.f29743a = readString;
                }
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    m9 = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    m9 = queryLocalInterface2 instanceof s2.M ? (s2.M) queryLocalInterface2 : new s2.M(readStrongBinder2, "com.google.android.gms.ads.internal.client.IAdMetadataListener", 1);
                }
                AbstractC3411j8.f(parcel);
                R2.w.d("setAdMetadataListener can only be called from the UI thread.");
                Jt jt = this.f27880u;
                if (m9 == null) {
                    jt.f26533u.set(null);
                } else {
                    jt.f26533u.set(new Nt(this, m9));
                }
                parcel2.writeNoException();
                return true;
            case 15:
                R2.w.d("getAdMetadata can only be called from the UI thread.");
                C2513Bn c2513Bn3 = this.f27882w;
                if (c2513Bn3 != null) {
                    C2714Nk c2714Nk = c2513Bn3.f24719q;
                    synchronized (c2714Nk) {
                        bundle = new Bundle(c2714Nk.f27304v);
                    }
                } else {
                    bundle = new Bundle();
                }
                parcel2.writeNoException();
                AbstractC3411j8.d(parcel2, bundle);
                return true;
            case 16:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                    c2876Xe = queryLocalInterface3 instanceof C2876Xe ? (C2876Xe) queryLocalInterface3 : new C2876Xe(readStrongBinder3, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener", 1);
                }
                AbstractC3411j8.f(parcel);
                R2.w.d("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
                this.f27880u.f26538z.set(c2876Xe);
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.readString();
                AbstractC3411j8.f(parcel);
                parcel2.writeNoException();
                return true;
            case 18:
                Y2.a t05 = Y2.b.t0(parcel.readStrongBinder());
                AbstractC3411j8.f(parcel);
                p2(t05);
                parcel2.writeNoException();
                return true;
            case 19:
                String readString2 = parcel.readString();
                AbstractC3411j8.f(parcel);
                synchronized (this) {
                    R2.w.d("#008 Must be called on the main UI thread.: setCustomData");
                    this.f27881v.f29744b = readString2;
                }
                parcel2.writeNoException();
                return true;
            case 20:
                C2513Bn c2513Bn4 = this.f27882w;
                if (c2513Bn4 != null && (interfaceC4084vh = (InterfaceC4084vh) c2513Bn4.f24715m.get()) != null && !interfaceC4084vh.U0()) {
                    i4 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC3411j8.f31986a;
                parcel2.writeInt(i4);
                return true;
            case 21:
                synchronized (this) {
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32802F7)).booleanValue() && (c2513Bn = this.f27882w) != null) {
                        binderC3871rk = c2513Bn.f25627f;
                    }
                }
                parcel2.writeNoException();
                AbstractC3411j8.e(parcel2, binderC3871rk);
                return true;
            default:
                return false;
        }
    }

    public final synchronized boolean U3() {
        C2513Bn c2513Bn = this.f27882w;
        if (c2513Bn != null) {
            if (!c2513Bn.f24720r.f27302u.get()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void Z1(Y2.a aVar) {
        R2.w.d("destroy must be called on the main UI thread.");
        Context context = null;
        this.f27880u.f26533u.set(null);
        if (this.f27882w != null) {
            if (aVar != null) {
                context = (Context) Y2.b.D0(aVar);
            }
            C2578Fk c2578Fk = this.f27882w.f25624c;
            c2578Fk.getClass();
            c2578Fk.M1(new C3216fa(context, false));
        }
    }

    public final synchronized void f0(Y2.a aVar) {
        R2.w.d("pause must be called on the main UI thread.");
        if (this.f27882w != null) {
            Context context = aVar == null ? null : (Context) Y2.b.D0(aVar);
            C2578Fk c2578Fk = this.f27882w.f25624c;
            c2578Fk.getClass();
            c2578Fk.M1(new C3538la(context, 1));
        }
    }

    public final synchronized void p2(Y2.a aVar) {
        try {
            R2.w.d("showAd must be called on the main UI thread.");
            if (this.f27882w != null) {
                Activity activity = null;
                if (aVar != null) {
                    Object D02 = Y2.b.D0(aVar);
                    if (D02 instanceof Activity) {
                        activity = (Activity) D02;
                    }
                }
                this.f27882w.c(activity, this.f27883x);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void t1(Y2.a aVar) {
        R2.w.d("resume must be called on the main UI thread.");
        if (this.f27882w != null) {
            Context context = aVar == null ? null : (Context) Y2.b.D0(aVar);
            C2578Fk c2578Fk = this.f27882w.f25624c;
            c2578Fk.getClass();
            c2578Fk.M1(new C2572Fe(context, 1));
        }
    }
}
