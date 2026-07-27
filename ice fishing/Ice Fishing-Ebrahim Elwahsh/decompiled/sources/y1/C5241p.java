package y1;

import java.util.ArrayDeque;

/* renamed from: y1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5241p extends N1.l {
    @Override // N1.l
    public final void e(Object obj, Object obj2) {
        C5242q c5242q = (C5242q) obj;
        c5242q.getClass();
        ArrayDeque arrayDeque = C5242q.f41855b;
        synchronized (arrayDeque) {
            arrayDeque.offer(c5242q);
        }
    }
}
