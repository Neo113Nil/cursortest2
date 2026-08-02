package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class y8s {
    public final gug a;
    public final jyr b;
    public final jyr c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;

    public y8s(gug gugVar) {
        this.a = gugVar;
        bdt I = hag.I(z66.class);
        l18 l18Var = l18.b;
        this.b = l18Var.b(I, true);
        this.c = l18Var.b(hag.I(uaa.class), true);
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        x97.y(cmd.a, ca8.b, null, new glp(this, null, 22), 2);
    }

    public static final List a(y8s y8sVar, ArrayList arrayList) {
        if (!gut.h1((z66) y8sVar.b.getValue())) {
            return arrayList;
        }
        Set set = ((lja) ((e6q) ((uaa) y8sVar.c.getValue())).e.getValue()).a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (set.contains(((mqs) obj).a)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
