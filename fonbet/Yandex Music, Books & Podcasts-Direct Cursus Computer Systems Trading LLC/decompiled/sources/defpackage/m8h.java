package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class m8h extends t7h {
    public static final ReferenceQueue c = new ReferenceQueue();
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final Logger e = Logger.getLogger(m8h.class.getName());
    public final j8h a;
    public final l8h b;

    public m8h(j8h j8hVar) {
        this.a = j8hVar;
        this.b = new l8h(this, j8hVar, c, d);
    }

    @Override // defpackage.mc4
    public final String e() {
        return this.a.t.e();
    }

    @Override // defpackage.mc4
    public final vn4 g(k3i k3iVar, ks3 ks3Var) {
        return this.a.t.g(k3iVar, ks3Var);
    }

    @Override // defpackage.t7h
    public final void h() {
        this.a.h();
    }

    @Override // defpackage.t7h
    public final r76 i(boolean z) {
        return this.a.i(z);
    }

    @Override // defpackage.t7h
    public final boolean j() {
        return this.a.F.get();
    }

    @Override // defpackage.t7h
    public final boolean k() {
        return this.a.I;
    }

    @Override // defpackage.t7h
    public final void l(r76 r76Var, e8h e8hVar) {
        this.a.l(r76Var, e8hVar);
    }

    @Override // defpackage.t7h
    public final void m() {
        this.a.m();
    }

    @Override // defpackage.t7h
    public final t7h n() {
        l8h l8hVar = this.b;
        if (!l8hVar.e.getAndSet(true)) {
            l8hVar.clear();
        }
        j8h j8hVar = this.a;
        j8hVar.n();
        return j8hVar;
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(this.a, "delegate");
        return Y.toString();
    }
}
