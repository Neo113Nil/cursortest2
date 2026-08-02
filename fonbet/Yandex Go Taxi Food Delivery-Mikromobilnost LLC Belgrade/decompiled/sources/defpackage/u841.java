package defpackage;

/* loaded from: classes10.dex */
public final /* synthetic */ class u841 implements osn, jms {
    public final /* synthetic */ xyz a;

    public u841(xyz xyzVar) {
        this.a = xyzVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof osn) && (obj instanceof jms)) {
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
