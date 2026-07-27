package K0;

import B2.RunnableC0272f;
import D.y;
import J0.r;
import J0.s;
import J0.z;
import N2.A;
import android.content.Context;
import android.database.Cursor;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.android.gms.internal.ads.CL;
import com.google.android.gms.internal.consent_sdk.C4313b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import t0.AbstractC5051n;
import u0.C5098i;
import z0.C5266i;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: L, reason: collision with root package name */
    public static final String f1539L = s.f("WorkerWrapper");

    /* renamed from: B, reason: collision with root package name */
    public final J0.b f1541B;

    /* renamed from: C, reason: collision with root package name */
    public final f f1542C;

    /* renamed from: D, reason: collision with root package name */
    public final WorkDatabase f1543D;

    /* renamed from: E, reason: collision with root package name */
    public final S0.q f1544E;

    /* renamed from: F, reason: collision with root package name */
    public final S0.c f1545F;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f1546G;

    /* renamed from: H, reason: collision with root package name */
    public String f1547H;

    /* renamed from: K, reason: collision with root package name */
    public volatile boolean f1549K;

    /* renamed from: n, reason: collision with root package name */
    public final Context f1550n;

    /* renamed from: u, reason: collision with root package name */
    public final String f1551u;

    /* renamed from: v, reason: collision with root package name */
    public final List f1552v;

    /* renamed from: w, reason: collision with root package name */
    public final Y2.e f1553w;

    /* renamed from: x, reason: collision with root package name */
    public final S0.p f1554x;

    /* renamed from: y, reason: collision with root package name */
    public r f1555y;

    /* renamed from: z, reason: collision with root package name */
    public final Y2.e f1556z;

    /* renamed from: A, reason: collision with root package name */
    public J0.q f1540A = new J0.n();

    /* renamed from: I, reason: collision with root package name */
    public final U0.k f1548I = new U0.k();
    public final U0.k J = new U0.k();

    public q(C4313b c4313b) {
        this.f1550n = (Context) c4313b.f35811a;
        this.f1556z = (Y2.e) c4313b.f35813c;
        this.f1542C = (f) c4313b.f35812b;
        S0.p pVar = (S0.p) c4313b.f35816f;
        this.f1554x = pVar;
        this.f1551u = pVar.f2920a;
        this.f1552v = (List) c4313b.f35817g;
        this.f1553w = (Y2.e) c4313b.i;
        this.f1555y = null;
        this.f1541B = (J0.b) c4313b.f35814d;
        WorkDatabase workDatabase = (WorkDatabase) c4313b.f35815e;
        this.f1543D = workDatabase;
        this.f1544E = workDatabase.t();
        this.f1545F = workDatabase.f();
        this.f1546G = (ArrayList) c4313b.f35818h;
    }

    public final void a(J0.q qVar) {
        boolean z8 = qVar instanceof J0.p;
        S0.p pVar = this.f1554x;
        String str = f1539L;
        if (!z8) {
            if (qVar instanceof J0.o) {
                s.d().e(str, "Worker result RETRY for " + this.f1547H);
                c();
                return;
            }
            s.d().e(str, "Worker result FAILURE for " + this.f1547H);
            if (pVar.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        s.d().e(str, "Worker result SUCCESS for " + this.f1547H);
        if (pVar.c()) {
            d();
            return;
        }
        S0.c cVar = this.f1545F;
        String str2 = this.f1551u;
        S0.q qVar2 = this.f1544E;
        WorkDatabase workDatabase = this.f1543D;
        workDatabase.c();
        try {
            qVar2.m(3, str2);
            qVar2.l(str2, ((J0.p) this.f1540A).f1327a);
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = cVar.v(str2).iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (qVar2.e(str3) == 5) {
                    C5098i a9 = C5098i.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        a9.o(1);
                    } else {
                        a9.c(1, str3);
                    }
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f2886u;
                    workDatabase_Impl.b();
                    Cursor m8 = workDatabase_Impl.m(a9);
                    try {
                        if (m8.moveToFirst() && m8.getInt(0) != 0) {
                            s.d().e(str, "Setting status to enqueued for " + str3);
                            qVar2.m(1, str3);
                            qVar2.k(str3, currentTimeMillis);
                        }
                    } finally {
                        m8.close();
                        a9.j();
                    }
                }
            }
            workDatabase.o();
            workDatabase.k();
            e(false);
        } catch (Throwable th) {
            workDatabase.k();
            e(false);
            throw th;
        }
    }

    public final void b() {
        boolean h9 = h();
        WorkDatabase workDatabase = this.f1543D;
        String str = this.f1551u;
        if (!h9) {
            workDatabase.c();
            try {
                int e6 = this.f1544E.e(str);
                S0.n s3 = workDatabase.s();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) s3.f2914n;
                workDatabase_Impl.b();
                S0.h hVar = (S0.h) s3.f2916v;
                C5266i a9 = hVar.a();
                if (str == null) {
                    a9.o(1);
                } else {
                    a9.c(1, str);
                }
                workDatabase_Impl.c();
                try {
                    a9.b();
                    workDatabase_Impl.o();
                    if (e6 == 0) {
                        e(false);
                    } else if (e6 == 2) {
                        a(this.f1540A);
                    } else if (!y.b(e6)) {
                        c();
                    }
                    workDatabase.o();
                    workDatabase.k();
                } finally {
                    workDatabase_Impl.k();
                    hVar.n(a9);
                }
            } catch (Throwable th) {
                workDatabase.k();
                throw th;
            }
        }
        List list = this.f1552v;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((h) it.next()).d(str);
            }
            i.a(this.f1541B, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f1551u;
        S0.q qVar = this.f1544E;
        WorkDatabase workDatabase = this.f1543D;
        workDatabase.c();
        try {
            qVar.m(1, str);
            qVar.k(str, System.currentTimeMillis());
            qVar.i(str, -1L);
            workDatabase.o();
        } finally {
            workDatabase.k();
            e(true);
        }
    }

    public final void d() {
        String str = this.f1551u;
        S0.q qVar = this.f1544E;
        WorkDatabase workDatabase = this.f1543D;
        workDatabase.c();
        try {
            qVar.k(str, System.currentTimeMillis());
            qVar.m(1, str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) qVar.f2939a;
            workDatabase_Impl.b();
            S0.h hVar = (S0.h) qVar.i;
            C5266i a9 = hVar.a();
            if (str == null) {
                a9.o(1);
            } else {
                a9.c(1, str);
            }
            workDatabase_Impl.c();
            try {
                a9.b();
                workDatabase_Impl.o();
                workDatabase_Impl.k();
                hVar.n(a9);
                workDatabase_Impl.b();
                hVar = (S0.h) qVar.f2943e;
                a9 = hVar.a();
                if (str == null) {
                    a9.o(1);
                } else {
                    a9.c(1, str);
                }
                workDatabase_Impl.c();
                try {
                    a9.b();
                    workDatabase_Impl.o();
                    workDatabase_Impl.k();
                    hVar.n(a9);
                    qVar.i(str, -1L);
                    workDatabase.o();
                } finally {
                }
            } finally {
            }
        } finally {
            workDatabase.k();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0046, B:15:0x0056, B:17:0x005a, B:19:0x005e, B:20:0x0064, B:25:0x006e, B:26:0x0074, B:34:0x0081, B:39:0x0084, B:40:0x0085, B:46:0x0099, B:47:0x009f, B:22:0x0065, B:23:0x006b, B:28:0x0075, B:29:0x007d, B:5:0x0020, B:7:0x0027), top: B:2:0x0005, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0046, B:15:0x0056, B:17:0x005a, B:19:0x005e, B:20:0x0064, B:25:0x006e, B:26:0x0074, B:34:0x0081, B:39:0x0084, B:40:0x0085, B:46:0x0099, B:47:0x009f, B:22:0x0065, B:23:0x006b, B:28:0x0075, B:29:0x007d, B:5:0x0020, B:7:0x0027), top: B:2:0x0005, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(boolean z8) {
        boolean z9;
        f fVar;
        boolean containsKey;
        this.f1543D.c();
        try {
            S0.q t9 = this.f1543D.t();
            t9.getClass();
            C5098i a9 = C5098i.a(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) t9.f2939a;
            workDatabase_Impl.b();
            Cursor m8 = workDatabase_Impl.m(a9);
            try {
                if (m8.moveToFirst()) {
                    if (m8.getInt(0) != 0) {
                        z9 = true;
                        if (!z9) {
                            T0.j.a(this.f1550n, RescheduleReceiver.class, false);
                        }
                        if (z8) {
                            this.f1544E.m(1, this.f1551u);
                            this.f1544E.i(this.f1551u, -1L);
                        }
                        if (this.f1554x != null && this.f1555y != null) {
                            fVar = this.f1542C;
                            String str = this.f1551u;
                            synchronized (fVar.f1503E) {
                                containsKey = fVar.f1509y.containsKey(str);
                            }
                            if (containsKey) {
                                f fVar2 = this.f1542C;
                                String str2 = this.f1551u;
                                synchronized (fVar2.f1503E) {
                                    fVar2.f1509y.remove(str2);
                                    fVar2.i();
                                }
                            }
                        }
                        this.f1543D.o();
                        this.f1543D.k();
                        this.f1548I.j(Boolean.valueOf(z8));
                    }
                }
                z9 = false;
                if (!z9) {
                }
                if (z8) {
                }
                if (this.f1554x != null) {
                    fVar = this.f1542C;
                    String str3 = this.f1551u;
                    synchronized (fVar.f1503E) {
                    }
                }
                this.f1543D.o();
                this.f1543D.k();
                this.f1548I.j(Boolean.valueOf(z8));
            } finally {
                m8.close();
                a9.j();
            }
        } catch (Throwable th) {
            this.f1543D.k();
            throw th;
        }
    }

    public final void f() {
        S0.q qVar = this.f1544E;
        String str = this.f1551u;
        int e6 = qVar.e(str);
        String str2 = f1539L;
        if (e6 == 2) {
            s.d().a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        s d2 = s.d();
        StringBuilder m8 = CL.m("Status for ", str, " is ");
        m8.append(y.t(e6));
        m8.append(" ; not doing any work");
        d2.a(str2, m8.toString());
        e(false);
    }

    public final void g() {
        String str = this.f1551u;
        WorkDatabase workDatabase = this.f1543D;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean isEmpty = linkedList.isEmpty();
                S0.q qVar = this.f1544E;
                if (isEmpty) {
                    qVar.l(str, ((J0.n) this.f1540A).f1326a);
                    workDatabase.o();
                    return;
                } else {
                    String str2 = (String) linkedList.remove();
                    if (qVar.e(str2) != 6) {
                        qVar.m(4, str2);
                    }
                    linkedList.addAll(this.f1545F.v(str2));
                }
            }
        } finally {
            workDatabase.k();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.f1549K) {
            return false;
        }
        s.d().a(f1539L, "Work interrupted for " + this.f1547H);
        if (this.f1544E.e(this.f1551u) == 0) {
            e(false);
            return true;
        }
        e(!y.b(r0));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        if ((r6.f2921b == 1 && r6.f2929k > 0) != false) goto L31;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        J0.k kVar;
        J0.h a9;
        boolean z8;
        StringBuilder sb = new StringBuilder("Work [ id=");
        String str = this.f1551u;
        sb.append(str);
        sb.append(", tags={ ");
        ArrayList arrayList = this.f1546G;
        Iterator it = arrayList.iterator();
        boolean z9 = true;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (z9) {
                z9 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str2);
        }
        sb.append(" } ]");
        this.f1547H = sb.toString();
        S0.p pVar = this.f1554x;
        if (h()) {
            return;
        }
        WorkDatabase workDatabase = this.f1543D;
        workDatabase.c();
        try {
            int i = pVar.f2921b;
            String str3 = pVar.f2922c;
            String str4 = f1539L;
            if (i != 1) {
                f();
                workDatabase.o();
                s.d().a(str4, str3 + " is not in ENQUEUED state. Nothing more to do");
                return;
            }
            if (!pVar.c()) {
            }
            if (System.currentTimeMillis() < pVar.a()) {
                s.d().a(str4, "Delaying execution for " + str3 + " because it is being executed before schedule.");
                e(true);
                workDatabase.o();
                return;
            }
            workDatabase.o();
            workDatabase.k();
            boolean c4 = pVar.c();
            S0.q qVar = this.f1544E;
            J0.b bVar = this.f1541B;
            if (c4) {
                a9 = pVar.f2924e;
            } else {
                C3.e eVar = (C3.e) bVar.f1295g;
                String str5 = pVar.f2923d;
                eVar.getClass();
                String str6 = J0.k.f1322a;
                try {
                    kVar = (J0.k) Class.forName(str5).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e6) {
                    s.d().c(J0.k.f1322a, AbstractC5051n.f("Trouble instantiating + ", str5), e6);
                    kVar = null;
                }
                if (kVar == null) {
                    s.d().b(str4, "Could not create Input Merger " + pVar.f2923d);
                    g();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(pVar.f2924e);
                qVar.getClass();
                C5098i a10 = C5098i.a(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                if (str == null) {
                    a10.o(1);
                } else {
                    a10.c(1, str);
                }
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) qVar.f2939a;
                workDatabase_Impl.b();
                Cursor m8 = workDatabase_Impl.m(a10);
                try {
                    ArrayList arrayList3 = new ArrayList(m8.getCount());
                    while (m8.moveToNext()) {
                        arrayList3.add(J0.h.a(m8.isNull(0) ? null : m8.getBlob(0)));
                    }
                    m8.close();
                    a10.j();
                    arrayList2.addAll(arrayList3);
                    a9 = kVar.a(arrayList2);
                } catch (Throwable th) {
                    m8.close();
                    a10.j();
                    throw th;
                }
            }
            UUID fromString = UUID.fromString(str);
            ExecutorService executorService = (ExecutorService) bVar.f1292d;
            Y2.e eVar2 = this.f1556z;
            T0.s sVar = new T0.s(workDatabase, eVar2);
            T0.r rVar = new T0.r(workDatabase, this.f1542C, eVar2);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.f5469a = fromString;
            workerParameters.f5470b = a9;
            workerParameters.f5471c = new HashSet(arrayList);
            workerParameters.f5472d = this.f1553w;
            workerParameters.f5473e = pVar.f2929k;
            workerParameters.f5474f = executorService;
            workerParameters.f5475g = eVar2;
            z zVar = (z) bVar.f1294f;
            workerParameters.f5476h = zVar;
            workerParameters.i = sVar;
            workerParameters.f5477j = rVar;
            if (this.f1555y == null) {
                this.f1555y = zVar.a(this.f1550n, str3, workerParameters);
            }
            r rVar2 = this.f1555y;
            if (rVar2 == null) {
                s.d().b(str4, "Could not create Worker " + str3);
                g();
                return;
            }
            if (rVar2.isUsed()) {
                s.d().b(str4, "Received an already-used Worker " + str3 + "; Worker Factory should return new instances");
                g();
                return;
            }
            this.f1555y.setUsed();
            workDatabase.c();
            try {
                if (qVar.e(str) == 1) {
                    qVar.m(2, str);
                    WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) qVar.f2939a;
                    workDatabase_Impl2.b();
                    S0.h hVar = (S0.h) qVar.f2946h;
                    C5266i a11 = hVar.a();
                    if (str == null) {
                        z8 = true;
                        a11.o(1);
                    } else {
                        z8 = true;
                        a11.c(1, str);
                    }
                    workDatabase_Impl2.c();
                    try {
                        a11.b();
                        workDatabase_Impl2.o();
                        workDatabase_Impl2.k();
                        hVar.n(a11);
                    } catch (Throwable th2) {
                        workDatabase_Impl2.k();
                        hVar.n(a11);
                        throw th2;
                    }
                } else {
                    z8 = false;
                }
                workDatabase.o();
                if (!z8) {
                    f();
                    return;
                }
                if (h()) {
                    return;
                }
                T0.p pVar2 = new T0.p(this.f1550n, this.f1554x, this.f1555y, rVar, this.f1556z);
                ((A) eVar2.f3965w).execute(pVar2);
                U0.k kVar2 = pVar2.f3066n;
                D5.b bVar2 = new D5.b(3, this, kVar2);
                N1.f fVar = new N1.f(2);
                U0.k kVar3 = this.J;
                kVar3.c(bVar2, fVar);
                boolean z10 = false;
                kVar2.c(new RunnableC0272f(this, kVar2, 7, z10), (A) eVar2.f3965w);
                kVar3.c(new RunnableC0272f(this, this.f1547H, 8, z10), (T0.l) eVar2.f3963u);
            } catch (Throwable th3) {
                throw th3;
            }
        } finally {
            workDatabase.k();
        }
    }
}
