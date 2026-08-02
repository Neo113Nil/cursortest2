package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class qgg0 {
    public final List a;
    public final q64 b;

    public qgg0(List list, q64 q64Var) {
        d6z.m("No preferred quality and fallback strategy.", (list.isEmpty() && q64Var == q64.c) ? false : true);
        this.a = Collections.unmodifiableList(new ArrayList(list));
        this.b = q64Var;
    }

    public static qgg0 a(List list, q64 q64Var) {
        d6z.v(list, "qualities cannot be null");
        d6z.m("qualities cannot be empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kgg0 kgg0Var = (kgg0) it.next();
            d6z.m("qualities contain invalid quality: " + kgg0Var, kgg0.h.contains(kgg0Var));
        }
        return new qgg0(list, q64Var);
    }

    public final String toString() {
        return "QualitySelector{preferredQualities=" + this.a + ", fallbackStrategy=" + this.b + "}";
    }
}
