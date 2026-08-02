package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y8r {
    public static final cta p = new cta(1);
    public static final cta q = new cta(2);
    public static final cta r = new cta(3);
    public static final cta s = new cta(4);
    public static final cta t = new cta(5);
    public static final cta u = new cta(0);
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final y2x e;
    public boolean f;
    public float g;
    public float h;
    public long i;
    public float j;
    public final ArrayList k;
    public final ArrayList l;
    public z8r m;
    public float n;
    public boolean o;

    public y8r(Object obj, y2x y2xVar) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = obj;
        this.e = y2xVar;
        if (y2xVar == r || y2xVar == s || y2xVar == t) {
            this.j = 0.1f;
        } else if (y2xVar == u) {
            this.j = 0.00390625f;
        } else if (y2xVar == p || y2xVar == q) {
            this.j = 0.002f;
        } else {
            this.j = 1.0f;
        }
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }

    public static hm0 b() {
        ThreadLocal threadLocal = hm0.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new hm0(new xiu(5)));
        }
        return (hm0) threadLocal.get();
    }

    public final void a(float f) {
        if (this.f) {
            this.n = f;
            return;
        }
        if (this.m == null) {
            this.m = new z8r(f);
        }
        z8r z8rVar = this.m;
        double d = f;
        z8rVar.i = d;
        double d2 = (float) d;
        if (d2 > this.g) {
            qq6.d("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d2 < this.h) {
            qq6.d("Final position of the spring cannot be less than the min value.");
            return;
        }
        double abs = Math.abs(this.j * 0.75f);
        z8rVar.d = abs;
        z8rVar.e = abs * 62.5d;
        xiu xiuVar = b().e;
        xiuVar.getClass();
        if (Thread.currentThread() != ((Looper) xiuVar.c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.f;
        if (z || z) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.b = this.e.A(this.d);
        }
        float f2 = this.b;
        if (f2 > this.g || f2 < this.h) {
            xq0.x("Starting value need to be in between min value and max value");
        } else {
            b().a(this);
        }
    }

    public final void c(float f) {
        ArrayList arrayList;
        this.e.Y(this.d, f);
        int i = 0;
        while (true) {
            arrayList = this.l;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                w7t w7tVar = (w7t) arrayList.get(i);
                float f2 = this.b;
                n8t n8tVar = w7tVar.h;
                long max = Math.max(-1L, Math.min(n8tVar.A + 1, Math.round(f2)));
                n8tVar.L(max, w7tVar.a);
                w7tVar.a = max;
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void d() {
        if (this.m.b <= 0.0d) {
            qq6.d("Spring animations can only come to an end when there is damping");
            return;
        }
        xiu xiuVar = b().e;
        xiuVar.getClass();
        if (Thread.currentThread() != ((Looper) xiuVar.c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f) {
            this.o = true;
        }
    }

    public y8r(ejc ejcVar) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = null;
        this.e = new dta(ejcVar);
        this.j = 1.0f;
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }
}
