package defpackage;

import androidx.compose.animation.tooling.ComposeAnimation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes10.dex */
public final class sxe0 {
    public final sls a;
    public final sls b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final v5c0 d = new v5c0(9, this);
    public final LinkedHashSet e = new LinkedHashSet();
    public final LinkedHashSet f = new LinkedHashSet();
    public final Object g = new Object();

    public sxe0(sls slsVar, sls slsVar2) {
        this.a = slsVar;
        this.b = slsVar2;
    }

    public static final zy11 c(eup0 eup0Var, sxe0 sxe0Var) {
        ComposeAnimation I;
        eup0 eup0Var2 = !(eup0Var instanceof e521) ? eup0Var : null;
        zy11 zy11Var = zy11.a;
        if (eup0Var2 != null && (I = eup0Var2.I()) != null) {
            LinkedHashMap linkedHashMap = sxe0Var.c;
            rfd b = eup0Var.b(I, sxe0Var.d);
            b.b();
            linkedHashMap.put(I, b);
            return zy11Var;
        }
        boolean z = i421.a;
        eup0Var.getLabel();
        i421 i421Var = i421.a ? new i421() : null;
        if (i421Var != null) {
            sxe0Var.e.add(i421Var);
        }
        return zy11Var;
    }

    public final void a() {
        LinkedHashMap linkedHashMap = this.c;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
        }
        LinkedHashSet<i421> linkedHashSet = this.e;
        for (i421 i421Var : linkedHashSet) {
        }
        linkedHashSet.clear();
        linkedHashMap.clear();
        this.f.clear();
    }

    public final void b(eup0 eup0Var) {
        Object a = eup0Var.a();
        synchronized (this.g) {
            if (this.f.contains(a)) {
                return;
            }
            this.f.add(a);
            c(eup0Var, this);
        }
    }
}
