package com.google.android.gms.ads.internal.overlay;

import P2.a;
import V2.b;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.AbstractC3212fg;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.BinderC2949aq;
import com.google.android.gms.internal.ads.C2486Bh;
import com.google.android.gms.internal.ads.C2745Ql;
import com.google.android.gms.internal.ads.C2799To;
import com.google.android.gms.internal.ads.C4074vh;
import com.google.android.gms.internal.ads.C4293zk;
import com.google.android.gms.internal.ads.InterfaceC2524Dl;
import com.google.android.gms.internal.ads.InterfaceC2769Sb;
import com.google.android.gms.internal.ads.InterfaceC2786Tb;
import com.google.android.gms.internal.ads.InterfaceC3101de;
import com.google.android.gms.internal.ads.InterfaceC3858rh;
import f3.C4509h;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p2.f;
import p2.j;
import q2.InterfaceC4877a;
import q2.r;
import s2.C4997e;
import s2.InterfaceC4995c;
import s2.k;
import s2.l;
import u2.C5107a;

/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new C4509h(8);

    /* renamed from: R, reason: collision with root package name */
    public static final AtomicLong f23713R = new AtomicLong(0);

    /* renamed from: S, reason: collision with root package name */
    public static final ConcurrentHashMap f23714S = new ConcurrentHashMap();

    /* renamed from: A, reason: collision with root package name */
    public final String f23715A;

    /* renamed from: B, reason: collision with root package name */
    public final InterfaceC4995c f23716B;

    /* renamed from: C, reason: collision with root package name */
    public final int f23717C;

    /* renamed from: D, reason: collision with root package name */
    public final int f23718D;

    /* renamed from: E, reason: collision with root package name */
    public final String f23719E;

    /* renamed from: F, reason: collision with root package name */
    public final C5107a f23720F;

    /* renamed from: G, reason: collision with root package name */
    public final String f23721G;

    /* renamed from: H, reason: collision with root package name */
    public final f f23722H;

    /* renamed from: I, reason: collision with root package name */
    public final InterfaceC2769Sb f23723I;
    public final String J;

    /* renamed from: K, reason: collision with root package name */
    public final String f23724K;

    /* renamed from: L, reason: collision with root package name */
    public final String f23725L;

    /* renamed from: M, reason: collision with root package name */
    public final C4293zk f23726M;

    /* renamed from: N, reason: collision with root package name */
    public final InterfaceC2524Dl f23727N;

    /* renamed from: O, reason: collision with root package name */
    public final InterfaceC3101de f23728O;

    /* renamed from: P, reason: collision with root package name */
    public final boolean f23729P;

    /* renamed from: Q, reason: collision with root package name */
    public final long f23730Q;

    /* renamed from: n, reason: collision with root package name */
    public final C4997e f23731n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC4877a f23732u;

    /* renamed from: v, reason: collision with root package name */
    public final l f23733v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC3858rh f23734w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC2786Tb f23735x;

    /* renamed from: y, reason: collision with root package name */
    public final String f23736y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f23737z;

    public AdOverlayInfoParcel(C2486Bh c2486Bh, C5107a c5107a, String str, String str2, InterfaceC3101de interfaceC3101de) {
        this.f23731n = null;
        this.f23732u = null;
        this.f23733v = null;
        this.f23734w = c2486Bh;
        this.f23723I = null;
        this.f23735x = null;
        this.f23736y = null;
        this.f23737z = false;
        this.f23715A = null;
        this.f23716B = null;
        this.f23717C = 14;
        this.f23718D = 5;
        this.f23719E = null;
        this.f23720F = c5107a;
        this.f23721G = null;
        this.f23722H = null;
        this.J = str;
        this.f23724K = str2;
        this.f23725L = null;
        this.f23726M = null;
        this.f23727N = null;
        this.f23728O = interfaceC3101de;
        this.f23729P = false;
        this.f23730Q = f23713R.getAndIncrement();
    }

    public static AdOverlayInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e6) {
            if (!((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.te)).booleanValue()) {
                return null;
            }
            j.f39798C.f39808h.d("AdOverlayInfoParcel.getFromIntent", e6);
            return null;
        }
    }

    public static final b b(Object obj) {
        if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.te)).booleanValue()) {
            return null;
        }
        return new b(obj);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int B8 = S0.f.B(parcel, 20293);
        S0.f.t(parcel, 2, this.f23731n, i);
        InterfaceC4877a interfaceC4877a = this.f23732u;
        S0.f.s(parcel, 3, b(interfaceC4877a));
        l lVar = this.f23733v;
        S0.f.s(parcel, 4, b(lVar));
        InterfaceC3858rh interfaceC3858rh = this.f23734w;
        S0.f.s(parcel, 5, b(interfaceC3858rh));
        InterfaceC2786Tb interfaceC2786Tb = this.f23735x;
        S0.f.s(parcel, 6, b(interfaceC2786Tb));
        S0.f.u(parcel, 7, this.f23736y);
        S0.f.A(parcel, 8, 4);
        parcel.writeInt(this.f23737z ? 1 : 0);
        S0.f.u(parcel, 9, this.f23715A);
        InterfaceC4995c interfaceC4995c = this.f23716B;
        S0.f.s(parcel, 10, b(interfaceC4995c));
        S0.f.A(parcel, 11, 4);
        parcel.writeInt(this.f23717C);
        S0.f.A(parcel, 12, 4);
        parcel.writeInt(this.f23718D);
        S0.f.u(parcel, 13, this.f23719E);
        S0.f.t(parcel, 14, this.f23720F, i);
        S0.f.u(parcel, 16, this.f23721G);
        S0.f.t(parcel, 17, this.f23722H, i);
        InterfaceC2769Sb interfaceC2769Sb = this.f23723I;
        S0.f.s(parcel, 18, b(interfaceC2769Sb));
        S0.f.u(parcel, 19, this.J);
        S0.f.u(parcel, 24, this.f23724K);
        S0.f.u(parcel, 25, this.f23725L);
        C4293zk c4293zk = this.f23726M;
        S0.f.s(parcel, 26, b(c4293zk));
        InterfaceC2524Dl interfaceC2524Dl = this.f23727N;
        S0.f.s(parcel, 27, b(interfaceC2524Dl));
        InterfaceC3101de interfaceC3101de = this.f23728O;
        S0.f.s(parcel, 28, b(interfaceC3101de));
        S0.f.A(parcel, 29, 4);
        parcel.writeInt(this.f23729P ? 1 : 0);
        S0.f.A(parcel, 30, 8);
        long j9 = this.f23730Q;
        parcel.writeLong(j9);
        S0.f.C(parcel, B8);
        if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.te)).booleanValue()) {
            f23714S.put(Long.valueOf(j9), new s2.j(interfaceC4877a, lVar, interfaceC3858rh, interfaceC2769Sb, interfaceC2786Tb, interfaceC4995c, c4293zk, interfaceC2524Dl, interfaceC3101de, AbstractC3212fg.f30741d.schedule(new k(j9), ((Integer) r2.f40119c.a(AbstractC3368ia.ve)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(C2745Ql c2745Ql, InterfaceC3858rh interfaceC3858rh, int i, C5107a c5107a, String str, f fVar, String str2, String str3, String str4, C4293zk c4293zk, BinderC2949aq binderC2949aq, String str5) {
        this.f23731n = null;
        this.f23732u = null;
        this.f23733v = c2745Ql;
        this.f23734w = interfaceC3858rh;
        this.f23723I = null;
        this.f23735x = null;
        this.f23737z = false;
        if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.p1)).booleanValue()) {
            this.f23736y = null;
            this.f23715A = null;
        } else {
            this.f23736y = str2;
            this.f23715A = str3;
        }
        this.f23716B = null;
        this.f23717C = i;
        this.f23718D = 1;
        this.f23719E = null;
        this.f23720F = c5107a;
        this.f23721G = str;
        this.f23722H = fVar;
        this.J = str5;
        this.f23724K = null;
        this.f23725L = str4;
        this.f23726M = c4293zk;
        this.f23727N = null;
        this.f23728O = binderC2949aq;
        this.f23729P = false;
        this.f23730Q = f23713R.getAndIncrement();
    }

    public AdOverlayInfoParcel(C2799To c2799To, InterfaceC3858rh interfaceC3858rh, C5107a c5107a) {
        this.f23733v = c2799To;
        this.f23734w = interfaceC3858rh;
        this.f23717C = 1;
        this.f23720F = c5107a;
        this.f23731n = null;
        this.f23732u = null;
        this.f23723I = null;
        this.f23735x = null;
        this.f23736y = null;
        this.f23737z = false;
        this.f23715A = null;
        this.f23716B = null;
        this.f23718D = 1;
        this.f23719E = null;
        this.f23721G = null;
        this.f23722H = null;
        this.J = null;
        this.f23724K = null;
        this.f23725L = null;
        this.f23726M = null;
        this.f23727N = null;
        this.f23728O = null;
        this.f23729P = false;
        this.f23730Q = f23713R.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC4877a interfaceC4877a, C4074vh c4074vh, InterfaceC2769Sb interfaceC2769Sb, InterfaceC2786Tb interfaceC2786Tb, InterfaceC4995c interfaceC4995c, C2486Bh c2486Bh, boolean z8, int i, String str, String str2, C5107a c5107a, InterfaceC2524Dl interfaceC2524Dl, BinderC2949aq binderC2949aq) {
        this.f23731n = null;
        this.f23732u = interfaceC4877a;
        this.f23733v = c4074vh;
        this.f23734w = c2486Bh;
        this.f23723I = interfaceC2769Sb;
        this.f23735x = interfaceC2786Tb;
        this.f23736y = str2;
        this.f23737z = z8;
        this.f23715A = str;
        this.f23716B = interfaceC4995c;
        this.f23717C = i;
        this.f23718D = 3;
        this.f23719E = null;
        this.f23720F = c5107a;
        this.f23721G = null;
        this.f23722H = null;
        this.J = null;
        this.f23724K = null;
        this.f23725L = null;
        this.f23726M = null;
        this.f23727N = interfaceC2524Dl;
        this.f23728O = binderC2949aq;
        this.f23729P = false;
        this.f23730Q = f23713R.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC4877a interfaceC4877a, C4074vh c4074vh, InterfaceC2769Sb interfaceC2769Sb, InterfaceC2786Tb interfaceC2786Tb, InterfaceC4995c interfaceC4995c, C2486Bh c2486Bh, boolean z8, int i, String str, C5107a c5107a, InterfaceC2524Dl interfaceC2524Dl, BinderC2949aq binderC2949aq, boolean z9) {
        this.f23731n = null;
        this.f23732u = interfaceC4877a;
        this.f23733v = c4074vh;
        this.f23734w = c2486Bh;
        this.f23723I = interfaceC2769Sb;
        this.f23735x = interfaceC2786Tb;
        this.f23736y = null;
        this.f23737z = z8;
        this.f23715A = null;
        this.f23716B = interfaceC4995c;
        this.f23717C = i;
        this.f23718D = 3;
        this.f23719E = str;
        this.f23720F = c5107a;
        this.f23721G = null;
        this.f23722H = null;
        this.J = null;
        this.f23724K = null;
        this.f23725L = null;
        this.f23726M = null;
        this.f23727N = interfaceC2524Dl;
        this.f23728O = binderC2949aq;
        this.f23729P = z9;
        this.f23730Q = f23713R.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC4877a interfaceC4877a, l lVar, InterfaceC4995c interfaceC4995c, C2486Bh c2486Bh, boolean z8, int i, C5107a c5107a, InterfaceC2524Dl interfaceC2524Dl, BinderC2949aq binderC2949aq) {
        this.f23731n = null;
        this.f23732u = interfaceC4877a;
        this.f23733v = lVar;
        this.f23734w = c2486Bh;
        this.f23723I = null;
        this.f23735x = null;
        this.f23736y = null;
        this.f23737z = z8;
        this.f23715A = null;
        this.f23716B = interfaceC4995c;
        this.f23717C = i;
        this.f23718D = 2;
        this.f23719E = null;
        this.f23720F = c5107a;
        this.f23721G = null;
        this.f23722H = null;
        this.J = null;
        this.f23724K = null;
        this.f23725L = null;
        this.f23726M = null;
        this.f23727N = interfaceC2524Dl;
        this.f23728O = binderC2949aq;
        this.f23729P = false;
        this.f23730Q = f23713R.getAndIncrement();
    }

    public AdOverlayInfoParcel(C4997e c4997e, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z8, String str2, IBinder iBinder5, int i, int i4, String str3, C5107a c5107a, String str4, f fVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z9, long j9) {
        this.f23731n = c4997e;
        this.f23736y = str;
        this.f23737z = z8;
        this.f23715A = str2;
        this.f23717C = i;
        this.f23718D = i4;
        this.f23719E = str3;
        this.f23720F = c5107a;
        this.f23721G = str4;
        this.f23722H = fVar;
        this.J = str5;
        this.f23724K = str6;
        this.f23725L = str7;
        this.f23729P = z9;
        this.f23730Q = j9;
        if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.te)).booleanValue()) {
            s2.j jVar = (s2.j) f23714S.remove(Long.valueOf(j9));
            if (jVar != null) {
                this.f23732u = jVar.f40476a;
                this.f23733v = jVar.f40477b;
                this.f23734w = jVar.f40478c;
                this.f23723I = jVar.f40479d;
                this.f23735x = jVar.f40480e;
                this.f23726M = jVar.f40482g;
                this.f23727N = jVar.f40483h;
                this.f23728O = jVar.i;
                this.f23716B = jVar.f40481f;
                jVar.f40484j.cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.f23732u = (InterfaceC4877a) b.A0(b.u0(iBinder));
        this.f23733v = (l) b.A0(b.u0(iBinder2));
        this.f23734w = (InterfaceC3858rh) b.A0(b.u0(iBinder3));
        this.f23723I = (InterfaceC2769Sb) b.A0(b.u0(iBinder6));
        this.f23735x = (InterfaceC2786Tb) b.A0(b.u0(iBinder4));
        this.f23716B = (InterfaceC4995c) b.A0(b.u0(iBinder5));
        this.f23726M = (C4293zk) b.A0(b.u0(iBinder7));
        this.f23727N = (InterfaceC2524Dl) b.A0(b.u0(iBinder8));
        this.f23728O = (InterfaceC3101de) b.A0(b.u0(iBinder9));
    }

    public AdOverlayInfoParcel(C4997e c4997e, InterfaceC4877a interfaceC4877a, l lVar, InterfaceC4995c interfaceC4995c, C5107a c5107a, C2486Bh c2486Bh, InterfaceC2524Dl interfaceC2524Dl, String str) {
        this.f23731n = c4997e;
        this.f23732u = interfaceC4877a;
        this.f23733v = lVar;
        this.f23734w = c2486Bh;
        this.f23723I = null;
        this.f23735x = null;
        this.f23736y = null;
        this.f23737z = false;
        this.f23715A = null;
        this.f23716B = interfaceC4995c;
        this.f23717C = -1;
        this.f23718D = 4;
        this.f23719E = null;
        this.f23720F = c5107a;
        this.f23721G = null;
        this.f23722H = null;
        this.J = str;
        this.f23724K = null;
        this.f23725L = null;
        this.f23726M = null;
        this.f23727N = interfaceC2524Dl;
        this.f23728O = null;
        this.f23729P = false;
        this.f23730Q = f23713R.getAndIncrement();
    }
}
