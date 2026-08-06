package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class li extends d71 implements hv {
    public Object E7jCp8Ls;
    public Serializable JFJ3QoxA;
    public final /* synthetic */ fj WIEu4Ya2g8;
    public Iterator XnEVoBF0td1l;
    public final /* synthetic */ rx0 YmKjaVtbfp5Z;
    public int iwATDS1i01k;
    public Object mOu10nynGul;
    public Object rQPn8YBR;
    public int uFEq9NpZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li(fj fjVar, rx0 rx0Var, vg vgVar) {
        super(1, vgVar);
        this.WIEu4Ya2g8 = fjVar;
        this.YmKjaVtbfp5Z = rx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    @Override // defpackage.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WIEu4Ya2g8(Object obj) {
        bh0 bh0Var;
        nt0 nt0Var;
        rt0 rt0Var;
        rt0 rt0Var2;
        bh0 bh0Var2;
        Iterator it;
        bh0 bh0Var3;
        nt0 nt0Var2;
        rt0 rt0Var3;
        ki kiVar;
        rt0 rt0Var4;
        nt0 nt0Var3;
        int hashCode;
        Integer GWasM1elztuh;
        Object obj2;
        int i = this.iwATDS1i01k;
        rx0 rx0Var = this.YmKjaVtbfp5Z;
        fj fjVar = this.WIEu4Ya2g8;
        qh qhVar = qh.OOA6hdeuvCS;
        if (i == 0) {
            o50.A1EKNP6CxJ(obj);
            bh0Var = new bh0();
            nt0Var = new nt0();
            rt0Var = new rt0();
            this.mOu10nynGul = bh0Var;
            this.JFJ3QoxA = nt0Var;
            this.rQPn8YBR = rt0Var;
            this.E7jCp8Ls = rt0Var;
            this.iwATDS1i01k = 1;
            obj = fj.encWxUiV2(fjVar, true, this);
            if (obj != qhVar) {
                rt0Var2 = rt0Var;
            }
            return qhVar;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        o4.jivtDDk9H("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hashCode = this.uFEq9NpZ;
                    obj2 = this.mOu10nynGul;
                    o50.A1EKNP6CxJ(obj);
                    return new bi(hashCode, ((Number) obj).intValue(), obj2);
                }
                bh0Var2 = (bh0) this.rQPn8YBR;
                rt0Var4 = (rt0) this.JFJ3QoxA;
                nt0Var3 = (nt0) this.mOu10nynGul;
                o50.A1EKNP6CxJ(obj);
                try {
                    nt0Var3.OOA6hdeuvCS = true;
                    bh0Var2.AvO7iQsrTN(null);
                    Object obj3 = rt0Var4.OOA6hdeuvCS;
                    hashCode = obj3 == null ? obj3.hashCode() : 0;
                    r21 mOu10nynGul = fjVar.mOu10nynGul();
                    this.mOu10nynGul = obj3;
                    this.JFJ3QoxA = null;
                    this.rQPn8YBR = null;
                    this.uFEq9NpZ = hashCode;
                    this.iwATDS1i01k = 4;
                    GWasM1elztuh = mOu10nynGul.GWasM1elztuh();
                    if (GWasM1elztuh != qhVar) {
                        obj = GWasM1elztuh;
                        obj2 = obj3;
                        return new bi(hashCode, ((Number) obj).intValue(), obj2);
                    }
                    return qhVar;
                } catch (Throwable th) {
                    bh0Var2.AvO7iQsrTN(null);
                    throw th;
                }
            }
            it = this.XnEVoBF0td1l;
            kiVar = (ki) this.E7jCp8Ls;
            rt0Var3 = (rt0) this.rQPn8YBR;
            nt0Var2 = (nt0) this.JFJ3QoxA;
            bh0Var3 = (bh0) this.mOu10nynGul;
            o50.A1EKNP6CxJ(obj);
            while (it.hasNext()) {
                lv lvVar = (lv) it.next();
                this.mOu10nynGul = bh0Var3;
                this.JFJ3QoxA = nt0Var2;
                this.rQPn8YBR = rt0Var3;
                this.E7jCp8Ls = kiVar;
                this.XnEVoBF0td1l = it;
                this.iwATDS1i01k = 2;
                if (lvVar.EljAMC1QTz(kiVar, this) == qhVar) {
                    break;
                }
            }
            rt0Var2 = rt0Var3;
            nt0Var = nt0Var2;
            bh0Var2 = bh0Var3;
            rx0Var.AvO7iQsrTN = null;
            this.mOu10nynGul = nt0Var;
            this.JFJ3QoxA = rt0Var2;
            this.rQPn8YBR = bh0Var2;
            this.E7jCp8Ls = null;
            this.XnEVoBF0td1l = null;
            this.iwATDS1i01k = 3;
            if (bh0Var2.xqGvceK5x(this) != qhVar) {
                rt0Var4 = rt0Var2;
                nt0Var3 = nt0Var;
                nt0Var3.OOA6hdeuvCS = true;
                bh0Var2.AvO7iQsrTN(null);
                Object obj32 = rt0Var4.OOA6hdeuvCS;
                if (obj32 == null) {
                }
                r21 mOu10nynGul2 = fjVar.mOu10nynGul();
                this.mOu10nynGul = obj32;
                this.JFJ3QoxA = null;
                this.rQPn8YBR = null;
                this.uFEq9NpZ = hashCode;
                this.iwATDS1i01k = 4;
                GWasM1elztuh = mOu10nynGul2.GWasM1elztuh();
                if (GWasM1elztuh != qhVar) {
                }
            }
            return qhVar;
        }
        rt0Var = (rt0) this.E7jCp8Ls;
        rt0Var2 = (rt0) this.rQPn8YBR;
        nt0Var = (nt0) this.JFJ3QoxA;
        bh0Var = (bh0) this.mOu10nynGul;
        o50.A1EKNP6CxJ(obj);
        rt0Var.OOA6hdeuvCS = ((bi) obj).Yi7zF1RB1;
        ki kiVar2 = new ki(bh0Var, nt0Var, rt0Var2, fjVar);
        List list = (List) rx0Var.AvO7iQsrTN;
        if (list == null) {
            bh0Var2 = bh0Var;
            rx0Var.AvO7iQsrTN = null;
            this.mOu10nynGul = nt0Var;
            this.JFJ3QoxA = rt0Var2;
            this.rQPn8YBR = bh0Var2;
            this.E7jCp8Ls = null;
            this.XnEVoBF0td1l = null;
            this.iwATDS1i01k = 3;
            if (bh0Var2.xqGvceK5x(this) != qhVar) {
            }
            return qhVar;
        }
        it = list.iterator();
        bh0Var3 = bh0Var;
        nt0Var2 = nt0Var;
        rt0Var3 = rt0Var2;
        kiVar = kiVar2;
        while (it.hasNext()) {
        }
        rt0Var2 = rt0Var3;
        nt0Var = nt0Var2;
        bh0Var2 = bh0Var3;
        rx0Var.AvO7iQsrTN = null;
        this.mOu10nynGul = nt0Var;
        this.JFJ3QoxA = rt0Var2;
        this.rQPn8YBR = bh0Var2;
        this.E7jCp8Ls = null;
        this.XnEVoBF0td1l = null;
        this.iwATDS1i01k = 3;
        if (bh0Var2.xqGvceK5x(this) != qhVar) {
        }
        return qhVar;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        return new li(this.WIEu4Ya2g8, this.YmKjaVtbfp5Z, (vg) obj).WIEu4Ya2g8(kc1.GWasM1elztuh);
    }
}
