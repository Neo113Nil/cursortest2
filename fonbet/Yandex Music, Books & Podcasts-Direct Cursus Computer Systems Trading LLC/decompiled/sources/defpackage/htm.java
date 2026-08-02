package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class htm {
    public static final String l = jsg.n("Processor");
    public final Context b;
    public final r46 c;
    public final j4w d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    public htm(Context context, r46 r46Var, j4w j4wVar, WorkDatabase workDatabase) {
        this.b = context;
        this.c = r46Var;
        this.d = j4wVar;
        this.e = workDatabase;
    }

    public static boolean d(String str, n5w n5wVar, int i) {
        String str2 = l;
        if (n5wVar == null) {
            jsg.j().e(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        n5wVar.m.t(new c5w(i));
        jsg.j().e(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(rob robVar) {
        synchronized (this.k) {
            this.j.add(robVar);
        }
    }

    public final n5w b(String str) {
        n5w n5wVar = (n5w) this.f.remove(str);
        boolean z = n5wVar != null;
        if (!z) {
            n5wVar = (n5w) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        Context context = this.b;
                        String str2 = fzr.j;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.b.startService(intent);
                        } catch (Throwable th) {
                            jsg.j().h(l, "Unable to stop foreground service", th);
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
        return n5wVar;
    }

    public final n5w c(String str) {
        n5w n5wVar = (n5w) this.f.get(str);
        return n5wVar == null ? (n5w) this.g.get(str) : n5wVar;
    }
}
