package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@gsq0(with = pf70.class)
/* loaded from: classes9.dex */
public abstract class rf70 {
    public static final lf70 Companion = new lf70();

    public static Serializable a(rf70 rf70Var) {
        if (rf70Var instanceof of70) {
            return Integer.valueOf(((of70) rf70Var).a);
        }
        if (rf70Var instanceof qf70) {
            return ((qf70) rf70Var).b();
        }
        if (rf70Var instanceof mf70) {
            return Boolean.valueOf(((mf70) rf70Var).a);
        }
        if (!(rf70Var instanceof nf70)) {
            w511.b();
            return null;
        }
        Collection b = ((nf70) rf70Var).b();
        ArrayList arrayList = new ArrayList(tcc.n(b, 10));
        Iterator it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(a((rf70) it.next()));
        }
        return arrayList;
    }

    public String toString() {
        return a(this).toString();
    }
}
