package defpackage;

/* loaded from: classes9.dex */
public final /* synthetic */ class qxl implements jms {
    public final /* synthetic */ tls a;

    public qxl(tls tlsVar) {
        this.a = tlsVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qxl) {
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
