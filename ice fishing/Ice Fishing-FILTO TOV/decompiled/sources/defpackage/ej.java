package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ej extends d71 implements lv {
    public final /* synthetic */ pt0 E7jCp8Ls;
    public int JFJ3QoxA;
    public final /* synthetic */ fj XnEVoBF0td1l;
    public final /* synthetic */ boolean iwATDS1i01k;
    public pt0 mOu10nynGul;
    public /* synthetic */ Object rQPn8YBR;
    public final /* synthetic */ Object uFEq9NpZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(pt0 pt0Var, fj fjVar, Object obj, boolean z, vg vgVar) {
        super(2, vgVar);
        this.E7jCp8Ls = pt0Var;
        this.XnEVoBF0td1l = fjVar;
        this.uFEq9NpZ = obj;
        this.iwATDS1i01k = z;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        return ((ej) uFEq9NpZ((vg) obj2, (rr) obj)).WIEu4Ya2g8(kc1.GWasM1elztuh);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r10 == r8) goto L21;
     */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        rr rrVar;
        pt0 pt0Var;
        int i = this.JFJ3QoxA;
        kc1 kc1Var = kc1.GWasM1elztuh;
        Object obj2 = this.uFEq9NpZ;
        fj fjVar = this.XnEVoBF0td1l;
        pt0 pt0Var2 = this.E7jCp8Ls;
        qh qhVar = qh.OOA6hdeuvCS;
        if (i == 0) {
            o50.A1EKNP6CxJ(obj);
            rr rrVar2 = (rr) this.rQPn8YBR;
            r21 mOu10nynGul = fjVar.mOu10nynGul();
            this.rQPn8YBR = rrVar2;
            this.mOu10nynGul = pt0Var2;
            this.JFJ3QoxA = 1;
            Integer num = new Integer(((AtomicInteger) mOu10nynGul.Yi7zF1RB1.EljAMC1QTz).incrementAndGet());
            if (num != qhVar) {
                rrVar = rrVar2;
                obj = num;
                pt0Var = pt0Var2;
            }
            return qhVar;
        }
        if (i != 1) {
            if (i != 2) {
                o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o50.A1EKNP6CxJ(obj);
            if (this.iwATDS1i01k) {
                fjVar.AvO7iQsrTN.WdrkLMV3xh(new bi(obj2 != null ? obj2.hashCode() : 0, pt0Var2.OOA6hdeuvCS, obj2));
            }
            return kc1Var;
        }
        pt0Var = this.mOu10nynGul;
        rrVar = (rr) this.rQPn8YBR;
        o50.A1EKNP6CxJ(obj);
        pt0Var.OOA6hdeuvCS = ((Number) obj).intValue();
        this.rQPn8YBR = null;
        this.mOu10nynGul = null;
        this.JFJ3QoxA = 2;
        if (rrVar.Yi7zF1RB1.get()) {
            o4.jivtDDk9H("This scope has already been closed.");
            return null;
        }
        Object JFJ3QoxA = o30.JFJ3QoxA(rrVar.GWasM1elztuh, new cj(rrVar, obj2, null), this);
        if (JFJ3QoxA != qhVar) {
            JFJ3QoxA = kc1Var;
        }
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        ej ejVar = new ej(this.E7jCp8Ls, this.XnEVoBF0td1l, this.uFEq9NpZ, this.iwATDS1i01k, vgVar);
        ejVar.rQPn8YBR = obj;
        return ejVar;
    }
}
