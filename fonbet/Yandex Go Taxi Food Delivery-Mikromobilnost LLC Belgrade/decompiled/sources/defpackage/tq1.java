package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes13.dex */
public final class tq1 implements bre0 {
    public final h3y a;
    public final dne0 b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public tq1(h3y h3yVar, dne0 dne0Var) {
        this.a = h3yVar;
        this.b = dne0Var;
    }

    public final sq1 a(String str) {
        ConcurrentHashMap concurrentHashMap = this.c;
        sq1 sq1Var = (sq1) concurrentHashMap.get(str);
        if (sq1Var != null) {
            return sq1Var;
        }
        sq1 sq1Var2 = new sq1((jtq0) this.a.get(), this.b.a("com.yandex.go.position_alert.AlertCounterProvider." + str));
        concurrentHashMap.putIfAbsent(str, sq1Var2);
        return sq1Var2;
    }

    @Override // defpackage.bre0
    public final void b() {
        for (sq1 sq1Var : this.c.values()) {
            sq1Var.getClass();
            vez0.h0();
            sq1Var.c = 0;
        }
    }
}
