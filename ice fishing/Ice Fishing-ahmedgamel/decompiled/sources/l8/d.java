package l8;

import com.anythink.core.common.n.b.a.e;
import com.google.android.gms.internal.ads.Wv;
import h.C4543G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: k, reason: collision with root package name */
    public static final Logger f39014k;

    /* renamed from: l, reason: collision with root package name */
    public static final d f39015l;

    /* renamed from: a, reason: collision with root package name */
    public final C4543G f39016a;

    /* renamed from: b, reason: collision with root package name */
    public final Logger f39017b;

    /* renamed from: c, reason: collision with root package name */
    public int f39018c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f39019d;

    /* renamed from: e, reason: collision with root package name */
    public long f39020e;

    /* renamed from: f, reason: collision with root package name */
    public int f39021f;

    /* renamed from: g, reason: collision with root package name */
    public int f39022g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f39023h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final G0.c f39024j;

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        h.d(logger, "getLogger(...)");
        f39014k = logger;
        String name = j8.d.f38496b + " TaskRunner";
        h.e(name, "name");
        e eVar = new e(1, name, true);
        C4543G c4543g = new C4543G();
        c4543g.f37843n = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), eVar);
        f39015l = new d(c4543g);
    }

    public d(C4543G c4543g) {
        Logger logger = f39014k;
        h.e(logger, "logger");
        this.f39016a = c4543g;
        this.f39017b = logger;
        this.f39018c = 10000;
        this.f39023h = new ArrayList();
        this.i = new ArrayList();
        this.f39024j = new G0.c(26, this);
    }

    public static final void a(d dVar, a aVar, long j6, boolean z6) {
        dVar.getClass();
        TimeZone timeZone = j8.d.f38495a;
        c cVar = aVar.f39004c;
        h.b(cVar);
        if (cVar.f39011d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z9 = cVar.f39013f;
        cVar.f39013f = false;
        cVar.f39011d = null;
        dVar.f39023h.remove(cVar);
        if (j6 != -1 && !z9 && !cVar.f39010c) {
            cVar.e(aVar, j6, true);
        }
        if (cVar.f39012e.isEmpty()) {
            return;
        }
        dVar.i.add(cVar);
        if (z6) {
            return;
        }
        dVar.e();
    }

    public final a b() {
        long j6;
        a aVar;
        boolean z6;
        TimeZone timeZone = j8.d.f38495a;
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
                    z6 = false;
                    break;
                }
                a aVar3 = (a) ((c) it.next()).f39012e.get(0);
                j6 = nanoTime;
                aVar = null;
                long max = Math.max(0L, aVar3.f39005d - j6);
                if (max > 0) {
                    j9 = Math.min(max, j9);
                } else {
                    if (aVar2 != null) {
                        z6 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                nanoTime = j6;
            }
            ArrayList arrayList2 = this.f39023h;
            if (aVar2 != null) {
                TimeZone timeZone2 = j8.d.f38495a;
                aVar2.f39005d = -1L;
                c cVar = aVar2.f39004c;
                h.b(cVar);
                cVar.f39012e.remove(aVar2);
                arrayList.remove(cVar);
                cVar.f39011d = aVar2;
                arrayList2.add(cVar);
                if (z6 || (!this.f39019d && !arrayList.isEmpty())) {
                    e();
                }
                return aVar2;
            }
            if (this.f39019d) {
                if (j9 >= this.f39020e - j6) {
                    return aVar;
                }
                notify();
                return aVar;
            }
            this.f39019d = true;
            this.f39020e = j6 + j9;
            try {
                try {
                    TimeZone timeZone3 = j8.d.f38495a;
                    if (j9 > 0) {
                        long j10 = j9 / 1000000;
                        long j11 = j9 - (1000000 * j10);
                        if (j10 > 0 || j9 > 0) {
                            wait(j10, (int) j11);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = j8.d.f38495a;
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((c) arrayList2.get(size)).b();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        c cVar2 = (c) arrayList.get(size2);
                        cVar2.b();
                        if (cVar2.f39012e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
            } finally {
                this.f39019d = false;
            }
        }
    }

    public final void c(c taskQueue) {
        h.e(taskQueue, "taskQueue");
        TimeZone timeZone = j8.d.f38495a;
        if (taskQueue.f39011d == null) {
            boolean isEmpty = taskQueue.f39012e.isEmpty();
            ArrayList arrayList = this.i;
            if (isEmpty) {
                arrayList.remove(taskQueue);
            } else {
                byte[] bArr = j8.c.f38494a;
                h.e(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (this.f39019d) {
            notify();
        } else {
            e();
        }
    }

    public final c d() {
        int i;
        synchronized (this) {
            i = this.f39018c;
            this.f39018c = i + 1;
        }
        return new c(this, Wv.f(i, "Q"));
    }

    public final void e() {
        TimeZone timeZone = j8.d.f38495a;
        int i = this.f39021f;
        if (i > this.f39022g) {
            return;
        }
        this.f39021f = i + 1;
        C4543G c4543g = this.f39016a;
        G0.c runnable = this.f39024j;
        h.e(runnable, "runnable");
        ((ThreadPoolExecutor) c4543g.f37843n).execute(runnable);
    }
}
