package defpackage;

import android.os.SystemClock;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ck7 {
    public long a;
    public long b;
    public Serializable c;

    public ck7(long j) {
        this.c = new LinkedHashMap(100, 0.75f, true);
        this.a = j;
    }

    public synchronized Object a(Object obj) {
        d0h d0hVar;
        d0hVar = (d0h) ((LinkedHashMap) this.c).get(obj);
        return d0hVar != null ? d0hVar.a : null;
    }

    public int b(Object obj) {
        return 1;
    }

    public synchronized Object d(Object obj, Object obj2) {
        int b = b(obj2);
        long j = b;
        if (j >= this.a) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.b += j;
        }
        d0h d0hVar = (d0h) ((LinkedHashMap) this.c).put(obj, obj2 == null ? null : new d0h(b, obj2));
        if (d0hVar != null) {
            this.b -= d0hVar.b;
            if (!d0hVar.a.equals(obj2)) {
                c(obj, d0hVar.a);
            }
        }
        f(this.a);
        return d0hVar != null ? d0hVar.a : null;
    }

    public void e(Exception exc) {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.c) == null) {
            this.c = exc;
        }
        if (this.a == -9223372036854775807L) {
            synchronized (gk7.j0) {
                z = gk7.l0 > 0;
            }
            if (!z) {
                this.a = 200 + elapsedRealtime;
            }
        }
        long j = this.a;
        if (j == -9223372036854775807L || elapsedRealtime < j) {
            this.b = elapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.c;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.c;
        this.c = null;
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
        throw exc3;
    }

    public synchronized void f(long j) {
        while (this.b > j) {
            Iterator it = ((LinkedHashMap) this.c).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            d0h d0hVar = (d0h) entry.getValue();
            this.b -= d0hVar.b;
            Object key = entry.getKey();
            it.remove();
            c(key, d0hVar.a);
        }
    }

    public ck7() {
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public void c(Object obj, Object obj2) {
    }
}
