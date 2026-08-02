package defpackage;

/* loaded from: classes4.dex */
public final /* synthetic */ class qg61 implements u40, jms {
    public final /* synthetic */ tls a;

    public qg61(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.u40
    public final /* synthetic */ void a(Object obj) {
        this.a.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u40) || !(obj instanceof jms)) {
            return false;
        }
        return this.a.equals(((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
