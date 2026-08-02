package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes9.dex */
public final class tn11 {
    public static zn11 a(List list) {
        qn11 qn11Var;
        HashMap hashMap = new HashMap(list.size());
        HashMap hashMap2 = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            un11 un11Var = (un11) it.next();
            if (un11Var != null && (qn11Var = un11Var.a) != null) {
                hashMap.put(qn11Var.getClass(), un11Var);
                hashMap2.put(un11Var.b, un11Var);
            }
        }
        return new zn11(hashMap, hashMap2);
    }

    public final KSerializer serializer() {
        return q4t0.c;
    }
}
