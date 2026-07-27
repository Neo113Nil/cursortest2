package K0;

import D.y;
import J0.r;
import J0.s;
import J0.z;
import O2.B;
import android.content.Context;
import android.database.Cursor;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.consent_sdk.C4300b;
import com.icefishing.icefishinglive2.AbstractC4404f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import u0.C5059i;
import z0.C5253i;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: L, reason: collision with root package name */
    public static final String f1541L = s.f("WorkerWrapper");

    /* renamed from: B, reason: collision with root package name */
    public final J0.b f1543B;

    /* renamed from: C, reason: collision with root package name */
    public final f f1544C;

    /* renamed from: D, reason: collision with root package name */
    public final WorkDatabase f1545D;

    /* renamed from: E, reason: collision with root package name */
    public final S0.q f1546E;

    /* renamed from: F, reason: collision with root package name */
    public final S0.c f1547F;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f1548G;

    /* renamed from: H, reason: collision with root package name */
    public String f1549H;

    /* renamed from: K, reason: collision with root package name */
    public volatile boolean f1551K;

    /* renamed from: n, reason: collision with root package name */
    public final Context f1552n;

    /* renamed from: u, reason: collision with root package name */
    public final String f1553u;

    /* renamed from: v, reason: collision with root package name */
    public final List f1554v;

    /* renamed from: w, reason: collision with root package name */
    public final Z2.e f1555w;

    /* renamed from: x, reason: collision with root package name */
    public final S0.p f1556x;

    /* renamed from: y, reason: collision with root package name */
    public r f1557y;

    /* renamed from: z, reason: collision with root package name */
    public final Z2.e f1558z;

    /* renamed from: A, reason: collision with root package name */
    public J0.q f1542A = new J0.n();

    /* renamed from: I, reason: collision with root package name */
    public final U0.k f1550I = new U0.k();
    public final U0.k J = new U0.k();

    public q(C4300b c4300b) {
        this.f1552n = (Context) c4300b.f35648a;
        this.f1558z = (Z2.e) c4300b.f35650c;
        this.f1544C = (f) c4300b.f35649b;
        S0.p pVar = (S0.p) c4300b.f35653f;
        this.f1556x = pVar;
        this.f1553u = pVar.f2808a;
        this.f1554v = (List) c4300b.f35654g;
        this.f1555w = (Z2.e) c4300b.i;
        this.f1557y = null;
        this.f1543B = (J0.b) c4300b.f35651d;
        WorkDatabase workDatabase = (WorkDatabase) c4300b.f35652e;
        this.f1545D = workDatabase;
        this.f1546E = workDatabase.t();
        this.f1547F = workDatabase.f();
        this.f1548G = (ArrayList) c4300b.f35655h;
    }

    public final void a(J0.q qVar) {
        boolean z3 = qVar instanceof J0.p;
        S0.p pVar = this.f1556x;
        String str = f1541L;
        if (!z3) {
            if (qVar instanceof J0.o) {
                s.d().e(str, "Worker result RETRY for " + this.f1549H);
                c();
                return;
            }
            s.d().e(str, "Worker result FAILURE for " + this.f1549H);
            if (pVar.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        s.d().e(str, "Worker result SUCCESS for " + this.f1549H);
        if (pVar.c()) {
            d();
            return;
        }
        S0.c cVar = this.f1547F;
        String str2 = this.f1553u;
        S0.q qVar2 = this.f1546E;
        WorkDatabase workDatabase = this.f1545D;
        workDatabase.c();
        try {
            qVar2.m(3, str2);
            qVar2.l(str2, ((J0.p) this.f1542A).f1402a);
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = cVar.j(str2).iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (qVar2.e(str3) == 5) {
                    C5059i a9 = C5059i.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        a9.o(1);
                    } else {
                        a9.c(1, str3);
                    }
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f2775u;
                    workDatabase_Impl.b();
                    Cursor m4 = workDatabase_Impl.m(a9);
                    try {
                        if (m4.moveToFirst() && m4.getInt(0) != 0) {
                            s.d().e(str, "Setting status to enqueued for " + str3);
                            qVar2.m(1, str3);
                            qVar2.k(str3, currentTimeMillis);
                        }
                    } finally {
                        m4.close();
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
        WorkDatabase workDatabase = this.f1545D;
        String str = this.f1553u;
        if (!h9) {
            workDatabase.c();
            try {
                int e9 = this.f1546E.e(str);
                S0.n s9 = workDatabase.s();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) s9.f2802u;
                workDatabase_Impl.b();
                S0.h hVar = (S0.h) s9.f2804w;
                C5253i a9 = hVar.a();
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
                        a(this.f1542A);
                    } else if (!y.b(e9)) {
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
        List list = this.f1554v;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((h) it.next()).d(str);
            }
            i.a(this.f1543B, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f1553u;
        S0.q qVar = this.f1546E;
        WorkDatabase workDatabase = this.f1545D;
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
        String str = this.f1553u;
        S0.q qVar = this.f1546E;
        WorkDatabase workDatabase = this.f1545D;
        workDatabase.c();
        try {
            qVar.k(str, System.currentTimeMillis());
            qVar.m(1, str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) qVar.f2827a;
            workDatabase_Impl.b();
            S0.h hVar = (S0.h) qVar.i;
            C5253i a9 = hVar.a();
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
                hVar = (S0.h) qVar.f2831e;
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
    public final void e(boolean z3) {
        boolean z6;
        f fVar;
        boolean containsKey;
        this.f1545D.c();
        try {
            S0.q t6 = this.f1545D.t();
            t6.getClass();
            C5059i a9 = C5059i.a(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) t6.f2827a;
            workDatabase_Impl.b();
            Cursor m4 = workDatabase_Impl.m(a9);
            try {
                if (m4.moveToFirst()) {
                    if (m4.getInt(0) != 0) {
                        z6 = true;
                        if (!z6) {
                            T0.j.a(this.f1552n, RescheduleReceiver.class, false);
                        }
                        if (z3) {
                            this.f1546E.m(1, this.f1553u);
                            this.f1546E.i(this.f1553u, -1L);
                        }
                        if (this.f1556x != null && this.f1557y != null) {
                            fVar = this.f1544C;
                            String str = this.f1553u;
                            synchronized (fVar.f1506E) {
                                containsKey = fVar.f1512y.containsKey(str);
                            }
                            if (containsKey) {
                                f fVar2 = this.f1544C;
                                String str2 = this.f1553u;
                                synchronized (fVar2.f1506E) {
                                    fVar2.f1512y.remove(str2);
                                    fVar2.i();
                                }
                            }
                        }
                        this.f1545D.o();
                        this.f1545D.k();
                        this.f1550I.j(Boolean.valueOf(z3));
                    }
                }
                z6 = false;
                if (!z6) {
                }
                if (z3) {
                }
                if (this.f1556x != null) {
                    fVar = this.f1544C;
                    String str3 = this.f1553u;
                    synchronized (fVar.f1506E) {
                    }
                }
                this.f1545D.o();
                this.f1545D.k();
                this.f1550I.j(Boolean.valueOf(z3));
            } finally {
                m4.close();
                a9.j();
            }
        } catch (Throwable th) {
            this.f1545D.k();
            throw th;
        }
    }

    public final void f() {
        S0.q qVar = this.f1546E;
        String str = this.f1553u;
        int e9 = qVar.e(str);
        String str2 = f1541L;
        if (e9 == 2) {
            s.d().a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        s d2 = s.d();
        StringBuilder j6 = AbstractC4404f.j("Status for ", str, " is ");
        j6.append(y.z(e9));
        j6.append(" ; not doing any work");
        d2.a(str2, j6.toString());
        e(false);
    }

    public final void g() {
        String str = this.f1553u;
        WorkDatabase workDatabase = this.f1545D;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean isEmpty = linkedList.isEmpty();
                S0.q qVar = this.f1546E;
                if (isEmpty) {
                    qVar.l(str, ((J0.n) this.f1542A).f1401a);
                    workDatabase.o();
                    return;
                } else {
                    String str2 = (String) linkedList.remove();
                    if (qVar.e(str2) != 6) {
                        qVar.m(4, str2);
                    }
                    linkedList.addAll(this.f1547F.j(str2));
                }
            }
        } finally {
            workDatabase.k();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.f1551K) {
            return false;
        }
        s.d().a(f1541L, "Work interrupted for " + this.f1549H);
        if (this.f1546E.e(this.f1553u) == 0) {
            e(false);
            return true;
        }
        e(!y.b(r0));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        if ((r6.f2809b == 1 && r6.f2817k > 0) != false) goto L31;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        J0.k kVar;
        J0.h a9;
        boolean z3;
        StringBuilder sb = new StringBuilder("Work [ id=");
        String str = this.f1553u;
        sb.append(str);
        sb.append(", tags={ ");
        ArrayList arrayList = this.f1548G;
        Iterator it = arrayList.iterator();
        boolean z6 = true;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (z6) {
                z6 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str2);
        }
        sb.append(" } ]");
        this.f1549H = sb.toString();
        S0.p pVar = this.f1556x;
        if (h()) {
            return;
        }
        WorkDatabase workDatabase = this.f1545D;
        workDatabase.c();
        try {
            int i = pVar.f2809b;
            String str3 = pVar.f2810c;
            String str4 = f1541L;
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
            boolean c9 = pVar.c();
            S0.q qVar = this.f1546E;
            J0.b bVar = this.f1543B;
            if (c9) {
                a9 = pVar.f2812e;
            } else {
                a4.e eVar = (a4.e) bVar.f1370g;
                String str5 = pVar.f2811d;
                eVar.getClass();
                String str6 = J0.k.f1397a;
                try {
                    kVar = (J0.k) Class.forName(str5).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e9) {
                    s.d().c(J0.k.f1397a, u1.h.f("Trouble instantiating + ", str5), e9);
                    kVar = null;
                }
                if (kVar == null) {
                    s.d().b(str4, "Could not create Input Merger " + pVar.f2811d);
                    g();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(pVar.f2812e);
                qVar.getClass();
                C5059i a10 = C5059i.a(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                if (str == null) {
                    a10.o(1);
                } else {
                    a10.c(1, str);
                }
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) qVar.f2827a;
                workDatabase_Impl.b();
                Cursor m4 = workDatabase_Impl.m(a10);
                try {
                    ArrayList arrayList3 = new ArrayList(m4.getCount());
                    while (m4.moveToNext()) {
                        arrayList3.add(J0.h.a(m4.isNull(0) ? null : m4.getBlob(0)));
                    }
                    m4.close();
                    a10.j();
                    arrayList2.addAll(arrayList3);
                    a9 = kVar.a(arrayList2);
                } catch (Throwable th) {
                    m4.close();
                    a10.j();
                    throw th;
                }
            }
            UUID fromString = UUID.fromString(str);
            ExecutorService executorService = (ExecutorService) bVar.f1367d;
            Z2.e eVar2 = this.f1558z;
            T0.r rVar = new T0.r(workDatabase, eVar2);
            T0.q qVar2 = new T0.q(workDatabase, this.f1544C, eVar2);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.f5357a = fromString;
            workerParameters.f5358b = a9;
            workerParameters.f5359c = new HashSet(arrayList);
            workerParameters.f5360d = this.f1555w;
            workerParameters.f5361e = pVar.f2817k;
            workerParameters.f5362f = executorService;
            workerParameters.f5363g = eVar2;
            z zVar = (z) bVar.f1369f;
            workerParameters.f5364h = zVar;
            workerParameters.i = rVar;
            workerParameters.f5365j = qVar2;
            if (this.f1557y == null) {
                this.f1557y = zVar.a(this.f1552n, str3, workerParameters);
            }
            r rVar2 = this.f1557y;
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
            this.f1557y.setUsed();
            workDatabase.c();
            try {
                if (qVar.e(str) == 1) {
                    qVar.m(2, str);
                    WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) qVar.f2827a;
                    workDatabase_Impl2.b();
                    S0.h hVar = (S0.h) qVar.f2834h;
                    C5253i a11 = hVar.a();
                    if (str == null) {
                        z3 = true;
                        a11.o(1);
                    } else {
                        z3 = true;
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
                    z3 = false;
                }
                workDatabase.o();
                if (!z3) {
                    f();
                    return;
                }
                if (h()) {
                    return;
                }
                T0.p pVar2 = new T0.p(this.f1552n, this.f1556x, this.f1557y, qVar2, this.f1558z);
                ((B) eVar2.f4172w).execute(pVar2);
                U0.k kVar2 = pVar2.f3056n;
                F.n nVar = new F.n(3, this, kVar2);
                N1.f fVar = new N1.f(2);
                U0.k kVar3 = this.J;
                kVar3.a(nVar, fVar);
                boolean z9 = false;
                kVar2.a(new LD(this, kVar2, 8, z9), (B) eVar2.f4172w);
                kVar3.a(new LD(this, this.f1549H, 9, z9), (T0.l) eVar2.f4170u);
            } catch (Throwable th3) {
                throw th3;
            }
        } finally {
            workDatabase.k();
        }
    }
}
