package y8;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class i extends z {

    /* renamed from: e, reason: collision with root package name */
    public z f41955e;

    public i(z delegate) {
        kotlin.jvm.internal.h.e(delegate, "delegate");
        this.f41955e = delegate;
    }

    @Override // y8.z
    public final z a() {
        return this.f41955e.a();
    }

    @Override // y8.z
    public final z b() {
        return this.f41955e.b();
    }

    @Override // y8.z
    public final long c() {
        return this.f41955e.c();
    }

    @Override // y8.z
    public final z d(long j6) {
        return this.f41955e.d(j6);
    }

    @Override // y8.z
    public final boolean e() {
        return this.f41955e.e();
    }

    @Override // y8.z
    public final void f() {
        this.f41955e.f();
    }

    @Override // y8.z
    public final z g(long j6) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.h.e(unit, "unit");
        return this.f41955e.g(j6);
    }
}
