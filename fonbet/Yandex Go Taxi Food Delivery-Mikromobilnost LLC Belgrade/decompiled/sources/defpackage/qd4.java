package defpackage;

/* loaded from: classes4.dex */
public class qd4 extends l3 {
    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        g191Var.a0(z, 49, this.a);
    }

    @Override // defpackage.a3
    public final int k(boolean z) {
        int i = z ? 4 : 3;
        for (z1 z1Var : this.a) {
            i += z1Var.toASN1Primitive().k(true);
        }
        return i;
    }
}
