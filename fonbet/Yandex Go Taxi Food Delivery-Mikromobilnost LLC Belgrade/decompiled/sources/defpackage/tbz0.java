package defpackage;

/* loaded from: classes11.dex */
public final class tbz0 extends vbz0 {
    public final String A;

    public tbz0(double d, String str) {
        super(d);
        this.A = str;
    }

    @Override // defpackage.wbz0
    public final boolean e(w3c w3cVar, wbz0 wbz0Var) {
        return wbz0Var.g(this);
    }

    @Override // defpackage.wbz0
    public final boolean g(tbz0 tbz0Var) {
        return Math.abs(this.z - tbz0Var.z) > 300.0d || !this.A.equals(tbz0Var.A);
    }

    @Override // defpackage.wbz0
    public final String i() {
        return this.A;
    }
}
