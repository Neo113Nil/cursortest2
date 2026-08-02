package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes12.dex */
public final class qow implements oow {
    public final czf0 a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();

    public qow(czf0 czf0Var) {
        this.a = czf0Var;
    }

    public final void a(String str) {
        pow powVar = (pow) this.c.remove(str);
        if (powVar == null) {
            return;
        }
        this.b.removeCallbacks(powVar.c);
    }

    public final void b(String str) {
        for (Map.Entry entry : this.c.entrySet()) {
            String str2 = (String) entry.getKey();
            if (jl40.l(((pow) entry.getValue()).a, str)) {
                a(str2);
            }
        }
    }

    public final void c(row rowVar) {
        String str = rowVar.c;
        pow powVar = (pow) this.c.remove(str);
        if (powVar == null) {
            return;
        }
        this.b.removeCallbacks(powVar.c);
        long elapsedRealtime = SystemClock.elapsedRealtime() - powVar.b;
        this.a.getClass();
        czf0.a(elapsedRealtime, str);
        this.d.add(str);
    }

    public final void d(row rowVar) {
        if (rowVar instanceof g270 ? true ^ this.d.contains(rowVar.c) : true) {
            String str = rowVar.c;
            long j = rowVar.b;
            a(str);
            Exception exc = (Exception) rowVar.d.invoke(Long.valueOf(j));
            String str2 = rowVar.a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            p7h p7hVar = new p7h(24, this, rowVar, exc);
            this.c.put(rowVar.c, new pow(str2, elapsedRealtime, p7hVar));
            this.b.postDelayed(p7hVar, j);
        }
    }
}
