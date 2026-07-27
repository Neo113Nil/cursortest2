package J1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.i;
import com.bumptech.glide.j;
import com.icefishing.icefishinglive2.AbstractC4404f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import s1.InterfaceC4970e;
import s1.h;
import u.AbstractC5049e;
import u1.k;
import u1.l;
import u1.p;
import u1.t;
import u1.x;

/* loaded from: classes.dex */
public final class f implements c, K1.b {

    /* renamed from: C, reason: collision with root package name */
    public static final boolean f1434C = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A, reason: collision with root package name */
    public final RuntimeException f1435A;

    /* renamed from: B, reason: collision with root package name */
    public int f1436B;

    /* renamed from: a, reason: collision with root package name */
    public final String f1437a;

    /* renamed from: b, reason: collision with root package name */
    public final O1.e f1438b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1439c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1440d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f1441e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1442f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1443g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f1444h;
    public final a i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1445j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1446k;

    /* renamed from: l, reason: collision with root package name */
    public final j f1447l;

    /* renamed from: m, reason: collision with root package name */
    public final K1.c f1448m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1449n;

    /* renamed from: o, reason: collision with root package name */
    public final L1.a f1450o;

    /* renamed from: p, reason: collision with root package name */
    public final N1.f f1451p;

    /* renamed from: q, reason: collision with root package name */
    public x f1452q;

    /* renamed from: r, reason: collision with root package name */
    public j4.g f1453r;

    /* renamed from: s, reason: collision with root package name */
    public long f1454s;

    /* renamed from: t, reason: collision with root package name */
    public volatile l f1455t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f1456u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f1457v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f1458w;

    /* renamed from: x, reason: collision with root package name */
    public int f1459x;

    /* renamed from: y, reason: collision with root package name */
    public int f1460y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1461z;

    public f(Context context, i iVar, Object obj, Object obj2, Class cls, a aVar, int i, int i6, j jVar, K1.c cVar, ArrayList arrayList, d dVar, l lVar, L1.a aVar2) {
        N1.f fVar = N1.g.f1916a;
        this.f1437a = f1434C ? String.valueOf(hashCode()) : null;
        this.f1438b = new O1.e();
        this.f1439c = obj;
        this.f1441e = context;
        this.f1442f = iVar;
        this.f1443g = obj2;
        this.f1444h = cls;
        this.i = aVar;
        this.f1445j = i;
        this.f1446k = i6;
        this.f1447l = jVar;
        this.f1448m = cVar;
        this.f1449n = arrayList;
        this.f1440d = dVar;
        this.f1455t = lVar;
        this.f1450o = aVar2;
        this.f1451p = fVar;
        this.f1436B = 1;
        if (this.f1435A == null && ((Map) iVar.f23399h.f37625u).containsKey(com.bumptech.glide.e.class)) {
            this.f1435A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // J1.c
    public final boolean a() {
        boolean z3;
        synchronized (this.f1439c) {
            z3 = this.f1436B == 4;
        }
        return z3;
    }

    public final void b() {
        if (this.f1461z) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f1438b.a();
        this.f1448m.a(this);
        j4.g gVar = this.f1453r;
        if (gVar != null) {
            synchronized (((l) gVar.f38406w)) {
                ((p) gVar.f38404u).h((f) gVar.f38405v);
            }
            this.f1453r = null;
        }
    }

    public final Drawable c() {
        if (this.f1457v == null) {
            a aVar = this.i;
            aVar.getClass();
            this.f1457v = null;
            int i = aVar.f1424w;
            if (i > 0) {
                Resources.Theme theme = aVar.f1418G;
                Context context = this.f1441e;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.f1457v = d6.c.f(context, context, i, theme);
            }
        }
        return this.f1457v;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [J1.d, java.lang.Object] */
    @Override // J1.c
    public final void clear() {
        synchronized (this.f1439c) {
            try {
                if (this.f1461z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f1438b.a();
                if (this.f1436B == 6) {
                    return;
                }
                b();
                x xVar = this.f1452q;
                if (xVar != null) {
                    this.f1452q = null;
                } else {
                    xVar = null;
                }
                ?? r32 = this.f1440d;
                if (r32 == 0 || r32.b(this)) {
                    this.f1448m.h(c());
                }
                this.f1436B = 6;
                if (xVar != null) {
                    this.f1455t.getClass();
                    l.f(xVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(String str) {
        StringBuilder c9 = AbstractC5049e.c(str, " this: ");
        c9.append(this.f1437a);
        Log.v("GlideRequest", c9.toString());
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [J1.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [J1.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [J1.d, java.lang.Object] */
    public final void e(t tVar, int i) {
        Drawable drawable;
        this.f1438b.a();
        synchronized (this.f1439c) {
            try {
                tVar.getClass();
                int i6 = this.f1442f.i;
                if (i6 <= i) {
                    Log.w("Glide", "Load failed for [" + this.f1443g + "] with dimensions [" + this.f1459x + "x" + this.f1460y + "]", tVar);
                    if (i6 <= 4) {
                        tVar.d();
                    }
                }
                this.f1453r = null;
                this.f1436B = 5;
                ?? r62 = this.f1440d;
                if (r62 != 0) {
                    r62.g(this);
                }
                boolean z3 = true;
                this.f1461z = true;
                try {
                    ArrayList arrayList = this.f1449n;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            ?? r63 = this.f1440d;
                            if (r63 == 0) {
                                throw null;
                            }
                            r63.d().a();
                            throw null;
                        }
                    }
                    ?? r22 = this.f1440d;
                    if (r22 != 0 && !r22.k(this)) {
                        z3 = false;
                    }
                    if (this.f1443g == null) {
                        if (this.f1458w == null) {
                            this.i.getClass();
                            this.f1458w = null;
                        }
                        drawable = this.f1458w;
                    } else {
                        drawable = null;
                    }
                    if (drawable == null) {
                        if (this.f1456u == null) {
                            this.i.getClass();
                            this.f1456u = null;
                        }
                        drawable = this.f1456u;
                    }
                    if (drawable == null) {
                        drawable = c();
                    }
                    this.f1448m.d(drawable);
                } finally {
                    this.f1461z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.c
    public final boolean f(c cVar) {
        int i;
        int i6;
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
        synchronized (this.f1439c) {
            try {
                i = this.f1445j;
                i6 = this.f1446k;
                obj = this.f1443g;
                cls = this.f1444h;
                aVar = this.i;
                jVar = this.f1447l;
                ArrayList arrayList = this.f1449n;
                size = arrayList != null ? arrayList.size() : 0;
            } finally {
            }
        }
        f fVar = (f) cVar;
        synchronized (fVar.f1439c) {
            try {
                i9 = fVar.f1445j;
                i10 = fVar.f1446k;
                obj2 = fVar.f1443g;
                cls2 = fVar.f1444h;
                aVar2 = fVar.i;
                jVar2 = fVar.f1447l;
                ArrayList arrayList2 = fVar.f1449n;
                size2 = arrayList2 != null ? arrayList2.size() : 0;
            } finally {
            }
        }
        if (i != i9 || i6 != i10) {
            return false;
        }
        char[] cArr = N1.p.f1932a;
        if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
            return (aVar == null ? aVar2 == null : aVar.k(aVar2)) && jVar == jVar2 && size == size2;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [J1.d, java.lang.Object] */
    public final void g(x xVar, int i, boolean z3) {
        this.f1438b.a();
        x xVar2 = null;
        try {
            synchronized (this.f1439c) {
                try {
                    this.f1453r = null;
                    if (xVar == null) {
                        e(new t("Expected to receive a Resource<R> with an object of " + this.f1444h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = xVar.get();
                    try {
                        if (obj != null && this.f1444h.isAssignableFrom(obj.getClass())) {
                            ?? r9 = this.f1440d;
                            if (r9 == 0 || r9.c(this)) {
                                k(xVar, obj, i);
                                return;
                            }
                            this.f1452q = null;
                            this.f1436B = 4;
                            this.f1455t.getClass();
                            l.f(xVar);
                        }
                        this.f1452q = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.f1444h);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(xVar);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        e(new t(sb.toString()), 5);
                        this.f1455t.getClass();
                        l.f(xVar);
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
                this.f1455t.getClass();
                l.f(xVar2);
            }
            throw th3;
        }
    }

    @Override // J1.c
    public final boolean h() {
        boolean z3;
        synchronized (this.f1439c) {
            z3 = this.f1436B == 6;
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [J1.d, java.lang.Object] */
    @Override // J1.c
    public final void i() {
        synchronized (this.f1439c) {
            try {
                if (this.f1461z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f1438b.a();
                int i = N1.j.f1921b;
                this.f1454s = SystemClock.elapsedRealtimeNanos();
                if (this.f1443g == null) {
                    if (N1.p.i(this.f1445j, this.f1446k)) {
                        this.f1459x = this.f1445j;
                        this.f1460y = this.f1446k;
                    }
                    if (this.f1458w == null) {
                        this.i.getClass();
                        this.f1458w = null;
                    }
                    e(new t("Received null model"), this.f1458w == null ? 5 : 3);
                    return;
                }
                int i6 = this.f1436B;
                if (i6 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i6 == 4) {
                    g(this.f1452q, 5, false);
                    return;
                }
                ArrayList arrayList = this.f1449n;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                    }
                }
                this.f1436B = 3;
                if (N1.p.i(this.f1445j, this.f1446k)) {
                    l(this.f1445j, this.f1446k);
                } else {
                    this.f1448m.e(this);
                }
                int i9 = this.f1436B;
                if (i9 == 2 || i9 == 3) {
                    ?? r12 = this.f1440d;
                    if (r12 == 0 || r12.k(this)) {
                        this.f1448m.f(c());
                    }
                }
                if (f1434C) {
                    d("finished run method in " + N1.j.a(this.f1454s));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J1.c
    public final boolean isRunning() {
        boolean z3;
        synchronized (this.f1439c) {
            int i = this.f1436B;
            z3 = i == 2 || i == 3;
        }
        return z3;
    }

    @Override // J1.c
    public final boolean j() {
        boolean z3;
        synchronized (this.f1439c) {
            z3 = this.f1436B == 4;
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [J1.d, java.lang.Object] */
    public final void k(x xVar, Object obj, int i) {
        ?? r02 = this.f1440d;
        if (r02 != 0) {
            r02.d().a();
        }
        this.f1436B = 4;
        this.f1452q = xVar;
        if (this.f1442f.i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + AbstractC4404f.r(i) + " for " + this.f1443g + " with size [" + this.f1459x + "x" + this.f1460y + "] in " + N1.j.a(this.f1454s) + " ms");
        }
        if (r02 != 0) {
            r02.e(this);
        }
        this.f1461z = true;
        try {
            ArrayList arrayList = this.f1449n;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            this.f1450o.getClass();
            this.f1448m.c(obj);
            this.f1461z = false;
        } catch (Throwable th) {
            this.f1461z = false;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(int i, int i6) {
        f fVar = this;
        int i9 = i;
        fVar.f1438b.a();
        Object obj = fVar.f1439c;
        synchronized (obj) {
            try {
                try {
                    boolean z3 = f1434C;
                    if (z3) {
                        fVar.d("Got onSizeReady in " + N1.j.a(fVar.f1454s));
                    }
                    if (fVar.f1436B == 3) {
                        fVar.f1436B = 2;
                        fVar.i.getClass();
                        if (i9 != Integer.MIN_VALUE) {
                            i9 = Math.round(i9 * 1.0f);
                        }
                        fVar.f1459x = i9;
                        fVar.f1460y = i6 == Integer.MIN_VALUE ? i6 : Math.round(1.0f * i6);
                        if (z3) {
                            fVar.d("finished setup for calling load in " + N1.j.a(fVar.f1454s));
                        }
                        l lVar = fVar.f1455t;
                        i iVar = fVar.f1442f;
                        Object obj2 = fVar.f1443g;
                        a aVar = fVar.i;
                        InterfaceC4970e interfaceC4970e = aVar.f1412A;
                        try {
                            int i10 = fVar.f1459x;
                            int i11 = fVar.f1460y;
                            Class cls = aVar.f1416E;
                            try {
                                Class cls2 = fVar.f1444h;
                                j jVar = fVar.f1447l;
                                k kVar = aVar.f1422u;
                                try {
                                    N1.c cVar = aVar.f1415D;
                                    boolean z6 = aVar.f1413B;
                                    boolean z9 = aVar.f1420I;
                                    try {
                                        h hVar = aVar.f1414C;
                                        boolean z10 = aVar.f1425x;
                                        boolean z11 = aVar.J;
                                        N1.f fVar2 = fVar.f1451p;
                                        fVar = obj;
                                        try {
                                            fVar.f1453r = lVar.a(iVar, obj2, interfaceC4970e, i10, i11, cls, cls2, jVar, kVar, cVar, z6, z9, hVar, z10, z11, fVar, fVar2);
                                            if (fVar.f1436B != 2) {
                                                fVar.f1453r = null;
                                            }
                                            if (z3) {
                                                fVar.d("finished onSizeReady in " + N1.j.a(fVar.f1454s));
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
        synchronized (this.f1439c) {
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
        synchronized (this.f1439c) {
            obj = this.f1443g;
            cls = this.f1444h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
