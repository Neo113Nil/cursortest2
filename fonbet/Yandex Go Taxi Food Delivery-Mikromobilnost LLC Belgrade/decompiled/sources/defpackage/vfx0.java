package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes6.dex */
public final class vfx0 {
    public static ufx0 a(mi31 mi31Var) {
        return new ufx0(mi31Var.b, mi31Var.f, mi31Var.a.O);
    }

    public static hmx0 b(mi31 mi31Var) {
        String str = mi31Var.b;
        String str2 = mi31Var.f;
        pex0 pex0Var = mi31Var.a;
        wu1 wu1Var = pex0Var.O;
        List f = pex0Var.f();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = f.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((lmw0) it.next()).getName());
        }
        return new hmx0(str, str2, wu1Var, linkedHashSet);
    }

    public static ufx0 c(hmx0 hmx0Var) {
        return new ufx0(hmx0Var.a, hmx0Var.b, hmx0Var.c);
    }
}
