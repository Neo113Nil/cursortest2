package defpackage;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class rpq {
    public final bvb a;
    public final wjl b;
    public final z66 c;
    public wub d;

    public rpq(bvb bvbVar, wjl wjlVar, z66 z66Var) {
        bvbVar.getClass();
        wjlVar.getClass();
        z66Var.getClass();
        this.a = bvbVar;
        this.b = wjlVar;
        this.c = z66Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        qpq qpqVar;
        int i;
        rpq rpqVar;
        if (cg6Var instanceof qpq) {
            qpqVar = (qpq) cg6Var;
            int i2 = qpqVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qpqVar.m = i2 - Integer.MIN_VALUE;
                Object obj = qpqVar.k;
                nm6 nm6Var = nm6.a;
                i = qpqVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    qpqVar.j = this;
                    qpqVar.m = 1;
                    bvb bvbVar = this.a;
                    bvbVar.getClass();
                    obj = gld.Q(new avb(bvbVar, null), qpqVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    rpqVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rpqVar = qpqVar.j;
                    qgg.h0(obj);
                }
                rpqVar.d = (wub) obj;
                return Unit.a;
            }
        }
        qpqVar = new qpq(this, cg6Var);
        Object obj2 = qpqVar.k;
        nm6 nm6Var2 = nm6.a;
        i = qpqVar.m;
        if (i != 0) {
        }
        rpqVar.d = (wub) obj2;
        return Unit.a;
    }
}
