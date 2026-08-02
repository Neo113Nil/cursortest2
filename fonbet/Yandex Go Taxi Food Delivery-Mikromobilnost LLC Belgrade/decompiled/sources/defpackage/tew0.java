package defpackage;

import com.yandex.go.user_session.data.model.SuperappSession;
import com.yandex.go.user_session.data.model.a;
import com.yandex.go.utils.storage.json.b;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class tew0 implements yw60 {
    public final ky2 a;
    public final b b;
    public final i3y c;

    public tew0(eex eexVar, ky2 ky2Var) {
        this.a = ky2Var;
        a aVar = SuperappSession.Companion;
        aVar.getClass();
        this.b = eexVar.c(new am2("superapp", "superapp_session.json", SuperappSession.h), aVar.serializer());
        this.c = kotlin.a.a(new qhq0(21, this));
        ky2Var.d(new sew0(this));
    }

    @Override // defpackage.yw60
    public final void b() {
        d(Long.valueOf(System.currentTimeMillis()));
    }

    public final void d(Long l) {
        boolean z;
        while (true) {
            i3y i3yVar = this.c;
            SuperappSession superappSession = (SuperappSession) ((AtomicReference) i3yVar.getValue()).get();
            Long l2 = l;
            SuperappSession superappSession2 = new SuperappSession(superappSession.a, superappSession.b, l2, superappSession.d, superappSession.e, superappSession.f, superappSession.g);
            if (jl40.l(superappSession.c, l2)) {
                return;
            }
            AtomicReference atomicReference = (AtomicReference) i3yVar.getValue();
            while (true) {
                if (atomicReference.compareAndSet(superappSession, superappSession2)) {
                    z = true;
                    break;
                } else if (atomicReference.get() != superappSession) {
                    z = false;
                    break;
                }
            }
            if (z) {
                this.b.b(superappSession2);
            }
            if (z) {
                return;
            } else {
                l = l2;
            }
        }
    }

    @Override // defpackage.s150
    public final String getName() {
        return "SuperappSessionRepositoryImpl";
    }
}
