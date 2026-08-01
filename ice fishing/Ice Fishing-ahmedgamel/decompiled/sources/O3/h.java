package O3;

import C2.N;
import R3.r;
import S7.S;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class h implements R3.e {

    /* renamed from: u, reason: collision with root package name */
    public static final h f2353u = new h(0);

    /* renamed from: v, reason: collision with root package name */
    public static final h f2354v = new h(1);

    /* renamed from: w, reason: collision with root package name */
    public static final h f2355w = new h(2);

    /* renamed from: x, reason: collision with root package name */
    public static final h f2356x = new h(3);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2357n;

    public /* synthetic */ h(int i) {
        this.f2357n = i;
    }

    @Override // R3.e
    public final Object b(N n9) {
        switch (this.f2357n) {
            case 0:
                Object d2 = n9.d(new r(Q3.a.class, Executor.class));
                kotlin.jvm.internal.h.d(d2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) d2);
            case 1:
                Object d9 = n9.d(new r(Q3.c.class, Executor.class));
                kotlin.jvm.internal.h.d(d9, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) d9);
            case 2:
                Object d10 = n9.d(new r(Q3.b.class, Executor.class));
                kotlin.jvm.internal.h.d(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) d10);
            default:
                Object d11 = n9.d(new r(Q3.d.class, Executor.class));
                kotlin.jvm.internal.h.d(d11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) d11);
        }
    }
}
