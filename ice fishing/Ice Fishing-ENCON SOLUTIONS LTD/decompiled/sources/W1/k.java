package W1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k extends y {

    /* renamed from: e, reason: collision with root package name */
    public y f1880e;

    public k(y delegate) {
        kotlin.jvm.internal.i.e(delegate, "delegate");
        this.f1880e = delegate;
    }

    @Override // W1.y
    public final y a() {
        return this.f1880e.a();
    }

    @Override // W1.y
    public final y b() {
        return this.f1880e.b();
    }

    @Override // W1.y
    public final long c() {
        return this.f1880e.c();
    }

    @Override // W1.y
    public final y d(long j2) {
        return this.f1880e.d(j2);
    }

    @Override // W1.y
    public final boolean e() {
        return this.f1880e.e();
    }

    @Override // W1.y
    public final void f() {
        this.f1880e.f();
    }

    @Override // W1.y
    public final y g(long j2, TimeUnit unit) {
        kotlin.jvm.internal.i.e(unit, "unit");
        return this.f1880e.g(j2, unit);
    }
}
