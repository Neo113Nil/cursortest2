package defpackage;

import com.yandex.go.superapp_carts.domain.loading.b;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes14.dex */
public final class r9w0 extends jhr {
    public final i6r F;
    public final h3y G;
    public b H;
    public final AtomicBoolean I;

    public r9w0(i6r i6rVar, h3y h3yVar, yvf0 yvf0Var) {
        super(yvf0Var);
        this.F = i6rVar;
        this.G = h3yVar;
        this.I = new AtomicBoolean(false);
    }

    @Override // defpackage.jhr, defpackage.h55
    public final void I(Object obj) {
        this.E = null;
        this.H = null;
        s9w0 s9w0Var = (s9w0) this.G.get();
        String str = ((p9w0) obj).a;
        s9w0Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("search_session_id", str);
        }
        s9w0Var.a.a("SuperappCarts.Closed", hashMap, 1, new HashMap());
    }

    @Override // defpackage.h55
    public final void K(Object obj) {
        b bVar;
        if (!this.I.getAndSet(false) || (bVar = this.H) == null) {
            return;
        }
        bVar.a(false);
    }

    @Override // defpackage.h55
    public final void L(Object obj) {
        this.I.set(true);
    }

    @Override // defpackage.jhr
    public final rhr Q(Object obj) {
        p9w0 p9w0Var = (p9w0) obj;
        q9w0 q9w0Var = new q9w0(this);
        tse o = o();
        ihr ihrVar = new ihr(this, new jhu0(this));
        i6r i6rVar = this.F;
        i6rVar.getClass();
        p9w0Var.getClass();
        nag nagVar = new nag(i6rVar, 0);
        nag nagVar2 = new nag(i6rVar, 7);
        n3w a = n3w.a(o);
        xvf0 b = i5m.b(n9w0.a);
        n3w a2 = n3w.a(ihrVar);
        eqh eqhVar = new eqh();
        int i = 4;
        nag nagVar3 = new nag(i6rVar, i);
        int i2 = 3;
        xvf0 b2 = i5m.b(new uzu0(new nag(i6rVar, i2), i));
        xvf0 b3 = i5m.b(new cys0((Object) nagVar3, b2, 24));
        xvf0 b4 = i5m.b(new com.yandex.go.superapp_carts.di.b(nagVar2, a, b, a2, eqhVar, b3));
        n3w a3 = n3w.a(q9w0Var);
        nag nagVar4 = new nag(i6rVar, 6);
        n3w a4 = n3w.a(p9w0Var);
        p7w0 p7w0Var = new p7w0(new nag(i6rVar, 2), i2);
        eqh.a(eqhVar, i5m.b(new rct0(nagVar, b4, i5m.b(new l9t0((xvf0) a3, (xvf0) nagVar4, (xvf0) a4, (xvf0) p7w0Var, 25, false)), i5m.b(new y2s0(b4, a4, p7w0Var, 20)), b2, 10, false)));
        int i3 = 21;
        xvf0 b5 = i5m.b(new v8c0(a, i3));
        xvf0 b6 = i5m.b(new l9t0((v7p) eqhVar, (xvf0) new rct0(a4, b5, new nag(i6rVar, 1), new y2s0(i5m.b(new cys0((Object) eqhVar, (xvf0) new nag(i6rVar, 5), 23)), new jag(i6rVar, 29), nagVar4, i3), b2), b, b3, 26, false));
        this.H = (b) b5.get();
        return (rhr) b6.get();
    }
}
