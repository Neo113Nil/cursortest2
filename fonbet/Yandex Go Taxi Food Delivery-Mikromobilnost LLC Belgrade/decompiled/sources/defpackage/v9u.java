package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public class v9u implements gc81 {
    public final long b;
    public long c;
    public long d;
    public final Object e;

    public v9u(yp2 yp2Var) {
        this.e = yp2Var;
        long j = zp2.b;
        this.b = zp2.d;
        this.c = tje.c(0.45f, j);
        this.d = tje.c(0.9f, j);
    }

    @Override // defpackage.gc81
    public long a() {
        long j = this.d;
        if (j >= this.b && j <= this.c) {
            return ((sj8) this.e).a(j);
        }
        ny61.p();
        return 0L;
    }

    @Override // defpackage.gc81
    public long b() {
        long j = this.d;
        if (j < this.b || j > this.c) {
            ny61.p();
            return 0L;
        }
        sj8 sj8Var = (sj8) this.e;
        return ((ng61) sj8Var.y).a(j - sj8Var.b);
    }

    public synchronized Object c(Object obj) {
        lzz lzzVar;
        lzzVar = (lzz) ((LinkedHashMap) this.e).get(obj);
        return lzzVar != null ? lzzVar.a : null;
    }

    public int d(Object obj) {
        return 1;
    }

    public void e(Object obj, Object obj2) {
    }

    public synchronized Object f(Object obj, Object obj2) {
        int d = d(obj2);
        long j = d;
        if (j >= this.c) {
            e(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.d += j;
        }
        lzz lzzVar = (lzz) ((LinkedHashMap) this.e).put(obj, obj2 == null ? null : new lzz(d, obj2));
        if (lzzVar != null) {
            this.d -= lzzVar.b;
            if (!lzzVar.a.equals(obj2)) {
                e(obj, lzzVar.a);
            }
        }
        h(this.c);
        return lzzVar != null ? lzzVar.a : null;
    }

    public pzt g(dxt dxtVar) {
        yp2 yp2Var = (yp2) this.e;
        if (dxtVar != null) {
            String str = dxtVar.b;
            String str2 = dxtVar.a;
            if (str2 != null && str != null) {
                long j = up2.b;
                wp2 g = ly3.g(j, yp2Var, str2);
                if (jl40.l(g, new up2(j))) {
                    g = null;
                }
                wp2 g2 = ly3.g(j, yp2Var, str);
                return new pzt(g, jl40.l(g2, new up2(j)) ? null : g2, dxtVar.c);
            }
        }
        return null;
    }

    public synchronized void h(long j) {
        while (this.d > j) {
            Iterator it = ((LinkedHashMap) this.e).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            lzz lzzVar = (lzz) entry.getValue();
            this.d -= lzzVar.b;
            Object key = entry.getKey();
            it.remove();
            e(key, lzzVar.a);
        }
    }

    @Override // defpackage.gc81
    public boolean next() {
        long j = this.d + 1;
        this.d = j;
        return !(j > this.c);
    }

    public v9u(sj8 sj8Var, long j, long j2) {
        this.b = j;
        this.c = j2;
        this.d = j - 1;
        this.e = sj8Var;
    }

    public v9u(long j) {
        this.e = new LinkedHashMap(100, 0.75f, true);
        this.b = j;
        this.c = j;
    }
}
