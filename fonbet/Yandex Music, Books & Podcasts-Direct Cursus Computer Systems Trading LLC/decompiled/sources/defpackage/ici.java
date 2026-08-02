package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class ici {
    public static final ArrayDeque b;
    public Object a;

    static {
        char[] cArr = xut.a;
        b = new ArrayDeque(0);
    }

    public static ici a(Object obj) {
        ici iciVar;
        ArrayDeque arrayDeque = b;
        synchronized (arrayDeque) {
            iciVar = (ici) arrayDeque.poll();
        }
        if (iciVar == null) {
            iciVar = new ici();
        }
        iciVar.a = obj;
        return iciVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ici) && this.a.equals(((ici) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
