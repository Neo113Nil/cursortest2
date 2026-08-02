package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class k54 implements j54 {
    public final anx a;
    public final by7 b;

    public k54(int i, sfm sfmVar, qwq qwqVar, q14 q14Var) {
        Integer valueOf;
        o54 o54Var;
        sfmVar.getClass();
        q14Var.getClass();
        pdp H = qwqVar.H();
        sfmVar.getClass();
        q14Var.getClass();
        H.getClass();
        anx anxVar = new anx();
        anxVar.a = i;
        anxVar.b = sfmVar;
        anxVar.c = H;
        lm4 a = ern.a(ltq.class);
        String str = q14Var.a;
        if (str == null) {
            o54Var = new o54(false, false, 0, q14Var);
        } else {
            ConcurrentHashMap concurrentHashMap = H.f;
            tx3 tx3Var = concurrentHashMap == null ? null : (tx3) concurrentHashMap.get(str);
            if (tx3Var == null) {
                String str2 = q14Var.a;
                str2.getClass();
                tx3 tx3Var2 = (tx3) H.e.get(str2);
                List list = q14Var.b;
                if (tx3Var2 == null) {
                    g24 g24Var = (g24) CollectionsKt.firstOrNull(list);
                    if (g24Var != null) {
                        H.a(q14Var.a, sk3.Z(g24Var));
                    }
                    o54Var = new o54(true, false, 0, q14Var);
                } else {
                    Iterator it = list.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        Object next = it.next();
                        if (i2 < 0) {
                            u75.n();
                            throw null;
                        }
                        if (sk3.Z((g24) next).equals(tx3Var2)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    valueOf = i2 != -1 ? Integer.valueOf(i2) : null;
                    o54Var = new o54(true, false, valueOf != null ? valueOf.intValue() : 0, q14Var);
                }
            } else {
                Iterator it2 = q14Var.b.iterator();
                int i3 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    Object next2 = it2.next();
                    if (i3 < 0) {
                        u75.n();
                        throw null;
                    }
                    if (sk3.Z((g24) next2).equals(tx3Var)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                valueOf = i3 != -1 ? Integer.valueOf(i3) : null;
                o54Var = new o54(true, true, valueOf != null ? valueOf.intValue() : 0, q14Var);
            }
        }
        anxVar.d = asq.K(sfmVar.w(i, a, new ltq(o54Var)), new h14(5));
        this.a = anxVar;
        this.b = (by7) anxVar.d;
    }

    @Override // defpackage.j54
    public final vdr a() {
        return this.b;
    }

    @Override // defpackage.j54
    public final void b(int i) {
        anx anxVar = this.a;
        ((sfm) anxVar.b).P(anxVar.a, ern.a(ltq.class), new ltq(o54.a((o54) ((by7) anxVar.d).b.invoke(), false, i, 11)));
    }

    @Override // defpackage.j54
    public final void c(String str, g24 g24Var) {
        str.getClass();
        g24Var.getClass();
        anx anxVar = this.a;
        anxVar.getClass();
        pdp pdpVar = (pdp) anxVar.c;
        tx3 Z = sk3.Z(g24Var);
        pdpVar.getClass();
        ConcurrentHashMap concurrentHashMap = pdpVar.f;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, Z);
            x97.y(pdpVar.a, null, null, new odp(pdpVar, null, 2), 3);
            x97.y(pdpVar.a, null, null, new kun(pdpVar, str, Z, null, 15), 3);
        }
        ((sfm) anxVar.b).P(anxVar.a, ern.a(ltq.class), new ltq(o54.a((o54) ((by7) anxVar.d).b.invoke(), true, 0, 13)));
    }

    @Override // defpackage.j54
    public final void d(String str, g24 g24Var) {
        str.getClass();
        g24Var.getClass();
        anx anxVar = this.a;
        anxVar.getClass();
        pdp pdpVar = (pdp) anxVar.c;
        pdpVar.getClass();
        ConcurrentHashMap concurrentHashMap = pdpVar.f;
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(str);
            x97.y(pdpVar.a, null, null, new odp(pdpVar, null, 0), 3);
            x97.y(pdpVar.a, null, null, new v5p(pdpVar, str, null, 2), 3);
        }
        ((pdp) anxVar.c).a(str, sk3.Z(g24Var));
        ((sfm) anxVar.b).P(anxVar.a, ern.a(ltq.class), new ltq(o54.a((o54) ((by7) anxVar.d).b.invoke(), false, 0, 13)));
    }
}
