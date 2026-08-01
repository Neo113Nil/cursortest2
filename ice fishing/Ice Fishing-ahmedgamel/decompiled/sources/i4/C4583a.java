package i4;

import C2.N;
import Q3.b;
import Q3.c;
import Q3.d;
import R3.e;
import R3.r;
import S7.S;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.h;

/* renamed from: i4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4583a implements e {

    /* renamed from: u, reason: collision with root package name */
    public static final C4583a f38059u = new C4583a(0);

    /* renamed from: v, reason: collision with root package name */
    public static final C4583a f38060v = new C4583a(1);

    /* renamed from: w, reason: collision with root package name */
    public static final C4583a f38061w = new C4583a(2);

    /* renamed from: x, reason: collision with root package name */
    public static final C4583a f38062x = new C4583a(3);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38063n;

    public /* synthetic */ C4583a(int i) {
        this.f38063n = i;
    }

    @Override // R3.e
    public final Object b(N n9) {
        switch (this.f38063n) {
            case 0:
                Object d2 = n9.d(new r(Q3.a.class, Executor.class));
                h.d(d2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) d2);
            case 1:
                Object d9 = n9.d(new r(c.class, Executor.class));
                h.d(d9, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) d9);
            case 2:
                Object d10 = n9.d(new r(b.class, Executor.class));
                h.d(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) d10);
            default:
                Object d11 = n9.d(new r(d.class, Executor.class));
                h.d(d11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) d11);
        }
    }
}
