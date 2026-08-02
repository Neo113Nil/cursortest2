package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class u0e {
    public final ztx0 h;
    public final ztx0 i;
    public final int j;
    public final ExecutorService a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new c1e(false));
    public final sjh b = uyj.a;
    public final ExecutorService c = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new c1e(true));
    public final n2x0 d = new n2x0();
    public final xnh e = xnh.a;
    public final bd60 f = bd60.a;
    public final jjh g = new jjh();
    public final int k = Integer.MAX_VALUE;
    public final int m = 20;
    public final int l = 8;
    public final boolean n = true;
    public final xw91 o = new xw91(19);

    public u0e(f0e f0eVar) {
        this.j = f0eVar.c;
        this.h = f0eVar.a;
        this.i = f0eVar.b;
    }
}
