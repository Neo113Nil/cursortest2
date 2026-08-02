package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* loaded from: classes5.dex */
public class jhp extends hhp {
    public static lcc e(Sequence sequence) {
        sequence.getClass();
        return new lcc(sequence, false, new d0p(25));
    }

    public static Object f(Sequence sequence) {
        Iterator it = sequence.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static String g(Sequence sequence, String str, hpj hpjVar, int i) {
        if ((i & 32) != 0) {
            hpjVar = null;
        }
        sequence.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : sequence) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            glr.b(sb, obj, hpjVar);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static lcc h(lcc lccVar, Function2 function2) {
        return e(new h5d(2, lccVar, function2));
    }

    public static lhc i(Sequence sequence, Sequence sequence2) {
        sequence.getClass();
        sequence2.getClass();
        Sequence r = xz0.r(new Sequence[]{sequence, sequence2});
        r.getClass();
        return ghp.c(r, new d0p(22));
    }

    public static Sequence j(Sequence sequence, int i) {
        sequence.getClass();
        if (i >= 0) {
            return i == 0 ? p5b.a : sequence instanceof ura ? ((ura) sequence).b(i) : new pra(sequence, i, 1);
        }
        xq0.o(dfi.c(i, "Requested element count ", " is less than zero."));
        return null;
    }

    public static List k(Sequence sequence) {
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return c5b.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return t75.c(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList l(Sequence sequence) {
        ArrayList arrayList = new ArrayList();
        Iterator it = sequence.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set m(Sequence sequence) {
        Iterator it = sequence.iterator();
        if (!it.hasNext()) {
            return q5b.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return uop.b(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}
