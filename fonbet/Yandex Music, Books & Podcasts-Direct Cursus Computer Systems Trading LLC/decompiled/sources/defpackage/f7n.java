package defpackage;

import java.util.List;

/* loaded from: classes6.dex */
public final class f7n {
    public static final f7n a = new f7n();

    /* JADX WARN: Type inference failed for: r2v2, types: [arf, java.lang.Object] */
    public static boolean a(yxc yxcVar) {
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (((h7n) ((byb) qdcVar.C(I)).b(h7n.class)).h()) {
            if (yxcVar == null) {
                return false;
            }
            if (!((List) yxcVar.j.getValue()).contains(xc6.a)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(yxc yxcVar) {
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (((g7n) ((byb) qdcVar.C(I)).b(g7n.class)).h()) {
            return a(yxcVar);
        }
        return false;
    }
}
