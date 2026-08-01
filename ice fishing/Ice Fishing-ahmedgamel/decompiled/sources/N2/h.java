package N2;

import O2.B;
import O2.C0351a;
import O2.C0354d;
import O2.D;
import O2.L;
import O2.N;
import O2.P;
import P2.AbstractC0376f;
import P2.C0377g;
import P2.C0382l;
import P2.w;
import android.content.Context;
import android.os.SystemClock;
import j3.m;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: A, reason: collision with root package name */
    public final C0354d f1942A;

    /* renamed from: n, reason: collision with root package name */
    public final Context f1943n;

    /* renamed from: u, reason: collision with root package name */
    public final String f1944u;

    /* renamed from: v, reason: collision with root package name */
    public final e f1945v;

    /* renamed from: w, reason: collision with root package name */
    public final b f1946w;

    /* renamed from: x, reason: collision with root package name */
    public final C0351a f1947x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1948y;

    /* renamed from: z, reason: collision with root package name */
    public final a4.e f1949z;

    public h(Context context, e eVar, b bVar, g gVar) {
        w.i(context, "Null context is not permitted.");
        w.i(eVar, "Api must not be null.");
        w.i(gVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f1943n = context.getApplicationContext();
        String str = null;
        if (T2.b.g()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f1944u = str;
        this.f1945v = eVar;
        this.f1946w = bVar;
        this.f1947x = new C0351a(eVar, bVar, str);
        C0354d e9 = C0354d.e(this.f1943n);
        this.f1942A = e9;
        this.f1948y = e9.f2230A.getAndIncrement();
        this.f1949z = gVar.f1941a;
        a3.e eVar2 = e9.f2235F;
        eVar2.sendMessage(eVar2.obtainMessage(7, this));
    }

    public final Z2.e a() {
        Z2.e eVar = new Z2.e(12, false);
        Set set = Collections.EMPTY_SET;
        if (((s.c) eVar.f4170u) == null) {
            eVar.f4170u = new s.c(0);
        }
        ((s.c) eVar.f4170u).addAll(set);
        Context context = this.f1943n;
        eVar.f4172w = context.getClass().getName();
        eVar.f4171v = context.getPackageName();
        return eVar;
    }

    public final m c(int i, F3.e eVar) {
        j3.h hVar = new j3.h();
        C0354d c0354d = this.f1942A;
        c0354d.getClass();
        int i6 = eVar.f961c;
        a3.e eVar2 = c0354d.f2235F;
        m mVar = hVar.f38358a;
        if (i6 != 0) {
            L l9 = null;
            if (c0354d.a()) {
                P2.m mVar2 = (P2.m) C0382l.a().f2515n;
                C0351a c0351a = this.f1947x;
                boolean z3 = true;
                if (mVar2 != null) {
                    if (mVar2.f2517u) {
                        D d2 = (D) c0354d.f2232C.get(c0351a);
                        if (d2 != null) {
                            Object obj = d2.f2172u;
                            if (obj instanceof AbstractC0376f) {
                                AbstractC0376f abstractC0376f = (AbstractC0376f) obj;
                                if (abstractC0376f.f2472T != null && !abstractC0376f.e()) {
                                    C0377g a9 = L.a(d2, abstractC0376f, i6);
                                    if (a9 != null) {
                                        d2.f2169E++;
                                        z3 = a9.f2483v;
                                    }
                                }
                            }
                        }
                        z3 = mVar2.f2518v;
                    }
                    l9 = null;
                }
                l9 = new L(c0354d, i6, c0351a, z3 ? System.currentTimeMillis() : 0L, z3 ? SystemClock.elapsedRealtime() : 0L);
            }
            if (l9 != null) {
                eVar2.getClass();
                mVar.a(new B(0, eVar2), l9);
            }
        }
        eVar2.sendMessage(eVar2.obtainMessage(4, new N(new P(i, eVar, hVar, this.f1949z), c0354d.f2231B.get(), this)));
        return mVar;
    }
}
