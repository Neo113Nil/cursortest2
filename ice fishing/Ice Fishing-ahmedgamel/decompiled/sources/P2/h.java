package P2;

import Q2.A;
import Q2.C;
import Q2.C0356a;
import Q2.C0359d;
import Q2.K;
import Q2.M;
import Q2.O;
import R2.AbstractC0380f;
import R2.C0381g;
import R2.C0386l;
import R2.w;
import android.content.Context;
import android.os.SystemClock;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import l3.m;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: A, reason: collision with root package name */
    public final C0359d f2386A;

    /* renamed from: n, reason: collision with root package name */
    public final Context f2387n;

    /* renamed from: u, reason: collision with root package name */
    public final String f2388u;

    /* renamed from: v, reason: collision with root package name */
    public final e f2389v;

    /* renamed from: w, reason: collision with root package name */
    public final b f2390w;

    /* renamed from: x, reason: collision with root package name */
    public final C0356a f2391x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2392y;

    /* renamed from: z, reason: collision with root package name */
    public final G3.e f2393z;

    public h(Context context, e eVar, b bVar, g gVar) {
        w.i(context, "Null context is not permitted.");
        w.i(eVar, "Api must not be null.");
        w.i(gVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f2387n = context.getApplicationContext();
        String str = null;
        if (V2.b.g()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f2388u = str;
        this.f2389v = eVar;
        this.f2390w = bVar;
        this.f2391x = new C0356a(eVar, bVar, str);
        C0359d e9 = C0359d.e(this.f2387n);
        this.f2386A = e9;
        this.f2392y = e9.f2548A.getAndIncrement();
        this.f2393z = gVar.f2385a;
        c3.e eVar2 = e9.f2553F;
        eVar2.sendMessage(eVar2.obtainMessage(7, this));
    }

    public final b3.e a() {
        b3.e eVar = new b3.e(13, false);
        Set set = Collections.EMPTY_SET;
        if (((s.c) eVar.f5557u) == null) {
            eVar.f5557u = new s.c(0);
        }
        ((s.c) eVar.f5557u).addAll(set);
        Context context = this.f2387n;
        eVar.f5559w = context.getClass().getName();
        eVar.f5558v = context.getPackageName();
        return eVar;
    }

    public final m b(int i, H3.e eVar) {
        l3.h hVar = new l3.h();
        C0359d c0359d = this.f2386A;
        c0359d.getClass();
        int i4 = eVar.f1246c;
        c3.e eVar2 = c0359d.f2553F;
        m mVar = hVar.f38870a;
        if (i4 != 0) {
            K k9 = null;
            if (c0359d.a()) {
                R2.m mVar2 = (R2.m) C0386l.a().f2836n;
                C0356a c0356a = this.f2391x;
                boolean z6 = true;
                if (mVar2 != null) {
                    if (mVar2.f2838u) {
                        C c9 = (C) c0359d.f2550C.get(c0356a);
                        if (c9 != null) {
                            Object obj = c9.f2490u;
                            if (obj instanceof AbstractC0380f) {
                                AbstractC0380f abstractC0380f = (AbstractC0380f) obj;
                                if (abstractC0380f.f2793T != null && !abstractC0380f.d()) {
                                    C0381g a9 = K.a(c9, abstractC0380f, i4);
                                    if (a9 != null) {
                                        c9.f2487E++;
                                        z6 = a9.f2804v;
                                    }
                                }
                            }
                        }
                        z6 = mVar2.f2839v;
                    }
                    k9 = null;
                }
                k9 = new K(c0359d, i4, c0356a, z6 ? System.currentTimeMillis() : 0L, z6 ? SystemClock.elapsedRealtime() : 0L);
            }
            if (k9 != null) {
                eVar2.getClass();
                mVar.a(new A(0, eVar2), k9);
            }
        }
        eVar2.sendMessage(eVar2.obtainMessage(4, new M(new O(i, eVar, hVar, this.f2393z), c0359d.f2549B.get(), this)));
        return mVar;
    }
}
