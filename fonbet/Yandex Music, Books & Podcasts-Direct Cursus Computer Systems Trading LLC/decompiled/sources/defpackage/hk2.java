package defpackage;

/* loaded from: classes.dex */
public final class hk2 extends tyf {
    public cdi a;

    @Override // defpackage.tyf
    public final boolean o(pzm pzmVar) {
        return pzmVar == this.a.getKey();
    }

    @Override // defpackage.tyf
    public final Object u(pzm pzmVar) {
        if (pzmVar != this.a.getKey()) {
            sme.b("Check failed.");
        }
        return this.a.g();
    }
}
