package defpackage;

import androidx.compose.foundation.text.handwriting.a;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class pmr extends cw7 implements ofm, moc, zoc {
    public Function0 q;
    public boolean r;
    public final iur s;

    public pmr(Function0 function0) {
        this.q = function0;
        r5 r5Var = new r5(4, this);
        ffm ffmVar = eur.a;
        iur iurVar = new iur(null, null, null, r5Var);
        S0(iurVar);
        this.s = iurVar;
    }

    @Override // defpackage.ofm
    public final long S() {
        gma gmaVar = a.a;
        jx7 jx7Var = bcx.F(this).y;
        gmaVar.getClass();
        int i = vps.b;
        return qcm.e(jx7Var.L(gmaVar.a), jx7Var.L(gmaVar.b), jx7Var.L(gmaVar.c), jx7Var.L(gmaVar.d));
    }

    @Override // defpackage.ofm
    public final void Z() {
        this.s.Z();
    }

    @Override // defpackage.ofm
    public final void o(ffm ffmVar, gfm gfmVar, long j) {
        this.s.o(ffmVar, gfmVar, j);
    }

    @Override // defpackage.moc
    public final void t(bpc bpcVar) {
        this.r = bpcVar.b();
    }
}
