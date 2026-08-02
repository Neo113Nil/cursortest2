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
import r2.C4906k;
import s2.C4949p;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Cg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2523Cg {

    /* renamed from: r, reason: collision with root package name */
    public static final boolean f24918r;

    /* renamed from: a, reason: collision with root package name */
    public final Context f24919a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24920b;

    /* renamed from: c, reason: collision with root package name */
    public final C5189a f24921c;

    /* renamed from: d, reason: collision with root package name */
    public final C3700oa f24922d;

    /* renamed from: e, reason: collision with root package name */
    public final C3808qa f24923e;

    /* renamed from: f, reason: collision with root package name */
    public final D.G f24924f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f24925g;

    /* renamed from: h, reason: collision with root package name */
    public final String[] f24926h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f24927j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f24928k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f24929l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f24930m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC3975tg f24931n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f24932o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f24933p;

    /* renamed from: q, reason: collision with root package name */
    public long f24934q;

    static {
        f24918r = C4949p.f40498g.f40503e.nextInt(100) < ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.ge)).intValue();
    }

    public C2523Cg(Context context, C5189a c5189a, String str, C3808qa c3808qa, C3700oa c3700oa) {
        l4.g gVar = new l4.g();
        gVar.x("min_1", Double.MIN_VALUE, 1.0d);
        gVar.x("1_5", 1.0d, 5.0d);
        gVar.x("5_10", 5.0d, 10.0d);
        gVar.x("10_20", 10.0d, 20.0d);
        gVar.x("20_30", 20.0d, 30.0d);
        gVar.x("30_max", 30.0d, Double.MAX_VALUE);
        this.f24924f = new D.G(gVar);
        this.i = false;
        this.f24927j = false;
        this.f24928k = false;
        this.f24929l = false;
        this.f24934q = -1L;
        this.f24919a = context;
        this.f24921c = c5189a;
        this.f24920b = str;
        this.f24923e = c3808qa;
        this.f24922d = c3700oa;
        String str2 = (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33066k0);
        if (str2 == null) {
            this.f24926h = new String[0];
            this.f24925g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.f24926h = new String[length];
        this.f24925g = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f24925g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e9) {
                int i4 = w2.z.f41712b;
                x2.i.g("Unable to parse frame hash target time number.", e9);
                this.f24925g[i] = -1;
            }
        }
    }

    public final void a(AbstractC3975tg abstractC3975tg) {
        C3808qa c3808qa = this.f24923e;
        AbstractC2991bG.j(c3808qa, this.f24922d, "vpc2");
        this.i = true;
        c3808qa.c("vpn", abstractC3975tg.d());
        this.f24931n = abstractC3975tg;
    }

    public final void b() {
        Bundle m9;
        if (!f24918r || this.f24932o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString(com.anythink.core.common.m.b.g.f15312j, this.f24920b);
        bundle.putString("player", this.f24931n.d());
        D.G g9 = this.f24924f;
        g9.getClass();
        String[] strArr = (String[]) g9.f334v;
        ArrayList arrayList = new ArrayList(strArr.length);
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            double d9 = ((double[]) g9.f336x)[i];
            double d10 = ((double[]) g9.f335w)[i];
            int i4 = ((int[]) g9.f337y)[i];
            arrayList.add(new w2.n(str, d9, d10, i4 / g9.f333u, i4));
            i++;
            bundle = bundle;
        }
        Bundle bundle2 = bundle;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w2.n nVar = (w2.n) it.next();
            String str2 = nVar.f41689a;
            bundle2.putString("fps_c_".concat(String.valueOf(str2)), Integer.toString(nVar.f41693e));
            bundle2.putString("fps_p_".concat(String.valueOf(str2)), Double.toString(nVar.f41692d));
        }
        int i6 = 0;
        while (true) {
            long[] jArr = this.f24925g;
            if (i6 >= jArr.length) {
                break;
            }
            String str3 = this.f24926h[i6];
            if (str3 != null) {
                Long valueOf = Long.valueOf(jArr[i6]);
                new StringBuilder(valueOf.toString().length() + 3);
                bundle2.putString("fh_".concat(valueOf.toString()), str3);
            }
            i6++;
        }
        final w2.D d11 = C4906k.f40186C.f40191c;
        String str4 = this.f24921c.f41845n;
        d11.getClass();
        bundle2.putString("device", w2.D.O());
        C3324ha c3324ha = AbstractC3592ma.f32971a;
        s2.r rVar = s2.r.f40506e;
        bundle2.putString("eids", TextUtils.join(",", rVar.f40507a.A()));
        boolean isEmpty = bundle2.isEmpty();
        final Context context = this.f24919a;
        if (isEmpty) {
            int i9 = w2.z.f41712b;
            x2.i.a("Empty or null bundle.");
        } else {
            final String str5 = (String) rVar.f40509c.a(AbstractC3592ma.Vb);
            boolean andSet = d11.f41631d.getAndSet(true);
            AtomicReference atomicReference = d11.f41630c;
            if (!andSet) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: w2.C
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str6) {
                        D.this.f41630c.set(com.bumptech.glide.h.m(context, str5));
                    }
                };
                if (TextUtils.isEmpty(str5)) {
                    m9 = Bundle.EMPTY;
                } else {
                    PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    m9 = com.bumptech.glide.h.m(context, str5);
                }
                atomicReference.set(m9);
            }
            bundle2.putAll((Bundle) atomicReference.get());
        }
        x2.d dVar = C4949p.f40498g.f40499a;
        x2.d.a(context, str4, bundle2, new WP(context, str4));
        this.f24932o = true;
    }

    public final void c(AbstractC3975tg abstractC3975tg) {
        if (this.f24928k && !this.f24929l) {
            if (w2.z.m() && !this.f24929l) {
                w2.z.k("VideoMetricsMixin first frame");
            }
            AbstractC2991bG.j(this.f24923e, this.f24922d, "vff2");
            this.f24929l = true;
        }
        C4906k.f40186C.f40198k.getClass();
        long nanoTime = System.nanoTime();
        if (this.f24930m && this.f24933p && this.f24934q != -1) {
            double nanos = TimeUnit.SECONDS.toNanos(1L) / (nanoTime - this.f24934q);
            D.G g9 = this.f24924f;
            g9.f333u++;
            int i = 0;
            while (true) {
                double[] dArr = (double[]) g9.f336x;
                if (i >= dArr.length) {
                    break;
                }
                double d9 = dArr[i];
                if (d9 <= nanos && nanos < ((double[]) g9.f335w)[i]) {
                    int[] iArr = (int[]) g9.f337y;
                    iArr[i] = iArr[i] + 1;
                }
                if (nanos < d9) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f24933p = this.f24930m;
        this.f24934q = nanoTime;
        long longValue = ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33076l0)).longValue();
        long k9 = abstractC3975tg.k();
        int i4 = 0;
        while (true) {
            String[] strArr = this.f24926h;
            if (i4 >= strArr.length) {
                return;
            }
            if (strArr[i4] == null && longValue > Math.abs(k9 - this.f24925g[i4])) {
                int i6 = 8;
                Bitmap bitmap = abstractC3975tg.getBitmap(8, 8);
                long j6 = 63;
                int i9 = 0;
                long j9 = 0;
                while (i9 < i6) {
                    int i10 = 0;
                    while (i10 < i6) {
                        int pixel = bitmap.getPixel(i10, i9);
                        j9 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j6);
                        j6--;
                        i10++;
                        i6 = 8;
                    }
                    i9++;
                    i6 = 8;
                }
                strArr[i4] = String.format("%016X", Long.valueOf(j9));
                return;
            }
            i4++;
        }
    }

    public final void d() {
        this.f24930m = true;
        if (!this.f24927j || this.f24928k) {
            return;
        }
        AbstractC2991bG.j(this.f24923e, this.f24922d, "vfp2");
        this.f24928k = true;
    }
}
