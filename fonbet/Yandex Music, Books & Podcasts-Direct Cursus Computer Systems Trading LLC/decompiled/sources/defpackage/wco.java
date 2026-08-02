package defpackage;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class wco extends bfg {
    public final bfg a;
    public final /* synthetic */ xco b;

    public wco(xco xcoVar, bfg bfgVar) {
        this.b = xcoVar;
        this.a = bfgVar;
    }

    @Override // defpackage.bfg
    public final void A(mwi mwiVar) {
        xu1 xu1Var = mwiVar.b;
        IdentityHashMap identityHashMap = xu1Var.a;
        wu1 wu1Var = xco.e;
        if (identityHashMap.get(wu1Var) != null) {
            xq0.q("RetryingNameResolver can only be used once to wrap a NameResolver");
            return;
        }
        List list = Collections.EMPTY_LIST;
        xu1 xu1Var2 = xu1.b;
        List list2 = mwiVar.a;
        lwi lwiVar = mwiVar.c;
        xu1Var.getClass();
        vco vcoVar = new vco(this.b);
        IdentityHashMap identityHashMap2 = new IdentityHashMap(1);
        identityHashMap2.put(wu1Var, vcoVar);
        for (Map.Entry entry : xu1Var.a.entrySet()) {
            if (!identityHashMap2.containsKey(entry.getKey())) {
                identityHashMap2.put((wu1) entry.getKey(), entry.getValue());
            }
        }
        this.a.A(new mwi(list2, new xu1(identityHashMap2), lwiVar));
    }

    @Override // defpackage.bfg
    public final void z(sgr sgrVar) {
        this.a.z(sgrVar);
        this.b.d.execute(new dyg(27, this));
    }
}
