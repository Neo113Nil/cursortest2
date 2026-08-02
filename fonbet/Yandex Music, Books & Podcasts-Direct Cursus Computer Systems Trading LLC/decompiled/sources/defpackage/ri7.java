package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class ri7 implements tqg {
    public final yg a;
    public final List b;
    public final g06 c = new g06(new d5b(), c5b.a);

    public ri7(yg ygVar, c5b c5bVar) {
        this.a = ygVar;
        this.b = c5bVar;
    }

    @Override // defpackage.tqg
    public final g06 a() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(pg pgVar, q2a q2aVar, cg6 cg6Var) {
        qi7 qi7Var;
        int i;
        q2a q2aVar2;
        yg ygVar;
        if (cg6Var instanceof qi7) {
            qi7Var = (qi7) cg6Var;
            int i2 = qi7Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qi7Var.o = i2 - Integer.MIN_VALUE;
                Object obj = qi7Var.m;
                nm6 nm6Var = nm6.a;
                i = qi7Var.o;
                if (i != 0) {
                    qgg.h0(obj);
                    yg ygVar2 = this.a;
                    ywf.E(this, ygVar2);
                    String str = pgVar.a;
                    klx klxVar = new klx(12);
                    qi7Var.j = q2aVar;
                    qi7Var.k = ygVar2;
                    qi7Var.l = pgVar;
                    qi7Var.o = 1;
                    Object t = p6g.t(this.b, q2aVar, klxVar, qi7Var);
                    if (t != nm6Var) {
                        q2aVar2 = q2aVar;
                        ygVar = ygVar2;
                        obj = t;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pgVar = qi7Var.l;
                yg ygVar3 = qi7Var.k;
                q2a q2aVar3 = qi7Var.j;
                qgg.h0(obj);
                ygVar = ygVar3;
                q2aVar2 = q2aVar3;
                pg pgVar2 = pgVar;
                qi7Var.j = null;
                qi7Var.k = null;
                qi7Var.l = null;
                qi7Var.o = 2;
                Object V = x97.V(ygVar.c, new xg(q2aVar2, ygVar, pgVar2, (Map) obj, (Continuation) null), qi7Var);
                return V != nm6Var ? nm6Var : V;
            }
        }
        qi7Var = new qi7(this, cg6Var);
        Object obj2 = qi7Var.m;
        nm6 nm6Var2 = nm6.a;
        i = qi7Var.o;
        if (i != 0) {
        }
        pg pgVar22 = pgVar;
        qi7Var.j = null;
        qi7Var.k = null;
        qi7Var.l = null;
        qi7Var.o = 2;
        Object V2 = x97.V(ygVar.c, new xg(q2aVar2, ygVar, pgVar22, (Map) obj2, (Continuation) null), qi7Var);
        if (V2 != nm6Var2) {
        }
    }
}
