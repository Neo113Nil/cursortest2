package k4;

import E2.M;
import S3.b;
import S3.c;
import S3.d;
import S7.S;
import T3.e;
import T3.r;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.h;

/* renamed from: k4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4644a implements e {

    /* renamed from: u, reason: collision with root package name */
    public static final C4644a f38596u = new C4644a(0);

    /* renamed from: v, reason: collision with root package name */
    public static final C4644a f38597v = new C4644a(1);

    /* renamed from: w, reason: collision with root package name */
    public static final C4644a f38598w = new C4644a(2);

    /* renamed from: x, reason: collision with root package name */
    public static final C4644a f38599x = new C4644a(3);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38600n;

    public /* synthetic */ C4644a(int i) {
        this.f38600n = i;
    }

    @Override // T3.e
    public final Object c(M m9) {
        switch (this.f38600n) {
            case 0:
                Object b9 = m9.b(new r(S3.a.class, Executor.class));
                h.d(b9, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) b9);
            case 1:
                Object b10 = m9.b(new r(c.class, Executor.class));
                h.d(b10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) b10);
            case 2:
                Object b11 = m9.b(new r(b.class, Executor.class));
                h.d(b11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) b11);
            default:
                Object b12 = m9.b(new r(d.class, Executor.class));
                h.d(b12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new S((Executor) b12);
        }
    }
}
