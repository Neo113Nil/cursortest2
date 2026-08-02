package K0;

import D.x;
import J0.r;
import J0.y;
import Q2.A;
import android.content.Context;
import android.database.Cursor;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.Wv;
import com.google.android.gms.internal.consent_sdk.C4323b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import u0.C5060i;
import w.AbstractC5128c;
import z0.C5220i;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: L, reason: collision with root package name */
    public static final String f1650L = r.f("WorkerWrapper");

    /* renamed from: B, reason: collision with root package name */
    public final J0.b f1652B;

    /* renamed from: C, reason: collision with root package name */
    public final f f1653C;

    /* renamed from: D, reason: collision with root package name */
    public final WorkDatabase f1654D;

    /* renamed from: E, reason: collision with root package name */
    public final S0.q f1655E;

    /* renamed from: F, reason: collision with root package name */
    public final S0.c f1656F;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f1657G;

    /* renamed from: H, reason: collision with root package name */
    public String f1658H;

    /* renamed from: K, reason: collision with root package name */
    public volatile boolean f1660K;

    /* renamed from: n, reason: collision with root package name */
    public final Context f1661n;

    /* renamed from: u, reason: collision with root package name */
    public final String f1662u;

    /* renamed from: v, reason: collision with root package name */
    public final List f1663v;

    /* renamed from: w, reason: collision with root package name */
    public final b3.e f1664w;

    /* renamed from: x, reason: collision with root package name */
    public final S0.p f1665x;

    /* renamed from: y, reason: collision with root package name */
    public J0.q f1666y;

    /* renamed from: z, reason: collision with root package name */
    public final b3.e f1667z;

    /* renamed from: A, reason: collision with root package name */
    public J0.p f1651A = new J0.m();

    /* renamed from: I, reason: collision with root package name */
    public final U0.k f1659I = new U0.k();
    public final U0.k J = new U0.k();

    public q(C4323b c4323b) {
        this.f1661n = (Context) c4323b.f36417a;
        this.f1667z = (b3.e) c4323b.f36419c;
        this.f1653C = (f) c4323b.f36418b;
        S0.p pVar = (S0.p) c4323b.f36422f;
        this.f1665x = pVar;
        this.f1662u = pVar.f2937a;
        this.f1663v = (List) c4323b.f36423g;
        this.f1664w = (b3.e) c4323b.i;
        this.f1666y = null;
        this.f1652B = (J0.b) c4323b.f36420d;
        WorkDatabase workDatabase = (WorkDatabase) c4323b.f36421e;
        this.f1654D = workDatabase;
        this.f1655E = workDatabase.t();
        this.f1656F = workDatabase.f();
        this.f1657G = (ArrayList) c4323b.f36424h;
    }

    public final void a(J0.p pVar) {
        boolean z6 = pVar instanceof J0.o;
        S0.p pVar2 = this.f1665x;
        String str = f1650L;
        if (!z6) {
            if (pVar instanceof J0.n) {
                r.d().e(str, "Worker result RETRY for " + this.f1658H);
                c();
                return;
            }
            r.d().e(str, "Worker result FAILURE for " + this.f1658H);
            if (pVar2.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        r.d().e(str, "Worker result SUCCESS for " + this.f1658H);
        if (pVar2.c()) {
            d();
            return;
        }
        S0.c cVar = this.f1656F;
        String str2 = this.f1662u;
        S0.q qVar = this.f1655E;
        WorkDatabase workDatabase = this.f1654D;
        workDatabase.c();
        try {
            qVar.m(3, str2);
            qVar.l(str2, ((J0.o) this.f1651A).f1430a);
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = cVar.g(str2).iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (qVar.e(str3) == 5) {
                    C5060i a9 = C5060i.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        a9.o(1);
                    } else {
                        a9.c(1, str3);
                    }
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f2902u;
                    workDatabase_Impl.b();
                    Cursor m9 = workDatabase_Impl.m(a9);
                    try {
                        if (m9.moveToFirst() && m9.getInt(0) != 0) {
                            r.d().e(str, "Setting status to enqueued for " + str3);
                            qVar.m(1, str3);
                            qVar.k(str3, currentTimeMillis);
                        }
                    } finally {
                        m9.close();
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
        boolean h3 = h();
        WorkDatabase workDatabase = this.f1654D;
        String str = this.f1662u;
        if (!h3) {
            workDatabase.c();
            try {
                int e9 = this.f1655E.e(str);
                S0.n s9 = workDatabase.s();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) s9.f2931u;
                workDatabase_Impl.b();
                S0.h hVar = (S0.h) s9.f2933w;
                C5220i a9 = hVar.a();
                if (str == null) {
                    a9.o(1);
                } else {
                    a9.c(1, str);
                }
                workDatabase_Impl.c();
                try {
                    a9.b();
                    workDatabase_Impl.o();
                    if (e9 == 0) {
                        e(false);
                    } else if (e9 == 2) {
                        a(this.f1651A);
                    } else if (!x.b(e9)) {
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
        List list = this.f1663v;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((h) it.next()).d(str);
            }
            i.a(this.f1652B, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f1662u;
        S0.q qVar = this.f1655E;
        WorkDatabase workDatabase = this.f1654D;
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
        String str = this.f1662u;
        S0.q qVar = this.f1655E;
        WorkDatabase workDatabase = this.f1654D;
        workDatabase.c();
        try {
            qVar.k(str, System.currentTimeMillis());
            qVar.m(1, str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) qVar.f2956a;
            workDatabase_Impl.b();
            S0.h hVar = (S0.h) qVar.i;
            C5220i a9 = hVar.a();
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
                hVar = (S0.h) qVar.f2960e;
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
    public final void e(boolean z6) {
        boolean z9;
        f fVar;
        boolean containsKey;
        this.f1654D.c();
        try {
            S0.q t6 = this.f1654D.t();
            t6.getClass();
            C5060i a9 = C5060i.a(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) t6.f2956a;
            workDatabase_Impl.b();
            Cursor m9 = workDatabase_Impl.m(a9);
            try {
                if (m9.moveToFirst()) {
                    if (m9.getInt(0) != 0) {
                        z9 = true;
                        if (!z9) {
                            T0.j.a(this.f1661n, RescheduleReceiver.class, false);
                        }
                        if (z6) {
                            this.f1655E.m(1, this.f1662u);
                            this.f1655E.i(this.f1662u, -1L);
                        }
                        if (this.f1665x != null && this.f1666y != null) {
                            fVar = this.f1653C;
                            String str = this.f1662u;
                            synchronized (fVar.f1615E) {
                                containsKey = fVar.f1621y.containsKey(str);
                            }
                            if (containsKey) {
                                f fVar2 = this.f1653C;
                                String str2 = this.f1662u;
                                synchronized (fVar2.f1615E) {
                                    fVar2.f1621y.remove(str2);
                                    fVar2.i();
                                }
                            }
                        }
                        this.f1654D.o();
                        this.f1654D.k();
                        this.f1659I.j(Boolean.valueOf(z6));
                    }
                }
                z9 = false;
                if (!z9) {
                }
                if (z6) {
                }
                if (this.f1665x != null) {
                    fVar = this.f1653C;
                    String str3 = this.f1662u;
                    synchronized (fVar.f1615E) {
                    }
                }
                this.f1654D.o();
                this.f1654D.k();
                this.f1659I.j(Boolean.valueOf(z6));
            } finally {
                m9.close();
                a9.j();
            }
        } catch (Throwable th) {
            this.f1654D.k();
            throw th;
        }
    }

    public final void f() {
        S0.q qVar = this.f1655E;
        String str = this.f1662u;
        int e9 = qVar.e(str);
        String str2 = f1650L;
        if (e9 == 2) {
            r.d().a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        r d9 = r.d();
        StringBuilder l9 = Wv.l("Status for ", str, " is ");
        l9.append(x.z(e9));
        l9.append(" ; not doing any work");
        d9.a(str2, l9.toString());
        e(false);
    }

    public final void g() {
        String str = this.f1662u;
        WorkDatabase workDatabase = this.f1654D;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean isEmpty = linkedList.isEmpty();
                S0.q qVar = this.f1655E;
                if (isEmpty) {
                    qVar.l(str, ((J0.m) this.f1651A).f1429a);
                    workDatabase.o();
                    return;
                } else {
                    String str2 = (String) linkedList.remove();
                    if (qVar.e(str2) != 6) {
                        qVar.m(4, str2);
                    }
                    linkedList.addAll(this.f1656F.g(str2));
                }
            }
        } finally {
            workDatabase.k();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.f1660K) {
            return false;
        }
        r.d().a(f1650L, "Work interrupted for " + this.f1658H);
        if (this.f1655E.e(this.f1662u) == 0) {
            e(false);
            return true;
        }
        e(!x.b(r0));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        if ((r6.f2938b == 1 && r6.f2946k > 0) != false) goto L31;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        J0.j jVar;
        J0.g a9;
        boolean z6;
        StringBuilder sb = new StringBuilder("Work [ id=");
        String str = this.f1662u;
        sb.append(str);
        sb.append(", tags={ ");
        ArrayList arrayList = this.f1657G;
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
        this.f1658H = sb.toString();
        S0.p pVar = this.f1665x;
        if (h()) {
            return;
        }
        WorkDatabase workDatabase = this.f1654D;
        workDatabase.c();
        try {
            int i = pVar.f2938b;
            String str3 = pVar.f2939c;
            String str4 = f1650L;
            if (i != 1) {
                f();
                workDatabase.o();
                r.d().a(str4, str3 + " is not in ENQUEUED state. Nothing more to do");
                return;
            }
            if (!pVar.c()) {
            }
            if (System.currentTimeMillis() < pVar.a()) {
                r.d().a(str4, "Delaying execution for " + str3 + " because it is being executed before schedule.");
                e(true);
                workDatabase.o();
                return;
            }
            workDatabase.o();
            workDatabase.k();
            boolean c9 = pVar.c();
            S0.q qVar = this.f1655E;
            J0.b bVar = this.f1652B;
            if (c9) {
                a9 = pVar.f2941e;
            } else {
                G3.e eVar = (G3.e) bVar.f1399g;
                String str5 = pVar.f2940d;
                eVar.getClass();
                String str6 = J0.j.f1425a;
                try {
                    jVar = (J0.j) Class.forName(str5).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e9) {
                    r.d().c(J0.j.f1425a, AbstractC5128c.f("Trouble instantiating + ", str5), e9);
                    jVar = null;
                }
                if (jVar == null) {
                    r.d().b(str4, "Could not create Input Merger " + pVar.f2940d);
                    g();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(pVar.f2941e);
                qVar.getClass();
                C5060i a10 = C5060i.a(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                if (str == null) {
                    a10.o(1);
                } else {
                    a10.c(1, str);
                }
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) qVar.f2956a;
                workDatabase_Impl.b();
                Cursor m9 = workDatabase_Impl.m(a10);
                try {
                    ArrayList arrayList3 = new ArrayList(m9.getCount());
                    while (m9.moveToNext()) {
                        arrayList3.add(J0.g.a(m9.isNull(0) ? null : m9.getBlob(0)));
                    }
                    m9.close();
                    a10.j();
                    arrayList2.addAll(arrayList3);
                    a9 = jVar.a(arrayList2);
                } catch (Throwable th) {
                    m9.close();
                    a10.j();
                    throw th;
                }
            }
            UUID fromString = UUID.fromString(str);
            ExecutorService executorService = (ExecutorService) bVar.f1396d;
            b3.e eVar2 = this.f1667z;
            T0.r rVar = new T0.r(workDatabase, eVar2);
            T0.q qVar2 = new T0.q(workDatabase, this.f1653C, eVar2);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.f5322a = fromString;
            workerParameters.f5323b = a9;
            workerParameters.f5324c = new HashSet(arrayList);
            workerParameters.f5325d = this.f1664w;
            workerParameters.f5326e = pVar.f2946k;
            workerParameters.f5327f = executorService;
            workerParameters.f5328g = eVar2;
            y yVar = (y) bVar.f1398f;
            workerParameters.f5329h = yVar;
            workerParameters.i = rVar;
            workerParameters.f5330j = qVar2;
            if (this.f1666y == null) {
                this.f1666y = yVar.a(this.f1661n, str3, workerParameters);
            }
            J0.q qVar3 = this.f1666y;
            if (qVar3 == null) {
                r.d().b(str4, "Could not create Worker " + str3);
                g();
                return;
            }
            if (qVar3.isUsed()) {
                r.d().b(str4, "Received an already-used Worker " + str3 + "; Worker Factory should return new instances");
                g();
                return;
            }
            this.f1666y.setUsed();
            workDatabase.c();
            try {
                if (qVar.e(str) == 1) {
                    qVar.m(2, str);
                    WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) qVar.f2956a;
                    workDatabase_Impl2.b();
                    S0.h hVar = (S0.h) qVar.f2963h;
                    C5220i a11 = hVar.a();
                    if (str == null) {
                        z6 = true;
                        a11.o(1);
                    } else {
                        z6 = true;
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
                    z6 = false;
                }
                workDatabase.o();
                if (!z6) {
                    f();
                    return;
                }
                if (h()) {
                    return;
                }
                T0.p pVar2 = new T0.p(this.f1661n, this.f1665x, this.f1666y, qVar2, this.f1667z);
                ((A) eVar2.f5559w).execute(pVar2);
                U0.k kVar = pVar2.f3139n;
                F.n nVar = new F.n(3, this, kVar);
                P1.f fVar = new P1.f(2);
                U0.k kVar2 = this.J;
                kVar2.a(nVar, fVar);
                boolean z10 = false;
                kVar.a(new LD(this, kVar, 8, z10), (A) eVar2.f5559w);
                kVar2.a(new LD(this, this.f1658H, 9, z10), (T0.l) eVar2.f5557u);
            } catch (Throwable th3) {
                throw th3;
            }
        } finally {
            workDatabase.k();
        }
    }
}
