package defpackage;

import com.yandex.music.shared.phonoteka.synchronization.data.PhonotekaSyncApi;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class ork implements jrk {
    public final hok a;
    public final cc7 b;
    public final rjq c;
    public final um6 d;
    public final y9w e;
    public final g8c f;
    public final t1f g;
    public final vpk h;
    public final epk i;
    public final m j;
    public final nnd k;
    public final znk l;
    public final xdr m;
    public final xdr n;
    public final ReentrantLock o;
    public rar p;

    public ork(hok hokVar, i0j i0jVar, jac jacVar, frt frtVar, ac0 ac0Var, pt7 pt7Var, cc7 cc7Var, bx5 bx5Var, aaw aawVar, klx klxVar, mm6 mm6Var) {
        hokVar.getClass();
        this.a = hokVar;
        this.b = cc7Var;
        rjq rjqVar = new rjq(true);
        this.c = rjqVar;
        this.d = hld.s(rjqVar, mm6Var.getCoroutineContext().plus(dm6.b));
        y9w y9wVar = new y9w(29);
        this.e = y9wVar;
        Set set = hokVar.a;
        set.getClass();
        g8c g8cVar = new g8c();
        Object b = i0j.a(i0jVar, null, new ej(1, set), new aok(0), null, 51).a.b(PhonotekaSyncApi.class);
        b.getClass();
        g8cVar.a = (PhonotekaSyncApi) b;
        this.f = g8cVar;
        this.g = new t1f(ac0Var, cc7Var, frtVar, aawVar);
        this.h = new vpk(ac0Var, jacVar, y9wVar, hokVar.a, klxVar);
        epk epkVar = new epk(ac0Var, pt7Var, y9wVar);
        this.i = epkVar;
        this.j = new m(jacVar, g8cVar, epkVar, (rus) ac0Var.e.getValue(), hokVar.a, y9wVar, klxVar);
        this.k = new nnd(cc7Var, set, y9wVar);
        this.l = new znk(bx5Var, klxVar);
        xdr a = ydr.a(new erk(fs7.g, null));
        this.m = a;
        this.n = a;
        ox6.B(zsd.d0(zsd.b0(frtVar.g()), 1), mm6Var, new fmi(20, this));
        this.o = new ReentrantLock();
    }

    /* JADX WARN: Finally extract failed */
    public final Object a(String str, aur aurVar) {
        ReentrantLock reentrantLock = this.o;
        reentrantLock.lock();
        try {
            rar rarVar = this.p;
            if (rarVar == null || !rarVar.b()) {
                rarVar = x97.y(this.d, null, null, new h1j(this, str, (Continuation) null, 23), 3);
                this.p = rarVar;
            }
            reentrantLock.unlock();
            Object j0 = rarVar.j0(aurVar);
            return j0 == nm6.a ? j0 : Unit.a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
