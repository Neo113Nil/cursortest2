package L1;

import P1.p;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.i;
import com.bumptech.glide.j;
import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import u.AbstractC5050e;
import u1.InterfaceC5066e;
import u1.h;
import w1.k;
import w1.o;
import w1.s;
import w1.w;

/* loaded from: classes.dex */
public final class f implements c, M1.b {

    /* renamed from: C, reason: collision with root package name */
    public static final boolean f1750C = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A, reason: collision with root package name */
    public final RuntimeException f1751A;

    /* renamed from: B, reason: collision with root package name */
    public int f1752B;

    /* renamed from: a, reason: collision with root package name */
    public final String f1753a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.e f1754b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1755c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1756d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f1757e;

    /* renamed from: f, reason: collision with root package name */
    public final i f1758f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1759g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f1760h;
    public final a i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1761j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1762k;

    /* renamed from: l, reason: collision with root package name */
    public final j f1763l;

    /* renamed from: m, reason: collision with root package name */
    public final M1.c f1764m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1765n;

    /* renamed from: o, reason: collision with root package name */
    public final N1.a f1766o;

    /* renamed from: p, reason: collision with root package name */
    public final P1.f f1767p;

    /* renamed from: q, reason: collision with root package name */
    public w f1768q;

    /* renamed from: r, reason: collision with root package name */
    public l4.g f1769r;

    /* renamed from: s, reason: collision with root package name */
    public long f1770s;

    /* renamed from: t, reason: collision with root package name */
    public volatile k f1771t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f1772u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f1773v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f1774w;

    /* renamed from: x, reason: collision with root package name */
    public int f1775x;

    /* renamed from: y, reason: collision with root package name */
    public int f1776y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1777z;

    public f(Context context, i iVar, Object obj, Object obj2, Class cls, a aVar, int i, int i4, j jVar, M1.c cVar, ArrayList arrayList, d dVar, k kVar, N1.a aVar2) {
        P1.f fVar = P1.g.f2360a;
        this.f1753a = f1750C ? String.valueOf(hashCode()) : null;
        this.f1754b = new Q1.e();
        this.f1755c = obj;
        this.f1757e = context;
        this.f1758f = iVar;
        this.f1759g = obj2;
        this.f1760h = cls;
        this.i = aVar;
        this.f1761j = i;
        this.f1762k = i4;
        this.f1763l = jVar;
        this.f1764m = cVar;
        this.f1765n = arrayList;
        this.f1756d = dVar;
        this.f1771t = kVar;
        this.f1766o = aVar2;
        this.f1767p = fVar;
        this.f1752B = 1;
        if (this.f1751A == null && ((Map) iVar.f24186h.f38152u).containsKey(com.bumptech.glide.e.class)) {
            this.f1751A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // L1.c
    public final boolean a() {
        boolean z6;
        synchronized (this.f1755c) {
            z6 = this.f1752B == 4;
        }
        return z6;
    }

    public final void b() {
        if (this.f1777z) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f1754b.a();
        this.f1764m.a(this);
        l4.g gVar = this.f1769r;
        if (gVar != null) {
            synchronized (((k) gVar.f38918w)) {
                ((o) gVar.f38916u).h((f) gVar.f38917v);
            }
            this.f1769r = null;
        }
    }

    public final Drawable c() {
        if (this.f1773v == null) {
            a aVar = this.i;
            aVar.getClass();
            this.f1773v = null;
            int i = aVar.f1740w;
            if (i > 0) {
                Resources.Theme theme = aVar.f1734G;
                Context context = this.f1757e;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.f1773v = A8.b.k(context, context, i, theme);
            }
        }
        return this.f1773v;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [L1.d, java.lang.Object] */
    @Override // L1.c
    public final void clear() {
        synchronized (this.f1755c) {
            try {
                if (this.f1777z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f1754b.a();
                if (this.f1752B == 6) {
                    return;
                }
                b();
                w wVar = this.f1768q;
                if (wVar != null) {
                    this.f1768q = null;
                } else {
                    wVar = null;
                }
                ?? r32 = this.f1756d;
                if (r32 == 0 || r32.k(this)) {
                    this.f1764m.h(c());
                }
                this.f1752B = 6;
                if (wVar != null) {
                    this.f1771t.getClass();
                    k.f(wVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(String str) {
        StringBuilder c9 = AbstractC5050e.c(str, " this: ");
        c9.append(this.f1753a);
        Log.v("GlideRequest", c9.toString());
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [L1.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [L1.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [L1.d, java.lang.Object] */
    public final void e(s sVar, int i) {
        Drawable drawable;
        this.f1754b.a();
        synchronized (this.f1755c) {
            try {
                sVar.getClass();
                int i4 = this.f1758f.i;
                if (i4 <= i) {
                    Log.w("Glide", "Load failed for [" + this.f1759g + "] with dimensions [" + this.f1775x + "x" + this.f1776y + "]", sVar);
                    if (i4 <= 4) {
                        sVar.d();
                    }
                }
                this.f1769r = null;
                this.f1752B = 5;
                ?? r62 = this.f1756d;
                if (r62 != 0) {
                    r62.d(this);
                }
                boolean z6 = true;
                this.f1777z = true;
                try {
                    ArrayList arrayList = this.f1765n;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            ?? r63 = this.f1756d;
                            if (r63 == 0) {
                                throw null;
                            }
                            r63.e().a();
                            throw null;
                        }
                    }
                    ?? r22 = this.f1756d;
                    if (r22 != 0 && !r22.c(this)) {
                        z6 = false;
                    }
                    if (this.f1759g == null) {
                        if (this.f1774w == null) {
                            this.i.getClass();
                            this.f1774w = null;
                        }
                        drawable = this.f1774w;
                    } else {
                        drawable = null;
                    }
                    if (drawable == null) {
                        if (this.f1772u == null) {
                            this.i.getClass();
                            this.f1772u = null;
                        }
                        drawable = this.f1772u;
                    }
                    if (drawable == null) {
                        drawable = c();
                    }
                    this.f1764m.d(drawable);
                } finally {
                    this.f1777z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // L1.c
    public final boolean f(c cVar) {
        int i;
        int i4;
        Object obj;
        Class cls;
        a aVar;
        j jVar;
        int size;
        int i6;
        int i9;
        Object obj2;
        Class cls2;
        a aVar2;
        j jVar2;
        int size2;
        if (!(cVar instanceof f)) {
            return false;
        }
        synchronized (this.f1755c) {
            try {
                i = this.f1761j;
                i4 = this.f1762k;
                obj = this.f1759g;
                cls = this.f1760h;
                aVar = this.i;
                jVar = this.f1763l;
                ArrayList arrayList = this.f1765n;
                size = arrayList != null ? arrayList.size() : 0;
            } finally {
            }
        }
        f fVar = (f) cVar;
        synchronized (fVar.f1755c) {
            try {
                i6 = fVar.f1761j;
                i9 = fVar.f1762k;
                obj2 = fVar.f1759g;
                cls2 = fVar.f1760h;
                aVar2 = fVar.i;
                jVar2 = fVar.f1763l;
                ArrayList arrayList2 = fVar.f1765n;
                size2 = arrayList2 != null ? arrayList2.size() : 0;
            } finally {
            }
        }
        if (i != i6 || i4 != i9) {
            return false;
        }
        char[] cArr = p.f2376a;
        if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2)) {
            return (aVar == null ? aVar2 == null : aVar.k(aVar2)) && jVar == jVar2 && size == size2;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [L1.d, java.lang.Object] */
    public final void g(w wVar, int i, boolean z6) {
        this.f1754b.a();
        w wVar2 = null;
        try {
            synchronized (this.f1755c) {
                try {
                    this.f1769r = null;
                    if (wVar == null) {
                        e(new s("Expected to receive a Resource<R> with an object of " + this.f1760h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = wVar.get();
                    try {
                        if (obj != null && this.f1760h.isAssignableFrom(obj.getClass())) {
                            ?? r9 = this.f1756d;
                            if (r9 == 0 || r9.b(this)) {
                                k(wVar, obj, i);
                                return;
                            }
                            this.f1768q = null;
                            this.f1752B = 4;
                            this.f1771t.getClass();
                            k.f(wVar);
                        }
                        this.f1768q = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.f1760h);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(wVar);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        e(new s(sb.toString()), 5);
                        this.f1771t.getClass();
                        k.f(wVar);
                    } catch (Throwable th) {
                        wVar2 = wVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (wVar2 != null) {
                this.f1771t.getClass();
                k.f(wVar2);
            }
            throw th3;
        }
    }

    @Override // L1.c
    public final boolean h() {
        boolean z6;
        synchronized (this.f1755c) {
            z6 = this.f1752B == 6;
        }
        return z6;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [L1.d, java.lang.Object] */
    @Override // L1.c
    public final void i() {
        synchronized (this.f1755c) {
            try {
                if (this.f1777z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f1754b.a();
                int i = P1.j.f2365b;
                this.f1770s = SystemClock.elapsedRealtimeNanos();
                if (this.f1759g == null) {
                    if (p.i(this.f1761j, this.f1762k)) {
                        this.f1775x = this.f1761j;
                        this.f1776y = this.f1762k;
                    }
                    if (this.f1774w == null) {
                        this.i.getClass();
                        this.f1774w = null;
                    }
                    e(new s("Received null model"), this.f1774w == null ? 5 : 3);
                    return;
                }
                int i4 = this.f1752B;
                if (i4 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i4 == 4) {
                    g(this.f1768q, 5, false);
                    return;
                }
                ArrayList arrayList = this.f1765n;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                    }
                }
                this.f1752B = 3;
                if (p.i(this.f1761j, this.f1762k)) {
                    l(this.f1761j, this.f1762k);
                } else {
                    this.f1764m.e(this);
                }
                int i6 = this.f1752B;
                if (i6 == 2 || i6 == 3) {
                    ?? r1 = this.f1756d;
                    if (r1 == 0 || r1.c(this)) {
                        this.f1764m.f(c());
                    }
                }
                if (f1750C) {
                    d("finished run method in " + P1.j.a(this.f1770s));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // L1.c
    public final boolean isRunning() {
        boolean z6;
        synchronized (this.f1755c) {
            int i = this.f1752B;
            z6 = i == 2 || i == 3;
        }
        return z6;
    }

    @Override // L1.c
    public final boolean j() {
        boolean z6;
        synchronized (this.f1755c) {
            z6 = this.f1752B == 4;
        }
        return z6;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [L1.d, java.lang.Object] */
    public final void k(w wVar, Object obj, int i) {
        ?? r02 = this.f1756d;
        if (r02 != 0) {
            r02.e().a();
        }
        this.f1752B = 4;
        this.f1768q = wVar;
        if (this.f1758f.i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + Wv.r(i) + " for " + this.f1759g + " with size [" + this.f1775x + "x" + this.f1776y + "] in " + P1.j.a(this.f1770s) + " ms");
        }
        if (r02 != 0) {
            r02.g(this);
        }
        this.f1777z = true;
        try {
            ArrayList arrayList = this.f1765n;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            this.f1766o.getClass();
            this.f1764m.b(obj);
            this.f1777z = false;
        } catch (Throwable th) {
            this.f1777z = false;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(int i, int i4) {
        f fVar = this;
        int i6 = i;
        fVar.f1754b.a();
        Object obj = fVar.f1755c;
        synchronized (obj) {
            try {
                try {
                    boolean z6 = f1750C;
                    if (z6) {
                        fVar.d("Got onSizeReady in " + P1.j.a(fVar.f1770s));
                    }
                    if (fVar.f1752B == 3) {
                        fVar.f1752B = 2;
                        fVar.i.getClass();
                        if (i6 != Integer.MIN_VALUE) {
                            i6 = Math.round(i6 * 1.0f);
                        }
                        fVar.f1775x = i6;
                        fVar.f1776y = i4 == Integer.MIN_VALUE ? i4 : Math.round(1.0f * i4);
                        if (z6) {
                            fVar.d("finished setup for calling load in " + P1.j.a(fVar.f1770s));
                        }
                        k kVar = fVar.f1771t;
                        i iVar = fVar.f1758f;
                        Object obj2 = fVar.f1759g;
                        a aVar = fVar.i;
                        InterfaceC5066e interfaceC5066e = aVar.f1728A;
                        try {
                            int i9 = fVar.f1775x;
                            int i10 = fVar.f1776y;
                            Class cls = aVar.f1732E;
                            try {
                                Class cls2 = fVar.f1760h;
                                j jVar = fVar.f1763l;
                                w1.j jVar2 = aVar.f1738u;
                                try {
                                    P1.c cVar = aVar.f1731D;
                                    boolean z9 = aVar.f1729B;
                                    boolean z10 = aVar.f1736I;
                                    try {
                                        h hVar = aVar.f1730C;
                                        boolean z11 = aVar.f1741x;
                                        boolean z12 = aVar.J;
                                        P1.f fVar2 = fVar.f1767p;
                                        fVar = obj;
                                        try {
                                            fVar.f1769r = kVar.a(iVar, obj2, interfaceC5066e, i9, i10, cls, cls2, jVar, jVar2, cVar, z9, z10, hVar, z11, z12, fVar, fVar2);
                                            if (fVar.f1752B != 2) {
                                                fVar.f1769r = null;
                                            }
                                            if (z6) {
                                                fVar.d("finished onSizeReady in " + P1.j.a(fVar.f1770s));
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

    @Override // L1.c
    public final void pause() {
        synchronized (this.f1755c) {
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
        synchronized (this.f1755c) {
            obj = this.f1759g;
            cls = this.f1760h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
