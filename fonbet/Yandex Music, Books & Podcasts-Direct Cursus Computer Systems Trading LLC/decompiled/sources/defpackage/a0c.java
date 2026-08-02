package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public interface a0c extends ptn {
    @Override // defpackage.ptn
    default void a() {
        l();
    }

    List getSubscriptions();

    default void i(ja8 ja8Var) {
        if (ja8Var == null || ja8Var == ja8.b0) {
            return;
        }
        getSubscriptions().add(ja8Var);
    }

    default void l() {
        Iterator it = getSubscriptions().iterator();
        while (it.hasNext()) {
            ((ja8) it.next()).close();
        }
        getSubscriptions().clear();
    }
}
