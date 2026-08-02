package defpackage;

/* loaded from: classes4.dex */
public class rd4 extends m3 {
    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        ryhVar.K(z, 49, this.a);
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        int i = z ? 4 : 3;
        for (a2 a2Var : this.a) {
            i += a2Var.toASN1Primitive().p(true);
        }
        return i;
    }
}
