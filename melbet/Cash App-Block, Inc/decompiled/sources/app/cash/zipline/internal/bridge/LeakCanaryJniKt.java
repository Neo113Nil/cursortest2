package app.cash.zipline.internal.bridge;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class LeakCanaryJniKt {
    public static final Set allReferencesSet = Collections.synchronizedSet(new LinkedHashSet());
    public static final ReferenceQueue allReferencesQueue = new ReferenceQueue();

    public static final void stopTrackingLeaks(Endpoint endpoint) {
        endpoint.getClass();
        Set set = allReferencesSet;
        set.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((ZiplineServiceReference) it.next()).endpoint, endpoint)) {
                it.remove();
            }
        }
    }
}
