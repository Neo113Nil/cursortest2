package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class yip extends uip {
    public boolean a = true;
    public final /* synthetic */ rar b;
    public final /* synthetic */ zi3 c;
    public final /* synthetic */ xip d;
    public final /* synthetic */ jtc e;

    public yip(rar rarVar, zi3 zi3Var, xip xipVar, jtc jtcVar) {
        this.b = rarVar;
        this.c = zi3Var;
        this.d = xipVar;
        this.e = jtcVar;
    }

    @Override // defpackage.uip
    public final void a() {
        this.b.g(n7w.c("Cancellation received from client", null));
    }

    @Override // defpackage.uip
    public final void c() {
        this.c.n(null);
    }

    @Override // defpackage.uip
    public final void d(Object obj) {
        if (this.a) {
            Object c = this.c.c(obj);
            boolean z = c instanceof fd4;
            this.a = !z;
            if (z) {
                Throwable a = gd4.a(c);
                if (!(a instanceof CancellationException)) {
                    throw sgr.n.i("onMessage should never be called when requestsChannel is unready").h(a).a();
                }
            }
        }
        if (this.a) {
            return;
        }
        this.d.d();
    }

    @Override // defpackage.uip
    public final void e() {
        Object c = ((zi3) this.e.b).c(Unit.a);
        if (c instanceof fd4) {
            Throwable a = gd4.a(c);
            if (a != null) {
                throw a;
            }
            throw new AssertionError("Should be impossible; a CONFLATED channel should never return false on offer");
        }
    }
}
