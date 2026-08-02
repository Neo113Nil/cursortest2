package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class ms5 {
    public static final ms5 b = new ms5(new b3i(17), e3s.b);
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public ms5(nq4... nq4VarArr) {
        for (nq4 nq4Var : nq4VarArr) {
            this.a.put(nq4Var.z(), nq4Var);
        }
    }
}
