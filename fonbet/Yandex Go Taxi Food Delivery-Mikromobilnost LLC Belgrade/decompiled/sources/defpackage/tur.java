package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class tur implements jms {
    public final /* synthetic */ tls a;

    public tur(tls tlsVar) {
        this.a = tlsVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tur) {
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
