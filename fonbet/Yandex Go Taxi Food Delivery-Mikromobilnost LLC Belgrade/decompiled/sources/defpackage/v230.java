package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class v230 implements zni, jms {
    public final /* synthetic */ jo0 a;

    public v230(jo0 jo0Var) {
        this.a = jo0Var;
    }

    @Override // defpackage.zni
    public final /* synthetic */ xni create() {
        return (xni) this.a.invoke();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof zni) && (obj instanceof jms)) {
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
