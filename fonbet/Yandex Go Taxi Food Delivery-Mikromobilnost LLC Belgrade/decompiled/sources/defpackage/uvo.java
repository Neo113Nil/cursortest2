package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public interface uvo extends ssi0 {
    default void addSubscription(f1k f1kVar) {
        if (f1kVar == null || f1kVar == f1k.O1) {
            return;
        }
        getSubscriptions().add(f1kVar);
    }

    default void closeAllSubscription() {
        Iterator it = getSubscriptions().iterator();
        while (it.hasNext()) {
            ((f1k) it.next()).close();
        }
        getSubscriptions().clear();
    }

    List getSubscriptions();

    @Override // defpackage.ssi0
    default void release() {
        closeAllSubscription();
    }
}
