package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ar0 extends d71 implements lv {
    public final /* synthetic */ lv E7jCp8Ls;
    public int JFJ3QoxA;
    public final /* synthetic */ int mOu10nynGul;
    public /* synthetic */ Object rQPn8YBR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ar0(lv lvVar, vg vgVar, int i) {
        super(2, vgVar);
        this.mOu10nynGul = i;
        this.E7jCp8Ls = lvVar;
    }

    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        int i = this.mOu10nynGul;
        kc1 kc1Var = kc1.GWasM1elztuh;
        switch (i) {
            case 0:
                return ((ar0) uFEq9NpZ((vg) obj2, (eg0) obj)).WIEu4Ya2g8(kc1Var);
            case 1:
                return ((ar0) uFEq9NpZ((vg) obj2, (eg0) obj)).WIEu4Ya2g8(kc1Var);
            default:
                return ((ar0) uFEq9NpZ((vg) obj2, (ph) obj)).WIEu4Ya2g8(kc1Var);
        }
    }

    @Override // defpackage.h6
    public final Object WIEu4Ya2g8(Object obj) {
        int i = this.mOu10nynGul;
        lv lvVar = this.E7jCp8Ls;
        qh qhVar = qh.OOA6hdeuvCS;
        switch (i) {
            case 0:
                int i2 = this.JFJ3QoxA;
                if (i2 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    eg0 eg0Var = (eg0) this.rQPn8YBR;
                    this.JFJ3QoxA = 1;
                    obj = lvVar.EljAMC1QTz(eg0Var, this);
                    if (obj == qhVar) {
                        return qhVar;
                    }
                } else {
                    if (i2 != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o50.A1EKNP6CxJ(obj);
                }
                eg0 eg0Var2 = (eg0) obj;
                eg0Var2.getClass();
                ((AtomicBoolean) eg0Var2.Yi7zF1RB1.EljAMC1QTz).set(true);
                return eg0Var2;
            case 1:
                int i3 = this.JFJ3QoxA;
                if (i3 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    eg0 eg0Var3 = new eg0(new LinkedHashMap(((eg0) this.rQPn8YBR).GWasM1elztuh()), false);
                    this.rQPn8YBR = eg0Var3;
                    this.JFJ3QoxA = 1;
                    return lvVar.EljAMC1QTz(eg0Var3, this) == qhVar ? qhVar : eg0Var3;
                }
                if (i3 != 1) {
                    o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                eg0 eg0Var4 = (eg0) this.rQPn8YBR;
                o50.A1EKNP6CxJ(obj);
                return eg0Var4;
            default:
                int i4 = this.JFJ3QoxA;
                if (i4 == 0) {
                    o50.A1EKNP6CxJ(obj);
                    ph phVar = (ph) this.rQPn8YBR;
                    this.JFJ3QoxA = 1;
                    if (lvVar.EljAMC1QTz(phVar, this) == qhVar) {
                        return qhVar;
                    }
                } else {
                    if (i4 != 1) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o50.A1EKNP6CxJ(obj);
                }
                return kc1.GWasM1elztuh;
        }
    }

    @Override // defpackage.h6
    public final vg uFEq9NpZ(vg vgVar, Object obj) {
        int i = this.mOu10nynGul;
        lv lvVar = this.E7jCp8Ls;
        switch (i) {
            case 0:
                ar0 ar0Var = new ar0(lvVar, vgVar, 0);
                ar0Var.rQPn8YBR = obj;
                return ar0Var;
            case 1:
                ar0 ar0Var2 = new ar0(lvVar, vgVar, 1);
                ar0Var2.rQPn8YBR = obj;
                return ar0Var2;
            default:
                ar0 ar0Var3 = new ar0(lvVar, vgVar, 2);
                ar0Var3.rQPn8YBR = obj;
                return ar0Var3;
        }
    }
}
