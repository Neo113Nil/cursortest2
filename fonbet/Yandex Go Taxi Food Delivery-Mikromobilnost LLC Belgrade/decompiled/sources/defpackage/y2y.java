package defpackage;

/* loaded from: classes10.dex */
public final class y2y extends e530 implements ae90 {
    public float a;
    public boolean b;

    @Override // defpackage.ae90
    public final Object X(fwi fwiVar, Object obj) {
        hhl0 hhl0Var = obj instanceof hhl0 ? (hhl0) obj : null;
        if (hhl0Var == null) {
            hhl0Var = new hhl0(0);
        }
        hhl0Var.a = this.a;
        hhl0Var.b = this.b;
        return hhl0Var;
    }
}
