package defpackage;

import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class j4e extends xci implements w9t, ofm, yr5 {
    public gma o;
    public uh0 p;
    public boolean q;

    public j4e(uh0 uh0Var, gma gmaVar) {
        this.o = gmaVar;
        this.p = uh0Var;
    }

    @Override // defpackage.xci
    public final void L0() {
        W0();
    }

    @Override // defpackage.ofm
    public final long S() {
        gma gmaVar = this.o;
        if (gmaVar == null) {
            return vps.a;
        }
        jx7 jx7Var = bcx.F(this).y;
        int i = vps.b;
        return qcm.e(jx7Var.L(gmaVar.a), jx7Var.L(gmaVar.b), jx7Var.L(gmaVar.c), jx7Var.L(gmaVar.d));
    }

    public final void S0() {
        uh0 uh0Var;
        xqn xqnVar = new xqn();
        q7g.U(this, new u8b(5, xqnVar));
        j4e j4eVar = (j4e) xqnVar.a;
        if (j4eVar == null || (uh0Var = j4eVar.p) == null) {
            uh0Var = this.p;
        }
        T0(uh0Var);
    }

    public abstract void T0(jfm jfmVar);

    public final void U0() {
        tqn tqnVar = new tqn();
        tqnVar.a = true;
        q7g.V(this, new ln4(tqnVar, 2));
        if (tqnVar.a) {
            S0();
        }
    }

    public abstract boolean V0(int i);

    public final void W0() {
        Unit unit;
        if (this.q) {
            this.q = false;
            if (this.n) {
                xqn xqnVar = new xqn();
                q7g.U(this, new ne0(xqnVar, 4));
                j4e j4eVar = (j4e) xqnVar.a;
                if (j4eVar != null) {
                    j4eVar.S0();
                    unit = Unit.a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    T0(null);
                }
            }
        }
    }

    @Override // defpackage.ofm
    public final void Z() {
        W0();
    }

    @Override // defpackage.ofm
    public final void o(ffm ffmVar, gfm gfmVar, long j) {
        if (gfmVar == gfm.b) {
            List list = ffmVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (V0(((lfm) list.get(i)).i)) {
                    int i2 = ffmVar.d;
                    if (i2 == 4) {
                        this.q = true;
                        U0();
                        return;
                    } else {
                        if (i2 == 5) {
                            W0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }
}
