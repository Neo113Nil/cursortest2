package defpackage;

/* loaded from: classes3.dex */
public final class dl9 implements nuq {
    public final /* synthetic */ jl9 a;
    public final /* synthetic */ e23 b;
    public final /* synthetic */ qas c;

    public dl9(jl9 jl9Var, e23 e23Var, wl9 wl9Var, qas qasVar) {
        this.a = jl9Var;
        this.b = e23Var;
        this.c = qasVar;
    }

    @Override // defpackage.nuq
    public final void a(Float f) {
        yb8 yb8Var = this.a.b;
        gc8 gc8Var = this.b.a;
        yb8Var.q(f);
        this.c.invoke(Long.valueOf(f != null ? eeh.c(f.floatValue()) : 0L));
    }
}
