package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class m2t implements ttr, tqg {
    public final r7b a;
    public final ano b;
    public final apo c;
    public final pt0 d;
    public final g06 e = new g06(new d5b(), c5b.a);

    public m2t(r7b r7bVar, ano anoVar, apo apoVar, pt0 pt0Var) {
        this.a = r7bVar;
        this.b = anoVar;
        this.c = apoVar;
        this.d = pt0Var;
    }

    @Override // defpackage.tqg
    public final g06 a() {
        return this.e;
    }

    @Override // defpackage.ttr
    public final Object b(cir cirVar, ohb ohbVar, lco lcoVar) {
        boolean z = ohbVar instanceof n5a;
        pt0 pt0Var = this.d;
        apo apoVar = this.c;
        r7b r7bVar = this.a;
        ano anoVar = this.b;
        if (z) {
            n5a n5aVar = (n5a) ohbVar;
            t5a t5aVar = n5aVar.a;
            q2a q2aVar = n5aVar.b;
            o6a o6aVar = (o6a) ywf.L(this, anoVar);
            ArrayList m = apoVar.m();
            Iterator it = ((ano) o6aVar).a.iterator();
            while (it.hasNext()) {
                try {
                    ((ano) ((o6a) it.next())).f(q2aVar, t5aVar, r7bVar, m);
                } catch (Throwable th) {
                    Timber.INSTANCE.e(th);
                }
            }
            pt0Var.D(new o5a(r7bVar, t5aVar));
        } else if (ohbVar instanceof h5a) {
            h5a h5aVar = (h5a) ohbVar;
            t5a t5aVar2 = h5aVar.a;
            ArrayList m2 = apoVar.m();
            o6a o6aVar2 = (o6a) ywf.L(this, anoVar);
            m4a m4aVar = h5aVar.b;
            Iterator it2 = ((ano) o6aVar2).a.iterator();
            while (it2.hasNext()) {
                try {
                    ((ano) ((o6a) it2.next())).e(r7bVar, t5aVar2, m4aVar, m2);
                } catch (Throwable th2) {
                    Timber.INSTANCE.e(th2);
                }
            }
            pt0Var.D(new i5a(m4aVar.a, t5aVar2, r7bVar, m2));
        } else if (ohbVar instanceof f5a) {
            f5a f5aVar = (f5a) ohbVar;
            t5a t5aVar3 = f5aVar.a;
            ArrayList m3 = apoVar.m();
            o6a o6aVar3 = (o6a) ywf.L(this, anoVar);
            Throwable th3 = f5aVar.b;
            Iterator it3 = ((ano) o6aVar3).a.iterator();
            while (it3.hasNext()) {
                try {
                    ((ano) ((o6a) it3.next())).d(r7bVar, t5aVar3, th3, m3);
                } catch (Throwable th4) {
                    Timber.INSTANCE.e(th4);
                }
            }
            pt0Var.D(new g5a(r7bVar, t5aVar3, th3, m3));
        } else if (ohbVar instanceof d5a) {
            d5a d5aVar = (d5a) ohbVar;
            t5a t5aVar4 = d5aVar.a;
            o6a o6aVar4 = (o6a) ywf.L(this, anoVar);
            ArrayList m4 = apoVar.m();
            CancellationException cancellationException = d5aVar.b;
            Iterator it4 = ((ano) o6aVar4).a.iterator();
            while (it4.hasNext()) {
                try {
                    ((ano) ((o6a) it4.next())).c(r7bVar, t5aVar4, m4, cancellationException);
                } catch (Throwable th5) {
                    Timber.INSTANCE.e(th5);
                }
            }
            pt0Var.D(new e5a(r7bVar, t5aVar4));
        } else if (ohbVar instanceof uhm) {
            o6a o6aVar5 = (o6a) ywf.L(this, anoVar);
            apoVar.m();
            o6aVar5.getClass();
            pt0Var.D(new m5a(r7bVar));
        } else if (ohbVar instanceof thm) {
            thm thmVar = (thm) ohbVar;
            o6a o6aVar6 = (o6a) ywf.L(this, anoVar);
            m4a m4aVar2 = thmVar.c;
            apoVar.m();
            o6aVar6.getClass();
            pt0Var.D(new l5a(r7bVar, thmVar.a, thmVar.b, m4aVar2.a));
        } else if (ohbVar instanceof shm) {
            o6a o6aVar7 = (o6a) ywf.L(this, anoVar);
            apoVar.m();
            o6aVar7.getClass();
            pt0Var.D(new k5a(r7bVar, null));
        } else if (ohbVar instanceof rhm) {
            o6a o6aVar8 = (o6a) ywf.L(this, anoVar);
            apoVar.m();
            o6aVar8.getClass();
            pt0Var.D(new j5a(r7bVar));
        }
        return Unit.a;
    }
}
