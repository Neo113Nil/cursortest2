package defpackage;

/* loaded from: classes.dex */
public final class mkq extends tyf {
    public final pzm a;
    public final x6k b = szf.g0(null);

    public mkq(pzm pzmVar) {
        this.a = pzmVar;
    }

    @Override // defpackage.tyf
    public final boolean o(pzm pzmVar) {
        return pzmVar == this.a;
    }

    @Override // defpackage.tyf
    public final Object u(pzm pzmVar) {
        if (pzmVar != this.a) {
            sme.b("Check failed.");
        }
        Object value = this.b.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }
}
