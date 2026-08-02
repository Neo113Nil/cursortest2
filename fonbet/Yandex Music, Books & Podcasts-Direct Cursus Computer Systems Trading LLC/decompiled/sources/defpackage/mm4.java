package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes5.dex */
public final class mm4 {
    public final String a;
    public List b = c5b.a;
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public mm4(String str) {
        this.a = str;
    }

    public static void a(mm4 mm4Var, String str, mhp mhpVar) {
        c5b c5bVar = c5b.a;
        mm4Var.getClass();
        str.getClass();
        mhpVar.getClass();
        c5bVar.getClass();
        if (!mm4Var.d.add(str)) {
            StringBuilder u = ouj.u("Element with name '", str, "' is already registered in ");
            u.append(mm4Var.a);
            throw new IllegalArgumentException(u.toString().toString());
        }
        mm4Var.c.add(str);
        mm4Var.e.add(mhpVar);
        mm4Var.f.add(c5bVar);
        mm4Var.g.add(false);
    }
}
