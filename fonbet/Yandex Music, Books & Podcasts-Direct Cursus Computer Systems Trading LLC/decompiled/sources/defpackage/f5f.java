package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class f5f implements Serializable {
    private static final long serialVersionUID = 1;

    static {
        for (int i : ouj.E(4)) {
            if (i == 0) {
                throw null;
            }
            ouj.D(i);
        }
        for (u5f u5fVar : u5f.values()) {
            boolean z = u5fVar.a;
        }
        for (g5f g5fVar : g5f.values()) {
            boolean z2 = g5fVar.a;
        }
        fip fipVar = vp7.a;
        new ThreadLocal();
    }

    public f5f() {
        ke4.a();
        System.currentTimeMillis();
        new AtomicReference(new rre(16));
    }

    public Object readResolve() {
        f5f f5fVar = new f5f();
        ke4.a();
        System.currentTimeMillis();
        new AtomicReference(new rre(16));
        return f5fVar;
    }
}
