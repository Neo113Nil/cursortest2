package A1;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayDeque f88b;

    /* renamed from: a, reason: collision with root package name */
    public Object f89a;

    static {
        char[] cArr = P1.p.f2376a;
        f88b = new ArrayDeque(0);
    }

    public static v a(Object obj) {
        v vVar;
        ArrayDeque arrayDeque = f88b;
        synchronized (arrayDeque) {
            vVar = (v) arrayDeque.poll();
        }
        if (vVar == null) {
            vVar = new v();
        }
        vVar.f89a = obj;
        return vVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        vVar.getClass();
        return this.f89a.equals(vVar.f89a);
    }

    public final int hashCode() {
        return this.f89a.hashCode();
    }
}
