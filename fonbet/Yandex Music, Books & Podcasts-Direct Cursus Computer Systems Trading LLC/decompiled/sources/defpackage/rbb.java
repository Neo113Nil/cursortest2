package defpackage;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class rbb extends bfu {
    public final n5p k;
    public final z8s l;

    public rbb(n5p n5pVar) {
        this.k = n5pVar;
        l18 l18Var = l18.b;
        bdt I = hag.I(z8s.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        z8s z8sVar = (z8s) qdcVar.C(I);
        this.l = z8sVar;
        if (n5pVar != null) {
            if (n5pVar instanceof j5p) {
                HashMap hashMap = z8sVar.b;
                String str = ((j5p) n5pVar).b.a;
                Integer num = (Integer) hashMap.get(str);
                hashMap.put(str, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                return;
            }
            if (!(n5pVar instanceof m5p)) {
                if ((n5pVar instanceof k5p) || (n5pVar instanceof l5p)) {
                    return;
                }
                b6e.s();
                throw null;
            }
            cvl cvlVar = ((m5p) n5pVar).b;
            if (ivf.I(cvlVar)) {
                return;
            }
            HashMap hashMap2 = z8sVar.c;
            String f = cvlVar.f();
            Integer num2 = (Integer) hashMap2.get(f);
            hashMap2.put(f, Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
        }
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        n5p n5pVar = this.k;
        if (n5pVar != null) {
            z8s z8sVar = this.l;
            HashMap hashMap = z8sVar.c;
            y8s y8sVar = z8sVar.a;
            HashMap hashMap2 = z8sVar.b;
            if (n5pVar instanceof j5p) {
                String str = ((j5p) n5pVar).b.a;
                Integer num = (Integer) hashMap2.get(str);
                int intValue = (num != null ? num.intValue() : 1) - 1;
                hashMap2.put(str, Integer.valueOf(intValue));
                if ((intValue < 1 ? Integer.valueOf(intValue) : null) != null) {
                    y8sVar.getClass();
                    str.getClass();
                    y8sVar.d.remove(str);
                    hashMap2.remove(str);
                    return;
                }
                return;
            }
            if (!(n5pVar instanceof m5p)) {
                if ((n5pVar instanceof k5p) || (n5pVar instanceof l5p)) {
                    return;
                }
                b6e.s();
                return;
            }
            cvl cvlVar = ((m5p) n5pVar).b;
            if (ivf.I(cvlVar)) {
                return;
            }
            String f = cvlVar.f();
            Integer num2 = (Integer) hashMap.get(f);
            int intValue2 = (num2 != null ? num2.intValue() : 1) - 1;
            hashMap.put(f, Integer.valueOf(intValue2));
            if ((intValue2 < 1 ? Integer.valueOf(intValue2) : null) != null) {
                y8sVar.getClass();
                f.getClass();
                y8sVar.e.remove(f);
                hashMap.remove(f);
            }
        }
    }
}
