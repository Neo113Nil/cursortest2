package ub;

import android.os.Looper;
import bc.a0;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f6732a = new HashSet();

    public final void a() {
        if (a0.f1046a == null) {
            a0.f1046a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != a0.f1046a) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
        Iterator it = this.f6732a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }
}
