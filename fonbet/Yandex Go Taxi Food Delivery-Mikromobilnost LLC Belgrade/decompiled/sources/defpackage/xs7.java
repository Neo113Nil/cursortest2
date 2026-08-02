package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes10.dex */
public final class xs7 {
    public static final xs7 b;
    public static final xs7 c;
    public final LinkedHashSet a;

    static {
        ws7 ws7Var = new ws7();
        ws7Var.b(0);
        b = ws7Var.a();
        ws7 ws7Var2 = new ws7();
        ws7Var2.b(1);
        c = ws7Var2.a();
    }

    public xs7(LinkedHashSet linkedHashSet) {
        this.a = linkedHashSet;
    }

    public final List a(List list) {
        List arrayList = new ArrayList(list);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList = ((pq7) it.next()).a(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public final Integer b() {
        Iterator it = this.a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            pq7 pq7Var = (pq7) it.next();
            if (pq7Var instanceof nby) {
                Integer valueOf = Integer.valueOf(((nby) pq7Var).b);
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    ny61.r("Multiple conflicting lens facing requirements exist.");
                    return null;
                }
            }
        }
        return num;
    }

    public final br7 c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((br7) it.next()).c());
        }
        List a = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            br7 br7Var = (br7) it2.next();
            if (a.contains(br7Var.c())) {
                linkedHashSet2.add(br7Var);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (br7) it3.next();
        }
        StringBuilder sb = new StringBuilder("Cams:");
        sb.append(linkedHashSet.size());
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            ar7 f = ((br7) it4.next()).f();
            sb.append(" Id:" + f.c() + "  Lens:" + f.d());
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        LinkedHashSet linkedHashSet3 = this.a;
        sb3.append("PhyId:null  Filters:" + linkedHashSet3.size());
        Iterator it5 = linkedHashSet3.iterator();
        while (it5.hasNext()) {
            pq7 pq7Var = (pq7) it5.next();
            sb3.append(" Id:");
            sb3.append(pq7Var.getIdentifier());
            if (pq7Var instanceof nby) {
                sb3.append(" LensFilter:");
                sb3.append(((nby) pq7Var).b);
            }
        }
        ny61.g(b64.l("No available camera can be found. ", sb2, " ", sb3.toString()));
        return null;
    }
}
