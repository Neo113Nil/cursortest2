package J0;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class y {
    public final void a(t tVar) {
        List singletonList = Collections.singletonList(tVar);
        K0.p pVar = (K0.p) this;
        if (singletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        new K0.k(pVar, null, singletonList).o();
    }
}
