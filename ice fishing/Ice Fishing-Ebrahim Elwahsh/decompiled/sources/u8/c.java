package u8;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public class c extends z {

    /* renamed from: h, reason: collision with root package name */
    public static final G1.a f41264h;
    public static c i;

    /* renamed from: j, reason: collision with root package name */
    public static final ReentrantLock f41265j;

    /* renamed from: k, reason: collision with root package name */
    public static final Condition f41266k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f41267l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f41268m;

    /* renamed from: e, reason: collision with root package name */
    public int f41269e;

    /* renamed from: f, reason: collision with root package name */
    public int f41270f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f41271g;

    static {
        G1.a aVar = new G1.a((char) 0, 20);
        aVar.f1195v = new c[8];
        f41264h = aVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        f41265j = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.h.d(newCondition, "newCondition(...)");
        f41266k = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f41267l = millis;
        f41268m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j9 = this.f41326c;
        boolean z8 = this.f41324a;
        if (j9 != 0 || z8) {
            ReentrantLock reentrantLock = f41265j;
            reentrantLock.lock();
            try {
                if (this.f41269e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f41269e = 1;
                C3.e.i(this, j9, z8);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f41265j;
        reentrantLock.lock();
        try {
            int i4 = this.f41269e;
            this.f41269e = 0;
            if (i4 != 1) {
                return i4 == 2;
            }
            f41264h.n(this);
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
