package y1;

import java.util.ArrayDeque;

/* renamed from: y1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5221p {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayDeque f41815b;

    /* renamed from: a, reason: collision with root package name */
    public Object f41816a;

    static {
        char[] cArr = N1.p.f1932a;
        f41815b = new ArrayDeque(0);
    }

    public static C5221p a(Object obj) {
        C5221p c5221p;
        ArrayDeque arrayDeque = f41815b;
        synchronized (arrayDeque) {
            c5221p = (C5221p) arrayDeque.poll();
        }
        if (c5221p == null) {
            c5221p = new C5221p();
        }
        c5221p.f41816a = obj;
        return c5221p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5221p)) {
            return false;
        }
        C5221p c5221p = (C5221p) obj;
        c5221p.getClass();
        return this.f41816a.equals(c5221p.f41816a);
    }

    public final int hashCode() {
        return this.f41816a.hashCode();
    }
}
