package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class r31 implements qqb0, jms {
    public final /* synthetic */ nx0 a;

    public r31(nx0 nx0Var) {
        this.a = nx0Var;
    }

    @Override // defpackage.qqb0
    public final /* synthetic */ void a(wpb0 wpb0Var) {
        this.a.invoke(wpb0Var);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof qqb0) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
