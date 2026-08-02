package defpackage;

import androidx.lifecycle.Lifecycle;
import flex.engine.a;

/* loaded from: classes.dex */
public final class w0j implements pey {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public w0j(h55 h55Var, tls tlsVar) {
        this.b = new v0j(h55Var.getLifecycle(), this, tlsVar);
    }

    public void a() {
        v0j v0jVar = (v0j) this.b;
        if (v0jVar.w) {
            return;
        }
        v0jVar.w = true;
        v0jVar.e(g18.u1);
        v0jVar.b.d(v0jVar.A);
        v0jVar.z.g(Lifecycle.Event.ON_DESTROY);
    }

    @Override // defpackage.pey
    public final Lifecycle getLifecycle() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (v0j) obj;
            default:
                return ((a) obj).m();
        }
    }

    public w0j(a aVar) {
        this.b = aVar;
    }
}
