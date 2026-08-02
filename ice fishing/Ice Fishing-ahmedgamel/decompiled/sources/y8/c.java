package y8;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public class c extends z {

    /* renamed from: h, reason: collision with root package name */
    public static final I1.a f41911h;
    public static c i;

    /* renamed from: j, reason: collision with root package name */
    public static final ReentrantLock f41912j;

    /* renamed from: k, reason: collision with root package name */
    public static final Condition f41913k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f41914l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f41915m;

    /* renamed from: e, reason: collision with root package name */
    public int f41916e;

    /* renamed from: f, reason: collision with root package name */
    public int f41917f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f41918g;

    static {
        I1.a aVar = new I1.a((char) 0, 20);
        aVar.f1304v = new c[8];
        f41911h = aVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        f41912j = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.h.d(newCondition, "newCondition(...)");
        f41913k = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f41914l = millis;
        f41915m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j6 = this.f41973c;
        boolean z6 = this.f41971a;
        if (j6 != 0 || z6) {
            ReentrantLock reentrantLock = f41912j;
            reentrantLock.lock();
            try {
                if (this.f41916e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f41916e = 1;
                x1.g.a(this, j6, z6);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f41912j;
        reentrantLock.lock();
        try {
            int i4 = this.f41916e;
            this.f41916e = 0;
            if (i4 != 1) {
                return i4 == 2;
            }
            f41911h.o(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException j(IOException iOException) {
        throw null;
    }

    public void k() {
    }
}
