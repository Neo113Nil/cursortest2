package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class jlq implements e0o, anq {
    public static final boolean C = Log.isLoggable("GlideRequest", 2);
    public final RuntimeException A;
    public int B;
    public final String a;
    public final uer b;
    public final Object c;
    public final p0o d;
    public final Context e;
    public final jld f;
    public final Object g;
    public final Class h;
    public final dt2 i;
    public final int j;
    public final int k;
    public final nsm l;
    public final j6s m;
    public final List n;
    public final e88 o;
    public final f48 p;
    public k2o q;
    public es6 r;
    public long s;
    public volatile q7b t;
    public Drawable u;
    public Drawable v;
    public Drawable w;
    public int x;
    public int y;
    public boolean z;

    public jlq(Context context, jld jldVar, Object obj, Object obj2, Class cls, dt2 dt2Var, int i, int i2, nsm nsmVar, j6s j6sVar, ArrayList arrayList, p0o p0oVar, q7b q7bVar, e88 e88Var) {
        f48 f48Var = saf.j;
        this.a = C ? String.valueOf(hashCode()) : null;
        this.b = new uer();
        this.c = obj;
        this.e = context;
        this.f = jldVar;
        this.g = obj2;
        this.h = cls;
        this.i = dt2Var;
        this.j = i;
        this.k = i2;
        this.l = nsmVar;
        this.m = j6sVar;
        this.n = arrayList;
        this.d = p0oVar;
        this.t = q7bVar;
        this.o = e88Var;
        this.p = f48Var;
        this.B = 1;
        if (this.A == null && ((Map) jldVar.h.b).containsKey(hld.class)) {
            this.A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // defpackage.e0o
    public final boolean a() {
        boolean z;
        synchronized (this.c) {
            z = this.B == 4;
        }
        return z;
    }

    @Override // defpackage.e0o
    public final void b() {
        synchronized (this.c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.anq
    public final void c(int i, int i2) {
        jlq jlqVar = this;
        int i3 = i;
        jlqVar.b.a();
        Object obj = jlqVar.c;
        synchronized (obj) {
            try {
                try {
                    boolean z = C;
                    if (z) {
                        jlqVar.i("Got onSizeReady in " + esg.a(jlqVar.s));
                    }
                    if (jlqVar.B == 3) {
                        jlqVar.B = 2;
                        jlqVar.i.getClass();
                        if (i3 != Integer.MIN_VALUE) {
                            i3 = Math.round(i3 * 1.0f);
                        }
                        jlqVar.x = i3;
                        jlqVar.y = i2 == Integer.MIN_VALUE ? i2 : Math.round(1.0f * i2);
                        if (z) {
                            jlqVar.i("finished setup for calling load in " + esg.a(jlqVar.s));
                        }
                        q7b q7bVar = jlqVar.t;
                        jld jldVar = jlqVar.f;
                        Object obj2 = jlqVar.g;
                        dt2 dt2Var = jlqVar.i;
                        daf dafVar = dt2Var.j;
                        try {
                            int i4 = jlqVar.x;
                            int i5 = jlqVar.y;
                            Class cls = dt2Var.n;
                            try {
                                Class cls2 = jlqVar.h;
                                nsm nsmVar = jlqVar.l;
                                x68 x68Var = dt2Var.b;
                                try {
                                    er3 er3Var = dt2Var.m;
                                    boolean z2 = dt2Var.k;
                                    boolean z3 = dt2Var.r;
                                    try {
                                        pwj pwjVar = dt2Var.l;
                                        boolean z4 = dt2Var.g;
                                        boolean z5 = dt2Var.s;
                                        f48 f48Var = jlqVar.p;
                                        jlqVar = obj;
                                        try {
                                            jlqVar.r = q7bVar.a(jldVar, obj2, dafVar, i4, i5, cls, cls2, nsmVar, x68Var, er3Var, z2, z3, pwjVar, z4, z5, jlqVar, f48Var);
                                            if (jlqVar.B != 2) {
                                                jlqVar.r = null;
                                            }
                                            if (z) {
                                                jlqVar.i("finished onSizeReady in " + esg.a(jlqVar.s));
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        jlqVar = obj;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    jlqVar = obj;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                jlqVar = obj;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            jlqVar = obj;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                jlqVar = obj;
            }
        }
    }

    @Override // defpackage.e0o
    public final void clear() {
        synchronized (this.c) {
            try {
                if (this.z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.b.a();
                if (this.B == 6) {
                    return;
                }
                g();
                k2o k2oVar = this.q;
                if (k2oVar != null) {
                    this.q = null;
                } else {
                    k2oVar = null;
                }
                p0o p0oVar = this.d;
                if (p0oVar == null || p0oVar.c(this)) {
                    this.m.g(h());
                }
                this.B = 6;
                if (k2oVar != null) {
                    this.t.getClass();
                    q7b.f(k2oVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.e0o
    public final boolean d() {
        boolean z;
        synchronized (this.c) {
            z = this.B == 6;
        }
        return z;
    }

    @Override // defpackage.e0o
    public final boolean e() {
        boolean z;
        synchronized (this.c) {
            z = this.B == 4;
        }
        return z;
    }

    @Override // defpackage.e0o
    public final boolean f(e0o e0oVar) {
        int i;
        int i2;
        Object obj;
        Class cls;
        dt2 dt2Var;
        nsm nsmVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        dt2 dt2Var2;
        nsm nsmVar2;
        int size2;
        if (!(e0oVar instanceof jlq)) {
            return false;
        }
        synchronized (this.c) {
            try {
                i = this.j;
                i2 = this.k;
                obj = this.g;
                cls = this.h;
                dt2Var = this.i;
                nsmVar = this.l;
                List list = this.n;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        jlq jlqVar = (jlq) e0oVar;
        synchronized (jlqVar.c) {
            try {
                i3 = jlqVar.j;
                i4 = jlqVar.k;
                obj2 = jlqVar.g;
                cls2 = jlqVar.h;
                dt2Var2 = jlqVar.i;
                nsmVar2 = jlqVar.l;
                List list2 = jlqVar.n;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = xut.a;
            if ((obj == null ? obj2 == null : obj.equals(obj2)) && cls.equals(cls2) && dt2Var.equals(dt2Var2) && nsmVar == nsmVar2 && size == size2) {
                return true;
            }
        }
        return false;
    }

    public final void g() {
        if (this.z) {
            xq0.q("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            return;
        }
        this.b.a();
        this.m.c(this);
        es6 es6Var = this.r;
        if (es6Var != null) {
            synchronized (((q7b) es6Var.c)) {
                ((g8b) es6Var.a).g((jlq) es6Var.b);
            }
            this.r = null;
        }
    }

    public final Drawable h() {
        int i;
        if (this.v == null) {
            dt2 dt2Var = this.i;
            Drawable drawable = dt2Var.e;
            this.v = drawable;
            if (drawable == null && (i = dt2Var.f) > 0) {
                Resources.Theme theme = dt2Var.p;
                Context context = this.e;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.v = sj2.v(context, context, i, theme);
            }
        }
        return this.v;
    }

    public final void i(String str) {
        StringBuilder m = tlm.m(str, " this: ");
        m.append(this.a);
        Log.v("GlideRequest", m.toString());
    }

    @Override // defpackage.e0o
    public final boolean isRunning() {
        boolean z;
        synchronized (this.c) {
            int i = this.B;
            z = i == 2 || i == 3;
        }
        return z;
    }

    public final void j(lld lldVar, int i) {
        boolean z;
        Drawable drawable;
        this.b.a();
        synchronized (this.c) {
            try {
                lldVar.getClass();
                int i2 = this.f.i;
                if (i2 <= i) {
                    Log.w("Glide", "Load failed for [" + this.g + "] with dimensions [" + this.x + "x" + this.y + "]", lldVar);
                    if (i2 <= 4) {
                        lldVar.d();
                    }
                }
                this.r = null;
                this.B = 5;
                p0o p0oVar = this.d;
                if (p0oVar != null) {
                    p0oVar.g(this);
                }
                boolean z2 = true;
                this.z = true;
                try {
                    List<vbp> list = this.n;
                    if (list != null) {
                        z = false;
                        for (vbp vbpVar : list) {
                            Object obj = this.g;
                            j6s j6sVar = this.m;
                            p0o p0oVar2 = this.d;
                            if (p0oVar2 != null) {
                                p0oVar2.getRoot().a();
                            }
                            vbpVar.getClass();
                            obj.getClass();
                            j6sVar.getClass();
                            vbpVar.a.T();
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    if (!z) {
                        p0o p0oVar3 = this.d;
                        if (p0oVar3 != null && !p0oVar3.i(this)) {
                            z2 = false;
                        }
                        if (this.g == null) {
                            if (this.w == null) {
                                this.i.getClass();
                                this.w = null;
                            }
                            drawable = this.w;
                        } else {
                            drawable = null;
                        }
                        if (drawable == null) {
                            if (this.u == null) {
                                dt2 dt2Var = this.i;
                                dt2Var.getClass();
                                this.u = null;
                                int i3 = dt2Var.d;
                                if (i3 > 0) {
                                    Context context = this.e;
                                    Resources.Theme theme = this.i.p;
                                    if (theme == null) {
                                        theme = context.getTheme();
                                    }
                                    this.u = sj2.v(context, context, i3, theme);
                                }
                            }
                            drawable = this.u;
                        }
                        if (drawable == null) {
                            drawable = h();
                        }
                        this.m.i(drawable);
                    }
                } finally {
                    this.z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x001a, B:10:0x0024, B:11:0x0030, B:13:0x0034, B:14:0x003c, B:17:0x0041, B:18:0x004b, B:21:0x004d, B:25:0x0055, B:26:0x005a, B:28:0x005c, B:31:0x0072, B:33:0x007e, B:34:0x008b, B:37:0x00aa, B:39:0x00ae, B:40:0x00c8, B:42:0x0091, B:44:0x0095, B:49:0x00a1, B:51:0x0086, B:52:0x0061, B:53:0x0065, B:55:0x006b, B:57:0x00ca, B:58:0x00d1, B:59:0x00d2, B:60:0x00d9), top: B:3:0x0003 }] */
    @Override // defpackage.e0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        boolean z;
        synchronized (this.c) {
            try {
                if (this.z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.b.a();
                int i = esg.b;
                this.s = SystemClock.elapsedRealtimeNanos();
                if (this.g == null) {
                    if (xut.j(this.j, this.k)) {
                        this.x = this.j;
                        this.y = this.k;
                    }
                    if (this.w == null) {
                        this.i.getClass();
                        this.w = null;
                    }
                    j(new lld("Received null model"), this.w == null ? 5 : 3);
                    return;
                }
                int i2 = this.B;
                if (i2 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i2 == 4) {
                    l(this.q, 5);
                    return;
                }
                List<vbp> list = this.n;
                if (list != null) {
                    for (vbp vbpVar : list) {
                    }
                }
                this.B = 3;
                if (xut.j(this.j, this.k)) {
                    c(this.j, this.k);
                } else {
                    this.m.a(this);
                }
                int i3 = this.B;
                if (i3 == 2 || i3 == 3) {
                    p0o p0oVar = this.d;
                    if (p0oVar != null && !p0oVar.i(this)) {
                        z = false;
                        if (z) {
                            this.m.e(h());
                        }
                    }
                    z = true;
                    if (z) {
                    }
                }
                if (C) {
                    i("finished run method in " + esg.a(this.s));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(k2o k2oVar, int i) {
        this.b.a();
        k2o k2oVar2 = null;
        try {
            synchronized (this.c) {
                try {
                    this.r = null;
                    if (k2oVar == null) {
                        j(new lld("Expected to receive a Resource<R> with an object of " + this.h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = k2oVar.get();
                    try {
                        if (obj != null && this.h.isAssignableFrom(obj.getClass())) {
                            p0o p0oVar = this.d;
                            if (p0oVar == null || p0oVar.j(this)) {
                                m(k2oVar, obj, i);
                                return;
                            }
                            this.q = null;
                            this.B = 4;
                            this.t.getClass();
                            q7b.f(k2oVar);
                        }
                        this.q = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.h);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(k2oVar);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        j(new lld(sb.toString()), 5);
                        this.t.getClass();
                        q7b.f(k2oVar);
                    } catch (Throwable th) {
                        k2oVar2 = k2oVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (k2oVar2 != null) {
                this.t.getClass();
                q7b.f(k2oVar2);
            }
            throw th3;
        }
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [kotlin.jvm.functions.Function2, uif] */
    public final void m(k2o k2oVar, Object obj, int i) {
        boolean z;
        t33 t33Var;
        p0o p0oVar = this.d;
        if (p0oVar != null) {
            p0oVar.getRoot().a();
        }
        this.B = 4;
        this.q = k2oVar;
        if (this.f.i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + su4.z(i) + " for " + this.g + " with size [" + this.x + "x" + this.y + "] in " + esg.a(this.s) + " ms");
        }
        if (p0oVar != null) {
            p0oVar.h(this);
        }
        this.z = true;
        try {
            List<vbp> list = this.n;
            j6s j6sVar = this.m;
            if (list != null) {
                z = false;
                for (vbp vbpVar : list) {
                    vbpVar.getClass();
                    j6sVar.getClass();
                    if (i == 0) {
                        throw null;
                    }
                    int D = ouj.D(i);
                    if (D != 0) {
                        if (D == 1) {
                            t33Var = t33.a;
                        } else if (D != 2 && D != 3) {
                            if (D == 4) {
                                t33Var = t33.c;
                            } else {
                                b6e.s();
                                z = true;
                            }
                        }
                        vbpVar.a.X((qq3) vbpVar.b.invoke(obj, t33Var));
                        z = true;
                    }
                    t33Var = t33.b;
                    vbpVar.a.X((qq3) vbpVar.b.invoke(obj, t33Var));
                    z = true;
                }
            } else {
                z = false;
            }
            if (!z) {
                this.o.getClass();
                j6sVar.d(obj);
            }
            this.z = false;
        } catch (Throwable th) {
            this.z = false;
            throw th;
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.c) {
            obj = this.g;
            cls = this.h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
