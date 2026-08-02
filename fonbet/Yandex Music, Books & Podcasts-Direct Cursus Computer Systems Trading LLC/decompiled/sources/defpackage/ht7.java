package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ht7 {
    public final String a;
    public final sld b;

    public ht7(Set set, sld sldVar) {
        this.a = b(set);
        this.b = sldVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ld2 ld2Var = (ld2) it.next();
            sb.append(ld2Var.a);
            sb.append('/');
            sb.append(ld2Var.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        sld sldVar = this.b;
        synchronized (((HashSet) sldVar.b)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) sldVar.b);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) sldVar.b)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) sldVar.b);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
