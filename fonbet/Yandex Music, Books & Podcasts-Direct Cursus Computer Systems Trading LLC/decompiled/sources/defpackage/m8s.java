package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class m8s {
    public static final m8s h = new m8s(new f4m(new qut(su4.o(new StringBuilder(), cvt.g, " TaskRunner"), true)));
    public static final Logger i;
    public final f4m a;
    public boolean c;
    public long d;
    public int b = 10000;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final yyo g = new yyo(6, this);

    static {
        Logger logger = Logger.getLogger(m8s.class.getName());
        logger.getClass();
        i = logger;
    }

    public m8s(f4m f4mVar) {
        this.a = f4mVar;
    }

    public static final void a(m8s m8sVar, f8s f8sVar) {
        byte[] bArr = cvt.a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(f8sVar.a);
        try {
            long a = f8sVar.a();
            synchronized (m8sVar) {
                m8sVar.b(f8sVar, a);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (m8sVar) {
                m8sVar.b(f8sVar, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(f8s f8sVar, long j) {
        byte[] bArr = cvt.a;
        l8s l8sVar = f8sVar.c;
        l8sVar.getClass();
        if (l8sVar.d != f8sVar) {
            xq0.q("Check failed.");
            return;
        }
        boolean z = l8sVar.f;
        l8sVar.f = false;
        l8sVar.d = null;
        this.e.remove(l8sVar);
        if (j != -1 && !z && !l8sVar.c) {
            l8sVar.e(f8sVar, j, true);
        }
        if (l8sVar.e.isEmpty()) {
            return;
        }
        this.f.add(l8sVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0091, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f8s c() {
        boolean z;
        byte[] bArr = cvt.a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                break;
            }
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j = Long.MAX_VALUE;
            f8s f8sVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                f8s f8sVar2 = (f8s) ((l8s) it.next()).e.get(0);
                long max = Math.max(0L, f8sVar2.d - nanoTime);
                if (max > 0) {
                    j = Math.min(max, j);
                } else {
                    if (f8sVar != null) {
                        z = true;
                        break;
                    }
                    f8sVar = f8sVar2;
                }
            }
            ArrayList arrayList2 = this.e;
            if (f8sVar != null) {
                byte[] bArr2 = cvt.a;
                f8sVar.d = -1L;
                l8s l8sVar = f8sVar.c;
                l8sVar.getClass();
                l8sVar.e.remove(f8sVar);
                arrayList.remove(l8sVar);
                l8sVar.d = f8sVar;
                arrayList2.add(l8sVar);
                if (z || (!this.c && !arrayList.isEmpty())) {
                    yyo yyoVar = this.g;
                    yyoVar.getClass();
                    ((ThreadPoolExecutor) this.a.b).execute(yyoVar);
                }
                return f8sVar;
            }
            if (!this.c) {
                this.c = true;
                this.d = nanoTime + j;
                try {
                    try {
                        long j2 = j / 1000000;
                        long j3 = j - (1000000 * j2);
                        if (j2 > 0 || j > 0) {
                            wait(j2, (int) j3);
                        }
                    } catch (InterruptedException unused) {
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((l8s) arrayList2.get(size)).b();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            l8s l8sVar2 = (l8s) arrayList.get(size2);
                            l8sVar2.b();
                            if (l8sVar2.e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.c = false;
                }
            } else if (j < this.d - nanoTime) {
                notify();
            }
        }
    }

    public final void d(l8s l8sVar) {
        l8sVar.getClass();
        byte[] bArr = cvt.a;
        if (l8sVar.d == null) {
            boolean isEmpty = l8sVar.e.isEmpty();
            ArrayList arrayList = this.f;
            if (isEmpty) {
                arrayList.remove(l8sVar);
            } else {
                arrayList.getClass();
                if (!arrayList.contains(l8sVar)) {
                    arrayList.add(l8sVar);
                }
            }
        }
        if (this.c) {
            notify();
            return;
        }
        yyo yyoVar = this.g;
        yyoVar.getClass();
        ((ThreadPoolExecutor) this.a.b).execute(yyoVar);
    }

    public final l8s e() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new l8s(this, k5r.i(i2, "Q"));
    }
}
