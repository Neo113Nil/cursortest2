package defpackage;

/* loaded from: classes.dex */
public final class mdt implements odt, sdr {
    public final ir1 a;

    public mdt(ir1 ir1Var) {
        this.a = ir1Var;
    }

    @Override // defpackage.odt
    public final boolean d() {
        return this.a.e;
    }

    @Override // defpackage.sdr
    public final Object getValue() {
        return this.a.d.getValue();
    }
}
