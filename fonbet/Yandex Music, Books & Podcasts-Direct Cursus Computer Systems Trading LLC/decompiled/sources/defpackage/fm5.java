package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import ru.kinopoisk.sdk.easylogin.internal.C1271w5;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1305z0;

/* loaded from: classes5.dex */
public final class fm5 extends bm5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ fm5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bm5
    public final void b(jm5 jm5Var) {
        switch (this.a) {
            case 0:
                em5 em5Var = new em5(jm5Var);
                jm5Var.b(em5Var);
                try {
                    suh suhVar = (suh) this.b;
                    CoroutineContext coroutineContext = (CoroutineContext) suhVar.b;
                    C1271w5.b bVar = (C1271w5.b) suhVar.c;
                    CoroutineContext a = bm6.a(g.a, coroutineContext, true);
                    CoroutineContext plus = ve7.a() ? a.plus(new hm6(ve7.c.incrementAndGet())) : a;
                    dq7 dq7Var = ca8.a;
                    if (a != dq7Var && a.get(d.t0) == null) {
                        plus = plus.plus(dq7Var);
                    }
                    a6 vjoVar = new vjo(plus, em5Var);
                    ra8.f(em5Var, new bu3(new ujo(vjoVar)));
                    vjoVar.o0(pm6.a, vjoVar, bVar);
                    break;
                } catch (Throwable th) {
                    leu.a0(th);
                    if (em5Var.b(th)) {
                        return;
                    }
                    y5g.g0(th);
                    return;
                }
            case 1:
                Throwable th2 = (InterfaceC1305z0.e) this.b;
                jm5Var.b(t4b.a);
                jm5Var.onError(th2);
                break;
            case 2:
                kjo kjoVar = new kjo(etn.p);
                jm5Var.b(kjoVar);
                try {
                    ((nd) this.b).mo32run();
                    if (!kjoVar.b()) {
                        jm5Var.onComplete();
                        break;
                    }
                } catch (Throwable th3) {
                    leu.a0(th3);
                    if (kjoVar.b()) {
                        y5g.g0(th3);
                        return;
                    } else {
                        jm5Var.onError(th3);
                        return;
                    }
                }
                break;
            case 3:
                ((zeh) this.b).K(new ozw(17, jm5Var));
                break;
            default:
                lm5 lm5Var = (lm5) this.b;
                rp7 rp7Var = new rp7();
                rp7Var.a = jm5Var;
                lm5Var.a(rp7Var);
                break;
        }
    }
}
