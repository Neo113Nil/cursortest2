package J0;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class x {
    public final void a(s sVar) {
        List singletonList = Collections.singletonList(sVar);
        K0.p pVar = (K0.p) this;
        if (singletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        new K0.k(pVar, null, singletonList).s();
    }
}
