package p4;

import android.content.Context;
import android.database.Cursor;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import o4.v;
import x4.p;
import x4.q;
import y4.r;
import y4.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: y, reason: collision with root package name */
    public static final String f5503y = o4.o.f("WorkerWrapper");

    /* renamed from: g, reason: collision with root package name */
    public final Context f5504g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5505h;

    /* renamed from: i, reason: collision with root package name */
    public final List f5506i;

    /* renamed from: j, reason: collision with root package name */
    public final a5.c f5507j;

    /* renamed from: k, reason: collision with root package name */
    public final p f5508k;

    /* renamed from: l, reason: collision with root package name */
    public o4.n f5509l;

    /* renamed from: m, reason: collision with root package name */
    public final a5.c f5510m;

    /* renamed from: o, reason: collision with root package name */
    public final o4.b f5512o;

    /* renamed from: p, reason: collision with root package name */
    public final e f5513p;

    /* renamed from: q, reason: collision with root package name */
    public final WorkDatabase f5514q;

    /* renamed from: r, reason: collision with root package name */
    public final q f5515r;

    /* renamed from: s, reason: collision with root package name */
    public final x4.c f5516s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f5517t;

    /* renamed from: u, reason: collision with root package name */
    public String f5518u;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f5521x;

    /* renamed from: n, reason: collision with root package name */
    public o4.m f5511n = new o4.j();

    /* renamed from: v, reason: collision with root package name */
    public final z4.j f5519v = new z4.j();

    /* renamed from: w, reason: collision with root package name */
    public final z4.j f5520w = new z4.j();

    public o(c6.l lVar) {
        this.f5504g = lVar.f1268a;
        this.f5510m = (a5.c) lVar.f1270c;
        this.f5513p = (e) lVar.f1269b;
        p pVar = (p) lVar.f1273f;
        this.f5508k = pVar;
        this.f5505h = pVar.f8322a;
        this.f5506i = (List) lVar.f1274g;
        this.f5507j = (a5.c) lVar.f1276i;
        this.f5509l = null;
        this.f5512o = (o4.b) lVar.f1271d;
        WorkDatabase workDatabase = (WorkDatabase) lVar.f1272e;
        this.f5514q = workDatabase;
        this.f5515r = workDatabase.t();
        this.f5516s = workDatabase.f();
        this.f5517t = (ArrayList) lVar.f1275h;
    }

    public final void a(o4.m mVar) {
        boolean z10 = mVar instanceof o4.l;
        p pVar = this.f5508k;
        String str = f5503y;
        if (!z10) {
            if (mVar instanceof o4.k) {
                o4.o.d().e(str, "Worker result RETRY for " + this.f5518u);
                c();
                return;
            }
            o4.o.d().e(str, "Worker result FAILURE for " + this.f5518u);
            if (pVar.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        o4.o.d().e(str, "Worker result SUCCESS for " + this.f5518u);
        if (pVar.c()) {
            d();
            return;
        }
        x4.c cVar = this.f5516s;
        String str2 = this.f5505h;
        q qVar = this.f5515r;
        WorkDatabase workDatabase = this.f5514q;
        workDatabase.c();
        try {
            qVar.p(str2, 3);
            qVar.o(str2, ((o4.l) this.f5511n).f5215a);
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList d10 = cVar.d(str2);
            int size = d10.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = d10.get(i10);
                i10++;
                String str3 = (String) obj;
                if (qVar.i(str3) == 5) {
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f8290g;
                    b4.o a6 = b4.o.a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                    if (str3 == null) {
                        a6.h(1);
                    } else {
                        a6.c(str3, 1);
                    }
                    workDatabase_Impl.b();
                    Cursor m10 = workDatabase_Impl.m(a6);
                    try {
                        if (m10.moveToFirst() && m10.getInt(0) != 0) {
                            o4.o.d().e(str, "Setting status to enqueued for " + str3);
                            qVar.p(str3, 1);
                            qVar.n(currentTimeMillis, str3);
                        }
                    } finally {
                        m10.close();
                        a6.f();
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
        boolean h10 = h();
        String str = this.f5505h;
        WorkDatabase workDatabase = this.f5514q;
        if (!h10) {
            workDatabase.c();
            try {
                int i10 = this.f5515r.i(str);
                x4.n s10 = workDatabase.s();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) s10.f8316a;
                workDatabase_Impl.b();
                x4.h hVar = (x4.h) s10.f8318c;
                i4.i a6 = hVar.a();
                if (str == null) {
                    a6.h(1);
                } else {
                    a6.c(str, 1);
                }
                workDatabase_Impl.c();
                try {
                    a6.a();
                    workDatabase_Impl.o();
                    if (i10 == 0) {
                        e(false);
                    } else if (i10 == 2) {
                        a(this.f5511n);
                    } else if (!a4.d.a(i10)) {
                        c();
                    }
                    workDatabase.o();
                    workDatabase.k();
                } finally {
                    workDatabase_Impl.k();
                    hVar.d(a6);
                }
            } catch (Throwable th) {
                workDatabase.k();
                throw th;
            }
        }
        List list = this.f5506i;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((g) it.next()).c(str);
            }
            h.a(this.f5512o, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f5505h;
        q qVar = this.f5515r;
        WorkDatabase workDatabase = this.f5514q;
        workDatabase.c();
        try {
            qVar.p(str, 1);
            qVar.n(System.currentTimeMillis(), str);
            qVar.l(-1L, str);
            workDatabase.o();
        } finally {
            workDatabase.k();
            e(true);
        }
    }

    public final void d() {
        String str = this.f5505h;
        q qVar = this.f5515r;
        WorkDatabase workDatabase = this.f5514q;
        workDatabase.c();
        try {
            qVar.n(System.currentTimeMillis(), str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) qVar.f8342a;
            qVar.p(str, 1);
            workDatabase_Impl.b();
            x4.h hVar = (x4.h) qVar.f8350i;
            i4.i a6 = hVar.a();
            if (str == null) {
                a6.h(1);
            } else {
                a6.c(str, 1);
            }
            workDatabase_Impl.c();
            try {
                a6.a();
                workDatabase_Impl.o();
                workDatabase_Impl.k();
                hVar.d(a6);
                workDatabase_Impl.b();
                hVar = (x4.h) qVar.f8346e;
                a6 = hVar.a();
                if (str == null) {
                    a6.h(1);
                } else {
                    a6.c(str, 1);
                }
                workDatabase_Impl.c();
                try {
                    a6.a();
                    workDatabase_Impl.o();
                    workDatabase_Impl.k();
                    hVar.d(a6);
                    qVar.l(-1L, str);
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
    public final void e(boolean z10) {
        boolean z11;
        e eVar;
        boolean containsKey;
        this.f5514q.c();
        try {
            q t3 = this.f5514q.t();
            t3.getClass();
            b4.o a6 = b4.o.a("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) t3.f8342a;
            workDatabase_Impl.b();
            Cursor m10 = workDatabase_Impl.m(a6);
            try {
                if (m10.moveToFirst()) {
                    if (m10.getInt(0) != 0) {
                        z11 = true;
                        if (!z11) {
                            y4.j.a(this.f5504g, RescheduleReceiver.class, false);
                        }
                        if (z10) {
                            this.f5515r.p(this.f5505h, 1);
                            this.f5515r.l(-1L, this.f5505h);
                        }
                        if (this.f5508k != null && this.f5509l != null) {
                            eVar = this.f5513p;
                            String str = this.f5505h;
                            synchronized (eVar.f5474r) {
                                containsKey = eVar.f5468l.containsKey(str);
                            }
                            if (containsKey) {
                                e eVar2 = this.f5513p;
                                String str2 = this.f5505h;
                                synchronized (eVar2.f5474r) {
                                    eVar2.f5468l.remove(str2);
                                    eVar2.i();
                                }
                            }
                        }
                        this.f5514q.o();
                        this.f5514q.k();
                        this.f5519v.i(Boolean.valueOf(z10));
                    }
                }
                z11 = false;
                if (!z11) {
                }
                if (z10) {
                }
                if (this.f5508k != null) {
                    eVar = this.f5513p;
                    String str3 = this.f5505h;
                    synchronized (eVar.f5474r) {
                    }
                }
                this.f5514q.o();
                this.f5514q.k();
                this.f5519v.i(Boolean.valueOf(z10));
            } finally {
                m10.close();
                a6.f();
            }
        } catch (Throwable th) {
            this.f5514q.k();
            throw th;
        }
    }

    public final void f() {
        q qVar = this.f5515r;
        String str = this.f5505h;
        int i10 = qVar.i(str);
        String str2 = f5503y;
        if (i10 == 2) {
            o4.o.d().a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        o4.o.d().a(str2, "Status for " + str + " is " + a4.d.w(i10) + " ; not doing any work");
        e(false);
    }

    public final void g() {
        String str = this.f5505h;
        WorkDatabase workDatabase = this.f5514q;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean isEmpty = linkedList.isEmpty();
                q qVar = this.f5515r;
                if (isEmpty) {
                    qVar.o(str, ((o4.j) this.f5511n).f5214a);
                    workDatabase.o();
                    return;
                } else {
                    String str2 = (String) linkedList.remove();
                    if (qVar.i(str2) != 6) {
                        qVar.p(str2, 4);
                    }
                    linkedList.addAll(this.f5516s.d(str2));
                }
            }
        } finally {
            workDatabase.k();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.f5521x) {
            return false;
        }
        o4.o.d().a(f5503y, "Work interrupted for " + this.f5518u);
        if (this.f5515r.i(this.f5505h) == 0) {
            e(false);
            return true;
        }
        e(!a4.d.a(r0));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if ((r4.f8323b == 1 && r9 > 0) != false) goto L29;
     */
    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        o4.h hVar;
        o4.e a6;
        boolean z10;
        StringBuilder sb = new StringBuilder("Work [ id=");
        String str = this.f5505h;
        sb.append(str);
        sb.append(", tags={ ");
        ArrayList arrayList = this.f5517t;
        int size = arrayList.size();
        boolean z11 = true;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str2 = (String) obj;
            if (z11) {
                z11 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str2);
        }
        sb.append(" } ]");
        this.f5518u = sb.toString();
        p pVar = this.f5508k;
        if (h()) {
            return;
        }
        WorkDatabase workDatabase = this.f5514q;
        workDatabase.c();
        try {
            int i11 = pVar.f8323b;
            int i12 = pVar.f8332k;
            String str3 = pVar.f8324c;
            String str4 = f5503y;
            if (i11 != 1) {
                f();
                workDatabase.o();
                o4.o.d().a(str4, str3 + " is not in ENQUEUED state. Nothing more to do");
                return;
            }
            if (!pVar.c()) {
            }
            if (System.currentTimeMillis() < pVar.a()) {
                o4.o.d().a(str4, "Delaying execution for " + str3 + " because it is being executed before schedule.");
                e(true);
                workDatabase.o();
                return;
            }
            workDatabase.o();
            workDatabase.k();
            boolean c3 = pVar.c();
            q qVar = this.f5515r;
            o4.b bVar = this.f5512o;
            if (c3) {
                a6 = pVar.f8326e;
            } else {
                u7.d dVar = bVar.f5188d;
                String str5 = pVar.f8325d;
                dVar.getClass();
                String str6 = o4.h.f5212a;
                try {
                    hVar = (o4.h) Class.forName(str5).getDeclaredConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    o4.o.d().c(o4.h.f5212a, "Trouble instantiating + " + str5, e10);
                    hVar = null;
                }
                if (hVar == null) {
                    o4.o.d().b(str4, "Could not create Input Merger " + pVar.f8325d);
                    g();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(pVar.f8326e);
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) qVar.f8342a;
                b4.o a8 = b4.o.a("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                if (str == null) {
                    a8.h(1);
                } else {
                    a8.c(str, 1);
                }
                workDatabase_Impl.b();
                Cursor m10 = workDatabase_Impl.m(a8);
                try {
                    ArrayList arrayList3 = new ArrayList(m10.getCount());
                    while (m10.moveToNext()) {
                        arrayList3.add(o4.e.a(m10.isNull(0) ? null : m10.getBlob(0)));
                    }
                    m10.close();
                    a8.f();
                    arrayList2.addAll(arrayList3);
                    a6 = hVar.a(arrayList2);
                } catch (Throwable th) {
                    m10.close();
                    a8.f();
                    throw th;
                }
            }
            UUID fromString = UUID.fromString(str);
            ExecutorService executorService = bVar.f5185a;
            v vVar = bVar.f5187c;
            a5.c cVar = this.f5510m;
            s sVar = new s(workDatabase, cVar);
            r rVar = new r(workDatabase, this.f5513p, cVar);
            WorkerParameters workerParameters = new WorkerParameters();
            workerParameters.f744a = fromString;
            workerParameters.f745b = a6;
            workerParameters.f746c = new HashSet(arrayList);
            workerParameters.f747d = this.f5507j;
            workerParameters.f748e = i12;
            workerParameters.f749f = executorService;
            workerParameters.f750g = cVar;
            workerParameters.f751h = vVar;
            workerParameters.f752i = sVar;
            workerParameters.f753j = rVar;
            if (this.f5509l == null) {
                this.f5509l = vVar.a(this.f5504g, str3, workerParameters);
            }
            o4.n nVar = this.f5509l;
            if (nVar == null) {
                o4.o.d().b(str4, "Could not create Worker " + str3);
                g();
                return;
            }
            if (nVar.isUsed()) {
                o4.o.d().b(str4, "Received an already-used Worker " + str3 + "; Worker Factory should return new instances");
                g();
                return;
            }
            this.f5509l.setUsed();
            workDatabase.c();
            try {
                if (qVar.i(str) == 1) {
                    qVar.p(str, 2);
                    WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) qVar.f8342a;
                    workDatabase_Impl2.b();
                    x4.h hVar2 = (x4.h) qVar.f8349h;
                    i4.i a10 = hVar2.a();
                    if (str == null) {
                        a10.h(1);
                    } else {
                        a10.c(str, 1);
                    }
                    workDatabase_Impl2.c();
                    try {
                        a10.a();
                        workDatabase_Impl2.o();
                        workDatabase_Impl2.k();
                        hVar2.d(a10);
                        z10 = true;
                    } catch (Throwable th2) {
                        workDatabase_Impl2.k();
                        hVar2.d(a10);
                        throw th2;
                    }
                } else {
                    z10 = false;
                }
                workDatabase.o();
                if (!z10) {
                    f();
                    return;
                }
                if (h()) {
                    return;
                }
                y4.p pVar2 = new y4.p(this.f5504g, this.f5508k, this.f5509l, rVar, this.f5510m);
                ((a5.b) cVar.f263i).execute(pVar2);
                z4.j jVar = pVar2.f8763g;
                a1.d dVar2 = new a1.d(11, this, jVar);
                g7.n nVar2 = new g7.n(1);
                z4.j jVar2 = this.f5520w;
                jVar2.a(dVar2, nVar2);
                jVar.a(new dd.i(18, this, jVar), (a5.b) cVar.f263i);
                jVar2.a(new dd.i(19, this, this.f5518u), (y4.l) cVar.f262h);
            } catch (Throwable th3) {
                throw th3;
            }
        } finally {
            workDatabase.k();
        }
    }
}
