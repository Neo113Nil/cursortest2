package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class u1t {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final lz40 a(z7l0 z7l0Var) {
        return (lz40) this.a.computeIfAbsent(z7l0Var.getType(), new dxd(4, new dsg(26)));
    }
}
