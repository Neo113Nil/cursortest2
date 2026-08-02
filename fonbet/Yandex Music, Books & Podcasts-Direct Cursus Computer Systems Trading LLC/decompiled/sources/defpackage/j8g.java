package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class j8g implements pj {
    public final /* synthetic */ int a;
    public final pj b;

    public j8g(pj pjVar, int i) {
        this.a = i;
        pjVar.getClass();
        switch (i) {
            case 1:
                this.b = pjVar;
                break;
            default:
                this.b = pjVar;
                break;
        }
    }

    @Override // defpackage.pj
    public final /* bridge */ /* synthetic */ void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        switch (this.a) {
            case 0:
                e(r7fVar, fx6Var, (List) obj);
                break;
            default:
                d(r7fVar, fx6Var, (kwj) obj);
                break;
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        switch (this.a) {
            case 0:
                return c(a7fVar, fx6Var);
            default:
                a7fVar.getClass();
                fx6Var.getClass();
                return new kwj(this.b.b(a7fVar, fx6Var));
        }
    }

    public ArrayList c(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        a7fVar.m();
        ArrayList arrayList = new ArrayList();
        while (a7fVar.hasNext()) {
            arrayList.add(this.b.b(a7fVar, fx6Var));
        }
        a7fVar.l();
        return arrayList;
    }

    public void d(r7f r7fVar, fx6 fx6Var, kwj kwjVar) {
        r7fVar.getClass();
        fx6Var.getClass();
        kwjVar.getClass();
        this.b.a(r7fVar, fx6Var, kwjVar.f);
    }

    public void e(r7f r7fVar, fx6 fx6Var, List list) {
        r7fVar.getClass();
        fx6Var.getClass();
        list.getClass();
        r7fVar.m();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.b.a(r7fVar, fx6Var, it.next());
        }
        r7fVar.l();
    }
}
