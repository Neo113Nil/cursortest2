package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class vyh implements gzh, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;

    public /* synthetic */ vyh(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
    }

    @Override // defpackage.gzh
    public final /* synthetic */ czh create() {
        switch (this.a) {
        }
        return (czh) this.b.invoke();
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof gzh) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof gzh) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof gzh) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
        }
        return this.b;
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
