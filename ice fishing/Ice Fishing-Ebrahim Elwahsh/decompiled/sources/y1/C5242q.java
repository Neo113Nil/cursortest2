package y1;

import java.util.ArrayDeque;

/* renamed from: y1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5242q {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayDeque f41855b;

    /* renamed from: a, reason: collision with root package name */
    public Object f41856a;

    static {
        char[] cArr = N1.p.f1976a;
        f41855b = new ArrayDeque(0);
    }

    public static C5242q a(Object obj) {
        C5242q c5242q;
        ArrayDeque arrayDeque = f41855b;
        synchronized (arrayDeque) {
            c5242q = (C5242q) arrayDeque.poll();
        }
        if (c5242q == null) {
            c5242q = new C5242q();
        }
        c5242q.f41856a = obj;
        return c5242q;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5242q)) {
            return false;
        }
        C5242q c5242q = (C5242q) obj;
        c5242q.getClass();
        return this.f41856a.equals(c5242q.f41856a);
    }

    public final int hashCode() {
        return this.f41856a.hashCode();
    }
}
