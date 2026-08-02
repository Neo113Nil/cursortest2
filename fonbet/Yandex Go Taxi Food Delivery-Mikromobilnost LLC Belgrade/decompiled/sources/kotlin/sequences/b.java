package kotlin.sequences;

import defpackage.abl0;
import defpackage.c8x0;
import defpackage.cnm;
import defpackage.e2r;
import defpackage.h73;
import defpackage.ixn;
import defpackage.j73;
import defpackage.oyr;
import defpackage.q2m0;
import defpackage.qha;
import defpackage.qrq0;
import defpackage.t5r;
import defpackage.tls;
import defpackage.uuu0;
import defpackage.w511;
import defpackage.ymm;
import defpackage.yrq0;
import defpackage.yw01;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public class b extends yrq0 {
    public static qrq0 f(qrq0 qrq0Var, int i) {
        if (i >= 0) {
            return i == 0 ? qrq0Var : qrq0Var instanceof cnm ? ((cnm) qrq0Var).drop(i) : new ymm(qrq0Var, i);
        }
        w511.f(oyr.j(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static t5r g(qrq0 qrq0Var, tls tlsVar) {
        return new t5r(qrq0Var, true, tlsVar);
    }

    public static t5r h(qrq0 qrq0Var, tls tlsVar) {
        return new t5r(qrq0Var, false, tlsVar);
    }

    public static t5r i(qrq0 qrq0Var) {
        return h(qrq0Var, new q2m0(22));
    }

    public static Object j(qrq0 qrq0Var) {
        Iterator it = qrq0Var.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static e2r k(qrq0 qrq0Var, tls tlsVar) {
        return new e2r(1, SequencesKt___SequencesKt$flatMap$2.b, qrq0Var, tlsVar);
    }

    public static e2r l(qrq0 qrq0Var, tls tlsVar) {
        return new e2r(1, SequencesKt___SequencesKt$flatMap$1.b, qrq0Var, tlsVar);
    }

    public static String m(qrq0 qrq0Var, String str, tls tlsVar, int i) {
        if ((i & 32) != 0) {
            tlsVar = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : qrq0Var) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            uuu0.a(sb, obj, tlsVar);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static Object n(qrq0 qrq0Var) {
        Iterator it = qrq0Var.iterator();
        if (!it.hasNext()) {
            w511.i("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static t5r o(qrq0 qrq0Var, tls tlsVar) {
        return i(new yw01(qrq0Var, tlsVar));
    }

    public static e2r p(qrq0 qrq0Var, qrq0 qrq0Var2) {
        int i = 1;
        qrq0 v = j73.v(new qrq0[]{qrq0Var, qrq0Var2});
        q2m0 q2m0Var = new q2m0(21);
        if (!(v instanceof yw01)) {
            return new e2r(i, q2m0Var, v, new abl0(17));
        }
        yw01 yw01Var = (yw01) v;
        return new e2r(i, q2m0Var, yw01Var.a, yw01Var.b);
    }

    public static qrq0 q(qrq0 qrq0Var, int i) {
        if (i >= 0) {
            return i == 0 ? ixn.a : qrq0Var instanceof cnm ? ((cnm) qrq0Var).a(i) : new c8x0(qrq0Var, i);
        }
        w511.f(oyr.j(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static void r(qrq0 qrq0Var, AbstractCollection abstractCollection) {
        Iterator it = qrq0Var.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static List s(qrq0 qrq0Var) {
        Iterator it = qrq0Var.iterator();
        if (!it.hasNext()) {
            return EmptyList.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static List t(qrq0 qrq0Var) {
        ArrayList arrayList = new ArrayList();
        r(qrq0Var, arrayList);
        return arrayList;
    }

    public static Set u(qrq0 qrq0Var) {
        Iterator it = qrq0Var.iterator();
        if (!it.hasNext()) {
            return EmptySet.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singleton(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static h73 v(h73 h73Var, qha qhaVar) {
        return new h73(2, new SequencesKt___SequencesKt$zipWithNext$2(h73Var, qhaVar, null));
    }
}
