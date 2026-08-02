package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import yads.f5;
import yads.o30;

/* loaded from: classes7.dex */
public final class yl61 implements oy71 {
    public final e971 a;
    public final bp5 b;
    public final z081 c;
    public final AtomicInteger d;

    public yl61(e971 e971Var, int i, bp5 bp5Var, z081 z081Var) {
        this.a = e971Var;
        this.b = bp5Var;
        this.c = z081Var;
        this.d = new AtomicInteger(i);
    }

    @Override // defpackage.oy71
    public final void a() {
        if (this.d.decrementAndGet() == 0) {
            this.a.a(f5.q);
            this.b.b();
        }
    }

    @Override // defpackage.oy71
    public final void b() {
        if (this.d.getAndSet(0) > 0) {
            this.a.a(f5.q);
            this.c.a(o30.f);
            this.b.b();
        }
    }

    @Override // defpackage.oy71
    public final void c() {
    }
}
