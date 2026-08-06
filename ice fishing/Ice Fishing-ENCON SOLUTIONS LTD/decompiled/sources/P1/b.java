package P1;

import N1.o;
import W1.g;
import W1.k;
import W1.p;
import W1.u;
import W1.y;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b implements u {

    /* renamed from: a, reason: collision with root package name */
    public final k f1501a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f1503c;

    public b(o this$0) {
        i.e(this$0, "this$0");
        this.f1503c = this$0;
        this.f1501a = new k(((p) this$0.f1229e).f1892a.d());
    }

    @Override // W1.u, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f1502b) {
            return;
        }
        this.f1502b = true;
        ((p) this.f1503c.f1229e).g("0\r\n\r\n");
        o oVar = this.f1503c;
        k kVar = this.f1501a;
        oVar.getClass();
        y yVar = kVar.f1880e;
        kVar.f1880e = y.f1911d;
        yVar.a();
        yVar.b();
        this.f1503c.f1225a = 3;
    }

    @Override // W1.u
    public final y d() {
        return this.f1501a;
    }

    @Override // W1.u, java.io.Flushable
    public final synchronized void flush() {
        if (this.f1502b) {
            return;
        }
        ((p) this.f1503c.f1229e).flush();
    }

    @Override // W1.u
    public final void h(g gVar, long j2) {
        if (this.f1502b) {
            throw new IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        o oVar = this.f1503c;
        p pVar = (p) oVar.f1229e;
        if (pVar.f1894c) {
            throw new IllegalStateException("closed");
        }
        pVar.f1893b.v(j2);
        pVar.a();
        p pVar2 = (p) oVar.f1229e;
        pVar2.g("\r\n");
        pVar2.h(gVar, j2);
        pVar2.g("\r\n");
    }
}
