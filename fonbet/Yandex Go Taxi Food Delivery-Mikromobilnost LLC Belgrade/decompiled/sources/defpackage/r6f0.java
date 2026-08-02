package defpackage;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import androidx.work.impl.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class r6f0 implements t2s {
    public static final String l = hgz.o("Processor");
    public final Context b;
    public final u0e c;
    public final t951 d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    public r6f0(Context context, u0e u0eVar, t951 t951Var, WorkDatabase workDatabase) {
        this.b = context;
        this.c = u0eVar;
        this.d = t951Var;
        this.e = workDatabase;
    }

    public static boolean d(d dVar, int i) {
        if (dVar == null) {
            hgz.g().getClass();
            return false;
        }
        dVar.n.u(new WorkerStoppedException(i));
        hgz.g().getClass();
        return true;
    }

    public final void a(uko ukoVar) {
        synchronized (this.k) {
            this.j.add(ukoVar);
        }
    }

    public final d b(String str) {
        d dVar = (d) this.f.remove(str);
        boolean z = dVar != null;
        if (!z) {
            dVar = (d) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        try {
                            this.b.startService(y2x0.b(this.b));
                        } catch (Throwable th) {
                            hgz.g().f(l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return dVar;
    }

    public final d c(String str) {
        d dVar = (d) this.f.get(str);
        return dVar == null ? (d) this.g.get(str) : dVar;
    }

    public final void e(n951 n951Var) {
        this.d.d.execute(new yo90(27, this, n951Var));
    }
}
