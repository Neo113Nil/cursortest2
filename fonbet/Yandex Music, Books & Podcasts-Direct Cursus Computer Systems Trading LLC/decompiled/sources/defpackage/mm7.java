package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class mm7 implements ehc {
    public final g06 a;
    public final jzi b;
    public final es6 c;
    public ArrayList d = new ArrayList();

    public mm7(g06 g06Var, jzi jziVar, es6 es6Var) {
        this.a = g06Var;
        this.b = jziVar;
        this.c = es6Var;
    }

    @Override // defpackage.ehc
    public final Object b(b6 b6Var, boolean z) {
        Object obj;
        ArrayList arrayList = this.d;
        arrayList.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            zgc zgcVar = (zgc) obj2;
            zgcVar.getClass();
            if (zgcVar.a == ahc.experiment) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = this.d;
        arrayList3.getClass();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            zgc zgcVar2 = (zgc) obj3;
            zgcVar2.getClass();
            if (zgcVar2.a == ahc.global) {
                arrayList4.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 5;
        w1g.n((LinkedHashMap) this.c.c, new u60(linkedHashMap, 5));
        bhc bhcVar = new bhc(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        w1g.n(hhc.b.a, new u60(linkedHashMap2, 6));
        Iterator it = u75.j(bhcVar, new bhc(linkedHashMap2), i4w.s(arrayList2), i4w.s(arrayList4)).iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            bhc bhcVar2 = (bhc) it.next();
            String str = (String) b6Var.b;
            bhcVar2.getClass();
            str.getClass();
            chc chcVar = (chc) bhcVar2.a.get(str);
            if (chcVar != null) {
                String str2 = chcVar.a;
                if (str2 != null) {
                    boolean z2 = false;
                    try {
                        jzi jziVar = this.b;
                        str2.getClass();
                        tzb tzbVar = new tzb();
                        tzbVar.a = str2;
                        z2 = tzbVar.b(0, 0).d((Map) jziVar.a).c();
                    } catch (RuntimeException e) {
                        String message = e instanceof r7w ? ((r7w) e).getMessage() : String.valueOf(e);
                        LinkedHashMap linkedHashMap3 = sqg.a;
                        uwf.l("Failed to evaluate condition result for flag \"" + str + "\" with error:\n" + message);
                    }
                    if (!z2) {
                    }
                }
                q1f q1fVar = chcVar.c;
                Object E = b6Var.E(q1fVar);
                if (E == null) {
                    LinkedHashMap linkedHashMap4 = sqg.a;
                    uwf.l("Couldn't map value to flag \"" + str + "\":\n" + bkp.S(q1fVar));
                    E = null;
                }
                if (E != null) {
                    if (z) {
                        LinkedHashMap linkedHashMap5 = chcVar.b;
                        g06 g06Var = this.a;
                        ix6 ix6Var = (ix6) g06Var.b;
                        if (linkedHashMap5.size() != 0) {
                            tqn tqnVar = new tqn();
                            SharedPreferences.Editor edit = ((sk2) ix6Var.b).a.edit();
                            edit.getClass();
                            w1g.n(linkedHashMap5, new lf0(i, ix6Var, tqnVar, new sld(edit)));
                            edit.apply();
                            if (tqnVar.a) {
                                LinkedHashMap f = ix6Var.f();
                                n7b n7bVar = (n7b) g06Var.d;
                                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                w1g.n(f, new s30(24, n7bVar, linkedHashMap6));
                                ((knn) g06Var.c).q(linkedHashMap6);
                            }
                        }
                    }
                    obj = E;
                }
            }
        } while (obj == null);
        return obj == null ? b6Var.c : obj;
    }
}
