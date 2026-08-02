package Q3;

import E2.M;
import S7.S;
import T3.r;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class h implements T3.e {

    /* renamed from: u, reason: collision with root package name */
    public static final h f2669u = new h(0);

    /* renamed from: v, reason: collision with root package name */
    public static final h f2670v = new h(1);

    /* renamed from: w, reason: collision with root package name */
    public static final h f2671w = new h(2);

    /* renamed from: x, reason: collision with root package name */
    public static final h f2672x = new h(3);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2673n;

    public /* synthetic */ h(int i) {
        this.f2673n = i;
    }

    @Override // T3.e
    public final Object c(M m9) {
        switch (this.f2673n) {
            case 0:
                Object b9 = m9.b(new r(S3.a.class, Executor.class));
                kotlin.jvm.internal.h.d(b9, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) b9);
            case 1:
                Object b10 = m9.b(new r(S3.c.class, Executor.class));
                kotlin.jvm.internal.h.d(b10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) b10);
            case 2:
                Object b11 = m9.b(new r(S3.b.class, Executor.class));
                kotlin.jvm.internal.h.d(b11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) b11);
            default:
                Object b12 = m9.b(new r(S3.d.class, Executor.class));
                kotlin.jvm.internal.h.d(b12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) b12);
        }
    }
}
