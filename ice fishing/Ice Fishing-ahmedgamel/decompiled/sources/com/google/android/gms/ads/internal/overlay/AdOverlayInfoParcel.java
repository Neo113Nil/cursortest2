package com.google.android.gms.ads.internal.overlay;

import Q2.a;
import W2.b;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.f;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.BinderC2880Yp;
import com.google.android.gms.internal.ads.C2473Ak;
import com.google.android.gms.internal.ads.C2555Fh;
import com.google.android.gms.internal.ads.C2783So;
import com.google.android.gms.internal.ads.C2796Tl;
import com.google.android.gms.internal.ads.C4223yh;
import com.google.android.gms.internal.ads.InterfaceC2542El;
import com.google.android.gms.internal.ads.InterfaceC2834Wb;
import com.google.android.gms.internal.ads.InterfaceC2850Xb;
import com.google.android.gms.internal.ads.InterfaceC3251ge;
import com.google.android.gms.internal.ads.InterfaceC4061vh;
import h3.C4566c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p2.C4831f;
import p2.C4835j;
import q2.InterfaceC4870a;
import q2.r;
import t2.C5037e;
import t2.InterfaceC5035c;
import t2.j;
import t2.k;
import t2.l;
import v2.C5110a;

/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new C4566c(13);

    /* renamed from: R, reason: collision with root package name */
    public static final AtomicLong f23560R = new AtomicLong(0);

    /* renamed from: S, reason: collision with root package name */
    public static final ConcurrentHashMap f23561S = new ConcurrentHashMap();

    /* renamed from: A, reason: collision with root package name */
    public final String f23562A;

    /* renamed from: B, reason: collision with root package name */
    public final InterfaceC5035c f23563B;

    /* renamed from: C, reason: collision with root package name */
    public final int f23564C;

    /* renamed from: D, reason: collision with root package name */
    public final int f23565D;

    /* renamed from: E, reason: collision with root package name */
    public final String f23566E;

    /* renamed from: F, reason: collision with root package name */
    public final C5110a f23567F;

    /* renamed from: G, reason: collision with root package name */
    public final String f23568G;

    /* renamed from: H, reason: collision with root package name */
    public final C4831f f23569H;

    /* renamed from: I, reason: collision with root package name */
    public final InterfaceC2834Wb f23570I;
    public final String J;

    /* renamed from: K, reason: collision with root package name */
    public final String f23571K;

    /* renamed from: L, reason: collision with root package name */
    public final String f23572L;

    /* renamed from: M, reason: collision with root package name */
    public final C2473Ak f23573M;

    /* renamed from: N, reason: collision with root package name */
    public final InterfaceC2542El f23574N;

    /* renamed from: O, reason: collision with root package name */
    public final InterfaceC3251ge f23575O;

    /* renamed from: P, reason: collision with root package name */
    public final boolean f23576P;

    /* renamed from: Q, reason: collision with root package name */
    public final long f23577Q;

    /* renamed from: n, reason: collision with root package name */
    public final C5037e f23578n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC4870a f23579u;

    /* renamed from: v, reason: collision with root package name */
    public final l f23580v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC4061vh f23581w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC2850Xb f23582x;

    /* renamed from: y, reason: collision with root package name */
    public final String f23583y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f23584z;

    public AdOverlayInfoParcel(C2555Fh c2555Fh, C5110a c5110a, String str, String str2, InterfaceC3251ge interfaceC3251ge) {
        this.f23578n = null;
        this.f23579u = null;
        this.f23580v = null;
        this.f23581w = c2555Fh;
        this.f23570I = null;
        this.f23582x = null;
        this.f23583y = null;
        this.f23584z = false;
        this.f23562A = null;
        this.f23563B = null;
        this.f23564C = 14;
        this.f23565D = 5;
        this.f23566E = null;
        this.f23567F = c5110a;
        this.f23568G = null;
        this.f23569H = null;
        this.J = str;
        this.f23571K = str2;
        this.f23572L = null;
        this.f23573M = null;
        this.f23574N = null;
        this.f23575O = interfaceC3251ge;
        this.f23576P = false;
        this.f23577Q = f23560R.getAndIncrement();
    }

    public static AdOverlayInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) f.g(bundleExtra, "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", AdOverlayInfoParcel.class);
        } catch (Exception e9) {
            if (!((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.ze)).booleanValue()) {
                return null;
            }
            C4835j.f39733C.f39743h.d("AdOverlayInfoParcel.getFromIntent", e9);
            return null;
        }
    }

    public static final b b(Object obj) {
        if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.ze)).booleanValue()) {
            return null;
        }
        return new b(obj);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int G7 = A8.b.G(parcel, 20293);
        A8.b.y(parcel, 2, this.f23578n, i);
        InterfaceC4870a interfaceC4870a = this.f23579u;
        A8.b.x(parcel, 3, b(interfaceC4870a));
        l lVar = this.f23580v;
        A8.b.x(parcel, 4, b(lVar));
        InterfaceC4061vh interfaceC4061vh = this.f23581w;
        A8.b.x(parcel, 5, b(interfaceC4061vh));
        InterfaceC2850Xb interfaceC2850Xb = this.f23582x;
        A8.b.x(parcel, 6, b(interfaceC2850Xb));
        A8.b.z(parcel, 7, this.f23583y);
        A8.b.F(parcel, 8, 4);
        parcel.writeInt(this.f23584z ? 1 : 0);
        A8.b.z(parcel, 9, this.f23562A);
        InterfaceC5035c interfaceC5035c = this.f23563B;
        A8.b.x(parcel, 10, b(interfaceC5035c));
        A8.b.F(parcel, 11, 4);
        parcel.writeInt(this.f23564C);
        A8.b.F(parcel, 12, 4);
        parcel.writeInt(this.f23565D);
        A8.b.z(parcel, 13, this.f23566E);
        A8.b.y(parcel, 14, this.f23567F, i);
        A8.b.z(parcel, 16, this.f23568G);
        A8.b.y(parcel, 17, this.f23569H, i);
        InterfaceC2834Wb interfaceC2834Wb = this.f23570I;
        A8.b.x(parcel, 18, b(interfaceC2834Wb));
        A8.b.z(parcel, 19, this.J);
        A8.b.z(parcel, 24, this.f23571K);
        A8.b.z(parcel, 25, this.f23572L);
        C2473Ak c2473Ak = this.f23573M;
        A8.b.x(parcel, 26, b(c2473Ak));
        InterfaceC2542El interfaceC2542El = this.f23574N;
        A8.b.x(parcel, 27, b(interfaceC2542El));
        InterfaceC3251ge interfaceC3251ge = this.f23575O;
        A8.b.x(parcel, 28, b(interfaceC3251ge));
        A8.b.F(parcel, 29, 4);
        parcel.writeInt(this.f23576P ? 1 : 0);
        A8.b.F(parcel, 30, 8);
        long j6 = this.f23577Q;
        parcel.writeLong(j6);
        A8.b.I(parcel, G7);
        if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.ze)).booleanValue()) {
            f23561S.put(Long.valueOf(j6), new j(interfaceC4870a, lVar, interfaceC4061vh, interfaceC2834Wb, interfaceC2850Xb, interfaceC5035c, c2473Ak, interfaceC2542El, interfaceC3251ge, AbstractC3413jg.f31271d.schedule(new k(j6), ((Integer) r2.f40210c.a(AbstractC3569ma.Be)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(C2796Tl c2796Tl, InterfaceC4061vh interfaceC4061vh, int i, C5110a c5110a, String str, C4831f c4831f, String str2, String str3, String str4, C2473Ak c2473Ak, BinderC2880Yp binderC2880Yp, String str5) {
        this.f23578n = null;
        this.f23579u = null;
        this.f23580v = c2796Tl;
        this.f23581w = interfaceC4061vh;
        this.f23570I = null;
        this.f23582x = null;
        this.f23584z = false;
        if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.p1)).booleanValue()) {
            this.f23583y = null;
            this.f23562A = null;
        } else {
            this.f23583y = str2;
            this.f23562A = str3;
        }
        this.f23563B = null;
        this.f23564C = i;
        this.f23565D = 1;
        this.f23566E = null;
        this.f23567F = c5110a;
        this.f23568G = str;
        this.f23569H = c4831f;
        this.J = str5;
        this.f23571K = null;
        this.f23572L = str4;
        this.f23573M = c2473Ak;
        this.f23574N = null;
        this.f23575O = binderC2880Yp;
        this.f23576P = false;
        this.f23577Q = f23560R.getAndIncrement();
    }

    public AdOverlayInfoParcel(C2783So c2783So, InterfaceC4061vh interfaceC4061vh, C5110a c5110a) {
        this.f23580v = c2783So;
        this.f23581w = interfaceC4061vh;
        this.f23564C = 1;
        this.f23567F = c5110a;
        this.f23578n = null;
        this.f23579u = null;
        this.f23570I = null;
        this.f23582x = null;
        this.f23583y = null;
        this.f23584z = false;
        this.f23562A = null;
        this.f23563B = null;
        this.f23565D = 1;
        this.f23566E = null;
        this.f23568G = null;
        this.f23569H = null;
        this.J = null;
        this.f23571K = null;
        this.f23572L = null;
        this.f23573M = null;
        this.f23574N = null;
        this.f23575O = null;
        this.f23576P = false;
        this.f23577Q = f23560R.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC4870a interfaceC4870a, C4223yh c4223yh, InterfaceC2834Wb interfaceC2834Wb, InterfaceC2850Xb interfaceC2850Xb, InterfaceC5035c interfaceC5035c, C2555Fh c2555Fh, boolean z3, int i, String str, String str2, C5110a c5110a, InterfaceC2542El interfaceC2542El, BinderC2880Yp binderC2880Yp) {
        this.f23578n = null;
        this.f23579u = interfaceC4870a;
        this.f23580v = c4223yh;
        this.f23581w = c2555Fh;
        this.f23570I = interfaceC2834Wb;
        this.f23582x = interfaceC2850Xb;
        this.f23583y = str2;
        this.f23584z = z3;
        this.f23562A = str;
        this.f23563B = interfaceC5035c;
        this.f23564C = i;
        this.f23565D = 3;
        this.f23566E = null;
        this.f23567F = c5110a;
        this.f23568G = null;
        this.f23569H = null;
        this.J = null;
        this.f23571K = null;
        this.f23572L = null;
        this.f23573M = null;
        this.f23574N = interfaceC2542El;
        this.f23575O = binderC2880Yp;
        this.f23576P = false;
        this.f23577Q = f23560R.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC4870a interfaceC4870a, C4223yh c4223yh, InterfaceC2834Wb interfaceC2834Wb, InterfaceC2850Xb interfaceC2850Xb, InterfaceC5035c interfaceC5035c, C2555Fh c2555Fh, boolean z3, int i, String str, C5110a c5110a, InterfaceC2542El interfaceC2542El, BinderC2880Yp binderC2880Yp, boolean z6) {
        this.f23578n = null;
        this.f23579u = interfaceC4870a;
        this.f23580v = c4223yh;
        this.f23581w = c2555Fh;
        this.f23570I = interfaceC2834Wb;
        this.f23582x = interfaceC2850Xb;
        this.f23583y = null;
        this.f23584z = z3;
        this.f23562A = null;
        this.f23563B = interfaceC5035c;
        this.f23564C = i;
        this.f23565D = 3;
        this.f23566E = str;
        this.f23567F = c5110a;
        this.f23568G = null;
        this.f23569H = null;
        this.J = null;
        this.f23571K = null;
        this.f23572L = null;
        this.f23573M = null;
        this.f23574N = interfaceC2542El;
        this.f23575O = binderC2880Yp;
        this.f23576P = z6;
        this.f23577Q = f23560R.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC4870a interfaceC4870a, l lVar, InterfaceC5035c interfaceC5035c, C2555Fh c2555Fh, boolean z3, int i, C5110a c5110a, InterfaceC2542El interfaceC2542El, BinderC2880Yp binderC2880Yp) {
        this.f23578n = null;
        this.f23579u = interfaceC4870a;
        this.f23580v = lVar;
        this.f23581w = c2555Fh;
        this.f23570I = null;
        this.f23582x = null;
        this.f23583y = null;
        this.f23584z = z3;
        this.f23562A = null;
        this.f23563B = interfaceC5035c;
        this.f23564C = i;
        this.f23565D = 2;
        this.f23566E = null;
        this.f23567F = c5110a;
        this.f23568G = null;
        this.f23569H = null;
        this.J = null;
        this.f23571K = null;
        this.f23572L = null;
        this.f23573M = null;
        this.f23574N = interfaceC2542El;
        this.f23575O = binderC2880Yp;
        this.f23576P = false;
        this.f23577Q = f23560R.getAndIncrement();
    }

    public AdOverlayInfoParcel(C5037e c5037e, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z3, String str2, IBinder iBinder5, int i, int i6, String str3, C5110a c5110a, String str4, C4831f c4831f, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z6, long j6) {
        this.f23578n = c5037e;
        this.f23583y = str;
        this.f23584z = z3;
        this.f23562A = str2;
        this.f23564C = i;
        this.f23565D = i6;
        this.f23566E = str3;
        this.f23567F = c5110a;
        this.f23568G = str4;
        this.f23569H = c4831f;
        this.J = str5;
        this.f23571K = str6;
        this.f23572L = str7;
        this.f23576P = z6;
        this.f23577Q = j6;
        if (((Boolean) r.f40207e.f40210c.a(AbstractC3569ma.ze)).booleanValue()) {
            j jVar = (j) f23561S.remove(Long.valueOf(j6));
            if (jVar != null) {
                this.f23579u = jVar.f40847a;
                this.f23580v = jVar.f40848b;
                this.f23581w = jVar.f40849c;
                this.f23570I = jVar.f40850d;
                this.f23582x = jVar.f40851e;
                this.f23573M = jVar.f40853g;
                this.f23574N = jVar.f40854h;
                this.f23575O = jVar.i;
                this.f23563B = jVar.f40852f;
                jVar.f40855j.cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.f23579u = (InterfaceC4870a) b.F0(b.w0(iBinder));
        this.f23580v = (l) b.F0(b.w0(iBinder2));
        this.f23581w = (InterfaceC4061vh) b.F0(b.w0(iBinder3));
        this.f23570I = (InterfaceC2834Wb) b.F0(b.w0(iBinder6));
        this.f23582x = (InterfaceC2850Xb) b.F0(b.w0(iBinder4));
        this.f23563B = (InterfaceC5035c) b.F0(b.w0(iBinder5));
        this.f23573M = (C2473Ak) b.F0(b.w0(iBinder7));
        this.f23574N = (InterfaceC2542El) b.F0(b.w0(iBinder8));
        this.f23575O = (InterfaceC3251ge) b.F0(b.w0(iBinder9));
    }

    public AdOverlayInfoParcel(C5037e c5037e, InterfaceC4870a interfaceC4870a, l lVar, InterfaceC5035c interfaceC5035c, C5110a c5110a, C2555Fh c2555Fh, InterfaceC2542El interfaceC2542El, String str) {
        this.f23578n = c5037e;
        this.f23579u = interfaceC4870a;
        this.f23580v = lVar;
        this.f23581w = c2555Fh;
        this.f23570I = null;
        this.f23582x = null;
        this.f23583y = null;
        this.f23584z = false;
        this.f23562A = null;
        this.f23563B = interfaceC5035c;
        this.f23564C = -1;
        this.f23565D = 4;
        this.f23566E = null;
        this.f23567F = c5110a;
        this.f23568G = null;
        this.f23569H = null;
        this.J = str;
        this.f23571K = null;
        this.f23572L = null;
        this.f23573M = null;
        this.f23574N = interfaceC2542El;
        this.f23575O = null;
        this.f23576P = false;
        this.f23577Q = f23560R.getAndIncrement();
    }
}
