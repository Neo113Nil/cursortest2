package J1;

import N1.p;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.i;
import com.bumptech.glide.j;
import com.google.android.gms.internal.ads.CL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import m.Q0;
import s1.InterfaceC4992e;
import s1.h;
import u.AbstractC5088e;
import u1.k;
import u1.o;
import u1.s;
import u1.x;

/* loaded from: classes.dex */
public final class f implements c, K1.b {

    /* renamed from: C, reason: collision with root package name */
    public static final boolean f1359C = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A, reason: collision with root package name */
    public final RuntimeException f1360A;

    /* renamed from: B, reason: collision with root package name */
    public int f1361B;

    /* renamed from: a, reason: collision with root package name */
    public final String f1362a;

    /* renamed from: b, reason: collision with root package name */
    public final O1.e f1363b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1364c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1365d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f1366e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1367f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1368g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f1369h;
    public final a i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1370j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1371k;

    /* renamed from: l, reason: collision with root package name */
    public final j f1372l;

    /* renamed from: m, reason: collision with root package name */
    public final K1.c f1373m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1374n;

    /* renamed from: o, reason: collision with root package name */
    public final L1.a f1375o;

    /* renamed from: p, reason: collision with root package name */
    public final N1.f f1376p;

    /* renamed from: q, reason: collision with root package name */
    public x f1377q;

    /* renamed from: r, reason: collision with root package name */
    public Q0 f1378r;

    /* renamed from: s, reason: collision with root package name */
    public long f1379s;

    /* renamed from: t, reason: collision with root package name */
    public volatile k f1380t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f1381u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f1382v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f1383w;

    /* renamed from: x, reason: collision with root package name */
    public int f1384x;

    /* renamed from: y, reason: collision with root package name */
    public int f1385y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1386z;

    public f(Context context, i iVar, Object obj, Object obj2, Class cls, a aVar, int i, int i4, j jVar, K1.c cVar, ArrayList arrayList, d dVar, k kVar, L1.a aVar2) {
        N1.f fVar = N1.g.f1960a;
        this.f1362a = f1359C ? String.valueOf(hashCode()) : null;
        this.f1363b = new O1.e();
        this.f1364c = obj;
        this.f1366e = context;
        this.f1367f = iVar;
        this.f1368g = obj2;
        this.f1369h = cls;
        this.i = aVar;
        this.f1370j = i;
        this.f1371k = i4;
        this.f1372l = jVar;
        this.f1373m = cVar;
        this.f1374n = arrayList;
        this.f1365d = dVar;
        this.f1380t = kVar;
        this.f1375o = aVar2;
        this.f1376p = fVar;
        this.f1361B = 1;
        if (this.f1360A == null && ((Map) iVar.f23555h.f37856u).containsKey(com.bumptech.glide.e.class)) {
            this.f1360A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // J1.c
    public final boolean a() {
        boolean z8;
        synchronized (this.f1364c) {
            z8 = this.f1361B == 4;
        }
        return z8;
    }

    public final void b() {
        if (this.f1386z) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f1363b.a();
        this.f1373m.a(this);
        Q0 q02 = this.f1378r;
        if (q02 != null) {
            synchronized (((k) q02.f39327d)) {
                ((o) q02.f39325b).h((f) q02.f39326c);
            }
            this.f1378r = null;
        }
    }

    public final Drawable c() {
        if (this.f1382v == null) {
            a aVar = this.i;
            aVar.getClass();
            this.f1382v = null;
            int i = aVar.f1349w;
            if (i > 0) {
                Resources.Theme theme = aVar.f1343G;
                Context context = this.f1366e;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.f1382v = com.bumptech.glide.g.M(context, context, i, theme);
            }
        }
        return this.f1382v;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [J1.d, java.lang.Object] */
    @Override // J1.c
    public final void clear() {
        synchronized (this.f1364c) {
            try {
                if (this.f1386z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f1363b.a();
                if (this.f1361B == 6) {
                    return;
                }
                b();
                x xVar = this.f1377q;
                if (xVar != null) {
                    this.f1377q = null;
                } else {
                    xVar = null;
                }
                ?? r32 = this.f1365d;
                if (r32 == 0 || r32.b(this)) {
                    this.f1373m.h(c());
                }
                this.f1361B = 6;
                if (xVar != null) {
                    this.f1380t.getClass();
                    k.f(xVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(String str) {
        StringBuilder c4 = AbstractC5088e.c(str, " this: ");
        c4.append(this.f1362a);
        Log.v("GlideRequest", c4.toString());
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [J1.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [J1.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [J1.d, java.lang.Object] */
    public final void e(s sVar, int i) {
        Drawable drawable;
        this.f1363b.a();
        synchronized (this.f1364c) {
            try {
                sVar.getClass();
                int i4 = this.f1367f.i;
                if (i4 <= i) {
                    Log.w("Glide", "Load failed for [" + this.f1368g + "] with dimensions [" + this.f1384x + "x" + this.f1385y + "]", sVar);
                    if (i4 <= 4) {
                        sVar.d();
                    }
                }
                this.f1378r = null;
                this.f1361B = 5;
                ?? r62 = this.f1365d;
                if (r62 != 0) {
                    r62.g(this);
                }
                boolean z8 = true;
                this.f1386z = true;
                try {
                    ArrayList arrayList = this.f1374n;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            ?? r63 = this.f1365d;
                            if (r63 == 0) {
                                throw null;
                            }
                            r63.d().a();
                            throw null;
                        }
                    }
                    ?? r22 = this.f1365d;
                    if (r22 != 0 && !r22.k(this)) {
                        z8 = false;
                    }
                    if (this.f1368g == null) {
                        if (this.f1383w == null) {
                            this.i.getClass();
                            this.f1383w = null;
                        }
                        drawable = this.f1383w;
                    } else {
                        drawable = null;
                    }
                    if (drawable == null) {
                        if (this.f1381u == null) {
                            this.i.getClass();
                            this.f1381u = null;
                        }
                        drawable = this.f1381u;
                    }
                    if (drawable == null) {
                        drawable = c();
                    }
                    this.f1373m.d(drawable);
                } finally {
                    this.f1386z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.c
    public final boolean f(c cVar) {
        int i;
        int i4;
        Object obj;
        Class cls;
        a aVar;
        j jVar;
        int size;
        int i9;
        int i10;
        Object obj2;
        Class cls2;
        a aVar2;
        j jVar2;
        int size2;
        if (!(cVar instanceof f)) {
            return false;
        }
        synchronized (this.f1364c) {
            try {
                i = this.f1370j;
                i4 = this.f1371k;
                obj = this.f1368g;
                cls = this.f1369h;
                aVar = this.i;
                jVar = this.f1372l;
                ArrayList arrayList = this.f1374n;
                size = arrayList != null ? arrayList.size() : 0;
            } finally {
            }
        }
        f fVar = (f) cVar;
        synchronized (fVar.f1364c) {
            try {
                i9 = fVar.f1370j;
                i10 = fVar.f1371k;
                obj2 = fVar.f1368g;
                cls2 = fVar.f1369h;
                aVar2 = fVar.i;
                jVar2 = fVar.f1372l;
                ArrayList arrayList2 = fVar.f1374n;
                size2 = arrayList2 != null ? arrayList2.size() : 0;
            } finally {
            }
        }
        if (i != i9 || i4 != i10) {
            return false;
        }
        char[] cArr = p.f1976a;
        if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
            return (aVar == null ? aVar2 == null : aVar.k(aVar2)) && jVar == jVar2 && size == size2;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [J1.d, java.lang.Object] */
    public final void g(x xVar, int i, boolean z8) {
        this.f1363b.a();
        x xVar2 = null;
        try {
            synchronized (this.f1364c) {
                try {
                    this.f1378r = null;
                    if (xVar == null) {
                        e(new s("Expected to receive a Resource<R> with an object of " + this.f1369h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = xVar.get();
                    try {
                        if (obj != null && this.f1369h.isAssignableFrom(obj.getClass())) {
                            ?? r9 = this.f1365d;
                            if (r9 == 0 || r9.c(this)) {
                                k(xVar, obj, i);
                                return;
                            }
                            this.f1377q = null;
                            this.f1361B = 4;
                            this.f1380t.getClass();
                            k.f(xVar);
                        }
                        this.f1377q = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.f1369h);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(xVar);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        e(new s(sb.toString()), 5);
                        this.f1380t.getClass();
                        k.f(xVar);
                    } catch (Throwable th) {
                        xVar2 = xVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (xVar2 != null) {
                this.f1380t.getClass();
                k.f(xVar2);
            }
            throw th3;
        }
    }

    @Override // J1.c
    public final boolean h() {
        boolean z8;
        synchronized (this.f1364c) {
            z8 = this.f1361B == 6;
        }
        return z8;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [J1.d, java.lang.Object] */
    @Override // J1.c
    public final void i() {
        synchronized (this.f1364c) {
            try {
                if (this.f1386z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f1363b.a();
                int i = N1.j.f1965b;
                this.f1379s = SystemClock.elapsedRealtimeNanos();
                if (this.f1368g == null) {
                    if (p.i(this.f1370j, this.f1371k)) {
                        this.f1384x = this.f1370j;
                        this.f1385y = this.f1371k;
                    }
                    if (this.f1383w == null) {
                        this.i.getClass();
                        this.f1383w = null;
                    }
                    e(new s("Received null model"), this.f1383w == null ? 5 : 3);
                    return;
                }
                int i4 = this.f1361B;
                if (i4 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i4 == 4) {
                    g(this.f1377q, 5, false);
                    return;
                }
                ArrayList arrayList = this.f1374n;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                    }
                }
                this.f1361B = 3;
                if (p.i(this.f1370j, this.f1371k)) {
                    l(this.f1370j, this.f1371k);
                } else {
                    this.f1373m.e(this);
                }
                int i9 = this.f1361B;
                if (i9 == 2 || i9 == 3) {
                    ?? r12 = this.f1365d;
                    if (r12 == 0 || r12.k(this)) {
                        this.f1373m.f(c());
                    }
                }
                if (f1359C) {
                    d("finished run method in " + N1.j.a(this.f1379s));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.c
    public final boolean isRunning() {
        boolean z8;
        synchronized (this.f1364c) {
            int i = this.f1361B;
            z8 = i == 2 || i == 3;
        }
        return z8;
    }

    @Override // J1.c
    public final boolean j() {
        boolean z8;
        synchronized (this.f1364c) {
            z8 = this.f1361B == 4;
        }
        return z8;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [J1.d, java.lang.Object] */
    public final void k(x xVar, Object obj, int i) {
        ?? r02 = this.f1365d;
        if (r02 != 0) {
            r02.d().a();
        }
        this.f1361B = 4;
        this.f1377q = xVar;
        if (this.f1367f.i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + CL.y(i) + " for " + this.f1368g + " with size [" + this.f1384x + "x" + this.f1385y + "] in " + N1.j.a(this.f1379s) + " ms");
        }
        if (r02 != 0) {
            r02.e(this);
        }
        this.f1386z = true;
        try {
            ArrayList arrayList = this.f1374n;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            this.f1375o.getClass();
            this.f1373m.c(obj);
            this.f1386z = false;
        } catch (Throwable th) {
            this.f1386z = false;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(int i, int i4) {
        f fVar = this;
        int i9 = i;
        fVar.f1363b.a();
        Object obj = fVar.f1364c;
        synchronized (obj) {
            try {
                try {
                    boolean z8 = f1359C;
                    if (z8) {
                        fVar.d("Got onSizeReady in " + N1.j.a(fVar.f1379s));
                    }
                    if (fVar.f1361B == 3) {
                        fVar.f1361B = 2;
                        fVar.i.getClass();
                        if (i9 != Integer.MIN_VALUE) {
                            i9 = Math.round(i9 * 1.0f);
                        }
                        fVar.f1384x = i9;
                        fVar.f1385y = i4 == Integer.MIN_VALUE ? i4 : Math.round(1.0f * i4);
                        if (z8) {
                            fVar.d("finished setup for calling load in " + N1.j.a(fVar.f1379s));
                        }
                        k kVar = fVar.f1380t;
                        i iVar = fVar.f1367f;
                        Object obj2 = fVar.f1368g;
                        a aVar = fVar.i;
                        InterfaceC4992e interfaceC4992e = aVar.f1337A;
                        try {
                            int i10 = fVar.f1384x;
                            int i11 = fVar.f1385y;
                            Class cls = aVar.f1341E;
                            try {
                                Class cls2 = fVar.f1369h;
                                j jVar = fVar.f1372l;
                                u1.j jVar2 = aVar.f1347u;
                                try {
                                    N1.c cVar = aVar.f1340D;
                                    boolean z9 = aVar.f1338B;
                                    boolean z10 = aVar.f1345I;
                                    try {
                                        h hVar = aVar.f1339C;
                                        boolean z11 = aVar.f1350x;
                                        boolean z12 = aVar.J;
                                        N1.f fVar2 = fVar.f1376p;
                                        fVar = obj;
                                        try {
                                            fVar.f1378r = kVar.a(iVar, obj2, interfaceC4992e, i10, i11, cls, cls2, jVar, jVar2, cVar, z9, z10, hVar, z11, z12, fVar, fVar2);
                                            if (fVar.f1361B != 2) {
                                                fVar.f1378r = null;
                                            }
                                            if (z8) {
                                                fVar.d("finished onSizeReady in " + N1.j.a(fVar.f1379s));
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fVar = obj;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    fVar = obj;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                fVar = obj;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fVar = obj;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                fVar = obj;
            }
        }
    }

    @Override // J1.c
    public final void pause() {
        synchronized (this.f1364c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f1364c) {
            obj = this.f1368g;
            cls = this.f1369h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
