package h8;

import F3.C;
import com.google.android.gms.internal.ads.CL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f38262k;

    /* renamed from: l, reason: collision with root package name */
    public static final e f38263l;

    /* renamed from: a, reason: collision with root package name */
    public final d f38264a;

    /* renamed from: b, reason: collision with root package name */
    public final Logger f38265b;

    /* renamed from: c, reason: collision with root package name */
    public int f38266c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38267d;

    /* renamed from: e, reason: collision with root package name */
    public long f38268e;

    /* renamed from: f, reason: collision with root package name */
    public int f38269f;

    /* renamed from: g, reason: collision with root package name */
    public int f38270g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f38271h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final C f38272j;

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        h.d(logger, "getLogger(...)");
        f38262k = logger;
        String name = f8.d.f37816b + " TaskRunner";
        h.e(name, "name");
        f38263l = new e(new d(new com.anythink.core.common.n.b.a.e(1, name, true)));
    }

    public e(d dVar) {
        Logger logger = f38262k;
        h.e(logger, "logger");
        this.f38264a = dVar;
        this.f38265b = logger;
        this.f38266c = 10000;
        this.f38271h = new ArrayList();
        this.i = new ArrayList();
        this.f38272j = new C(23, this);
    }

    public static final void a(e eVar, a aVar, long j9, boolean z8) {
        eVar.getClass();
        TimeZone timeZone = f8.d.f37815a;
        c cVar = aVar.f38250c;
        h.b(cVar);
        if (cVar.f38257d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z9 = cVar.f38259f;
        cVar.f38259f = false;
        cVar.f38257d = null;
        eVar.f38271h.remove(cVar);
        if (j9 != -1 && !z9 && !cVar.f38256c) {
            cVar.e(aVar, j9, true);
        }
        if (cVar.f38258e.isEmpty()) {
            return;
        }
        eVar.i.add(cVar);
        if (z8) {
            return;
        }
        eVar.e();
    }

    public final a b() {
        long j9;
        a aVar;
        boolean z8;
        TimeZone timeZone = f8.d.f37815a;
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j10 = Long.MAX_VALUE;
            a aVar2 = null;
            while (true) {
                if (!it.hasNext()) {
                    j9 = nanoTime;
                    aVar = null;
                    z8 = false;
                    break;
                }
                a aVar3 = (a) ((c) it.next()).f38258e.get(0);
                j9 = nanoTime;
                aVar = null;
                long max = Math.max(0L, aVar3.f38251d - j9);
                if (max > 0) {
                    j10 = Math.min(max, j10);
                } else {
                    if (aVar2 != null) {
                        z8 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                nanoTime = j9;
            }
            ArrayList arrayList2 = this.f38271h;
            if (aVar2 != null) {
                TimeZone timeZone2 = f8.d.f37815a;
                aVar2.f38251d = -1L;
                c cVar = aVar2.f38250c;
                h.b(cVar);
                cVar.f38258e.remove(aVar2);
                arrayList.remove(cVar);
                cVar.f38257d = aVar2;
                arrayList2.add(cVar);
                if (z8 || (!this.f38267d && !arrayList.isEmpty())) {
                    e();
                }
                return aVar2;
            }
            if (this.f38267d) {
                if (j10 >= this.f38268e - j9) {
                    return aVar;
                }
                notify();
                return aVar;
            }
            this.f38267d = true;
            this.f38268e = j9 + j10;
            try {
                try {
                    TimeZone timeZone3 = f8.d.f37815a;
                    if (j10 > 0) {
                        long j11 = j10 / 1000000;
                        long j12 = j10 - (1000000 * j11);
                        if (j11 > 0 || j10 > 0) {
                            wait(j11, (int) j12);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = f8.d.f37815a;
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((c) arrayList2.get(size)).b();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        c cVar2 = (c) arrayList.get(size2);
                        cVar2.b();
                        if (cVar2.f38258e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
            } finally {
                this.f38267d = false;
            }
        }
    }

    public final void c(c taskQueue) {
        h.e(taskQueue, "taskQueue");
        TimeZone timeZone = f8.d.f37815a;
        if (taskQueue.f38257d == null) {
            boolean isEmpty = taskQueue.f38258e.isEmpty();
            ArrayList arrayList = this.i;
            if (isEmpty) {
                arrayList.remove(taskQueue);
            } else {
                byte[] bArr = f8.c.f37814a;
                h.e(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (this.f38267d) {
            notify();
        } else {
            e();
        }
    }

    public final c d() {
        int i;
        synchronized (this) {
            i = this.f38266c;
            this.f38266c = i + 1;
        }
        return new c(this, CL.i(i, "Q"));
    }

    public final void e() {
        TimeZone timeZone = f8.d.f37815a;
        int i = this.f38269f;
        if (i > this.f38270g) {
            return;
        }
        this.f38269f = i + 1;
        d dVar = this.f38264a;
        C runnable = this.f38272j;
        h.e(runnable, "runnable");
        ((ThreadPoolExecutor) dVar.f38261u).execute(runnable);
    }
}
