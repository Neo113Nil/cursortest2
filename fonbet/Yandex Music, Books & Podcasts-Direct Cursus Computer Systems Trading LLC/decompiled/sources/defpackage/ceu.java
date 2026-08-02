package defpackage;

import kotlin.Pair;

/* loaded from: classes3.dex */
public final class ceu {
    public final int a;
    public final q96 b;

    public ceu(int i, q96 q96Var) {
        this.a = i;
        this.b = q96Var;
    }

    public final g96 a(Pair pair, int i) {
        return new g96(5, q96.x((i96) pair.a, this.a), q96.x((i96) pair.b, i));
    }

    public final void b(int i) {
        this.b.k(this.a).e.d = i;
    }

    public final void c(int i) {
        this.b.k(this.a).e.c = i;
    }
}
