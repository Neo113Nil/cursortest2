package defpackage;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class n30 {
    public final HashSet qoPGr6Ce = new HashSet();

    public final void qoPGr6Ce() {
        if (m50.VgvYg0wo == null) {
            m50.VgvYg0wo = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != m50.VgvYg0wo) {
            m1.Ey6iv0m0("Must be called on the Main thread.");
            return;
        }
        Iterator it = this.qoPGr6Ce.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            m1.qoPGr6Ce();
        }
    }
}
