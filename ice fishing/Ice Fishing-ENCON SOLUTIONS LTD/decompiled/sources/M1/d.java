package M1;

import C.j;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    public static final d f1096h;

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f1097i;

    /* renamed from: a, reason: collision with root package name */
    public final j f1098a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1100c;

    /* renamed from: d, reason: collision with root package name */
    public long f1101d;

    /* renamed from: b, reason: collision with root package name */
    public int f1099b = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1102e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1103f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final C.b f1104g = new C.b(3, this);

    static {
        String name = i.h(" TaskRunner", K1.b.f1056f);
        i.e(name, "name");
        f1096h = new d(new j(new K1.a(name, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        i.d(logger, "getLogger(TaskRunner::class.java.name)");
        f1097i = logger;
    }

    public d(j jVar) {
        this.f1098a = jVar;
    }

    public static final void a(d dVar, a aVar) {
        dVar.getClass();
        byte[] bArr = K1.b.f1051a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f1084a);
        try {
            long a2 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a2);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j2) {
        byte[] bArr = K1.b.f1051a;
        c cVar = aVar.f1086c;
        i.b(cVar);
        if (cVar.f1093d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = cVar.f1095f;
        cVar.f1095f = false;
        cVar.f1093d = null;
        this.f1102e.remove(cVar);
        if (j2 != -1 && !z2 && !cVar.f1092c) {
            cVar.d(aVar, j2, true);
        }
        if (cVar.f1094e.isEmpty()) {
            return;
        }
        this.f1103f.add(cVar);
    }

    public final a c() {
        boolean z2;
        long j2;
        long j3;
        byte[] bArr = K1.b.f1051a;
        while (true) {
            ArrayList arrayList = this.f1103f;
            if (arrayList.isEmpty()) {
                return null;
            }
            j jVar = this.f1098a;
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j4 = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                a aVar2 = (a) ((c) it.next()).f1094e.get(0);
                long max = Math.max(0L, aVar2.f1087d - nanoTime);
                if (max > 0) {
                    j4 = Math.min(max, j4);
                } else {
                    if (aVar != null) {
                        z2 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            ArrayList arrayList2 = this.f1102e;
            if (aVar != null) {
                byte[] bArr2 = K1.b.f1051a;
                aVar.f1087d = -1L;
                c cVar = aVar.f1086c;
                i.b(cVar);
                cVar.f1094e.remove(aVar);
                arrayList.remove(cVar);
                cVar.f1093d = aVar;
                arrayList2.add(cVar);
                if (z2 || (!this.f1100c && !arrayList.isEmpty())) {
                    C.b runnable = this.f1104g;
                    i.e(runnable, "runnable");
                    ((ThreadPoolExecutor) jVar.f124b).execute(runnable);
                }
                return aVar;
            }
            if (this.f1100c) {
                if (j4 < this.f1101d - nanoTime) {
                    notify();
                }
                return null;
            }
            this.f1100c = true;
            this.f1101d = nanoTime + j4;
            try {
                try {
                    j2 = j4 / 1000000;
                    j3 = j4 - (1000000 * j2);
                } catch (InterruptedException unused) {
                    int size = arrayList2.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i2 = size - 1;
                            ((c) arrayList2.get(size)).b();
                            if (i2 < 0) {
                                break;
                            }
                            size = i2;
                        }
                    }
                    int size2 = arrayList.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i3 = size2 - 1;
                            c cVar2 = (c) arrayList.get(size2);
                            cVar2.b();
                            if (cVar2.f1094e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                            if (i3 < 0) {
                                break;
                            }
                            size2 = i3;
                        }
                    }
                }
                if (j2 <= 0) {
                    if (j4 > 0) {
                    }
                    this.f1100c = false;
                }
                wait(j2, (int) j3);
                this.f1100c = false;
            } catch (Throwable th) {
                this.f1100c = false;
                throw th;
            }
        }
    }

    public final void d(c taskQueue) {
        i.e(taskQueue, "taskQueue");
        byte[] bArr = K1.b.f1051a;
        if (taskQueue.f1093d == null) {
            boolean isEmpty = taskQueue.f1094e.isEmpty();
            ArrayList arrayList = this.f1103f;
            if (isEmpty) {
                arrayList.remove(taskQueue);
            } else {
                i.e(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        boolean z2 = this.f1100c;
        j jVar = this.f1098a;
        if (z2) {
            notify();
            return;
        }
        C.b runnable = this.f1104g;
        i.e(runnable, "runnable");
        ((ThreadPoolExecutor) jVar.f124b).execute(runnable);
    }

    public final c e() {
        int i2;
        synchronized (this) {
            i2 = this.f1099b;
            this.f1099b = i2 + 1;
        }
        return new c(this, i.h(Integer.valueOf(i2), "Q"));
    }
}
