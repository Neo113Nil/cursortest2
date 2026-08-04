package com.gamericefishpro.space.m6;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.s5.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements c, com.gamericefishpro.space.t6.a {
    public static final String F = q.d("Processor");
    public final List B;
    public final Context e;
    public final com.gamericefishpro.space.l6.c i;
    public final com.gamericefishpro.space.r5.b v;
    public final WorkDatabase w;
    public final HashMap z = new HashMap();
    public final HashMap y = new HashMap();
    public final HashSet C = new HashSet();
    public final ArrayList D = new ArrayList();
    public PowerManager.WakeLock d = null;
    public final Object E = new Object();
    public final HashMap A = new HashMap();

    public f(Context context, com.gamericefishpro.space.l6.c cVar, com.gamericefishpro.space.r5.b bVar, WorkDatabase workDatabase, List list) {
        this.e = context;
        this.i = cVar;
        this.v = bVar;
        this.w = workDatabase;
        this.B = list;
    }

    public static boolean b(p pVar) {
        if (pVar == null) {
            q.c().getClass();
            return false;
        }
        pVar.K = true;
        pVar.h();
        pVar.J.cancel(true);
        if (pVar.y == null || !(pVar.J.d instanceof com.gamericefishpro.space.w6.a)) {
            Objects.toString(pVar.w);
            q.c().getClass();
        } else {
            pVar.y.stop();
        }
        q.c().getClass();
        return true;
    }

    public final void a(c cVar) {
        synchronized (this.E) {
            this.D.add(cVar);
        }
    }

    public final boolean c(String str) {
        boolean z;
        synchronized (this.E) {
            try {
                z = this.z.containsKey(str) || this.y.containsKey(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void d(c cVar) {
        synchronized (this.E) {
            this.D.remove(cVar);
        }
    }

    public final void e(com.gamericefishpro.space.u6.j jVar) {
        ((com.gamericefishpro.space.c8.p) this.v.v).execute(new com.gamericefishpro.space.bb.h(7, this, jVar));
    }

    @Override // com.gamericefishpro.space.m6.c
    public final void f(com.gamericefishpro.space.u6.j jVar, boolean z) {
        synchronized (this.E) {
            try {
                p pVar = (p) this.z.get(jVar.a);
                if (pVar != null && jVar.equals(a4.y(pVar.w))) {
                    this.z.remove(jVar.a);
                }
                q.c().getClass();
                ArrayList arrayList = this.D;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((c) obj).f(jVar, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(String str, com.gamericefishpro.space.l6.i iVar) {
        synchronized (this.E) {
            try {
                q.c().getClass();
                p pVar = (p) this.z.remove(str);
                if (pVar != null) {
                    if (this.d == null) {
                        PowerManager.WakeLock wakeLockA = com.gamericefishpro.space.v6.m.a(this.e, "ProcessorForegroundLck");
                        this.d = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.y.put(str, pVar);
                    this.e.startForegroundService(com.gamericefishpro.space.t6.b.b(this.e, a4.y(pVar.w), iVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(j jVar, com.gamericefishpro.space.a8.c cVar) throws Throwable {
        Throwable th;
        com.gamericefishpro.space.u6.j jVar2 = jVar.a;
        String str = jVar2.a;
        ArrayList arrayList = new ArrayList();
        com.gamericefishpro.space.u6.p pVar = (com.gamericefishpro.space.u6.p) this.w.t(new com.gamericefishpro.space.cb.f(this, arrayList, str, 1));
        if (pVar == null) {
            q.c().e(F, "Didn't find WorkSpec for id " + jVar2);
            e(jVar2);
            return false;
        }
        synchronized (this.E) {
            try {
                try {
                    try {
                        if (c(str)) {
                            Set set = (Set) this.A.get(str);
                            if (((j) set.iterator().next()).a.b == jVar2.b) {
                                set.add(jVar);
                                q qVarC = q.c();
                                jVar2.toString();
                                qVarC.getClass();
                            } else {
                                e(jVar2);
                            }
                            return false;
                        }
                        if (pVar.t != jVar2.b) {
                            e(jVar2);
                            return false;
                        }
                        com.gamericefishpro.space.i8.h hVar = new com.gamericefishpro.space.i8.h(this.e, this.i, this.v, this, this.w, pVar, arrayList);
                        hVar.g = this.B;
                        if (cVar != null) {
                            hVar.i = cVar;
                        }
                        p pVar2 = new p(hVar);
                        com.gamericefishpro.space.w6.j jVar3 = pVar2.I;
                        jVar3.a(new e(this, jVar.a, jVar3, 0), (com.gamericefishpro.space.c8.p) this.v.v);
                        this.z.put(str, pVar2);
                        HashSet hashSet = new HashSet();
                        hashSet.add(jVar);
                        this.A.put(str, hashSet);
                        ((y) this.v.e).execute(pVar2);
                        q qVarC2 = q.c();
                        jVar2.toString();
                        qVarC2.getClass();
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
            }
            throw th;
        }
    }

    public final void i() {
        synchronized (this.E) {
            try {
                if (this.y.isEmpty()) {
                    Context context = this.e;
                    String str = com.gamericefishpro.space.t6.b.C;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.e.startService(intent);
                    } catch (Throwable th) {
                        q.c().b(F, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.d;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.d = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
