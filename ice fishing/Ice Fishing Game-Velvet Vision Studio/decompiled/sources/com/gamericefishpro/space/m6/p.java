package com.gamericefishpro.space.m6;

import android.content.Context;
import android.database.Cursor;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.gamericefishpro.space.l6.a0;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.l6.y;
import com.gamericefishpro.space.s5.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Runnable {
    public static final String L = q.d("WorkerWrapper");
    public final com.gamericefishpro.space.l6.c B;
    public final f C;
    public final WorkDatabase D;
    public final com.gamericefishpro.space.u6.q E;
    public final com.gamericefishpro.space.u6.c F;
    public final ArrayList G;
    public String H;
    public volatile boolean K;
    public final Context d;
    public final String e;
    public final List i;
    public final com.gamericefishpro.space.a8.c v;
    public final com.gamericefishpro.space.u6.p w;
    public com.gamericefishpro.space.l6.p y;
    public final com.gamericefishpro.space.r5.b z;
    public com.gamericefishpro.space.l6.o A = new com.gamericefishpro.space.l6.l();
    public final com.gamericefishpro.space.w6.j I = new com.gamericefishpro.space.w6.j();
    public final com.gamericefishpro.space.w6.j J = new com.gamericefishpro.space.w6.j();

    public p(com.gamericefishpro.space.i8.h hVar) {
        this.d = hVar.a;
        this.z = (com.gamericefishpro.space.r5.b) hVar.c;
        this.C = (f) hVar.b;
        com.gamericefishpro.space.u6.p pVar = (com.gamericefishpro.space.u6.p) hVar.f;
        this.w = pVar;
        this.e = pVar.a;
        this.i = (List) hVar.g;
        this.v = (com.gamericefishpro.space.a8.c) hVar.i;
        this.y = null;
        this.B = (com.gamericefishpro.space.l6.c) hVar.d;
        WorkDatabase workDatabase = (WorkDatabase) hVar.e;
        this.D = workDatabase;
        this.E = workDatabase.B();
        this.F = workDatabase.w();
        this.G = (ArrayList) hVar.h;
    }

    public final void a(com.gamericefishpro.space.l6.o oVar) {
        boolean z = oVar instanceof com.gamericefishpro.space.l6.n;
        com.gamericefishpro.space.u6.p pVar = this.w;
        if (!z) {
            if (oVar instanceof com.gamericefishpro.space.l6.m) {
                q.c().getClass();
                c();
                return;
            }
            q.c().getClass();
            if (pVar.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        q.c().getClass();
        if (pVar.c()) {
            d();
            return;
        }
        com.gamericefishpro.space.u6.c cVar = this.F;
        String str = this.e;
        com.gamericefishpro.space.u6.q qVar = this.E;
        WorkDatabase workDatabase = this.D;
        workDatabase.c();
        try {
            qVar.r(y.i, str);
            qVar.q(str, ((com.gamericefishpro.space.l6.n) this.A).a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayListH = cVar.h(str);
            int size = arrayListH.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListH.get(i);
                i++;
                String str2 = (String) obj;
                if (qVar.k(str2) == y.w) {
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.d;
                    v vVarB = v.b(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str2 == null) {
                        vVarB.p(1);
                    } else {
                        vVarB.i(1, str2);
                    }
                    workDatabase_Impl.b();
                    Cursor cursorL = com.gamericefishpro.space.hj.c.L(workDatabase_Impl, vVarB);
                    try {
                        boolean z2 = cursorL.moveToFirst() && cursorL.getInt(0) != 0;
                        cursorL.close();
                        vVarB.c();
                        if (z2) {
                            q.c().getClass();
                            qVar.r(y.d, str2);
                            qVar.p(str2, jCurrentTimeMillis);
                        }
                    } catch (Throwable th) {
                        cursorL.close();
                        vVarB.c();
                        throw th;
                    }
                }
            }
            workDatabase.u();
            workDatabase.q();
            e(false);
        } catch (Throwable th2) {
            workDatabase.q();
            e(false);
            throw th2;
        }
    }

    public final void b() {
        boolean zH = h();
        String str = this.e;
        WorkDatabase workDatabase = this.D;
        if (!zH) {
            workDatabase.c();
            try {
                y yVarK = this.E.k(str);
                com.gamericefishpro.space.u6.n nVarA = workDatabase.A();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) nVarA.d;
                workDatabase_Impl.b();
                com.gamericefishpro.space.u6.h hVar = (com.gamericefishpro.space.u6.h) nVarA.i;
                com.gamericefishpro.space.e6.j jVarA = hVar.a();
                if (str == null) {
                    jVarA.p(1);
                } else {
                    jVarA.i(1, str);
                }
                workDatabase_Impl.c();
                try {
                    jVarA.b();
                    workDatabase_Impl.u();
                    workDatabase_Impl.q();
                    hVar.d(jVarA);
                    if (yVarK == null) {
                        e(false);
                    } else if (yVarK == y.e) {
                        a(this.A);
                    } else if (!yVarK.a()) {
                        c();
                    }
                    workDatabase.u();
                    workDatabase.q();
                } catch (Throwable th) {
                    workDatabase_Impl.q();
                    hVar.d(jVarA);
                    throw th;
                }
            } catch (Throwable th2) {
                workDatabase.q();
                throw th2;
            }
        }
        List list = this.i;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((h) it.next()).b(str);
            }
            i.a(this.B, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.e;
        com.gamericefishpro.space.u6.q qVar = this.E;
        WorkDatabase workDatabase = this.D;
        workDatabase.c();
        try {
            qVar.r(y.d, str);
            qVar.p(str, System.currentTimeMillis());
            qVar.n(str, -1L);
            workDatabase.u();
        } finally {
            workDatabase.q();
            e(true);
        }
    }

    public final void d() {
        String str = this.e;
        com.gamericefishpro.space.u6.q qVar = this.E;
        WorkDatabase workDatabase = this.D;
        workDatabase.c();
        try {
            qVar.p(str, System.currentTimeMillis());
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) qVar.a;
            qVar.r(y.d, str);
            workDatabase_Impl.b();
            com.gamericefishpro.space.u6.h hVar = (com.gamericefishpro.space.u6.h) qVar.i;
            com.gamericefishpro.space.e6.j jVarA = hVar.a();
            if (str == null) {
                jVarA.p(1);
            } else {
                jVarA.i(1, str);
            }
            workDatabase_Impl.c();
            try {
                jVarA.b();
                workDatabase_Impl.u();
                workDatabase_Impl.q();
                hVar.d(jVarA);
                workDatabase_Impl.b();
                com.gamericefishpro.space.u6.h hVar2 = (com.gamericefishpro.space.u6.h) qVar.e;
                com.gamericefishpro.space.e6.j jVarA2 = hVar2.a();
                if (str == null) {
                    jVarA2.p(1);
                } else {
                    jVarA2.i(1, str);
                }
                workDatabase_Impl.c();
                try {
                    jVarA2.b();
                    workDatabase_Impl.u();
                    workDatabase_Impl.q();
                    hVar2.d(jVarA2);
                    qVar.n(str, -1L);
                    workDatabase.u();
                    workDatabase.q();
                    e(false);
                } catch (Throwable th) {
                    workDatabase_Impl.q();
                    hVar2.d(jVarA2);
                    throw th;
                }
            } catch (Throwable th2) {
                workDatabase_Impl.q();
                hVar.d(jVarA);
                throw th2;
            }
        } catch (Throwable th3) {
            workDatabase.q();
            e(false);
            throw th3;
        }
    }

    public final void e(boolean z) {
        boolean zContainsKey;
        this.D.c();
        try {
            com.gamericefishpro.space.u6.q qVarB = this.D.B();
            qVarB.getClass();
            v vVarB = v.b(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) qVarB.a;
            workDatabase_Impl.b();
            Cursor cursorL = com.gamericefishpro.space.hj.c.L(workDatabase_Impl, vVarB);
            try {
                boolean z2 = cursorL.moveToFirst() && cursorL.getInt(0) != 0;
                cursorL.close();
                vVarB.c();
                if (!z2) {
                    com.gamericefishpro.space.v6.j.a(this.d, RescheduleReceiver.class, false);
                }
                if (z) {
                    this.E.r(y.d, this.e);
                    this.E.n(this.e, -1L);
                }
                if (this.w != null && this.y != null) {
                    f fVar = this.C;
                    String str = this.e;
                    synchronized (fVar.E) {
                        zContainsKey = fVar.y.containsKey(str);
                    }
                    if (zContainsKey) {
                        f fVar2 = this.C;
                        String str2 = this.e;
                        synchronized (fVar2.E) {
                            fVar2.y.remove(str2);
                            fVar2.i();
                        }
                    }
                }
                this.D.u();
                this.D.q();
                this.I.i(Boolean.valueOf(z));
            } catch (Throwable th) {
                cursorL.close();
                vVarB.c();
                throw th;
            }
        } catch (Throwable th2) {
            this.D.q();
            throw th2;
        }
    }

    public final void f() {
        y yVarK = this.E.k(this.e);
        if (yVarK == y.e) {
            q.c().getClass();
            e(true);
        } else {
            q qVarC = q.c();
            Objects.toString(yVarK);
            qVarC.getClass();
            e(false);
        }
    }

    public final void g() {
        String str = this.e;
        WorkDatabase workDatabase = this.D;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean zIsEmpty = linkedList.isEmpty();
                com.gamericefishpro.space.u6.q qVar = this.E;
                if (zIsEmpty) {
                    qVar.q(str, ((com.gamericefishpro.space.l6.l) this.A).a);
                    workDatabase.u();
                    return;
                } else {
                    String str2 = (String) linkedList.remove();
                    if (qVar.k(str2) != y.y) {
                        qVar.r(y.v, str2);
                    }
                    linkedList.addAll(this.F.h(str2));
                }
            }
        } finally {
            workDatabase.q();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.K) {
            return false;
        }
        q.c().getClass();
        y yVarK = this.E.k(this.e);
        if (yVarK == null) {
            e(false);
            return true;
        }
        e(!yVarK.a());
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007c A[Catch: all -> 0x0068, TryCatch #2 {all -> 0x0068, blocks: (B:13:0x004d, B:16:0x0057, B:21:0x006b, B:23:0x0071, B:34:0x0099, B:29:0x007c, B:31:0x0088), top: B:105:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0088 A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #2 {all -> 0x0068, blocks: (B:13:0x004d, B:16:0x0057, B:21:0x006b, B:23:0x0071, B:34:0x0099, B:29:0x007c, B:31:0x0088), top: B:105:0x004d }] */
    @Override // java.lang.Runnable
    public final void run() {
        com.gamericefishpro.space.l6.j jVar;
        com.gamericefishpro.space.l6.g gVarA;
        boolean z;
        StringBuilder sb = new StringBuilder("Work [ id=");
        String str = this.e;
        sb.append(str);
        sb.append(", tags={ ");
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        boolean z2 = true;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = (String) obj;
            if (z2) {
                z2 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str2);
        }
        sb.append(" } ]");
        this.H = sb.toString();
        com.gamericefishpro.space.u6.p pVar = this.w;
        if (h()) {
            return;
        }
        WorkDatabase workDatabase = this.D;
        workDatabase.c();
        try {
            y yVar = pVar.b;
            int i2 = pVar.k;
            String str3 = pVar.c;
            y yVar2 = y.d;
            if (yVar != yVar2) {
                f();
                workDatabase.u();
                q.c().getClass();
                workDatabase.q();
                return;
            }
            if (!pVar.c()) {
                if (pVar.b == yVar2 && i2 > 0) {
                    if (System.currentTimeMillis() < pVar.a()) {
                        q.c().getClass();
                        e(true);
                        workDatabase.u();
                        workDatabase.q();
                        return;
                    }
                }
            } else if (System.currentTimeMillis() < pVar.a()) {
                q.c().getClass();
                e(true);
                workDatabase.u();
                workDatabase.q();
                return;
            }
            workDatabase.u();
            workDatabase.q();
            boolean zC = pVar.c();
            com.gamericefishpro.space.u6.q qVar = this.E;
            String str4 = L;
            com.gamericefishpro.space.l6.c cVar = this.B;
            if (zC) {
                gVarA = pVar.e;
                yVar2 = yVar2;
            } else {
                com.gamericefishpro.space.ka.f fVar = cVar.d;
                String str5 = pVar.d;
                fVar.getClass();
                String str6 = com.gamericefishpro.space.l6.j.a;
                try {
                    jVar = (com.gamericefishpro.space.l6.j) Class.forName(str5).getDeclaredConstructor(null).newInstance(null);
                } catch (Exception e) {
                    q.c().b(com.gamericefishpro.space.l6.j.a, "Trouble instantiating + " + str5, e);
                    jVar = null;
                }
                if (jVar == null) {
                    q.c().a(str4, "Could not create Input Merger " + pVar.d);
                    g();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(pVar.e);
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) qVar.a;
                v vVarB = v.b(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                if (str == null) {
                    vVarB.p(1);
                } else {
                    vVarB.i(1, str);
                }
                workDatabase_Impl.b();
                Cursor cursorL = com.gamericefishpro.space.hj.c.L(workDatabase_Impl, vVarB);
                try {
                    ArrayList arrayList3 = new ArrayList(cursorL.getCount());
                    while (cursorL.moveToNext()) {
                        arrayList3.add(com.gamericefishpro.space.l6.g.a(cursorL.isNull(0) ? null : cursorL.getBlob(0)));
                    }
                    cursorL.close();
                    vVarB.c();
                    arrayList2.addAll(arrayList3);
                    gVarA = jVar.a(arrayList2);
                } catch (Throwable th) {
                    cursorL.close();
                    vVarB.c();
                    throw th;
                }
            }
            UUID uuidFromString = UUID.fromString(str);
            ExecutorService executorService = cVar.a;
            a0 a0Var = cVar.c;
            com.gamericefishpro.space.r5.b bVar = this.z;
            com.gamericefishpro.space.v6.q qVar2 = new com.gamericefishpro.space.v6.q(workDatabase, bVar);
            com.gamericefishpro.space.v6.p pVar2 = new com.gamericefishpro.space.v6.p(workDatabase, this.C, bVar);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.a = uuidFromString;
            workerParameters.b = gVarA;
            workerParameters.c = new HashSet(arrayList);
            workerParameters.d = this.v;
            workerParameters.e = i2;
            workerParameters.f = executorService;
            workerParameters.g = bVar;
            workerParameters.h = a0Var;
            workerParameters.i = qVar2;
            workerParameters.j = pVar2;
            if (this.y == null) {
                this.y = a0Var.a(this.d, str3, workerParameters);
            }
            com.gamericefishpro.space.l6.p pVar3 = this.y;
            if (pVar3 == null) {
                q.c().a(str4, "Could not create Worker " + str3);
                g();
                return;
            }
            if (pVar3.isUsed()) {
                q.c().a(str4, "Received an already-used Worker " + str3 + "; Worker Factory should return new instances");
                g();
                return;
            }
            this.y.setUsed();
            workDatabase.c();
            try {
                if (qVar.k(str) == yVar2) {
                    qVar.r(y.e, str);
                    WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) qVar.a;
                    workDatabase_Impl2.b();
                    com.gamericefishpro.space.u6.h hVar = (com.gamericefishpro.space.u6.h) qVar.h;
                    com.gamericefishpro.space.e6.j jVarA = hVar.a();
                    if (str == null) {
                        jVarA.p(1);
                    } else {
                        jVarA.i(1, str);
                    }
                    workDatabase_Impl2.c();
                    try {
                        jVarA.b();
                        workDatabase_Impl2.u();
                        workDatabase_Impl2.q();
                        hVar.d(jVarA);
                        z = true;
                    } catch (Throwable th2) {
                        workDatabase_Impl2.q();
                        hVar.d(jVarA);
                        throw th2;
                    }
                } else {
                    z = false;
                }
                workDatabase.u();
                workDatabase.q();
                if (!z) {
                    f();
                    return;
                }
                if (h()) {
                    return;
                }
                com.gamericefishpro.space.v6.o oVar = new com.gamericefishpro.space.v6.o(this.d, this.w, this.y, pVar2, this.z);
                ((com.gamericefishpro.space.c8.p) bVar.v).execute(oVar);
                com.gamericefishpro.space.w6.j jVar2 = oVar.d;
                com.gamericefishpro.space.bb.h hVar2 = new com.gamericefishpro.space.bb.h(8, this, jVar2);
                com.gamericefishpro.space.r9.n nVar = new com.gamericefishpro.space.r9.n(1);
                com.gamericefishpro.space.w6.j jVar3 = this.J;
                jVar3.a(hVar2, nVar);
                boolean z3 = false;
                jVar2.a(new com.gamericefishpro.space.va.a(4, this, jVar2, z3), (com.gamericefishpro.space.c8.p) bVar.v);
                jVar3.a(new com.gamericefishpro.space.va.a(5, this, this.H, z3), (com.gamericefishpro.space.s5.y) bVar.e);
            } catch (Throwable th3) {
                workDatabase.q();
                throw th3;
            }
        } catch (Throwable th4) {
            workDatabase.q();
            throw th4;
        }
    }
}
