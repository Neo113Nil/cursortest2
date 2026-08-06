package P1;

import N1.o;
import W1.g;
import W1.k;
import W1.p;
import W1.u;
import W1.y;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class e implements u {

    /* renamed from: a, reason: collision with root package name */
    public final k f1510a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1511b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f1512c;

    public e(o this$0) {
        i.e(this$0, "this$0");
        this.f1512c = this$0;
        this.f1510a = new k(((p) this$0.f1229e).f1892a.d());
    }

    @Override // W1.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1511b) {
            return;
        }
        this.f1511b = true;
        o oVar = this.f1512c;
        oVar.getClass();
        k kVar = this.f1510a;
        y yVar = kVar.f1880e;
        kVar.f1880e = y.f1911d;
        yVar.a();
        yVar.b();
        oVar.f1225a = 3;
    }

    @Override // W1.u
    public final y d() {
        return this.f1510a;
    }

    @Override // W1.u, java.io.Flushable
    public final void flush() {
        if (this.f1511b) {
            return;
        }
        ((p) this.f1512c.f1229e).flush();
    }

    @Override // W1.u
    public final void h(g gVar, long j2) {
        if (this.f1511b) {
            throw new IllegalStateException("closed");
        }
        K1.b.c(gVar.f1875b, 0L, j2);
        ((p) this.f1512c.f1229e).h(gVar, j2);
    }
}
