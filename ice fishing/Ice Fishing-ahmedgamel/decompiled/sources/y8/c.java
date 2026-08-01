package y8;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public class c extends z {

    /* renamed from: h, reason: collision with root package name */
    public static final G1.a f41940h;
    public static c i;

    /* renamed from: j, reason: collision with root package name */
    public static final ReentrantLock f41941j;

    /* renamed from: k, reason: collision with root package name */
    public static final Condition f41942k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f41943l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f41944m;

    /* renamed from: e, reason: collision with root package name */
    public int f41945e;

    /* renamed from: f, reason: collision with root package name */
    public int f41946f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f41947g;

    static {
        G1.a aVar = new G1.a((char) 0, 20);
        aVar.f1051v = new c[8];
        f41940h = aVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        f41941j = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.h.d(newCondition, "newCondition(...)");
        f41942k = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f41943l = millis;
        f41944m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j6 = this.f42002c;
        boolean z3 = this.f42000a;
        if (j6 != 0 || z3) {
            ReentrantLock reentrantLock = f41941j;
            reentrantLock.lock();
            try {
                if (this.f41945e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f41945e = 1;
                y2.e.a(this, j6, z3);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f41941j;
        reentrantLock.lock();
        try {
            int i6 = this.f41945e;
            this.f41945e = 0;
            if (i6 != 1) {
                return i6 == 2;
            }
            f41940h.o(this);
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
