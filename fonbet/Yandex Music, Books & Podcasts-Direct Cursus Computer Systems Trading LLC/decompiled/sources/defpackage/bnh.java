package defpackage;

import com.yandex.passport.common.core.f;
import com.yandex.passport.internal.core.accounts.g;
import com.yandex.passport.internal.core.accounts.i;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.m;
import com.yandex.passport.internal.report.n;
import com.yandex.passport.internal.report.reporters.c;
import com.yandex.passport.internal.report.reporters.x0;
import com.yandex.passport.internal.report.ve;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class bnh implements g {
    public boolean a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public bnh(woo wooVar, b6n b6nVar) {
        this.d = wooVar;
        this.e = b6nVar;
        this.f = new l3l();
        this.g = new LinkedHashMap();
        this.c = true;
    }

    public void a() {
        woo wooVar = (woo) this.d;
        if (wooVar.getLifecycle().b() != lyf.b) {
            xq0.q("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.a) {
                xq0.q("SavedStateRegistry was already attached.");
                return;
            }
            ((b6n) this.e).invoke();
            wooVar.getLifecycle().a(new ru2(7, this));
            this.a = true;
        }
    }

    @Override // com.yandex.passport.internal.core.accounts.g
    public void d(Exception exc) {
        c cVar = ((i) this.d).f;
        f fVar = ((l) this.e).b;
        boolean z = this.a;
        boolean z2 = this.b;
        x0 x0Var = (x0) this.f;
        boolean z3 = this.c;
        fVar.getClass();
        x0Var.getClass();
        cVar.n(m.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar.b)), new ff(4, z), new ve(26, z2), new ve(x0Var.name(), 10), new com.yandex.passport.internal.report.f(21, z3));
        ((AtomicReference) this.h).set(exc);
        ((CountDownLatch) this.g).countDown();
    }

    @Override // com.yandex.passport.internal.core.accounts.g
    public void onSuccess() {
        c cVar = ((i) this.d).f;
        f fVar = ((l) this.e).b;
        boolean z = this.a;
        boolean z2 = this.b;
        x0 x0Var = (x0) this.f;
        boolean z3 = this.c;
        fVar.getClass();
        x0Var.getClass();
        cVar.n(n.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar.b)), new ff(4, z), new ve(26, z2), new ve(x0Var.name(), 10), new com.yandex.passport.internal.report.f(21, z3));
        ((CountDownLatch) this.g).countDown();
    }

    public bnh() {
        this.f = vsn.g;
        this.b = true;
        ude udeVar = yde.b;
        this.g = qsn.e;
    }
}
