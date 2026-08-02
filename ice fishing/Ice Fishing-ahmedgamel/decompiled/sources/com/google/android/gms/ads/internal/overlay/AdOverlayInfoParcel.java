package com.google.android.gms.ads.internal.overlay;

import S2.a;
import Y2.b;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.e;
import com.bumptech.glide.g;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.BinderC2903Yp;
import com.google.android.gms.internal.ads.C2493Ak;
import com.google.android.gms.internal.ads.C2575Fh;
import com.google.android.gms.internal.ads.C2820To;
import com.google.android.gms.internal.ads.C2834Ul;
import com.google.android.gms.internal.ads.C4246yh;
import com.google.android.gms.internal.ads.InterfaceC2579Fl;
import com.google.android.gms.internal.ads.InterfaceC2857Wb;
import com.google.android.gms.internal.ads.InterfaceC2873Xb;
import com.google.android.gms.internal.ads.InterfaceC3274ge;
import com.google.android.gms.internal.ads.InterfaceC4084vh;
import j3.C4614c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import r2.C4902g;
import r2.C4906k;
import s2.InterfaceC4919a;
import s2.r;
import v2.C5101e;
import v2.InterfaceC5099c;
import v2.j;
import v2.k;
import v2.l;
import x2.C5189a;

/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new C4614c(13);

    /* renamed from: R, reason: collision with root package name */
    public static final AtomicLong f24340R = new AtomicLong(0);

    /* renamed from: S, reason: collision with root package name */
    public static final ConcurrentHashMap f24341S = new ConcurrentHashMap();

    /* renamed from: A, reason: collision with root package name */
    public final String f24342A;

    /* renamed from: B, reason: collision with root package name */
    public final InterfaceC5099c f24343B;

    /* renamed from: C, reason: collision with root package name */
    public final int f24344C;

    /* renamed from: D, reason: collision with root package name */
    public final int f24345D;

    /* renamed from: E, reason: collision with root package name */
    public final String f24346E;

    /* renamed from: F, reason: collision with root package name */
    public final C5189a f24347F;

    /* renamed from: G, reason: collision with root package name */
    public final String f24348G;

    /* renamed from: H, reason: collision with root package name */
    public final C4902g f24349H;

    /* renamed from: I, reason: collision with root package name */
    public final InterfaceC2857Wb f24350I;
    public final String J;

    /* renamed from: K, reason: collision with root package name */
    public final String f24351K;

    /* renamed from: L, reason: collision with root package name */
    public final String f24352L;

    /* renamed from: M, reason: collision with root package name */
    public final C2493Ak f24353M;

    /* renamed from: N, reason: collision with root package name */
    public final InterfaceC2579Fl f24354N;

    /* renamed from: O, reason: collision with root package name */
    public final InterfaceC3274ge f24355O;

    /* renamed from: P, reason: collision with root package name */
    public final boolean f24356P;

    /* renamed from: Q, reason: collision with root package name */
    public final long f24357Q;

    /* renamed from: n, reason: collision with root package name */
    public final C5101e f24358n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC4919a f24359u;

    /* renamed from: v, reason: collision with root package name */
    public final l f24360v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC4084vh f24361w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC2873Xb f24362x;

    /* renamed from: y, reason: collision with root package name */
    public final String f24363y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f24364z;

    public AdOverlayInfoParcel(C2575Fh c2575Fh, C5189a c5189a, String str, String str2, InterfaceC3274ge interfaceC3274ge) {
        this.f24358n = null;
        this.f24359u = null;
        this.f24360v = null;
        this.f24361w = c2575Fh;
        this.f24350I = null;
        this.f24362x = null;
        this.f24363y = null;
        this.f24364z = false;
        this.f24342A = null;
        this.f24343B = null;
        this.f24344C = 14;
        this.f24345D = 5;
        this.f24346E = null;
        this.f24347F = c5189a;
        this.f24348G = null;
        this.f24349H = null;
        this.J = str;
        this.f24351K = str2;
        this.f24352L = null;
        this.f24353M = null;
        this.f24354N = null;
        this.f24355O = interfaceC3274ge;
        this.f24356P = false;
        this.f24357Q = f24340R.getAndIncrement();
    }

    public static AdOverlayInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) g.o(bundleExtra, "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", AdOverlayInfoParcel.class);
        } catch (Exception e9) {
            if (!((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.ze)).booleanValue()) {
                return null;
            }
            C4906k.f40186C.f40196h.d("AdOverlayInfoParcel.getFromIntent", e9);
            return null;
        }
    }

    public static final b b(Object obj) {
        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.ze)).booleanValue()) {
            return null;
        }
        return new b(obj);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int x9 = e.x(parcel, 20293);
        e.q(parcel, 2, this.f24358n, i);
        InterfaceC4919a interfaceC4919a = this.f24359u;
        e.p(parcel, 3, b(interfaceC4919a));
        l lVar = this.f24360v;
        e.p(parcel, 4, b(lVar));
        InterfaceC4084vh interfaceC4084vh = this.f24361w;
        e.p(parcel, 5, b(interfaceC4084vh));
        InterfaceC2873Xb interfaceC2873Xb = this.f24362x;
        e.p(parcel, 6, b(interfaceC2873Xb));
        e.r(parcel, 7, this.f24363y);
        e.w(parcel, 8, 4);
        parcel.writeInt(this.f24364z ? 1 : 0);
        e.r(parcel, 9, this.f24342A);
        InterfaceC5099c interfaceC5099c = this.f24343B;
        e.p(parcel, 10, b(interfaceC5099c));
        e.w(parcel, 11, 4);
        parcel.writeInt(this.f24344C);
        e.w(parcel, 12, 4);
        parcel.writeInt(this.f24345D);
        e.r(parcel, 13, this.f24346E);
        e.q(parcel, 14, this.f24347F, i);
        e.r(parcel, 16, this.f24348G);
        e.q(parcel, 17, this.f24349H, i);
        InterfaceC2857Wb interfaceC2857Wb = this.f24350I;
        e.p(parcel, 18, b(interfaceC2857Wb));
        e.r(parcel, 19, this.J);
        e.r(parcel, 24, this.f24351K);
        e.r(parcel, 25, this.f24352L);
        C2493Ak c2493Ak = this.f24353M;
        e.p(parcel, 26, b(c2493Ak));
        InterfaceC2579Fl interfaceC2579Fl = this.f24354N;
        e.p(parcel, 27, b(interfaceC2579Fl));
        InterfaceC3274ge interfaceC3274ge = this.f24355O;
        e.p(parcel, 28, b(interfaceC3274ge));
        e.w(parcel, 29, 4);
        parcel.writeInt(this.f24356P ? 1 : 0);
        e.w(parcel, 30, 8);
        long j6 = this.f24357Q;
        parcel.writeLong(j6);
        e.z(parcel, x9);
        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.ze)).booleanValue()) {
            f24341S.put(Long.valueOf(j6), new j(interfaceC4919a, lVar, interfaceC4084vh, interfaceC2857Wb, interfaceC2873Xb, interfaceC5099c, c2493Ak, interfaceC2579Fl, interfaceC3274ge, AbstractC3436jg.f32058d.schedule(new k(j6), ((Integer) r2.f40509c.a(AbstractC3592ma.Be)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(C2834Ul c2834Ul, InterfaceC4084vh interfaceC4084vh, int i, C5189a c5189a, String str, C4902g c4902g, String str2, String str3, String str4, C2493Ak c2493Ak, BinderC2903Yp binderC2903Yp, String str5) {
        this.f24358n = null;
        this.f24359u = null;
        this.f24360v = c2834Ul;
        this.f24361w = interfaceC4084vh;
        this.f24350I = null;
        this.f24362x = null;
        this.f24364z = false;
        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.p1)).booleanValue()) {
            this.f24363y = null;
            this.f24342A = null;
        } else {
            this.f24363y = str2;
            this.f24342A = str3;
        }
        this.f24343B = null;
        this.f24344C = i;
        this.f24345D = 1;
        this.f24346E = null;
        this.f24347F = c5189a;
        this.f24348G = str;
        this.f24349H = c4902g;
        this.J = str5;
        this.f24351K = null;
        this.f24352L = str4;
        this.f24353M = c2493Ak;
        this.f24354N = null;
        this.f24355O = binderC2903Yp;
        this.f24356P = false;
        this.f24357Q = f24340R.getAndIncrement();
    }

    public AdOverlayInfoParcel(C2820To c2820To, InterfaceC4084vh interfaceC4084vh, C5189a c5189a) {
        this.f24360v = c2820To;
        this.f24361w = interfaceC4084vh;
        this.f24344C = 1;
        this.f24347F = c5189a;
        this.f24358n = null;
        this.f24359u = null;
        this.f24350I = null;
        this.f24362x = null;
        this.f24363y = null;
        this.f24364z = false;
        this.f24342A = null;
        this.f24343B = null;
        this.f24345D = 1;
        this.f24346E = null;
        this.f24348G = null;
        this.f24349H = null;
        this.J = null;
        this.f24351K = null;
        this.f24352L = null;
        this.f24353M = null;
        this.f24354N = null;
        this.f24355O = null;
        this.f24356P = false;
        this.f24357Q = f24340R.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC4919a interfaceC4919a, C4246yh c4246yh, InterfaceC2857Wb interfaceC2857Wb, InterfaceC2873Xb interfaceC2873Xb, InterfaceC5099c interfaceC5099c, C2575Fh c2575Fh, boolean z6, int i, String str, String str2, C5189a c5189a, InterfaceC2579Fl interfaceC2579Fl, BinderC2903Yp binderC2903Yp) {
        this.f24358n = null;
        this.f24359u = interfaceC4919a;
        this.f24360v = c4246yh;
        this.f24361w = c2575Fh;
        this.f24350I = interfaceC2857Wb;
        this.f24362x = interfaceC2873Xb;
        this.f24363y = str2;
        this.f24364z = z6;
        this.f24342A = str;
        this.f24343B = interfaceC5099c;
        this.f24344C = i;
        this.f24345D = 3;
        this.f24346E = null;
        this.f24347F = c5189a;
        this.f24348G = null;
        this.f24349H = null;
        this.J = null;
        this.f24351K = null;
        this.f24352L = null;
        this.f24353M = null;
        this.f24354N = interfaceC2579Fl;
        this.f24355O = binderC2903Yp;
        this.f24356P = false;
        this.f24357Q = f24340R.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC4919a interfaceC4919a, C4246yh c4246yh, InterfaceC2857Wb interfaceC2857Wb, InterfaceC2873Xb interfaceC2873Xb, InterfaceC5099c interfaceC5099c, C2575Fh c2575Fh, boolean z6, int i, String str, C5189a c5189a, InterfaceC2579Fl interfaceC2579Fl, BinderC2903Yp binderC2903Yp, boolean z9) {
        this.f24358n = null;
        this.f24359u = interfaceC4919a;
        this.f24360v = c4246yh;
        this.f24361w = c2575Fh;
        this.f24350I = interfaceC2857Wb;
        this.f24362x = interfaceC2873Xb;
        this.f24363y = null;
        this.f24364z = z6;
        this.f24342A = null;
        this.f24343B = interfaceC5099c;
        this.f24344C = i;
        this.f24345D = 3;
        this.f24346E = str;
        this.f24347F = c5189a;
        this.f24348G = null;
        this.f24349H = null;
        this.J = null;
        this.f24351K = null;
        this.f24352L = null;
        this.f24353M = null;
        this.f24354N = interfaceC2579Fl;
        this.f24355O = binderC2903Yp;
        this.f24356P = z9;
        this.f24357Q = f24340R.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC4919a interfaceC4919a, l lVar, InterfaceC5099c interfaceC5099c, C2575Fh c2575Fh, boolean z6, int i, C5189a c5189a, InterfaceC2579Fl interfaceC2579Fl, BinderC2903Yp binderC2903Yp) {
        this.f24358n = null;
        this.f24359u = interfaceC4919a;
        this.f24360v = lVar;
        this.f24361w = c2575Fh;
        this.f24350I = null;
        this.f24362x = null;
        this.f24363y = null;
        this.f24364z = z6;
        this.f24342A = null;
        this.f24343B = interfaceC5099c;
        this.f24344C = i;
        this.f24345D = 2;
        this.f24346E = null;
        this.f24347F = c5189a;
        this.f24348G = null;
        this.f24349H = null;
        this.J = null;
        this.f24351K = null;
        this.f24352L = null;
        this.f24353M = null;
        this.f24354N = interfaceC2579Fl;
        this.f24355O = binderC2903Yp;
        this.f24356P = false;
        this.f24357Q = f24340R.getAndIncrement();
    }

    public AdOverlayInfoParcel(C5101e c5101e, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z6, String str2, IBinder iBinder5, int i, int i4, String str3, C5189a c5189a, String str4, C4902g c4902g, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z9, long j6) {
        this.f24358n = c5101e;
        this.f24363y = str;
        this.f24364z = z6;
        this.f24342A = str2;
        this.f24344C = i;
        this.f24345D = i4;
        this.f24346E = str3;
        this.f24347F = c5189a;
        this.f24348G = str4;
        this.f24349H = c4902g;
        this.J = str5;
        this.f24351K = str6;
        this.f24352L = str7;
        this.f24356P = z9;
        this.f24357Q = j6;
        if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.ze)).booleanValue()) {
            j jVar = (j) f24341S.remove(Long.valueOf(j6));
            if (jVar != null) {
                this.f24359u = jVar.f41135a;
                this.f24360v = jVar.f41136b;
                this.f24361w = jVar.f41137c;
                this.f24350I = jVar.f41138d;
                this.f24362x = jVar.f41139e;
                this.f24353M = jVar.f41141g;
                this.f24354N = jVar.f41142h;
                this.f24355O = jVar.i;
                this.f24343B = jVar.f41140f;
                jVar.f41143j.cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.f24359u = (InterfaceC4919a) b.D0(b.t0(iBinder));
        this.f24360v = (l) b.D0(b.t0(iBinder2));
        this.f24361w = (InterfaceC4084vh) b.D0(b.t0(iBinder3));
        this.f24350I = (InterfaceC2857Wb) b.D0(b.t0(iBinder6));
        this.f24362x = (InterfaceC2873Xb) b.D0(b.t0(iBinder4));
        this.f24343B = (InterfaceC5099c) b.D0(b.t0(iBinder5));
        this.f24353M = (C2493Ak) b.D0(b.t0(iBinder7));
        this.f24354N = (InterfaceC2579Fl) b.D0(b.t0(iBinder8));
        this.f24355O = (InterfaceC3274ge) b.D0(b.t0(iBinder9));
    }

    public AdOverlayInfoParcel(C5101e c5101e, InterfaceC4919a interfaceC4919a, l lVar, InterfaceC5099c interfaceC5099c, C5189a c5189a, C2575Fh c2575Fh, InterfaceC2579Fl interfaceC2579Fl, String str) {
        this.f24358n = c5101e;
        this.f24359u = interfaceC4919a;
        this.f24360v = lVar;
        this.f24361w = c2575Fh;
        this.f24350I = null;
        this.f24362x = null;
        this.f24363y = null;
        this.f24364z = false;
        this.f24342A = null;
        this.f24343B = interfaceC5099c;
        this.f24344C = -1;
        this.f24345D = 4;
        this.f24346E = null;
        this.f24347F = c5189a;
        this.f24348G = null;
        this.f24349H = null;
        this.J = str;
        this.f24351K = null;
        this.f24352L = null;
        this.f24353M = null;
        this.f24354N = interfaceC2579Fl;
        this.f24355O = null;
        this.f24356P = false;
        this.f24357Q = f24340R.getAndIncrement();
    }
}
