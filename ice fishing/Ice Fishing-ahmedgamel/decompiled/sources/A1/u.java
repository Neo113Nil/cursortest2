package A1;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class u extends P1.l {
    @Override // P1.l
    public final void e(Object obj, Object obj2) {
        v vVar = (v) obj;
        vVar.getClass();
        ArrayDeque arrayDeque = v.f88b;
        synchronized (arrayDeque) {
            arrayDeque.offer(vVar);
        }
    }
}
