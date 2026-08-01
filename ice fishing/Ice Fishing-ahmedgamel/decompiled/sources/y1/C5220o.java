package y1;

import java.util.ArrayDeque;

/* renamed from: y1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5220o extends N1.l {
    @Override // N1.l
    public final void e(Object obj, Object obj2) {
        C5221p c5221p = (C5221p) obj;
        c5221p.getClass();
        ArrayDeque arrayDeque = C5221p.f41818b;
        synchronized (arrayDeque) {
            arrayDeque.offer(c5221p);
        }
    }
}
