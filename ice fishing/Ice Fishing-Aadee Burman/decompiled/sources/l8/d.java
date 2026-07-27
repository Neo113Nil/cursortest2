package l8;

import com.anythink.core.common.n.b.a.e;
import com.icefishing.icefishinglive2.AbstractC4404f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f38946k;

    /* renamed from: l, reason: collision with root package name */
    public static final d f38947l;

    /* renamed from: a, reason: collision with root package name */
    public final F1.a f38948a;

    /* renamed from: b, reason: collision with root package name */
    public final Logger f38949b;

    /* renamed from: c, reason: collision with root package name */
    public int f38950c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38951d;

    /* renamed from: e, reason: collision with root package name */
    public long f38952e;

    /* renamed from: f, reason: collision with root package name */
    public int f38953f;

    /* renamed from: g, reason: collision with root package name */
    public int f38954g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f38955h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final G0.c f38956j;

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        h.d(logger, "getLogger(...)");
        f38946k = logger;
        String name = j8.d.f38484b + " TaskRunner";
        h.e(name, "name");
        f38947l = new d(new F1.a(new e(1, name, true)));
    }

    public d(F1.a aVar) {
        Logger logger = f38946k;
        h.e(logger, "logger");
        this.f38948a = aVar;
        this.f38949b = logger;
        this.f38950c = 10000;
        this.f38955h = new ArrayList();
        this.i = new ArrayList();
        this.f38956j = new G0.c(26, this);
    }

    public static final void a(d dVar, a aVar, long j6, boolean z3) {
        dVar.getClass();
        TimeZone timeZone = j8.d.f38483a;
        c cVar = aVar.f38936c;
        h.b(cVar);
        if (cVar.f38943d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z6 = cVar.f38945f;
        cVar.f38945f = false;
        cVar.f38943d = null;
        dVar.f38955h.remove(cVar);
        if (j6 != -1 && !z6 && !cVar.f38942c) {
            cVar.e(aVar, j6, true);
        }
        if (cVar.f38944e.isEmpty()) {
            return;
        }
        dVar.i.add(cVar);
        if (z3) {
            return;
        }
        dVar.e();
    }

    public final a b() {
        long j6;
        a aVar;
        boolean z3;
        TimeZone timeZone = j8.d.f38483a;
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j9 = Long.MAX_VALUE;
            a aVar2 = null;
            while (true) {
                if (!it.hasNext()) {
                    j6 = nanoTime;
                    aVar = null;
                    z3 = false;
                    break;
                }
                a aVar3 = (a) ((c) it.next()).f38944e.get(0);
                j6 = nanoTime;
                aVar = null;
                long max = Math.max(0L, aVar3.f38937d - j6);
                if (max > 0) {
                    j9 = Math.min(max, j9);
                } else {
                    if (aVar2 != null) {
                        z3 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                nanoTime = j6;
            }
            ArrayList arrayList2 = this.f38955h;
            if (aVar2 != null) {
                TimeZone timeZone2 = j8.d.f38483a;
                aVar2.f38937d = -1L;
                c cVar = aVar2.f38936c;
                h.b(cVar);
                cVar.f38944e.remove(aVar2);
                arrayList.remove(cVar);
                cVar.f38943d = aVar2;
                arrayList2.add(cVar);
                if (z3 || (!this.f38951d && !arrayList.isEmpty())) {
                    e();
                }
                return aVar2;
            }
            if (this.f38951d) {
                if (j9 >= this.f38952e - j6) {
                    return aVar;
                }
                notify();
                return aVar;
            }
            this.f38951d = true;
            this.f38952e = j6 + j9;
            try {
                try {
                    TimeZone timeZone3 = j8.d.f38483a;
                    if (j9 > 0) {
                        long j10 = j9 / 1000000;
                        long j11 = j9 - (1000000 * j10);
                        if (j10 > 0 || j9 > 0) {
                            wait(j10, (int) j11);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = j8.d.f38483a;
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((c) arrayList2.get(size)).b();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        c cVar2 = (c) arrayList.get(size2);
                        cVar2.b();
                        if (cVar2.f38944e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
            } finally {
                this.f38951d = false;
            }
        }
    }

    public final void c(c taskQueue) {
        h.e(taskQueue, "taskQueue");
        TimeZone timeZone = j8.d.f38483a;
        if (taskQueue.f38943d == null) {
            boolean isEmpty = taskQueue.f38944e.isEmpty();
            ArrayList arrayList = this.i;
            if (isEmpty) {
                arrayList.remove(taskQueue);
            } else {
                byte[] bArr = j8.c.f38482a;
                h.e(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (this.f38951d) {
            notify();
        } else {
            e();
        }
    }

    public final c d() {
        int i;
        synchronized (this) {
            i = this.f38950c;
            this.f38950c = i + 1;
        }
        return new c(this, AbstractC4404f.e(i, "Q"));
    }

    public final void e() {
        TimeZone timeZone = j8.d.f38483a;
        int i = this.f38953f;
        if (i > this.f38954g) {
            return;
        }
        this.f38953f = i + 1;
        F1.a aVar = this.f38948a;
        G0.c runnable = this.f38956j;
        h.e(runnable, "runnable");
        ((ThreadPoolExecutor) aVar.f903u).execute(runnable);
    }
}
