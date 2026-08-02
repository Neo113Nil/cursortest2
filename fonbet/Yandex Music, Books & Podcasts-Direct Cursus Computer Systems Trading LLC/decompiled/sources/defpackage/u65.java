package defpackage;

import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class u65 extends bfu {
    public final frt k;
    public final p3u l;
    public final a65 m;
    public final jrk n;
    public final xdr o;
    public final xdr p;

    @wiu
    public u65(@NotNull frt frtVar, @NotNull p3u p3uVar, @NotNull a65 a65Var, @NotNull jrk jrkVar) {
        frtVar.getClass();
        p3uVar.getClass();
        a65Var.getClass();
        jrkVar.getClass();
        this.k = frtVar;
        this.l = p3uVar;
        this.m = a65Var;
        this.n = jrkVar;
        f5u f5uVar = f5u.a;
        this.o = ydr.a(new l65(f5uVar, f5uVar));
        this.p = ydr.a(Boolean.FALSE);
        ox6.B(new d64(((ork) jrkVar).n, 6), ot0.F(this), new q65(this, 0));
        Continuation continuation = null;
        x97.y(ot0.F(this), null, null, new s65(this, continuation, 0), 3);
        x97.y(ot0.F(this), null, null, new s65(this, continuation, 1), 3);
    }
}
