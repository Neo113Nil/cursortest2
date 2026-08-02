package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class jkt {
    public final qyf a;
    public final gjt b;
    public final ujt c;
    public final mjt d;
    public final bjt e;
    public final xdr f;
    public final xdr g;
    public final String h;

    public jkt(qyf qyfVar, gjt gjtVar, ujt ujtVar, mjt mjtVar, kxi kxiVar, cvo cvoVar) {
        gjtVar.getClass();
        ujtVar.getClass();
        this.a = qyfVar;
        this.b = gjtVar;
        this.c = ujtVar;
        this.d = mjtVar;
        this.e = new bjt(kxiVar.a, cvoVar, gjtVar);
        this.f = ydr.a(new qjt(null, new djt()));
        this.g = ydr.a(Boolean.FALSE);
        this.h = gjtVar.b;
        x97.y(qyfVar, null, null, new hkt(this, null, 0), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(jkt jktVar, cg6 cg6Var) {
        ikt iktVar;
        int i;
        rj6 rj6Var;
        xdr xdrVar = jktVar.f;
        if (cg6Var instanceof ikt) {
            iktVar = (ikt) cg6Var;
            int i2 = iktVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iktVar.l = i2 - Integer.MIN_VALUE;
                Object obj = iktVar.j;
                nm6 nm6Var = nm6.a;
                i = iktVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    mn7 mn7Var = dm6.b;
                    hkt hktVar = new hkt(jktVar, continuation, 1);
                    iktVar.l = 1;
                    obj = x97.V(mn7Var, hktVar, iktVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    bjt bjtVar = jktVar.e;
                    yjt yjtVar = (yjt) ((qj6) rj6Var).a;
                    ArrayList arrayList = yjtVar.a;
                    bjtVar.getClass();
                    int i3 = 0;
                    for (Object obj2 : arrayList) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            u75.n();
                            throw null;
                        }
                        yit yitVar = (yit) obj2;
                        gjt gjtVar = (gjt) bjtVar.c;
                        ajt q = bjt.q(yitVar, gjtVar.c.c, gjtVar.a, gjtVar.b, i3, null, Integer.valueOf(arrayList.size()));
                        nmb.m((nmb) bjtVar.d, ((fnb) bjtVar.a).G(), q.a == rht.b ? wjb.ObjectsGridScreen : wjb.ObjectsListScreen, null, null, null, null, null, null, 0, false, q.d, q.c, q.f, 1, q.i, null, null, null, 0, 492540);
                        i3 = i4;
                    }
                    qjt qjtVar = new qjt(yjtVar.b, new ejt(yjtVar.a));
                    xdrVar.getClass();
                    xdrVar.m(null, qjtVar);
                } else {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    xdrVar.getClass();
                    xdrVar.m(null, rjt.a);
                    ssg.a(6, null, "UniversalScreenViewModel error loadEntities", ((pj6) rj6Var).a());
                }
                return Unit.a;
            }
        }
        iktVar = new ikt(jktVar, cg6Var);
        Object obj3 = iktVar.j;
        nm6 nm6Var2 = nm6.a;
        i = iktVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        rj6Var = (rj6) obj3;
        if (!(rj6Var instanceof qj6)) {
        }
        return Unit.a;
    }
}
