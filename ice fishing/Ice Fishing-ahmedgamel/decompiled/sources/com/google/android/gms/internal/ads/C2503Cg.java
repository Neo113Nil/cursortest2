package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p2.C4835j;
import q2.C4900p;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Cg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2503Cg {

    /* renamed from: r, reason: collision with root package name */
    public static final boolean f24183r;

    /* renamed from: a, reason: collision with root package name */
    public final Context f24184a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24185b;

    /* renamed from: c, reason: collision with root package name */
    public final C5110a f24186c;

    /* renamed from: d, reason: collision with root package name */
    public final C3677oa f24187d;

    /* renamed from: e, reason: collision with root package name */
    public final C3785qa f24188e;

    /* renamed from: f, reason: collision with root package name */
    public final D.H f24189f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f24190g;

    /* renamed from: h, reason: collision with root package name */
    public final String[] f24191h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f24192j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f24193k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f24194l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f24195m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC3952tg f24196n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f24197o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f24198p;

    /* renamed from: q, reason: collision with root package name */
    public long f24199q;

    static {
        f24183r = C4900p.f40199g.f40204e.nextInt(100) < ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.ge)).intValue();
    }

    public C2503Cg(Context context, C5110a c5110a, String str, C3785qa c3785qa, C3677oa c3677oa) {
        j4.g gVar = new j4.g();
        gVar.x("min_1", Double.MIN_VALUE, 1.0d);
        gVar.x("1_5", 1.0d, 5.0d);
        gVar.x("5_10", 5.0d, 10.0d);
        gVar.x("10_20", 10.0d, 20.0d);
        gVar.x("20_30", 20.0d, 30.0d);
        gVar.x("30_max", 30.0d, Double.MAX_VALUE);
        this.f24189f = new D.H(gVar);
        this.i = false;
        this.f24192j = false;
        this.f24193k = false;
        this.f24194l = false;
        this.f24199q = -1L;
        this.f24184a = context;
        this.f24186c = c5110a;
        this.f24185b = str;
        this.f24188e = c3785qa;
        this.f24187d = c3677oa;
        String str2 = (String) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32287k0);
        if (str2 == null) {
            this.f24191h = new String[0];
            this.f24190g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.f24191h = new String[length];
        this.f24190g = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f24190g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e9) {
                int i6 = u2.z.f41322b;
                v2.i.g("Unable to parse frame hash target time number.", e9);
                this.f24190g[i] = -1;
            }
        }
    }

    public final void a(AbstractC3952tg abstractC3952tg) {
        C3785qa c3785qa = this.f24188e;
        AbstractC2968bG.j(c3785qa, this.f24187d, "vpc2");
        this.i = true;
        c3785qa.c("vpn", abstractC3952tg.d());
        this.f24196n = abstractC3952tg;
    }

    public final void b() {
        Bundle M8;
        if (!f24183r || this.f24197o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString(com.anythink.core.common.m.b.g.f14526j, this.f24185b);
        bundle.putString("player", this.f24196n.d());
        D.H h9 = this.f24189f;
        h9.getClass();
        String[] strArr = (String[]) h9.f437v;
        ArrayList arrayList = new ArrayList(strArr.length);
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            double d2 = ((double[]) h9.f439x)[i];
            double d9 = ((double[]) h9.f438w)[i];
            int i6 = ((int[]) h9.f440y)[i];
            arrayList.add(new u2.n(str, d2, d9, i6 / h9.f436u, i6));
            i++;
            bundle = bundle;
        }
        Bundle bundle2 = bundle;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u2.n nVar = (u2.n) it.next();
            String str2 = nVar.f41299a;
            bundle2.putString("fps_c_".concat(String.valueOf(str2)), Integer.toString(nVar.f41303e));
            bundle2.putString("fps_p_".concat(String.valueOf(str2)), Double.toString(nVar.f41302d));
        }
        int i9 = 0;
        while (true) {
            long[] jArr = this.f24190g;
            if (i9 >= jArr.length) {
                break;
            }
            String str3 = this.f24191h[i9];
            if (str3 != null) {
                Long valueOf = Long.valueOf(jArr[i9]);
                new StringBuilder(valueOf.toString().length() + 3);
                bundle2.putString("fh_".concat(valueOf.toString()), str3);
            }
            i9++;
        }
        final u2.D d10 = C4835j.f39733C.f39738c;
        String str4 = this.f24186c.f41391n;
        d10.getClass();
        bundle2.putString("device", u2.D.O());
        C3301ha c3301ha = AbstractC3569ma.f32192a;
        q2.r rVar = q2.r.f40207e;
        bundle2.putString("eids", TextUtils.join(",", rVar.f40208a.B()));
        boolean isEmpty = bundle2.isEmpty();
        final Context context = this.f24184a;
        if (isEmpty) {
            int i10 = u2.z.f41322b;
            v2.i.a("Empty or null bundle.");
        } else {
            final String str5 = (String) rVar.f40210c.a(AbstractC3569ma.Vb);
            boolean andSet = d10.f41241d.getAndSet(true);
            AtomicReference atomicReference = d10.f41240c;
            if (!andSet) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: u2.C
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str6) {
                        D.this.f41240c.set(t8.g.M(context, str5));
                    }
                };
                if (TextUtils.isEmpty(str5)) {
                    M8 = Bundle.EMPTY;
                } else {
                    PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    M8 = t8.g.M(context, str5);
                }
                atomicReference.set(M8);
            }
            bundle2.putAll((Bundle) atomicReference.get());
        }
        v2.d dVar = C4900p.f40199g.f40200a;
        v2.d.a(context, str4, bundle2, new m8.i(context, str4));
        this.f24197o = true;
    }

    public final void c(AbstractC3952tg abstractC3952tg) {
        if (this.f24193k && !this.f24194l) {
            if (u2.z.m() && !this.f24194l) {
                u2.z.k("VideoMetricsMixin first frame");
            }
            AbstractC2968bG.j(this.f24188e, this.f24187d, "vff2");
            this.f24194l = true;
        }
        C4835j.f39733C.f39745k.getClass();
        long nanoTime = System.nanoTime();
        if (this.f24195m && this.f24198p && this.f24199q != -1) {
            double nanos = TimeUnit.SECONDS.toNanos(1L) / (nanoTime - this.f24199q);
            D.H h9 = this.f24189f;
            h9.f436u++;
            int i = 0;
            while (true) {
                double[] dArr = (double[]) h9.f439x;
                if (i >= dArr.length) {
                    break;
                }
                double d2 = dArr[i];
                if (d2 <= nanos && nanos < ((double[]) h9.f438w)[i]) {
                    int[] iArr = (int[]) h9.f440y;
                    iArr[i] = iArr[i] + 1;
                }
                if (nanos < d2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f24198p = this.f24195m;
        this.f24199q = nanoTime;
        long longValue = ((Long) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32297l0)).longValue();
        long k9 = abstractC3952tg.k();
        int i6 = 0;
        while (true) {
            String[] strArr = this.f24191h;
            if (i6 >= strArr.length) {
                return;
            }
            if (strArr[i6] == null && longValue > Math.abs(k9 - this.f24190g[i6])) {
                int i9 = 8;
                Bitmap bitmap = abstractC3952tg.getBitmap(8, 8);
                long j6 = 63;
                int i10 = 0;
                long j9 = 0;
                while (i10 < i9) {
                    int i11 = 0;
                    while (i11 < i9) {
                        int pixel = bitmap.getPixel(i11, i10);
                        j9 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j6);
                        j6--;
                        i11++;
                        i9 = 8;
                    }
                    i10++;
                    i9 = 8;
                }
                strArr[i6] = String.format("%016X", Long.valueOf(j9));
                return;
            }
            i6++;
        }
    }

    public final void d() {
        this.f24195m = true;
        if (!this.f24192j || this.f24193k) {
            return;
        }
        AbstractC2968bG.j(this.f24188e, this.f24187d, "vfp2");
        this.f24193k = true;
    }
}
