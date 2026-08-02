package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class xy1 {
    public static final ByteBuffer h = ByteBuffer.allocate(0);
    public final ex1 a;
    public final jyr b = btf.b(new uu1(1));
    public int c = -1;
    public int d = -1;
    public final AtomicBoolean e = new AtomicBoolean(true);
    public final x0q f;
    public final x0q g;

    public xy1(ex1 ex1Var) {
        this.a = ex1Var;
        oi3 oi3Var = oi3.b;
        this.f = y0q.a(1, 0, oi3Var);
        x0q b = y0q.b(1, 0, oi3Var, 2);
        b.a(Unit.a);
        this.g = b;
    }

    public final pjc a() {
        Continuation continuation = null;
        return zsd.k0(zsd.M0(new ub7(12, zsd.b0(zsd.s0(this.g, new uy1(this, continuation, 0))), new uy1(this, continuation, 1)), new l1(continuation, this, 4)), dm6.c);
    }
}
